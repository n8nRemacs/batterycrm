package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.sync.MessageIsReadMarkerWorker;
import com.avito.android.messenger.di.J0;

/* compiled from: DaggerMessageIsReadMarkerComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.di.o0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32487o0 {

    /* compiled from: DaggerMessageIsReadMarkerComponent.java */
    /* renamed from: com.avito.android.messenger.di.o0$b */
    public static final class b implements J0.a {
        public b() {
        }

        @Override // com.avito.android.messenger.di.J0.a
        public final J0 a(K0 k02) {
            return new c(k02, null);
        }
    }

    /* compiled from: DaggerMessageIsReadMarkerComponent.java */
    /* renamed from: com.avito.android.messenger.di.o0$c */
    public static final class c implements J0 {

        /* renamed from: a, reason: collision with root package name */
        public final K0 f196164a;

        public c(K0 k02, a aVar) {
            this.f196164a = k02;
        }

        @Override // com.avito.android.messenger.di.J0
        public final void a(MessageIsReadMarkerWorker messageIsReadMarkerWorker) {
            K0 k02 = this.f196164a;
            com.avito.android.messenger.channels.mvi.sync.F0 f0Sm = k02.sm();
            dagger.internal.t.c(f0Sm);
            messageIsReadMarkerWorker.f194621b = f0Sm;
            com.avito.android.notification.m mVarA0 = k02.A0();
            dagger.internal.t.c(mVarA0);
            messageIsReadMarkerWorker.f194622c = mVarA0;
        }
    }

    public static J0.a a() {
        return new b();
    }
}
