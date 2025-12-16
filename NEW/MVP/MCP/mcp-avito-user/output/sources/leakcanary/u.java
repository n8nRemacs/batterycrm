package leakcanary;

import android.util.Log;
import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;
import shark.j3;

/* compiled from: LogcatSharkLog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lleakcanary/u;", "Lshark/j3$a;", "<init>", "()V", "a", "leakcanary-android-utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class u implements j3.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f414121a = new a(null);

    /* compiled from: LogcatSharkLog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/u$a;", "", "<init>", "()V", "leakcanary-android-utils_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public final void a(@Y61.k String str) {
        if (str.length() < 4000) {
            return;
        }
        for (String str2 : C43033p.D(C43066x.Q(str))) {
        }
    }

    public final void b(@Y61.k String str, @Y61.k Throwable th2) {
        StringBuilder sbB = C22491k0.b(str, '\n');
        sbB.append(Log.getStackTraceString(th2));
        a(sbB.toString());
    }
}
