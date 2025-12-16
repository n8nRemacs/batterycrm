package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CancellationDiscountSwitcher.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_cancellation_settings.composables.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35111k extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f288228l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f288229m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f288230n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f288231o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f288232p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f288233q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f288234r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35111k(String str, String str2, boolean z12, boolean z13, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f288228l = str;
        this.f288229m = str2;
        this.f288230n = z12;
        this.f288231o = z13;
        this.f288232p = lVar;
        this.f288233q = vVar;
        this.f288234r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f288234r | 1);
        boolean z12 = this.f288230n;
        boolean z13 = this.f288231o;
        C35117q.a(this.f288228l, this.f288229m, z12, z13, this.f288232p, this.f288233q, a12, iA2);
        return G0.f406611a;
    }
}
