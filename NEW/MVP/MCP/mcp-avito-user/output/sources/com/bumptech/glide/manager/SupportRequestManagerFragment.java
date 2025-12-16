package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import j.N;
import j.P;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final com.bumptech.glide.manager.a f339485f0;

    /* renamed from: g0, reason: collision with root package name */
    public final m f339486g0;

    /* renamed from: h0, reason: collision with root package name */
    public final HashSet f339487h0;

    /* renamed from: i0, reason: collision with root package name */
    @P
    public SupportRequestManagerFragment f339488i0;

    /* renamed from: j0, reason: collision with root package name */
    @P
    public com.bumptech.glide.j f339489j0;

    /* renamed from: k0, reason: collision with root package name */
    @P
    public Fragment f339490k0;

    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        com.bumptech.glide.manager.a aVar = new com.bumptech.glide.manager.a();
        this.f339486g0 = new a();
        this.f339487h0 = new HashSet();
        this.f339485f0 = aVar;
    }

    public final void b5(@N Context context, @N FragmentManager fragmentManager) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f339488i0;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f339487h0.remove(this);
            this.f339488i0 = null;
        }
        l lVar = com.bumptech.glide.b.b(context).f338687g;
        lVar.getClass();
        SupportRequestManagerFragment supportRequestManagerFragmentF = lVar.f(fragmentManager, null, l.g(context));
        this.f339488i0 = supportRequestManagerFragmentF;
        if (equals(supportRequestManagerFragmentF)) {
            return;
        }
        this.f339488i0.f339487h0.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentManager fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            b5(getContext(), fragmentManager);
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.bumptech.glide.manager.a aVar = this.f339485f0;
        aVar.f339494c = true;
        Iterator it = com.bumptech.glide.util.m.d(aVar.f339492a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
        SupportRequestManagerFragment supportRequestManagerFragment = this.f339488i0;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f339487h0.remove(this);
            this.f339488i0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f339490k0 = null;
        SupportRequestManagerFragment supportRequestManagerFragment = this.f339488i0;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f339487h0.remove(this);
            this.f339488i0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f339485f0.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.bumptech.glide.manager.a aVar = this.f339485f0;
        aVar.f339493b = false;
        Iterator it = com.bumptech.glide.util.m.d(aVar.f339492a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f339490k0;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
