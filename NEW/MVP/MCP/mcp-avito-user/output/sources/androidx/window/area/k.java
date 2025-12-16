package androidx.window.area;

import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.view.J0;
import androidx.window.area.h;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.core.util.function.Consumer;
import com.adjust.sdk.Constants;
import j.X;
import java.util.Iterator;
import java.util.Locale;
import k2.C42475a;
import k2.C42476b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: WindowAreaControllerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/area/k;", "Landroidx/window/area/i;", "a", "b", "c", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.window.core.i
@X
/* loaded from: classes10.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55171a = 0;

    /* compiled from: WindowAreaControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/window/area/k$a;", "", "<init>", "()V", "", "REAR_DISPLAY_BINDER_DESCRIPTOR", "Ljava/lang/String;", "TAG", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WindowAreaControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/window/area/k$b;", "Landroidx/window/extensions/core/util/function/Consumer;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Consumer<Integer> {
        @Override // androidx.window.extensions.core.util.function.Consumer
        public final void accept(Integer num) {
            num.intValue();
            throw null;
        }
    }

    /* compiled from: WindowAreaControllerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/window/area/k$c;", "Landroidx/window/extensions/core/util/function/Consumer;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Consumer<Integer> {
        @Override // androidx.window.extensions.core.util.function.Consumer
        public final void accept(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == 0 || iIntValue == 1) {
                throw null;
            }
            androidx.window.core.d.f55182a.getClass();
            if (androidx.window.core.d.f55183b != VerificationMode.f55174b) {
                throw null;
            }
            int i12 = k.f55171a;
            throw null;
        }
    }

    static {
        new a(null);
        m0.f406844a.b(k.class).l0();
    }

    public static final void b(k kVar, int i12) {
        Object next;
        kVar.getClass();
        C42476b c42476b = C42476b.f406025a;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        c42476b.getClass();
        Iterator<T> it = C42476b.f406026b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((C42475a) next).getClass();
            Locale locale = Locale.US;
            if (Constants.REFERRER_API_GOOGLE.equals(str.toLowerCase(locale)) && "pixel fold".equals(str2.toLowerCase(locale))) {
                break;
            }
        }
        C42475a c42475a = (C42475a) next;
        DisplayMetrics displayMetrics = c42475a != null ? c42475a.f406024a : null;
        if (displayMetrics == null) {
            throw new IllegalArgumentException("DeviceUtils rear display metrics entry should not be null");
        }
        androidx.window.layout.p.f55345a.getClass();
        new androidx.window.core.c(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        new J0.b().a();
        g.f55164a.getClass();
        if (i12 == 0) {
            h.b bVar = h.b.f55166b;
        } else if (i12 == 1) {
            h.b bVar2 = h.b.f55167c;
        } else if (i12 == 2) {
            h.b bVar3 = h.b.f55168d;
        } else if (i12 != 3) {
            h.b bVar4 = h.b.f55166b;
        } else {
            h.b bVar5 = h.b.f55169e;
        }
        int i13 = h.a.f55165a;
        throw null;
    }
}
