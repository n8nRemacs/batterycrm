package Fc1;

import Fc1.C13683n5;
import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import i.b;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import ru.uxfeedback.pub.sdk.UxFbLifecycleRule;

/* loaded from: classes9.dex */
public final class H3 implements L3 {

    /* renamed from: a, reason: collision with root package name */
    public int f4988a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4989b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public WeakReference<Activity> f4990c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C13634i1 f4991d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f4992e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public R0 f4993f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f4994g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C13683n5.a f4995h;

    public H3(@Y61.k Application application) {
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f4988a = 0;
        this.f4990c = new WeakReference<>(null);
        this.f4992e = new LinkedHashMap();
        this.f4994g = new LinkedHashMap();
        application.registerActivityLifecycleCallbacks(new a());
    }

    @Override // Fc1.L3
    @Y61.l
    public final androidx.appcompat.app.m a() {
        Activity activityD = d();
        if (activityD == null ? true : activityD instanceof androidx.appcompat.app.m) {
            return (androidx.appcompat.app.m) this.f4990c.get();
        }
        return null;
    }

    public final void b(Activity activity) {
        Window window;
        View decorView;
        View rootView;
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f4990c = weakReference;
        Activity activity2 = weakReference.get();
        if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return;
        }
        rootView.post(new G3(this, 0));
    }

    @Override // Fc1.L3
    @Y61.k
    public final WeakReference<Activity> c() {
        Activity activity = this.f4990c.get();
        this.f4988a = activity != null ? activity.hashCode() : 0;
        return this.f4990c;
    }

    @Override // Fc1.L3
    @Y61.l
    public final Activity d() {
        return this.f4990c.get();
    }

    @Override // Fc1.L3
    public final void a(@Y61.l C13683n5.a aVar) {
        this.f4995h = aVar;
    }

    @Override // Fc1.L3
    @Y61.k
    public final Activity b() {
        Activity activityD = d();
        if (activityD != null) {
            return activityD;
        }
        throw new IllegalStateException("Activity not found");
    }

    @kotlin.jvm.internal.s0
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: Fc1.H3$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0295a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4997a;

            static {
                int[] iArr = new int[UxFbLifecycleRule.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4997a = iArr;
            }
        }

        public static final class b implements androidx.view.result.a<List<Uri>> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H3 f4998b;

            public b(H3 h32) {
                this.f4998b = h32;
            }

            @Override // androidx.view.result.a
            public final void a(List<Uri> list) {
                List<Uri> list2 = list;
                C13634i1 c13634i1 = this.f4998b.f4991d;
                if (c13634i1 != null) {
                    c13634i1.invoke(list2);
                }
            }
        }

        public static final class c implements androidx.view.result.a<Uri> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H3 f4999b;

            public c(H3 h32) {
                this.f4999b = h32;
            }

            @Override // androidx.view.result.a
            public final void a(Uri uri) {
                Uri uri2 = uri;
                R0 r02 = this.f4999b.f4993f;
                if (r02 != null) {
                    r02.invoke(uri2);
                }
            }
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            if (activity instanceof androidx.view.n) {
                H3 h32 = H3.this;
                androidx.view.n nVar = (androidx.view.n) activity;
                h32.f4992e.put(Integer.valueOf(activity.hashCode()), nVar.registerForActivityResult(new O5(), new b(h32)));
                h32.f4994g.put(Integer.valueOf(activity.hashCode()), nVar.registerForActivityResult(new b.j(), new c(h32)));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
            kotlin.G0 g02;
            Annotation annotation;
            C13683n5.a aVar;
            C13629h5 c13629h5;
            C13629h5 c13629h52;
            C13683n5.a aVar2;
            C13629h5 c13629h53;
            C13629h5 c13629h54;
            Annotation[] annotations = activity.getClass().getAnnotations();
            int length = annotations.length;
            int i12 = 0;
            while (true) {
                g02 = null;
                if (i12 >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i12];
                if (annotation instanceof Cb1.e) {
                    break;
                } else {
                    i12++;
                }
            }
            Cb1.e eVar = annotation != null ? (Cb1.e) annotation : null;
            H3 h32 = H3.this;
            if (eVar != null) {
                int i13 = C0295a.f4997a[eVar.lifecycleRule().ordinal()];
                if (i13 == 1 || i13 == 2) {
                    h32.getClass();
                    if (activity.isFinishing()) {
                        if (h32.f4988a == activity.hashCode() && (aVar2 = h32.f4995h) != null && (c13629h53 = C13683n5.this.f5703c) != null) {
                            c13629h53.a();
                        }
                    } else if (h32.f4988a == activity.hashCode()) {
                        h32.f4989b = true;
                        C13683n5.a aVar3 = h32.f4995h;
                        if (aVar3 != null && (c13629h54 = C13683n5.this.f5703c) != null) {
                            c13629h54.a();
                        }
                    }
                }
                g02 = kotlin.G0.f406611a;
            }
            if (g02 == null) {
                h32.getClass();
                if (activity.isFinishing()) {
                    if (h32.f4988a == activity.hashCode() && (aVar = h32.f4995h) != null && (c13629h5 = C13683n5.this.f5703c) != null) {
                        c13629h5.a();
                    }
                } else if (h32.f4988a == activity.hashCode()) {
                    h32.f4989b = true;
                    C13683n5.a aVar4 = h32.f4995h;
                    if (aVar4 != null && (c13629h52 = C13683n5.this.f5703c) != null) {
                        c13629h52.a();
                    }
                }
            }
            androidx.view.result.h hVar = (androidx.view.result.h) h32.f4992e.get(Integer.valueOf(activity.hashCode()));
            if (hVar != null) {
                hVar.c();
            }
            h32.f4992e.remove(Integer.valueOf(activity.hashCode()));
            LinkedHashMap linkedHashMap = h32.f4994g;
            androidx.view.result.h hVar2 = (androidx.view.result.h) linkedHashMap.get(Integer.valueOf(activity.hashCode()));
            if (hVar2 != null) {
                hVar2.c();
            }
            linkedHashMap.remove(Integer.valueOf(activity.hashCode()));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@Y61.k Activity activity) {
            Annotation annotation;
            Annotation[] annotations = activity.getClass().getAnnotations();
            int length = annotations.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i12];
                if (annotation instanceof Cb1.e) {
                    break;
                } else {
                    i12++;
                }
            }
            Cb1.e eVar = annotation != null ? (Cb1.e) annotation : null;
            if (eVar != null) {
                if (C0295a.f4997a[eVar.lifecycleRule().ordinal()] == 2) {
                    H3.this.b(activity);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@Y61.k Activity activity) {
            kotlin.G0 g02;
            Annotation annotation;
            Annotation[] annotations = activity.getClass().getAnnotations();
            int length = annotations.length;
            int i12 = 0;
            while (true) {
                g02 = null;
                if (i12 >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i12];
                if (annotation instanceof Cb1.e) {
                    break;
                } else {
                    i12++;
                }
            }
            Cb1.e eVar = annotation != null ? (Cb1.e) annotation : null;
            H3 h32 = H3.this;
            if (eVar != null) {
                if (C0295a.f4997a[eVar.lifecycleRule().ordinal()] == 1) {
                    h32.b(activity);
                }
                g02 = kotlin.G0.f406611a;
            }
            if (g02 == null) {
                h32.b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@Y61.k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@Y61.k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@Y61.k Activity activity, @Y61.k Bundle bundle) {
        }
    }
}
