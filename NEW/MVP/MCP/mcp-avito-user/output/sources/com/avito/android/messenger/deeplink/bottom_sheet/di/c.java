package com.avito.android.messenger.deeplink.bottom_sheet.di;

import com.avito.android.messenger.deeplink.ChannelBottomSheetInputLink;
import com.avito.android.messenger.deeplink.bottom_sheet.BottomSheetInputDialogFragment;
import com.avito.android.messenger.deeplink.bottom_sheet.di.a;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.f;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.i;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.k;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.m;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerBottomSheetInputComponent.java */
@e
/* loaded from: classes15.dex */
public final class c {

    /* compiled from: DaggerBottomSheetInputComponent.java */
    public static final class b implements com.avito.android.messenger.deeplink.bottom_sheet.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<UY.a> f195465a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.messenger.deeplink.bottom_sheet.e f195466b;

        /* compiled from: DaggerBottomSheetInputComponent.java */
        public static final class a implements u<UY.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.deeplink.bottom_sheet.di.b f195467a;

            public a(com.avito.android.messenger.deeplink.bottom_sheet.di.b bVar) {
                this.f195467a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                UY.a aVarBa = this.f195467a.Ba();
                t.c(aVarBa);
                return aVarBa;
            }
        }

        public b(com.avito.android.messenger.deeplink.bottom_sheet.di.b bVar, ChannelBottomSheetInputLink channelBottomSheetInputLink, a aVar) {
            this.f195465a = new a(bVar);
            this.f195466b = new com.avito.android.messenger.deeplink.bottom_sheet.e(new i(new f(l.a(channelBottomSheetInputLink), this.f195465a), k.a(), m.a()));
        }

        @Override // com.avito.android.messenger.deeplink.bottom_sheet.di.a
        public final void a(BottomSheetInputDialogFragment bottomSheetInputDialogFragment) {
            bottomSheetInputDialogFragment.f195453h0 = this.f195466b;
        }
    }

    /* compiled from: DaggerBottomSheetInputComponent.java */
    /* renamed from: com.avito.android.messenger.deeplink.bottom_sheet.di.c$c, reason: collision with other inner class name */
    public static final class C5769c implements a.InterfaceC5768a {
        public C5769c() {
        }

        @Override // com.avito.android.messenger.deeplink.bottom_sheet.di.a.InterfaceC5768a
        public final com.avito.android.messenger.deeplink.bottom_sheet.di.a a(com.avito.android.messenger.deeplink.bottom_sheet.di.b bVar, ChannelBottomSheetInputLink channelBottomSheetInputLink) {
            return new b(bVar, channelBottomSheetInputLink, null);
        }
    }

    public static a.InterfaceC5768a a() {
        return new C5769c();
    }
}
