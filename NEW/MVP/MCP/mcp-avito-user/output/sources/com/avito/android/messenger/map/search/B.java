package com.avito.android.messenger.map.search;

import KY.a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.map.search.z;
import com.avito.android.mvi.e;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.internal.operators.observable.L;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: GeoSearchView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/B;", "Lcom/avito/android/messenger/map/search/z;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B implements z {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f196467m = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/map/search/GeoSearchView$State;", B.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f196468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f196469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f196470d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C35971x f196471e = new C35971x();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f196472f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f196473g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f196474h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f196475i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final KY.b f196476j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final L f196477k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f196478l;

    /* compiled from: GeoSearchView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/j;", "invoke", "()Lcom/avito/konveyor/adapter/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.konveyor.adapter.j> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.konveyor.adapter.j invoke() {
            B b12 = B.this;
            com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(b12.f196469c, b12.f196470d);
            b12.f196473g.setAdapter(jVar);
            return jVar;
        }
    }

    /* compiled from: GeoSearchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f196480b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            return charSequence.length() == 0 || com.avito.android.util.L.a(charSequence) >= 3;
        }
    }

    public B(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f196468b = view;
        this.f196469c = aVar2;
        this.f196470d = aVar;
        Input input = (Input) view.findViewById(R.id.geo_search_field);
        this.f196472f = input;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.messenger_geo_search_list);
        this.f196473g = recyclerView;
        this.f196474h = C42727D.b(LazyThreadSafetyMode.f406616d, new a());
        this.f196475i = view.findViewById(R.id.messenger_geo_search_list_placeholder);
        a.C0576a c0576a = KY.a.f9510u1;
        View viewFindViewById = view.findViewById(R.id.messenger_geo_search_connection_error_indicator);
        c0576a.getClass();
        this.f196476j = new KY.b(viewFindViewById);
        this.f196477k = com.avito.android.lib.design.input.n.e(input).N0().y(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).N(b.f196480b).d0(new l41.o() { // from class: com.avito.android.messenger.map.search.B.c
            @Override // l41.o
            public final Object apply(Object obj) {
                return ((CharSequence) obj).toString();
            }
        }).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
        input.setOnEditorActionListener(new A(0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
    }

    @Override // com.avito.android.mvi.e
    public final z.c a(com.avito.android.mvi.e<z.c> eVar) {
        C35971x c35971x = this.f196471e;
        kotlin.reflect.n<Object> nVar = f196467m[0];
        return (z.c) c35971x.f319122b;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.avito.android.messenger.map.search.z$c] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        C35971x c35971x = this.f196471e;
        kotlin.reflect.n<Object> nVar = f196467m[0];
        c35971x.f319122b = (z.c) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<z.c> eVar, z.c cVar, z.c cVar2) {
        z.c cVar3 = cVar2;
        if (cVar3.getF196610d()) {
            this.f196478l = true;
            this.f196468b.postDelayed(new C(this), 300L);
        } else {
            this.f196478l = false;
            this.f196472f.setLoading(false);
        }
        z.b f196609c = cVar3.getF196609c();
        boolean zF2 = kotlin.jvm.internal.L.f(f196609c, z.b.a.f196624a);
        ?? r02 = this.f196474h;
        com.avito.konveyor.adapter.a aVar = this.f196469c;
        RecyclerView recyclerView = this.f196473g;
        View view = this.f196475i;
        if (zF2) {
            D6.w(view);
            D6.H(recyclerView);
            aVar.c(new UV0.c(C42784z0.f406748b));
            ((RecyclerView.Adapter) r02.getValue()).notifyDataSetChanged();
        } else if (kotlin.jvm.internal.L.f(f196609c, z.b.C5783b.f196625a)) {
            D6.w(recyclerView);
            D6.H(view);
        } else if (f196609c instanceof z.b.c) {
            D6.w(view);
            D6.H(recyclerView);
            aVar.c(new UV0.c(((z.b.c) cVar3.getF196609c()).f196626a));
            ((RecyclerView.Adapter) r02.getValue()).notifyDataSetChanged();
        }
        a.c f196611e = cVar3.getF196611e();
        KY.b bVar = this.f196476j;
        bVar.getClass();
        e.a.a(bVar, f196611e);
    }
}
