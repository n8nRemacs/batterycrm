package com.akita.compose.component.multiselect;

import Y41.s;
import Y61.k;
import androidx.compose.animation.C20340d0;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MultiselectScope.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/multiselect/f;", "Lcom/akita/compose/component/multiselect/d;", "<init>", "()V", "multiselect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f62173a = new ArrayList();

    /* compiled from: MultiselectScope.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lcom/akita/compose/component/multiselect/g;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "enabled", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Lcom/akita/compose/component/multiselect/g;ZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements s<InterfaceC20572g2, g, Boolean, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f62174l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f62175m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f62176n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, boolean z12, Y41.a aVar) {
            super(5);
            this.f62174l = z12;
            this.f62175m = str;
            this.f62176n = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.s
        public final G0 invoke(InterfaceC20572g2 interfaceC20572g2, g gVar, Boolean bool, A a12, Integer num) {
            int i12;
            InterfaceC20572g2 interfaceC20572g22 = interfaceC20572g2;
            g gVar2 = gVar;
            boolean zBooleanValue = bool.booleanValue();
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i12 = (a13.B(interfaceC20572g22) ? 4 : 2) | iIntValue;
            } else {
                i12 = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i12 |= a13.B(gVar2) ? 32 : 16;
            }
            if ((iIntValue & 896) == 0) {
                i12 |= a13.j(zBooleanValue) ? 256 : 128;
            }
            if ((i12 & 5851) == 1170 && a13.c()) {
                a13.f();
            } else {
                C20340d0.c(interfaceC20572g22, this.f62174l, null, null, null, null, r.c(1534000380, new e(gVar2.f62181e, this.f62175m, zBooleanValue, gVar2, this.f62176n), a13), a13, (i12 & 14) | 1572864, 30);
            }
            return G0.f406611a;
        }
    }

    @Override // com.akita.compose.component.multiselect.d
    public final void a(@k String str, boolean z12, @k Y41.a<G0> aVar) {
        this.f62173a.add(new Q(new C22096n(-121524012, new a(str, z12, aVar), true), Boolean.valueOf(z12)));
    }
}
