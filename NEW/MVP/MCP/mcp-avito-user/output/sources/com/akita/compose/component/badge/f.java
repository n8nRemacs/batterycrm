package com.akita.compose.component.badge;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Badge.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f60394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f60395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f60396n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p<A, Integer, G0> f60397o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f60398p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.akita.compose.foundation.p pVar, float f12, v vVar, p pVar2, int i12) {
        super(2);
        this.f60394l = pVar;
        this.f60395m = f12;
        this.f60396n = vVar;
        this.f60397o = pVar2;
        this.f60398p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        a.c(this.f60394l, this.f60395m, this.f60396n, this.f60397o, a12, C22066f2.a(this.f60398p | 1));
        return G0.f406611a;
    }
}
