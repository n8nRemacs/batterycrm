package com.avito.android.profile.remove.screen.get_money.di;

import androidx.fragment.app.Fragment;
import com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyFragment;
import com.avito.android.profile.remove.screen.get_money.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerHowToReturnMoneyComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerHowToReturnMoneyComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile.remove.screen.get_money.di.b.a
        public final com.avito.android.profile.remove.screen.get_money.di.b a(HowToReturnMoneyFragment howToReturnMoneyFragment, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, howToReturnMoneyFragment, null);
        }
    }

    /* compiled from: DaggerHowToReturnMoneyComponent.java */
    public static final class c implements com.avito.android.profile.remove.screen.get_money.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f224056a;

        public c(cv.b bVar, Fragment fragment, C6788a c6788a) {
            this.f224056a = bVar;
        }

        @Override // com.avito.android.profile.remove.screen.get_money.di.b
        public final void a(HowToReturnMoneyFragment howToReturnMoneyFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f224056a.u4();
            t.c(aVarU4);
            howToReturnMoneyFragment.f224047n0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
