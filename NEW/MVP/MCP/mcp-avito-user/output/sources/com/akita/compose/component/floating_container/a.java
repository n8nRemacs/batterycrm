package com.akita.compose.component.floating_container;

import Y41.p;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.shape.n;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.i;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FloatingContainer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f61568l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f61569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f61570n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20585k.l f61571o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i.a f61572p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61573q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61574r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61575s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, c cVar, n nVar, C20585k.l lVar, i.a aVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f61568l = vVar;
        this.f61569m = cVar;
        this.f61570n = nVar;
        this.f61571o = lVar;
        this.f61572p = aVar;
        this.f61573q = c22096n;
        this.f61574r = i12;
        this.f61575s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61574r | 1);
        C20585k.l lVar = this.f61571o;
        b.a(this.f61568l, this.f61569m, this.f61570n, lVar, this.f61572p, this.f61573q, a12, iA2, this.f61575s);
        return G0.f406611a;
    }
}
