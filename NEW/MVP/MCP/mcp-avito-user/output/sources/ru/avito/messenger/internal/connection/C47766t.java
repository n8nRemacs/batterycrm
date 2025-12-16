package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.C47754g;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lru/avito/messenger/internal/connection/g$f;", "apply", "(Ljava/lang/Long;)Lru/avito/messenger/internal/connection/g$f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47766t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47751d.b f431378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47754g f431379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C47749b f431380d;

    public C47766t(InterfaceC47751d.b bVar, C47754g c47754g, C47749b c47749b) {
        this.f431378b = bVar;
        this.f431379c = c47754g;
        this.f431380d = c47749b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C47754g.f(this.f431378b, new C47765s(this.f431379c, this.f431380d));
    }
}
