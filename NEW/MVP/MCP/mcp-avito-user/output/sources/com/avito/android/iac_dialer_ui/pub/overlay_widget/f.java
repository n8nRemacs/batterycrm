package com.avito.android.iac_dialer_ui.pub.overlay_widget;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIOverlayWidget.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIOverlayWidgetState f167751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f167752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f167753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f167754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f167755p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f167756q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(IacUIOverlayWidgetState iacUIOverlayWidgetState, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, v.a aVar4, int i12) {
        super(2);
        this.f167751l = iacUIOverlayWidgetState;
        this.f167752m = aVar;
        this.f167753n = aVar2;
        this.f167754o = aVar3;
        this.f167755p = aVar4;
        this.f167756q = i12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, java.lang.Object] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167756q | 1);
        ?? r32 = this.f167754o;
        ?? r12 = this.f167752m;
        ?? r22 = this.f167753n;
        h.a(this.f167751l, r12, r22, r32, this.f167755p, a12, iA2);
        return G0.f406611a;
    }
}
