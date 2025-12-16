package com.avito.android.autoteka.helpers;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: GeneralizedErrors.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_autoteka_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {
    @Y61.k
    public static final PrintableText a(@Y61.k ApiError apiError) {
        return apiError instanceof ApiError.Unauthorized ? com.avito.android.printable_text.b.c(R.string.autoteka_login_button, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.autoteka_update_button, new Serializable[0]);
    }

    @Y61.k
    public static final PrintableText b(@Y61.k ApiError apiError) {
        return (apiError.getF244063c().length() == 0 || (apiError instanceof ApiError.InternalError)) ? com.avito.android.printable_text.b.c(R.string.autoteka_try_again, new Serializable[0]) : com.avito.android.printable_text.b.f(apiError.getF244063c());
    }

    @Y61.k
    public static final PrintableText c(@Y61.k ApiError apiError) {
        return apiError instanceof ApiError.Unauthorized ? com.avito.android.printable_text.b.c(R.string.autoteka_error_has_occurred_unauthorized, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.autoteka_error_has_occurred, new Serializable[0]);
    }

    @Y61.k
    public static final PrintableText d(@Y61.k ApiError apiError) {
        return (apiError.getF244063c().length() == 0 || (apiError instanceof ApiError.InternalError)) ? com.avito.android.printable_text.b.c(R.string.autoteka_try_again_for_toast, new Serializable[0]) : com.avito.android.printable_text.b.f(apiError.getF244063c());
    }
}
