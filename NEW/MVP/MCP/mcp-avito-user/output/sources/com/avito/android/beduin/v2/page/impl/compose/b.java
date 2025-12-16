package com.avito.android.beduin.v2.page.impl.compose;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.C29270c0;
import com.avito.beduin.v2.render.compose.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: BeduinV2PageComposeFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinV2PageComposeFragment f104936l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BeduinV2PageComposeFragment beduinV2PageComposeFragment) {
        super(2);
        this.f104936l = beduinV2PageComposeFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            BeduinV2PageComposeFragment beduinV2PageComposeFragment = this.f104936l;
            d dVarQ5 = beduinV2PageComposeFragment.q5();
            dU.p pVar = beduinV2PageComposeFragment.f104921u0;
            if (pVar == null) {
                pVar = null;
            }
            G gB2 = pVar.b();
            dU.p pVar2 = beduinV2PageComposeFragment.f104921u0;
            if (pVar2 == null) {
                pVar2 = null;
            }
            com.avito.beduin.v2.theme.k kVarA = pVar2.a();
            j jVar = (j) beduinV2PageComposeFragment.f104918r0.getValue();
            C29270c0 c29270c0 = beduinV2PageComposeFragment.f104917q0;
            C29270c0 c29270c02 = c29270c0 != null ? c29270c0 : null;
            c29270c02.getClass();
            n<Object> nVar = C29270c0.f113263t[15];
            com.avito.android.beduin.v2.page.impl.compose.screen.j.a(dVarQ5, gB2, kVarA, jVar, ((Boolean) c29270c02.f113279q.a().invoke()).booleanValue(), a13, 4616);
        }
        return G0.f406611a;
    }
}
