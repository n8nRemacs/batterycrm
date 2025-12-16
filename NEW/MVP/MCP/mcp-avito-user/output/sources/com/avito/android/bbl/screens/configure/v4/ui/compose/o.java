package com.avito.android.bbl.screens.configure.v4.ui.compose;

import Bh.C13148c;
import Bh.InterfaceC13146a;
import Bh.InterfaceC13147b;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BblConfigureV4Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13148c f99580l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC13147b> f99581m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13146a, G0> f99582n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f99583o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.q<DeepLink, String, Bundle, G0> f99584p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f99585q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f99586r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C13148c c13148c, InterfaceC43160i interfaceC43160i, Y41.l lVar, Y41.l lVar2, Y41.q qVar, v vVar, int i12) {
        super(2);
        this.f99580l = c13148c;
        this.f99581m = interfaceC43160i;
        this.f99582n = lVar;
        this.f99583o = lVar2;
        this.f99584p = qVar;
        this.f99585q = vVar;
        this.f99586r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99586r | 1);
        Y41.l<InterfaceC13146a, G0> lVar = this.f99582n;
        Y41.l<DeepLink, G0> lVar2 = this.f99583o;
        p.a(this.f99580l, this.f99581m, lVar, lVar2, this.f99584p, a12, iA2);
        return G0.f406611a;
    }
}
