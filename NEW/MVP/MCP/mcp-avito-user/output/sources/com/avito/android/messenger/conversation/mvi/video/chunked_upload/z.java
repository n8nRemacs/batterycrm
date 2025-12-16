package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.C32059a0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32058a;
import com.avito.android.remote.model.Navigation;
import java.io.File;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: ChunkedVideoUploadWorkerInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/a0;", Navigation.CONFIG, "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/MultipartUploadPart;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_upload/a0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f194984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f194986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f194987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f194988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f194989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f194990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f194991i;

    public z(String str, String str2, String str3, x xVar, String str4, String str5, String str6, AbstractC32094s0.b bVar) {
        this.f194984b = str;
        this.f194985c = str2;
        this.f194986d = str3;
        this.f194987e = xVar;
        this.f194988f = str4;
        this.f194989g = str5;
        this.f194990h = str6;
        this.f194991i = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32059a0 c32059a0 = (C32059a0) obj;
        String url = c32059a0.f191112a.newBuilder().addPathSegment("uploadPart").addPathSegment("").build().getUrl();
        File file = new File(this.f194984b);
        MediaType.Companion companion = MediaType.INSTANCE;
        String str = this.f194985c;
        if (str == null) {
            str = "video/*";
        }
        MediaType mediaType = companion.parse(str);
        MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
        String name = this.f194986d;
        if (name == null) {
            name = file.getName();
        }
        MultipartBody.Part partCreateFormData = companion2.createFormData("file", name, RequestBody.INSTANCE.create(file, mediaType));
        InterfaceC32058a interfaceC32058a = this.f194987e.f194981d;
        long j12 = this.f194991i.f191224d;
        return interfaceC32058a.a(url, c32059a0.f191113b, this.f194988f, this.f194989g, this.f194990h, j12, partCreateFormData);
    }
}
