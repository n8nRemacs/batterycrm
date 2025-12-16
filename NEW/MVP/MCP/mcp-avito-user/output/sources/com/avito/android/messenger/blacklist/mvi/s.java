package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BlacklistInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/BlockedUser;", "nextPageOfBlockedUsers", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "apply", "(Ljava/util/List;)Lcom/avito/android/messenger/blacklist/mvi/m$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31683m.a f186519b;

    public s(InterfaceC31683m.a aVar) {
        this.f186519b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        InterfaceC31683m.a.b.C5471b c5471b = InterfaceC31683m.a.b.C5471b.f186478a;
        InterfaceC31683m.a aVar = this.f186519b;
        return InterfaceC31683m.a.a(aVar, null, null, c5471b, C42745f0.h0(list, aVar.f186474d), list.size() == 10, null, 35);
    }
}
