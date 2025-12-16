package com.avito.android.messenger.conversation.mvi.quick_replies;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.I;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: QuickRepliesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\b\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "a", "b", "c", "d", "e", "f", "g", "h", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends AbstractC32892c<d.a> implements com.avito.android.messenger.conversation.mvi.quick_replies.d {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f194099V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32188a f194100W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f194101X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<a.c> f194102Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final D<PrintableText> f194103Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D<G0> f194104a0;

    /* compiled from: QuickRepliesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.a> {
        public a() {
            throw null;
        }
    }

    /* compiled from: QuickRepliesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<d.a> {
        public b() {
            throw null;
        }
    }

    /* compiled from: QuickRepliesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.a> {
        public c() {
            throw null;
        }
    }

    /* compiled from: QuickRepliesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.a> {
        public d() {
            super(null, null, j.f194110l, 3, null);
        }
    }

    /* compiled from: QuickRepliesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.p<d.a> {
        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<d.a> b(d.a aVar) {
            d.a aVar2 = aVar;
            if (!(aVar2 instanceof d.a.b.C5748b)) {
                return I.q(aVar2);
            }
            f fVar = f.this;
            return fVar.f194099V.M0().S().n(k.f194111b).n(new m(this, fVar)).u(new androidx.room.rxjava3.b(fVar, 10));
        }
    }

    /* compiled from: QuickRepliesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.f$f, reason: collision with other inner class name */
    public final class C5749f extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.a> {
        public C5749f() {
            throw null;
        }
    }

    /* compiled from: QuickRepliesPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.a> {
        public g() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final d.a d(d.a aVar) {
            d.a aVar2 = aVar;
            if (!(aVar2 instanceof d.a.b.InterfaceC5745a.c)) {
                return aVar2;
            }
            ArrayList<a.c> arrayList = ((d.a.b.InterfaceC5745a.c) aVar2).f194096a;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (a.c cVar : arrayList) {
                arrayList2.add(new a.b(cVar.f194076b, cVar.f194077c, cVar.f194078d));
            }
            return new d.a.b.InterfaceC5745a.C5747b(arrayList2, null);
        }
    }

    /* compiled from: QuickRepliesPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/f$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.o<d.a> {
        public h() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final d.a d(d.a aVar) {
            d.a aVar2 = aVar;
            if (!(aVar2 instanceof d.a.b.InterfaceC5745a.C5747b)) {
                return aVar2;
            }
            List<a.b> list = ((d.a.b.InterfaceC5745a.C5747b) aVar2).f194094a;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (a.b bVar : list) {
                arrayList.add(new a.c(bVar.f194073b, bVar.f194074c, bVar.f194075d));
            }
            return new d.a.b.InterfaceC5745a.c(arrayList);
        }
    }

    @Inject
    public f(@Y61.k InterfaceC31987a interfaceC31987a, @Y61.k InterfaceC32188a interfaceC32188a, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("QuickRepliesPresenter", d.a.C5744a.f194092a, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f194099V = interfaceC31987a;
        this.f194100W = interfaceC32188a;
        this.f194101X = interfaceC35741a1;
        this.f194102Y = new D<>();
        this.f194103Z = new D<>();
        this.f194104a0 = new D<>();
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    /* renamed from: N4, reason: from getter */
    public final D getF194102Y() {
        return this.f194102Y;
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    /* renamed from: T, reason: from getter */
    public final D getF194103Z() {
        return this.f194103Z;
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    /* renamed from: Zb, reason: from getter */
    public final D getF194104a0() {
        return this.f194104a0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void fa() {
        le().s(new b(null, null, new com.avito.android.messenger.conversation.mvi.quick_replies.h(this), 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void g9(@Y61.k a.b bVar) {
        le().s(new c(null, null, new i(bVar), 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void gd() {
        le().s(new h(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void hide() {
        le().s(new d());
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void i4() {
        le().s(new g(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void kb() {
        le().s(new a(null, null, com.avito.android.messenger.conversation.mvi.quick_replies.e.f194098l, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void show() {
        le().s(new C5749f(null, null, new o(this), 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.d
    public final void t5(@Y61.k a.c cVar) {
        this.f194102Y.postValue(cVar);
        le().s(new d());
    }
}
