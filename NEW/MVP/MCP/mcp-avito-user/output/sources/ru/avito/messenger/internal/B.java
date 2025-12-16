package ru.avito.messenger.internal;

import kotlin.Metadata;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", "it", "Lorg/funktionale/option/a;", "Lk91/j;", "apply", "(Lru/avito/messenger/internal/connection/d$b;)Lorg/funktionale/option/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class B<T, R> implements l41.o {
    static {
        new B();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC47751d.b bVar = (InterfaceC47751d.b) obj;
        InterfaceC47751d.b.a aVar = bVar instanceof InterfaceC47751d.b.a ? (InterfaceC47751d.b.a) bVar : null;
        return org.funktionale.option.e.a(aVar != null ? aVar.f431289a : null);
    }
}
