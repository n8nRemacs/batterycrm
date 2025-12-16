package com.avito.android.brandspace.view;

import Y61.k;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23494e;
import androidx.transition.C23503n;
import androidx.transition.T;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.p;
import com.avito.android.progress_overlay.l;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BrandspaceViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/view/h;", "Lcom/avito/android/brandspace/view/g;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f107792a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f107793b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f107794c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f107795d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f107796e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Toolbar f107797f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f107798g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RecyclerView f107799h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RecyclerView f107800i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final l f107801j;

    public h(@k View view, @k io.reactivex.rxjava3.disposables.c cVar, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a2, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a3, @k Toolbar toolbar) {
        this.f107792a = view;
        this.f107793b = cVar;
        this.f107794c = abstractC25658a;
        this.f107795d = abstractC25658a2;
        this.f107796e = abstractC25658a3;
        this.f107797f = toolbar;
        this.f107798g = (RecyclerView) view.findViewById(R.id.brandspace_top_list);
        this.f107799h = (RecyclerView) view.findViewById(R.id.brandspace_main_list);
        this.f107800i = (RecyclerView) view.findViewById(R.id.brandspace_bottom_list);
        this.f107801j = new l((ViewGroup) view.findViewById(R.id.brandspace_overlay_container), R.id.brandspace_content, null, 0, 0, 28, null);
    }

    public final void a(@k z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVar, @k z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVar2, @k z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVar3) {
        com.avito.android.beduin_shared.model.utils.l.b(C42745f0.U(new Q(zVar, this.f107794c), new Q(zVar2, this.f107795d), new Q(zVar3, this.f107796e)), this.f107793b);
    }

    public final void b(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f107794c;
        if (list != null) {
            abstractC25658a.m(list);
        }
        com.avito.android.beduin_shared.model.utils.h.b(this.f107798g, abstractC25658a);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f107795d;
        if (list2 != null) {
            abstractC25658a2.m(list2);
        }
        com.avito.android.beduin_shared.model.utils.h.b(this.f107799h, abstractC25658a2);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f107796e;
        if (list3 != null) {
            abstractC25658a3.m(list3);
        }
        com.avito.android.beduin_shared.model.utils.h.b(this.f107800i, abstractC25658a3);
    }

    public final void c(View view, View view2, SimpleDraweeView simpleDraweeView, float f12, Boolean bool) throws Resources.NotFoundException {
        View view3 = this.f107792a;
        int dimensionPixelSize = view3.getResources().getDimensionPixelSize(R.dimen.brandspace_logo_minwidth);
        int dimensionPixelSize2 = view3.getResources().getDimensionPixelSize(R.dimen.brandspace_logo_horizontal_padding);
        D6.f(view, dimensionPixelSize2, 0, dimensionPixelSize2, 0, 10);
        view.setMinimumWidth(dimensionPixelSize);
        view.setBackground(androidx.core.content.d.getDrawable(view3.getContext(), R.drawable.brandspace_logo_bg));
        D6.G(view, true);
        if (L.f(bool, Boolean.TRUE)) {
            view.setBackground(null);
            D6.w(view2);
        } else {
            D6.G(view2, true);
        }
        simpleDraweeView.setAspectRatio(f12);
    }

    public final void d(@k String str, @Y61.l Float f12, @Y61.l Boolean bool, @k Y41.l<? super Float, G0> lVar) {
        View viewFindViewById;
        View viewFindViewById2;
        SimpleDraweeView simpleDraweeView;
        View viewFindViewById3;
        Toolbar toolbar = this.f107797f;
        ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(R.id.logo_block);
        if (viewGroup == null || (viewFindViewById = toolbar.findViewById(R.id.logo_container)) == null || (viewFindViewById2 = toolbar.findViewById(R.id.brandspace_avito_logo)) == null || (simpleDraweeView = (SimpleDraweeView) toolbar.findViewById(R.id.brand_logo)) == null || (viewFindViewById3 = toolbar.findViewById(R.id.brand_logo_divider)) == null) {
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(new p(Uri.parse(str)));
        if (f12 != null) {
            if (L.f(bool, Boolean.TRUE)) {
                D6.w(viewFindViewById2);
            } else {
                D6.G(viewFindViewById2, true);
            }
            c(viewFindViewById, viewFindViewById3, simpleDraweeView, f12.floatValue(), bool);
        } else {
            viewFindViewById.setBackground(null);
            D6.f(viewFindViewById, 0, 0, 0, 0, 10);
            D6.w(viewFindViewById3);
            if (L.f(bool, Boolean.TRUE)) {
                D6.w(viewFindViewById2);
            } else {
                D6.G(viewFindViewById, true);
                D6.G(viewFindViewById2, true);
            }
            aVarA.f169490h = new a(viewGroup, this, viewFindViewById, viewFindViewById3, simpleDraweeView, bool, lVar);
        }
        aVarA.c();
    }

    public final void e(@k InterfaceC39736a interfaceC39736a, @k InterfaceC39736a interfaceC39736a2, @k InterfaceC39736a interfaceC39736a3) {
        this.f107794c.o(interfaceC39736a);
        this.f107795d.o(interfaceC39736a2);
        this.f107796e.o(interfaceC39736a3);
    }

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.image_loader.i {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f107802b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f107803c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f107804d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f107805e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ SimpleDraweeView f107806f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Boolean f107807g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ N f107808h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewGroup viewGroup, h hVar, View view, View view2, SimpleDraweeView simpleDraweeView, Boolean bool, Y41.l lVar) {
            this.f107802b = viewGroup;
            this.f107803c = hVar;
            this.f107804d = view;
            this.f107805e = view2;
            this.f107806f = simpleDraweeView;
            this.f107807g = bool;
            this.f107808h = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r8v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) throws Resources.NotFoundException {
            this.f107803c.getClass();
            T t12 = new T();
            t12.Q(0);
            t12.E(300L);
            t12.N(new C23503n(2));
            t12.N(new C23494e());
            t12.N(new C23503n(1));
            androidx.transition.Q.a(this.f107802b, t12);
            float f12 = i12 / i13;
            this.f107803c.c(this.f107804d, this.f107805e, this.f107806f, f12, this.f107807g);
            this.f107808h.invoke(Float.valueOf(f12));
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@Y61.l Throwable th2) {
        }
    }
}
