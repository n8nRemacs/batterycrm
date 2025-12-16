package com.akita.compose.theme.re23.preview;

import android.content.Context;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TooltipPreview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/tooltip/r;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/tooltip/r;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class Y3 extends kotlin.jvm.internal.N implements Y41.q<com.akita.compose.component.tooltip.r, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f65581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f65582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.tooltip.t f65583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f65584o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Context context, InterfaceC22204y1<Boolean> interfaceC22204y1, com.akita.compose.component.tooltip.t tVar, InterfaceC22204y1<Boolean> interfaceC22204y12) {
        super(3);
        this.f65581l = context;
        this.f65582m = interfaceC22204y1;
        this.f65583n = tVar;
        this.f65584o = interfaceC22204y12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(com.akita.compose.component.tooltip.r rVar, androidx.compose.runtime.A a12, Integer num) {
        com.akita.compose.component.tooltip.r rVar2 = rVar;
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        Context context = this.f65581l;
        com.akita.compose.component.tooltip.k.d(rVar2, null, "Title", "Content text", "Button", new W3(context), this.f65582m.getF42167b().booleanValue() ? new X3(this.f65583n, context) : null, this.f65584o.getF42167b().booleanValue(), a13, 28040, 1);
        return kotlin.G0.f406611a;
    }
}
