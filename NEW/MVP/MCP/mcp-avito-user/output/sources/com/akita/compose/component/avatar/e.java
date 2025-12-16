package com.akita.compose.component.avatar;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Avatar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f60294l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f60295m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f60296n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f60297o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f60298p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f60299q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, v vVar, com.akita.compose.foundation.p pVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f60294l = iVar;
        this.f60295m = vVar;
        this.f60296n = pVar;
        this.f60297o = c22096n;
        this.f60298p = i12;
        this.f60299q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60298p | 1);
        v vVar = this.f60295m;
        h.b(this.f60294l, vVar, this.f60296n, this.f60297o, a12, iA2, this.f60299q);
        return G0.f406611a;
    }
}
