package com.akita.compose.foundation;

import androidx.compose.material.ripple.C21332c;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.D0;
import androidx.compose.ui.node.E0;
import androidx.compose.ui.node.InterfaceC22415i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/akita/compose/foundation/k;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/D0;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/a0;", "color", "<init>", "(Landroidx/compose/foundation/interaction/k;ZFLandroidx/compose/ui/graphics/a0;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class k extends AbstractC22425n implements InterfaceC22415i, D0 {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.k f63591r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f63592s;

    /* renamed from: t, reason: collision with root package name */
    public final float f63593t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22242a0 f63594u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public C21332c f63595v;

    public k(androidx.compose.foundation.interaction.k kVar, boolean z12, float f12, InterfaceC22242a0 interfaceC22242a0, C42822w c42822w) {
        this.f63591r = kVar;
        this.f63592s = z12;
        this.f63593t = f12;
        this.f63594u = interfaceC22242a0;
    }

    @Override // androidx.compose.ui.node.D0
    public final void K1() {
        E0.a(this, new j(this));
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        E0.a(this, new j(this));
    }
}
