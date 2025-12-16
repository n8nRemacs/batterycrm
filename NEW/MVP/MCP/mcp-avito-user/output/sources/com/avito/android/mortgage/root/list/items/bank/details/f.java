package com.avito.android.mortgage.root.list.items.bank.details;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageRootBankDetailsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f202331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f202332m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f202333n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, AttributedText attributedText, v vVar, int i12) {
        super(2);
        this.f202331l = str;
        this.f202332m = attributedText;
        this.f202333n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(449);
        v vVar = this.f202333n;
        j.b(this.f202331l, this.f202332m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
