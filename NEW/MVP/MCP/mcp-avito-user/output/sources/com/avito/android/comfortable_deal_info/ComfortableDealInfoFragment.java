package com.avito.android.comfortable_deal_info;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import md.InterfaceC44055a;

/* compiled from: ComfortableDealInfoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComfortableDealInfoFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public l<? super Integer, G0> f123454n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final C35968w3 f123455o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f123456p0;

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f123453r0 = {m0.f406844a.e(new Y(ComfortableDealInfoFragment.class, "openParams", "getOpenParams()Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoParams;", 0))};

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f123452q0 = new a(null);

    /* compiled from: ComfortableDealInfoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ComfortableDealInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Context> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Context invoke() {
            return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, ComfortableDealInfoFragment.this.requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        }
    }

    public ComfortableDealInfoFragment() {
        super(R.layout.comfortable_deal_info_fragment);
        this.f123455o0 = new C35968w3(this);
        this.f123456p0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ((com.avito.android.comfortable_deal_info.di.e) ((InterfaceC44055a) getParentFragment()).r0()).b().create().a(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        n<Object>[] nVarArr = f123453r0;
        n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f123455o0;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(((ComfortableDealInfoParams) c35968w3.getValue(this, nVar)).f123458b, com.avito.android.lib.util.darkTheme.c.b((Context) this.f123456p0.getValue()));
        simpleDraweeView.setVisibility(imageDependsOnTheme != null ? 0 : 8);
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnTheme), null, null, null, 14);
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        j.a((TextView) viewFindViewById2, ((ComfortableDealInfoParams) c35968w3.getValue(this, nVarArr[0])).f123459c, null);
        l<? super Integer, G0> lVar = this.f123454n0;
        (lVar != null ? lVar : null).invoke(Integer.valueOf(((ComfortableDealInfoParams) c35968w3.getValue(this, nVarArr[0])).f123461e));
    }
}
