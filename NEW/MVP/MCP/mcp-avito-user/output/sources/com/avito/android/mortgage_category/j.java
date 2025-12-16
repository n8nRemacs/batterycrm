package com.avito.android.mortgage_category;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageCategoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class j extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f204895l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f204896m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f204897n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f204898o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, float f12, float f13, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f204895l = str;
        this.f204896m = f12;
        this.f204897n = f13;
        this.f204898o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        float f12 = this.f204896m;
        float f13 = this.f204897n;
        A.a(this.f204895l, f12, f13, this.f204898o, a12, iA2);
        return G0.f406611a;
    }
}
