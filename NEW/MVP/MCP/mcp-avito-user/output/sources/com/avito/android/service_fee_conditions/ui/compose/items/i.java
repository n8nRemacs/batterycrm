package com.avito.android.service_fee_conditions.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceFeeConditionsHeaderItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f278540l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f278541m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AttributedText attributedText, v vVar, int i12) {
        super(2);
        this.f278540l = attributedText;
        this.f278541m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(57);
        k.a(this.f278540l, this.f278541m, a12, iA2);
        return G0.f406611a;
    }
}
