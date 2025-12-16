package com.avito.android.mortgage.root.list.items.bank.details;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageRootBankDetailsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f202328l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f202329m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f202330n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, ArrayList arrayList, v vVar, int i12) {
        super(2);
        this.f202328l = str;
        this.f202329m = arrayList;
        this.f202330n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(449);
        ArrayList arrayList = this.f202329m;
        j.a(this.f202328l, arrayList, this.f202330n, a12, iA2);
        return G0.f406611a;
    }
}
