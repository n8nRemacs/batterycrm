package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.mvi.sync.C31829d;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.persistence.messenger.C33126v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: Completables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31843k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f188494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31829d f188495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f188497e;

    public C31843k(List list, C31829d c31829d, MessengerUserHashInfo messengerUserHashInfo, Boolean bool) {
        this.f188494b = list;
        this.f188495c = c31829d;
        this.f188496d = messengerUserHashInfo;
        this.f188497e = bool;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.O oQ2;
        List<C31829d.a> list = this.f188494b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C31829d.a aVar : list) {
            List<Channel> list2 = aVar.f188451a;
            C33126v0 c33126v0 = aVar.f188452b;
            if (aVar.f188453c) {
                C31829d c31829d = this.f188495c;
                oQ2 = c31829d.f188433e.k(this.f188496d, list2.size() - 1, c33126v0.f215552a, c33126v0.f215553b, this.f188497e).s(c31829d.f188440l).n(new C31845l(c33126v0));
            } else {
                oQ2 = io.reactivex.rxjava3.core.I.q(new kotlin.Q(c33126v0, ChannelSyncAgent.c.b.f188322a));
            }
            arrayList.add(oQ2);
        }
        return io.reactivex.rxjava3.core.I.H(arrayList, C31841j.f188493b);
    }
}
