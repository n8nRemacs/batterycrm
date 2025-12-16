package com.avito.android.esia_redirect_screen.mvi;

import Iz.AbstractC14178c;
import Iz.d;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EsiaRedirectOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/esia_redirect_screen/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "LIz/c;", "LIz/d;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements t<AbstractC14178c, Iz.d> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Iz.d b(AbstractC14178c abstractC14178c) {
        AbstractC14178c abstractC14178c2 = abstractC14178c;
        if (abstractC14178c2 instanceof AbstractC14178c.a) {
            return d.a.f8682a;
        }
        if (abstractC14178c2 instanceof AbstractC14178c.b ? true : abstractC14178c2.equals(AbstractC14178c.C0498c.f8679a) ? true : abstractC14178c2.equals(AbstractC14178c.d.f8680a) ? true : abstractC14178c2.equals(AbstractC14178c.e.f8681a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
