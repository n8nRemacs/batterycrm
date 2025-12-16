package com.avito.android.fps;

import Y61.k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;

/* compiled from: FramesListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fps/c;", "Landroidx/fragment/app/FragmentManager$n;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends FragmentManager.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f158623a;

    public c(e eVar) {
        this.f158623a = eVar;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentResumed(@k FragmentManager fragmentManager, @k Fragment fragment) {
        e eVar = this.f158623a;
        eVar.f158631g = kotlin.math.b.c(eVar.f158627c.a());
    }
}
