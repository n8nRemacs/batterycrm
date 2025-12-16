package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import j.N;
import j.P;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes5.dex */
public class k extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.a f339501b;

    /* renamed from: c, reason: collision with root package name */
    public final m f339502c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f339503d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public com.bumptech.glide.j f339504e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public k f339505f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public Fragment f339506g;

    /* compiled from: RequestManagerFragment.java */
    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        com.bumptech.glide.manager.a aVar = new com.bumptech.glide.manager.a();
        this.f339502c = new a();
        this.f339503d = new HashSet();
        this.f339501b = aVar;
    }

    public final void a(@N Activity activity) {
        k kVar = this.f339505f;
        if (kVar != null) {
            kVar.f339503d.remove(this);
            this.f339505f = null;
        }
        l lVar = com.bumptech.glide.b.b(activity).f338687g;
        lVar.getClass();
        k kVarE = lVar.e(activity.getFragmentManager(), null, l.g(activity));
        this.f339505f = kVarE;
        if (equals(kVarE)) {
            return;
        }
        this.f339505f.f339503d.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.bumptech.glide.manager.a aVar = this.f339501b;
        aVar.f339494c = true;
        Iterator it = com.bumptech.glide.util.m.d(aVar.f339492a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
        k kVar = this.f339505f;
        if (kVar != null) {
            kVar.f339503d.remove(this);
            this.f339505f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        k kVar = this.f339505f;
        if (kVar != null) {
            kVar.f339503d.remove(this);
            this.f339505f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f339501b.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        com.bumptech.glide.manager.a aVar = this.f339501b;
        aVar.f339493b = false;
        Iterator it = com.bumptech.glide.util.m.d(aVar.f339492a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f339506g;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
