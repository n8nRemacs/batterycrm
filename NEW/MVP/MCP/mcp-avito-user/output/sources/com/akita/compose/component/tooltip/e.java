package com.akita.compose.component.tooltip;

import androidx.compose.runtime.A;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TooltipBox.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f63474l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TooltipToAnchorPosition f63475m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TooltipTailPosition f63476n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f63477o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, TooltipToAnchorPosition tooltipToAnchorPosition, TooltipTailPosition tooltipTailPosition, C22096n c22096n) {
        super(2);
        this.f63474l = wVar;
        this.f63475m = tooltipToAnchorPosition;
        this.f63476n = tooltipTailPosition;
        this.f63477o = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            S.a(c.f63471a.b(new g(this.f63474l, this.f63475m, this.f63476n)), androidx.compose.runtime.internal.r.c(-464804394, new d(this.f63477o), a13), a13, 56);
        }
        return G0.f406611a;
    }
}
