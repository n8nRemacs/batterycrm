package com.avito.android.categories_global.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoriesScreenContentUi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f116371l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f116372m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f116373n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f116374o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z12, String str, v vVar, int i12) {
        super(2);
        this.f116371l = z12;
        this.f116372m = str;
        this.f116373n = vVar;
        this.f116374o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116374o | 1);
        v vVar = this.f116373n;
        g.d(this.f116371l, this.f116372m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
