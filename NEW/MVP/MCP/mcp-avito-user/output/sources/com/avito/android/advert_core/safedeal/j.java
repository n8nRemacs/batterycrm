package com.avito.android.advert_core.safedeal;

import com.avito.android.advert_core.safedeal.h;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: MyAdvertSafeDealServicesView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class j implements w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.a f84217b;

    public j(h.a aVar) {
        this.f84217b = aVar;
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
        return new H(1, this.f84217b, h.a.class, "followServicesDeepLink", "followServicesDeepLink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        this.f84217b.g(deepLink);
    }
}
