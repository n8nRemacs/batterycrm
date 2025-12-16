package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.C20199a;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.N;
import j.P;
import j.k0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes5.dex */
public class l implements Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    public static final b f339508i = new a();

    /* renamed from: b, reason: collision with root package name */
    public volatile com.bumptech.glide.j f339509b;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f339512e;

    /* renamed from: f, reason: collision with root package name */
    public final b f339513f;

    /* renamed from: c, reason: collision with root package name */
    @k0
    public final HashMap f339510c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @k0
    public final HashMap f339511d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final C20199a<View, Fragment> f339514g = new C20199a<>();

    /* renamed from: h, reason: collision with root package name */
    public final C20199a<View, android.app.Fragment> f339515h = new C20199a<>();

    /* compiled from: RequestManagerRetriever.java */
    public class a implements b {
        @Override // com.bumptech.glide.manager.l.b
        @N
        public final com.bumptech.glide.j a(@N com.bumptech.glide.b bVar, @N h hVar, @N m mVar, @N Context context) {
            return new com.bumptech.glide.j(bVar, hVar, mVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
        @N
        com.bumptech.glide.j a(@N com.bumptech.glide.b bVar, @N h hVar, @N m mVar, @N Context context);
    }

    public l() {
        new Bundle();
        this.f339513f = f339508i;
        this.f339512e = new Handler(Looper.getMainLooper(), this);
    }

    @P
    public static Activity a(@N Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    @Deprecated
    public static void b(@N FragmentManager fragmentManager, @N C20199a c20199a) {
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                c20199a.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), c20199a);
            }
        }
    }

    public static void c(@P List list, @N C20199a c20199a) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                c20199a.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager().P(), c20199a);
            }
        }
    }

    public static boolean g(Context context) {
        Activity activityA = a(context);
        return activityA == null || !activityA.isFinishing();
    }

    @N
    public final com.bumptech.glide.j d(@N Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = com.bumptech.glide.util.m.f339649a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof ActivityC22955m) {
                ActivityC22955m activityC22955m = (ActivityC22955m) context;
                if (com.bumptech.glide.util.m.h()) {
                    return d(activityC22955m.getApplicationContext());
                }
                if (activityC22955m.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                SupportRequestManagerFragment supportRequestManagerFragmentF = f(activityC22955m.getSupportFragmentManager(), null, g(activityC22955m));
                com.bumptech.glide.j jVar = supportRequestManagerFragmentF.f339489j0;
                if (jVar != null) {
                    return jVar;
                }
                com.bumptech.glide.j jVarA = this.f339513f.a(com.bumptech.glide.b.b(activityC22955m), supportRequestManagerFragmentF.f339485f0, supportRequestManagerFragmentF.f339486g0, activityC22955m);
                supportRequestManagerFragmentF.f339489j0 = jVarA;
                return jVarA;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (com.bumptech.glide.util.m.h()) {
                    return d(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                k kVarE = e(activity.getFragmentManager(), null, g(activity));
                com.bumptech.glide.j jVar2 = kVarE.f339504e;
                if (jVar2 != null) {
                    return jVar2;
                }
                com.bumptech.glide.j jVarA2 = this.f339513f.a(com.bumptech.glide.b.b(activity), kVarE.f339501b, kVarE.f339502c, activity);
                kVarE.f339504e = jVarA2;
                return jVarA2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f339509b == null) {
            synchronized (this) {
                try {
                    if (this.f339509b == null) {
                        this.f339509b = this.f339513f.a(com.bumptech.glide.b.b(context.getApplicationContext()), new com.bumptech.glide.manager.b(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f339509b;
    }

    @N
    public final k e(@N FragmentManager fragmentManager, @P android.app.Fragment fragment, boolean z12) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar != null) {
            return kVar;
        }
        HashMap map = this.f339510c;
        k kVar2 = (k) map.get(fragmentManager);
        if (kVar2 == null) {
            kVar2 = new k();
            kVar2.f339506g = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                kVar2.a(fragment.getActivity());
            }
            if (z12) {
                kVar2.f339501b.c();
            }
            map.put(fragmentManager, kVar2);
            fragmentManager.beginTransaction().add(kVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f339512e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar2;
    }

    @N
    public final SupportRequestManagerFragment f(@N androidx.fragment.app.FragmentManager fragmentManager, @P Fragment fragment, boolean z12) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.H("com.bumptech.glide.manager");
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        HashMap map = this.f339511d;
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) map.get(fragmentManager);
        if (supportRequestManagerFragment2 == null) {
            supportRequestManagerFragment2 = new SupportRequestManagerFragment();
            supportRequestManagerFragment2.f339490k0 = fragment;
            if (fragment != null && fragment.getContext() != null) {
                Fragment parentFragment = fragment;
                while (parentFragment.getParentFragment() != null) {
                    parentFragment = parentFragment.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = parentFragment.getFragmentManager();
                if (fragmentManager2 != null) {
                    supportRequestManagerFragment2.b5(fragment.getContext(), fragmentManager2);
                }
            }
            if (z12) {
                supportRequestManagerFragment2.f339485f0.c();
            }
            map.put(fragmentManager, supportRequestManagerFragment2);
            H hE2 = fragmentManager.e();
            hE2.j(0, supportRequestManagerFragment2, "com.bumptech.glide.manager", 1);
            hE2.f();
            this.f339512e.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i12 = message.what;
        boolean z12 = true;
        if (i12 == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.f339510c.remove(obj);
        } else {
            if (i12 != 2) {
                obj3 = null;
                z12 = false;
                obj2 = null;
                if (z12 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Objects.toString(obj2);
                }
                return z12;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            objRemove = this.f339511d.remove(obj);
        }
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z12) {
            Objects.toString(obj2);
        }
        return z12;
    }
}
