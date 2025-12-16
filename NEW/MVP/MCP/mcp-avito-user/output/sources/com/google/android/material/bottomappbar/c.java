package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j.N;

/* compiled from: BottomAppBar.java */
/* loaded from: classes6.dex */
class c extends FloatingActionButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f355946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f355947b;

    /* compiled from: BottomAppBar.java */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = c.this.f355947b;
            int i12 = BottomAppBar.f355921j0;
        }
    }

    public c(BottomAppBar bottomAppBar, int i12) {
        this.f355947b = bottomAppBar;
        this.f355946a = i12;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(@N FloatingActionButton floatingActionButton) {
        int i12 = BottomAppBar.f355921j0;
        floatingActionButton.setTranslationX(this.f355947b.D(this.f355946a));
        floatingActionButton.l(new a(), true);
    }
}
