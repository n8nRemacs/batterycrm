package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: BlacklistInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/BlockedUser;", "blockedUsers", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "apply", "(Ljava/util/List;)Lcom/avito/android/messenger/blacklist/mvi/m$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31683m.a f186520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f186521c;

    public t(InterfaceC31683m.a aVar, int i12) {
        this.f186520b = aVar;
        this.f186521c = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        InterfaceC31683m.a.b.C5471b c5471b = InterfaceC31683m.a.b.C5471b.f186478a;
        boolean z12 = list.size() == this.f186521c;
        Map mapC = P0.c();
        this.f186520b.getClass();
        return new InterfaceC31683m.a(c5471b, c5471b, c5471b, list, z12, mapC);
    }
}
