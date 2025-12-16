package com.avito.android.comfortable_deal.common.view;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpandedStepsList.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class r extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f120750l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f120751m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f120752n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f120753o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f120754p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f120755q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, int i12, boolean z12, Y41.a aVar, long j12, int i13) {
        super(2);
        this.f120750l = str;
        this.f120751m = i12;
        this.f120752n = z12;
        this.f120753o = aVar;
        this.f120754p = j12;
        this.f120755q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f120755q | 1);
        boolean z12 = this.f120752n;
        Y41.a<G0> aVar = this.f120753o;
        u.b(this.f120750l, this.f120751m, z12, aVar, this.f120754p, a12, iA2);
        return G0.f406611a;
    }
}
