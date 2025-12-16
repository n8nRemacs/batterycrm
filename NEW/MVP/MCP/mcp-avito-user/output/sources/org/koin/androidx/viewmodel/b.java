package org.koin.androidx.viewmodel;

import Y61.k;
import Y61.l;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;
import p71.InterfaceC46911e;
import z1.AbstractC50339a;

/* compiled from: GetViewModel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @InterfaceC46911e
    @k
    public static final M0 a(@k kotlin.reflect.d dVar, @k S0 s02, @l String str, @k AbstractC50339a abstractC50339a, @k org.koin.core.scope.a aVar) {
        Class<?> clsF = ((InterfaceC42819t) dVar).f();
        P0 p02 = new P0(s02, new org.koin.androidx.viewmodel.factory.b(dVar, aVar, null, null), abstractC50339a);
        return str != null ? p02.b(clsF, str) : p02.a(clsF);
    }
}
