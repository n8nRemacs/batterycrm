package com.avito.android.extended_profile;

import androidx.viewpager.widget.ViewPager;
import fA.InterfaceC40265a;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMviView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/G;", "Landroidx/viewpager/widget/ViewPager$i;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class G implements ViewPager.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f149337b;

    public G(A a12) {
        this.f149337b = a12;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        this.f149337b.f149244d.accept(new InterfaceC40265a.g(i12));
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
    }
}
