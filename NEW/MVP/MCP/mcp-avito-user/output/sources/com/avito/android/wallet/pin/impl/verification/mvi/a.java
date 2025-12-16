package com.avito.android.wallet.pin.impl.verification.mvi;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletPinVerificationScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f329105a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f329106b = new C22096n(-1101668635, C10221a.f329107l, false);

    /* compiled from: WalletPinVerificationScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.a$a, reason: collision with other inner class name */
    public static final class C10221a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10221a f329107l = new C10221a();

        public C10221a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                v vVarO = C20588k2.o(v.f42878y1, 24);
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.ic_back, 0, a13);
                InterfaceC22374n.f40491a.getClass();
                C20806p1.a(eVarA, null, vVarO, null, InterfaceC22374n.a.f40498g, 0.0f, null, a13, 25016, 104);
            }
            return G0.f406611a;
        }
    }
}
