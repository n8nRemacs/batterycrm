package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.k0;

/* compiled from: MessengerActionTimestampTracker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/k0;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lru/avito/messenger/k0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class A0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC28464o> f188309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0 f188310c;

    /* JADX WARN: Multi-variable type inference failed */
    public A0(List<? extends InterfaceC28464o> list, B0 b02) {
        this.f188309b = list;
        this.f188310c = b02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ru.avito.messenger.k0 k0Var = (ru.avito.messenger.k0) obj;
        if ((k0Var instanceof k0.b ? true : k0Var instanceof k0.c) || !(k0Var instanceof k0.a) || System.currentTimeMillis() - ((k0.a) k0Var).f431811a < 10000) {
            return;
        }
        List<InterfaceC28464o> list = this.f188309b;
        InterfaceC28373a interfaceC28373a = this.f188310c.f188314c;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            interfaceC28373a.c((InterfaceC28464o) it.next());
        }
    }
}
