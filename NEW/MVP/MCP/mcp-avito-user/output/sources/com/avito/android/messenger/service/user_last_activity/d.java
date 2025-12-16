package com.avito.android.messenger.service.user_last_activity;

import com.avito.android.persistence.messenger.d3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.UserLastActivity;

/* compiled from: UserLastActivitySyncAgent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/UserLastActivity;", "users", "Lcom/avito/android/persistence/messenger/d3;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f197325b;

    public d(b bVar) {
        this.f197325b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List<UserLastActivity> list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (UserLastActivity userLastActivity : list) {
            b bVar = this.f197325b;
            bVar.getClass();
            Long lastActionTime = userLastActivity.getLastActionTime();
            arrayList.add(new d3(userLastActivity.getUserId(), userLastActivity.getLastActionTime(), lastActionTime != null ? Long.valueOf(com.avito.android.server_time.i.a(bVar.f197306Y) - lastActionTime.longValue()) : null));
        }
        return arrayList;
    }
}
