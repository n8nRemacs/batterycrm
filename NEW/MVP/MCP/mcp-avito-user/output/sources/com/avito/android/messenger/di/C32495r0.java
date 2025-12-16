package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.di.x2;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: DaggerVoiceMessageServiceComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.di.r0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32495r0 {

    /* compiled from: DaggerVoiceMessageServiceComponent.java */
    /* renamed from: com.avito.android.messenger.di.r0$b */
    public static final class b implements x2.a {

        /* renamed from: a, reason: collision with root package name */
        public y2 f196286a;

        public b() {
        }

        @Override // com.avito.android.messenger.di.x2.a
        public final x2.a a(y2 y2Var) {
            this.f196286a = y2Var;
            return this;
        }

        @Override // com.avito.android.messenger.di.x2.a
        public final x2 build() {
            dagger.internal.t.a(y2.class, this.f196286a);
            return new c(this.f196286a, null);
        }
    }

    /* compiled from: DaggerVoiceMessageServiceComponent.java */
    /* renamed from: com.avito.android.messenger.di.r0$c */
    public static final class c implements x2 {

        /* renamed from: a, reason: collision with root package name */
        public final y2 f196287a;

        public c(y2 y2Var, a aVar) {
            this.f196287a = y2Var;
        }

        @Override // com.avito.android.messenger.di.x2
        public final void a(com.avito.android.messenger.service.media_session.a aVar) {
            y2 y2Var = this.f196287a;
            com.avito.android.messenger.w0 w0VarK0 = y2Var.k0();
            dagger.internal.t.c(w0VarK0);
            aVar.f197265k = w0VarK0;
            InterfaceC32024m interfaceC32024mP1 = y2Var.P1();
            dagger.internal.t.c(interfaceC32024mP1);
            aVar.f197266l = interfaceC32024mP1;
            InterfaceC35745a5 interfaceC35745a5D = y2Var.d();
            dagger.internal.t.c(interfaceC35745a5D);
            aVar.f197267m = interfaceC35745a5D;
        }
    }

    public static x2.a a() {
        return new b();
    }
}
