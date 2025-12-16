package com.airbnb.lottie.compose;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: LottieAnimationSizeNode.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/p;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.airbnb.lottie.compose.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27280p extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    public int f59532p;

    /* renamed from: q, reason: collision with root package name */
    public int f59533q;

    /* compiled from: LottieAnimationSizeNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.airbnb.lottie.compose.p$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f59534l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02) {
            super(1);
            this.f59534l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.h(this.f59534l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        long jA2;
        long jD2 = C22713c.d(j12, androidx.compose.ui.unit.v.a(this.f59532p, this.f59533q));
        if (C22712b.i(j12) == Integer.MAX_VALUE && C22712b.j(j12) != Integer.MAX_VALUE) {
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            int i12 = (int) (jD2 >> 32);
            int i13 = (this.f59533q * i12) / this.f59532p;
            jA2 = C22713c.a(i12, i12, i13, i13);
        } else if (C22712b.j(j12) != Integer.MAX_VALUE || C22712b.i(j12) == Integer.MAX_VALUE) {
            u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
            int i14 = (int) (jD2 >> 32);
            int i15 = (int) (jD2 & 4294967295L);
            jA2 = C22713c.a(i14, i14, i15, i15);
        } else {
            u.a aVar3 = androidx.compose.ui.unit.u.f42871b;
            int i16 = (int) (jD2 & 4294967295L);
            int i17 = (this.f59532p * i16) / this.f59533q;
            jA2 = C22713c.a(i17, i17, i16, i16);
        }
        K0 k0I = interfaceC22363h0.I(jA2);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new a(k0I));
    }
}
