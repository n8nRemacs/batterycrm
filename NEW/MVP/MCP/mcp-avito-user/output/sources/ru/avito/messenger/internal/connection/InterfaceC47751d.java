package ru.avito.messenger.internal.connection;

import androidx.compose.runtime.C22026a;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import k91.AbstractC42548f;
import k91.C42552j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/d;", "", "a", "b", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.internal.connection.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47751d {

    /* compiled from: MessengerConnectionHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/d$a;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.d$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f431287a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f431288b;

        public a(@Y61.l String str, @Y61.l String str2) {
            this.f431287a = str;
            this.f431288b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f431287a, aVar.f431287a) && kotlin.jvm.internal.L.f(this.f431288b, aVar.f431288b);
        }

        public final int hashCode() {
            String str = this.f431287a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f431288b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SequenceInfo(userId=");
            sb2.append(this.f431287a);
            sb2.append(", sequenceId=");
            return C22026a.c(sb2, this.f431288b, ')');
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", "", "<init>", "()V", "a", "b", "c", "Lru/avito/messenger/internal/connection/d$b$a;", "Lru/avito/messenger/internal/connection/d$b$b;", "Lru/avito/messenger/internal/connection/d$b$c;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.connection.d$b */
    public static abstract class b {

        /* compiled from: MessengerConnectionHolder.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/internal/connection/d$b$b;", "Lru/avito/messenger/internal/connection/d$b;", "<init>", "()V", "a", "b", "Lru/avito/messenger/internal/connection/d$b$b$a;", "Lru/avito/messenger/internal/connection/d$b$b$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.avito.messenger.internal.connection.d$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC12404b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f431294a;

            /* compiled from: MessengerConnectionHolder.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/d$b$b$a;", "Lru/avito/messenger/internal/connection/d$b$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ru.avito.messenger.internal.connection.d$b$b$a */
            public static final /* data */ class a extends AbstractC12404b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final String f431295b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Override // ru.avito.messenger.internal.connection.InterfaceC47751d.b
                @Y61.l
                /* renamed from: a, reason: from getter */
                public final String getF431299c() {
                    return this.f431295b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f431295b, ((a) obj).f431295b);
                }

                public final int hashCode() {
                    String str = this.f431295b;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Session(sequenceId="), this.f431295b, ')');
                }

                public a(@Y61.l String str) {
                    super(null);
                    this.f431295b = str;
                }

                public /* synthetic */ a(String str, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str);
                }
            }

            /* compiled from: MessengerConnectionHolder.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/d$b$b$b;", "Lru/avito/messenger/internal/connection/d$b$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ru.avito.messenger.internal.connection.d$b$b$b, reason: collision with other inner class name */
            public static final /* data */ class C12405b extends AbstractC12404b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final String f431296b;

                /* JADX WARN: Multi-variable type inference failed */
                public C12405b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Override // ru.avito.messenger.internal.connection.InterfaceC47751d.b
                @Y61.l
                /* renamed from: a, reason: from getter */
                public final String getF431299c() {
                    return this.f431296b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C12405b) && kotlin.jvm.internal.L.f(this.f431296b, ((C12405b) obj).f431296b);
                }

                public final int hashCode() {
                    String str = this.f431296b;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Socket(sequenceId="), this.f431296b, ')');
                }

                public C12405b(@Y61.l String str) {
                    super(null);
                    this.f431296b = str;
                }

                public /* synthetic */ C12405b(String str, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str);
                }
            }

            public /* synthetic */ AbstractC12404b(C42822w c42822w) {
                this();
            }

            @Override // ru.avito.messenger.internal.connection.InterfaceC47751d.b
            /* renamed from: b, reason: from getter */
            public final boolean getF431297a() {
                return this.f431294a;
            }

            public AbstractC12404b() {
                super(null);
                this.f431294a = true;
            }
        }

        /* compiled from: MessengerConnectionHolder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/d$b$c;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.avito.messenger.internal.connection.d$b$c */
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f431297a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final AbstractC42548f f431298b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f431299c;

            public /* synthetic */ c(boolean z12, AbstractC42548f abstractC42548f, String str, int i12, C42822w c42822w) {
                this(z12, (i12 & 2) != 0 ? null : abstractC42548f, (i12 & 4) != 0 ? null : str);
            }

            @Override // ru.avito.messenger.internal.connection.InterfaceC47751d.b
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final String getF431299c() {
                return this.f431299c;
            }

            @Override // ru.avito.messenger.internal.connection.InterfaceC47751d.b
            /* renamed from: b, reason: from getter */
            public final boolean getF431297a() {
                return this.f431297a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f431297a == cVar.f431297a && kotlin.jvm.internal.L.f(this.f431298b, cVar.f431298b) && kotlin.jvm.internal.L.f(this.f431299c, cVar.f431299c);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f431297a) * 31;
                AbstractC42548f abstractC42548f = this.f431298b;
                int iHashCode2 = (iHashCode + (abstractC42548f == null ? 0 : abstractC42548f.hashCode())) * 31;
                String str = this.f431299c;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Disconnected(isAwaitingConnection=");
                sb2.append(this.f431297a);
                sb2.append(", terminationEvent=");
                sb2.append(this.f431298b);
                sb2.append(", sequenceId=");
                return C22026a.c(sb2, this.f431299c, ')');
            }

            public c(boolean z12, @Y61.l AbstractC42548f abstractC42548f, @Y61.l String str) {
                super(null);
                this.f431297a = z12;
                this.f431298b = abstractC42548f;
                this.f431299c = str;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.l
        /* renamed from: a */
        public abstract String getF431299c();

        /* renamed from: b */
        public abstract boolean getF431297a();

        public b() {
        }

        /* compiled from: MessengerConnectionHolder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/d$b$a;", "Lru/avito/messenger/internal/connection/d$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.avito.messenger.internal.connection.d$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C42552j f431289a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f431290b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final ru.avito.websocket.y f431291c;

            /* renamed from: d, reason: collision with root package name */
            public final long f431292d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f431293e;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C42552j c42552j, boolean z12, ru.avito.websocket.y yVar, long j12, String str, int i12, C42822w c42822w) {
                boolean z13 = (i12 & 2) != 0 ? false : z12;
                if ((i12 & 4) != 0) {
                    ru.avito.websocket.y.f431963c.getClass();
                    yVar = ru.avito.websocket.y.f431964d;
                }
                this(c42552j, z13, yVar, (i12 & 8) != 0 ? System.currentTimeMillis() : j12, (i12 & 16) != 0 ? c42552j.getSequenceId() : str);
            }

            public static a c(a aVar, C42552j c42552j, boolean z12, String str, int i12) {
                if ((i12 & 1) != 0) {
                    c42552j = aVar.f431289a;
                }
                C42552j c42552j2 = c42552j;
                if ((i12 & 2) != 0) {
                    z12 = aVar.f431290b;
                }
                ru.avito.websocket.y yVar = aVar.f431291c;
                long j12 = aVar.f431292d;
                aVar.getClass();
                return new a(c42552j2, z12, yVar, j12, str);
            }

            @Override // ru.avito.messenger.internal.connection.InterfaceC47751d.b
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final String getF431299c() {
                return this.f431293e;
            }

            @Override // ru.avito.messenger.internal.connection.InterfaceC47751d.b
            /* renamed from: b */
            public final boolean getF431297a() {
                return false;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f431289a, aVar.f431289a) && this.f431290b == aVar.f431290b && kotlin.jvm.internal.L.f(this.f431291c, aVar.f431291c) && this.f431292d == aVar.f431292d && kotlin.jvm.internal.L.f(this.f431293e, aVar.f431293e);
            }

            public final int hashCode() {
                int iG2 = androidx.appcompat.app.r.g((this.f431291c.hashCode() + androidx.appcompat.app.r.i(this.f431289a.hashCode() * 31, 31, this.f431290b)) * 31, 31, this.f431292d);
                String str = this.f431293e;
                return iG2 + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Connected(session=");
                sb2.append(this.f431289a);
                sb2.append(", recovered=");
                sb2.append(this.f431290b);
                sb2.append(", socketConnectionInfo=");
                sb2.append(this.f431291c);
                sb2.append(", connectedTimestamp=");
                sb2.append(this.f431292d);
                sb2.append(", sequenceId=");
                return C22026a.c(sb2, this.f431293e, ')');
            }

            public a(@Y61.k C42552j c42552j, boolean z12, @Y61.k ru.avito.websocket.y yVar, long j12, @Y61.l String str) {
                super(null);
                this.f431289a = c42552j;
                this.f431290b = z12;
                this.f431291c = yVar;
                this.f431292d = j12;
                this.f431293e = str;
            }
        }
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<b> M0();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.O a();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.O b();

    @Y61.k
    T0 c();

    void connect();
}
