package com.avito.android.lib.design.tab_layout.util;

import Y61.k;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import kotlin.Metadata;

/* compiled from: ViewPagers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    public static final void a(@k ViewPager viewPager, @k AvitoTabLayout avitoTabLayout) {
        viewPager.c(new c.l(avitoTabLayout));
        avitoTabLayout.a(new c.n(viewPager));
    }

    public static final void b(@k ViewPager2 viewPager2, @k c cVar) {
        viewPager2.e(new com.avito.android.lib.design.tab_layout.util.a(new c.l(cVar)));
        cVar.a(new a(viewPager2));
    }

    /* compiled from: ViewPagers.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/tab_layout/util/b$a", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f180918a;

        public a(ViewPager2 viewPager2) {
            this.f180918a = viewPager2;
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@k c.i iVar) {
            this.f180918a.setCurrentItem(iVar.f180895d);
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(@k c.i iVar) {
        }
    }
}
