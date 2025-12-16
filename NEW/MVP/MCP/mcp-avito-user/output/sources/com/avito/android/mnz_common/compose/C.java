package com.avito.android.mnz_common.compose;

import androidx.compose.foundation.layout.V1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MnzSimpleFloatingFooter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class C extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V1 f197814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f197815m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f197816n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f197817o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f197818p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f197819q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(V1 v12, androidx.compose.ui.v vVar, int i12, C22096n c22096n, int i13, int i14) {
        super(2);
        this.f197814l = v12;
        this.f197815m = vVar;
        this.f197816n = i12;
        this.f197817o = c22096n;
        this.f197818p = i13;
        this.f197819q = i14;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f197818p | 1);
        C22096n c22096n = this.f197817o;
        V1 v12 = this.f197814l;
        androidx.compose.ui.v vVar = this.f197815m;
        D.a(v12, vVar, this.f197816n, c22096n, a12, iA2, this.f197819q);
        return G0.f406611a;
    }
}
