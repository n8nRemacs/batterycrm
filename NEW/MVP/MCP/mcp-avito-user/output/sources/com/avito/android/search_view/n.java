package com.avito.android.search_view;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import iw.C42120a;
import j.InterfaceC42150f;
import j.InterfaceC42158n;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ServicesOrderRequestsSearchView.kt */
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001b\u0010\nR(\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010-\u001a\b\u0012\u0004\u0012\u00020*0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R \u00101\u001a\b\u0012\u0004\u0012\u00020.0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(¨\u00062"}, d2 = {"Lcom/avito/android/search_view/n;", "Landroid/widget/FrameLayout;", "Landroid/widget/Toolbar$OnMenuItemClickListener;", "Lcom/avito/android/search_view/v;", "", "text", "Lkotlin/G0;", "setQuery", "(I)V", "", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "hint", "setHint", "getHint", "", "enabled", "setSearchEnabled", "(Z)V", "top", "setTopPadding", "menuId", "setMenu", "getSavedSearchStateVisibility", "()Z", "iconName", "setNavigationIcon", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "g", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "adapter", "Lio/reactivex/rxjava3/core/z;", "h", "Lio/reactivex/rxjava3/core/z;", "getSearchOpeningChanges", "()Lio/reactivex/rxjava3/core/z;", "searchOpeningChanges", "Liw/a;", "i", "getSearchInputLayoutChanges", "searchInputLayoutChanges", "Lcom/avito/android/search_view/ShareButtonEvent;", "j", "getShareButtonEvents", "shareButtonEvents", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends FrameLayout implements Toolbar.OnMenuItemClickListener, v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f264574b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f264575c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f264576d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264577e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f264578f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public RecyclerView.Adapter<?> adapter;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final U f264580h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final U f264581i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final U f264582j;

    public n(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f264578f = new com.jakewharton.rxrelay3.c<>();
        U u12 = U.f403867b;
        this.f264580h = u12;
        this.f264581i = u12;
        this.f264582j = u12;
        LayoutInflater.from(context).inflate(R.layout.toolbar_without_search, (ViewGroup) this, true);
        setId(R.id.toolbar_without_search);
        View viewFindViewById = findViewById(R.id.toolbar_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f264574b = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.toolbar_bottom_offset);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f264575c = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.toolbar_up_button_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f264576d = imageView;
        View viewFindViewById4 = findViewById(R.id.search_bar_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f264577e = (ViewGroup) viewFindViewById4;
        imageView.setOnClickListener(new com.avito.android.review_gallery.g(this, 13));
    }

    private final void setNavigationIcon(String iconName) {
        Drawable drawableH;
        if (iconName == null) {
            iconName = "";
        }
        Integer numA = com.avito.android.lib.util.q.a(iconName);
        if (numA != null) {
            drawableH = C35835l0.h(numA.intValue(), getContext());
        } else {
            drawableH = null;
        }
        ImageView imageView = this.f264576d;
        if (drawableH != null) {
            imageView.setImageDrawable(drawableH);
        } else {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowBack24, getContext()));
        }
    }

    @Override // com.avito.android.search_view.v
    public final void a(@Y61.k k kVar, float f12) {
        if (!kVar.f264563g) {
            f12 = 1.0f;
        }
        setNavigationIcon(kVar.f264562f);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer numValueOf = Integer.valueOf(C35835l0.d(R.attr.white, getContext()));
        Context context = getContext();
        C48063a c48063a = C48063a.f437606a;
        int iIntValue = ((Integer) argbEvaluator.evaluate(f12, numValueOf, Integer.valueOf(c48063a.a(context, kVar.f264557a)))).intValue();
        int iIntValue2 = ((Integer) new ArgbEvaluator().evaluate(f12, Integer.valueOf(C35835l0.d(R.attr.black, getContext())), Integer.valueOf(c48063a.a(getContext(), kVar.f264558b)))).intValue();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(((Integer) new ArgbEvaluator().evaluate(f12, Integer.valueOf(androidx.core.content.d.getColor(getContext(), R.color.common_warm_gray_16)), Integer.valueOf(androidx.core.content.d.getColor(getContext(), com.avito.android.lib.util.darkTheme.d.a(kVar.f264560d, com.avito.android.lib.util.darkTheme.c.a(getContext())) ? R.color.custom_product_color_constant_warm_gray_36 : R.color.custom_product_color_constant_warm_gray_36_night)))).intValue());
        this.f264577e.setBackgroundColor(iIntValue);
        this.f264575c.setBackgroundColor(iIntValue);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iIntValue2);
        ImageView imageView = this.f264576d;
        imageView.setImageTintList(colorStateListValueOf2);
        imageView.setBackground(V0.c(colorStateListValueOf));
    }

    @Override // com.avito.android.search_view.v
    public final void b() {
        setNavigationIcon(null);
        int iD2 = C35835l0.d(R.attr.white, getContext());
        int iD3 = C35835l0.d(R.attr.black, getContext());
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.content.d.getColor(getContext(), R.color.common_warm_gray_16));
        this.f264577e.setBackgroundColor(iD2);
        this.f264575c.setBackgroundColor(iD2);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iD3);
        ImageView imageView = this.f264576d;
        imageView.setImageTintList(colorStateListValueOf2);
        imageView.setBackground(V0.c(colorStateListValueOf));
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<String> dc() {
        return U.f403867b;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<Integer> e5() {
        return U.f403867b;
    }

    @Y61.l
    public RecyclerView.Adapter<?> getAdapter() {
        return this.adapter;
    }

    @Override // com.avito.android.search_view.v
    @Y61.l
    public String getHint() {
        return null;
    }

    @Y61.l
    public String getQuery() {
        return null;
    }

    public boolean getSavedSearchStateVisibility() {
        return false;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public z<C42120a> getSearchInputLayoutChanges() {
        return this.f264581i;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public z<Boolean> getSearchOpeningChanges() {
        return this.f264580h;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public z<ShareButtonEvent> getShareButtonEvents() {
        return this.f264582j;
    }

    @Override // com.avito.android.search_view.v
    public final void m() {
        D6.w(this.f264576d);
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<String> o6() {
        return U.f403867b;
    }

    @Override // android.widget.Toolbar.OnMenuItemClickListener
    public final boolean onMenuItemClick(@Y61.l MenuItem menuItem) {
        return false;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<Boolean> q() {
        return U.f403867b;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<DeepLink> s() {
        return U.f403867b;
    }

    @Override // com.avito.android.search_view.v
    public void setAdapter(@Y61.l RecyclerView.Adapter<?> adapter) {
        this.adapter = adapter;
    }

    public void setQuery(int text) {
    }

    @Override // com.avito.android.search_view.v
    /* renamed from: v */
    public final boolean getF264475h0() {
        return false;
    }

    @Override // com.avito.android.search_view.v
    public final void w() {
        D6.H(this.f264576d);
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<G0> z() {
        return this.f264578f;
    }

    @Override // com.avito.android.search_view.v
    public void setQuery(@Y61.k String text) {
    }

    @Override // com.avito.android.search_view.v
    public final void c() {
    }

    @Override // com.avito.android.search_view.v
    public final void close() {
    }

    @Override // com.avito.android.search_view.v
    public final void h() {
    }

    @Override // com.avito.android.search_view.v
    public final void i() {
    }

    @Override // com.avito.android.search_view.v
    public final void k() {
    }

    @Override // com.avito.android.search_view.v
    public final void o() {
    }

    @Override // com.avito.android.search_view.v
    public final void x() {
    }

    @Override // com.avito.android.search_view.v
    public final void d(int i12) {
    }

    @Override // com.avito.android.search_view.v
    public final void g(@Y61.k InterfaceC22983P interfaceC22983P) {
    }

    @Override // com.avito.android.search_view.v
    public final void j(boolean z12) {
    }

    @Override // com.avito.android.search_view.v
    public final void n(@Y61.k String str) {
    }

    @Override // com.avito.android.search_view.v
    public final void p(@Y61.k SubscriptionButtonState subscriptionButtonState) {
    }

    @Override // com.avito.android.search_view.v
    public void setHint(@Y61.k String hint) {
    }

    @Override // com.avito.android.search_view.v
    public void setInputClickListener(@Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.search_view.v
    public void setMenu(int menuId) {
    }

    public void setMenuTintColor(@InterfaceC42158n int i12) {
    }

    public void setMenuTintColorAttr(@InterfaceC42150f int i12) {
    }

    @Override // com.avito.android.search_view.v
    public void setSaveSearchInHeaderOnScroll(boolean z12) {
    }

    @Override // com.avito.android.search_view.v
    public void setSearchEnabled(boolean enabled) {
    }

    @Override // com.avito.android.search_view.v
    public void setTopPadding(int top) {
    }

    @Override // com.avito.android.search_view.v
    public void setUserMovedMapSinceLastLocationUpdate(boolean z12) {
    }

    @Override // com.avito.android.search_view.v
    public final void u(@Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.search_view.v
    public final void A(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
    }

    @Override // com.avito.android.search_view.v
    public final void l(int i12, int i13) {
    }

    @Override // com.avito.android.search_view.v
    public final void y(@Y61.k HistorySuggestItem historySuggestItem, @Y61.k Y41.l<? super SuggestHistoryItem, G0> lVar, @Y61.k Y41.l<? super SuggestHistoryItem, G0> lVar2) {
    }
}
