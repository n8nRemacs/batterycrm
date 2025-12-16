package com.avito.android.messenger.blacklist_reasons;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.blacklist_reasons.y;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.E;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: BlockUserInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/z;", "Lcom/avito/android/messenger/blacklist_reasons/y;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "b", "c", "d", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z extends AbstractC32892c<y.d> implements y {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f186692V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<y.c> f186693W;

    /* compiled from: BlockUserInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/a;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LX81/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            X81.a aVar = (X81.a) obj;
            z.this.f186693W.accept(new y.c.b(new y.a.C5478a(aVar.userId, aVar.context.getChannelId(), aVar.context.getItemId(), null, null, 16, null), true, false));
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/z$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<y.d> {
        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            super("BlockUserMutator()", null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<y.d> b(y.d dVar) {
            I<G0> iConfirmChatAsSpam;
            y.d dVar2 = dVar;
            if (!(dVar2 instanceof y.d.C5479d)) {
                if (dVar2.equals(y.d.b.f186688a) ? true : dVar2.equals(y.d.a.f186687a) ? true : dVar2 instanceof y.d.c) {
                    return I.q(dVar2);
                }
                throw new NoWhenBranchMatchedException();
            }
            y.a aVar = ((y.d.C5479d) dVar2).f186691a;
            boolean z12 = aVar instanceof y.a.C5478a;
            z zVar = z.this;
            if (z12) {
                y.a.C5478a c5478a = (y.a.C5478a) aVar;
                y.a.C5478a c5478a2 = (y.a.C5478a) aVar;
                iConfirmChatAsSpam = zVar.f186692V.p(c5478a.f186672a, c5478a.f186673b, c5478a.f186674c, c5478a2.f186675d, c5478a2.f186676e);
            } else {
                if (!(aVar instanceof y.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y.a.b bVar = (y.a.b) aVar;
                boolean z13 = bVar.f186681e;
                String str = bVar.f186680d;
                iConfirmChatAsSpam = z13 ? zVar.f186692V.confirmChatAsSpam(((y.a.b) aVar).f186678b, str) : zVar.f186692V.confirmChatAsNonSpam(((y.a.b) aVar).f186678b, str);
            }
            return iConfirmChatAsSpam.s(zVar.f207133K.c()).r(A.f186533b).k(new B(dVar2, zVar)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(2, zVar, dVar2));
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/z$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements E<y.d> {
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<y.d> xVar, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<y.d> xVar2) {
            return xVar.equals(d.f186696d);
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/z$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.avito.android.mvi.rx3.with_monolithic_state.p<y.d> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final d f186696d = new d();

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<y.d> b(y.d dVar) {
            return I.q(y.d.b.f186688a);
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/z$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<y.d> {
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final y.d d(y.d dVar) {
            y.d dVar2 = dVar;
            if (dVar2 instanceof y.d.c) {
                throw null;
            }
            if (dVar2.equals(y.d.b.f186688a) ? true : dVar2.equals(y.d.a.f186687a) ? true : dVar2 instanceof y.d.C5479d) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/z$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<y.d> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final y.a f186697d;

        public f(@Y61.k y.a aVar) {
            super(null, null, 3, null);
            this.f186697d = aVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final y.d d(y.d dVar) {
            y.d dVar2 = dVar;
            if (dVar2.equals(y.d.b.f186688a) ? true : dVar2.equals(y.d.a.f186687a) ? true : dVar2 instanceof y.d.c) {
                z zVar = z.this;
                zVar.le().s(zVar.new b());
                return new y.d.C5479d(this.f186697d);
            }
            if (dVar2 instanceof y.d.C5479d) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public z(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("BlockUserInteractorImpl", y.d.b.f186688a, interfaceC35745a5, new c(), null, null, null, null, 240, null);
        this.f186692V = interfaceC47842z;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f186693W = C31685o.m();
        cVar.b(interfaceC47842z.C(X81.a.class).j0(interfaceC35745a5.c()).t0(new a()));
    }

    @Override // com.avito.android.messenger.blacklist_reasons.y
    public final void X2(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4) {
        le().s(new f(new y.a.C5478a(str, str2, str3, l12, str4)));
    }

    @Override // com.avito.android.messenger.blacklist_reasons.y
    public final io.reactivex.rxjava3.core.z g7() {
        return this.f186693W;
    }

    @Override // com.avito.android.messenger.blacklist_reasons.y
    public final void q5(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, boolean z12) {
        le().s(new f(new y.a.b(str, str2, str4, str3, z12)));
    }

    @Override // com.avito.android.messenger.blacklist_reasons.y
    public final void w0() {
        le().s(d.f186696d);
    }
}
