package com.avito.android.publish.video_upload;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<Ef0.b> f245550b;

    public g(io.reactivex.rxjava3.subjects.e<Ef0.b> eVar) {
        this.f245550b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        V2.f318762a.a("DEFAULT_TAG", "VideoUploadInteractor failed upload video", th2);
        this.f245550b.onError(th2);
    }
}
