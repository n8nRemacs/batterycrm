package ru.mts.biometry.sdk.base;

import A91.a;
import Ba1.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import g2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/base/b;", "Lg2/c;", "B", "Landroidx/fragment/app/Fragment;", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public abstract class b<B extends c> extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f436375f0;

    /* renamed from: g0, reason: collision with root package name */
    public c f436376g0;

    public b() {
        this(0);
    }

    public abstract c b5(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.a(requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c cVarB5 = b5(layoutInflater, viewGroup);
        this.f436376g0 = cVarB5;
        return cVarB5.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f436376g0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (this.f436375f0) {
            H91.f.a(this, new a(this));
        }
        c cVar = this.f436376g0;
        if (cVar != null) {
            d5(cVar);
        }
    }

    public /* synthetic */ b(int i12) {
        this((Object) null);
    }

    public b(Object obj) {
        this.f436375f0 = true;
    }

    public void d5(c cVar) {
    }

    public void c5(int i12, int i13) {
    }
}
