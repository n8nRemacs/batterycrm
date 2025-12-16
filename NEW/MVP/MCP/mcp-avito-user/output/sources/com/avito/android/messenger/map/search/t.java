package com.avito.android.messenger.map.search;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.map.search.E;
import com.avito.android.messenger.map.search.h;
import com.avito.android.messenger.map.search.q;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: GeoSearchPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/map/search/t;", "Lcom/avito/android/messenger/map/search/q;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/map/search/q$a;", "a", "b", "c", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t extends AbstractC32892c<q.a> implements q {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final h f196592V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final String f196593W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final String f196594X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f196595Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final String f196596Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f196597a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<com.avito.android.messenger.map.search.adapter.a> f196598b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196599c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final d f196600d0;

    /* compiled from: GeoSearchPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/t$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/search/q$a;", "Lcom/avito/android/messenger/map/search/E;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<q.a> implements E {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final h.a f196601d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f196602e;

        public a(@Y61.k t tVar, h.a aVar) {
            super(null, null, 3, null);
            this.f196601d = aVar;
            this.f196602e = tVar.f196600d0;
        }

        @Override // com.avito.android.messenger.map.search.E
        @Y61.k
        public final v b(@Y61.k q.a aVar, @Y61.k String str, @Y61.k com.avito.android.mvi.b bVar, @Y61.k List list) {
            return this.f196602e.b(aVar, str, bVar, list);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.messenger.map.search.q.a d(com.avito.android.messenger.map.search.q.a r18) {
            /*
                r17 = this;
                r1 = r18
                com.avito.android.messenger.map.search.q$a r1 = (com.avito.android.messenger.map.search.q.a) r1
                r6 = r17
                com.avito.android.messenger.map.search.h$a r0 = r6.f196601d
                com.avito.android.mvi.b<java.util.List<com.avito.android.remote.model.messenger.geo.GeoSearchSuggest>> r2 = r0.f196565b
                boolean r3 = r2 instanceof com.avito.android.mvi.b.a
                r4 = 10
                if (r3 == 0) goto L18
                com.avito.android.mvi.b$a r2 = new com.avito.android.mvi.b$a
                r2.<init>()
            L15:
                r3 = r2
                goto L86
            L18:
                boolean r3 = r2 instanceof com.avito.android.mvi.b.c
                if (r3 == 0) goto L26
                com.avito.android.mvi.b$c r3 = new com.avito.android.mvi.b$c
                com.avito.android.mvi.b$c r2 = (com.avito.android.mvi.b.c) r2
                long r7 = r2.f207034a
                r3.<init>(r7)
                goto L86
            L26:
                boolean r3 = r2 instanceof com.avito.android.mvi.b.d
                if (r3 == 0) goto L79
                com.avito.android.mvi.b$d r2 = (com.avito.android.mvi.b.d) r2
                T r2 = r2.f207035a
                java.util.List r2 = (java.util.List) r2
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                int r5 = kotlin.collections.C42745f0.q(r2, r4)
                r3.<init>(r5)
                java.util.Iterator r2 = r2.iterator()
            L3f:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L73
                java.lang.Object r5 = r2.next()
                com.avito.android.remote.model.messenger.geo.GeoSearchSuggest r5 = (com.avito.android.remote.model.messenger.geo.GeoSearchSuggest) r5
                com.avito.android.messenger.map.search.adapter.a r15 = new com.avito.android.messenger.map.search.adapter.a
                double r8 = r5.getLatitude()
                double r10 = r5.getLongitude()
                java.lang.String r12 = r5.getKind()
                java.lang.String r13 = r5.getTitle()
                java.lang.String r14 = r5.getName()
                java.lang.String r5 = r5.getDescription()
                java.lang.String r16 = "search result"
                r7 = r15
                r4 = r15
                r15 = r5
                r7.<init>(r8, r10, r12, r13, r14, r15, r16)
                r3.add(r4)
                r4 = 10
                goto L3f
            L73:
                com.avito.android.mvi.b$d r2 = new com.avito.android.mvi.b$d
                r2.<init>(r3)
                goto L15
            L79:
                boolean r3 = r2 instanceof com.avito.android.mvi.b.C6174b
                if (r3 == 0) goto Le4
                com.avito.android.mvi.b$b r3 = new com.avito.android.mvi.b$b
                com.avito.android.mvi.b$b r2 = (com.avito.android.mvi.b.C6174b) r2
                java.lang.Throwable r2 = r2.f207033a
                r3.<init>(r2)
            L86:
                java.util.List<com.avito.android.remote.model.messenger.geo.GeoSearchSuggest> r0 = r0.f196564a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r4 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.C42745f0.q(r0, r2)
                r4.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L99:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto Ldb
                java.lang.Object r2 = r0.next()
                com.avito.android.remote.model.messenger.geo.GeoSearchSuggest r2 = (com.avito.android.remote.model.messenger.geo.GeoSearchSuggest) r2
                com.avito.android.messenger.map.search.adapter.a r5 = new com.avito.android.messenger.map.search.adapter.a
                double r8 = r2.getLatitude()
                double r10 = r2.getLongitude()
                java.lang.String r12 = r2.getKind()
                java.lang.String r13 = r2.getTitle()
                java.lang.String r14 = r2.getName()
                java.lang.String r15 = r2.getDescription()
                java.lang.Boolean r2 = r2.getFromItem()
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                boolean r2 = kotlin.jvm.internal.L.f(r2, r7)
                if (r2 == 0) goto Ld0
                java.lang.String r2 = "item suggest"
            Lcd:
                r16 = r2
                goto Ld3
            Ld0:
                java.lang.String r2 = "previous geo suggest"
                goto Lcd
            Ld3:
                r7 = r5
                r7.<init>(r8, r10, r12, r13, r14, r15, r16)
                r4.add(r5)
                goto L99
            Ldb:
                r2 = 0
                r5 = 1
                r0 = r17
                com.avito.android.messenger.map.search.q$a r0 = com.avito.android.messenger.map.search.E.a.a(r0, r1, r2, r3, r4, r5)
                return r0
            Le4:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.map.search.t.a.d(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GeoSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/t$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/search/q$a;", "Lcom/avito/android/messenger/map/search/E;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<q.a> implements E {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f196603d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f196604e;

        public b(@Y61.k String str) {
            super(null, null, 3, null);
            this.f196603d = str;
            this.f196604e = t.this.f196600d0;
        }

        @Override // com.avito.android.messenger.map.search.E
        @Y61.k
        public final v b(@Y61.k q.a aVar, @Y61.k String str, @Y61.k com.avito.android.mvi.b bVar, @Y61.k List list) {
            return this.f196604e.b(aVar, str, bVar, list);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final q.a d(q.a aVar) {
            q.a aVar2 = aVar;
            String str = this.f196603d;
            if (L.a(str) >= 3) {
                t.this.f196592V.ee(str);
            }
            return E.a.a(this, aVar2, this.f196603d, null, null, 6);
        }
    }

    /* compiled from: GeoSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/t$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/map/search/q$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32890a<q.a> {
        public c() {
            throw null;
        }
    }

    /* compiled from: GeoSearchPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/t$d;", "Lcom/avito/android/messenger/map/search/E;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d implements E {
        public d() {
        }

        @Override // com.avito.android.messenger.map.search.E
        @Y61.k
        public final v b(@Y61.k q.a aVar, @Y61.k String str, @Y61.k com.avito.android.mvi.b bVar, @Y61.k List list) {
            int i12 = q.a.f196588a;
            return new v(str, bVar, aVar.b(), aVar.getF196609c(), list, t.this);
        }
    }

    public t() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public t(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h hVar, @Y61.k @Named("error_indicator_message") String str, @Y61.k @Named("error_indicator_action_name") String str2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @Named("channel_id") String str3, @Y61.k q.a aVar, @Y61.k InterfaceC47842z interfaceC47842z) {
        super("GeoSearchPresenter", aVar, interfaceC35745a5, null, new F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 232, null);
        this.f196592V = hVar;
        this.f196593W = str;
        this.f196594X = str2;
        this.f196595Y = interfaceC28373a;
        this.f196596Z = str3;
        this.f196597a0 = new com.avito.android.util.architecture_components.D<>();
        this.f196598b0 = new com.avito.android.util.architecture_components.D<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f196599c0 = cVar;
        this.f196600d0 = new d();
        cVar.b(hVar.M0().j0(interfaceC35745a5.a()).t0(new r(this)));
        cVar.b(interfaceC47842z.A().y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).j0(interfaceC35745a5.a()).t0(new s(this)));
    }

    @Override // com.avito.android.messenger.map.search.q
    /* renamed from: B4, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196598b0() {
        return this.f196598b0;
    }

    @Override // com.avito.android.messenger.map.search.q
    /* renamed from: Z9, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF196597a0() {
        return this.f196597a0;
    }

    @Override // com.avito.android.messenger.map.search.q
    public final void g4(@Y61.k String str) {
        le().s(new b(str));
    }

    @Override // com.avito.android.messenger.map.search.y
    public final void jc(@Y61.k com.avito.android.messenger.map.search.adapter.a aVar) {
        if (aVar.f196523j) {
            this.f196598b0.postValue(aVar);
        } else {
            this.f196597a0.postValue(AK.c.s(new StringBuilder(), aVar.f196518e, ", "));
        }
        this.f196595Y.c(new com.avito.android.messenger.analytics.E(this.f196596Z, aVar.f196521h));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f196599c0.e();
        super.onCleared();
    }
}
