package androidx.view;

import AK.c;
import Y61.k;
import android.os.Bundle;
import androidx.camera.camera2.internal.G;
import androidx.view.C23485c;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Recreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/b;", "Landroidx/lifecycle/L;", "a", "b", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.savedstate.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23484b implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC23487e f54423b;

    /* compiled from: Recreator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/savedstate/b$a;", "", "<init>", "()V", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Recreator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/b$b;", "Landroidx/savedstate/c$c;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.b$b, reason: collision with other inner class name */
    public static final class C1921b implements C23485c.InterfaceC1922c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LinkedHashSet f54424a = new LinkedHashSet();

        public C1921b(@k C23485c c23485c) {
            c23485c.c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.view.C23485c.InterfaceC1922c
        @k
        public final Bundle H() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f54424a));
            return bundle;
        }
    }

    static {
        new a(null);
    }

    public C23484b(@k InterfaceC23487e interfaceC23487e) {
        this.f54423b = interfaceC23487e;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) throws NoSuchMethodException, SecurityException {
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC22983P.getLifecycle().c(this);
        InterfaceC23487e interfaceC23487e = this.f54423b;
        Bundle bundleA = interfaceC23487e.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, C23484b.class.getClassLoader()).asSubclass(C23485c.a.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((C23485c.a) declaredConstructor.newInstance(new Object[0])).a(interfaceC23487e);
                    } catch (Exception e12) {
                        throw new RuntimeException(G.f("Failed to instantiate ", str), e12);
                    }
                } catch (NoSuchMethodException e13) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e13);
                }
            } catch (ClassNotFoundException e14) {
                throw new RuntimeException(c.k("Class ", str, " wasn't found"), e14);
            }
        }
    }
}
