package com.avito.android.trx_promo_impl.item.header;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: TrxPromoHeaderPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class e implements w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f304308b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super DeepLink, G0> lVar) {
        this.f304308b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof w) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new H(1, this.f304308b, l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@k DeepLink deepLink) {
        this.f304308b.invoke(deepLink);
    }
}
