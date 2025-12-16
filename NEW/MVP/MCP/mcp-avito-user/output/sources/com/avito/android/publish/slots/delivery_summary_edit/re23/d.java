package com.avito.android.publish.slots.delivery_summary_edit.re23;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: PublishDeliverySummaryEditItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class d implements w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c<DeepLink> f243838b;

    public d(com.jakewharton.rxrelay3.c<DeepLink> cVar) {
        this.f243838b = cVar;
    }

    public final boolean equals(@l Object obj) {
        if ((obj instanceof w) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new H(1, this.f243838b, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@k DeepLink deepLink) {
        this.f243838b.accept(deepLink);
    }
}
