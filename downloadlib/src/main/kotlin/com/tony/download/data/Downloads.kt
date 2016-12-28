/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tony.download.data

/**
 * Created by sanyinchen on 16/12/28.
 */
class Downloads {

    class RequestHeaders {

        companion object {
            val HEADERS_DB_TABLE = "request_headers"
            val COLUMN_DOWNLOAD_ID = "download_id"
            val COLUMN_HEADER = "header"
            val COLUMN_VALUE = "value"

            /**
             * Path segment to add to a download URI to retrieve request headers
             */
            val URI_SEGMENT = "headers"

            /**
             * Prefix for ContentValues keys that contain HTTP header lines, to be
             * passed to DownloadProvider.insert().
             */
            val INSERT_KEY_PREFIX = "http_header_"
        }


    }


    companion object {
        val _COUNT = "_count"
        val _ID = "_id"
        /**
         * The name of the column containing the URI of the data being downloaded.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init/Read
        </P> *
         **/
        val COLUMN_URI = "uri"

        /**
         * The name of the column containing application-specific data.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init/Read/Write
        </P> *

         */
        val COLUMN_APP_DATA = "entity"

        /**
         * The name of the column containing the flags that indicates whether the
         * initiating application is capable of verifying the integrity of the
         * downloaded file. When this flag is set, the download manager performs
         * downloads and reports success even in some situations where it can't
         * guarantee that the download has completed (e.g. when doing a byte-range
         * request without an ETag, or when it can't determine whether a download
         * fully completed).
         * <P>
         * Type: BOOLEAN
        </P> *
         * <P>
         * Owner can Init
        </P> *

         */
        val COLUMN_NO_INTEGRITY = "no_integrity"

        /**
         * The name of the column containing the filename that the initiating
         * application recommends. When possible, the download manager will attempt
         * to use this filename, or a variation, as the actual name for the file.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init
        </P> *

         */
        val COLUMN_FILE_NAME_HINT = "hint"

        /**
         * The name of the column containing the filename where the downloaded data
         * was actually stored.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Read
        </P> *

         */
        val _DATA = "_data"


        /**
         * The name of the column containing the MIME type of the downloaded data.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init/Read
        </P> *
         */
        val COLUMN_MIME_TYPE = "mimetype"

        /**
         * The name of the column containing the flag that controls the destination
         * of the download. See the DESTINATION_* constants for a list of legal
         * values.
         * <P>
         * Type: INTEGER
        </P> *
         * <P>
         * Owner can Init
        </P> *

         */
        val COLUMN_DESTINATION = "destination"


        /**
         * The name of the column containing the current control state of the
         * download. Applications can write to this to control (pause/resume) the
         * download. the CONTROL_* constants for a list of legal values.
         * <P>
         * Type: INTEGER
        </P> *
         * <P>
         * Owner can Read
        </P> *

         */
        val COLUMN_CONTROL = "control"


        /**
         * The name of the column containing the current status of the download.
         * Applications can read this to follow the progress of each download. See
         * the STATUS_* constants for a list of legal values.
         * <P>
         * Type: INTEGER
        </P> *
         * <P>
         * Owner can Read
        </P> *

         */
        val COLUMN_STATUS = "status"

        /**
         * The name of the column containing the date at which some interesting
         * status changed in the download. Stored as a System.currentTimeMillis()
         * value.
         * <P>
         * Type: BIGINT
        </P> *
         * <P>
         * Owner can Read
        </P> *

         */
        val COLUMN_LAST_MODIFICATION = "lastmod"

        /**
         * The name of the column contain the values of the cookie to be used for
         * the download. This is used directly as the value for the Cookie: HTTP
         * header that gets sent with the request.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init
        </P> *

         */
        val COLUMN_COOKIE_DATA = "cookiedata"

        /**
         * The name of the column containing the user agent that the initiating
         * application wants the download manager to use for this download.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init
        </P> *

         */
        val COLUMN_USER_AGENT = "useragent"

        /**
         * The name of the column containing the referer (sic) that the initiating
         * application wants the download manager to use for this download.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init
        </P> *

         */
        val COLUMN_REFERER = "referer"

        /**
         * The name of the column containing the total size of the file being
         * downloaded.
         * <P>
         * Type: INTEGER
        </P> *
         * <P>
         * Owner can Read
        </P> *

         */
        val COLUMN_TOTAL_BYTES = "total_bytes"

        /**
         * The name of the column containing the size of the part of the file that
         * has been downloaded so far.
         * <P>
         * Type: INTEGER
        </P> *
         * <P>
         * Owner can Read
        </P> *

         */
        val COLUMN_CURRENT_BYTES = "current_bytes"

        /**
         * The name of the column where the initiating application can provided the
         * title of this download. The title will be displayed ito the user in the
         * list of downloads.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init/Read/Write
        </P> *

         */
        val COLUMN_TITLE = "title"

        /**
         * The name of the column where the initiating application can provide the
         * description of this download. The description will be displayed to the
         * user in the list of downloads.
         * <P>
         * Type: TEXT
        </P> *
         * <P>
         * Owner can Init/Read/Write
        </P> *

         */
        val COLUMN_DESCRIPTION = "description"

        /**
         * The name of the column indicating whether roaming connections can be
         * used. This is only used for public API downloads.
         * <P>
         * Type: BOOLEAN
        </P> *
         * <P>
         * Owner can Init/Read
        </P> *
         */
        val COLUMN_ALLOW_ROAMING = "allow_roaming"

        /**
         * The name of the column holding a bitmask of allowed network types. This
         * is only used for public API downloads.
         * <P>
         * Type: INTEGER
        </P> *
         * <P>
         * Owner can Init/Read
        </P> *
         */
        val COLUMN_ALLOWED_NETWORK_TYPES = "allowed_network_types"

        /**
         * Set to true if this download is deleted.
         * <P>
         * Type: BOOLEAN
        </P> *
         * <P>
         * Owner can Read
        </P> *

         */
        val COLUMN_DELETED = "deleted"

        /**
         * This download will be saved to the external storage. This is the default
         * behavior, and should be used for any file that the user can freely
         * access, copy, delete. Even with that destination, unencrypted DRM files
         * are saved in secure internal storage. Downloads to the external
         * destination only write files for which there is a registered handler. The
         * resulting files are accessible by filename to all applications.

         */
        val DESTINATION_EXTERNAL = 0


        /**
         * This download will be saved to the location given by the file URI in
         *
         */
        val DESTINATION_FILE_URI = 4

        /**
         * This download is allowed to run.

         */
        val CONTROL_RUN = 0


        /**
         * This download must pause at the first opportunity.

         */
        val CONTROL_PAUSED = 1

        /**
         * Returns whether the status is informational (i.e. 1xx).

         */
        fun isStatusInformational(status: Int): Boolean {
            return status >= 100 && status < 200
        }

        /**
         * Returns whether the status is an error (i.e. 4xx or 5xx).

         */
        fun isStatusError(status: Int): Boolean {
            return status >= 400 && status < 600
        }

        /**
         * Returns whether the status is a client error (i.e. 4xx).

         */
        fun isStatusClientError(status: Int): Boolean {
            return status >= 400 && status < 500
        }

        /**
         * Returns whether the status is a server error (i.e. 5xx).

         */
        fun isStatusServerError(status: Int): Boolean {
            return status >= 500 && status < 600
        }

        /**
         * Returns whether the download has completed (either with success or
         * error).

         */
        fun isStatusCompleted(status: Int): Boolean {
            return status >= 200 && status < 300 || status >= 400 && status < 600
        }


        /**
         * This download hasn't stated yet

         */
        val STATUS_PENDING = 190

        /**
         * This download has started

         */
        val STATUS_RUNNING = 192


        /**
         * This download has been paused by the owning app.
         */
        val STATUS_PAUSED_BY_APP = 193

        /**
         * This download encountered some network error and is waiting before
         * retrying the request.
         */
        val STATUS_WAITING_TO_RETRY = 194


        /**
         * This download is waiting for network connectivity to proceed.
         */
        val STATUS_WAITING_FOR_NETWORK = 195

        /**
         * This download exceeded a size limit for mobile networks and is waiting
         * for a Wi-Fi connection to proceed.
         */
        val STATUS_QUEUED_FOR_WIFI = 196

        /**
         * This download has successfully completed. Warning: there might be other
         * status values that indicate success in the future. Use isSucccess() to
         * capture the entire category.

         */
        val STATUS_SUCCESS = 200


        /**
         * This request couldn't be parsed. This is also used when processing
         * requests with unknown/unsupported URI schemes.
         *
         */
        val STATUS_BAD_REQUEST = 400

        /**
         * This download can't be performed because the content type cannot be
         * handled.

         */
        val STATUS_NOT_ACCEPTABLE = 406


        /**
         * This download cannot be performed because the length cannot be determined
         * accurately. This is the code for the HTTP error "Length Required", which
         * is typically used when making requests that require a content length but
         * don't have one, and it is also used in the client when a response is
         * received whose length cannot be determined accurately (therefore making
         * it impossible to know when a download completes).

         */
        val STATUS_LENGTH_REQUIRED = 411


        /**
         * This download was interrupted and cannot be resumed. This is the code for
         * the HTTP error "Precondition Failed", and it is also used in situations
         * where the client doesn't have an ETag at all.

         */
        val STATUS_PRECONDITION_FAILED = 412


        /**
         * The lowest-valued error status that is not an actual HTTP status code.
         */
        val MIN_ARTIFICIAL_ERROR_STATUS = 488

        /**
         * The requested destination file already exists.
         */
        val STATUS_FILE_ALREADY_EXISTS_ERROR = 488

        /**
         * Some possibly transient error occurred, but we can't resume the download.
         */
        val STATUS_CANNOT_RESUME = 489

        /**
         * This download was canceled

         */
        val STATUS_CANCELED = 490

        /**
         * This download has completed with an error. Warning: there will be other
         * status values that indicate errors in the future. Use isStatusError() to
         * capture the entire category.
         */
        val STATUS_UNKNOWN_ERROR = 491

        /**
         * This download couldn't be completed because of a storage issue.
         * Typically, that's because the filesystem is missing or full. Use the more
         * specific [.STATUS_INSUFFICIENT_SPACE_ERROR] and
         * [.STATUS_DEVICE_NOT_FOUND_ERROR] when appropriate.

         */
        val STATUS_FILE_ERROR = 492

        /**
         * This download couldn't be completed because of an HTTP redirect response
         * that the download manager couldn't handle.

         */
        val STATUS_UNHANDLED_REDIRECT = 493

        /**
         * This download couldn't be completed because of an unspecified unhandled
         * HTTP code.

         */
        val STATUS_UNHANDLED_HTTP_CODE = 494

        /**
         * This download couldn't be completed because of an error receiving or
         * processing data at the HTTP level.

         */
        val STATUS_HTTP_DATA_ERROR = 495

        /**
         * This download couldn't be completed because of an HttpException while
         * setting up the request.

         */
        val STATUS_HTTP_EXCEPTION = 496

        /**
         * This download couldn't be completed because there were too many
         * redirects.

         */
        val STATUS_TOO_MANY_REDIRECTS = 497

        /**
         * This download couldn't be completed due to insufficient storage space.
         * Typically, this is because the SD card is full.

         */
        val STATUS_INSUFFICIENT_SPACE_ERROR = 498

        /**
         * This download couldn't be completed because no external storage device
         * was found. Typically, this is because the SD card is not mounted.

         */
        val STATUS_DEVICE_NOT_FOUND_ERROR = 499


    }

}