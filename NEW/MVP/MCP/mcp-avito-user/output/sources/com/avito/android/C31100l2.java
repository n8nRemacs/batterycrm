package com.avito.android;

import android.view.KeyEvent;
import android.view.View;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.deprecated_design.radio_button.lifecycle_view.LifecycleView;
import com.avito.android.remote.model.search.suggest.BannerSuggestItem;
import com.avito.android.remote.model.search.suggest.BubblesSuggestItem;
import com.avito.android.remote.model.search.suggest.GapSuggestItem;
import com.avito.android.remote.model.search.suggest.GridSuggestSnippetItem;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.RedesignTextSuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestBubbleItem;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.avito.android.remote.model.search.suggest.SuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestNewQuery;
import com.avito.android.remote.model.search.suggest.SuggestSnippetItem;
import com.avito.android.remote.model.search.suggest.TextSuggestItem;
import com.avito.android.remote.model.search.suggest.TitleSuggestItem;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import com.avito.android.search_view.ShareButtonEvent;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import iR.C41336a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import iw.C42120a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;

/* compiled from: SearchBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/l2;", "Lcom/avito/android/k2;", "LMU/a;", "Lcom/avito/android/search/n;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.l2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C31100l2 implements InterfaceC31096k2, MU.a, com.avito.android.search.n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f174861a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f174862b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.m f174863c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f174864d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f174865e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search_view.v f174866f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f174867g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<SuggestAction> f174868h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f174869i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.search.p> f174870j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f174871k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f174872l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f174873m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f174874n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public String f174875o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Object f174876p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f174877q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public HistorySuggestItem f174878r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> f174879s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<C42120a> f174880t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShareButtonEvent> f174881u;

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/o;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/search/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$a */
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C31100l2.this.f174870j.accept(((com.avito.android.search.o) obj).f263831a);
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/o;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/search/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C31100l2.this.m(((com.avito.android.search.o) obj).f263832b);
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C31100l2 c31100l2 = C31100l2.this;
            c31100l2.getClass();
            c31100l2.m(C42784z0.f406748b);
        }
    }

    /* compiled from: SearchBar.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C31100l2 c31100l2 = C31100l2.this;
            c31100l2.f174866f.setQuery("");
            io.reactivex.rxjava3.internal.observers.y yVar = c31100l2.f174873m;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            C42784z0 c42784z0 = C42784z0.f406748b;
            c31100l2.f174876p = c42784z0;
            c31100l2.f174867g.f338510e = new UV0.c(c42784z0);
            c31100l2.f174866f.i();
            c31100l2.f174872l.e();
            c31100l2.l();
            c31100l2.f174875o = null;
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$e */
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12;
            String str;
            String str2 = (String) obj;
            C31100l2 c31100l2 = C31100l2.this;
            String str3 = c31100l2.f174875o;
            boolean z12 = (str3 == null || str3.length() == 0 || str2.length() != 0) ? false : true;
            if (z12) {
                c31100l2.f174871k.accept(Boolean.FALSE);
                c31100l2.f174877q = false;
            }
            if (z12 || !((str2.length() == 0 && ((str = c31100l2.f174875o) == null || str.length() == 0)) || kotlin.jvm.internal.L.f(c31100l2.f174875o, str2))) {
                c31100l2.f174875o = str2;
                Iterable<SuggestItem> iterable = (Iterable) c31100l2.f174876p;
                ArrayList arrayList = new ArrayList();
                for (SuggestItem suggestItem : iterable) {
                    if (suggestItem instanceof ToggleSuggestItem) {
                        ToggleSuggestItem toggleSuggestItem = (ToggleSuggestItem) suggestItem;
                        q12 = new kotlin.Q(toggleSuggestItem.getId(), Boolean.valueOf(toggleSuggestItem.getIsChecked()));
                    } else {
                        q12 = null;
                    }
                    if (q12 != null) {
                        arrayList.add(q12);
                    }
                }
                c31100l2.g(str2, kotlin.collections.P0.p(arrayList));
            }
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$f */
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f174887b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.util.V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$g */
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C31100l2 c31100l2 = C31100l2.this;
            c31100l2.getClass();
            if (zBooleanValue) {
                c31100l2.m(C42784z0.f406748b);
                Iterable<SuggestItem> iterable = (Iterable) c31100l2.f174876p;
                ArrayList arrayList = new ArrayList();
                for (SuggestItem suggestItem : iterable) {
                    if (suggestItem instanceof ToggleSuggestItem) {
                        ToggleSuggestItem toggleSuggestItem = (ToggleSuggestItem) suggestItem;
                        q12 = new kotlin.Q(toggleSuggestItem.getId(), Boolean.valueOf(toggleSuggestItem.getIsChecked()));
                    } else {
                        q12 = null;
                    }
                    if (q12 != null) {
                        arrayList.add(q12);
                    }
                }
                Map<String, Boolean> mapP = kotlin.collections.P0.p(arrayList);
                String str = c31100l2.f174875o;
                if (str == null) {
                    str = "";
                }
                c31100l2.g(str, mapP);
            }
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$h */
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f174889b = new h<>();

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.util.V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$i */
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f174890b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            C41336a.C11375a.a();
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$j */
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C31100l2 c31100l2 = C31100l2.this;
            c31100l2.f174871k.accept(Boolean.FALSE);
            c31100l2.f174877q = false;
        }
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.l2$k */
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f174892b = new k<>();

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.util.V2.f318762a.f((Throwable) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31100l2(@Y61.l InterfaceC22983P interfaceC22983P, @Y61.k View view, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.search.m mVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.text.a aVar) throws BlueprintCollisionException {
        this.f174861a = view;
        this.f174862b = interfaceC35745a5;
        this.f174863c = mVar;
        this.f174864d = interfaceC28373a;
        this.f174865e = aVar;
        com.avito.android.search_view.v vVar = (com.avito.android.search_view.v) view;
        vVar.getClass();
        if (interfaceC22983P != null) {
            vVar.g(interfaceC22983P);
        }
        this.f174866f = vVar;
        this.f174868h = new com.jakewharton.rxrelay3.c<>();
        this.f174869i = new com.jakewharton.rxrelay3.c<>();
        this.f174870j = new com.jakewharton.rxrelay3.c<>();
        com.jakewharton.rxrelay3.c<Boolean> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f174871k = cVar;
        this.f174872l = new io.reactivex.rxjava3.disposables.c();
        this.f174874n = new io.reactivex.rxjava3.disposables.c();
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f174876p = c42784z0;
        this.f174878r = new HistorySuggestItem(c42784z0, 0);
        this.f174879s = vVar.getSearchOpeningChanges();
        this.f174880t = vVar.getSearchInputLayoutChanges();
        this.f174881u = vVar.getShareButtonEvents();
        View viewFindViewById = view.findViewById(R.id.toolbar_lifecycle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.radio_button.lifecycle_view.LifecycleView");
        }
        LifecycleView lifecycleView = (LifecycleView) viewFindViewById;
        lifecycleView.setAttachListener(this);
        com.avito.android.list.text_suggest.c cVar2 = new com.avito.android.list.text_suggest.c(new com.avito.android.list.text_suggest.f(this, com.avito.android.lib.util.darkTheme.c.a(view.getContext())));
        com.avito.android.list.gap.a aVar2 = new com.avito.android.list.gap.a(new com.avito.android.list.gap.c());
        com.avito.android.list.title.c cVar3 = new com.avito.android.list.title.c(new com.avito.android.list.title.e());
        com.avito.android.list.new_text_suggest.c cVar4 = new com.avito.android.list.new_text_suggest.c(new com.avito.android.list.new_text_suggest.g(this, com.avito.android.lib.util.darkTheme.c.a(view.getContext())));
        com.avito.android.list.banner.a aVar3 = new com.avito.android.list.banner.a(new com.avito.android.list.banner.d(this, interfaceC28373a));
        com.avito.android.list.toggle.b bVar = new com.avito.android.list.toggle.b(new com.avito.android.list.toggle.g(this));
        com.avito.android.list.list_snippet.b bVar2 = new com.avito.android.list.list_snippet.b(new com.avito.android.list.list_snippet.h(this), aVar);
        com.avito.android.list.grid_snippet.b bVar3 = new com.avito.android.list.grid_snippet.b(new com.avito.android.list.grid_snippet.f(), new com.avito.android.list.grid_snippet.item.a(new com.avito.android.list.grid_snippet.item.f(this), aVar));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar2);
        c10493a.b(aVar2);
        c10493a.b(cVar3);
        c10493a.b(cVar4);
        c10493a.b(aVar3);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f174867g = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVarA);
        jVar.setHasStableIds(true);
        vVar.setAdapter(jVar);
        if (lifecycleView.isAttachedToWindow()) {
            l();
        }
        cVar.accept(Boolean.FALSE);
    }

    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> a() {
        com.avito.android.search_view.v vVar = this.f174866f;
        return vVar instanceof com.avito.android.search_view.h ? ((com.avito.android.search_view.h) vVar).getDismissEvents() : io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
    }

    @Y61.l
    public final View b() {
        com.avito.android.search_view.v vVar = this.f174866f;
        if (vVar instanceof com.avito.android.search_view.h) {
            return ((com.avito.android.search_view.h) vVar).getCartItemView();
        }
        vVar.getClass();
        return null;
    }

    public final void c() {
        this.f174866f.m();
    }

    @Override // com.avito.android.InterfaceC31096k2
    public final void d(int i12) {
        this.f174866f.d(i12);
    }

    @Override // com.avito.android.InterfaceC31096k2
    public final void e(boolean z12, boolean z13) {
        KeyEvent.Callback callback = this.f174861a;
        com.avito.android.search_view.a aVar = callback instanceof com.avito.android.search_view.a ? (com.avito.android.search_view.a) callback : null;
        if (aVar != null) {
            aVar.e(z12, z13);
        }
    }

    @Override // com.avito.android.InterfaceC31096k2
    @Y61.l
    public final Boolean f() {
        KeyEvent.Callback callback = this.f174861a;
        com.avito.android.search_view.a aVar = callback instanceof com.avito.android.search_view.a ? (com.avito.android.search_view.a) callback : null;
        if (aVar == null) {
            return null;
        }
        return Boolean.valueOf(aVar.t());
    }

    @Override // MU.a
    public final void f2() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f174873m;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f174872l.e();
        this.f174874n.e();
        this.f174866f.getClass();
    }

    public final void g(String str, Map<String, Boolean> map) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f174873m;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f174873m = (io.reactivex.rxjava3.internal.observers.y) this.f174863c.c(str, map, this.f174877q).j0(this.f174862b.e()).K(new a()).v0(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public final void h(@Y61.k List<? extends SuggestAction> list) {
        com.avito.android.search_view.v vVar = this.f174866f;
        Toolbar23SearchView toolbar23SearchView = vVar instanceof Toolbar23SearchView ? (Toolbar23SearchView) vVar : null;
        if (toolbar23SearchView != null) {
            toolbar23SearchView.setLeftButtonVisibility(false);
        }
        for (SuggestAction suggestAction : list) {
            this.f174868h.accept(suggestAction);
            if (suggestAction instanceof SuggestNewQuery) {
                this.f174871k.accept(Boolean.TRUE);
                this.f174877q = true;
                vVar.n(((SuggestNewQuery) suggestAction).getQuery());
            } else if (suggestAction instanceof SuggestDeeplink) {
                vVar.getClass();
                vVar.u(new d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // MU.a
    public final void h2() {
        l();
        if (!((Collection) this.f174876p).isEmpty()) {
            m(this.f174876p);
            return;
        }
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f174876p = c42784z0;
        this.f174867g.f338510e = new UV0.c(c42784z0);
        this.f174866f.i();
    }

    public final void i(@Y61.k String str) {
        this.f174866f.setQuery(str);
    }

    public final void j(boolean z12) {
        this.f174866f.setSearchEnabled(z12);
    }

    public final void k() {
        this.f174866f.getClass();
    }

    public final void l() {
        com.avito.android.search_view.v vVar = this.f174866f;
        io.reactivex.rxjava3.core.z<String> zVarDc = vVar.dc();
        InterfaceC35745a5 interfaceC35745a5 = this.f174862b;
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = zVarDc.j0(interfaceC35745a5.e());
        e eVar = new e();
        l41.g<? super Throwable> gVar = f.f174887b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(eVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f174872l;
        cVar.b(dVarV0);
        io.reactivex.rxjava3.core.z<Boolean> zVarQ = vVar.q();
        g gVar2 = new g();
        l41.g<? super Throwable> gVar3 = h.f174889b;
        zVarQ.getClass();
        cVar.b(zVarQ.v0(gVar2, gVar3, interfaceC43543a));
        cVar.b(vVar.o6().j0(interfaceC35745a5.e()).K(i.f174890b).t0(this.f174869i));
        io.reactivex.rxjava3.core.z<kotlin.G0> zVarA = a();
        j jVar = new j();
        l41.g<? super Throwable> gVar4 = k.f174892b;
        zVarA.getClass();
        cVar.b(zVarA.v0(jVar, gVar4, interfaceC43543a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    public final void m(List<? extends SuggestItem> list) {
        Object next;
        List<SuggestBubbleItem> items;
        ?? next2;
        this.f174876p = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                this.f174867g.f338510e = new UV0.c(arrayList);
                com.avito.android.search_view.v vVar = this.f174866f;
                vVar.i();
                List<? extends SuggestItem> list2 = list;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (next instanceof BubblesSuggestItem) {
                            break;
                        }
                    }
                }
                if (!(next instanceof BubblesSuggestItem)) {
                    next = null;
                }
                BubblesSuggestItem bubblesSuggestItem = (BubblesSuggestItem) next;
                if (bubblesSuggestItem == null || (items = bubblesSuggestItem.getItems()) == null) {
                    items = C42784z0.f406748b;
                }
                List<SuggestBubbleItem> list3 = items;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new com.avito.android.search.b((SuggestBubbleItem) it3.next()));
                }
                vVar.A(new C31611m2(this), arrayList2);
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = 0;
                        break;
                    } else {
                        next2 = it4.next();
                        if (next2 instanceof HistorySuggestItem) {
                            break;
                        }
                    }
                }
                HistorySuggestItem historySuggestItem = next2 instanceof HistorySuggestItem ? next2 : null;
                if (historySuggestItem == null) {
                    historySuggestItem = new HistorySuggestItem(C42784z0.f406748b, 0);
                }
                this.f174878r = historySuggestItem;
                vVar.y(historySuggestItem, new C32899n2(this), new C32903o2(this));
                return;
            }
            Object next3 = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SuggestItem suggestItem = (SuggestItem) next3;
            String strValueOf = String.valueOf(i12);
            if (suggestItem instanceof TextSuggestItem) {
                arrayList.add(new com.avito.android.search.q(strValueOf, (TextSuggestItem) suggestItem));
            } else if (suggestItem instanceof RedesignTextSuggestItem) {
                arrayList.add(new com.avito.android.list.new_text_suggest.a(strValueOf, (RedesignTextSuggestItem) suggestItem));
            } else if (suggestItem instanceof GapSuggestItem) {
                arrayList.add(new com.avito.android.search.d(strValueOf, (GapSuggestItem) suggestItem));
            } else if (suggestItem instanceof TitleSuggestItem) {
                arrayList.add(new com.avito.android.search.r(strValueOf, (TitleSuggestItem) suggestItem));
            } else if (suggestItem instanceof BannerSuggestItem) {
                arrayList.add(new com.avito.android.search.a(strValueOf, (BannerSuggestItem) suggestItem));
            } else if (suggestItem instanceof ToggleSuggestItem) {
                arrayList.add(new com.avito.android.list.toggle.d(strValueOf, (ToggleSuggestItem) suggestItem));
            } else if (suggestItem instanceof SuggestSnippetItem) {
                arrayList.add(new com.avito.android.list.list_snippet.e(strValueOf, (SuggestSnippetItem) suggestItem));
            } else if (suggestItem instanceof GridSuggestSnippetItem) {
                com.avito.android.search.l lVar = (com.avito.android.search.l) C42745f0.Q(arrayList);
                if (lVar instanceof com.avito.android.list.grid_snippet.d) {
                    ArrayList arrayList3 = new ArrayList(((com.avito.android.list.grid_snippet.d) lVar).f181569c);
                    arrayList3.add(new com.avito.android.list.grid_snippet.item.c(strValueOf, (GridSuggestSnippetItem) suggestItem));
                    arrayList.remove(lVar);
                    arrayList.add(new com.avito.android.list.grid_snippet.d(strValueOf, arrayList3));
                } else {
                    arrayList.add(new com.avito.android.list.grid_snippet.d(strValueOf, Collections.singletonList(new com.avito.android.list.grid_snippet.item.c(strValueOf, (GridSuggestSnippetItem) suggestItem))));
                }
            }
            i12 = i13;
        }
    }

    @Override // com.avito.android.InterfaceC31096k2
    public final void setSaveSearchInHeaderOnScroll(boolean z12) {
        this.f174866f.setSaveSearchInHeaderOnScroll(z12);
    }

    public /* synthetic */ C31100l2(InterfaceC22983P interfaceC22983P, View view, InterfaceC35745a5 interfaceC35745a5, com.avito.android.search.m mVar, InterfaceC28373a interfaceC28373a, com.avito.android.util.text.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : interfaceC22983P, view, interfaceC35745a5, (i12 & 8) != 0 ? new com.avito.android.search.c() : mVar, interfaceC28373a, aVar);
    }
}
