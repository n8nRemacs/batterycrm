package com.avito.android.messenger_icebreakers_dialog.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerBottomSheetData;
import com.avito.android.messenger_icebreakers_dialog.di.b;
import com.avito.android.messenger_icebreakers_dialog.f;
import com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerMessengerIcebreakerBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMessengerIcebreakerBottomSheetComponent.java */
    public static final class b implements b.InterfaceC5822b {
        public b() {
        }

        @Override // com.avito.android.messenger_icebreakers_dialog.di.b.InterfaceC5822b
        public final com.avito.android.messenger_icebreakers_dialog.di.b a(MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment, r rVar, MessengerIcebreakerBottomSheetData messengerIcebreakerBottomSheetData, b.a aVar) {
            messengerIcebreakerBottomSheetData.getClass();
            return new c(aVar, messengerIcebreakerBottomSheetFragment, rVar, messengerIcebreakerBottomSheetData, null);
        }
    }

    /* compiled from: DaggerMessengerIcebreakerBottomSheetComponent.java */
    public static final class c implements com.avito.android.messenger_icebreakers_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final b.a f197649a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.messenger_icebreakers_dialog.mvi.b f197650b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f197651c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f197652d;

        /* renamed from: e, reason: collision with root package name */
        public final f f197653e;

        /* compiled from: DaggerMessengerIcebreakerBottomSheetComponent.java */
        /* renamed from: com.avito.android.messenger_icebreakers_dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C5821a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final b.a f197654a;

            public C5821a(b.a aVar) {
                this.f197654a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f197654a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(b.a aVar, Fragment fragment, r rVar, MessengerIcebreakerBottomSheetData messengerIcebreakerBottomSheetData, C5820a c5820a) {
            this.f197649a = aVar;
            this.f197650b = new com.avito.android.messenger_icebreakers_dialog.mvi.b(l.a(messengerIcebreakerBottomSheetData));
            this.f197651c = new C5821a(aVar);
            this.f197652d = g.d(new e(l.a(rVar), this.f197651c));
            this.f197653e = new f(new com.avito.android.messenger_icebreakers_dialog.mvi.e(this.f197650b, com.avito.android.messenger_icebreakers_dialog.mvi.g.a(), this.f197652d));
        }

        @Override // com.avito.android.messenger_icebreakers_dialog.di.b
        public final void a(MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment) {
            messengerIcebreakerBottomSheetFragment.f197676f0 = this.f197653e;
            messengerIcebreakerBottomSheetFragment.f197678h0 = this.f197652d.get();
            InterfaceC28373a interfaceC28373aA = this.f197649a.a();
            t.c(interfaceC28373aA);
            messengerIcebreakerBottomSheetFragment.f197679i0 = interfaceC28373aA;
        }
    }

    public static b.InterfaceC5822b a() {
        return new b();
    }
}
