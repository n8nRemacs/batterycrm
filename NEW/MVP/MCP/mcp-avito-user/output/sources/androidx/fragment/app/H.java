package androidx.fragment.app;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.view.Lifecycle;
import j.InterfaceC42145a;
import j.InterfaceC42146b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: b, reason: collision with root package name */
    public int f46443b;

    /* renamed from: c, reason: collision with root package name */
    public int f46444c;

    /* renamed from: d, reason: collision with root package name */
    public int f46445d;

    /* renamed from: e, reason: collision with root package name */
    public int f46446e;

    /* renamed from: f, reason: collision with root package name */
    public int f46447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46448g;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public String f46450i;

    /* renamed from: j, reason: collision with root package name */
    public int f46451j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f46452k;

    /* renamed from: l, reason: collision with root package name */
    public int f46453l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f46454m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<String> f46455n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<String> f46456o;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f46442a = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f46449h = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46457p = false;

    /* compiled from: FragmentTransaction.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f46458a;

        /* renamed from: b, reason: collision with root package name */
        public Fragment f46459b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46460c;

        /* renamed from: d, reason: collision with root package name */
        public int f46461d;

        /* renamed from: e, reason: collision with root package name */
        public int f46462e;

        /* renamed from: f, reason: collision with root package name */
        public int f46463f;

        /* renamed from: g, reason: collision with root package name */
        public int f46464g;

        /* renamed from: h, reason: collision with root package name */
        public Lifecycle.State f46465h;

        /* renamed from: i, reason: collision with root package name */
        public Lifecycle.State f46466i;

        public a() {
        }

        public a(Fragment fragment, int i12) {
            this.f46458a = i12;
            this.f46459b = fragment;
            this.f46460c = false;
            Lifecycle.State state = Lifecycle.State.f46683f;
            this.f46465h = state;
            this.f46466i = state;
        }

        public a(int i12, Fragment fragment, int i13) {
            this.f46458a = i12;
            this.f46459b = fragment;
            this.f46460c = true;
            Lifecycle.State state = Lifecycle.State.f46683f;
            this.f46465h = state;
            this.f46466i = state;
        }
    }

    @Deprecated
    public H() {
    }

    public final void b(a aVar) {
        this.f46442a.add(aVar);
        aVar.f46461d = this.f46443b;
        aVar.f46462e = this.f46444c;
        aVar.f46463f = this.f46445d;
        aVar.f46464g = this.f46446e;
    }

    @j.N
    public final void c(@j.P String str) {
        if (!this.f46449h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f46448g = true;
        this.f46450i = str;
    }

    @j.N
    public final void d(@j.N Fragment fragment) {
        b(new a(fragment, 7));
    }

    public abstract int e();

    public abstract int f();

    @j.K
    public abstract void g();

    @j.K
    public abstract void h();

    @j.N
    public void i(@j.N Fragment fragment) {
        b(new a(fragment, 6));
    }

    public void j(int i12, Fragment fragment, @j.P String str, int i13) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(androidx.camera.camera2.internal.G.g(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i12 != 0) {
            if (i12 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i14 = fragment.mFragmentId;
            if (i14 != 0 && i14 != i12) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i12);
            }
            fragment.mFragmentId = i12;
            fragment.mContainerId = i12;
        }
        b(new a(fragment, i13));
    }

    @j.N
    public void k(@j.N Fragment fragment) {
        b(new a(fragment, 4));
    }

    public abstract boolean l();

    @j.N
    public void m(@j.N Fragment fragment) {
        b(new a(fragment, 3));
    }

    @j.N
    public final void n(@j.D int i12, @j.N Fragment fragment, @j.P String str) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        j(i12, fragment, str, 2);
    }

    @j.N
    public final void o(@InterfaceC42145a @InterfaceC42146b int i12, @InterfaceC42145a @InterfaceC42146b int i13, @InterfaceC42145a @InterfaceC42146b int i14, @InterfaceC42145a @InterfaceC42146b int i15) {
        this.f46443b = i12;
        this.f46444c = i13;
        this.f46445d = i14;
        this.f46446e = i15;
    }

    @j.N
    public void p(@j.N Fragment fragment, @j.N Lifecycle.State state) {
        a aVar = new a();
        aVar.f46458a = 10;
        aVar.f46459b = fragment;
        aVar.f46460c = false;
        aVar.f46465h = fragment.mMaxState;
        aVar.f46466i = state;
        b(aVar);
    }

    @j.N
    public void q(@j.P Fragment fragment) {
        b(new a(fragment, 8));
    }

    @j.N
    public void r(@j.N Fragment fragment) {
        b(new a(fragment, 5));
    }

    public H(int i12) {
    }
}
