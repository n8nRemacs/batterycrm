package com.avito.android.early_access.adapter.parameter.list;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessParameters.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessParametersItem f145150l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f145151m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f145152n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EarlyAccessParametersItem earlyAccessParametersItem, v vVar, int i12) {
        super(2);
        this.f145150l = earlyAccessParametersItem;
        this.f145151m = vVar;
        this.f145152n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145152n | 1);
        c.a(this.f145150l, this.f145151m, a12, iA2);
        return G0.f406611a;
    }
}
