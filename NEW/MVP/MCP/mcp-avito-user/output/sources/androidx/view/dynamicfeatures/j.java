package androidx.view.dynamicfeatures;

import Ba1.B;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.view.AbstractC23301M0;
import androidx.view.C23038g0;
import androidx.view.C23317W;
import androidx.view.C23324b0;
import androidx.view.C23395u;
import androidx.view.dynamicfeatures.f;
import com.google.android.play.core.splitinstall.AbstractC37204f;
import com.google.android.play.core.splitinstall.C37200b;
import com.google.android.play.core.splitinstall.C37203e;
import com.google.android.play.core.splitinstall.InterfaceC37201c;
import com.google.android.play.core.splitinstall.InterfaceC37205g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DynamicInstallManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/dynamicfeatures/j;", "", "a", "b", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f53089c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f53090a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC37201c f53091b;

    /* compiled from: DynamicInstallManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/dynamicfeatures/j$a;", "", "<init>", "()V", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DynamicInstallManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/dynamicfeatures/j$b;", "Lcom/google/android/play/core/splitinstall/g;", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements InterfaceC37205g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Context f53092a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C23038g0<AbstractC37204f> f53093b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final l f53094c;

        public b(@k Context context, @k C23038g0<AbstractC37204f> c23038g0, @k l lVar) {
            this.f53092a = context;
            this.f53093b = c23038g0;
            this.f53094c = lVar;
        }

        @Override // MY0.a
        public final void a(AbstractC37204f abstractC37204f) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AbstractC37204f abstractC37204f2 = abstractC37204f;
            int iH2 = abstractC37204f2.h();
            l lVar = this.f53094c;
            if (iH2 == lVar.f53101c) {
                if (abstractC37204f2.i() == 5) {
                    Context context = this.f53092a;
                    com.google.android.play.core.splitcompat.a.c(context, false);
                    if (Build.VERSION.SDK_INT >= 28) {
                        com.google.android.play.core.splitinstall.internal.s0 s0Var = C37200b.f358706a;
                    } else {
                        com.google.android.play.core.splitinstall.internal.s0 s0Var2 = C37200b.f358706a;
                        s0Var2.d("Calling dispatchPackageBroadcast", new Object[0]);
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Method method = cls.getMethod("currentActivityThread", new Class[0]);
                            method.setAccessible(true);
                            Object objInvoke = method.invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mAppThread");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(objInvoke);
                            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
                            s0Var2.d("Called dispatchPackageBroadcast", new Object[0]);
                        } catch (Exception e12) {
                            s0Var2.c(e12, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
                        }
                    }
                }
                C23038g0<AbstractC37204f> c23038g0 = this.f53093b;
                c23038g0.setValue(abstractC37204f2);
                if (abstractC37204f2.d()) {
                    lVar.f53102d.b(this);
                    j.f53089c.getClass();
                    if (c23038g0.hasActiveObservers()) {
                        throw new IllegalStateException("This DynamicInstallMonitor will not emit any more status updates. You should remove all Observers after null has been emitted.");
                    }
                }
            }
        }
    }

    public j(@k Context context, @k InterfaceC37201c interfaceC37201c) {
        this.f53090a = context;
        this.f53091b = interfaceC37201c;
    }

    @RestrictTo
    public final boolean a(@k String str) {
        return !this.f53091b.e().contains(str);
    }

    @l
    @RestrictTo
    public final void b(@k C23395u c23395u, @l e eVar, @k String str) {
        if ((eVar != null ? eVar.f53046a : null) != null) {
            l lVar = eVar.f53046a;
            if (lVar.f53103e) {
                throw new IllegalStateException("You must pass in a fresh DynamicInstallMonitor in DynamicExtras every time you call navigate().");
            }
            C23038g0 c23038g0 = lVar.f53099a;
            lVar.f53100b = true;
            lVar.f53103e = true;
            C37203e.a aVar = new C37203e.a(null);
            aVar.f358712a.add(str);
            this.f53091b.a(new C37203e(aVar, null)).g(new AJ.b(1, new k(lVar, this, c23038g0, str))).e(new B(str, lVar, c23038g0));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dfn:destinationId", c23395u.f53182c.f52886i);
        bundle.putBundle("dfn:destinationArgs", c23395u.a());
        f.a.C1870a c1870a = f.a.f53052u;
        C23317W c23317w = c23395u.f53182c;
        c1870a.getClass();
        C23324b0 c23324b0 = c23317w.f52880c;
        f.a aVar2 = c23324b0 instanceof f.a ? (f.a) c23324b0 : null;
        if (aVar2 == null) {
            throw new IllegalStateException("Dynamic destinations must be part of a DynamicNavGraph.\nYou can use DynamicNavHostFragment, which will take care of setting up the NavController for Dynamic destinations.\nIf you're not using Fragments, you must set up the NavigatorProvider manually.");
        }
        AbstractC23301M0 abstractC23301M0B = aVar2.f53054r.b(aVar2.f52879b);
        if (!(abstractC23301M0B instanceof f)) {
            throw new IllegalStateException("You must use a DynamicNavGraph to perform a module installation.");
        }
        f fVar = (f) abstractC23301M0B;
        int i12 = aVar2.f53056t;
        if (i12 == 0) {
            Y41.a<? extends C23317W> aVar3 = fVar.f53050f;
            if (aVar3 == null) {
                throw new IllegalStateException("You must set a default progress destination using DynamicNavGraphNavigator.installDefaultProgressDestination or pass in an DynamicInstallMonitor in the DynamicExtras.\nAlternatively, when using NavHostFragment make sure to swap it with DynamicNavHostFragment. This will take care of setting the default progress destination for you.");
            }
            C23317W c23317wInvoke = aVar3.invoke();
            aVar2.w(c23317wInvoke);
            i12 = c23317wInvoke.f52886i;
            aVar2.f53056t = i12;
        }
        C23317W c23317wY = aVar2.y(i12, true);
        if (c23317wY == null) {
            throw new IllegalStateException("The progress destination id must be set and accessible to the module of this navigator.");
        }
        fVar.f53048d.b(c23317wY.f52879b).d(Collections.singletonList(fVar.b().a(c23317wY, bundle)), null, null);
    }
}
