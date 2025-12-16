package com.akita.compose.component.avatar;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Avatar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f60283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f60284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f60285n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f60286o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f60287p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, v vVar, com.akita.compose.foundation.p pVar, int i12, int i13) {
        super(2);
        this.f60283l = iVar;
        this.f60284m = vVar;
        this.f60285n = pVar;
        this.f60286o = i12;
        this.f60287p = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60286o | 1);
        i iVar = this.f60283l;
        h.a(iVar, this.f60284m, this.f60285n, a12, iA2, this.f60287p);
        return G0.f406611a;
    }
}
