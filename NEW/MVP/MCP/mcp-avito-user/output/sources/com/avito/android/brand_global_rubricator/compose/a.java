package com.avito.android.brand_global_rubricator.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandGlobalRubricatorUi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f107430l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f107431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f107432n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UniversalImage universalImage, boolean z12, v vVar, int i12) {
        super(2);
        this.f107430l = universalImage;
        this.f107431m = z12;
        this.f107432n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        h.a(this.f107430l, this.f107431m, a12, iA2);
        return G0.f406611a;
    }
}
