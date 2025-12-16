package com.avito.android.search_view;

import Gp0.C13906a;
import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.C22767g;
import androidx.core.view.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.point.Point;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.search_view.SavedSearchState;
import com.avito.android.search_view.k;
import com.avito.android.search_view.u;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.V0;
import com.avito.android.util.p6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.widget.C37750f0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import iw.C42120a;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.U;
import j.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48063a;
import wK0.AbstractC49526a;

/* compiled from: Toolbar23SearchView.kt */
@s0
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004mnopJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u0019\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u0019\u0010\u001d\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u001d\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b#\u0010\u0017J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020$¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\rJ\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\rJ\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0006H\u0004¢\u0006\u0004\b0\u0010\u0011J\u0017\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0006H\u0004¢\u0006\u0004\b2\u0010\u0011J\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\t¢\u0006\u0004\b4\u0010\rJ\u0017\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\u0011J\u0019\u00108\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b8\u0010\u0013J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010\bJ\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\bJ\u0017\u0010C\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010\rJ\u000f\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020DH\u0002¢\u0006\u0004\bH\u0010IR\u001a\u0010M\u001a\u00020$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010&R\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000b0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR \u0010`\u001a\b\u0012\u0004\u0012\u00020]0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010V\u001a\u0004\b_\u0010XR \u0010d\u001a\b\u0012\u0004\u0012\u00020a0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010V\u001a\u0004\bc\u0010XR6\u0010f\u001a\b\u0012\u0002\b\u0003\u0018\u00010e2\f\u0010f\u001a\b\u0012\u0002\b\u0003\u0018\u00010e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006q"}, d2 = {"Lcom/avito/android/search_view/Toolbar23SearchView;", "Landroid/widget/FrameLayout;", "Landroidx/appcompat/widget/Toolbar$h;", "Lcom/avito/android/search_view/v;", "Lcom/avito/android/search_view/a;", "Lcom/avito/android/search_view/h;", "", "getInputViewId", "()I", "", "enabled", "Lkotlin/G0;", "setTicketEnabled", "(Z)V", "setLoyaltyBonusesEnabled", "text", "setQuery", "(I)V", "", "(Ljava/lang/String;)V", "hint", "setHint", "getHint", "()Ljava/lang/String;", "mapMoved", "setUserMovedMapSinceLastLocationUpdate", "menuId", "setMenu", "top", "setTopPadding", "setSearchEnabled", "Lkotlin/Function0;", "listener", "setInputClickListener", "(LY41/a;)V", "getQuery", "Landroid/view/View;", "getCartItemView", "()Landroid/view/View;", "getFiltersItemView", "getTicketItemView", "getLoyaltyBonusesItemView", "setCartEnabled", "trackScroll", "setSaveSearchInHeaderOnScroll", "getSavedSearchStateVisibility", "()Z", "color", "setHighlightInputColor", "height", "setInputHeight", "visible", "setLeftButtonVisibility", "inputHeight", "setUpCart", "iconName", "setNavigationIcon", "Lcom/avito/android/remote/model/UniversalImage;", "logo", "setNavigationBarLogo", "(Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle;", "data", "setSearchWithActionTitle", "(Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle;)V", "getSelectionPosition", "getLastCharPosition", "setSuggestionsVisible", "Lcom/avito/android/search_view/SavedSearchState;", "getSavedSearchState", "()Lcom/avito/android/search_view/SavedSearchState;", "savedSearchState", "setSavedSearchState", "(Lcom/avito/android/search_view/SavedSearchState;)V", "i", "Landroid/view/View;", "getDivider", "divider", "Lcom/avito/android/search_view/i;", "d0", "Lkotlin/C;", "getSavedSearchView", "()Lcom/avito/android/search_view/i;", "savedSearchView", "Lio/reactivex/rxjava3/core/z;", "w0", "Lio/reactivex/rxjava3/core/z;", "getSearchOpeningChanges", "()Lio/reactivex/rxjava3/core/z;", "searchOpeningChanges", "x0", "getDismissEvents", "dismissEvents", "Liw/a;", "y0", "getSearchInputLayoutChanges", "searchInputLayoutChanges", "Lcom/avito/android/search_view/ShareButtonEvent;", "z0", "getShareButtonEvents", "shareButtonEvents", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "B0", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "a", "SavedState", "b", "c", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Toolbar23SearchView extends FrameLayout implements Toolbar.h, v, com.avito.android.search_view.a, com.avito.android.search_view.h {

    /* renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ int f264435C0 = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264436A;

    /* renamed from: A0, reason: collision with root package name */
    public final int f264437A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final View f264438B;

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public RecyclerView.Adapter<?> adapter;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final ImageView f264440C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264441D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final ImageView f264442E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final View f264443F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final View f264444G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final Chips f264445H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Chips f264446I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264447J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final TextView f264448K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final TextView f264449L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final TextView f264450M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final View f264451N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final View f264452O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264453P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public String f264454Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final String f264455R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f264456S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f264457T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f264458U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f264459V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f264460W;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<C42120a> f264461a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f264462b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ShareButtonEvent> f264463b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public a f264464c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f264465c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f264466d;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C savedSearchView;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f264468e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<ToolbarState> f264469e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f264470f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public NavigationBarStyle.DisplayType f264471f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f264472g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.l
    public Boolean f264473g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Input f264474h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f264475h0;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final View divider;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public RunnableC34589p f264477i0;

    /* renamed from: j, reason: collision with root package name */
    public final int f264478j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public Integer f264479j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final View f264480k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f264481k0;

    /* renamed from: l, reason: collision with root package name */
    public int f264482l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f264483l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f264484m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f264485m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f264486n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f264487n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f264488o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f264489o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f264490p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f264491p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Integer f264492q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f264493q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final ImageView f264494r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public c f264495r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264496s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final View f264497s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final ImageView f264498t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final ImageView f264499t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f264500u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final Button f264501u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264502v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f264503v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final ImageView f264504w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f264505w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final View f264506x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f264507x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final TextView f264508y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f264509y0;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264510z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f264511z0;

    /* compiled from: Toolbar23SearchView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/Toolbar23SearchView$SavedState;", "Landroid/view/View$BaseSavedState;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f264512b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f264513c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f264514d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final c f264515e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f264516f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f264517g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f264518h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Parcelable f264519i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f264520j;

        /* compiled from: Toolbar23SearchView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, c.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(boolean z12, @Y61.l Integer num, boolean z13, @Y61.k c cVar, boolean z14, boolean z15, boolean z16, @Y61.k Parcelable parcelable, boolean z17) {
            super(parcelable);
            this.f264512b = z12;
            this.f264513c = num;
            this.f264514d = z13;
            this.f264515e = cVar;
            this.f264516f = z14;
            this.f264517g = z15;
            this.f264518h = z16;
            this.f264519i = parcelable;
            this.f264520j = z17;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f264512b ? 1 : 0);
            Integer num = this.f264513c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeInt(this.f264514d ? 1 : 0);
            parcel.writeString(this.f264515e.name());
            parcel.writeInt(this.f264516f ? 1 : 0);
            parcel.writeInt(this.f264517g ? 1 : 0);
            parcel.writeInt(this.f264518h ? 1 : 0);
            parcel.writeParcelable(this.f264519i, i12);
            parcel.writeInt(this.f264520j ? 1 : 0);
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/Toolbar23SearchView$a;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f264521a;

        /* renamed from: b, reason: collision with root package name */
        public final int f264522b;

        public a(@InterfaceC42156l int i12, @InterfaceC42156l int i13) {
            this.f264521a = i12;
            this.f264522b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f264521a == aVar.f264521a && this.f264522b == aVar.f264522b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f264522b) + (Integer.hashCode(this.f264521a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MutableSearchViewConfig(searchIconTintEmpty=");
            sb2.append(this.f264521a);
            sb2.append(", searchIconTintFilled=");
            return androidx.appcompat.app.r.t(sb2, this.f264522b, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/Toolbar23SearchView$c;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f264528b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f264529c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ c[] f264530d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f264531e;

        static {
            c cVar = new c("USUAL", 0);
            f264528b = cVar;
            c cVar2 = new c("WITHOUT_INPUT", 1);
            f264529c = cVar2;
            c[] cVarArr = {cVar, cVar2};
            f264530d = cVarArr;
            f264531e = kotlin.enums.c.a(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f264530d.clone();
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f264532a;

        static {
            int[] iArr = new int[SubscriptionButtonState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SubscriptionButtonState subscriptionButtonState = SubscriptionButtonState.f264430b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SubscriptionButtonState subscriptionButtonState2 = SubscriptionButtonState.f264430b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ToolbarConfig.DisplayMode.values().length];
            try {
                iArr2[ToolbarConfig.DisplayMode.ON_SCROLL_WIDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ToolbarConfig.DisplayMode.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ToolbarConfig.DisplayMode.ALIGN_TO_UP_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f264532a = iArr2;
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/search_view/ToolbarState;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search_view/ToolbarState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<ToolbarState, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ToolbarState toolbarState) {
            Toolbar23SearchView.D(Toolbar23SearchView.this, toolbarState.f264550b);
            return G0.f406611a;
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/search_view/j;", "invoke", "()Lcom/avito/android/search_view/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<com.avito.android.search_view.j> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.search_view.j invoke() {
            Toolbar23SearchView toolbar23SearchView = Toolbar23SearchView.this;
            return new com.avito.android.search_view.j(toolbar23SearchView, new com.avito.android.search_view.s(toolbar23SearchView));
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/search_view/Toolbar23SearchView$g", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<SuggestHistoryItem, G0> f264535a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Toolbar23SearchView f264536b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Y41.l<? super SuggestHistoryItem, G0> lVar, Toolbar23SearchView toolbar23SearchView) {
            this.f264535a = lVar;
            this.f264536b = toolbar23SearchView;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            if (hVar instanceof com.avito.android.search.e) {
                this.f264535a.invoke(((com.avito.android.search.e) hVar).f261733b);
                this.f264536b.f264446I.j();
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            if (hVar instanceof com.avito.android.search.e) {
                this.f264535a.invoke(((com.avito.android.search.e) hVar).f261733b);
                this.f264536b.f264446I.j();
            }
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/search_view/Toolbar23SearchView$h", "Lcom/avito/android/lib/design/chips/Chips$e;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements Chips.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<SuggestHistoryItem, G0> f264537a;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Y41.l<? super SuggestHistoryItem, G0> lVar) {
            this.f264537a = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.e
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            if (hVar instanceof com.avito.android.search.e) {
                this.f264537a.invoke(((com.avito.android.search.e) hVar).f261733b);
            }
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<View, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            int i12 = Toolbar23SearchView.f264435C0;
            Toolbar23SearchView.this.getClass();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f44217u = -1;
            bVar.f44216t = -1;
            view2.setLayoutParams(bVar);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f44218v = -1;
            bVar2.f44219w = -1;
            view2.setLayoutParams(bVar2);
            return G0.f406611a;
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<View, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f44219w = Toolbar23SearchView.this.f264436A.getId();
            view2.setLayoutParams(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<View, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f44216t = Toolbar23SearchView.this.f264488o.getId();
            view2.setLayoutParams(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f264541l = 0;

        static {
            new l();
        }

        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            D6.c(view, null, null, Integer.valueOf(y6.b(0)), null, 11);
            return G0.f406611a;
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f264542l = 0;

        static {
            new m();
        }

        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            D6.c(view, null, null, Integer.valueOf(y6.b(0)), null, 11);
            return G0.f406611a;
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Toolbar23SearchView f264543b;

        public n(Toolbar23SearchView toolbar23SearchView, Toolbar23SearchView toolbar23SearchView2) {
            this.f264543b = toolbar23SearchView2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar23SearchView toolbar23SearchView = this.f264543b;
            toolbar23SearchView.f264474h.requestFocus();
            o oVar = toolbar23SearchView.new o();
            toolbar23SearchView.postDelayed(oVar, 300L);
            toolbar23SearchView.addOnAttachStateChangeListener(new p(toolbar23SearchView, oVar));
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/G6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar23SearchView.this.f264474h.v();
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class q<T, R> implements l41.o {
        public q() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).intValue();
            return String.valueOf(Toolbar23SearchView.this.f264474h.m53getText());
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r<T> implements l41.g {
        public r() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Toolbar23SearchView toolbar23SearchView = Toolbar23SearchView.this;
            Input input = toolbar23SearchView.f264474h;
            if (input.hasFocus() && charSequence.length() == 0) {
                toolbar23SearchView.J();
            }
            if (charSequence.length() == 0) {
                input.setLeftIconColor(toolbar23SearchView.f264464c.f264521a);
            } else {
                input.setLeftIconColor(toolbar23SearchView.f264464c.f264522b);
            }
        }
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class s<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final s<T, R> f264549b = new s<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((CharSequence) obj).toString();
        }
    }

    @X41.j
    public Toolbar23SearchView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
    }

    public static void B(Toolbar23SearchView toolbar23SearchView, boolean z12) {
        if (z12) {
            toolbar23SearchView.f264460W.accept(Boolean.TRUE);
            toolbar23SearchView.setSavedSearchState(SavedSearchState.a(toolbar23SearchView.getSavedSearchState(), null, true, false, false, false, 29));
            toolbar23SearchView.f264475h0 = true;
            Input input = toolbar23SearchView.f264474h;
            D6.H(input);
            D6.w(toolbar23SearchView.f264490p);
            D6.w(toolbar23SearchView.f264438B);
            D6.w(toolbar23SearchView.f264497s0);
            D6.w(toolbar23SearchView.f264496s);
            D6.w(toolbar23SearchView.f264502v);
            D6.w(toolbar23SearchView.f264510z);
            D6.w(toolbar23SearchView.f264447J);
            toolbar23SearchView.E(false);
            ViewGroup.LayoutParams layoutParams = input.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = 0;
            input.setLayoutParams(bVar);
            D6.G(toolbar23SearchView.f264484m, true);
            ImageView imageView = toolbar23SearchView.f264442E;
            D6.w(imageView);
            input.setSelection(toolbar23SearchView.getSelectionPosition());
            imageView.setOnClickListener(new com.avito.android.search_view.o(toolbar23SearchView, 4));
            RecyclerView recyclerView = toolbar23SearchView.f264470f;
            if (!D6.y(recyclerView)) {
                toolbar23SearchView.setSuggestionsVisible(true);
                toolbar23SearchView.R();
                toolbar23SearchView.I(recyclerView);
            }
            View view = toolbar23SearchView.f264472g;
            D6.G(view, true);
            toolbar23SearchView.I(view);
            FormatterType.f179288e.getClass();
            input.setFormatterType(FormatterType.f179289f);
            Editable editableM53getText = input.m53getText();
            if (editableM53getText == null || editableM53getText.length() == 0) {
                toolbar23SearchView.J();
            }
            input.v();
            toolbar23SearchView.Q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(com.avito.android.search_view.Toolbar23SearchView r3, com.avito.android.search_view.SavedSearchState r4) {
        /*
            com.avito.android.search_view.i r0 = r3.getSavedSearchView()
            boolean r1 = r4.f264419d
            if (r1 == 0) goto Lc
            r1 = 2131233567(0x7f080b1f, float:1.8083275E38)
            goto Lf
        Lc:
            r1 = 2131233579(0x7f080b2b, float:1.80833E38)
        Lf:
            r0.setIcon(r1)
            com.avito.android.search_view.i r0 = r3.getSavedSearchView()
            r0.c()
            com.avito.android.search_view.i r0 = r3.getSavedSearchView()
            com.avito.android.search_view.Toolbar23SearchView$b r1 = r3.f264462b
            boolean r1 = r1.f264524b
            if (r1 == 0) goto L2f
            boolean r1 = r4.f264418c
            if (r1 != 0) goto L2f
            com.avito.android.search_view.SavedSearchState$Visibility r1 = com.avito.android.search_view.SavedSearchState.Visibility.f264422b
            com.avito.android.search_view.SavedSearchState$Visibility r2 = r4.f264417b
            if (r2 != r1) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            r0.setVisible(r1)
            com.avito.android.search_view.i r0 = r3.getSavedSearchView()
            boolean r4 = r4.f264420e
            r0.setLoading(r4)
            r3.P()
            r3.Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_view.Toolbar23SearchView.D(com.avito.android.search_view.Toolbar23SearchView, com.avito.android.search_view.SavedSearchState):void");
    }

    private final int getLastCharPosition() {
        String string;
        Editable editableM53getText = this.f264474h.m53getText();
        if (editableM53getText == null || (string = editableM53getText.toString()) == null) {
            return 0;
        }
        return string.length();
    }

    private final SavedSearchState getSavedSearchState() {
        return this.f264469e0.getValue().f264550b;
    }

    private final com.avito.android.search_view.i getSavedSearchView() {
        return (com.avito.android.search_view.i) this.savedSearchView.getValue();
    }

    private final int getSelectionPosition() {
        Integer num = this.f264479j0;
        int iIntValue = num != null ? num.intValue() : getLastCharPosition();
        return iIntValue <= String.valueOf(this.f264474h.m53getText()).length() ? iIntValue : getLastCharPosition();
    }

    private final void setNavigationBarLogo(UniversalImage logo) {
        SimpleDraweeView simpleDraweeView = this.f264490p;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(logo, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        if (imageDependsOnTheme != null) {
            D6.H(simpleDraweeView);
            C35949t5.c(this.f264490p, com.avito.android.image_loader.b.b(imageDependsOnTheme), null, null, null, 14);
            D6.c(this.f264474h, null, Integer.valueOf(y6.b(6)), null, null, 13);
            r(getResources().getDimensionPixelSize(R.dimen.redesign_23_search_view_padding_bottom_visible_toolbar_logo));
        } else {
            M();
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        ConstraintLayout constraintLayout = this.f264488o;
        dVar.g(constraintLayout);
        dVar.j(R.id.right_icons_container, 4, R.id.search_bar_logo, 4, 0);
        dVar.j(R.id.toolbar_up_button_view, 4, R.id.search_bar_logo, 4, 0);
        dVar.c(constraintLayout);
        ViewGroup viewGroup = this.f264441D;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        Input input = this.f264474h;
        bVar.f44203m = input.getId();
        bVar.f44197j = input.getId();
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        viewGroup.setLayoutParams(bVar);
        ViewGroup.LayoutParams layoutParams2 = input.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f44217u = 0;
        bVar2.f44219w = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).width = -1;
        bVar2.f44199k = simpleDraweeView.getId();
        bVar2.setMarginEnd(y6.b(16));
        input.setLayoutParams(bVar2);
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
        ImageView imageView = this.f264442E;
        if (drawableH != null) {
            imageView.setImageDrawable(drawableH);
        } else {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowBack24, getContext()));
        }
    }

    private final void setSavedSearchState(SavedSearchState savedSearchState) {
        C23038g0<ToolbarState> c23038g0 = this.f264469e0;
        c23038g0.setValue(c23038g0.getValue() != null ? new ToolbarState(savedSearchState) : null);
    }

    private final void setSearchWithActionTitle(NavigationBarStyle.DisplayType.SearchWithActionTitle data) {
        this.f264454Q = data.getTitle();
        ViewGroup viewGroup = this.f264447J;
        viewGroup.setVisibility(0);
        this.f264448K.setText(this.f264493q0 ? this.f264455R : this.f264454Q);
        String titleEndIcon = data.getTitleEndIcon();
        FV.a.a(FV.a.f4720a, this.f264449L, titleEndIcon != null ? com.avito.android.lib.util.f.m(titleEndIcon) : null);
        this.f264450M.setText(data.getSubtitle());
        this.f264453P.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(1, data, this));
        Input input = this.f264474h;
        ViewGroup.LayoutParams layoutParams = input.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44217u = 0;
        bVar.f44219w = 0;
        ((ViewGroup.MarginLayoutParams) bVar).width = -1;
        bVar.setMarginEnd(y6.b(16));
        bVar.f44199k = viewGroup.getId();
        input.setLayoutParams(bVar);
        D6.c(this.f264474h, null, Integer.valueOf(y6.b(8)), null, null, 13);
        ImageView imageView = this.f264442E;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f44197j = viewGroup.getId();
        bVar2.f44203m = viewGroup.getId();
        imageView.setLayoutParams(bVar2);
        r(getResources().getDimensionPixelSize(R.dimen.redesign_23_search_view_padding_bottom_visible_search_with_action_title));
    }

    private final void setSuggestionsVisible(boolean visible) {
        D6.G(this.f264470f, visible);
        D6.G(this.divider, visible);
        D6.G(this.f264468e, !visible);
    }

    private final void setUpCart(int inputHeight) {
        ViewGroup viewGroup = this.f264496s;
        viewGroup.getLayoutParams().height = inputHeight;
        viewGroup.getLayoutParams().width = inputHeight;
        this.f264436A.getLayoutParams().height = inputHeight;
        D6.c(this.f264494r, Integer.valueOf(getContext().getResources().getDimensionPixelSize(R.dimen.cart_button_left_margin_translationX_translationX_with_search_promo_banner)), null, null, null, 14);
        D6.c(this.f264436A, null, null, Integer.valueOf(getContext().getResources().getDimensionPixelSize(R.dimen.right_icons_container_margin_right)), null, 11);
        View viewFindViewById = this.f264466d.findViewById(R.id.cart_counter);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        Badge badge = (Badge) viewFindViewById;
        badge.setTranslationX(badge.getContext().getResources().getDimensionPixelSize(R.dimen.cart_counter_translationX_with_search_promo_banner));
        badge.setTranslationY(badge.getContext().getResources().getDimensionPixelSize(R.dimen.cart_counter_translationY_with_search_promo_banner));
        View viewFindViewById2 = viewGroup.findViewById(R.id.cart_point);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.point.Point");
        }
        Point point = (Point) viewFindViewById2;
        point.setTranslationX(point.getContext().getResources().getDimensionPixelSize(R.dimen.cart_point_translationX_with_search_promo_banner));
        point.setTranslationY(point.getContext().getResources().getDimensionPixelSize(R.dimen.cart_point_translationY_with_search_promo_banner));
    }

    @Override // com.avito.android.search_view.v
    public final void A(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        boolean z12 = !arrayList.isEmpty() && this.f264475h0;
        Chips chips = this.f264445H;
        D6.G(chips, z12);
        chips.setData(arrayList);
        chips.setChipsSelectedListener(new t(lVar, this));
        if (arrayList.isEmpty()) {
            return;
        }
        chips.o((com.avito.android.lib.design.chips.h) C42745f0.E(arrayList), false);
    }

    public final void E(boolean z12) {
        this.f264501u0.setVisibility((!z12 || L.f(this.f264473g0, Boolean.TRUE)) ? 8 : 0);
        D6.e(this.f264474h, Integer.valueOf(y6.b(z12 ? 6 : 16)), null, null, 14);
    }

    public final void F(boolean z12) {
        this.f264495r0 = z12 ? c.f264528b : c.f264529c;
        this.f264474h.setVisibility(z12 ? 0 : 8);
        this.f264497s0.setVisibility(z12 ? 8 : 0);
        ViewGroup viewGroup = this.f264441D;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44218v = z12 ? -1 : this.f264444G.getId();
        viewGroup.setLayoutParams(bVar);
    }

    public final void G() {
        if (this.f264475h0) {
            this.f264460W.accept(Boolean.FALSE);
            this.f264475h0 = false;
            boolean z12 = this.f264471f0 instanceof NavigationBarStyle.DisplayType.LogoWithSearchInput;
            Input input = this.f264474h;
            if (z12) {
                D6.H(this.f264490p);
                ViewGroup.LayoutParams layoutParams = input.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).width = -1;
                input.setLayoutParams(bVar);
                D6.c(this.f264474h, null, Integer.valueOf(y6.b(6)), null, null, 13);
            }
            D6.w(this.f264484m);
            D6.w(this.f264445H);
            D6.w(this.f264446I);
            c cVar = this.f264495r0;
            c cVar2 = c.f264529c;
            this.f264497s0.setVisibility(cVar == cVar2 ? 0 : 8);
            input.setVisibility(this.f264495r0 != cVar2 ? 0 : 8);
            if (L.f(this.f264473g0, Boolean.TRUE)) {
                D6.G(this.f264442E, true);
            }
            if (this.f264471f0 instanceof NavigationBarStyle.DisplayType.SearchWithActionTitle) {
                D6.H(this.f264447J);
                ViewGroup.LayoutParams layoutParams2 = input.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                ((ViewGroup.MarginLayoutParams) bVar2).width = -1;
                input.setLayoutParams(bVar2);
            }
            Integer num = this.f264492q;
            if (num != null) {
                V(num.intValue());
            }
            L();
            View view = this.f264472g;
            if (D6.y(view) || view.getAlpha() != 0.0f) {
                view.animate().alpha(0.0f).setDuration(400L).setListener(new com.avito.android.search_view.q(view, this));
            }
            setSuggestionsVisible(false);
            K2.d(this, true);
            setSavedSearchState(SavedSearchState.a(getSavedSearchState(), null, false, false, false, false, 29));
            P();
        }
    }

    public final RippleDrawable H(ColorStateList colorStateList) {
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = y6.b(18);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.black, getRootView().getContext()));
        return new RippleDrawable(colorStateList, null, shapeDrawable);
    }

    public final void I(View view) {
        if (D6.y(view) && view.getAlpha() == 1.0f) {
            return;
        }
        this.f264458U.accept(Boolean.TRUE);
        if (this.f264489o0) {
            view.animate().alpha(1.0f).setDuration(400L).start();
        }
    }

    public final void J() {
        D6.w(this.f264438B);
        D6.w(this.f264496s);
        D6.w(this.f264502v);
        D6.w(this.f264510z);
        Q();
    }

    public final void L() {
        boolean zF2 = L.f(this.f264473g0, Boolean.TRUE);
        ImageView imageView = this.f264442E;
        if (zF2) {
            D6.G(imageView, true);
            imageView.setOnClickListener(new com.avito.android.search_view.o(this, 1));
        } else {
            D6.w(imageView);
            imageView.setOnClickListener(new L91.q(10));
        }
        E(this.f264503v0);
    }

    public final void M() {
        SimpleDraweeView simpleDraweeView = this.f264490p;
        D6.w(simpleDraweeView);
        D6.w(this.f264447J);
        r(getResources().getDimensionPixelSize(R.dimen.redesign_23_search_view_padding_bottom_visible_inlines));
        D6.c(this.f264474h, null, 0, null, null, 13);
        Input input = this.f264474h;
        ViewGroup.LayoutParams layoutParams = input.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        ImageView imageView = this.f264442E;
        bVar.f44216t = imageView.getId();
        bVar.f44219w = 0;
        bVar.f44217u = -1;
        bVar.f44199k = simpleDraweeView.getId();
        bVar.setMarginEnd(y6.b(16));
        input.setLayoutParams(bVar);
        ViewGroup viewGroup = this.f264436A;
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f44203m = 0;
        viewGroup.setLayoutParams(bVar2);
        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.f44203m = 0;
        bVar3.f44197j = 0;
        imageView.setLayoutParams(bVar3);
    }

    public final void N(ViewGroup viewGroup, TextView textView, int i12, float f12, int i13) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i12);
        gradientDrawable.setCornerRadius(getContext().getResources().getDimensionPixelSize(R.dimen.ticket_container_corner_radius));
        viewGroup.setBackground(gradientDrawable);
        viewGroup.setAlpha(f12);
        textView.setTextColor(ColorStateList.valueOf(i13));
    }

    public final void O(ViewGroup viewGroup, ImageView imageView, View view, int i12) {
        ViewGroup viewGroup2 = this.f264436A;
        viewGroup2.getLayoutParams().height = i12;
        viewGroup2.setMinimumWidth(i12);
        D6.c(viewGroup2, null, null, Integer.valueOf(viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.right_icons_container_margin_right)), null, 11);
        viewGroup.getLayoutParams().height = i12;
        viewGroup.setMinimumWidth(i12);
        D6.f(viewGroup, 0, 0, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.ticket_padding_right), 0, 11);
        D6.c(imageView, Integer.valueOf(getContext().getResources().getDimensionPixelSize(R.dimen.ticket_button_left_margin_translationX_translationX_with_search_promo_banner)), null, null, null, 14);
        if (view != null) {
            D6.c(view, Integer.valueOf(getContext().getResources().getDimensionPixelSize(R.dimen.ticket_button_left_margin_translationX_translationX_with_search_promo_banner)), null, null, null, 14);
        }
    }

    public final void P() {
        com.avito.android.search_view.i savedSearchView = getSavedSearchView();
        new i();
        savedSearchView.getClass();
        View view = this.f264438B;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44217u = -1;
        bVar.f44216t = -1;
        view.setLayoutParams(bVar);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f44218v = -1;
        bVar2.f44219w = -1;
        view.setLayoutParams(bVar2);
        boolean zY2 = D6.y(this.f264496s);
        boolean zY3 = D6.y(this.f264502v);
        boolean zY4 = D6.y(this.f264510z);
        boolean z12 = this.f264491p0;
        if (!this.f264475h0) {
            if (this.f264462b.f264523a) {
                D6.H(view);
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            ViewGroup viewGroup = this.f264441D;
            if (z12) {
                bVar3.f44216t = viewGroup.getId();
            } else {
                bVar3.f44219w = viewGroup.getId();
            }
            view.setLayoutParams(bVar3);
        }
        if (zY2 || zY3 || zY4) {
            com.avito.android.search_view.i savedSearchView2 = getSavedSearchView();
            new j();
            savedSearchView2.getClass();
        } else {
            com.avito.android.search_view.i savedSearchView3 = getSavedSearchView();
            new k();
            savedSearchView3.getClass();
        }
    }

    public final void Q() {
        boolean zY2 = D6.y(this.f264496s);
        boolean zY3 = D6.y(this.f264502v);
        boolean zY4 = D6.y(this.f264510z);
        if (zY2 || zY3 || zY4) {
            if (this.f264471f0 instanceof NavigationBarStyle.DisplayType.LogoWithSearchInput) {
                D6.c(this.f264474h, null, null, Integer.valueOf(y6.b(16)), null, 11);
            } else {
                D6.c(this.f264474h, null, null, Integer.valueOf(y6.b(6)), null, 11);
            }
            com.avito.android.search_view.i savedSearchView = getSavedSearchView();
            int i12 = l.f264541l;
            savedSearchView.getClass();
            D6.f(this.f264436A, 0, 0, y6.b(10), 0, 11);
            return;
        }
        if (this.f264471f0 instanceof NavigationBarStyle.DisplayType.LogoWithSearchInput) {
            D6.c(this.f264474h, null, null, Integer.valueOf(y6.b(16)), null, 11);
        } else {
            D6.c(this.f264474h, null, null, Integer.valueOf(y6.b(12)), null, 11);
        }
        com.avito.android.search_view.i savedSearchView2 = getSavedSearchView();
        int i13 = m.f264542l;
        savedSearchView2.getClass();
        D6.f(this.f264436A, 0, 0, y6.b(0), 0, 11);
    }

    public final void R() {
        RecyclerView recyclerView = this.f264470f;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z12 = adapter != null && adapter.getItemCount() > 0 && D6.y(recyclerView);
        int i12 = this.f264478j;
        int i13 = z12 ? i12 : 0;
        if (!z12) {
            i12 = 0;
        }
        recyclerView.setPadding(0, i13, 0, i12);
    }

    public final void S(boolean z12, boolean z13) {
        boolean z14 = this.f264483l0;
        boolean z15 = this.f264485m0;
        boolean z16 = this.f264487n0;
        this.f264483l0 = z12;
        this.f264496s.setVisibility(z12 ? 0 : 8);
        if ((z14 || z15 || z16) != z12) {
            Q();
        }
        if (z13 && this.f264483l0) {
            setUpCart(getContext().getResources().getDimensionPixelSize(R.dimen.input_height_with_search_promo_banner));
        }
    }

    public final void T(@InterfaceC42156l int i12, @InterfaceC42156l int i13, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.f264440C.setImageTintList(ColorStateList.valueOf(i12));
        this.f264438B.setBackground(H(colorStateList2));
        View view = this.f264480k;
        if (view == null) {
            return;
        }
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(1);
        gradientDrawableE.setColor(ColorStateList.valueOf(i13));
        gradientDrawableE.setStroke(y6.b(2), colorStateList);
        view.setBackground(gradientDrawableE);
    }

    public final void U(@InterfaceC42156l int i12, @Y61.l ColorStateList colorStateList, @Y61.l ColorStateList colorStateList2, float f12) {
        AbstractC49526a.C12816a c12816a = AbstractC49526a.f441376b;
        Input input = this.f264474h;
        input.setEditTextBackground(AbstractC49526a.C12816a.a(c12816a, colorStateList2, null, input.getContext().getResources().getDimensionPixelSize(R.dimen.input_corner_radius), null, 0, 120));
        input.setTextColor(i12);
        input.setHintTextColor(colorStateList);
        input.setClearButtonTint(ColorStateList.valueOf(i12));
        input.setAlpha(f12);
    }

    public final void V(@j.L int i12) {
        Editable editableM53getText;
        this.f264492q = Integer.valueOf(i12);
        if (i12 == R.menu.item_list) {
            W();
        } else if (i12 == R.menu.home) {
            W();
            this.f264491p0 = false;
            P();
        } else if (i12 == R.menu.mall) {
            W();
        }
        if (this.f264475h0 && ((editableM53getText = this.f264474h.m53getText()) == null || editableM53getText.length() == 0)) {
            J();
        }
        if (i12 == R.menu.item_list_custom_clarify || i12 == R.menu.item_list_saved_searches_push) {
            d(this.f264482l);
        }
    }

    public final void W() {
        this.f264496s.setVisibility(this.f264483l0 ? 0 : 8);
        this.f264502v.setVisibility(this.f264485m0 ? 0 : 8);
        this.f264510z.setVisibility(this.f264487n0 ? 0 : 8);
        Q();
    }

    public final void X(@InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        this.f264464c.getClass();
        this.f264464c = new a(i12, i13);
        Input input = this.f264474h;
        if (String.valueOf(input.m53getText()).length() == 0) {
            input.setLeftIconColor(this.f264464c.f264521a);
        } else {
            input.setLeftIconColor(this.f264464c.f264522b);
        }
    }

    public final void Y(@InterfaceC42156l int i12, @InterfaceC42156l int i13, @InterfaceC42156l int i14, @Y61.l ColorStateList colorStateList) {
        this.f264488o.setBackgroundColor(i12);
        this.f264445H.setBackgroundColor(i12);
        this.f264446I.setBackgroundColor(i12);
        this.f264468e.setBackgroundColor(i12);
        this.divider.setBackgroundColor(i12);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i13);
        ImageView imageView = this.f264442E;
        imageView.setImageTintList(colorStateListValueOf);
        imageView.setBackground(V0.c(colorStateList));
        TextView textView = this.f264484m;
        textView.setTextColor(i14);
        textView.setBackground(colorStateList != null ? new RippleDrawable(colorStateList, null, C43852a.a(textView.getContext(), R.drawable.rect_mask_radius_3)) : null);
        getSavedSearchView().b(ColorStateList.valueOf(i13));
        getSavedSearchView().a(colorStateList);
    }

    @Override // com.avito.android.search_view.v
    public final void a(@Y61.k com.avito.android.search_view.k kVar, float f12) {
        float f13;
        a.AbstractC5229a bVar;
        float f14;
        boolean z12 = kVar.f264565i;
        float f15 = (kVar.f264563g || z12) ? f12 : 1.0f;
        if (z12) {
            this.f264489o0 = false;
            f13 = 0.9f;
        } else {
            this.f264489o0 = true;
            f13 = 1.0f;
        }
        NavigationBarStyle.DisplayType displayType = kVar.f264564h;
        this.f264471f0 = displayType;
        if (!this.f264475h0) {
            TextView textView = this.f264486n;
            textView.setVisibility(8);
            this.f264490p.setVisibility(8);
            this.f264447J.setVisibility(8);
            boolean z13 = displayType instanceof NavigationBarStyle.DisplayType.LogoWithSearchInput;
            ViewGroup viewGroup = this.f264441D;
            if (z13) {
                F(true);
                viewGroup.setVisibility(0);
                setNavigationBarLogo(((NavigationBarStyle.DisplayType.LogoWithSearchInput) displayType).getLogo());
            } else if ((displayType instanceof NavigationBarStyle.DisplayType.SearchInput) || displayType == null) {
                F(true);
                viewGroup.setVisibility(0);
                M();
            } else if (displayType instanceof NavigationBarStyle.DisplayType.OnlyTitle) {
                M();
                F(false);
                viewGroup.setVisibility(0);
                D6.w(this.f264497s0);
                textView.setVisibility(0);
                NavigationBarStyle.DisplayType.OnlyTitle onlyTitle = (NavigationBarStyle.DisplayType.OnlyTitle) displayType;
                boolean z14 = onlyTitle.getDisplayMode() == ToolbarConfig.DisplayMode.ALIGN_TO_UP_BUTTON;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
                if (z14) {
                    bVar2.f44217u = -1;
                    bVar2.f44216t = this.f264442E.getId();
                    bVar2.f44218v = -1;
                    bVar2.f44219w = -1;
                } else {
                    bVar2.f44217u = 0;
                    bVar2.f44216t = -1;
                    bVar2.f44218v = -1;
                    bVar2.f44219w = 0;
                }
                textView.setLayoutParams(bVar2);
                D6.c(this.f264486n, Integer.valueOf(z14 ? this.f264437A0 : 0), null, null, null, 14);
                textView.setText(onlyTitle.getTitle());
                ToolbarConfig.DisplayMode displayMode = onlyTitle.getDisplayMode();
                int i12 = displayMode == null ? -1 : d.f264532a[displayMode.ordinal()];
                if (i12 == -1) {
                    f14 = 1.0f;
                    textView.setAlpha(f14);
                } else if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f14 = 1.0f;
                    textView.setAlpha(f14);
                } else {
                    f14 = 1 - kotlin.ranges.s.f(f12, 0.0f, 1.0f);
                    textView.setAlpha(f14);
                }
            } else if (displayType instanceof NavigationBarStyle.DisplayType.SearchWithActionTitle) {
                viewGroup.setVisibility(8);
                F(false);
                setSearchWithActionTitle((NavigationBarStyle.DisplayType.SearchWithActionTitle) displayType);
            }
        }
        setNavigationIcon(kVar.f264562f);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer numValueOf = Integer.valueOf(C35835l0.d(R.attr.white, getContext()));
        Context context = getContext();
        C48063a c48063a = C48063a.f437606a;
        int iIntValue = ((Integer) argbEvaluator.evaluate(f15, numValueOf, Integer.valueOf(c48063a.a(context, kVar.f264557a)))).intValue();
        int iIntValue2 = ((Integer) new ArgbEvaluator().evaluate(f15, Integer.valueOf(C35835l0.d(R.attr.black, getContext())), Integer.valueOf(c48063a.a(getContext(), kVar.f264558b)))).intValue();
        ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
        Integer numValueOf2 = Integer.valueOf(C35835l0.d(R.attr.gray36, getContext()));
        k.a aVar = kVar.f264561e;
        int iIntValue3 = ((Integer) argbEvaluator2.evaluate(f15, numValueOf2, Integer.valueOf(c48063a.a(getContext(), aVar.f264569c)))).intValue();
        int iIntValue4 = ((Integer) new ArgbEvaluator().evaluate(f15, Integer.valueOf(androidx.core.content.d.getColor(getContext(), R.color.common_red)), Integer.valueOf(c48063a.a(getContext(), kVar.f264559c)))).intValue();
        int iIntValue5 = ((Integer) new ArgbEvaluator().evaluate(f15, Integer.valueOf(androidx.core.content.d.getColor(getContext(), R.color.common_warm_gray_16)), Integer.valueOf(androidx.core.content.d.getColor(getContext(), com.avito.android.lib.util.darkTheme.d.a(kVar.f264560d, com.avito.android.lib.util.darkTheme.c.a(getContext())) ? R.color.custom_product_color_constant_warm_gray_36 : R.color.custom_product_color_constant_warm_gray_36_night)))).intValue();
        int iIntValue6 = ((Integer) new ArgbEvaluator().evaluate(f15, Integer.valueOf(C35835l0.d(R.attr.warmGray4, getContext())), Integer.valueOf(c48063a.a(getContext(), aVar.f264567a)))).intValue();
        ToolbarShareButton toolbarShareButton = kVar.f264566j;
        ImageView imageView = this.f264499t0;
        if (toolbarShareButton != null) {
            imageView.setImageTintList(ColorStateList.valueOf(iIntValue2));
            if (imageView.getVisibility() != 0) {
                imageView.setVisibility(0);
                this.f264463b0.accept(ShareButtonEvent.f264427c);
                imageView.setOnClickListener(new com.avito.android.search_view.o(this, 0));
            }
        } else {
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
        }
        Y((!z12 || f12 == 0.0f) ? iIntValue : 0, iIntValue2, iIntValue2, ColorStateList.valueOf(iIntValue5));
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar2 = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
        if (z12) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(iIntValue);
            gradientDrawable.setCornerRadius(getContext().getResources().getDimensionPixelSize(R.dimen.cart_container_corner_radius));
            G0 g02 = G0.f406611a;
            bVar = new a.AbstractC5229a.c(gradientDrawable);
        } else {
            bVar = new a.AbstractC5229a.b(iIntValue);
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iIntValue2);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iIntValue5);
        aVar2.getClass();
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.b(this, bVar, colorStateListValueOf, colorStateListValueOf2, f13);
        if (z12) {
            float f16 = f13;
            N(this.f264502v, this.f264500u, iIntValue, f16, iIntValue2);
            N(this.f264510z, this.f264508y, iIntValue, f16, iIntValue2);
        } else {
            int iD2 = C35835l0.d(R.attr.white, getContext());
            ViewGroup viewGroup2 = this.f264502v;
            viewGroup2.setBackgroundColor(iD2);
            this.f264500u.setTextColor(C35835l0.d(R.attr.black, getContext()));
            viewGroup2.setAlpha(1.0f);
            int iD3 = C35835l0.d(R.attr.white, getContext());
            ViewGroup viewGroup3 = this.f264510z;
            viewGroup3.setBackgroundColor(iD3);
            this.f264508y.setTextColor(C35835l0.d(R.attr.black, getContext()));
            viewGroup3.setAlpha(1.0f);
        }
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.c(this, iIntValue4, iIntValue, true);
        U(iIntValue2, ColorStateList.valueOf(iIntValue3), com.avito.android.search_view.l.a(aVar, getContext(), f15), f13);
        T(iIntValue2, androidx.core.content.d.getColor(getContext(), R.color.common_red), ColorStateList.valueOf(iIntValue6), ColorStateList.valueOf(iIntValue5));
        X(iIntValue3, iIntValue2);
        this.f264448K.setTextColor(iIntValue2);
        this.f264450M.setTextColor(iIntValue2);
        this.f264449L.setTextColor(iIntValue2);
    }

    @Override // com.avito.android.search_view.v
    public final void b() {
        this.f264489o0 = true;
        setNavigationIcon(null);
        M();
        int iD2 = C35835l0.d(R.attr.white, getContext());
        int iD3 = C35835l0.d(R.attr.black, getContext());
        int iD4 = C35835l0.d(R.attr.black, getContext());
        int color = androidx.core.content.d.getColor(getContext(), R.color.common_warm_gray_16);
        int color2 = androidx.core.content.d.getColor(getContext(), R.color.common_red);
        int iD5 = C35835l0.d(R.attr.warmGray4, getContext());
        ColorStateList colorStateList = androidx.core.content.d.getColorStateList(getContext(), R.color.bg_redesign_input_normal);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(iD5);
        }
        Y(iD2, iD3, iD4, ColorStateList.valueOf(color));
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
        a.AbstractC5229a.b bVar = new a.AbstractC5229a.b(iD2);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD3);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(color);
        aVar.getClass();
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.b(this, bVar, colorStateListValueOf, colorStateListValueOf2, 1.0f);
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.c(this, color2, iD2, false);
        setHighlightInputColor(C35835l0.d(R.attr.blackAlpha24, getContext()));
        U(iD3, C35835l0.e(R.attr.gray54, getContext()), colorStateList, 1.0f);
        T(iD3, color2, colorStateList, ColorStateList.valueOf(color));
        X(C35835l0.d(R.attr.gray36, getContext()), C35835l0.d(R.attr.black, getContext()));
        this.f264448K.setTextColor(iD3);
        this.f264450M.setTextColor(iD3);
        this.f264449L.setTextColor(iD3);
        F(true);
        this.f264441D.setVisibility(0);
        this.f264486n.setVisibility(8);
        this.f264499t0.setVisibility(8);
        this.f264471f0 = NavigationBarStyle.DisplayType.SearchInput.INSTANCE;
    }

    @Override // com.avito.android.search_view.v
    public final void c() {
        if (this.f264481k0) {
            Input input = this.f264474h;
            D6.G(input, true);
            input.requestFocus();
        }
    }

    @Override // com.avito.android.search_view.v
    public final void close() {
        G();
    }

    @Override // com.avito.android.search_view.v
    public final void d(int i12) {
        this.f264482l = i12;
        View view = this.f264480k;
        if (view == null) {
            return;
        }
        D6.G(view, i12 > 0);
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<String> dc() {
        return com.avito.android.lib.design.input.n.e(this.f264474h).K(new r()).d0(s.f264549b);
    }

    @Override // com.avito.android.search_view.a
    public final void e(boolean z12, boolean z13) {
        this.f264491p0 = !z13;
        if (this.f264475h0) {
            return;
        }
        SavedSearchState savedSearchState = getSavedSearchState();
        if (savedSearchState.f264421f) {
            setSavedSearchState(SavedSearchState.a(savedSearchState, z12 ? SavedSearchState.Visibility.f264422b : SavedSearchState.Visibility.f264423c, false, false, false, false, 30));
        }
        P();
        Q();
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<Integer> e5() {
        return this.f264456S;
    }

    @Override // com.avito.android.search_view.h
    public final void f() throws Resources.NotFoundException {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.input_height_with_search_promo_banner);
        boolean z12 = this.f264496s.getVisibility() == 0;
        ViewGroup viewGroup = this.f264502v;
        boolean z13 = viewGroup.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f264510z;
        boolean z14 = viewGroup2.getVisibility() == 0;
        if (z12) {
            setUpCart(dimensionPixelSize);
        } else if (z13) {
            O(viewGroup, this.f264498t, null, dimensionPixelSize);
        } else if (z14) {
            O(viewGroup2, this.f264504w, this.f264506x, dimensionPixelSize);
        }
        Input input = this.f264474h;
        input.getLayoutParams().height = dimensionPixelSize;
        input.setMinimumHeight(dimensionPixelSize);
        D6.c((AppCompatImageView) input.findViewById(R.id.design_input_left_icon), null, null, null, Integer.valueOf(y6.b(6)), 7);
    }

    @Override // com.avito.android.search_view.v
    public final void g(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f264469e0.observe(interfaceC22983P, new u.a(new e()));
    }

    @Y61.l
    public RecyclerView.Adapter<?> getAdapter() {
        return this.adapter;
    }

    @Override // com.avito.android.search_view.h
    @Y61.k
    public View getCartItemView() {
        return this.f264496s;
    }

    @Override // com.avito.android.search_view.h
    @Y61.k
    public z<G0> getDismissEvents() {
        return this.f264507x0;
    }

    @Y61.k
    public final View getDivider() {
        return this.divider;
    }

    @Override // com.avito.android.search_view.h
    @Y61.k
    /* renamed from: getFiltersItemView, reason: from getter */
    public View getF264438B() {
        return this.f264438B;
    }

    @Override // com.avito.android.search_view.v
    @Y61.l
    public final String getHint() {
        CharSequence hint = this.f264474h.getHint();
        if (hint != null) {
            return hint.toString();
        }
        return null;
    }

    public int getInputViewId() {
        return R.id.input_view;
    }

    @Y61.k
    public final View getLoyaltyBonusesItemView() {
        return this.f264510z;
    }

    @Y61.l
    public String getQuery() {
        Editable editableM53getText = this.f264474h.m53getText();
        if (editableM53getText != null) {
            return editableM53getText.toString();
        }
        return null;
    }

    public boolean getSavedSearchStateVisibility() {
        SavedSearchState savedSearchState = getSavedSearchState();
        if (!savedSearchState.f264418c) {
            if (savedSearchState.f264417b == SavedSearchState.Visibility.f264422b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public z<C42120a> getSearchInputLayoutChanges() {
        return this.f264509y0;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public z<Boolean> getSearchOpeningChanges() {
        return this.f264505w0;
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public z<ShareButtonEvent> getShareButtonEvents() {
        return this.f264511z0;
    }

    @Y61.k
    public final View getTicketItemView() {
        return this.f264502v;
    }

    @Override // com.avito.android.search_view.v
    public final void h() {
        D6.w(this.f264474h);
    }

    @Override // com.avito.android.search_view.v
    @SuppressLint({"NotifyDataSetChanged"})
    public final void i() {
        RecyclerView.Adapter adapter = this.f264470f.getAdapter();
        if (adapter == null) {
            throw new IllegalStateException("Adapter must be provided via setter");
        }
        R();
        adapter.notifyDataSetChanged();
    }

    @Override // com.avito.android.search_view.v
    public final void j(boolean z12) {
        setSavedSearchState(SavedSearchState.a(getSavedSearchState(), z12 ? SavedSearchState.Visibility.f264422b : SavedSearchState.Visibility.f264423c, false, false, false, false, 30));
    }

    @Override // com.avito.android.search_view.v
    public final void k() {
        this.f264474h.setOnClickListener(null);
        this.f264451N.setOnClickListener(new com.avito.android.search_view.o(this, 2));
    }

    @Override // com.avito.android.search_view.v
    public final void l(int i12, int i13) {
        D6.c(this.f264442E, Integer.valueOf(i12), Integer.valueOf(i13), null, null, 12);
    }

    @Override // com.avito.android.search_view.v
    public final void m() {
        this.f264473g0 = Boolean.FALSE;
        D6.w(this.f264442E);
    }

    @Override // com.avito.android.search_view.v
    public final void n(@Y61.k String str) {
        Input input = this.f264474h;
        Input.t(input, str, false, 6);
        input.setSelection(str.length());
    }

    @Override // com.avito.android.search_view.v
    public final void o() {
        if (this.f264481k0) {
            D6.G(this.f264474h, true);
            P.b(this, new n(this, this));
        }
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<String> o6() {
        return C37750f0.b(this.f264474h.f179340l).d0(new q());
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public final boolean onMenuItemClick(@Y61.k MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.discard_search) {
            Input.t(this.f264474h, "", false, 6);
            return true;
        }
        this.f264456S.accept(Integer.valueOf(menuItem.getItemId()));
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Y61.l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        c cVar = savedState.f264515e;
        this.f264495r0 = cVar;
        if (cVar == c.f264529c) {
            F(false);
        }
        boolean z12 = savedState.f264512b;
        this.f264475h0 = z12;
        this.f264479j0 = savedState.f264513c;
        this.f264483l0 = savedState.f264516f;
        this.f264485m0 = savedState.f264517g;
        this.f264487n0 = savedState.f264518h;
        if (z12) {
            post(new com.avito.android.publish.screen.objects.view.actions.h(this, 11));
        }
        setSearchEnabled(savedState.f264514d);
        this.f264491p0 = savedState.f264520j;
        P();
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    @Y61.k
    public final Parcelable onSaveInstanceState() {
        RunnableC34589p runnableC34589p = this.f264477i0;
        if (runnableC34589p != null) {
            runnableC34589p.run();
        }
        return new SavedState(this.f264475h0, this.f264479j0, this.f264481k0, this.f264495r0, this.f264483l0, this.f264485m0, this.f264487n0, super.onSaveInstanceState(), this.f264491p0);
    }

    @Override // com.avito.android.search_view.v
    public final void p(@Y61.k SubscriptionButtonState subscriptionButtonState) {
        SavedSearchState savedSearchStateA;
        SavedSearchState savedSearchState = getSavedSearchState();
        int iOrdinal = subscriptionButtonState.ordinal();
        if (iOrdinal == 0) {
            savedSearchStateA = SavedSearchState.a(savedSearchState, null, false, true, false, false, 19);
        } else if (iOrdinal == 1) {
            savedSearchStateA = SavedSearchState.a(savedSearchState, null, false, false, false, false, 19);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            savedSearchStateA = SavedSearchState.a(savedSearchState, null, false, false, true, false, 23);
        }
        setSavedSearchState(savedSearchStateA);
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<Boolean> q() {
        return this.f264458U;
    }

    @Override // com.avito.android.search_view.h
    public final void r(int i12) {
        View view = this.f264468e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i12;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<DeepLink> s() {
        return this.f264465c0;
    }

    @Override // com.avito.android.search_view.v
    public void setAdapter(@Y61.l RecyclerView.Adapter<?> adapter) {
        this.adapter = adapter;
        RecyclerView recyclerView = this.f264470f;
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(null);
    }

    @Override // com.avito.android.search_view.h
    public void setCartEnabled(boolean enabled) {
        this.f264483l0 = enabled;
    }

    public final void setHighlightInputColor(@InterfaceC42156l int color) {
        this.f264474h.setHighlightColor(color);
    }

    @Override // com.avito.android.search_view.v
    public final void setHint(@Y61.k String hint) {
        String str = this.f264462b.f264525c;
        if (str != null) {
            hint = str;
        }
        this.f264474h.setHint(hint);
    }

    @Override // com.avito.android.search_view.v
    public void setInputClickListener(@Y61.k Y41.a<G0> listener) {
        this.f264474h.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(20, listener));
        this.f264451N.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(21, listener));
    }

    public final void setInputHeight(int height) {
        Input input = this.f264474h;
        input.getLayoutParams().height = y6.b(height);
        input.setMinimumHeight(y6.b(height));
    }

    public final void setLeftButtonVisibility(boolean visible) {
        this.f264503v0 = visible;
    }

    public final void setLoyaltyBonusesEnabled(boolean enabled) {
        this.f264487n0 = enabled;
    }

    @Override // com.avito.android.search_view.v
    public void setMenu(@j.L int menuId) {
        Integer num = this.f264492q;
        if (num != null && menuId == num.intValue()) {
            return;
        }
        V(menuId);
    }

    public void setQuery(@e0 int text) {
        this.f264474h.setText(text);
    }

    @Override // com.avito.android.search_view.v
    public void setSaveSearchInHeaderOnScroll(boolean trackScroll) {
        SavedSearchState savedSearchState = getSavedSearchState();
        if (savedSearchState.f264421f != trackScroll) {
            setSavedSearchState(SavedSearchState.a(savedSearchState, null, false, false, false, trackScroll, 15));
        }
    }

    @Override // com.avito.android.search_view.v
    public void setSearchEnabled(boolean enabled) {
        this.f264481k0 = enabled;
        Input input = this.f264474h;
        input.setFocusableInTouchMode(enabled);
        input.setFocusable(this.f264481k0);
        p6 p6Var = new p6(input);
        while (p6Var.hasNext()) {
            ((View) p6Var.next()).setFocusable(this.f264481k0);
        }
    }

    public final void setTicketEnabled(boolean enabled) {
        this.f264485m0 = enabled;
    }

    @Override // com.avito.android.search_view.v
    public void setTopPadding(@U int top) {
        ConstraintLayout constraintLayout = this.f264488o;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), top, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
    }

    @Override // com.avito.android.search_view.v
    public void setUserMovedMapSinceLastLocationUpdate(boolean mapMoved) {
        this.f264493q0 = mapMoved;
        if (this.f264471f0 instanceof NavigationBarStyle.DisplayType.SearchWithActionTitle) {
            this.f264448K.setText(mapMoved ? this.f264455R : this.f264454Q);
        }
    }

    @Override // com.avito.android.search_view.a
    public final boolean t() {
        SavedSearchState savedSearchState = getSavedSearchState();
        if (!savedSearchState.f264418c) {
            if (savedSearchState.f264417b == SavedSearchState.Visibility.f264422b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.search_view.v
    public final void u(@Y61.k Y41.a<G0> aVar) {
        this.f264477i0 = new RunnableC34589p(8, this, aVar);
    }

    @Override // com.avito.android.search_view.v
    /* renamed from: v, reason: from getter */
    public final boolean getF264475h0() {
        return this.f264475h0;
    }

    @Override // com.avito.android.search_view.v
    public final void w() {
        this.f264473g0 = Boolean.TRUE;
    }

    @Override // com.avito.android.search_view.v
    public final void x() {
        J();
    }

    @Override // com.avito.android.search_view.v
    public final void y(@Y61.k HistorySuggestItem historySuggestItem, @Y61.k Y41.l<? super SuggestHistoryItem, G0> lVar, @Y61.k Y41.l<? super SuggestHistoryItem, G0> lVar2) {
        boolean z12 = !historySuggestItem.getItems().isEmpty() && this.f264475h0;
        List<SuggestHistoryItem> items = historySuggestItem.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.avito.android.search.e((SuggestHistoryItem) it.next()));
        }
        Chips chips = this.f264446I;
        D6.G(chips, z12);
        chips.setData(arrayList);
        chips.setChipsSelectedListener(new g(lVar, this));
        chips.setChipsOnRightDrawableClickedListener(new h(lVar2));
        if (historySuggestItem.getItems().isEmpty()) {
            return;
        }
        chips.o((com.avito.android.lib.design.chips.h) C42745f0.E(arrayList), false);
    }

    @Override // com.avito.android.search_view.v
    @Y61.k
    public final z<G0> z() {
        if (!this.f264475h0) {
            L();
        }
        return this.f264457T;
    }

    public /* synthetic */ Toolbar23SearchView(Context context, AttributeSet attributeSet, int i12, b bVar, a aVar, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? new b(true, true, null, false, false, 24, null) : bVar, (i13 & 16) != 0 ? new a(C35835l0.d(R.attr.gray36, context), C35835l0.d(R.attr.black, context)) : aVar);
    }

    @Override // com.avito.android.search_view.v
    public void setQuery(@Y61.k String text) {
        Input.t(this.f264474h, text, false, 6);
    }

    /* compiled from: Toolbar23SearchView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/Toolbar23SearchView$b;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f264523a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f264524b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f264525c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f264526d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f264527e;

        public b(@Y61.l String str, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f264523a = z12;
            this.f264524b = z13;
            this.f264525c = str;
            this.f264526d = z14;
            this.f264527e = z15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f264523a == bVar.f264523a && this.f264524b == bVar.f264524b && L.f(this.f264525c, bVar.f264525c) && this.f264526d == bVar.f264526d && this.f264527e == bVar.f264527e;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(Boolean.hashCode(this.f264523a) * 31, 31, this.f264524b);
            String str = this.f264525c;
            return Boolean.hashCode(this.f264527e) + androidx.appcompat.app.r.i((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f264526d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchViewConfig(showFilters=");
            sb2.append(this.f264523a);
            sb2.append(", showSavedSearch=");
            sb2.append(this.f264524b);
            sb2.append(", forceOverrideHint=");
            sb2.append(this.f264525c);
            sb2.append(", showCart=");
            sb2.append(this.f264526d);
            sb2.append(", useRe23Input=");
            return androidx.appcompat.app.r.x(sb2, this.f264527e, ')');
        }

        public /* synthetic */ b(boolean z12, boolean z13, String str, boolean z14, boolean z15, int i12, C42822w c42822w) {
            this(str, z12, z13, (i12 & 8) != 0 ? true : z14, (i12 & 16) != 0 ? false : z15);
        }
    }

    @X41.j
    public Toolbar23SearchView(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, @Y61.k b bVar, @Y61.k a aVar) {
        String str;
        String str2;
        ViewGroup viewGroup;
        super(context, attributeSet, i12);
        this.f264462b = bVar;
        this.f264464c = aVar;
        this.f264456S = new com.jakewharton.rxrelay3.c<>();
        this.f264457T = new com.jakewharton.rxrelay3.c<>();
        this.f264458U = new com.jakewharton.rxrelay3.c<>();
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f264459V = cVar;
        com.jakewharton.rxrelay3.c<Boolean> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f264460W = cVar2;
        com.jakewharton.rxrelay3.c<C42120a> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f264461a0 = cVar3;
        com.jakewharton.rxrelay3.c<ShareButtonEvent> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f264463b0 = cVar4;
        this.f264465c0 = new com.jakewharton.rxrelay3.c<>();
        this.savedSearchView = C42727D.c(new f());
        this.f264469e0 = new C23038g0<>(new ToolbarState(null, 1, null));
        this.f264471f0 = NavigationBarStyle.DisplayType.SearchInput.INSTANCE;
        this.f264481k0 = true;
        this.f264483l0 = true;
        this.f264485m0 = true;
        this.f264487n0 = true;
        this.f264489o0 = true;
        this.f264491p0 = true;
        this.f264495r0 = c.f264528b;
        this.f264505w0 = new C41981q0(cVar2);
        this.f264507x0 = new C41981q0(cVar);
        this.f264509y0 = new C41981q0(cVar3);
        this.f264511z0 = new C41981q0(cVar4);
        com.avito.android.search_view.f fVar = new com.avito.android.search_view.f(context);
        this.f264437A0 = getResources().getDimensionPixelOffset(R.dimen.redesign_search_toolbar_common_horizontal_margin);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13906a.g.f6746a, i12, 0);
        LayoutInflater.from(contextThemeWrapper).inflate(R.layout.new_redesign_search_bar, this);
        setId(R.id.new_redesign_search_bar);
        View viewFindViewById = findViewById(R.id.toolbar_container);
        if (viewFindViewById != null) {
            this.f264466d = viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.toolbar_bottom_offset);
            if (viewFindViewById2 != null) {
                this.f264468e = viewFindViewById2;
                View viewFindViewById3 = findViewById(R.id.suggests_recycler_view);
                if (viewFindViewById3 != null) {
                    RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
                    this.f264470f = recyclerView;
                    boolean z12 = bVar.f264527e;
                    int i13 = z12 ? R.id.input_view_re23 : R.id.input_view;
                    View viewFindViewById4 = findViewById(R.id.input_view_re23);
                    if (viewFindViewById4 != null) {
                        ((Input) viewFindViewById4).setVisibility(z12 ? 0 : 8);
                        View viewFindViewById5 = findViewById(R.id.input_view);
                        if (viewFindViewById5 != null) {
                            ((Input) viewFindViewById5).setVisibility(!z12 ? 0 : 8);
                            View viewFindViewById6 = findViewById(i13);
                            if (viewFindViewById6 != null) {
                                Input input = (Input) viewFindViewById6;
                                input.setId(getInputViewId());
                                this.f264474h = input;
                                View viewFindViewById7 = findViewById(R.id.shadow);
                                if (viewFindViewById7 != null) {
                                    this.f264472g = viewFindViewById7;
                                    View viewFindViewById8 = findViewById(R.id.search_divider_view);
                                    if (viewFindViewById8 != null) {
                                        this.divider = viewFindViewById8;
                                        View viewFindViewById9 = findViewById(R.id.bubbles_recycler_view);
                                        if (viewFindViewById9 != null) {
                                            this.f264445H = (Chips) viewFindViewById9;
                                            View viewFindViewById10 = findViewById(R.id.history_chips);
                                            if (viewFindViewById10 != null) {
                                                this.f264446I = (Chips) viewFindViewById10;
                                                View viewFindViewById11 = findViewById(R.id.dismiss_text_view);
                                                if (viewFindViewById11 != null) {
                                                    TextView textView = (TextView) viewFindViewById11;
                                                    this.f264484m = textView;
                                                    View viewFindViewById12 = findViewById(R.id.search_bar_logo);
                                                    if (viewFindViewById12 != null) {
                                                        this.f264490p = (SimpleDraweeView) viewFindViewById12;
                                                        View viewFindViewById13 = findViewById(R.id.cart_button);
                                                        if (viewFindViewById13 != null) {
                                                            ImageView imageView = (ImageView) viewFindViewById13;
                                                            C35835l0.h(R.attr.ic_cartOutline24, context);
                                                            this.f264494r = imageView;
                                                            if (bVar.f264526d) {
                                                                View viewFindViewById14 = findViewById(R.id.cart_icon_container);
                                                                if (viewFindViewById14 != null) {
                                                                    viewGroup = (ViewGroup) viewFindViewById14;
                                                                    str = "null cannot be cast to non-null type android.widget.TextView";
                                                                    viewGroup.setClipToPadding(false);
                                                                    str2 = "null cannot be cast to non-null type android.view.ViewGroup";
                                                                } else {
                                                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                                                                }
                                                            } else {
                                                                str = "null cannot be cast to non-null type android.widget.TextView";
                                                                FrameLayout frameLayout = new FrameLayout(getContext());
                                                                str2 = "null cannot be cast to non-null type android.view.ViewGroup";
                                                                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                                                                viewGroup = frameLayout;
                                                            }
                                                            this.f264496s = viewGroup;
                                                            View viewFindViewById15 = findViewById(R.id.ticket_button);
                                                            if (viewFindViewById15 != null) {
                                                                this.f264498t = (ImageView) viewFindViewById15;
                                                                View viewFindViewById16 = findViewById(R.id.ticket_quantity_text);
                                                                if (viewFindViewById16 != null) {
                                                                    this.f264500u = (TextView) viewFindViewById16;
                                                                    View viewFindViewById17 = findViewById(R.id.ticket_icon_container);
                                                                    if (viewFindViewById17 != null) {
                                                                        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById17;
                                                                        viewGroup2.setClipToPadding(false);
                                                                        this.f264502v = viewGroup2;
                                                                        View viewFindViewById18 = findViewById(R.id.loyalty_entry_button);
                                                                        if (viewFindViewById18 != null) {
                                                                            this.f264504w = (ImageView) viewFindViewById18;
                                                                            View viewFindViewById19 = findViewById(R.id.loyalty_entry_button_skeleton);
                                                                            if (viewFindViewById19 != null) {
                                                                                this.f264506x = viewFindViewById19;
                                                                                View viewFindViewById20 = findViewById(R.id.loyalty_entry_bonuses_count);
                                                                                if (viewFindViewById20 != null) {
                                                                                    this.f264508y = (TextView) viewFindViewById20;
                                                                                    View viewFindViewById21 = findViewById(R.id.loyalty_bonuses_icon_container);
                                                                                    if (viewFindViewById21 != null) {
                                                                                        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById21;
                                                                                        viewGroup3.setClipToPadding(false);
                                                                                        this.f264510z = viewGroup3;
                                                                                        View viewFindViewById22 = findViewById(R.id.right_icons_container);
                                                                                        if (viewFindViewById22 != null) {
                                                                                            ViewGroup viewGroup4 = (ViewGroup) viewFindViewById22;
                                                                                            viewGroup4.setClipToPadding(false);
                                                                                            this.f264436A = viewGroup4;
                                                                                            View viewFindViewById23 = findViewById(R.id.filter_button_view);
                                                                                            if (viewFindViewById23 != null) {
                                                                                                this.f264438B = viewFindViewById23;
                                                                                                View viewFindViewById24 = viewFindViewById23.findViewById(R.id.clarify_placeholder_view);
                                                                                                if (viewFindViewById24 != null) {
                                                                                                    this.f264440C = (ImageView) viewFindViewById24;
                                                                                                    if (!bVar.f264523a) {
                                                                                                        D6.w(viewFindViewById23);
                                                                                                    }
                                                                                                    View viewFindViewById25 = findViewById(R.id.design_input_left_container);
                                                                                                    if (viewFindViewById25 != null) {
                                                                                                        this.f264443F = viewFindViewById25;
                                                                                                        View viewFindViewById26 = findViewById(R.id.right_barrier);
                                                                                                        if (viewFindViewById26 != null) {
                                                                                                            this.f264444G = viewFindViewById26;
                                                                                                            View viewFindViewById27 = findViewById(R.id.search_icon_view);
                                                                                                            if (viewFindViewById27 != null) {
                                                                                                                this.f264497s0 = viewFindViewById27;
                                                                                                                View viewFindViewById28 = findViewById(R.id.share_icon_view);
                                                                                                                if (viewFindViewById28 != null) {
                                                                                                                    this.f264499t0 = (ImageView) viewFindViewById28;
                                                                                                                    View viewFindViewById29 = findViewById(R.id.toolbar_center_title);
                                                                                                                    if (viewFindViewById29 != null) {
                                                                                                                        this.f264486n = (TextView) viewFindViewById29;
                                                                                                                        View viewFindViewById30 = findViewById(R.id.search_with_action_title_view);
                                                                                                                        if (viewFindViewById30 != null) {
                                                                                                                            ViewGroup viewGroup5 = (ViewGroup) viewFindViewById30;
                                                                                                                            viewGroup5.setId(R.id.search_with_action_title_view);
                                                                                                                            this.f264447J = viewGroup5;
                                                                                                                            View viewFindViewById31 = findViewById(R.id.search_with_action_title_tv);
                                                                                                                            if (viewFindViewById31 != null) {
                                                                                                                                this.f264448K = (TextView) viewFindViewById31;
                                                                                                                                View viewFindViewById32 = findViewById(R.id.search_with_action_title_icon);
                                                                                                                                if (viewFindViewById32 != null) {
                                                                                                                                    this.f264449L = (TextView) viewFindViewById32;
                                                                                                                                    View viewFindViewById33 = findViewById(R.id.search_with_action_subtitle_tv);
                                                                                                                                    if (viewFindViewById33 != null) {
                                                                                                                                        this.f264450M = (TextView) viewFindViewById33;
                                                                                                                                        View viewFindViewById34 = findViewById(R.id.search_with_action_search_icon);
                                                                                                                                        if (viewFindViewById34 != null) {
                                                                                                                                            viewFindViewById34.setOnClickListener(new com.avito.android.search_view.o(this, 5));
                                                                                                                                            this.f264451N = viewFindViewById34;
                                                                                                                                            View viewFindViewById35 = findViewById(R.id.search_with_action_filters_icon);
                                                                                                                                            if (viewFindViewById35 != null) {
                                                                                                                                                viewFindViewById35.setOnClickListener(new com.avito.android.search_view.o(this, 6));
                                                                                                                                                this.f264452O = viewFindViewById35;
                                                                                                                                                View viewFindViewById36 = findViewById(R.id.search_with_action_text_container);
                                                                                                                                                if (viewFindViewById36 != null) {
                                                                                                                                                    this.f264453P = (ViewGroup) viewFindViewById36;
                                                                                                                                                    this.f264455R = context.getString(R.string.search_with_action_title_map_area_text);
                                                                                                                                                    viewFindViewById27.setOnClickListener(new com.avito.android.search_view.o(this, 7));
                                                                                                                                                    View viewFindViewById37 = findViewById(R.id.icons_container_view);
                                                                                                                                                    if (viewFindViewById37 != null) {
                                                                                                                                                        ViewGroup viewGroup6 = (ViewGroup) viewFindViewById37;
                                                                                                                                                        this.f264441D = viewGroup6;
                                                                                                                                                        final int i14 = 0;
                                                                                                                                                        viewGroup6.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.search_view.p

                                                                                                                                                            /* renamed from: c, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ Toolbar23SearchView f264586c;

                                                                                                                                                            {
                                                                                                                                                                this.f264586c = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnLayoutChangeListener
                                                                                                                                                            public final void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24) {
                                                                                                                                                                Toolbar23SearchView toolbar23SearchView = this.f264586c;
                                                                                                                                                                switch (i14) {
                                                                                                                                                                    case 0:
                                                                                                                                                                        int i25 = Toolbar23SearchView.f264435C0;
                                                                                                                                                                        if (view.getWidth() != i23 - i19) {
                                                                                                                                                                            int width = view.getWidth() + y6.b(12);
                                                                                                                                                                            Input.j(toolbar23SearchView.f264474h, 0, width, 11);
                                                                                                                                                                            Input.e(toolbar23SearchView.f264474h, 0, 0, width, 0, 0, 27);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        if (toolbar23SearchView.f264442E.getVisibility() == 0) {
                                                                                                                                                                            toolbar23SearchView.f264461a0.accept(new C42120a(i15, i17 - i15));
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        View viewFindViewById38 = findViewById(R.id.search_bar_container);
                                                                                                                                                        if (viewFindViewById38 != null) {
                                                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById38;
                                                                                                                                                            this.f264488o = constraintLayout;
                                                                                                                                                            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                                                                                                                                                            dVar.g(constraintLayout);
                                                                                                                                                            dVar.i(R.id.icons_container_view, 7, getInputViewId(), 7);
                                                                                                                                                            dVar.c(constraintLayout);
                                                                                                                                                            Drawable drawableH = C35835l0.h(R.attr.ic_search20, viewFindViewById25.getContext());
                                                                                                                                                            int intrinsicWidth = drawableH != null ? drawableH.getIntrinsicWidth() : y6.b(24);
                                                                                                                                                            input.m(input.f179336h, y6.b(52));
                                                                                                                                                            View viewFindViewById39 = findViewById(R.id.design_input_right_container);
                                                                                                                                                            if (viewFindViewById39 != null) {
                                                                                                                                                                D6.f(viewFindViewById39, 0, y6.b(5), y6.b(6) + viewFindViewById39.getPaddingRight(), y6.b(5), 1);
                                                                                                                                                                input.k(y6.b(22) + intrinsicWidth, input.f179335g);
                                                                                                                                                                D6.f(viewFindViewById25, y6.b(16), 0, y6.b(6), 0, 10);
                                                                                                                                                                viewFindViewById23.setOnClickListener(new com.avito.android.search_view.o(this, 8));
                                                                                                                                                                textView.setOnClickListener(new com.avito.android.search_view.o(this, 9));
                                                                                                                                                                input.setLeftIcon(C35835l0.h(R.attr.ic_search20, input.getContext()));
                                                                                                                                                                D6.f(input.findViewById(R.id.design_input_left_icon), 0, y6.b(8), 0, 0, 13);
                                                                                                                                                                input.setLeftIconColor(this.f264464c.f264521a);
                                                                                                                                                                Input.j(input, y6.a(14.5f), 0, 14);
                                                                                                                                                                Input.e(input, y6.a(14.5f), 0, 0, 0, 0, 30);
                                                                                                                                                                imageView.setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.black, input.getContext())));
                                                                                                                                                                this.f264480k = findViewById(R.id.filters_badge_counter_view);
                                                                                                                                                                View viewFindViewById40 = findViewById(R.id.toolbar_up_button_view);
                                                                                                                                                                if (viewFindViewById40 != null) {
                                                                                                                                                                    this.f264442E = (ImageView) viewFindViewById40;
                                                                                                                                                                    final int i15 = 1;
                                                                                                                                                                    input.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.search_view.p

                                                                                                                                                                        /* renamed from: c, reason: collision with root package name */
                                                                                                                                                                        public final /* synthetic */ Toolbar23SearchView f264586c;

                                                                                                                                                                        {
                                                                                                                                                                            this.f264586c = this;
                                                                                                                                                                        }

                                                                                                                                                                        @Override // android.view.View.OnLayoutChangeListener
                                                                                                                                                                        public final void onLayoutChange(View view, int i152, int i16, int i17, int i18, int i19, int i22, int i23, int i24) {
                                                                                                                                                                            Toolbar23SearchView toolbar23SearchView = this.f264586c;
                                                                                                                                                                            switch (i15) {
                                                                                                                                                                                case 0:
                                                                                                                                                                                    int i25 = Toolbar23SearchView.f264435C0;
                                                                                                                                                                                    if (view.getWidth() != i23 - i19) {
                                                                                                                                                                                        int width = view.getWidth() + y6.b(12);
                                                                                                                                                                                        Input.j(toolbar23SearchView.f264474h, 0, width, 11);
                                                                                                                                                                                        Input.e(toolbar23SearchView.f264474h, 0, 0, width, 0, 0, 27);
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    if (toolbar23SearchView.f264442E.getVisibility() == 0) {
                                                                                                                                                                                        toolbar23SearchView.f264461a0.accept(new C42120a(i152, i17 - i152));
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    setSuggestionsVisible(false);
                                                                                                                                                                    getContext();
                                                                                                                                                                    recyclerView.setLayoutManager(new LinearLayoutManager());
                                                                                                                                                                    recyclerView.o(new com.avito.android.search_view.r(this));
                                                                                                                                                                    viewFindViewById7.setOnClickListener(new com.avito.android.search_view.o(this, 3));
                                                                                                                                                                    input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 13));
                                                                                                                                                                    input.f();
                                                                                                                                                                    textView.setBackground(new RippleDrawable(ColorStateList.valueOf(C22767g.i(C35835l0.d(R.attr.warmGray100, textView.getContext()), 21)), null, C43852a.a(getRootView().getContext(), R.drawable.rect_mask_radius_3)));
                                                                                                                                                                    viewFindViewById23.setBackground(H(ColorStateList.valueOf(C35835l0.d(R.attr.warmGray12, textView.getContext()))));
                                                                                                                                                                    String string = typedArrayObtainStyledAttributes.getString(2);
                                                                                                                                                                    setHint(string == null ? "" : string);
                                                                                                                                                                    typedArrayObtainStyledAttributes.recycle();
                                                                                                                                                                    input.setFocusableInTouchMode(this.f264481k0);
                                                                                                                                                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
                                                                                                                                                                    marginLayoutParams.leftMargin = getPaddingLeft();
                                                                                                                                                                    marginLayoutParams.rightMargin = getPaddingRight();
                                                                                                                                                                    viewFindViewById.requestLayout();
                                                                                                                                                                    this.f264478j = getResources().getDimensionPixelOffset(R.dimen.search_bar_suggest_padding);
                                                                                                                                                                    recyclerView.l(fVar, -1);
                                                                                                                                                                    recyclerView.l(new com.avito.android.list.list_snippet.d(context.getResources()), -1);
                                                                                                                                                                    recyclerView.l(new com.avito.android.search_view.d(context.getResources()), -1);
                                                                                                                                                                    View viewFindViewById41 = findViewById(R.id.categories_left_button);
                                                                                                                                                                    if (viewFindViewById41 != null) {
                                                                                                                                                                        Button button = (Button) viewFindViewById41;
                                                                                                                                                                        button.setOnClickListener(new com.avito.android.search_view.o(this, 10));
                                                                                                                                                                        this.f264501u0 = button;
                                                                                                                                                                        if (this.f264462b.f264527e) {
                                                                                                                                                                            Drawable drawableH2 = C35835l0.h(R.attr.ic_search20, viewFindViewById25.getContext());
                                                                                                                                                                            int intrinsicWidth2 = drawableH2 != null ? drawableH2.getIntrinsicWidth() : y6.b(20);
                                                                                                                                                                            D6.f(input.findViewById(R.id.design_input_left_icon), y6.b(16), y6.b(0), 0, 0, 12);
                                                                                                                                                                            int iB2 = y6.b(20) + intrinsicWidth2;
                                                                                                                                                                            input.k(iB2, input.f179335g);
                                                                                                                                                                            input.m(iB2, y6.b(44));
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                                                                                                                                                                }
                                                                                                                                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                                                                                                                                            }
                                                                                                                                                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                                                                                                        }
                                                                                                                                                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                                                                                                                                    }
                                                                                                                                                    throw new NullPointerException(str2);
                                                                                                                                                }
                                                                                                                                                throw new NullPointerException(str2);
                                                                                                                                            }
                                                                                                                                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                                                                                        }
                                                                                                                                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                                                                                    }
                                                                                                                                    throw new NullPointerException(str);
                                                                                                                                }
                                                                                                                                throw new NullPointerException(str);
                                                                                                                            }
                                                                                                                            throw new NullPointerException(str);
                                                                                                                        }
                                                                                                                        throw new NullPointerException(str2);
                                                                                                                    }
                                                                                                                    throw new NullPointerException(str);
                                                                                                                }
                                                                                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                                                                                            }
                                                                                                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                                                        }
                                                                                                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                                                    }
                                                                                                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                                                }
                                                                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                                                                            }
                                                                                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                                        }
                                                                                        throw new NullPointerException(str2);
                                                                                    }
                                                                                    throw new NullPointerException(str2);
                                                                                }
                                                                                throw new NullPointerException(str);
                                                                            }
                                                                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                                        }
                                                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                                                    }
                                                                    throw new NullPointerException(str2);
                                                                }
                                                                throw new NullPointerException(str);
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
                                                }
                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public void K() {
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/F6", "Landroid/view/View$OnAttachStateChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f264545b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f264546c;

        public p(View view, o oVar) {
            this.f264545b = view;
            this.f264546c = oVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            this.f264545b.removeOnAttachStateChangeListener(this);
            view.removeCallbacks(this.f264546c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClientProvidedNavigation$lambda$53(View view) {
    }

    public void setMenuTintColor(@InterfaceC42158n int i12) {
    }

    public void setMenuTintColorAttr(@InterfaceC42150f int i12) {
    }
}
