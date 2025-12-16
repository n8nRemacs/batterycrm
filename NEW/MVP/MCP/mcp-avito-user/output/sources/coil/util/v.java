package coil.util;

import android.os.SystemClock;
import coil.view.AbstractC27249c;
import coil.view.C27253g;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HardwareBitmaps.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/util/v;", "Lcoil/util/s;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class v implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final o f58800a;

    /* compiled from: HardwareBitmaps.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/util/v$a;", "", "<init>", "()V", "", "MIN_SIZE_DIMENSION", "I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public v(@Y61.l o oVar) {
        this.f58800a = oVar;
    }

    @Override // coil.util.s
    public final boolean a(@Y61.k C27253g c27253g) {
        AbstractC27249c abstractC27249c = c27253g.f58765a;
        if ((abstractC27249c instanceof AbstractC27249c.a ? ((AbstractC27249c.a) abstractC27249c).f58759a : Integer.MAX_VALUE) > 100) {
            AbstractC27249c abstractC27249c2 = c27253g.f58766b;
            if ((abstractC27249c2 instanceof AbstractC27249c.a ? ((AbstractC27249c.a) abstractC27249c2).f58759a : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.util.s
    /* renamed from: b */
    public final boolean getF58799a() {
        boolean z12;
        r rVar = r.f58789a;
        o oVar = this.f58800a;
        synchronized (rVar) {
            try {
                int i12 = r.f58791c;
                r.f58791c = i12 + 1;
                if (i12 >= 30 || SystemClock.uptimeMillis() > r.f58792d + 30000) {
                    r.f58791c = 0;
                    r.f58792d = SystemClock.uptimeMillis();
                    String[] list = r.f58790b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    int length = list.length;
                    boolean z13 = length < 800;
                    r.f58793e = z13;
                    if (!z13 && oVar != null && oVar.f58787a <= 5) {
                        oVar.a(5, "FileDescriptorCounter", "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
                z12 = r.f58793e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }
}
