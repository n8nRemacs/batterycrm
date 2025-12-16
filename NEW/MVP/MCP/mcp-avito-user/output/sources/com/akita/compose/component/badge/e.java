package com.akita.compose.component.badge;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Badge.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f60387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f60388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f60389n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f60390o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f60391p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f60392q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f60393r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, v vVar, boolean z12, boolean z13, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f60387l = iVar;
        this.f60388m = vVar;
        this.f60389n = z12;
        this.f60390o = z13;
        this.f60391p = c22096n;
        this.f60392q = i12;
        this.f60393r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60392q | 1);
        boolean z12 = this.f60389n;
        a.b(this.f60387l, this.f60388m, z12, this.f60390o, this.f60391p, a12, iA2, this.f60393r);
        return G0.f406611a;
    }
}
