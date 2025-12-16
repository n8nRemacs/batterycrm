package com.avito.android.realty_agency.inline_filters.developer_suggest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.view.C22981N;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import gi0.C40689d;
import gi0.InterfaceC40688c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: DeveloperSuggestFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/developer_suggest/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"InflateParams"})
/* loaded from: classes16.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f251517J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final N f251518E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final N f251519F;

    /* renamed from: G, reason: collision with root package name */
    @Inject
    public k f251520G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final View f251521H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final n f251522I;

    /* compiled from: DeveloperSuggestFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC40688c, G0> {
        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(InterfaceC40688c interfaceC40688c) {
            InterfaceC40688c interfaceC40688c2 = interfaceC40688c;
            d dVar = (d) this.receiver;
            int i12 = d.f251517J;
            dVar.getClass();
            if (interfaceC40688c2 instanceof InterfaceC40688c.a) {
                dVar.f251518E.invoke(((InterfaceC40688c.a) interfaceC40688c2).f396743a);
                K2.d(dVar.f251521H, true);
                dVar.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeveloperSuggestFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<C40689d, G0> {
        @Override // Y41.l
        public final G0 invoke(C40689d c40689d) {
            C40689d c40689d2 = c40689d;
            d dVar = (d) this.receiver;
            int i12 = d.f251517J;
            dVar.getClass();
            List<com.avito.android.inline_filters.dialog.select.adapter.i> list = c40689d2.f396748c;
            boolean zIsEmpty = list.isEmpty();
            n nVar = dVar.f251522I;
            TextView textView = nVar.f251559n;
            D6.G(textView, zIsEmpty);
            D6.G(nVar.f251558m, !zIsEmpty);
            if (zIsEmpty) {
                Context context = textView.getContext();
                String str = c40689d2.f396749d;
                textView.setText(str.length() == 0 ? context.getString(R.string.realty_agency_inline_filters_developer_suggest_filter_empty_query) : context.getString(R.string.realty_agency_inline_filters_developer_suggest_filter_no_results, str));
            }
            nVar.k(list, null);
            return G0.f406611a;
        }
    }

    /* compiled from: DeveloperSuggestFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            d dVar = d.this;
            dVar.f251519F.invoke();
            K2.f(dVar.f251521H, 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Context context, @Y61.k String str, @Y61.l String str2, @Y61.l DevelopmentSuggestV1Suggest developmentSuggestV1Suggest, @Y61.k Y41.l<? super DevelopmentSuggestV1Suggest, G0> lVar, @Y61.k Y41.a<G0> aVar) {
        String name;
        super(context, 0, 2, null);
        this.f251518E = (N) lVar;
        this.f251519F = (N) aVar;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.inline_filters_dialog, (ViewGroup) null);
        this.f251521H = viewInflate;
        c cVar = new c();
        com.avito.android.realty_agency.inline_filters.developer_suggest.di.a.a().a((com.avito.android.realty_agency.inline_filters.developer_suggest.di.c) C29972i.a(C29972i.b(this), com.avito.android.realty_agency.inline_filters.developer_suggest.di.c.class), context.getResources(), str2, developmentSuggestV1Suggest).a(this);
        n nVar = new n(viewInflate);
        nVar.setTitle(str);
        String string = context.getString(R.string.search);
        Input input = nVar.f172036e;
        input.setHint(string);
        nVar.Qd(new e(viewInflate, this));
        nVar.Sd(new f(this, cVar));
        nVar.Ud(developmentSuggestV1Suggest != null);
        C43175k.K(new C43197r1(new g(this, null), y.a(nVar.f172041j)), C22981N.a(getLifecycle()));
        C43175k.K(new C43152f0(new C43197r1(new h(this, null), y.a(com.avito.android.lib.design.input.n.e(input).y(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b))), new i(3, null)), C22981N.a(getLifecycle()));
        this.f251522I = nVar;
        if (developmentSuggestV1Suggest != null && (name = developmentSuggestV1Suggest.getName()) != null) {
            Input.t(input, name, false, 6);
        }
        G(viewInflate, false);
        T();
        setOnDismissListener(new com.avito.android.advert_item_actions.view.d(4, cVar));
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        K(true);
        J(true);
        k kVar = this.f251520G;
        com.avito.android.arch.mvi.android.f.a(kVar != null ? kVar : null, this, Lifecycle.State.f46682e, new a(1, this, d.class, "handleEvent", "handleEvent(Lcom/avito/android/realty_agency/inline_filters/developer_suggest/mvi/entity/DeveloperSuggestFilterOneTimeEvent;)V", 0), new b(1, this, d.class, "render", "render(Lcom/avito/android/realty_agency/inline_filters/developer_suggest/mvi/entity/DeveloperSuggestFilterState;)V", 0));
    }
}
