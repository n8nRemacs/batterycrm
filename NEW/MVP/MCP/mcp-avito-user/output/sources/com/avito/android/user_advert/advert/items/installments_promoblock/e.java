package com.avito.android.user_advert.advert.items.installments_promoblock;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;

/* compiled from: InstallmentsPromoBlockItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class e implements w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f309515b;

    public e(com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f309515b = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof w) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new C42801a(1, this.f309515b, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        b.a.a(this.f309515b, deepLink, null, null, 6);
    }
}
