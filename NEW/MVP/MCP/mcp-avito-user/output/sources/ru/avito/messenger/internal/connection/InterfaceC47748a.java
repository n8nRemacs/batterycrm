package ru.avito.messenger.internal.connection;

import kotlin.Metadata;

/* compiled from: MessengerForegroundStateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/a;", "", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.internal.connection.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47748a {

    /* compiled from: MessengerForegroundStateProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/a$a;", "Lru/avito/messenger/internal/connection/a;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.a$a, reason: collision with other inner class name */
    public static final class C12403a implements InterfaceC47748a {
        @Override // ru.avito.messenger.internal.connection.InterfaceC47748a
        @Y61.k
        public final io.reactivex.rxjava3.core.z<Boolean> a(boolean z12) {
            return z12 ? io.reactivex.rxjava3.core.z.c0(Boolean.FALSE) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }

        @Override // ru.avito.messenger.internal.connection.InterfaceC47748a
        public final boolean b() {
            return false;
        }
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<Boolean> a(boolean z12);

    boolean b();
}
