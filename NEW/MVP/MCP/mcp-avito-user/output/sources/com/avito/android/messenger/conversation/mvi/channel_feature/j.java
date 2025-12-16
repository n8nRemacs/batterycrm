package com.avito.android.messenger.conversation.mvi.channel_feature;

import MY.d;
import MY.e;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/j;", "Lcom/avito/android/arch/mvi/t;", "LMY/d;", "LMY/e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<MY.d, MY.e> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final MY.e b(MY.d dVar) {
        MY.d dVar2 = dVar;
        if (dVar2 instanceof d.l) {
            return new e.k(((d.l) dVar2).f10735a);
        }
        if (dVar2 instanceof d.b) {
            return new e.d(((d.b) dVar2).f10725a);
        }
        if (dVar2 instanceof d.c) {
            return new e.C0683e(((d.c) dVar2).f10726a);
        }
        if (dVar2.equals(d.m.f10736a)) {
            return e.l.f10749a;
        }
        if (dVar2 instanceof d.e) {
            return new e.c(((d.e) dVar2).f10728a);
        }
        if (dVar2 instanceof d.g) {
            return new e.f(((d.g) dVar2).f10730a);
        }
        if (dVar2 instanceof d.C0682d) {
            return new e.b(((d.C0682d) dVar2).f10727a);
        }
        if (dVar2 instanceof d.j) {
            return new e.i(((d.j) dVar2).f10733a);
        }
        if (dVar2 instanceof d.n) {
            return new e.m(((d.n) dVar2).f10737a);
        }
        if (dVar2 instanceof d.h) {
            return new e.g(((d.h) dVar2).f10731a);
        }
        if (dVar2 instanceof d.a) {
            return new e.a(((d.a) dVar2).f10724a);
        }
        if (dVar2.equals(d.i.f10732a)) {
            return e.h.f10745a;
        }
        if (dVar2 instanceof d.k) {
            return new e.j(((d.k) dVar2).f10734a);
        }
        if (dVar2 instanceof d.f) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
