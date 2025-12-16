package com.akita.compose.theme.re23.preview;

import R2.b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: TabGroupPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedTabIndex", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.y3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27485y3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final String[] f65921a = {"Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh"};

    /* compiled from: TabGroupPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.y3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.tab_group.u> f65922l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f65923m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.Q<String, com.akita.compose.component.tab_group.u> q12, InterfaceC22196w1 interfaceC22196w1) {
            super(3);
            this.f65922l = q12;
            this.f65923m = interfaceC22196w1;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                String[] strArr = C27485y3.f65921a;
                ArrayList arrayList = new ArrayList(10);
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 10; i12 < i14; i14 = 10) {
                    int i15 = i13 + 1;
                    b.c.a aVar = new b.c.a(strArr[i12]);
                    int i16 = i13 % 3;
                    boolean z12 = true;
                    b.a aVar2 = i16 == 1 ? new b.a(i13 * 17, null, 2, null) : null;
                    if (i16 != 2) {
                        z12 = false;
                    }
                    arrayList.add(new R2.b(aVar, new b.C0936b(aVar2, z12), false, 4, null));
                    i12++;
                    i13 = i15;
                }
                InterfaceC22196w1 interfaceC22196w1 = this.f65923m;
                int iE2 = interfaceC22196w1.e();
                a13.C(-2132618202);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new C27480x3(interfaceC22196w1);
                    a13.H(objT);
                }
                a13.h();
                com.akita.compose.component.tab_group.k.a(arrayList, iE2, (Y41.l) objT, this.f65922l.f406620c, null, null, a13, 392, 48);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TabGroupPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.y3$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.tab_group.u> f65924l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65925m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, kotlin.Q q12) {
            super(2);
            this.f65924l = q12;
            this.f65925m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65925m | 1);
            C27485y3.a(this.f65924l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.tab_group.u> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(660522830);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(789968591);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.runtime.U2.a(0);
                bE2.H(objT);
            }
            bE2.X(false);
            C27452s0.a(q12.f406619b, null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(-420528840, new a(q12, (InterfaceC22196w1) objT), bE2), bE2, 196608, 30);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, q12);
        }
    }
}
