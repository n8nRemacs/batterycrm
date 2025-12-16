package com.avito.android.messenger.support;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.support.j;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.E;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.mvi.rx3.with_monolithic_state.p;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SupportChatFormPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/support/k;", "Lcom/avito/android/messenger/support/j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/support/j$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k extends AbstractC32892c<j.b> implements j {

    /* renamed from: V, reason: collision with root package name */
    public final int f197400V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final c f197401W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f197402X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<PrintableText> f197403Y;

    /* compiled from: SupportChatFormPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/support/k$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/support/j$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements E<j.b> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f197404b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k x<j.b> xVar, @Y61.k x<j.b> xVar2) {
            if (xVar instanceof b.a) {
                if (xVar2 instanceof b.a) {
                    if (((b.a) xVar).f197409d > ((b.a) xVar2).f197409d) {
                        return true;
                    }
                } else if ((xVar2 instanceof b.C5816b) && ((b.a) xVar).f197409d > ((b.C5816b) xVar2).f197411d) {
                    return true;
                }
            } else if (xVar instanceof b.C5816b) {
                if (xVar2 instanceof b.a) {
                    if (((b.C5816b) xVar).f197411d > ((b.a) xVar2).f197409d) {
                        return true;
                    }
                } else if ((xVar2 instanceof b.C5816b) && ((b.C5816b) xVar).f197411d > ((b.C5816b) xVar2).f197411d) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: SupportChatFormPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/support/k$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/support/j$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.n<j.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final CharSequence f197405d;

        /* renamed from: e, reason: collision with root package name */
        public final long f197406e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<x<j.b>>> f197407f;

        /* compiled from: SupportChatFormPresenter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/support/k$b$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/support/j$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<j.b> {

            /* renamed from: d, reason: collision with root package name */
            public final long f197409d;

            /* compiled from: SupportChatFormPresenter.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/support/j$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/support/j$b;)Lcom/avito/android/messenger/support/j$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.support.k$b$a$a, reason: collision with other inner class name */
            public static final class C5815a extends N implements Y41.l<j.b, j.b> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f197410l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5815a(long j12) {
                    super(1);
                    this.f197410l = j12;
                }

                @Override // Y41.l
                public final j.b invoke(j.b bVar) {
                    j.b bVar2 = bVar;
                    j.a.C5814a c5814a = j.a.C5814a.f197394a;
                    j.a aVar = bVar2.f197399a;
                    if (L.f(aVar, c5814a) ? true : aVar instanceof j.a.b) {
                        return new j.b(new j.a.b(this.f197410l));
                    }
                    if (aVar instanceof j.a.c) {
                        return bVar2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            public a(b bVar, long j12) {
                super(new C5815a(j12), "SendClickedComposite.SetInProgressMutator", AK.c.r(H.q(j12, "(id = ", ", text = "), bVar.f197405d, ')'));
                this.f197409d = j12;
            }
        }

        /* compiled from: SupportChatFormPresenter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/support/k$b$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/support/j$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.support.k$b$b, reason: collision with other inner class name */
        public final class C5816b extends p<j.b> {

            /* renamed from: d, reason: collision with root package name */
            public final long f197411d;

            /* compiled from: SupportChatFormPresenter.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/support/j$b;", "oldState", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Lcom/avito/android/messenger/support/j$b;)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger.support.k$b$b$a */
            public static final class a extends N implements Y41.l<j.b, I<j.b>> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f197412l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ k f197413m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ b f197414n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j12, k kVar, b bVar) {
                    super(1);
                    this.f197412l = j12;
                    this.f197413m = kVar;
                    this.f197414n = bVar;
                }

                @Override // Y41.l
                public final I<j.b> invoke(j.b bVar) {
                    j.b bVar2 = bVar;
                    j.a aVar = bVar2.f197399a;
                    j.a.b bVar3 = aVar instanceof j.a.b ? (j.a.b) aVar : null;
                    Long lValueOf = bVar3 != null ? Long.valueOf(bVar3.f197395a) : null;
                    if (lValueOf == null || lValueOf.longValue() != this.f197412l) {
                        return I.q(bVar2);
                    }
                    k kVar = this.f197413m;
                    return kVar.f197401W.a(kVar.f197400V, this.f197414n.f197405d).r(new l(bVar2)).u(new androidx.room.rxjava3.b(kVar, bVar2));
                }
            }

            public C5816b(b bVar, long j12) {
                super(new a(j12, k.this, bVar), "SendClickedComposite.StartSupportChatMutator", AK.c.r(H.q(j12, "(id = ", ", text = "), bVar.f197405d, ')'));
                this.f197411d = j12;
            }
        }

        /* compiled from: SupportChatFormPresenter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/support/j$b;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends N implements Y41.a<List<? extends x<j.b>>> {
            public c() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends x<j.b>> invoke() {
                b bVar = b.this;
                return C42745f0.U(new a(bVar, bVar.f197406e), new C5816b(bVar, bVar.f197406e));
            }
        }

        public b(@Y61.k CharSequence charSequence, long j12) {
            super(null, null, null, 7, null);
            this.f197405d = charSequence;
            this.f197406e = j12;
            this.f197407f = new c();
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<x<j.b>>> b() {
            return this.f197407f;
        }
    }

    public k() {
        throw null;
    }

    @Inject
    public k(int i12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k c cVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        F f12 = new F(interfaceC35745a5.a(), "SupportChatFormPresenter");
        j.b.f197397b.getClass();
        super("SupportChatFormPresenter", j.b.f197398c, interfaceC35745a5, a.f197404b, f12, null, null, null, 224, null);
        this.f197400V = i12;
        this.f197401W = cVar;
        this.f197402X = interfaceC35741a1;
        this.f197403Y = new D<>();
    }

    @Override // com.avito.android.messenger.support.j
    public final void H2(@Y61.k CharSequence charSequence) {
        le().s(new b(charSequence, ke("SendClickedComposite")));
    }

    @Override // com.avito.android.messenger.support.j
    /* renamed from: Q, reason: from getter */
    public final D getF197403Y() {
        return this.f197403Y;
    }
}
