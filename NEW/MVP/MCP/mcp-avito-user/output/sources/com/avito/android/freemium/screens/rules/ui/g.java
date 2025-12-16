package com.avito.android.freemium.screens.rules.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import eF.C39999c;
import eF.InterfaceC39997a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreemiumRulesContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C39999c f159159l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f159160m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC39997a, G0> f159161n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f159162o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C39999c c39999c, int i12, Y41.l lVar, v vVar, int i13) {
        super(2);
        this.f159159l = c39999c;
        this.f159160m = i12;
        this.f159161n = lVar;
        this.f159162o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        h.a(this.f159159l, this.f159160m, this.f159161n, a12, iA2);
        return G0.f406611a;
    }
}
