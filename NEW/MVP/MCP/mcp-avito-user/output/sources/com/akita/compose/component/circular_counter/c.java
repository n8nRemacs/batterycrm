package com.akita.compose.component.circular_counter;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CircularCounter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f61015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f61016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f61017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f61018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f61019p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(float f12, d dVar, v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f61015l = f12;
        this.f61016m = dVar;
        this.f61017n = vVar;
        this.f61018o = c22096n;
        this.f61019p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61019p | 1);
        C22096n c22096n = this.f61018o;
        d dVar = this.f61016m;
        v vVar = this.f61017n;
        a.a(this.f61015l, dVar, vVar, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
