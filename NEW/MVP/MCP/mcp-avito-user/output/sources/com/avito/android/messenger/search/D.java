package com.avito.android.messenger.search;

import Fc1.C13589d1;
import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.favorite_sellers.C30597v;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.l0;
import com.avito.android.messenger.search.B;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35971x;
import com.avito.android.util.K2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsSearchView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/D;", "Lcom/avito/android/messenger/search/B;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class D implements B {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f197013t = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/RendererWithDiff;)Lcom/avito/android/messenger/search/ChannelsSearchView$State;", D.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f197014b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f197015c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f197016d;

    /* renamed from: e, reason: collision with root package name */
    public final Input f197017e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f197018f;

    /* renamed from: g, reason: collision with root package name */
    public final View f197019g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f197020h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f197021i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f197022j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final B0 f197023k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f197024l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f197025m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f197026n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C35971x f197027o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Object f197028p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C f197029q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final l0 f197030r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197031s;

    /* compiled from: ChannelsSearchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/e5;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/e5;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            K2.d(D.this.f197017e, false);
        }
    }

    /* compiled from: ChannelsSearchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/j;", "invoke", "()Lcom/avito/konveyor/adapter/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.konveyor.adapter.j> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.a f197034m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.konveyor.a aVar) {
            super(0);
            this.f197034m = aVar;
        }

        @Override // Y41.a
        public final com.avito.konveyor.adapter.j invoke() {
            D d12 = D.this;
            com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(d12.f197015c, this.f197034m);
            d12.f197018f.setAdapter(jVar);
            return jVar;
        }
    }

    /* compiled from: ChannelsSearchView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/search/D$c", "Landroid/widget/TextView$OnEditorActionListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextView.OnEditorActionListener {
        public c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(@Y61.l TextView textView, int i12, @Y61.l KeyEvent keyEvent) {
            if (i12 != 3) {
                return false;
            }
            D d12 = D.this;
            com.avito.android.lib.design.toast_bar.k kVar = d12.f197022j;
            if (kVar != null) {
                kVar.f();
            }
            K2.d(d12.f197017e, true);
            d12.f197024l.accept(G0.f406611a);
            return true;
        }
    }

    /* compiled from: ChannelsSearchView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = D.this.f197025m;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: ChannelsSearchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f197037b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((CharSequence) obj).toString();
        }
    }

    /* compiled from: ChannelsSearchView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = D.this;
            d12.f197022j = null;
            G0 g02 = G0.f406611a;
            d12.f197026n.accept(g02);
            return g02;
        }
    }

    public D(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, boolean z12) {
        this.f197014b = viewGroup;
        this.f197015c = aVar;
        Resources resources = viewGroup.getResources();
        this.f197016d = viewGroup.getContext();
        Input input = (Input) viewGroup.findViewById(R.id.search_field);
        this.f197017e = input;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.items);
        this.f197018f = recyclerView;
        this.f197019g = viewGroup.findViewById(R.id.message_container);
        this.f197020h = (TextView) viewGroup.findViewById(R.id.message);
        this.f197021i = (TextView) viewGroup.findViewById(R.id.description);
        this.f197023k = com.avito.android.lib.design.input.n.e(input).N0().d0(e.f197037b);
        this.f197024l = new com.jakewharton.rxrelay3.c();
        this.f197025m = new com.jakewharton.rxrelay3.c();
        this.f197026n = new com.jakewharton.rxrelay3.c();
        this.f197027o = new C35971x();
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.f197028p = C42727D.b(LazyThreadSafetyMode.f406616d, new b(aVar2));
        this.f197029q = new C(this, 1);
        l0 l0Var = new l0(linearLayoutManager, new d());
        this.f197030r = l0Var;
        c cVar = new c();
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f197031s = cVar2;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.o(l0Var);
        cVar2.b(new io.reactivex.rxjava3.internal.operators.observable.C(new C13589d1(recyclerView, kotlin.math.b.b(16 * resources.getDisplayMetrics().density))).C0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new a()));
        input.setOnEditorActionListener(cVar);
        if (z12) {
            viewGroup.post(new C(this, 2));
        }
    }

    public final void a() {
        this.f197014b.removeCallbacks(this.f197029q);
        this.f197017e.setLoading(false);
    }

    public final void b(String str, Throwable th2) {
        f.c cVarB;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        List listSingletonList = Collections.singletonList(new c.a.C3719a(this.f197016d.getString(R.string.retry), true, null, new f(), 4, null));
        if (th2 != null) {
            cVarB = new f.c(th2);
        } else {
            f.c.f125255c.getClass();
            cVarB = f.c.a.b();
        }
        this.f197022j = com.avito.android.component.toast.c.b(cVar, this.f197014b, printableTextF, null, listSingletonList, null, cVarB, -1, null, null, false, false, new C30597v(this, 2), null, 3018);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.g
    public final Object c() {
        kotlin.reflect.n<Object> nVar = f197013t[0];
        return (B.b) this.f197027o.f319122b;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.avito.android.messenger.search.B$b] */
    @Override // com.avito.android.mvi.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.avito.android.messenger.search.B.b r8, androidx.recyclerview.widget.C23424o.e r9) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.search.D.h(java.lang.Object, androidx.recyclerview.widget.o$e):void");
    }
}
