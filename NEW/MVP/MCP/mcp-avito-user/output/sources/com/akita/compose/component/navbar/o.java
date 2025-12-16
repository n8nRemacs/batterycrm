package com.akita.compose.component.navbar;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f62259l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62260m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f62261n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f62262o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62263p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f62264q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f62266s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, androidx.compose.ui.v vVar, u uVar, int i12, Y41.a aVar, C22096n c22096n, int i13, int i14) {
        super(2);
        this.f62259l = str;
        this.f62260m = vVar;
        this.f62261n = uVar;
        this.f62262o = i12;
        this.f62263p = aVar;
        this.f62264q = c22096n;
        this.f62265r = i13;
        this.f62266s = i14;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62265r | 1);
        int i12 = this.f62262o;
        t.d(this.f62259l, this.f62260m, this.f62261n, i12, this.f62263p, this.f62264q, a12, iA2, this.f62266s);
        return G0.f406611a;
    }
}
