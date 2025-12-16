package com.avito.android.advertising.adapter.items.adstub.avl;

import Eb.C13469a;
import TV0.g;
import Y41.p;
import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.CommercialUnavailableItem;
import com.avito.android.advertising.ui.adstub.CommercialUnavailableView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommercialUnavailableAvlBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/avl/g;", "LTV0/b;", "LEb/a;", "Lcom/avito/android/advertising/CommercialUnavailableItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements TV0.b<C13469a, CommercialUnavailableItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f86924a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<C13469a> f86925b = new g.a<>(R.layout.ad_avl_unavailable_view, a.f86926l);

    /* compiled from: CommercialUnavailableAvlBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LEb/a;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LEb/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, C13469a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f86926l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C13469a invoke(ViewGroup viewGroup, View view) {
            C13469a c13469a = new C13469a(view);
            CommercialUnavailableView commercialUnavailableView = c13469a.f4088d;
            Drawable drawableH = C35835l0.h(R.attr.ic_exclamationMarkOutline20, commercialUnavailableView.getContext());
            if (drawableH != null) {
                drawableH.setBounds(0, 0, y6.b(20), y6.b(20));
                TextView textView = commercialUnavailableView.f88557b;
                I5.d(textView, drawableH, null, 14);
                textView.setText(commercialUnavailableView.getResources().getString(R.string.ad_unavailable_notloaded));
            }
            return c13469a;
        }
    }

    @Inject
    public g(@k i iVar) {
        this.f86924a = iVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86924a;
    }

    @Override // TV0.b
    @k
    public final g.a<C13469a> b() {
        return this.f86925b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CommercialUnavailableItem;
    }
}
