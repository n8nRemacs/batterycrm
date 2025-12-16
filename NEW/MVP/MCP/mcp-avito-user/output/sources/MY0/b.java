package My0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.PeerConnectionFactory;

/* compiled from: StrCancellationSettingsScreenActionEvent.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LMy0/b;", "", "a", "b", "c", "d", "LMy0/b$a;", "LMy0/b$b;", "LMy0/b$c;", "LMy0/b$d;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f11134a;

    /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMy0/b$a;", "LMy0/b;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11135b;

        public a(@k String str) {
            super("duration-chips-".concat(str), null);
            this.f11135b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f11135b, ((a) obj).f11135b);
        }

        public final int hashCode() {
            return this.f11135b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Chips(chipId="), this.f11135b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMy0/b$b;", "LMy0/b;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: My0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0712b extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0712b f11136b = new C0712b();

        public C0712b() {
            super("refund-settings-close", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0712b);
        }

        public final int hashCode() {
            return 1564013299;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMy0/b$c;", "LMy0/b;", "a", "b", "LMy0/b$c$a;", "LMy0/b$c$b;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11137b;

        /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMy0/b$c$a;", "LMy0/b$c;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final a f11138c = new a();

            public a() {
                super("discount-toggle-disabled", null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1781902980;
            }

            @k
            public final String toString() {
                return "Disabled";
            }
        }

        /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMy0/b$c$b;", "LMy0/b$c;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: My0.b$c$b, reason: collision with other inner class name */
        public static final /* data */ class C0713b extends c {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final C0713b f11139c = new C0713b();

            public C0713b() {
                super("discount-toggle-enabled", null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0713b);
            }

            public final int hashCode() {
                return 1510773825;
            }

            @k
            public final String toString() {
                return PeerConnectionFactory.TRIAL_ENABLED;
            }
        }

        public c(String str, C42822w c42822w) {
            super(str, null);
            this.f11137b = str;
        }

        @Override // My0.b
        @k
        /* renamed from: a, reason: from getter */
        public final String getF11134a() {
            return this.f11137b;
        }
    }

    /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMy0/b$d;", "LMy0/b;", "a", "b", "LMy0/b$d$a;", "LMy0/b$d$b;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11140b;

        /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMy0/b$d$a;", "LMy0/b$d;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final a f11141c = new a();

            public a() {
                super("cancellation-toggle-disabled", null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -646272094;
            }

            @k
            public final String toString() {
                return "Disabled";
            }
        }

        /* compiled from: StrCancellationSettingsScreenActionEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMy0/b$d$b;", "LMy0/b$d;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: My0.b$d$b, reason: collision with other inner class name */
        public static final /* data */ class C0714b extends d {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final C0714b f11142c = new C0714b();

            public C0714b() {
                super("cancellation-toggle-enabled", null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0714b);
            }

            public final int hashCode() {
                return 1131765083;
            }

            @k
            public final String toString() {
                return PeerConnectionFactory.TRIAL_ENABLED;
            }
        }

        public d(String str, C42822w c42822w) {
            super(str, null);
            this.f11140b = str;
        }

        @Override // My0.b
        @k
        /* renamed from: a, reason: from getter */
        public final String getF11134a() {
            return this.f11140b;
        }
    }

    public b(String str, C42822w c42822w) {
        this.f11134a = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public String getF11134a() {
        return this.f11134a;
    }
}
