package com.avito.android.review.ui;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReivewComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f255428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f255429m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i12, v vVar, String str) {
        super(2);
        this.f255428l = str;
        this.f255429m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        f.a(this.f255428l, this.f255429m, a12, iA2);
        return G0.f406611a;
    }
}
