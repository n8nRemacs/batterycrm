package com.avito.android.messenger.conversation.mvi.context;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.conversation.chat_header.a;
import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.util.C35971x;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/f0;", "Lcom/avito/android/messenger/conversation/mvi/context/d0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f0 implements d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f190370h = {m0.f406844a.f(new kotlin.jvm.internal.a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/context/ChannelContextView$State;", f0.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f190371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> f190372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.analytics.b f190373d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C35971x f190374e = new C35971x();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.chat_header.a f190375f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f190376g;

    public f0(@Y61.k ViewGroup viewGroup, @Y61.k io.reactivex.rxjava3.core.z<G0> zVar, @Y61.k io.reactivex.rxjava3.core.z<Boolean> zVar2, @Y61.k com.avito.android.messenger.conversation.analytics.b bVar, @Y61.k C30277e1 c30277e1) {
        com.avito.android.messenger.conversation.chat_header.a aVarA;
        this.f190371b = zVar;
        this.f190372c = zVar2;
        this.f190373d = bVar;
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[15];
        if (((Boolean) c30277e1.f145033q.a().invoke()).booleanValue()) {
            a.C5582a c5582a = com.avito.android.messenger.conversation.chat_header.a.f189376a;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.channel_header_redesign);
            c5582a.getClass();
            aVarA = new com.avito.android.messenger.conversation.chat_header.f(viewGroup2);
        } else {
            a.C5582a c5582a2 = com.avito.android.messenger.conversation.chat_header.a.f189376a;
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.channel_header);
            c5582a2.getClass();
            aVarA = a.C5582a.a(constraintLayout);
        }
        aVarA.show();
        this.f190375f = aVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final d0.c a(com.avito.android.mvi.e<d0.c> eVar) {
        C35971x c35971x = this.f190374e;
        kotlin.reflect.n<Object> nVar = f190370h[0];
        return (d0.c) c35971x.f319122b;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.avito.android.messenger.conversation.mvi.context.d0$c] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        C35971x c35971x = this.f190374e;
        kotlin.reflect.n<Object> nVar = f190370h[0];
        c35971x.f319122b = (d0.c) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<d0.c> eVar, d0.c cVar, d0.c cVar2) {
        a.b c5584b;
        d0.c cVar3 = cVar;
        d0.c cVar4 = cVar2;
        com.avito.android.messenger.conversation.analytics.b bVar = this.f190373d;
        bVar.t();
        d0.b f190355d = cVar4.getF190355d();
        if (f190355d instanceof d0.b.c) {
            c5584b = new a.b.C5584b(((d0.b.c) cVar4.getF190355d()).f190302a, ((d0.b.c) cVar4.getF190355d()).f190303b, ((d0.b.c) cVar4.getF190355d()).f190304c, ((d0.b.c) cVar4.getF190355d()).f190305d);
        } else if (kotlin.jvm.internal.L.f(f190355d, d0.b.a.f190300a)) {
            c5584b = new a.b.C5584b(null, null, null, null, 15, null);
        } else {
            if (!kotlin.jvm.internal.L.f(f190355d, d0.b.C5635b.f190301a)) {
                throw new NoWhenBranchMatchedException();
            }
            c5584b = a.b.C5583a.f189378a;
        }
        a.b bVar2 = c5584b;
        a.d dVar = new a.d(cVar4.getF190352a(), cVar4.getF190354c(), bVar2, cVar4.getF190357f(), cVar4.getF190358g(), cVar4.getF190359h(), cVar4.getF190353b(), cVar4.getF190356e(), cVar4.getF190360i(), cVar4.getF190362k(), cVar4.getF190363l(), cVar4.getF190361j(), cVar4.getF190364m(), cVar4.getF190365n(), cVar4.getF190366o());
        com.avito.android.messenger.conversation.chat_header.a aVar = this.f190375f;
        aVar.fa(dVar);
        d0.b f190355d2 = cVar3 != null ? cVar3.getF190355d() : null;
        d0.b.c cVar5 = f190355d2 instanceof d0.b.c ? (d0.b.c) f190355d2 : null;
        DeepLink deepLink = cVar5 != null ? cVar5.f190306e : null;
        d0.b f190355d3 = cVar4.getF190355d();
        d0.b.c cVar6 = f190355d3 instanceof d0.b.c ? (d0.b.c) f190355d3 : null;
        if (!kotlin.jvm.internal.L.f(cVar6 != null ? cVar6.f190306e : null, deepLink)) {
            aVar.j2();
        }
        if (c5584b instanceof a.b.C5584b) {
            io.reactivex.rxjava3.internal.observers.y yVar = this.f190376g;
            if (yVar == null || yVar.getF318621e()) {
                this.f190376g = (io.reactivex.rxjava3.internal.observers.y) this.f190372c.q0(1L).D(io.reactivex.rxjava3.internal.functions.a.f401991a).j0(io.reactivex.rxjava3.android.schedulers.b.b()).A0(this.f190371b).t0(new e0(this));
            }
        } else {
            io.reactivex.rxjava3.internal.observers.y yVar2 = this.f190376g;
            if (yVar2 != null) {
                DisposableHelper.a(yVar2);
            }
        }
        bVar.n();
    }
}
