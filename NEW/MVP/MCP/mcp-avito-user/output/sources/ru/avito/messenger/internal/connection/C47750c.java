package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.internal.connection.C47749b;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/c;", "", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.internal.connection.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final /* data */ class C47750c {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f431282c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C47750c f431283d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C47749b f431284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C47749b f431285b;

    /* compiled from: MessengerConnectionHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/c$a;", "", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C47749b.a aVar = C47749b.f431275e;
        aVar.getClass();
        C47749b c47749b = C47749b.f431276f;
        aVar.getClass();
        f431283d = new C47750c(c47749b, c47749b);
    }

    public C47750c(@Y61.k C47749b c47749b, @Y61.k C47749b c47749b2) {
        this.f431284a = c47749b;
        this.f431285b = c47749b2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47750c)) {
            return false;
        }
        C47750c c47750c = (C47750c) obj;
        return kotlin.jvm.internal.L.f(this.f431284a, c47750c.f431284a) && kotlin.jvm.internal.L.f(this.f431285b, c47750c.f431285b);
    }

    public final int hashCode() {
        return (this.f431284a.hashCode() * 31) + this.f431285b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ConnectConditionStates(prevCondition=" + this.f431284a + ", newCondition=" + this.f431285b + ')';
    }
}
