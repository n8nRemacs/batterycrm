package com.akita.compose.component.button;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Button.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f60717l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f60718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f60719n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f60720o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f60721p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z12, boolean z13, t tVar, C22096n c22096n, int i12) {
        super(2);
        this.f60717l = z12;
        this.f60718m = z13;
        this.f60719n = tVar;
        this.f60720o = c22096n;
        this.f60721p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60721p | 1);
        C22096n c22096n = this.f60720o;
        m.g(this.f60717l, this.f60718m, this.f60719n, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
