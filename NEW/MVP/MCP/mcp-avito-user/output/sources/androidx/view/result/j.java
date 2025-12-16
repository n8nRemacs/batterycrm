package androidx.view.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import i.AbstractC41201a;
import j.K;
import j.N;
import j.P;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import shark.AndroidResourceIdNames;

/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Random f21251a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21252b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21253c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f21254d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<String> f21255e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public final transient HashMap f21256f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f21257g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f21258h = new Bundle();

    /* compiled from: ActivityResultRegistry.java */
    public class a implements InterfaceC22979L {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f21259b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.view.result.a f21260c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC41201a f21261d;

        public a(String str, androidx.view.result.a aVar, AbstractC41201a abstractC41201a) {
            this.f21259b = str;
            this.f21260c = aVar;
            this.f21261d = abstractC41201a;
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) {
            boolean zEquals = Lifecycle.Event.ON_START.equals(event);
            String str = this.f21259b;
            j jVar = j.this;
            if (!zEquals) {
                if (Lifecycle.Event.ON_STOP.equals(event)) {
                    jVar.f21256f.remove(str);
                    return;
                } else {
                    if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        jVar.g(str);
                        return;
                    }
                    return;
                }
            }
            HashMap map = jVar.f21256f;
            androidx.view.result.a aVar = this.f21260c;
            AbstractC41201a abstractC41201a = this.f21261d;
            map.put(str, new d(abstractC41201a, aVar));
            HashMap map2 = jVar.f21257g;
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                aVar.a(obj);
            }
            Bundle bundle = jVar.f21258h;
            ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
            if (activityResult != null) {
                bundle.remove(str);
                aVar.a(abstractC41201a.parseResult(activityResult.f21242b, activityResult.f21243c));
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: ActivityResultRegistry.java */
    public class b<I> extends h<I> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f21263a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC41201a f21264b;

        public b(String str, AbstractC41201a abstractC41201a) {
            this.f21263a = str;
            this.f21264b = abstractC41201a;
        }

        @Override // androidx.view.result.h
        @N
        public final AbstractC41201a<I, ?> a() {
            return this.f21264b;
        }

        @Override // androidx.view.result.h
        public final void b(Object obj) throws Exception {
            j jVar = j.this;
            HashMap map = jVar.f21253c;
            String str = this.f21263a;
            Integer num = (Integer) map.get(str);
            AbstractC41201a abstractC41201a = this.f21264b;
            if (num != null) {
                jVar.f21255e.add(str);
                try {
                    jVar.c(num.intValue(), abstractC41201a, obj);
                    return;
                } catch (Exception e12) {
                    jVar.f21255e.remove(str);
                    throw e12;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC41201a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.view.result.h
        public final void c() {
            j.this.g(this.f21263a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: ActivityResultRegistry.java */
    public class c<I> extends h<I> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f21266a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC41201a f21267b;

        public c(String str, AbstractC41201a abstractC41201a) {
            this.f21266a = str;
            this.f21267b = abstractC41201a;
        }

        @Override // androidx.view.result.h
        @N
        public final AbstractC41201a<I, ?> a() {
            return this.f21267b;
        }

        @Override // androidx.view.result.h
        public final void b(Object obj) throws Exception {
            j jVar = j.this;
            HashMap map = jVar.f21253c;
            String str = this.f21266a;
            Integer num = (Integer) map.get(str);
            AbstractC41201a abstractC41201a = this.f21267b;
            if (num != null) {
                jVar.f21255e.add(str);
                try {
                    jVar.c(num.intValue(), abstractC41201a, obj);
                    return;
                } catch (Exception e12) {
                    jVar.f21255e.remove(str);
                    throw e12;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC41201a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.view.result.h
        public final void c() {
            j.this.g(this.f21266a);
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    public static class d<O> {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.view.result.a<O> f21269a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC41201a<?, O> f21270b;

        public d(AbstractC41201a abstractC41201a, androidx.view.result.a aVar) {
            this.f21269a = aVar;
            this.f21270b = abstractC41201a;
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f21271a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<InterfaceC22979L> f21272b = new ArrayList<>();

        public e(@N Lifecycle lifecycle) {
            this.f21271a = lifecycle;
        }
    }

    @K
    public final void a(int i12, @SuppressLint({"UnknownNullness"}) Serializable serializable) {
        androidx.view.result.a<O> aVar;
        String str = (String) this.f21252b.get(Integer.valueOf(i12));
        if (str == null) {
            return;
        }
        d dVar = (d) this.f21256f.get(str);
        if (dVar == null || (aVar = dVar.f21269a) == 0) {
            this.f21258h.remove(str);
            this.f21257g.put(str, serializable);
        } else if (this.f21255e.remove(str)) {
            aVar.a(serializable);
        }
    }

    @K
    public final boolean b(int i12, int i13, @P Intent intent) {
        androidx.view.result.a<O> aVar;
        String str = (String) this.f21252b.get(Integer.valueOf(i12));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.f21256f.get(str);
        if (dVar == null || (aVar = dVar.f21269a) == 0 || !this.f21255e.contains(str)) {
            this.f21257g.remove(str);
            this.f21258h.putParcelable(str, new ActivityResult(i13, intent));
            return true;
        }
        aVar.a(dVar.f21270b.parseResult(i13, intent));
        this.f21255e.remove(str);
        return true;
    }

    @K
    public abstract void c(int i12, @N AbstractC41201a abstractC41201a, @SuppressLint({"UnknownNullness"}) Object obj);

    @N
    public final <I, O> h<I> d(@N String str, @N InterfaceC22983P interfaceC22983P, @N AbstractC41201a<I, O> abstractC41201a, @N androidx.view.result.a<O> aVar) {
        Lifecycle lifecycle = interfaceC22983P.getLifecycle();
        if (lifecycle.getF46705d().a(Lifecycle.State.f46682e)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC22983P + " is attempting to register while current state is " + lifecycle.getF46705d() + ". LifecycleOwners must call register before they are STARTED.");
        }
        f(str);
        HashMap map = this.f21254d;
        e eVar = (e) map.get(str);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        a aVar2 = new a(str, aVar, abstractC41201a);
        eVar.f21271a.a(aVar2);
        eVar.f21272b.add(aVar2);
        map.put(str, eVar);
        return new b(str, abstractC41201a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    public final <I, O> h<I> e(@N String str, @N AbstractC41201a<I, O> abstractC41201a, @N androidx.view.result.a<O> aVar) {
        f(str);
        this.f21256f.put(str, new d(abstractC41201a, aVar));
        HashMap map = this.f21257g;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            aVar.a(obj);
        }
        Bundle bundle = this.f21258h;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar.a(abstractC41201a.parseResult(activityResult.f21242b, activityResult.f21243c));
        }
        return new c(str, abstractC41201a);
    }

    public final void f(String str) {
        HashMap map = this.f21253c;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iNextInt = this.f21251a.nextInt(2147418112);
        while (true) {
            int i12 = iNextInt + AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
            HashMap map2 = this.f21252b;
            if (!map2.containsKey(Integer.valueOf(i12))) {
                map2.put(Integer.valueOf(i12), str);
                map.put(str, Integer.valueOf(i12));
                return;
            }
            iNextInt = this.f21251a.nextInt(2147418112);
        }
    }

    @K
    public final void g(@N String str) {
        Integer num;
        if (!this.f21255e.contains(str) && (num = (Integer) this.f21253c.remove(str)) != null) {
            this.f21252b.remove(num);
        }
        this.f21256f.remove(str);
        HashMap map = this.f21257g;
        if (map.containsKey(str)) {
            Objects.toString(map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f21258h;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f21254d;
        e eVar = (e) map2.get(str);
        if (eVar != null) {
            ArrayList<InterfaceC22979L> arrayList = eVar.f21272b;
            Iterator<InterfaceC22979L> it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.f21271a.c(it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
