package androidx.window.layout.adapter.sidecar;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.window.core.VerificationMode;
import androidx.window.core.n;
import androidx.window.layout.c;
import androidx.window.layout.d;
import androidx.window.layout.n;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import j.k0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SidecarAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b;", "", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f55287b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f55288c = b.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final VerificationMode f55289a;

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k0
        @SuppressLint({"BanUncheckedReflection"})
        public static int a(@k SidecarDeviceState sidecarDeviceState) {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    return ((Integer) SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0])).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public static int b(@k SidecarDeviceState sidecarDeviceState) {
            int iA2 = a(sidecarDeviceState);
            if (iA2 < 0 || iA2 > 4) {
                return 0;
            }
            return iA2;
        }

        @k0
        @k
        @SuppressLint({"BanUncheckedReflection"})
        public static List c(@k SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? C42745f0.z() : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return C42745f0.z();
                }
            } catch (NoSuchFieldError unused2) {
                return (List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
            }
        }

        @k0
        @SuppressLint({"BanUncheckedReflection"})
        public static void d(@k SidecarDeviceState sidecarDeviceState, int i12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                try {
                    sidecarDeviceState.posture = i12;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i12));
            }
        }

        public a() {
        }
    }

    public b() {
        this(null, 1, null);
    }

    public static boolean a(@l SidecarDeviceState sidecarDeviceState, @l SidecarDeviceState sidecarDeviceState2) {
        if (L.f(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        f55287b.getClass();
        return a.b(sidecarDeviceState) == a.b(sidecarDeviceState2);
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (L.f(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return L.f(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (!b((SidecarDisplayFeature) list.get(i12), (SidecarDisplayFeature) list2.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(@l SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @l SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (L.f(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        f55287b.getClass();
        return c(a.c(sidecarWindowLayoutInfo), a.c(sidecarWindowLayoutInfo2));
    }

    @k
    public final n e(@l SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @k SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (sidecarWindowLayoutInfo == null) {
            return new n(C42745f0.z());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        f55287b.getClass();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new n(f(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    @k
    public final ArrayList f(@k List list, @k SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.window.layout.d dVarG = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (dVarG != null) {
                arrayList.add(dVarG);
            }
        }
        return arrayList;
    }

    @l
    public final androidx.window.layout.d g(@k SidecarDisplayFeature sidecarDisplayFeature, @k SidecarDeviceState sidecarDeviceState) {
        d.b bVarA;
        c.C1945c c1945c;
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) n.a.a(androidx.window.core.n.f55195a, sidecarDisplayFeature, f55288c, this.f55289a).b("Type must be either TYPE_FOLD or TYPE_HINGE", c.f55290l).b("Feature bounds must not be 0", d.f55291l).b("TYPE_FOLD must have 0 area", e.f55292l).b("Feature be pinned to either left or top", f.f55293l).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            d.b.f55319b.getClass();
            bVarA = d.b.a.a();
        } else {
            if (type != 2) {
                return null;
            }
            d.b.f55319b.getClass();
            bVarA = d.b.a.b();
        }
        f55287b.getClass();
        int iB2 = a.b(sidecarDeviceState);
        if (iB2 == 0 || iB2 == 1) {
            return null;
        }
        if (iB2 == 2) {
            c1945c = c.C1945c.f55313c;
        } else {
            if (iB2 != 3 && iB2 == 4) {
                return null;
            }
            c1945c = c.C1945c.f55312b;
        }
        return new androidx.window.layout.d(new androidx.window.core.c(sidecarDisplayFeature.getRect()), bVarA, c1945c);
    }

    public b(VerificationMode verificationMode, int i12, C42822w c42822w) {
        this.f55289a = (i12 & 1) != 0 ? VerificationMode.f55175c : verificationMode;
    }
}
