package com.avito.android.user_adverts.root_screen.adverts_host.delivery_restriction;

import Y61.k;
import androidx.view.M0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import yI0.InterfaceC50118a;
import yI0.InterfaceC50119b;

/* compiled from: DeliveryRestrictionViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/delivery_restriction/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/delivery_restriction/a;", "Landroidx/lifecycle/M0;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends M0 implements a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Z1<InterfaceC50119b> f312554E = p2.a(InterfaceC50119b.a.f443023a);

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC43160i<G0> f312555J = C43175k.w();

    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        InterfaceC50118a interfaceC50118a = (InterfaceC50118a) obj;
        boolean z12 = interfaceC50118a instanceof InterfaceC50118a.b;
        Z1<InterfaceC50119b> z13 = this.f312554E;
        if (z12) {
            while (!z13.N3(z13.getValue(), new InterfaceC50119b.C12897b(((InterfaceC50118a.b) interfaceC50118a).f443022a))) {
            }
        } else if (interfaceC50118a instanceof InterfaceC50118a.C12896a) {
            while (!z13.N3(z13.getValue(), InterfaceC50119b.a.f443023a)) {
            }
        }
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final InterfaceC43160i<G0> getEvents() {
        return this.f312555J;
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final n2 getState() {
        return this.f312554E;
    }
}
