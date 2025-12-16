package com.avito.android.feedback_adverts;

import com.avito.android.C35995v2;
import com.avito.android.feedback_adverts.g;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.E;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: FeedbackAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/feedback_adverts/h;", "Lcom/avito/android/feedback_adverts/g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/feedback_adverts/g$c;", "a", "b", "c", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends AbstractC32892c<g.c> implements g {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f157829V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final String f157830W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final String f157831X;

    /* compiled from: FeedbackAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/feedback_adverts/h$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/feedback_adverts/g$c;", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements E<g.c> {
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k x<g.c> xVar, @Y61.k x<g.c> xVar2) {
            boolean z12 = xVar instanceof c;
            if (z12 && (xVar2 instanceof b)) {
                return true;
            }
            return z12 && (xVar2 instanceof c) && ((c) xVar).f157833d.f319199a != ((c) xVar2).f157833d.f319199a;
        }
    }

    /* compiled from: FeedbackAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/h$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/feedback_adverts/g$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<g.c> {
        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            super("LoadNextPageMutator", null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<g.c> b(g.c cVar) {
            g.c cVar2 = cVar;
            if (cVar2 instanceof g.c.C4611c) {
                g.c.C4611c c4611c = (g.c.C4611c) cVar2;
                g.b bVar = c4611c.f157827c;
                if (bVar.f157819b) {
                    h hVar = h.this;
                    return hVar.f157829V.l(Integer.valueOf(bVar.f157818a.size()), hVar.f157831X, hVar.f157830W, c4611c.f157826b.f319200b).z(hVar.f207133K.a()).r(new i(cVar2)).u(new j(cVar2, 1));
                }
            }
            return I.q(cVar2);
        }
    }

    /* compiled from: FeedbackAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/h$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/feedback_adverts/g$c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.p<g.c> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final C35995v2 f157833d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k C35995v2 c35995v2) {
            super("StartSearchMutator(" + c35995v2 + ')', null, 2, 0 == true ? 1 : 0);
            this.f157833d = c35995v2;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<g.c> b(g.c cVar) {
            h hVar = h.this;
            return hVar.f157829V.l(0, hVar.f157831X, hVar.f157830W, this.f157833d.f319200b).z(hVar.f207140R).r(new k(this)).u(new j(this, 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public h(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.l String str, @Y61.k String str2, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.t<g.c> tVar) {
        super("FeedbackAdvertsInteractor", g.c.a.f157822b, interfaceC35745a5, new a(), tVar, null, null, null, 224, null);
        g.c.f157820a.getClass();
        this.f157829V = interfaceC47842z;
        this.f157830W = str;
        this.f157831X = str2;
    }

    @Override // com.avito.android.feedback_adverts.g
    @Y61.k
    public final B0 F0() {
        return this.f157829V.A().y(500L, TimeUnit.MILLISECONDS, this.f207133K.c()).d0(l.f157839b);
    }

    @Override // com.avito.android.feedback_adverts.g
    public final void J() {
        le().s(new b());
    }

    @Override // com.avito.android.feedback_adverts.g
    public final void Qd(@Y61.k C35995v2 c35995v2) {
        le().s(new c(c35995v2));
    }
}
