package com.avito.android.vas_planning;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: VasPlanningView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class j implements com.avito.android.deep_linking.links.w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f322409b;

    public j(q qVar) {
        this.f322409b = qVar;
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
        return new H(1, this.f322409b, q.class, "onAdvantageClick", "onAdvantageClick(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        this.f322409b.eb(deepLink);
    }
}
