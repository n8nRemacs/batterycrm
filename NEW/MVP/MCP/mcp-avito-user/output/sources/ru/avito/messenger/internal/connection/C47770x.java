package ru.avito.messenger.internal.connection;

import k91.AbstractC42547e;
import kotlin.Metadata;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk91/e;", "message", "Lru/avito/messenger/internal/connection/d$a;", "apply", "(Lk91/e;)Lru/avito/messenger/internal/connection/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47770x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C47770x<T, R> f431385b = new C47770x<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC42547e abstractC42547e = (AbstractC42547e) obj;
        if (!(abstractC42547e instanceof AbstractC42547e.r)) {
            return new InterfaceC47751d.a(null, abstractC42547e.sequenceId);
        }
        AbstractC42547e.r rVar = (AbstractC42547e.r) abstractC42547e;
        String userId = rVar.getValue().getUserId();
        String sequenceId = rVar.getValue().getSequenceId();
        if (sequenceId == null) {
            sequenceId = abstractC42547e.sequenceId;
        }
        return new InterfaceC47751d.a(userId, sequenceId);
    }
}
