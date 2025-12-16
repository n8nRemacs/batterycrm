package com.avito.android.feedback_adverts;

import android.content.res.Resources;
import arrow.core.Y0;
import arrow.core.Z0;
import com.avito.android.C35995v2;
import com.avito.android.R;
import com.avito.android.feedback_adverts.g;
import com.avito.android.feedback_adverts.o;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ok0.InterfaceC44788a;

/* compiled from: FeedbackAdvertsPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/feedback_adverts/p;", "Lcom/avito/android/feedback_adverts/o;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/feedback_adverts/o$b;", "e", "f", "g", "h", "i", "j", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p extends AbstractC32892c<o.b> implements o {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.feedback_adverts.g f157871V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f157872W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final Resources f157873X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<FeedbackAdvertItem> f157874Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final D<PrintableText> f157875Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f157876a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Y0<Throwable>> f157877b0;

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/feedback_adverts/g$c;", "interactorState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/feedback_adverts/g$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            p pVar = p.this;
            pVar.le().s(pVar.new e((g.c) obj));
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            p pVar = p.this;
            pVar.le().s(pVar.new f());
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "", "kotlin.jvm.PlatformType", "error", "Lcom/avito/android/printable_text/PrintableText;", "apply", "(Larrow/core/Y0;)Lcom/avito/android/printable_text/PrintableText;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return InterfaceC35741a1.a.a(p.this.f157872W, (Throwable) ((Y0) obj).c(), null, null, 6);
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/printable_text/PrintableText;", "message", "Lkotlin/G0;", "accept", "(Lcom/avito/android/printable_text/PrintableText;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            p.this.f157875Z.postValue((PrintableText) obj);
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/p$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<o.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final g.c f157882d;

        public e(@Y61.k g.c cVar) {
            super(null, null, 3, null);
            this.f157882d = cVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final o.b d(o.b bVar) {
            o.a c4612a;
            o.b bVar2 = bVar;
            g.c cVar = this.f157882d;
            boolean z12 = cVar instanceof g.c.b;
            p pVar = p.this;
            if (z12) {
                g.c.b bVar3 = (g.c.b) cVar;
                pVar.getClass();
                if (bVar2 instanceof o.b.c) {
                    return new o.b.c.a(null, bVar3.f157823b, bVar3.f157825d, null, 9, null);
                }
                if (!(bVar2 instanceof o.b.d ? true : bVar2 instanceof o.b.e ? true : bVar2 instanceof o.b.C4613b)) {
                    throw new NoWhenBranchMatchedException();
                }
                pVar.f157877b0.accept(Z0.b(bVar3.f157825d));
                g.b f157869b = bVar2.getF157869b();
                Resources resources = pVar.f157873X;
                return new o.b.C4613b(f157869b, bVar3.f157823b, resources.getString(R.string.messenger_feedback_advert_empty_list), resources.getString(R.string.messenger_feedback_advert_empty_list_description), bVar3.f157825d);
            }
            if (!(cVar instanceof g.c.C4611c)) {
                throw new NoWhenBranchMatchedException();
            }
            g.c.C4611c c4611c = (g.c.C4611c) cVar;
            pVar.getClass();
            boolean zIsEmpty = c4611c.f157827c.f157818a.isEmpty();
            C35995v2 c35995v2 = c4611c.f157826b;
            if (zIsEmpty) {
                boolean zK2 = C43066x.K(c35995v2.f319200b);
                Resources resources2 = pVar.f157873X;
                return new o.b.d.a(null, c4611c.f157826b, zK2 ? resources2.getString(R.string.messenger_feedback_advert_empty_list) : resources2.getString(R.string.messenger_feedback_advert_empty_search_result), C43066x.K(c35995v2.f319200b) ? resources2.getString(R.string.messenger_feedback_advert_empty_list_description) : resources2.getString(R.string.messenger_feedback_advert_empty_search_result_description), 1, null);
            }
            g.a aVar = c4611c.f157828d;
            boolean z13 = aVar instanceof g.a.C4610a;
            if (z13) {
                pVar.f157877b0.accept(Z0.b(((g.a.C4610a) aVar).f157816a));
            }
            if (z13) {
                c4612a = new o.a.C4612a(((g.a.C4610a) aVar).f157816a);
            } else {
                if (!L.f(aVar, g.a.b.f157817a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c4612a = o.a.b.f157846a;
            }
            return new o.b.d.C4615b(c4611c.f157827c, c35995v2, c4612a);
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/p$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends C32890a<o.b> {
        public f() {
            super("ReconnectAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(o.b bVar) {
            o.b bVar2 = bVar;
            boolean z12 = bVar2 instanceof o.b.d.C4615b;
            p pVar = p.this;
            if (z12) {
                o.a aVar = ((o.b.d.C4615b) bVar2).f157868d;
                if ((aVar instanceof o.a.C4612a) && K5.e(((o.a.C4612a) aVar).f157845a)) {
                    pVar.le().s(pVar.new i());
                    return;
                }
                return;
            }
            if (bVar2 instanceof o.b.c.a) {
                if (K5.e(((o.b.c.a) bVar2).f157858d)) {
                    pVar.le().s(pVar.new i());
                }
            } else if (bVar2 instanceof o.b.C4613b) {
                if (K5.e(((o.b.C4613b) bVar2).f157855f)) {
                    pVar.le().s(pVar.new i());
                }
            } else {
                if (bVar2 instanceof o.b.c.C4614b ? true : bVar2 instanceof o.b.d.a) {
                    return;
                }
                boolean z13 = bVar2 instanceof o.b.e;
            }
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/p$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends C32890a<o.b> {
        public g() {
            super("RequestNextPageAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(o.b bVar) {
            o.b bVar2 = bVar;
            if ((bVar2 instanceof o.b.d.C4615b) && (((o.b.d.C4615b) bVar2).f157868d instanceof o.a.c)) {
                p.this.f157871V.J();
            }
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/p$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.o<o.b> {
        public h() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final o.b d(o.b bVar) {
            o.b bVar2 = bVar;
            if (!(bVar2 instanceof o.b.d.C4615b)) {
                return bVar2;
            }
            p pVar = p.this;
            pVar.le().s(pVar.new g());
            o.b.d.C4615b c4615b = (o.b.d.C4615b) bVar2;
            List<InterfaceC44788a> list = c4615b.f157866b.f157818a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!L.f((InterfaceC44788a) obj, InterfaceC44788a.b.f420002b)) {
                    arrayList.add(obj);
                }
            }
            return new o.b.d.C4615b(new g.b(C42745f0.i0(InterfaceC44788a.b.f420002b, arrayList), true), c4615b.f157867c, o.a.c.f157847a);
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/p$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class i extends C32890a<o.b> {
        public i() {
            super("RetryAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(o.b bVar) {
            o.b bVar2 = bVar;
            boolean z12 = bVar2 instanceof o.b.d.C4615b;
            p pVar = p.this;
            if (z12) {
                if (((o.b.d.C4615b) bVar2).f157868d instanceof o.a.C4612a) {
                    pVar.J();
                } else {
                    pVar.me(((o.b.d.C4615b) bVar2).getF157870c().f319200b, true);
                }
            } else if (bVar2 instanceof o.b.C4613b) {
                pVar.me(((o.b.C4613b) bVar2).getF157870c().f319200b, true);
            } else if (bVar2 instanceof o.b.c.a) {
                pVar.me(((o.b.c.a) bVar2).getF157870c().f319200b, true);
            } else {
                if (!(bVar2 instanceof o.b.c.C4614b ? true : bVar2 instanceof o.b.d.a ? true : bVar2 instanceof o.b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            G0 g02 = G0.f406611a;
        }
    }

    /* compiled from: FeedbackAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/p$j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/feedback_adverts/o$b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class j extends com.avito.android.mvi.rx3.with_monolithic_state.o<o.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f157888d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f157889e;

        public j(@Y61.k String str, boolean z12) {
            super(null, null, 3, null);
            this.f157888d = str;
            this.f157889e = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final o.b d(o.b bVar) {
            o.b.e eVar;
            o.b bVar2 = bVar;
            String str = bVar2.getF157870c().f319200b;
            String str2 = this.f157888d;
            if (L.f(str, str2) && !this.f157889e) {
                return bVar2;
            }
            p pVar = p.this;
            C35995v2 c35995v2 = new C35995v2(pVar.f157876a0.incrementAndGet(), str2);
            pVar.f157871V.Qd(c35995v2);
            if (bVar2 instanceof o.b.c) {
                return new o.b.c.C4614b(null, null, 3, null);
            }
            if (bVar2 instanceof o.b.d) {
                eVar = new o.b.e(null, bVar2.getF157870c(), 1, null);
            } else {
                if (bVar2 instanceof o.b.e) {
                    return new o.b.e(((o.b.e) bVar2).f157869b, c35995v2);
                }
                if (!(bVar2 instanceof o.b.C4613b)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new o.b.e(null, ((o.b.C4613b) bVar2).f157852c, 1, null);
            }
            return eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public p(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.feedback_adverts.g gVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k Resources resources, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.t<o.b> tVar) {
        super("FeedbackAdvertsPresenter", o.b.a.f157850b, interfaceC35745a5, null, tVar, null, null, null, 232, null);
        o.b.f157848a.getClass();
        this.f157871V = gVar;
        this.f157872W = interfaceC35741a1;
        this.f157873X = resources;
        this.f157874Y = new D<>();
        this.f157875Z = new D<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f157876a0 = new AtomicLong(0L);
        com.jakewharton.rxrelay3.c<Y0<Throwable>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f157877b0 = cVar2;
        cVar.b(gVar.M0().q0(1L).j0(interfaceC35745a5.c()).t0(new a()));
        cVar.b(gVar.F0().j0(interfaceC35745a5.a()).t0(new b()));
        cVar.b(cVar2.C0(2700L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).d0(new c()).t0(new d()));
        me("", true);
    }

    @Override // com.avito.android.feedback_adverts.o
    /* renamed from: Ad, reason: from getter */
    public final D getF157874Y() {
        return this.f157874Y;
    }

    @Override // com.avito.android.feedback_adverts.o
    public final void J() {
        le().s(new h());
    }

    @Override // com.avito.android.feedback_adverts.o
    /* renamed from: Q, reason: from getter */
    public final D getF157875Z() {
        return this.f157875Z;
    }

    @Override // com.avito.android.feedback_adverts.adapter.c.a
    public final void e4(@Y61.k FeedbackAdvertItem feedbackAdvertItem) {
        this.f157874Y.postValue(feedbackAdvertItem);
    }

    @Override // com.avito.android.feedback_adverts.o
    public final void m4(@Y61.k String str) {
        me(str, false);
    }

    public final void me(String str, boolean z12) {
        le().s(new j(str, z12));
    }
}
