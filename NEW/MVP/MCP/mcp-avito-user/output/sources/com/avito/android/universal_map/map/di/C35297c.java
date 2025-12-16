package com.avito.android.universal_map.map.di;

import com.avito.android.universal_map.UniversalMapActivity;
import com.avito.android.universal_map.map.di.r;

/* compiled from: DaggerUniversalMapActivityComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.universal_map.map.di.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35297c {

    /* compiled from: DaggerUniversalMapActivityComponent.java */
    /* renamed from: com.avito.android.universal_map.map.di.c$b */
    public static final class b implements r.a {
        public b() {
        }

        @Override // com.avito.android.universal_map.map.di.r.a
        public final r a(InterfaceC35312s interfaceC35312s) {
            return new C9364c(interfaceC35312s, null);
        }
    }

    /* compiled from: DaggerUniversalMapActivityComponent.java */
    /* renamed from: com.avito.android.universal_map.map.di.c$c, reason: collision with other inner class name */
    public static final class C9364c implements r {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC35312s f305045a;

        public C9364c(InterfaceC35312s interfaceC35312s, a aVar) {
            this.f305045a = interfaceC35312s;
        }

        @Override // com.avito.android.universal_map.map.di.r
        public final void a(UniversalMapActivity universalMapActivity) {
            universalMapActivity.f304736m = this.f305045a.y4();
        }
    }

    public static r.a a() {
        return new b();
    }
}
