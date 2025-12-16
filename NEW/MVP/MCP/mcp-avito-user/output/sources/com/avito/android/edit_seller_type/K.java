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
final class K extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f146700l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<c.f, G0> f146701m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(int i12, Y41.l lVar, ArrayList arrayList) {
        super(2);
        this.f146700l = arrayList;
        this.f146701m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        o.d(this.f146700l, this.f146701m, a12, iA2);
        return G0.f406611a;
    }
}
