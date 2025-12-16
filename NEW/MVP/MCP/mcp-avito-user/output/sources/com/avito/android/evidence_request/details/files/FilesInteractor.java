package com.avito.android.evidence_request.details.files;

import android.net.Uri;
import com.avito.android.remote.error.ApiError;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FilesInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/details/files/FilesInteractor;", "", "ValidatorError", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FilesInteractor {

    /* compiled from: FilesInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/details/files/FilesInteractor$ValidatorError;", "Lcom/avito/android/remote/error/ApiError$Custom;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValidatorError extends ApiError.Custom {
        public ValidatorError() {
            super(null, 1, null);
        }
    }

    void a(@Y61.k List<? extends Uri> list);

    @Y61.k
    io.reactivex.rxjava3.internal.observers.l b();

    @Y61.k
    y c(@Y61.k Y41.a aVar, @Y61.k com.avito.android.evidence_request.details.h hVar);

    @Y61.k
    U d();
}
