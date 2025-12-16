package com.avito.android.edit_seller_type;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.edit_seller_type.mvi.entity.c;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditSellerTypeScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class C extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f146669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<c.f, G0> f146670m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y41.l lVar, ArrayList arrayList) {
        super(1);
        this.f146669l = arrayList;
        this.f146670m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        y yVar = y.f146875l;
        ArrayList arrayList = this.f146669l;
        m0Var.a(arrayList.size(), null, new A(yVar, arrayList), new C22096n(-632812321, new B(this.f146670m, arrayList), true));
        return G0.f406611a;
    }
}
