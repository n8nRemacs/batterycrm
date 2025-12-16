package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import io.reactivex.rxjava3.core.I;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import ru.avito.messenger.api.entity.FoldersCountersResponse;

/* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isAuthorized", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/FoldersCountersResponse;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197784b;

    public j(h hVar) {
        this.f197784b = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            h hVar = this.f197784b;
            if (hVar.f197763k.e()) {
                return hVar.f197759g.B(Collections.singletonMap("unreadChats", C42784z0.f406748b), Boolean.TRUE).r(i.f197783b);
            }
        }
        return I.q(new FoldersCountersResponse(P0.c(), null));
    }
}
