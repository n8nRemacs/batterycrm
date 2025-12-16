package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import ru.avito.messenger.internal.connection.C47754g;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/internal/connection/d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47752e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g.a f431301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47751d.b f431302c;

    public C47752e(C47754g.a aVar, InterfaceC47751d.b bVar) {
        this.f431301b = aVar;
        this.f431302c = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.g
    public final void accept(Object obj) {
        C47754g.a aVar = this.f431301b;
        if (aVar.f431327a && this.f431302c.getF431297a()) {
            aVar.f431328b.invoke(Boolean.FALSE);
        }
    }
}
