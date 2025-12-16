package com.avito.android.bxcontent.mvi;

import android.content.res.Resources;
import android.os.Bundle;
import com.avito.android.bxcontent.C29253t0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchArgs;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.search_bar.InterfaceC34826e;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: BxContentSavedSearchPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/P0;", "Lcom/avito/android/bxcontent/mvi/L0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class P0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final SearchParams f111430a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.libs.saved_searches.domain.i f111431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TV.f f111432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f111433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Resources f111434e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34826e f111435f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f111436g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f111437h = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public C29253t0 f111438i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f111439j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public String f111440k;

    /* compiled from: BxContentSavedSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "loadingState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f111442c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f111443d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SearchParams f111444e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f111445f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ PresentationType f111446g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f111447h;

        public a(String str, boolean z12, SearchParams searchParams, String str2, PresentationType presentationType, String str3) {
            this.f111442c = str;
            this.f111443d = z12;
            this.f111444e = searchParams;
            this.f111445f = str2;
            this.f111446g = presentationType;
            this.f111447h = str3;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            String str = this.f111442c;
            boolean z13 = this.f111443d;
            P0 p02 = P0.this;
            if (z12) {
                p02.f111435f.o();
                C29253t0 c29253t0 = p02.f111438i;
                if (c29253t0 != null) {
                    c29253t0.Q(InlineAction.Predefined.State.f283120d, str, z13);
                    return;
                }
                return;
            }
            if (!(p22 instanceof P2.b)) {
                if (p22 instanceof P2.a) {
                    P2.a aVar = (P2.a) p22;
                    p02.getClass();
                    com.avito.android.error.z.g(aVar.f318719a, new M0(p02), new N0(p02), new O0(p02), null, null, 24);
                    p02.f111435f.d(p02.f111439j);
                    V2.f318762a.d("BxContentSavedSearchPresenter", aVar.f318719a.toString());
                    return;
                }
                return;
            }
            p02.f111439j = z13;
            p02.f111435f.d(z13);
            C29253t0 c29253t02 = p02.f111438i;
            if (c29253t02 != null) {
                c29253t02.Q(p02.f111439j ? InlineAction.Predefined.State.f283118b : InlineAction.Predefined.State.f283119c, str, z13);
            }
            SearchParams searchParams = this.f111444e;
            SavedSearchArgs savedSearchArgs = new SavedSearchArgs(searchParams, null, "bxcontent", searchParams.getArea(), this.f111445f, this.f111446g, this.f111447h, 2, null);
            Bundle bundle = new Bundle();
            bundle.putParcelable("saved_search_args", savedSearchArgs);
            C29253t0 c29253t03 = p02.f111438i;
            if (c29253t03 != null) {
                c29253t03.f112967m.r6(bundle, (DeepLink) ((P2.b) p22).f318720a, null);
            }
        }
    }

    @Inject
    public P0(@Y61.l SearchParams searchParams, @Y61.k com.avito.android.libs.saved_searches.domain.i iVar, @Y61.k TV.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Resources resources, @Y61.k InterfaceC34826e interfaceC34826e) {
        this.f111430a = searchParams;
        this.f111431b = iVar;
        this.f111432c = fVar;
        this.f111433d = interfaceC35745a5;
        this.f111434e = resources;
        this.f111435f = interfaceC34826e;
    }

    @Override // com.avito.android.bxcontent.mvi.L0
    public final void a(@Y61.k PresentationType presentationType, @Y61.l SearchParams searchParams, boolean z12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        io.reactivex.rxjava3.internal.observers.y yVar;
        InterfaceC34826e interfaceC34826e = this.f111435f;
        interfaceC34826e.o();
        if (searchParams == null) {
            searchParams = this.f111430a;
        }
        SearchParams searchParams2 = searchParams;
        if (searchParams2 != null && ((yVar = this.f111436g) == null || yVar.getF318621e())) {
            this.f111440k = str2;
            io.reactivex.rxjava3.internal.operators.observable.L0 l0B = this.f111431b.b(presentationType, searchParams2, str2, searchParams2.getDrawId());
            InterfaceC35745a5 interfaceC35745a5 = this.f111433d;
            this.f111436g = (io.reactivex.rxjava3.internal.observers.y) l0B.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).t0(new a(str2, z12, searchParams2, str, presentationType, str3));
            return;
        }
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f111436g;
        if (yVar2 == null || yVar2.getF318621e()) {
            interfaceC34826e.d(this.f111439j);
        }
    }

    @Override // com.avito.android.bxcontent.mvi.L0
    public final void b(@Y61.k C29253t0 c29253t0, @Y61.l String str) {
        this.f111438i = c29253t0;
        this.f111439j = false;
        this.f111440k = str;
        TV.f fVar = this.f111432c;
        io.reactivex.rxjava3.internal.operators.observable.W wN2 = fVar.getF15687b().N(new Q0(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f111433d;
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = wN2.j0(interfaceC35745a5.e());
        R0 r02 = new R0(this);
        l41.g<? super Throwable> gVar = S0.f111470b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(r02, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f111437h;
        cVar.b(dVarV0);
        cVar.b(fVar.getF15690e().j0(interfaceC35745a5.e()).v0(new T0(this), U0.f111481b, interfaceC43543a));
    }

    @Override // com.avito.android.bxcontent.mvi.L0
    public final void clear() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f111436g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f111435f.invalidate();
        this.f111437h.e();
    }
}
