package com.avito.android.error_reporting.non_fatal;

import Ez.C13546a;
import X41.j;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.error_reporting.error_reporter.u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: NonFatalErrorEvent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent;", "Lcom/avito/android/error_reporting/error_reporter/u;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NonFatalErrorEvent extends Exception implements u {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f147926b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f147927c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f147928d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f147929e;

    /* compiled from: NonFatalErrorEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$a;", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$b;", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$c;", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$d;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: NonFatalErrorEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$a;", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a;", "<init>", "()V", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent$a$a, reason: collision with other inner class name */
        public static final class C4323a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C4323a f147930a = new C4323a();

            public C4323a() {
                super(null);
            }
        }

        /* compiled from: NonFatalErrorEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$b;", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Class<?> f147931a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f147932b;

            /* renamed from: c, reason: collision with root package name */
            public final int f147933c;

            public b() {
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Class cls, String str, int i12, int i13, C42822w c42822w) {
                super(null);
                i12 = (i13 & 4) != 0 ? 0 : i12;
                this.f147931a = cls;
                this.f147932b = str;
                this.f147933c = i12;
            }
        }

        /* compiled from: NonFatalErrorEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$c;", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a;", "<init>", "()V", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f147934a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: NonFatalErrorEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a$d;", "Lcom/avito/android/error_reporting/non_fatal/NonFatalErrorEvent$a;", "<init>", "()V", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {
            static {
                new d();
            }

            public d() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ NonFatalErrorEvent(String str, Throwable th2, Map map, a aVar, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : th2, (i12 & 4) != 0 ? P0.c() : map, (i12 & 8) != 0 ? a.c.f147934a : aVar);
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f147927c;
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f147926b;
    }

    @Override // com.avito.android.error_reporting.error_reporter.u
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF147929e() {
        return this.f147929e;
    }

    @j
    public NonFatalErrorEvent(@k String str, @l Throwable th2, @k Map<String, ? extends Object> map, @k a aVar) {
        super(str, th2);
        this.f147926b = str;
        this.f147927c = th2;
        this.f147928d = map;
        if (aVar instanceof a.c) {
            C13546a.f4465a.getClass();
            C13546a.b(this);
        } else if (aVar instanceof a.C4323a) {
            C13546a c13546a = C13546a.f4465a;
            if (th2 != null) {
                c13546a.getClass();
                C13546a.b(th2);
            }
        } else if (aVar instanceof a.b) {
            C13546a c13546a2 = C13546a.f4465a;
            a.b bVar = (a.b) aVar;
            String name = bVar.f147931a.getName();
            c13546a2.getClass();
            Throwable thA = C13546a.a(this);
            if (thA != null) {
                thA.setStackTrace((StackTraceElement[]) C42756l.X(new StackTraceElement[]{new StackTraceElement(name, bVar.f147932b, name, bVar.f147933c)}, getStackTrace()));
            }
        } else {
            boolean z12 = aVar instanceof a.d;
        }
        this.f147929e = H.o(new StringBuilder(), th2 != null ? th2.getClass().getSimpleName() : null, ':', str);
    }
}
