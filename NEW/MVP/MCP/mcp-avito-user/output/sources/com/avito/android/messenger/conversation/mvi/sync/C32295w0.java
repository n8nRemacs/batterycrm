package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChannelUser;

/* compiled from: MissingUsersSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/ChannelUser;", "receivedMissedUsers", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.w0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32295w0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32293v0.d f194872c;

    public C32295w0(C32293v0 c32293v0, C32293v0.d dVar) {
        this.f194871b = c32293v0;
        this.f194872c = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        V2 v22 = V2.f318762a;
        int i12 = C32293v0.f194852a0;
        C32293v0 c32293v0 = this.f194871b;
        v22.c(c32293v0.f207131E, "users received = " + list, null);
        C32293v0.d dVar = this.f194872c;
        MessengerUserHashInfo messengerUserHashInfo = dVar.f194862d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(c32293v0.f194854W.b((ChannelUser) it.next()));
        }
        return c32293v0.f194855X.a(messengerUserHashInfo, dVar.f194863e, arrayList);
    }
}
