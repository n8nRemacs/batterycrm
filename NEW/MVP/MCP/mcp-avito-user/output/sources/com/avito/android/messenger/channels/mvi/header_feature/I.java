package com.avito.android.messenger.channels.mvi.header_feature;

import FY.b;
import FY.c;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelsHeaderOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/header_feature/I;", "Lcom/avito/android/arch/mvi/t;", "LFY/b;", "LFY/c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class I implements com.avito.android.arch.mvi.t<FY.b, FY.c> {
    @Inject
    public I() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final FY.c b(FY.b bVar) {
        FY.b bVar2 = bVar;
        if (bVar2.equals(b.g.f4762a)) {
            return c.a.f4764a;
        }
        if (bVar2.equals(b.h.f4763a)) {
            return c.b.f4765a;
        }
        if (bVar2 instanceof b.e ? true : bVar2 instanceof b.f ? true : bVar2 instanceof b.c ? true : bVar2 instanceof b.d ? true : bVar2 instanceof b.C0292b ? true : bVar2 instanceof b.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
