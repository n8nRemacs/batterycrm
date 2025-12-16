package com.avito.android.personal_banner.feature.mvi;

import Y60.b;
import Z60.b;
import Z60.c;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BannerEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "LZ60/c;", "LZ60/b;", "<init>", "()V", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements com.avito.android.arch.mvi.t<Z60.c, Z60.b> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Z60.b b(Z60.c cVar) {
        DeepLink deepLink;
        Z60.c cVar2 = cVar;
        if (!(cVar2 instanceof c.C1421c)) {
            if (cVar2 instanceof c.a ? true : cVar2 instanceof c.d ? true : cVar2 instanceof c.e ? true : cVar2 instanceof c.b) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Y60.b bVar = ((c.C1421c) cVar2).f19922a;
        if (!(bVar instanceof b.a) || (deepLink = ((b.a) bVar).f19310c) == null) {
            return null;
        }
        return new b.a(deepLink);
    }
}
