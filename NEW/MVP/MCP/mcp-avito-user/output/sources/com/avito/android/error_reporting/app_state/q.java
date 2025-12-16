package com.avito.android.error_reporting.app_state;

import androidx.compose.runtime.C22026a;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.J5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.m0;
import kotlin.text.C43047d;

/* compiled from: AppStateCollectorLogcat.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/error_reporting/app_state/q;", "Lcom/avito/android/error_reporting/app_state/a;", "Lcom/avito/android/util/J5;", "a", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q extends J5 implements InterfaceC30362a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147827c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147828d = C42727D.c(d.f147835l);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147829e = C42727D.c(c.f147834l);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147830f = C42727D.c(new b());

    /* compiled from: AppStateCollectorLogcat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/q$a;", "", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f147831a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f147832b;

        public a(long j12, @Y61.k String str) {
            this.f147831a = j12;
            this.f147832b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f147831a == aVar.f147831a && kotlin.jvm.internal.L.f(this.f147832b, aVar.f147832b);
        }

        public final int hashCode() {
            return this.f147832b.hashCode() + (Long.hashCode(this.f147831a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Log(time=");
            sb2.append(this.f147831a);
            sb2.append(", log=");
            return C22026a.c(sb2, this.f147832b, ')');
        }
    }

    /* compiled from: AppStateCollectorLogcat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Long> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Long invoke() {
            q.this.getClass();
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: AppStateCollectorLogcat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f147834l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(new Date().getYear());
        }
    }

    /* compiled from: AppStateCollectorLogcat.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<SimpleDateFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f147835l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        }
    }

    /* compiled from: AppStateCollectorLogcat.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/error_reporting/app_state/q$a;", "it", "", "invoke", "(Lcom/avito/android/error_reporting/app_state/q$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f147836l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j12) {
            super(1);
            this.f147836l = j12;
        }

        @Override // Y41.l
        public final Boolean invoke(a aVar) {
            return Boolean.valueOf(aVar.f147831a <= this.f147836l);
        }
    }

    @Inject
    public q(@Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a) {
        this.f147827c = interfaceC4322a;
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        ((Number) this.f147830f.getValue()).longValue();
    }

    public final void p() {
        BufferedReader bufferedReader;
        StringBuilder sb2;
        SimpleDateFormat simpleDateFormatQ;
        Process processExec;
        long jCurrentTimeMillis = System.currentTimeMillis() + 500;
        String str = q().format(Long.valueOf(System.currentTimeMillis())) + " ====== LOGCAT DUMP STARTED ======";
        InterfaceC30362a.InterfaceC4322a interfaceC4322a = this.f147827c;
        interfaceC4322a.log(str);
        Process process = null;
        try {
            processExec = Runtime.getRuntime().exec("logcat -v time -T 3000 -b main");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), C43047d.f410589b), 8192);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        try {
            m0.a aVar = new m0.a(new m0(C43033p.y(C43033p.l(kotlin.io.w.a(bufferedReader), r.f147837l), new s(this, ((Number) this.f147830f.getValue()).longValue())), new e(jCurrentTimeMillis)));
            while (aVar.hasNext()) {
                interfaceC4322a.log(((a) aVar.next()).f147832b);
            }
            try {
                int i12 = Z.f406624c;
                bufferedReader.close();
                G0 g02 = G0.f406611a;
            } catch (Throwable unused) {
                int i13 = Z.f406624c;
            }
            try {
                processExec.destroy();
                G0 g03 = G0.f406611a;
            } catch (Throwable unused2) {
                int i14 = Z.f406624c;
            }
            sb2 = new StringBuilder();
            simpleDateFormatQ = q();
        } catch (Throwable th4) {
            th = th4;
            process = processExec;
            try {
                interfaceC4322a.log(q().format(Long.valueOf(System.currentTimeMillis())) + " ====== LOGCAT DUMP ERROR " + th);
                try {
                    int i15 = Z.f406624c;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        G0 g04 = G0.f406611a;
                    }
                } catch (Throwable unused3) {
                    int i16 = Z.f406624c;
                }
                if (process != null) {
                    try {
                        process.destroy();
                        G0 g05 = G0.f406611a;
                    } catch (Throwable unused4) {
                        int i17 = Z.f406624c;
                    }
                }
                sb2 = new StringBuilder();
                simpleDateFormatQ = q();
                sb2.append(simpleDateFormatQ.format(Long.valueOf(System.currentTimeMillis())));
                sb2.append(" ====== LOGCAT DUMP FINISHED ======");
                interfaceC4322a.log(sb2.toString());
            } catch (Throwable th5) {
                try {
                    int i18 = Z.f406624c;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        G0 g06 = G0.f406611a;
                    }
                } catch (Throwable unused5) {
                    int i19 = Z.f406624c;
                }
                if (process != null) {
                    try {
                        process.destroy();
                        G0 g07 = G0.f406611a;
                    } catch (Throwable unused6) {
                        int i22 = Z.f406624c;
                    }
                }
                interfaceC4322a.log(q().format(Long.valueOf(System.currentTimeMillis())) + " ====== LOGCAT DUMP FINISHED ======");
                throw th5;
            }
        }
        sb2.append(simpleDateFormatQ.format(Long.valueOf(System.currentTimeMillis())));
        sb2.append(" ====== LOGCAT DUMP FINISHED ======");
        interfaceC4322a.log(sb2.toString());
    }

    public final SimpleDateFormat q() {
        return (SimpleDateFormat) this.f147828d.getValue();
    }
}
