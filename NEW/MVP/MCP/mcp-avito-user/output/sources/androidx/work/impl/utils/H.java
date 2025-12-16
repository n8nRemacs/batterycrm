package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.impl.C23588s;
import androidx.work.impl.C23613x;
import androidx.work.impl.l0;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: StopWorkRunnable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/utils/H;", "Ljava/lang/Runnable;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C23588s f55943b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C23613x f55944c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f55945d;

    /* renamed from: e, reason: collision with root package name */
    public final int f55946e;

    public H(@Y61.k C23588s c23588s, @Y61.k C23613x c23613x, boolean z12, int i12) {
        this.f55943b = c23588s;
        this.f55944c = c23613x;
        this.f55945d = z12;
        this.f55946e = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0 l0VarB;
        if (this.f55945d) {
            C23588s c23588s = this.f55943b;
            C23613x c23613x = this.f55944c;
            int i12 = this.f55946e;
            c23588s.getClass();
            String str = c23613x.f56084a.f55889a;
            synchronized (c23588s.f55931k) {
                l0VarB = c23588s.b(str);
            }
            C23588s.d(str, l0VarB, i12);
        } else {
            C23588s c23588s2 = this.f55943b;
            C23613x c23613x2 = this.f55944c;
            int i13 = this.f55946e;
            c23588s2.getClass();
            String str2 = c23613x2.f56084a.f55889a;
            synchronized (c23588s2.f55931k) {
                try {
                    if (c23588s2.f55926f.get(str2) != null) {
                        androidx.work.G gA2 = androidx.work.G.a();
                        int i14 = C23588s.f55920l;
                        gA2.getClass();
                    } else {
                        Set set = (Set) c23588s2.f55928h.get(str2);
                        if (set != null && set.contains(c23613x2)) {
                            C23588s.d(str2, c23588s2.b(str2), i13);
                        }
                    }
                } finally {
                }
            }
        }
        androidx.work.G gA3 = androidx.work.G.a();
        androidx.work.G.b("StopWorkRunnable");
        String str3 = this.f55944c.f56084a.f55889a;
        gA3.getClass();
    }
}
