package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.l0;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/b;", "", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.internal.connection.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final /* data */ class C47749b {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f431275e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C47749b f431276f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f431277a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f431278b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.l0 f431279c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f431280d;

    /* compiled from: MessengerConnectionHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/b$a;", "", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ru.avito.messenger.l0.f431814O2.getClass();
        f431276f = new C47749b(false, "", l0.a.f431816b, false);
    }

    public C47749b(boolean z12, @Y61.k String str, @Y61.k ru.avito.messenger.l0 l0Var, boolean z13) {
        this.f431277a = z12;
        this.f431278b = str;
        this.f431279c = l0Var;
        this.f431280d = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47749b)) {
            return false;
        }
        C47749b c47749b = (C47749b) obj;
        return this.f431277a == c47749b.f431277a && kotlin.jvm.internal.L.f(this.f431278b, c47749b.f431278b) && kotlin.jvm.internal.L.f(this.f431279c, c47749b.f431279c) && this.f431280d == c47749b.f431280d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f431280d) + ((this.f431279c.hashCode() + androidx.compose.foundation.H.d(Boolean.hashCode(this.f431277a) * 31, 31, this.f431278b)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConnectCondition(isNetworkAvailable=");
        sb2.append(this.f431277a);
        sb2.append(", session=");
        sb2.append(this.f431278b);
        sb2.append(", connectionParams=");
        sb2.append(this.f431279c);
        sb2.append(", shouldKeepConnection=");
        return androidx.appcompat.app.r.x(sb2, this.f431280d, ')');
    }
}
