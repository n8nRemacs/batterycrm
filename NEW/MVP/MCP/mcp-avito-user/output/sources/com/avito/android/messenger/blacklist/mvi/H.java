package com.avito.android.messenger.blacklist.mvi;

import EY.a;
import com.avito.android.messenger.blacklist.mvi.G;
import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import com.avito.android.messenger.blacklist.mvi.M;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41946e1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.BlockedUser;
import ru.avito.messenger.api.entity.context.ChannelContext;

/* compiled from: BlacklistPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/H;", "Lcom/avito/android/messenger/blacklist/mvi/G;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/blacklist/mvi/G$a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H extends AbstractC32892c<G.a> implements G {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31683m f186362V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.a f186363W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f186364X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f186365Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f186366Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f186367a0;

    /* compiled from: BlacklistPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/H$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/blacklist/mvi/G$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.mvi.rx3.with_monolithic_state.E<G.a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f186368b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<G.a> xVar, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<G.a> xVar2) {
            return (xVar instanceof b) && (xVar2 instanceof b);
        }
    }

    /* compiled from: BlacklistPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/H$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist/mvi/G$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<G.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC31683m.a f186369d;

        public b(@Y61.k InterfaceC31683m.a aVar) {
            super("NewBlacklistInteractorStateMutator", "interactorState = " + aVar);
            this.f186369d = aVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final G.a d(G.a aVar) {
            G.a.b bVar;
            InterfaceC31683m.a aVar2 = this.f186369d;
            InterfaceC31683m.a.b bVar2 = aVar2.f186471a;
            if (bVar2 instanceof InterfaceC31683m.a.b.c) {
                bVar = G.a.b.c.f186361a;
            } else if (bVar2 instanceof InterfaceC31683m.a.b.C5471b) {
                bVar = G.a.b.C5465b.f186360a;
            } else {
                if (!(bVar2 instanceof InterfaceC31683m.a.b.C5470a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = G.a.b.C5464a.f186359a;
            }
            ArrayList arrayList = new ArrayList();
            for (BlockedUser blockedUser : aVar2.f186474d) {
                String id2 = blockedUser.getUser().getId();
                String name = blockedUser.getUser().getName();
                ChannelContext context = blockedUser.getContext();
                if (!(context instanceof ChannelContext.Item)) {
                    context = null;
                }
                ChannelContext.Item item = (ChannelContext.Item) context;
                String title = item != null ? item.getTitle() : null;
                ru.avito.messenger.api.entity.context.ChannelContext context2 = blockedUser.getContext();
                if (!(context2 instanceof ChannelContext.Item)) {
                    context2 = null;
                }
                ChannelContext.Item item2 = (ChannelContext.Item) context2;
                String price = item2 != null ? item2.getPrice() : null;
                ru.avito.messenger.api.entity.context.ChannelContext context3 = blockedUser.getContext();
                if (!(context3 instanceof ChannelContext.Item)) {
                    context3 = null;
                }
                ChannelContext.Item item3 = (ChannelContext.Item) context3;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new a.C0238a(id2, name, title, price, item3 != null ? item3.getCategory() : null, aVar2.f186476f.keySet().contains(blockedUser.getUser().getId()), H.this.f186363W.a(Long.valueOf(TimeUnit.SECONDS.toMillis(blockedUser.getCreated())))));
                arrayList = arrayList2;
                bVar = bVar;
            }
            G.a.b bVar3 = bVar;
            ArrayList arrayList3 = arrayList;
            InterfaceC31683m.a.b bVar4 = aVar2.f186473c;
            if (bVar4 instanceof InterfaceC31683m.a.b.c) {
                arrayList3.add(a.b.f4067b);
            }
            return new G.a(bVar3, aVar2.f186472b instanceof InterfaceC31683m.a.b.c, aVar2.f186475e && bVar4 == InterfaceC31683m.a.b.C5471b.f186478a, arrayList3);
        }
    }

    public H() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public H(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC31683m interfaceC31683m, @Y61.k com.avito.android.date_time_formatter.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        com.avito.android.mvi.rx3.with_monolithic_state.F f12 = new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0);
        G.a.f186353e.getClass();
        super("BlacklistPresenter", G.a.f186354f, interfaceC35745a5, a.f186368b, f12, null, null, null, 224, null);
        this.f186362V = interfaceC31683m;
        this.f186363W = aVar;
        this.f186364X = interfaceC35741a1;
        this.f186365Y = new com.avito.android.util.architecture_components.D<>();
        this.f186366Z = new com.avito.android.util.architecture_components.D<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f186367a0 = cVar;
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(this.f207133K.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        cVar.b(new C41946e1(interfaceC31683m.M0().j0(cVar2), new J(this)).x0(cVar2).v0(new K(this), new M.a(new I(this)), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.messenger.blacklist.mvi.G
    public final void J() {
        this.f186362V.J();
    }

    @Override // com.avito.android.messenger.blacklist.mvi.G
    public final void N1() {
        this.f186362V.N1();
    }

    @Override // com.avito.android.messenger.blacklist.mvi.G
    /* renamed from: S9, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF186365Y() {
        return this.f186365Y;
    }

    @Override // com.avito.android.messenger.blacklist.mvi.G
    /* renamed from: o3, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF186366Z() {
        return this.f186366Z;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f186367a0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.blacklist.mvi.G
    public final void p0() {
        this.f186362V.p0();
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.i
    public final void r7(@Y61.k a.C0238a c0238a) {
        this.f186362V.sc(c0238a.f4060b);
    }
}
