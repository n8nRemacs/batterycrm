package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.ErrorType;
import kotlin.Metadata;

/* compiled from: ErrorType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"NON_RESTORABLE_ERROR_CODE", "", "NO_ERROR_CODE", "RESTORABLE_ERROR_CODE", "findErrorByCode", "Lcom/avito/android/remote/model/ErrorType;", "code", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ErrorTypeKt {
    private static final int NON_RESTORABLE_ERROR_CODE = 2;
    private static final int NO_ERROR_CODE = 0;
    private static final int RESTORABLE_ERROR_CODE = 1;

    @k
    public static final ErrorType findErrorByCode(int i12) {
        return i12 == RESTORABLE_ERROR_CODE ? ErrorType.RestorableError.INSTANCE : i12 == NON_RESTORABLE_ERROR_CODE ? ErrorType.NonRestorableError.INSTANCE : ErrorType.NoError.INSTANCE;
    }
}
