package com.avito.android.messenger.channels.mvi.list_feature;

import HY.d;
import HY.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelsListOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/i1;", "Lcom/avito/android/arch/mvi/t;", "LHY/d;", "LHY/f;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i1 implements com.avito.android.arch.mvi.t<HY.d, HY.f> {
    @Inject
    public i1() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final HY.f b(HY.d dVar) {
        HY.d dVar2 = dVar;
        if (dVar2 instanceof d.b) {
            d.b bVar = (d.b) dVar2;
            String str = bVar.f7174c;
            if (str == null) {
                str = "";
            }
            return new f.a(bVar.f7172a, bVar.f7173b, str);
        }
        if (dVar2 instanceof d.l) {
            return new f.b(((d.l) dVar2).f7185a);
        }
        if (dVar2 instanceof d.c) {
            return new f.c(((d.c) dVar2).f7175a);
        }
        if (dVar2.equals(d.i.f7181a)) {
            return f.d.f7197a;
        }
        if (dVar2.equals(d.e.f7177a) ? true : dVar2 instanceof d.k ? true : dVar2 instanceof d.f ? true : dVar2 instanceof d.a ? true : dVar2 instanceof d.h ? true : dVar2 instanceof d.g ? true : dVar2 instanceof d.m ? true : dVar2 instanceof d.j ? true : dVar2.equals(d.C0416d.f7176a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
