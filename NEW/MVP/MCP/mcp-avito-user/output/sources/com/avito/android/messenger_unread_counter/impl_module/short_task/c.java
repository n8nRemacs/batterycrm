package com.avito.android.messenger_unread_counter.impl_module.short_task;

import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import l41.o;
import pZ.C47037b;

/* compiled from: UpdateUnreadMessagesCounterShortTask.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isAuthorized", "Lio/reactivex/rxjava3/core/O;", "LpZ/b;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197738b;

    public c(a aVar) {
        this.f197738b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            a aVar = this.f197738b;
            if (aVar.f197736f.e()) {
                return aVar.f197731a.getChatCounters().r(b.f197737b);
            }
        }
        return I.q(new C47037b(0));
    }
}
