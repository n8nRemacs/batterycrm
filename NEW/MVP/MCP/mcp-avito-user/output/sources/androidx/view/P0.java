package androidx.view;

import A1.i;
import X41.f;
import X41.j;
import Y61.k;
import Y61.l;
import android.app.Application;
import androidx.annotation.RestrictTo;
import j.K;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.m0;
import z1.AbstractC50339a;
import z1.C50343e;
import z1.C50347i;

/* compiled from: ViewModelProvider.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/P0;", "", "a", "b", "c", "d", "e", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class P0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f46692b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50347i f46693a;

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/P0$b;", "", "<init>", "()V", "Lz1/a$b;", "", "VIEW_MODEL_KEY", "Lz1/a$b;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/P0$d;", "Landroidx/lifecycle/P0$c;", "<init>", "()V", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d implements c {

        /* renamed from: b, reason: collision with root package name */
        @l
        public static d f46700b;

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f46699a = new a(null);

        /* renamed from: c, reason: collision with root package name */
        @f
        @k
        public static final i.a f46701c = i.a.f44a;

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/P0$d$a;", "", "<init>", "()V", "Lz1/a$b;", "", "VIEW_MODEL_KEY", "Lz1/a$b;", "Landroidx/lifecycle/P0$d;", "_instance", "Landroidx/lifecycle/P0$d;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.P0.c
        @k
        public final M0 a(@k kotlin.reflect.d dVar, @k C50343e c50343e) {
            return create(((InterfaceC42819t) dVar).f(), c50343e);
        }

        @Override // androidx.lifecycle.P0.c
        @k
        public <T extends M0> T create(@k Class<T> cls) {
            A1.d.f38a.getClass();
            return (T) A1.d.a(cls);
        }

        @Override // androidx.lifecycle.P0.c
        @k
        public <T extends M0> T create(@k Class<T> cls, @k AbstractC50339a abstractC50339a) {
            return (T) create(cls);
        }
    }

    static {
        i.a aVar = i.a.f44a;
    }

    @j
    public P0(@k S0 s02, @k c cVar) {
        this(s02, cVar, null, 4, null);
    }

    @K
    @k
    public final <T extends M0> T a(@k Class<T> cls) {
        return (T) c(m0.f406844a.b(cls));
    }

    @K
    @k
    public final M0 b(@k Class cls, @k String str) {
        return this.f46693a.a(str, m0.f406844a.b(cls));
    }

    @K
    @k
    public final <T extends M0> T c(@k kotlin.reflect.d<T> dVar) {
        i.f43a.getClass();
        String strP0 = dVar.p0();
        if (strP0 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) this.f46693a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP0), dVar);
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/P0$a;", "Landroidx/lifecycle/P0$d;", "<init>", "()V", "b", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a extends d {

        /* renamed from: f, reason: collision with root package name */
        @l
        public static a f46695f;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Application f46697d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final b f46694e = new b(null);

        /* renamed from: g, reason: collision with root package name */
        @f
        @k
        public static final C1793a f46696g = new C1793a();

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/P0$a$a", "Lz1/a$b;", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.P0$a$a, reason: collision with other inner class name */
        public static final class C1793a implements AbstractC50339a.b<Application> {
        }

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/P0$a$b;", "", "<init>", "()V", "Lz1/a$b;", "Landroid/app/Application;", "APPLICATION_KEY", "Lz1/a$b;", "Landroidx/lifecycle/P0$a;", "_instance", "Landroidx/lifecycle/P0$a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        public a(Application application) {
            this.f46697d = application;
        }

        public static M0 b(Class cls, Application application) {
            if (!C22995b.class.isAssignableFrom(cls)) {
                A1.d.f38a.getClass();
                return A1.d.a(cls);
            }
            try {
                return (M0) cls.getConstructor(Application.class).newInstance(application);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Cannot create an instance of "), e12);
            } catch (InstantiationException e13) {
                throw new RuntimeException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Cannot create an instance of "), e13);
            } catch (NoSuchMethodException e14) {
                throw new RuntimeException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Cannot create an instance of "), e14);
            } catch (InvocationTargetException e15) {
                throw new RuntimeException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Cannot create an instance of "), e15);
            }
        }

        @Override // androidx.lifecycle.P0.d, androidx.lifecycle.P0.c
        @k
        public final <T extends M0> T create(@k Class<T> cls, @k AbstractC50339a abstractC50339a) {
            if (this.f46697d != null) {
                return (T) create(cls);
            }
            Application application = (Application) ((C50343e) abstractC50339a).f443747a.get(f46696g);
            if (application != null) {
                return (T) b(cls, application);
            }
            if (C22995b.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            A1.d.f38a.getClass();
            return (T) A1.d.a(cls);
        }

        public a() {
            this(null);
        }

        @Override // androidx.lifecycle.P0.d, androidx.lifecycle.P0.c
        @k
        public final <T extends M0> T create(@k Class<T> cls) {
            Application application = this.f46697d;
            if (application != null) {
                return (T) b(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public /* synthetic */ P0(S0 s02, c cVar, AbstractC50339a abstractC50339a, int i12, C42822w c42822w) {
        this(s02, cVar, (i12 & 4) != 0 ? AbstractC50339a.C12939a.f443748b : abstractC50339a);
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/P0$c;", "", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/P0$c$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f46698a = 0;

            static {
                new a();
            }
        }

        static {
            int i12 = a.f46698a;
        }

        @k
        default M0 a(@k kotlin.reflect.d dVar, @k C50343e c50343e) {
            return create(((InterfaceC42819t) dVar).f(), c50343e);
        }

        @k
        default <T extends M0> T create(@k Class<T> cls) {
            i.f43a.getClass();
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        @k
        default <T extends M0> T create(@k Class<T> cls, @k AbstractC50339a abstractC50339a) {
            return (T) create(cls);
        }
    }

    @j
    public P0(@k S0 s02, @k c cVar, @k AbstractC50339a abstractC50339a) {
        this.f46693a = new C50347i(s02, cVar, abstractC50339a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public P0(@k T0 t02) {
        c defaultViewModelProviderFactory;
        AbstractC50339a defaultViewModelCreationExtras;
        S0 viewModelStore = t02.getF42820b();
        i.f43a.getClass();
        boolean z12 = t02 instanceof InterfaceC22969B;
        if (z12) {
            defaultViewModelProviderFactory = ((InterfaceC22969B) t02).getDefaultViewModelProviderFactory();
        } else {
            defaultViewModelProviderFactory = A1.c.f37a;
        }
        if (z12) {
            defaultViewModelCreationExtras = ((InterfaceC22969B) t02).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = AbstractC50339a.C12939a.f443748b;
        }
        this(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public P0(@k T0 t02, @k c cVar) {
        AbstractC50339a defaultViewModelCreationExtras;
        S0 viewModelStore = t02.getF42820b();
        i.f43a.getClass();
        if (t02 instanceof InterfaceC22969B) {
            defaultViewModelCreationExtras = ((InterfaceC22969B) t02).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = AbstractC50339a.C12939a.f443748b;
        }
        this(viewModelStore, cVar, defaultViewModelCreationExtras);
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/P0$e;", "", "<init>", "()V", "Landroidx/lifecycle/M0;", "viewModel", "Lkotlin/G0;", "onRequery", "(Landroidx/lifecycle/M0;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static class e {
        public void onRequery(@k M0 viewModel) {
        }
    }
}
