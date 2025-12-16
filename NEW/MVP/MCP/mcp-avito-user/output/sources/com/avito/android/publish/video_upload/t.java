package com.avito.android.publish.video_upload;

import Ff0.C13799a;
import SK0.b;
import com.avito.android.publish.items.video_upload.VideoUploadItemView;
import com.avito.android.publish.video_upload.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: VideoUploadViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class t extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<io.reactivex.rxjava3.disposables.d> f245599l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f245600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s.b f245601n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l0.h<io.reactivex.rxjava3.disposables.d> hVar, s sVar, s.b bVar) {
        super(0);
        this.f245599l = hVar;
        this.f245600m = sVar;
        this.f245601n = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        io.reactivex.rxjava3.disposables.d dVar = this.f245599l.f406842b;
        if (dVar != null) {
            dVar.dispose();
        }
        this.f245600m.f245578L.I0(this.f245601n.a(), this.f245601n.f245590c, Long.valueOf(System.currentTimeMillis() - this.f245601n.f245588a));
        s sVar = this.f245600m;
        sVar.f245586T = VideoUploadItemView.State.f237258f;
        Ff0.b bVar = sVar.f245581O;
        bVar.getClass();
        b.a.a(bVar.f5949a, new C13799a(), null, null, null, 14);
        return G0.f406611a;
    }
}
