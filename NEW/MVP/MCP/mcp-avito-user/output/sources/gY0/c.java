package Gy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.analytics.screens.mvi.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarParametersState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"LGy0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "LGy0/c$b;", "LGy0/c$c;", "LGy0/c$d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f6845b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f6846c = d.f6849d;

    /* compiled from: StrCalendarParametersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/c$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrCalendarParametersState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/c$b;", "LGy0/c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f6847d;

        public b(@l ArrayList arrayList) {
            super(null);
            this.f6847d = arrayList;
            setPerfTrackerParams(new r("parameters_items:content", J.b.f90385a));
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6847d, ((b) obj).f6847d);
        }

        public final int hashCode() {
            ArrayList arrayList = this.f6847d;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Content(items="), this.f6847d, ')');
        }
    }

    /* compiled from: StrCalendarParametersState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/c$c;", "LGy0/c;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0387c extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C0387c f6848d;

        static {
            C0387c c0387c = new C0387c();
            f6848d = c0387c;
            c0387c.setPerfTrackerParams(new r("parameters_items:error", J.b.f90385a));
        }

        public C0387c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0387c);
        }

        public final int hashCode() {
            return 1252651897;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: StrCalendarParametersState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/c$d;", "LGy0/c;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final d f6849d;

        static {
            d dVar = new d();
            f6849d = dVar;
            dVar.setPerfTrackerParams(new r("parameters_items:loading", J.b.f90385a));
        }

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1271698835;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
