package com.avito.android.evidence_request.mvi.domain.evidence_details;

import android.net.Uri;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FilesInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/FilesInteractor;", "", "ValidatorError", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FilesInteractor {

    /* compiled from: FilesInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/FilesInteractor$ValidatorError;", "Lcom/avito/android/remote/error/ApiError$Custom;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValidatorError extends ApiError.Custom {
        public ValidatorError() {
            super(null, 1, null);
        }
    }

    void a(@Y61.k List<? extends Uri> list);

    @Y61.k
    C43197r1 b();

    @Y61.k
    InterfaceC43160i<com.avito.android.photo_cache.q> c();

    @Y61.l
    Object d(@Y61.k Continuation<? super com.avito.android.photo_cache.q> continuation);
}
