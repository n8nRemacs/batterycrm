package com.avito.android.auto_evidence_request.files;

import android.webkit.MimeTypeMap;
import com.avito.android.remote.K;
import com.avito.android.remote.model.files.UploadFilesResult;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import java.io.File;
import kotlin.Metadata;
import l41.o;
import n80.InterfaceC44212a;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: AutoEvidenceFilesUploadInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/files/c;", "Ln80/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC44212a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K f95119a;

    /* compiled from: AutoEvidenceFilesUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/files/UploadFilesResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f95120b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((UploadFilesResult) obj).getServerName();
        }
    }

    public c(@Y61.k K k12) {
        this.f95119a = k12;
    }

    @Override // n80.InterfaceC44212a
    @Y61.k
    public final I a(@Y61.k File file, @Y61.k String str) {
        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
        String strConcat = "filename.".concat(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
        RequestBody.Companion companion2 = RequestBody.INSTANCE;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "image/*";
        }
        return g1.a(this.f95119a.b(str, companion.createFormData("file", strConcat, companion2.create(file, MediaType.INSTANCE.parse(mimeTypeFromExtension))))).r(a.f95120b);
    }
}
