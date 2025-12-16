package com.avito.android.mortgage_calculator.data;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageCalculatorDeeplinkStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/data/c;", "Lcom/avito/android/mortgage_calculator/data/a;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes15.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Q<String, DeepLink>> f204064a = new AtomicReference<>(new Q(null, null));

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Q<String, DeepLink>> f204065b = new AtomicReference<>(new Q(null, null));

    @Inject
    public c() {
    }

    @Override // com.avito.android.mortgage_calculator.data.a
    public final void a(@Y61.l DeepLink deepLink, @Y61.l String str) {
        AtomicReference<Q<String, DeepLink>> atomicReference = this.f204065b;
        Q<String, DeepLink> q12 = atomicReference.get();
        if (!L.f(q12.f406619b, str)) {
            q12 = null;
        }
        Q<String, DeepLink> q13 = q12;
        if (L.f(deepLink, q13 != null ? q13.f406620c : null)) {
            return;
        }
        atomicReference.set(new Q<>(str, deepLink));
    }

    @Override // com.avito.android.mortgage_calculator.data.a
    public final void b(@Y61.l DeepLink deepLink, @Y61.l String str) {
        if (L.f(deepLink, c(str))) {
            return;
        }
        this.f204064a.set(new Q<>(str, deepLink));
    }

    @Override // com.avito.android.mortgage_calculator.data.b
    @Y61.l
    public final DeepLink c(@Y61.l String str) {
        Q<String, DeepLink> q12 = this.f204064a.get();
        if (!L.f(q12.f406619b, str)) {
            q12 = null;
        }
        Q<String, DeepLink> q13 = q12;
        if (q13 != null) {
            return q13.f406620c;
        }
        return null;
    }
}
