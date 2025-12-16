package RU0;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.ui.platform.C22491k0;
import kotlin.C42833p;
import kotlin.Metadata;

/* compiled from: StdoutLogger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRU0/d;", "LRU0/c;", "<init>", "()V", "logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f14472a = new d();

    @Override // RU0.c
    public final void b(@k String str, @k String str2) {
        System.out.println((Object) r.r(str, "-i: ", str2));
    }

    @Override // RU0.c
    public final void d(@k String str, @k String str2) {
        System.out.println((Object) r.r(str, "-d: ", str2));
    }

    @Override // RU0.c
    public final void e(@k String str, @k String str2) {
        System.out.println((Object) r.r(str, "-w: ", str2));
    }

    @Override // RU0.c
    public final void f(@k String str, @k String str2) {
        System.out.println((Object) r.r(str, "-v: ", str2));
    }

    @Override // RU0.c
    public final void e(@k String str, @k String str2, @k Throwable th2) {
        StringBuilder sbZ = r.z(str, "-e: ");
        if (th2 != null) {
            StringBuilder sbB = C22491k0.b(str2, '\n');
            sbB.append(C42833p.b(th2));
            str2 = sbB.toString();
        }
        sbZ.append(str2);
        System.out.println((Object) sbZ.toString());
    }
}
