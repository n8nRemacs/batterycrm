package com.avito.android.publish;

import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: PhotoUploadObserver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class I extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f231911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K f231912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(boolean z12, K k12) {
        super(1);
        this.f231911l = z12;
        this.f231912m = k12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        V2.f318762a.a("DEFAULT_TAG", "Failed to get uploading info", th2);
        if (this.f231911l) {
            this.f231912m.f231922e.accept(PhotoUploadObserver.UploadStatus.f231965f);
        }
        return kotlin.G0.f406611a;
    }
}
