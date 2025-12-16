package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import ru.avito.messenger.internal.connection.C47754g;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/internal/connection/d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47753f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g.a f431304b;

    public C47753f(C47754g.a aVar) {
        this.f431304b = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // l41.g
    public final void accept(Object obj) {
        C47754g.a aVar = this.f431304b;
        if (!aVar.f431327a) {
            aVar.f431329c.invoke();
        } else if (aVar.f431330d) {
            aVar.f431328b.invoke(Boolean.TRUE);
        }
    }
}
