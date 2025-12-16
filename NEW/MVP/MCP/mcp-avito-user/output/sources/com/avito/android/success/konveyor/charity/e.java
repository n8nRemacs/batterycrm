package com.avito.android.success.konveyor.charity;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import eA0.InterfaceC39979a;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: SuccessCharityBlockPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class e implements w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f291628b;

    public e(g gVar) {
        this.f291628b = gVar;
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
        return new H(1, this.f291628b, g.class, "handleLink", "handleLink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@k DeepLink deepLink) {
        g gVar = this.f291628b;
        gVar.f291632c.invoke(new InterfaceC39979a.C11056a(deepLink));
    }
}
