package com.avito.android.messenger.blacklist_reasons;

import androidx.compose.foundation.text.selection.C21030p;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist_reasons.e;
import com.avito.android.messenger.blacklist_reasons.list_items.a;
import com.avito.android.messenger.blacklist_reasons.m;
import com.avito.android.messenger.blacklist_reasons.y;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.u;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import p41.AbstractC46895b;

/* compiled from: BlacklistReasonsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i;", "Lcom/avito/android/messenger/blacklist_reasons/e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "a", "b", "c", "d", "e", "f", "g", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends AbstractC32892c<e.a> implements com.avito.android.messenger.blacklist_reasons.e {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final y f186593V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final m f186594W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f186595X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f186596Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final D<G0> f186597Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D<Q<PrintableText, Throwable>> f186598a0;

    /* compiled from: BlacklistReasonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$b;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements u.b<e.a, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f186599a = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.b
        public final String a(com.avito.android.mvi.rx3.with_monolithic_state.x xVar) {
            if (xVar instanceof e) {
                return "OnReasonSelectedMutator";
            }
            if (xVar instanceof d) {
                return "OnCustomReasonTextUpdateMutator";
            }
            return null;
        }
    }

    /* compiled from: BlacklistReasonsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<e.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final y.d f186600d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final m.b f186601e;

        public b(@Y61.k y.d dVar, @Y61.k m.b bVar) {
            super(null, "interactorState = " + dVar + ", reasonsState = " + bVar, 1, null);
            this.f186600d = dVar;
            this.f186601e = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.messenger.blacklist_reasons.e.a d(com.avito.android.messenger.blacklist_reasons.e.a r20) {
            /*
                Method dump skipped, instructions count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.blacklist_reasons.i.b.d(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BlacklistReasonsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32890a<e.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f186603d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f186604e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f186605f;

        public c(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
            super(null, null, 3, null);
            this.f186603d = str;
            this.f186604e = str2;
            this.f186605f = str3;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(e.a aVar) {
            CharSequence charSequence;
            e.a aVar2 = aVar;
            if (aVar2 instanceof e.a.b) {
                e.a.b bVar = (e.a.b) aVar2;
                if (bVar.f186583b) {
                    i iVar = i.this;
                    Long l12 = bVar.f186585d;
                    if (l12 != null && l12.longValue() == 4 && (charSequence = bVar.f186586e) != null && !C43066x.K(charSequence)) {
                        iVar.f186593V.X2(this.f186603d, this.f186604e, this.f186605f, bVar.f186585d, charSequence.toString());
                    } else {
                        if (l12 == null || l12.longValue() == 4) {
                            return;
                        }
                        y.b.a(iVar.f186593V, this.f186603d, this.f186604e, this.f186605f, bVar.f186585d, 16);
                    }
                }
            }
        }
    }

    /* compiled from: BlacklistReasonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<e.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final CharSequence f186607d;

        public d(@Y61.k CharSequence charSequence) {
            super(null, "newCustomReasonText = " + ((Object) charSequence), 1, null);
            this.f186607d = charSequence;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final e.a d(e.a aVar) {
            e.a aVar2 = aVar;
            if (!(aVar2 instanceof e.a.b)) {
                return aVar2;
            }
            e.a.b bVar = (e.a.b) aVar2;
            CharSequence charSequence = bVar.f186586e;
            CharSequence charSequence2 = this.f186607d;
            if (L.f(charSequence, charSequence2)) {
                return aVar2;
            }
            Long l12 = bVar.f186585d;
            return e.a.b.a(bVar, null, (l12 != null && l12.longValue() == 4) ? !C43066x.K(charSequence2) : bVar.f186583b, null, this.f186607d, 13);
        }
    }

    /* compiled from: BlacklistReasonsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<e.a> {

        /* renamed from: d, reason: collision with root package name */
        public final long f186608d;

        public e(long j12) {
            super(null, C21030p.a(j12, "selectedReasonId = "), 1, null);
            this.f186608d = j12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final e.a d(e.a aVar) {
            Object next;
            Object next2;
            e.a aVar2 = aVar;
            if (!(aVar2 instanceof e.a.b)) {
                return aVar2;
            }
            e.a.b bVar = (e.a.b) aVar2;
            Long l12 = bVar.f186585d;
            long j12 = this.f186608d;
            if (l12 != null && l12.longValue() == j12) {
                return aVar2;
            }
            ArrayList arrayList = new ArrayList();
            List<com.avito.android.messenger.blacklist_reasons.list_items.a> list = bVar.f186582a;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((com.avito.android.messenger.blacklist_reasons.list_items.a) next) instanceof a.c) {
                    break;
                }
            }
            com.avito.android.messenger.blacklist_reasons.list_items.a aVar3 = (com.avito.android.messenger.blacklist_reasons.list_items.a) next;
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
            boolean z12 = false;
            boolean z13 = false;
            for (com.avito.android.messenger.blacklist_reasons.list_items.a aVar4 : list) {
                if (aVar4 instanceof a.C5476a) {
                    long j13 = ((a.C5476a) aVar4).f186614b;
                    boolean z14 = j13 == j12;
                    z13 = z13 || z14;
                    z12 = z12 || (z14 && j13 == 4);
                    a.C5476a c5476a = (a.C5476a) aVar4;
                    if (c5476a.f186616d != z14) {
                        c5476a = new a.C5476a(c5476a.f186615c, z14, c5476a.f186614b);
                    }
                    arrayList.add(c5476a);
                }
            }
            CharSequence charSequence = bVar.f186586e;
            if (z12) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((com.avito.android.messenger.blacklist_reasons.list_items.a) next2) instanceof a.b) {
                        break;
                    }
                }
                TV0.a bVar2 = (com.avito.android.messenger.blacklist_reasons.list_items.a) next2;
                if (bVar2 == null) {
                    bVar2 = new a.b(charSequence);
                }
                arrayList.add(bVar2);
            }
            return e.a.b.a(bVar, arrayList, (z12 && !C43066x.K(charSequence)) || (!z12 && z13), z13 ? Long.valueOf(j12) : null, null, 20);
        }
    }

    /* compiled from: BlacklistReasonsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<e.a> {
        public f() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final e.a d(e.a aVar) {
            e.a.b bVar;
            Long l12;
            e.a aVar2 = aVar;
            if (!(aVar2 instanceof e.a.b) || (l12 = (bVar = (e.a.b) aVar2).f186585d) == null || l12.longValue() != 4) {
                return aVar2;
            }
            List<com.avito.android.messenger.blacklist_reasons.list_items.a> list = bVar.f186582a;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (TV0.a bVar2 : list) {
                if (bVar2 instanceof a.b) {
                    ((a.b) bVar2).getClass();
                    bVar2 = new a.b(bVar.f186586e);
                }
                arrayList.add(bVar2);
            }
            return e.a.b.a(bVar, arrayList, false, null, null, 30);
        }
    }

    /* compiled from: BlacklistReasonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/i$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$c;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements u.c<e.a, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final H f186609a;

        public g(@Y61.k H h12) {
            this.f186609a = h12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.c
        public final io.reactivex.rxjava3.core.z a(Object obj, AbstractC46895b abstractC46895b) {
            String str = (String) obj;
            boolean zF2 = L.f(str, "OnReasonSelectedMutator");
            H h12 = this.f186609a;
            return zF2 ? abstractC46895b.D0(300L, TimeUnit.MILLISECONDS, h12) : L.f(str, "OnCustomReasonTextUpdateMutator") ? abstractC46895b.y(300L, TimeUnit.MILLISECONDS, h12) : abstractC46895b;
        }
    }

    public i() {
        throw null;
    }

    @Inject
    public i(@Y61.k y yVar, @Y61.k m mVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("BlacklistReasonsPresenter", e.a.C5475a.f186581a, interfaceC35745a5, null, new com.avito.android.mvi.rx3.with_monolithic_state.u(interfaceC35745a5.a(), a.f186599a, new g(interfaceC35745a5.c())), null, null, null, 232, null);
        this.f186593V = yVar;
        this.f186594W = mVar;
        this.f186595X = interfaceC35741a1;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f186596Y = cVar;
        this.f186597Z = new D<>();
        this.f186598a0 = new D<>();
        cVar.b(io.reactivex.rxjava3.core.z.k(yVar.M0(), mVar.M0(), new j()).j0(interfaceC35745a5.c()).t0(new com.avito.android.messenger.blacklist_reasons.f(this)));
        cVar.b(yVar.g7().k0(y.c.b.class).N(com.avito.android.messenger.blacklist_reasons.g.f186591b).t0(new h(this)));
    }

    @Override // com.avito.android.messenger.blacklist_reasons.e
    public final void Bd(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        le().s(new c(str, str2, str3));
    }

    @Override // com.avito.android.messenger.blacklist_reasons.e
    public final void Da() {
        le().s(new f(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.blacklist_reasons.e
    public final void S3() {
        this.f186593V.w0();
        this.f186594W.J3(false);
    }

    @Override // com.avito.android.messenger.blacklist_reasons.e
    /* renamed from: Z, reason: from getter */
    public final D getF186597Z() {
        return this.f186597Z;
    }

    @Override // com.avito.android.messenger.blacklist_reasons.e
    /* renamed from: k8, reason: from getter */
    public final D getF186598a0() {
        return this.f186598a0;
    }

    @Override // com.avito.android.messenger.blacklist_reasons.InterfaceC31689b
    public final void kc(long j12) {
        le().s(new e(j12));
    }

    @Override // com.avito.android.messenger.blacklist_reasons.InterfaceC31688a
    public final void md(@Y61.k CharSequence charSequence) {
        le().s(new d(charSequence));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f186596Y.e();
        this.f186593V.w0();
        super.onCleared();
    }
}
