package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import j.N;
import j.P;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes10.dex */
class c extends FragmentManager.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f55084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f55085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f55086c;

    public c(b bVar, Fragment fragment, FrameLayout frameLayout) {
        this.f55086c = bVar;
        this.f55084a = fragment;
        this.f55085b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentViewCreated(@N FragmentManager fragmentManager, @N Fragment fragment, @N View view, @P Bundle bundle) {
        if (fragment == this.f55084a) {
            fragmentManager.v0(this);
            this.f55086c.getClass();
            b.j(view, this.f55085b);
        }
    }
}
