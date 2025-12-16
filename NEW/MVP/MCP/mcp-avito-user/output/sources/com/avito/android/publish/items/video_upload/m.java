package com.avito.android.publish.items.video_upload;

import android.graphics.PointF;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoUploadItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ YW0.f f237360l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SimpleDraweeView f237361m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f237362n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(YW0.f fVar, SimpleDraweeView simpleDraweeView, k kVar) {
        super(0);
        this.f237360l = fVar;
        this.f237361m = simpleDraweeView;
        this.f237362n = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int width = this.f237360l.getWidth();
        SimpleDraweeView simpleDraweeView = this.f237361m;
        int width2 = simpleDraweeView.getWidth();
        k kVar = this.f237362n;
        if (width < width2) {
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            hierarchy.n(s.c.f340138j);
            PointF pointF = k.f237311N;
            pointF.getClass();
            hierarchy.l(2).q(pointF);
            kVar.f237314C.animate().setDuration(300L).alpha(1.0f).start();
        } else {
            kVar.f237314C.setAlpha(1.0f);
        }
        simpleDraweeView.setAlpha(1.0f);
        return G0.f406611a;
    }
}
