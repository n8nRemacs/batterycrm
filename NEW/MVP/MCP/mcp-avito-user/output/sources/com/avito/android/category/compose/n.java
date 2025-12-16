package com.avito.android.category.compose;

import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f116532l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f116533m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C20644z c20644z, int i12) {
        super(2);
        this.f116532l = c20644z;
        this.f116533m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116533m | 1);
        b.d(this.f116532l, a12, iA2);
        return G0.f406611a;
    }
}
