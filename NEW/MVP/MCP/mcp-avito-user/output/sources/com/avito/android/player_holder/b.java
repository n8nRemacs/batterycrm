package com.avito.android.player_holder;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.util.R0;
import com.google.android.exoplayer2.AbstractC36510e;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: PlayerHolderImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player_holder/b;", "Lcom/avito/android/player_holder/a;", "_avito_player-holder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.player_holder.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f220318a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f220319b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f220320c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f220321d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC36534o f220322e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC36534o f220323f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public StyledPlayerView f220324g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public StyledPlayerView f220325h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public String f220326i;

    /* compiled from: PlayerHolderImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.player_holder.PlayerHolderImpl$1", f = "PlayerHolderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b bVar = b.this;
            bVar.f220322e = new InterfaceC36534o.c(bVar.f220318a.getApplicationContext()).a();
            if (bVar.f220323f == null) {
                bVar.f220323f = new InterfaceC36534o.c(bVar.f220318a.getApplicationContext()).a();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PlayerHolderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/exoplayer2/d0$g;", "invoke", "()Lcom/google/android/exoplayer2/d0$g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.player_holder.b$b, reason: collision with other inner class name */
    public static final class C6625b extends N implements Y41.a<d0.g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d0.g f220328l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6625b(d0.g gVar) {
            super(0);
            this.f220328l = gVar;
        }

        @Override // Y41.a
        public final d0.g invoke() {
            return this.f220328l;
        }
    }

    @Inject
    public b(@k Context context, @k R0 r02) {
        this.f220318a = context;
        C43259k.d(U.a(r02.b()), null, null, new a(null), 3);
    }

    @Override // com.avito.android.player_holder.a
    @l
    /* renamed from: A, reason: from getter */
    public final String getF220326i() {
        return this.f220326i;
    }

    @Override // com.avito.android.player_holder.a
    public final void B(@k Y41.l<? super InterfaceC36534o, G0> lVar) {
        InterfaceC36534o interfaceC36534o = this.f220322e;
        if (interfaceC36534o == null) {
            interfaceC36534o = null;
        }
        lVar.invoke(interfaceC36534o);
    }

    @Override // com.avito.android.player_holder.a
    public final void C() {
        d0 d0Var = this.f220322e;
        if (d0Var == null) {
            d0Var = null;
        }
        ((AbstractC36510e) d0Var).setPlayWhenReady(true);
    }

    @Override // com.avito.android.player_holder.a
    public final void D(@k String str) {
        LinkedHashMap linkedHashMap = this.f220320c;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC36534o interfaceC36534o = this.f220322e;
            if (interfaceC36534o != null) {
                interfaceC36534o = interfaceC36534o;
            }
            interfaceC36534o.s((d0.g) entry.getValue());
        }
        if (linkedHashMap.get(str) != null) {
            InterfaceC36534o interfaceC36534o2 = this.f220322e;
            (interfaceC36534o2 != null ? interfaceC36534o2 : null).N((d0.g) linkedHashMap.get(str));
        }
    }

    @Override // com.avito.android.player_holder.a
    public final void E(@k StyledPlayerView styledPlayerView) {
        if (styledPlayerView.equals(this.f220324g)) {
            return;
        }
        StyledPlayerView styledPlayerView2 = this.f220324g;
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(null);
        }
        InterfaceC36534o interfaceC36534o = this.f220323f;
        styledPlayerView.setPlayer(interfaceC36534o != null ? interfaceC36534o : null);
        this.f220324g = styledPlayerView;
    }

    @Override // com.avito.android.player_holder.a
    public final void F(@k StyledPlayerView styledPlayerView) {
        if (L.f(this.f220325h, styledPlayerView)) {
            StyledPlayerView styledPlayerView2 = this.f220325h;
            if (styledPlayerView2 != null) {
                styledPlayerView2.setPlayer(null);
            }
            this.f220325h = null;
        }
    }

    @Override // com.avito.android.player_holder.a
    public final void G() {
        d0 d0Var = this.f220322e;
        if (d0Var == null) {
            d0Var = null;
        }
        ((AbstractC36510e) d0Var).setPlayWhenReady(false);
    }

    @Override // com.avito.android.player_holder.a
    public final void H(@k String str, @k d0.g gVar) {
        g(str, new C6625b(gVar));
    }

    @Override // com.avito.android.player_holder.a
    public final void I(long j12) {
        d0 d0Var = this.f220322e;
        if (d0Var == null) {
            d0Var = null;
        }
        ((AbstractC36510e) d0Var).seekTo(j12);
    }

    @Override // com.avito.android.player_holder.a
    @k
    public final InterfaceC36534o J() {
        InterfaceC36534o interfaceC36534o = this.f220322e;
        if (interfaceC36534o == null) {
            return null;
        }
        return interfaceC36534o;
    }

    @Override // com.avito.android.player_holder.a
    @k
    public final InterfaceC36534o a() {
        InterfaceC36534o interfaceC36534o = this.f220323f;
        if (interfaceC36534o == null) {
            return null;
        }
        return interfaceC36534o;
    }

    @Override // com.avito.android.player_holder.a
    public final void b(@k String str) {
        LinkedHashMap linkedHashMap = this.f220319b;
        d0.g gVar = (d0.g) linkedHashMap.get(str);
        if (gVar != null) {
            InterfaceC36534o interfaceC36534o = this.f220323f;
            if (interfaceC36534o == null) {
                interfaceC36534o = null;
            }
            interfaceC36534o.s(gVar);
        }
    }

    @Override // com.avito.android.player_holder.a
    public final void c(@k String str) {
        h(str);
        LinkedHashMap linkedHashMap = this.f220321d;
        if (linkedHashMap.get(str) != null) {
            InterfaceC36534o interfaceC36534o = this.f220322e;
            if (interfaceC36534o == null) {
                interfaceC36534o = null;
            }
            interfaceC36534o.L((com.google.android.exoplayer2.analytics.b) linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
    }

    @Override // com.avito.android.player_holder.a
    public final void d(@k ArrayList arrayList) {
        d0 d0Var = this.f220323f;
        if (d0Var == null) {
            d0Var = null;
        }
        ((AbstractC36510e) d0Var).c(arrayList);
        prepare();
    }

    @Override // com.avito.android.player_holder.a
    public final void e(@k Y41.l<? super InterfaceC36534o, G0> lVar) {
        if (this.f220323f == null) {
            this.f220323f = new InterfaceC36534o.c(this.f220318a.getApplicationContext()).a();
        }
        InterfaceC36534o interfaceC36534o = this.f220323f;
        if (interfaceC36534o == null) {
            interfaceC36534o = null;
        }
        lVar.invoke(interfaceC36534o);
    }

    @Override // com.avito.android.player_holder.a
    public final void f(int i12, long j12) {
        InterfaceC36534o interfaceC36534o = this.f220323f;
        if (interfaceC36534o == null) {
            interfaceC36534o = null;
        }
        interfaceC36534o.f(i12, j12);
    }

    @Override // com.avito.android.player_holder.a
    public final void g(@k String str, @k Y41.a<? extends d0.g> aVar) {
        d0.g gVarInvoke = aVar.invoke();
        LinkedHashMap linkedHashMap = this.f220319b;
        if (linkedHashMap.get(str) != null) {
            InterfaceC36534o interfaceC36534o = this.f220323f;
            if (interfaceC36534o == null) {
                interfaceC36534o = null;
            }
            interfaceC36534o.s((d0.g) linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        linkedHashMap.put(str, gVarInvoke);
        InterfaceC36534o interfaceC36534o2 = this.f220323f;
        (interfaceC36534o2 != null ? interfaceC36534o2 : null).N(gVarInvoke);
    }

    public final void h(String str) {
        LinkedHashMap linkedHashMap = this.f220320c;
        if (linkedHashMap.get(str) != null) {
            InterfaceC36534o interfaceC36534o = this.f220322e;
            if (interfaceC36534o == null) {
                interfaceC36534o = null;
            }
            interfaceC36534o.s((d0.g) linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
    }

    @Override // com.avito.android.player_holder.a
    public final void pause() {
        d0 d0Var = this.f220323f;
        if (d0Var == null) {
            d0Var = null;
        }
        ((AbstractC36510e) d0Var).setPlayWhenReady(false);
    }

    @Override // com.avito.android.player_holder.a
    public final void play() {
        d0 d0Var = this.f220323f;
        if (d0Var == null) {
            d0Var = null;
        }
        ((AbstractC36510e) d0Var).setPlayWhenReady(true);
    }

    @Override // com.avito.android.player_holder.a
    public final void prepare() {
        InterfaceC36534o interfaceC36534o = this.f220323f;
        if (interfaceC36534o == null) {
            interfaceC36534o = null;
        }
        interfaceC36534o.prepare();
    }

    @Override // com.avito.android.player_holder.a
    public final void r(@k O o12) {
        d0 d0Var = this.f220323f;
        if (d0Var == null) {
            d0Var = null;
        }
        ((AbstractC36510e) d0Var).r(o12);
        prepare();
    }

    @Override // com.avito.android.player_holder.a
    public final void s() {
        InterfaceC36534o interfaceC36534o = this.f220323f;
        if (interfaceC36534o == null) {
            interfaceC36534o = null;
        }
        interfaceC36534o.M();
        InterfaceC36534o interfaceC36534o2 = this.f220323f;
        ((AbstractC36510e) (interfaceC36534o2 != null ? interfaceC36534o2 : null)).I();
    }

    @Override // com.avito.android.player_holder.a
    public final void t(@k String str, @k d0.g gVar) {
        h(str);
        this.f220320c.put(str, gVar);
        InterfaceC36534o interfaceC36534o = this.f220322e;
        if (interfaceC36534o == null) {
            interfaceC36534o = null;
        }
        interfaceC36534o.N(gVar);
    }

    @Override // com.avito.android.player_holder.a
    public final void u(@k StyledPlayerView styledPlayerView) {
        if (L.f(this.f220324g, styledPlayerView)) {
            this.f220324g = null;
        }
    }

    @Override // com.avito.android.player_holder.a
    public final void v(@l String str) {
        this.f220326i = str;
    }

    @Override // com.avito.android.player_holder.a
    public final void w(@k StyledPlayerView styledPlayerView) {
        StyledPlayerView styledPlayerView2 = this.f220325h;
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(null);
        }
        InterfaceC36534o interfaceC36534o = this.f220322e;
        styledPlayerView.setPlayer(interfaceC36534o != null ? interfaceC36534o : null);
        this.f220325h = styledPlayerView;
    }

    @Override // com.avito.android.player_holder.a
    public final void x(@k String str, @k com.google.android.exoplayer2.analytics.b bVar) {
        LinkedHashMap linkedHashMap = this.f220321d;
        if (linkedHashMap.get(str) != null) {
            InterfaceC36534o interfaceC36534o = this.f220322e;
            if (interfaceC36534o == null) {
                interfaceC36534o = null;
            }
            interfaceC36534o.L((com.google.android.exoplayer2.analytics.b) linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        linkedHashMap.put(str, bVar);
        InterfaceC36534o interfaceC36534o2 = this.f220322e;
        (interfaceC36534o2 != null ? interfaceC36534o2 : null).y(bVar);
    }

    @Override // com.avito.android.player_holder.a
    public final void y() {
        d0 player;
        LinkedHashMap linkedHashMap = this.f220320c;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            InterfaceC36534o interfaceC36534o = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC36534o interfaceC36534o2 = this.f220322e;
            if (interfaceC36534o2 != null) {
                interfaceC36534o = interfaceC36534o2;
            }
            interfaceC36534o.s((d0.g) entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = this.f220321d;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            InterfaceC36534o interfaceC36534o3 = this.f220322e;
            if (interfaceC36534o3 == null) {
                interfaceC36534o3 = null;
            }
            interfaceC36534o3.L((com.google.android.exoplayer2.analytics.b) entry2.getValue());
        }
        linkedHashMap.clear();
        linkedHashMap2.clear();
        StyledPlayerView styledPlayerView = this.f220325h;
        if (styledPlayerView != null && (player = styledPlayerView.getPlayer()) != null) {
            player.pause();
        }
        StyledPlayerView styledPlayerView2 = this.f220325h;
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(null);
        }
        this.f220325h = null;
    }

    @Override // com.avito.android.player_holder.a
    public final void z(@k O o12, @l y.a aVar) {
        if (aVar != null) {
            InterfaceC36534o interfaceC36534o = this.f220322e;
            if (interfaceC36534o == null) {
                interfaceC36534o = null;
            }
            interfaceC36534o.H(aVar.a(o12));
        } else {
            d0 d0Var = this.f220322e;
            if (d0Var == null) {
                d0Var = null;
            }
            ((AbstractC36510e) d0Var).r(o12);
        }
        InterfaceC36534o interfaceC36534o2 = this.f220322e;
        (interfaceC36534o2 != null ? interfaceC36534o2 : null).prepare();
    }
}
