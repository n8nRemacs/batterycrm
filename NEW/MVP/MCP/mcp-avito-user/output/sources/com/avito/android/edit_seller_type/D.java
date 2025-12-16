package com.avito.android.edit_seller_type;

import androidx.compose.runtime.C22066f2;
import com.avito.android.edit_seller_type.mvi.entity.c;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditSellerTypeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class D extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f146671l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<c.f, G0> f146672m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(int i12, Y41.l lVar, ArrayList arrayList) {
        super(2);
        this.f146671l = arrayList;
        this.f146672m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        o.b(this.f146671l, this.f146672m, a12, iA2);
        return G0.f406611a;
    }
}
