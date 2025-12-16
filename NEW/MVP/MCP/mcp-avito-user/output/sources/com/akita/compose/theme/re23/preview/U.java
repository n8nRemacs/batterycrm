package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import com.akita.compose.component.chips.C27332a;
import com.akita.compose.component.chips.ChipsDisplayType;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: ChipsPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedIndex", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final String[] f65514a = {"Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh"};

    /* compiled from: ChipsPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.chips.y> f65515l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.b<ChipsDisplayType> f65516m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f65517n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.Q<String, com.akita.compose.component.chips.y> q12, AbstractC27462u0.b<ChipsDisplayType> bVar, InterfaceC22196w1 interfaceC22196w1) {
            super(3);
            this.f65515l = q12;
            this.f65516m = bVar;
            this.f65517n = interfaceC22196w1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            InterfaceC22196w1 interfaceC22196w1;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                String[] strArr = U.f65514a;
                ArrayList arrayList = new ArrayList(10);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    interfaceC22196w1 = this.f65517n;
                    if (i12 >= 10) {
                        break;
                    }
                    int i14 = i13 + 1;
                    arrayList.add(new C27332a(strArr[i12], i13 == interfaceC22196w1.e(), false, null, null, 28, null));
                    i12++;
                    i13 = i14;
                }
                com.akita.compose.component.chips.y yVar = this.f65515l.f406620c;
                ChipsDisplayType chipsDisplayType = (ChipsDisplayType) C22126m3.b(this.f65516m.f65855c, a13).getF42167b();
                a13.C(-588143179);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new T(interfaceC22196w1);
                    a13.H(objT);
                }
                a13.h();
                com.akita.compose.component.chips.d.b(arrayList, yVar, chipsDisplayType, (Y41.p) objT, null, null, null, a13, 3144, 112);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ChipsPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.chips.y> f65518l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65519m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, kotlin.Q q12) {
            super(2);
            this.f65518l = q12;
            this.f65519m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65519m | 1);
            U.a(this.f65518l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ChipsPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ChipsDisplayType> f65520a = kotlin.enums.c.a(ChipsDisplayType.values());
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.chips.y> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(796513088);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1161612430);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.runtime.U2.a(0);
                bE2.H(objT);
            }
            bE2.X(false);
            AbstractC27462u0.b bVarC = C27452s0.c("displayType", c.f65520a, ChipsDisplayType.f60864e, bE2, 0);
            C27452s0.a(q12.f406619b, null, null, 0.0f, Collections.singleton(bVarC), androidx.compose.runtime.internal.r.c(711688362, new a(q12, bVarC, (InterfaceC22196w1) objT), bE2), bE2, 229376, 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, q12);
        }
    }
}
