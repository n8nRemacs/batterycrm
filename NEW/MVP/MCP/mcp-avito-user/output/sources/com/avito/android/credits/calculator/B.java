package com.avito.android.credits.calculator;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;

/* compiled from: InstallmentsV2CalculatorView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class B implements com.avito.android.deep_linking.links.w, kotlin.jvm.internal.D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f128647b;

    public B(A a12) {
        this.f128647b = a12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof kotlin.jvm.internal.D)) {
            return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.H(1, this.f128647b, A.class, "handleDeeplink", "handleDeeplink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        int i12 = A.f128626C;
        this.f128647b.E80(deepLink);
    }
}
