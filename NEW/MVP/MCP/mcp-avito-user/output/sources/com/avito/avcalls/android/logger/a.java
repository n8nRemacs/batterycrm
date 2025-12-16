package com.avito.avcalls.android.logger;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsLogMessage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/logger/a;", "", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f331732a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC10309a f331733b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f331734c;

    /* compiled from: AvCallsLogMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/avcalls/android/logger/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/avcalls/android/logger/a$a$a;", "Lcom/avito/avcalls/android/logger/a$a$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.logger.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC10309a {

        /* compiled from: AvCallsLogMessage.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/logger/a$a$a;", "Lcom/avito/avcalls/android/logger/a$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.avcalls.android.logger.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10310a extends AbstractC10309a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AvCallsLoggingConfiguration.RtcSeverity f331735a;

            public C10310a(@k AvCallsLoggingConfiguration.RtcSeverity rtcSeverity) {
                super(null);
                this.f331735a = rtcSeverity;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10310a) && this.f331735a == ((C10310a) obj).f331735a;
            }

            public final int hashCode() {
                return this.f331735a.hashCode();
            }

            @k
            public final String toString() {
                return "Rtc(severity=" + this.f331735a + ')';
            }
        }

        /* compiled from: AvCallsLogMessage.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/logger/a$a$b;", "Lcom/avito/avcalls/android/logger/a$a;", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.avcalls.android.logger.a$a$b */
        public static final /* data */ class b extends AbstractC10309a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AbstractC10311a f331736a;

            /* compiled from: AvCallsLogMessage.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/avcalls/android/logger/a$a$b$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/avcalls/android/logger/a$a$b$a$a;", "Lcom/avito/avcalls/android/logger/a$a$b$a$b;", "Lcom/avito/avcalls/android/logger/a$a$b$a$c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.avcalls.android.logger.a$a$b$a, reason: collision with other inner class name */
            public static abstract class AbstractC10311a {

                /* compiled from: AvCallsLogMessage.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/logger/a$a$b$a$a;", "Lcom/avito/avcalls/android/logger/a$a$b$a;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.avcalls.android.logger.a$a$b$a$a, reason: collision with other inner class name */
                public static final class C10312a extends AbstractC10311a {

                    /* renamed from: a, reason: collision with root package name */
                    @k
                    public static final C10312a f331737a = new C10312a();

                    public C10312a() {
                        super(null);
                    }
                }

                /* compiled from: AvCallsLogMessage.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/logger/a$a$b$a$b;", "Lcom/avito/avcalls/android/logger/a$a$b$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.avcalls.android.logger.a$a$b$a$b, reason: collision with other inner class name */
                public static final /* data */ class C10313b extends AbstractC10311a {

                    /* renamed from: a, reason: collision with root package name */
                    @l
                    public final Exception f331738a;

                    public C10313b(@l Exception exc) {
                        super(null);
                        this.f331738a = exc;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C10313b) && L.f(this.f331738a, ((C10313b) obj).f331738a);
                    }

                    public final int hashCode() {
                        Exception exc = this.f331738a;
                        if (exc == null) {
                            return 0;
                        }
                        return exc.hashCode();
                    }

                    @k
                    public final String toString() {
                        return "Error(throwable=" + this.f331738a + ')';
                    }
                }

                /* compiled from: AvCallsLogMessage.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/logger/a$a$b$a$c;", "Lcom/avito/avcalls/android/logger/a$a$b$a;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.avcalls.android.logger.a$a$b$a$c */
                public static final class c extends AbstractC10311a {

                    /* renamed from: a, reason: collision with root package name */
                    @k
                    public static final c f331739a = new c();

                    public c() {
                        super(null);
                    }
                }

                public /* synthetic */ AbstractC10311a(C42822w c42822w) {
                    this();
                }

                public AbstractC10311a() {
                }
            }

            public b(@k AbstractC10311a abstractC10311a) {
                super(null);
                this.f331736a = abstractC10311a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f331736a, ((b) obj).f331736a);
            }

            public final int hashCode() {
                return this.f331736a.hashCode();
            }

            @k
            public final String toString() {
                return "Sdk(level=" + this.f331736a + ')';
            }
        }

        public /* synthetic */ AbstractC10309a(C42822w c42822w) {
            this();
        }

        public AbstractC10309a() {
        }
    }

    public a(@k String str, @k AbstractC10309a abstractC10309a, @k String str2) {
        this.f331732a = str;
        this.f331733b = abstractC10309a;
        this.f331734c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f331732a, aVar.f331732a) && L.f(this.f331733b, aVar.f331733b) && L.f(this.f331734c, aVar.f331734c);
    }

    public final int hashCode() {
        return this.f331734c.hashCode() + ((this.f331733b.hashCode() + (this.f331732a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvCallsLogMessage(tag=");
        sb2.append(this.f331732a);
        sb2.append(", kind=");
        sb2.append(this.f331733b);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f331734c, ')');
    }
}
