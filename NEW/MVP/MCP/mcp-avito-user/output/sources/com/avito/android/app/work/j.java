package com.avito.android.app.work;

import androidx.work.F;
import com.avito.android.app.task.P0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.completable.T;
import kotlin.Metadata;
import l41.o;

/* compiled from: SendPendingMessagesWorker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "shouldRun", "Lio/reactivex/rxjava3/core/O;", "Landroidx/work/F$a;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SendPendingMessagesWorker f91762b;

    public j(SendPendingMessagesWorker sendPendingMessagesWorker) {
        this.f91762b = sendPendingMessagesWorker;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return I.q(new F.a.c());
        }
        SendPendingMessagesWorker sendPendingMessagesWorker = this.f91762b;
        h31.e<P0> eVar = sendPendingMessagesWorker.f91754e;
        if (eVar == null) {
            eVar = null;
        }
        P0 p02 = eVar.get();
        InterfaceC35745a5 interfaceC35745a5 = sendPendingMessagesWorker.f91752c;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        return new T(p02.a(interfaceC35745a5.a()), new i(), null);
    }
}
