package com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer;

import Y41.l;
import Y41.p;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIVideoRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f167384l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacUIVideoRendererState f167385m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super View, ? super IacUIVideoRendererState, G0> pVar, IacUIVideoRendererState iacUIVideoRendererState) {
        super(1);
        this.f167384l = (N) pVar;
        this.f167385m = iacUIVideoRendererState;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(View view) {
        this.f167384l.invoke(view, this.f167385m);
        return G0.f406611a;
    }
}
