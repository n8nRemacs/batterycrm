package com.avito.android.screens.bbip.ui.items.budget;

import Y41.r;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.akita.compose.component.chips.InterfaceC27333b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BudgetItemView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final q f260336a = new q();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f260337b = new C22096n(27175738, a.f260338l, false);

    /* compiled from: BudgetItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Lcom/akita/compose/component/chips/b;", "chip", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements r<Integer, InterfaceC27333b, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f260338l = new a();

        public a() {
            super(4);
        }

        @Override // Y41.r
        public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b, A a12, Integer num2) {
            num.intValue();
            InterfaceC27333b interfaceC27333b2 = interfaceC27333b;
            A a13 = a12;
            int iIntValue = num2.intValue();
            if ((iIntValue & 112) == 0) {
                iIntValue |= a13.B(interfaceC27333b2) ? 32 : 16;
            }
            if ((iIntValue & 721) == 144 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.bbip_common.ui.chips.a.a((com.avito.android.bbip_common.ui.chips.b) interfaceC27333b2, a13, 0);
            }
            return G0.f406611a;
        }
    }
}
