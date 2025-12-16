package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import com.avito.android.messenger.conversation.mvi.file_upload.C32059a0;
import com.avito.android.remote.model.Navigation;
import io.reactivex.rxjava3.core.I;
import java.io.File;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: FileUploadWorkerInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/a0;", Navigation.CONFIG, "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_upload/a0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f191311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f191313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f191314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f191315f;

    public t(String str, String str2, String str3, r rVar, String str4) {
        this.f191311b = str;
        this.f191312c = str2;
        this.f191313d = str3;
        this.f191314e = rVar;
        this.f191315f = str4;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32059a0 c32059a0 = (C32059a0) obj;
        String url = c32059a0.f191112a.newBuilder().addPathSegment("upload").addPathSegment("").build().getUrl();
        File file = new File(this.f191311b);
        MediaType.Companion companion = MediaType.INSTANCE;
        String str = this.f191312c;
        MediaType mediaType = companion.parse(str != null ? str : "");
        MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
        String name = this.f191313d;
        if (name == null) {
            name = file.getName();
        }
        I<G0> iB2 = this.f191314e.f191308d.b(url, c32059a0.f191113b, this.f191315f, companion2.createFormData("file", name, RequestBody.INSTANCE.create(file, mediaType)));
        iB2.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.v(iB2);
    }
}
