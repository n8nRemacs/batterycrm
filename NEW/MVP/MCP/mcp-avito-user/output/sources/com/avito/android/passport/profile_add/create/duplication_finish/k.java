package com.avito.android.passport.profile_add.create.duplication_finish;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.passport.network.model.BusinessVerificationDuplicateSuccessResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BusinessVerificationDuplicationFinishScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BusinessVerificationDuplicateSuccessResult f211306l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<P50.a, G0> f211307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f211308n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(BusinessVerificationDuplicateSuccessResult businessVerificationDuplicateSuccessResult, Y41.l<? super P50.a, G0> lVar, int i12) {
        super(2);
        this.f211306l = businessVerificationDuplicateSuccessResult;
        this.f211307m = lVar;
        this.f211308n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f211308n | 1);
        i.b(this.f211306l, this.f211307m, a12, iA2);
        return G0.f406611a;
    }
}
