package com.avito.android.publish.slots.delivery_summary.item;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: DeliverySummaryItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class l implements com.avito.android.deep_linking.links.w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c<DeepLink> f243589b;

    public l(com.jakewharton.rxrelay3.c<DeepLink> cVar) {
        this.f243589b = cVar;
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
        return new H(1, this.f243589b, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        this.f243589b.accept(deepLink);
    }
}
