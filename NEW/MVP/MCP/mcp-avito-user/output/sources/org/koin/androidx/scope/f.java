package org.koin.androidx.scope;

import android.content.ComponentCallbacks;
import androidx.view.InterfaceC22983P;
import g71.C40544c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* compiled from: ComponentActivityExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {
    @Y61.k
    public static final org.koin.core.scope.a a(@Y61.k ComponentCallbacks componentCallbacks, @Y61.k InterfaceC22983P interfaceC22983P) throws ScopeAlreadyCreatedException {
        org.koin.core.scope.a aVarA = C40544c.a(componentCallbacks).a(org.koin.core.component.g.a(componentCallbacks), org.koin.core.component.g.b(componentCallbacks), componentCallbacks);
        aVarA.f421477g.add(new a(interfaceC22983P));
        interfaceC22983P.getLifecycle().a(new g(aVarA));
        return aVarA;
    }

    /* compiled from: ComponentActivityExt.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/koin/androidx/scope/f$a", "Lorg/koin/core/scope/g;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements org.koin.core.scope.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f421410a;

        public a(InterfaceC22983P interfaceC22983P) {
            this.f421410a = interfaceC22983P;
        }

        @Override // org.koin.core.scope.g
        public final void a() {
        }
    }
}
