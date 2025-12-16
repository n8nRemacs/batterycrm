package com.avito.android.mortgage_category;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageCategoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f204901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f204902m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f204903n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<String> f204904o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f204905p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f204906q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f204907r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(float f12, float f13, float f14, List<String> list, androidx.compose.ui.v vVar, boolean z12, int i12, int i13) {
        super(2);
        this.f204901l = f12;
        this.f204902m = f13;
        this.f204903n = f14;
        this.f204904o = list;
        this.f204905p = vVar;
        this.f204906q = z12;
        this.f204907r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(4097);
        float f12 = this.f204903n;
        List<String> list = this.f204904o;
        A.c(this.f204901l, this.f204902m, f12, list, this.f204906q, a12, iA2, this.f204907r);
        return G0.f406611a;
    }
}
