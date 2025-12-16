package Oo0;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbcClientMetricsLogger.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LOo0/b;", "", "a", "b", "c", "d", "e", "LOo0/b$a;", "LOo0/b$b;", "LOo0/b$c;", "LOo0/b$d;", "LOo0/b$e;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14721b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f12528a;

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/b$a;", "LOo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.b$a */
    public static final /* data */ class a extends AbstractC14721b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f12529b = new a();

        public a() {
            super("error.no_audience", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1832798733;
        }

        @Y61.k
        public final String toString() {
            return "NoAudience";
        }
    }

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/b$b;", "LOo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0807b extends AbstractC14721b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C0807b f12530b = new C0807b();

        public C0807b() {
            super("error.repeat_error", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0807b);
        }

        public final int hashCode() {
            return -1158106145;
        }

        @Y61.k
        public final String toString() {
            return "RepeatError";
        }
    }

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/b$c;", "LOo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.b$c */
    public static final /* data */ class c extends AbstractC14721b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f12531b = new c();

        public c() {
            super("success", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1566564427;
        }

        @Y61.k
        public final String toString() {
            return "Success";
        }
    }

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOo0/b$d;", "LOo0/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.b$d */
    public static final /* data */ class d extends AbstractC14721b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f12532b;

        public d(@Y61.k String str) {
            super("error.".concat(str), null);
            this.f12532b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12532b, ((d) obj).f12532b);
        }

        public final int hashCode() {
            return this.f12532b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UniversalError(errorType="), this.f12532b, ')');
        }
    }

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/b$e;", "LOo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.b$e */
    public static final /* data */ class e extends AbstractC14721b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final e f12533b = new e();

        public e() {
            super("error.vas_unknown_error", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 452133080;
        }

        @Y61.k
        public final String toString() {
            return "VasUnknownError";
        }
    }

    public AbstractC14721b(String str, C42822w c42822w) {
        this.f12528a = str;
    }
}
