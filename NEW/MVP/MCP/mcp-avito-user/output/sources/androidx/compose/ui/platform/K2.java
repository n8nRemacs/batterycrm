package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.L2;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.internal.C43238h;
import s0.C47949a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class K2 implements L2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, androidx.compose.ui.platform.F1] */
    @Override // androidx.compose.ui.platform.L2
    public final Recomposer a(View view) {
        CoroutineContext value;
        CoroutineContext coroutineContextPlus;
        androidx.compose.runtime.J1 j12;
        L2.a aVar = L2.a.f41168a;
        LinkedHashMap linkedHashMap = T2.f41277a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (emptyCoroutineContext.get(ContinuationInterceptor.INSTANCE) == null || emptyCoroutineContext.get(androidx.compose.runtime.V0.f38155w1) == null) {
            C22475g0.f41448m.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                value = C22475g0.f41449n.getValue();
            } else {
                value = C22475g0.f41450o.get();
                if (value == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            coroutineContextPlus = value.plus(emptyCoroutineContext);
        } else {
            coroutineContextPlus = emptyCoroutineContext;
        }
        androidx.compose.runtime.V0 v02 = (androidx.compose.runtime.V0) coroutineContextPlus.get(androidx.compose.runtime.V0.f38155w1);
        if (v02 != null) {
            androidx.compose.runtime.J1 j13 = new androidx.compose.runtime.J1(v02);
            androidx.compose.runtime.Q0 q02 = j13.f37989c;
            synchronized (q02.f38096a) {
                q02.f38099d = false;
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            j12 = j13;
        } else {
            j12 = 0;
        }
        l0.h hVar = new l0.h();
        androidx.compose.ui.x xVar = (androidx.compose.ui.x) coroutineContextPlus.get(androidx.compose.ui.x.f43131z1);
        androidx.compose.ui.x xVar2 = xVar;
        if (xVar == null) {
            ?? f12 = new F1();
            hVar.f406842b = f12;
            xVar2 = f12;
        }
        if (j12 != 0) {
            emptyCoroutineContext = j12;
        }
        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(emptyCoroutineContext).plus(xVar2);
        Recomposer recomposer = new Recomposer(coroutineContextPlus2);
        synchronized (recomposer.f38109b) {
            recomposer.f38127t = true;
            kotlin.G0 g03 = kotlin.G0.f406611a;
        }
        C43238h c43238hA = kotlinx.coroutines.U.a(coroutineContextPlus2);
        InterfaceC22983P interfaceC22983PA = androidx.view.V0.a(view);
        Lifecycle lifecycle = interfaceC22983PA != null ? interfaceC22983PA.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new P2(view, recomposer));
            lifecycle.a(new Q2(c43238hA, j12, recomposer, hVar, view));
            return recomposer;
        }
        C47949a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }
}
