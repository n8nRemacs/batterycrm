package com.avito.android.evidence_request.mvi.domain.evidence_details;

import android.webkit.MimeTypeMap;
import com.avito.android.remote.model.files.UploadFilesResult;
import com.avito.android.util.rx3.g1;
import java.io.File;
import kotlin.Metadata;
import n80.InterfaceC44212a;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: EvidenceFilesUploadInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/j;", "Ln80/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30390j implements InterfaceC44212a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.K f148705a;

    /* compiled from: EvidenceFilesUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/files/UploadFilesResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.j$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f148706b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((UploadFilesResult) obj).getServerName();
        }
    }

    public C30390j(@Y61.k com.avito.android.remote.K k12) {
        this.f148705a = k12;
    }

    @Override // n80.InterfaceC44212a
    @Y61.k
    public final io.reactivex.rxjava3.core.I a(@Y61.k File file, @Y61.k String str) {
        C30387g c30387g = C30387g.f148700a;
        long length = file.length();
        c30387g.getClass();
        if (length > 16777216) {
            throw new IllegalStateException("Check failed.");
        }
        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
        String strConcat = "filename.".concat(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
        RequestBody.Companion companion2 = RequestBody.INSTANCE;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        return g1.a(this.f148705a.b(str, companion.createFormData("file", strConcat, companion2.create(file, MediaType.INSTANCE.parse(mimeTypeFromExtension))))).r(a.f148706b);
    }
}
