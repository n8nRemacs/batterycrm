package com.avito.android.select;

import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: TypedErrors.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D {
    @Y61.k
    public static final e a(@Y61.k ApiError apiError) {
        return apiError instanceof ApiError.NetworkIOError ? new e(R.attr.img_noInternet, R.string.error_layout_no_internet, R.string.error_layout_check_connection) : new e(R.attr.img_unknownError, R.string.error_layout_unknown_error, R.string.error_layout_try_refresh);
    }
}
