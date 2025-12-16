package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import ru.avito.messenger.internal.connection.C47754g.e;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lru/avito/websocket/u$c;", "", "<name for destructuring parameter 0>", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "apply", "(Lkotlin/Q;)Lru/avito/messenger/internal/state_machine/g$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class E<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f431247c;

    public E(C47754g c47754g, String str) {
        this.f431246b = c47754g;
        this.f431247c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f431246b.new e(this.f431247c, ((Boolean) ((kotlin.Q) obj).f406620c).booleanValue(), false);
    }
}
