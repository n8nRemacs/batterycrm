package SU0;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkClient.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"LSU0/b;", "", "a", "b", "c", "LSU0/b$b;", "LSU0/b$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f14998a = a.f14999a;

    /* compiled from: NetworkClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f14999a = new a();

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Y61.k
        public static b a(@Y61.k String str) {
            switch (str.hashCode()) {
                case -1894885517:
                    if (str.equals("file/stream")) {
                        return c.a.C1018c.f15005c;
                    }
                    break;
                case -1485569826:
                    if (str.equals("application/x-www-form-urlencoded")) {
                        return c.AbstractC1019b.C1021c.f15009c;
                    }
                    break;
                case -655019664:
                    if (str.equals("multipart/form-data")) {
                        return AbstractC1015b.a.f15001c;
                    }
                    break;
                case -43840953:
                    if (str.equals("application/json")) {
                        return c.AbstractC1019b.a.f15007c;
                    }
                    break;
                case 817335912:
                    if (str.equals("text/plain")) {
                        return c.AbstractC1019b.C1020b.f15008c;
                    }
                    break;
                case 1265096647:
                    if (str.equals("file/byte-array")) {
                        return c.a.C1017b.f15004c;
                    }
                    break;
                case 1895867714:
                    if (str.equals("file/base64")) {
                        return c.a.C1016a.f15003c;
                    }
                    break;
            }
            throw new UnsupportedOperationException(str.concat(" is not supported yet"));
        }
    }

    /* compiled from: NetworkClient.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$b;", "LSU0/b;", "a", "LSU0/b$b$a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SU0.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1015b implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f15000b;

        /* compiled from: NetworkClient.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$b$a;", "LSU0/b$b;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: SU0.b$b$a */
        public static final class a extends AbstractC1015b {

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final a f15001c = new a();

            public a() {
                super("multipart/form-data", null);
            }
        }

        public AbstractC1015b(String str, C42822w c42822w) {
            this.f15000b = str;
        }

        @Override // SU0.b
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF15006b() {
            return this.f15000b;
        }
    }

    /* compiled from: NetworkClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSU0/b$c;", "LSU0/b;", "a", "b", "LSU0/b$c$a;", "LSU0/b$c$b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends b {

        /* compiled from: NetworkClient.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LSU0/b$c$a;", "LSU0/b$c;", "a", "b", "c", "LSU0/b$c$a$a;", "LSU0/b$c$a$b;", "LSU0/b$c$a$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f15002b;

            /* compiled from: NetworkClient.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$c$a$a;", "LSU0/b$c$a;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: SU0.b$c$a$a, reason: collision with other inner class name */
            public static final class C1016a extends a {

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public static final C1016a f15003c = new C1016a();

                public C1016a() {
                    super("file/base64", null);
                }
            }

            /* compiled from: NetworkClient.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$c$a$b;", "LSU0/b$c$a;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: SU0.b$c$a$b, reason: collision with other inner class name */
            public static final class C1017b extends a {

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public static final C1017b f15004c = new C1017b();

                public C1017b() {
                    super("file/byte-array", null);
                }
            }

            /* compiled from: NetworkClient.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$c$a$c;", "LSU0/b$c$a;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: SU0.b$c$a$c, reason: collision with other inner class name */
            public static final class C1018c extends a {

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public static final C1018c f15005c = new C1018c();

                public C1018c() {
                    super("file/stream", null);
                }
            }

            public a(String str, C42822w c42822w) {
                this.f15002b = str;
            }

            @Override // SU0.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF15006b() {
                return this.f15002b;
            }
        }

        /* compiled from: NetworkClient.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LSU0/b$c$b;", "LSU0/b$c;", "a", "b", "c", "LSU0/b$c$b$a;", "LSU0/b$c$b$b;", "LSU0/b$c$b$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: SU0.b$c$b, reason: collision with other inner class name */
        public static abstract class AbstractC1019b implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f15006b;

            /* compiled from: NetworkClient.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$c$b$a;", "LSU0/b$c$b;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: SU0.b$c$b$a */
            public static final class a extends AbstractC1019b {

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public static final a f15007c = new a();

                public a() {
                    super("application/json", null);
                }
            }

            /* compiled from: NetworkClient.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$c$b$b;", "LSU0/b$c$b;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: SU0.b$c$b$b, reason: collision with other inner class name */
            public static final class C1020b extends AbstractC1019b {

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public static final C1020b f15008c = new C1020b();

                public C1020b() {
                    super("text/plain", null);
                }
            }

            /* compiled from: NetworkClient.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/b$c$b$c;", "LSU0/b$c$b;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: SU0.b$c$b$c, reason: collision with other inner class name */
            public static final class C1021c extends AbstractC1019b {

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public static final C1021c f15009c = new C1021c();

                public C1021c() {
                    super("application/x-www-form-urlencoded", null);
                }
            }

            public AbstractC1019b(String str, C42822w c42822w) {
                this.f15006b = str;
            }

            @Override // SU0.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF15006b() {
                return this.f15006b;
            }
        }
    }

    @Y61.k
    /* renamed from: a */
    String getF15006b();
}
