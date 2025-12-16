package com.avito.android.mortgage_calculator.data;

import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: MortgageCalculatorSnippetStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/data/j;", "Lcom/avito/android/mortgage_calculator/data/g;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes15.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Z1<Q<String, H10.a>> f204076a = p2.a(new Q(null, null));

    @Inject
    public j() {
    }

    @Override // com.avito.android.mortgage_calculator.data.h
    @Y61.k
    public final i a(@Y61.l String str) {
        return new i(this.f204076a, this, str);
    }

    @Override // com.avito.android.mortgage_calculator.data.g
    public final void b(@Y61.l H10.a aVar, @Y61.l String str) {
        Z1<Q<String, H10.a>> z12 = this.f204076a;
        if (L.f(aVar, z12.getValue().f406620c)) {
            return;
        }
        z12.K5(new Q<>(str, aVar));
    }
}
