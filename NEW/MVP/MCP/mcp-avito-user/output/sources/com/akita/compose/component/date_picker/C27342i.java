package com.akita.compose.component.date_picker;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DatePickerBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.component.date_picker.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27342i extends N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f61225l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<kotlin.ranges.o>, G0> f61226m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<kotlin.ranges.o>, G0> f61227n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61228o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<kotlin.ranges.o, Boolean> f61229p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f61230q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f61231r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f61232s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f61233t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27342i(C c12, Y41.l<? super List<kotlin.ranges.o>, G0> lVar, Y41.l<? super List<kotlin.ranges.o>, G0> lVar2, Y41.a<G0> aVar, Y41.l<? super kotlin.ranges.o, Boolean> lVar3, Y41.l<? super Long, Boolean> lVar4, Y41.l<? super Long, String> lVar5, F f12, boolean z12) {
        super(3);
        this.f61225l = c12;
        this.f61226m = lVar;
        this.f61227n = lVar2;
        this.f61228o = aVar;
        this.f61229p = lVar3;
        this.f61230q = (N) lVar4;
        this.f61231r = (N) lVar5;
        this.f61232s = f12;
        this.f61233t = z12;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            int i12 = com.akita.compose.component.floating_container.c.f61576e;
            F f12 = this.f61232s;
            y.b(this.f61225l, this.f61226m, this.f61227n, this.f61228o, null, this.f61229p, this.f61230q, this.f61231r, f12, this.f61233t, a13, 134217728);
        }
        return G0.f406611a;
    }
}
