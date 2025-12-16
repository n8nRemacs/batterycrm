package com.avito.android.messenger.conversation.create.di;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.data.C31699g;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31693a;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31697e;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31706n;
import com.avito.android.messenger.channels.mvi.data.K;
import com.avito.android.messenger.channels.mvi.data.W;
import com.avito.android.messenger.channels.mvi.data.c0;
import com.avito.android.messenger.channels.mvi.data.e0;
import com.avito.android.messenger.channels.mvi.data.r;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.channels.mvi.di.P;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.conversation.create.CreateChannelFragment;
import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import com.avito.android.messenger.conversation.create.di.a;
import com.avito.android.messenger.conversation.create.m;
import com.avito.android.messenger.conversation.create.o;
import com.avito.android.messenger.conversation.mvi.data.C32017f;
import com.avito.android.messenger.conversation.mvi.data.C32023l;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j;
import com.avito.android.messenger.di.M1;
import com.avito.android.messenger.di.O1;
import com.avito.android.messenger.di.Q1;
import com.avito.android.messenger.di.S1;
import com.avito.android.messenger.di.V1;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCreateChannelFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class e {

    /* compiled from: DaggerCreateChannelFragmentComponent.java */
    public static final class b implements a.InterfaceC5590a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.messenger.conversation.create.di.b f189528a;

        /* renamed from: b, reason: collision with root package name */
        public CreateChannelFragment f189529b;

        /* renamed from: c, reason: collision with root package name */
        public CreateChannelPresenter.State f189530c;

        public b() {
        }

        @Override // com.avito.android.messenger.conversation.create.di.a.InterfaceC5590a
        public final a.InterfaceC5590a a(CreateChannelFragment createChannelFragment) {
            this.f189529b = createChannelFragment;
            return this;
        }

        @Override // com.avito.android.messenger.conversation.create.di.a.InterfaceC5590a
        public final a.InterfaceC5590a b(CreateChannelPresenter.State state) {
            this.f189530c = state;
            return this;
        }

        @Override // com.avito.android.messenger.conversation.create.di.a.InterfaceC5590a
        public final com.avito.android.messenger.conversation.create.di.a build() {
            t.a(com.avito.android.messenger.conversation.create.di.b.class, this.f189528a);
            t.a(Fragment.class, this.f189529b);
            t.a(CreateChannelPresenter.State.class, this.f189530c);
            return new c(this.f189528a, this.f189529b, this.f189530c, null);
        }

        @Override // com.avito.android.messenger.conversation.create.di.a.InterfaceC5590a
        public final a.InterfaceC5590a c(com.avito.android.messenger.conversation.create.di.b bVar) {
            this.f189528a = bVar;
            return this;
        }
    }

    /* compiled from: DaggerCreateChannelFragmentComponent.java */
    public static final class c implements com.avito.android.messenger.conversation.create.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final Fragment f189531a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.create.di.b f189532b;

        /* renamed from: c, reason: collision with root package name */
        public final u<w0> f189533c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f189534d;

        /* renamed from: e, reason: collision with root package name */
        public final u<MessengerDatabase> f189535e;

        /* renamed from: f, reason: collision with root package name */
        public final M1 f189536f;

        /* renamed from: g, reason: collision with root package name */
        public final Q1 f189537g;

        /* renamed from: h, reason: collision with root package name */
        public final V1 f189538h;

        /* renamed from: i, reason: collision with root package name */
        public final S1 f189539i;

        /* renamed from: j, reason: collision with root package name */
        public final O1 f189540j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC32019h> f189541k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC32021j> f189542l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC31706n> f189543m;

        /* renamed from: n, reason: collision with root package name */
        public final u<c0> f189544n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC31693a> f189545o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC31697e> f189546p;

        /* renamed from: q, reason: collision with root package name */
        public final u<r> f189547q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ChannelSyncAgent> f189548r;

        /* renamed from: s, reason: collision with root package name */
        public final u<Context> f189549s;

        /* renamed from: t, reason: collision with root package name */
        public final u<C30277e1> f189550t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28373a> f189551u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC32012a> f189552v;

        /* renamed from: w, reason: collision with root package name */
        public final m f189553w;

        /* renamed from: x, reason: collision with root package name */
        public final u<MessengerSuccessRateTracker> f189554x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.create.r f189555y;

        /* renamed from: z, reason: collision with root package name */
        public final u<N> f189556z;

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189557a;

            public a(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189557a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f189557a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class b implements u<InterfaceC31693a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189558a;

            public b(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189558a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f189558a.x3();
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.create.di.e$c$c, reason: collision with other inner class name */
        public static final class C5591c implements u<InterfaceC31706n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189559a;

            public C5591c(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189559a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f189559a.P3();
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class d implements u<ChannelSyncAgent> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189560a;

            public d(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189560a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ChannelSyncAgent channelSyncAgentL6 = this.f189560a.L6();
                t.c(channelSyncAgentL6);
                return channelSyncAgentL6;
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        /* renamed from: com.avito.android.messenger.conversation.create.di.e$c$e, reason: collision with other inner class name */
        public static final class C5592e implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189561a;

            public C5592e(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189561a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f189561a.g();
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class f implements u<InterfaceC32019h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189562a;

            public f(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189562a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f189562a.p1();
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class g implements u<MessengerDatabase> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189563a;

            public g(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189563a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerDatabase messengerDatabaseW0 = this.f189563a.W0();
                t.c(messengerDatabaseW0);
                return messengerDatabaseW0;
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class h implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189564a;

            public h(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189564a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f189564a.C();
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class i implements u<MessengerSuccessRateTracker> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189565a;

            public i(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189565a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerSuccessRateTracker messengerSuccessRateTrackerQ7 = this.f189565a.Q7();
                t.c(messengerSuccessRateTrackerQ7);
                return messengerSuccessRateTrackerQ7;
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class j implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189566a;

            public j(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189566a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f189566a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCreateChannelFragmentComponent.java */
        public static final class k implements u<w0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.messenger.conversation.create.di.b f189567a;

            public k(com.avito.android.messenger.conversation.create.di.b bVar) {
                this.f189567a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                w0 w0VarK0 = this.f189567a.k0();
                t.c(w0VarK0);
                return w0VarK0;
            }
        }

        public c(com.avito.android.messenger.conversation.create.di.b bVar, Fragment fragment, CreateChannelPresenter.State state, a aVar) {
            this.f189531a = fragment;
            this.f189532b = bVar;
            this.f189533c = new k(bVar);
            this.f189534d = new j(bVar);
            g gVar = new g(bVar);
            this.f189535e = gVar;
            this.f189536f = new M1(gVar);
            this.f189537g = new Q1(gVar);
            this.f189538h = new V1(gVar);
            this.f189539i = new S1(gVar);
            this.f189540j = new O1(gVar);
            this.f189542l = B.a(new C32023l(new f(bVar)));
            C5591c c5591c = new C5591c(bVar);
            this.f189543m = c5591c;
            u<c0> uVarA = B.a(new e0(c5591c));
            this.f189544n = uVarA;
            u<InterfaceC31697e> uVarA2 = B.a(new C31699g(uVarA, new b(bVar), this.f189542l, this.f189543m));
            this.f189546p = uVarA2;
            this.f189547q = B.a(new K(uVarA2, this.f189536f, this.f189537g, this.f189538h, this.f189539i, this.f189540j));
            this.f189548r = new d(bVar);
            u<InterfaceC32012a> uVarA3 = B.a(new C32017f(new C5592e(bVar), new h(bVar), new a(bVar), this.f189535e, this.f189534d));
            this.f189552v = uVarA3;
            this.f189553w = new m(this.f189533c, this.f189534d, this.f189547q, this.f189548r, new W(this.f189537g, uVarA3));
            this.f189554x = new i(bVar);
            this.f189555y = new com.avito.android.messenger.conversation.create.r(this.f189553w, this.f189554x, l.a(state), this.f189534d);
            q.b bVarA = q.a(1);
            bVarA.a(o.class, this.f189555y);
            this.f189556z = B.a(new P(bVarA.b()));
        }

        @Override // com.avito.android.messenger.conversation.create.di.a
        public final void a(CreateChannelFragment createChannelFragment) {
            N n12 = this.f189556z.get();
            int i12 = com.avito.android.messenger.conversation.create.di.c.f189527a;
            createChannelFragment.f189498f0 = (CreateChannelPresenter) new P0(this.f189531a, n12).a(o.class);
            com.avito.android.messenger.conversation.create.di.b bVar = this.f189532b;
            createChannelFragment.f189499g0 = bVar.x();
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            createChannelFragment.f189500h0 = interfaceC28373aA;
            InterfaceC32572u interfaceC32572uX0 = bVar.x0();
            t.c(interfaceC32572uX0);
            createChannelFragment.f189501i0 = interfaceC32572uX0;
        }
    }

    public static a.InterfaceC5590a a() {
        return new b();
    }
}
