package com.avito.android.extended_profile.di;

import Hr.InterfaceC14024a;
import com.avito.android.extended_profile.ExtendedProfileActivity;
import com.avito.android.extended_profile.di.InterfaceC30423c;

/* compiled from: DaggerExtendedProfileActivityComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.extended_profile.di.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30396a {

    /* compiled from: DaggerExtendedProfileActivityComponent.java */
    /* renamed from: com.avito.android.extended_profile.di.a$b */
    public static final class b implements InterfaceC30423c {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC30424d f149551a;

        public b(InterfaceC30424d interfaceC30424d, C4387a c4387a) {
            this.f149551a = interfaceC30424d;
        }

        @Override // com.avito.android.extended_profile.di.InterfaceC30423c
        public final void a(ExtendedProfileActivity extendedProfileActivity) {
            InterfaceC14024a interfaceC14024aL = this.f149551a.L();
            dagger.internal.t.c(interfaceC14024aL);
            extendedProfileActivity.f149277m = interfaceC14024aL;
        }
    }

    /* compiled from: DaggerExtendedProfileActivityComponent.java */
    /* renamed from: com.avito.android.extended_profile.di.a$c */
    public static final class c implements InterfaceC30423c.a {
        public c() {
        }

        @Override // com.avito.android.extended_profile.di.InterfaceC30423c.a
        public final InterfaceC30423c a(InterfaceC30424d interfaceC30424d) {
            return new b(interfaceC30424d, null);
        }
    }

    public static InterfaceC30423c.a a() {
        return new c();
    }
}
