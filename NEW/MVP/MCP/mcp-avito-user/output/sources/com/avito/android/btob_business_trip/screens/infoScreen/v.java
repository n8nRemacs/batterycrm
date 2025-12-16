package com.avito.android.btob_business_trip.screens.infoScreen;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.btob_business_trip.models.AdvantageInfo;
import com.avito.android.btob_business_trip.models.ConditionsInfo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: B2bBusinessTripInfoScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class v extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f108026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<AdvantageInfo> f108027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ConditionsInfo f108028n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f108029o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, List<AdvantageInfo> list, ConditionsInfo conditionsInfo, int i12) {
        super(2);
        this.f108026l = str;
        this.f108027m = list;
        this.f108028n = conditionsInfo;
        this.f108029o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f108029o | 1);
        List<AdvantageInfo> list = this.f108027m;
        ConditionsInfo conditionsInfo = this.f108028n;
        i.c(this.f108026l, list, conditionsInfo, a12, iA2);
        return G0.f406611a;
    }
}
