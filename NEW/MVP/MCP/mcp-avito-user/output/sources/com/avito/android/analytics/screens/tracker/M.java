package com.avito.android.analytics.screens.tracker;

import com.avito.android.InterfaceC32896n;
import com.avito.android.util.V2;
import java.util.ArrayList;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenTrackingLogger.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/M;", "", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32896n f90769a;

    /* compiled from: ScreenTrackingLogger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/M$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public M(@Y61.k InterfaceC32896n interfaceC32896n) {
        this.f90769a = interfaceC32896n;
    }

    public static String a(long j12) {
        long j13 = 1000;
        long j14 = j12 % j13;
        long j15 = (j12 - j14) / j13;
        if (j15 <= 0) {
            return j14 + "ms";
        }
        return j15 + "s " + j14 + "ms";
    }

    public static void b(@Y61.k String str, @Y61.k String str2, double d12, double d13, @Y61.k ArrayList arrayList) {
        if (str2.equals("scroll")) {
            V2 v22 = V2.f318762a;
            StringBuilder sbZ = androidx.appcompat.app.r.z(str, " scroll metrics, htr: ");
            sbZ.append((int) d12);
            sbZ.append(", jank frames: ");
            sbZ.append((int) d13);
            sbZ.append("%, lengths: ");
            sbZ.append(C42745f0.O(arrayList, null, "[", "]", N.f90770l, 25));
            v22.c("ScreenPerformance", sbZ.toString(), null);
        }
    }

    public final void c(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        if (this.f90769a.o().invoke().booleanValue()) {
            String strConcat = !str2.equals("screen") ? " ".concat(str2) : "";
            String strA = a(j12);
            V2.f318762a.c("ScreenPerformance", str + " SLA: screen_init_time -> " + str3 + strConcat + ": " + strA, null);
        }
    }

    public final void d(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        if (this.f90769a.o().invoke().booleanValue()) {
            String strConcat = !str2.equals("screen") ? " ".concat(str2) : "";
            String strA = a(j12);
            V2.f318762a.c("ScreenPerformance", str + " STEP: " + str3 + strConcat + ": " + strA, null);
        }
    }
}
