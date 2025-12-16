package com.avito.android.tariff.cpx.configure.advance.items.cards;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: CpxConfigureAdvanceCardsItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class f implements com.avito.android.deep_linking.links.w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f295660b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Y41.l<? super DeepLink, G0> lVar) {
        this.f295660b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new H(1, this.f295660b, Y41.l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        this.f295660b.invoke(deepLink);
    }
}
