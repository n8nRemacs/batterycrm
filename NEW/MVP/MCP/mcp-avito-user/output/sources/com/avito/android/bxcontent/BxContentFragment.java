package com.avito.android.bxcontent;

import Aw0.InterfaceC13094a;
import Ax.InterfaceC13095a;
import Cd.C13243a;
import Cm0.InterfaceC13326c;
import Db.InterfaceC13381a;
import Ig.InterfaceC14102a;
import Ju.InterfaceC14249c;
import Lg.InterfaceC14390a;
import Nr0.InterfaceC14605a;
import WQ.a;
import Zd.InterfaceC19542a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import ak.C19902a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.core.view.C22823h0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.P0;
import bY.InterfaceC25585b;
import cU0.C27106d;
import com.adjust.sdk.Constants;
import com.avito.android.B2;
import com.avito.android.C31100l2;
import com.avito.android.C34160q2;
import com.avito.android.C36135w2;
import com.avito.android.ab_tests.configs.AutoFilterHintToastTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.BxContentScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.HomeScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.SearchMapScreen;
import com.avito.android.analytics.screens.SerpScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.bottom_navigation.InterfaceC28880b;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.beduin_v2.di.a;
import com.avito.android.bxcontent.call.DialogsAfterCallState;
import com.avito.android.bxcontent.di.a;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.bxcontent.mvi.entity.ItemsSearchLinkHandleForceType;
import com.avito.android.deal_confirmation.sheet.DealConfirmationSheetActivity;
import com.avito.android.deep_linking.links.CategoriesLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.esia_redirect_screen.EsiaRedirectDeeplink;
import com.avito.android.gig_shift_cancel.GigShiftCancelDeeplink;
import com.avito.android.gig_shift_start.GigShiftStartDeeplink;
import com.avito.android.home.appending_item.retry.AppendingRetryItem;
import com.avito.android.home.tabs_item.c;
import com.avito.android.inline_filters.C31050j;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.category_nodes.CategoryTreeLink;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.location.LocationInteractorState;
import com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup;
import com.avito.android.map.MapArguments;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map.view.C31642f;
import com.avito.android.ownership.Owners;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.model.HomeTabItem;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceTypeKt;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup;
import com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.saved_searches.analytics.SavedSearchEntryPointType;
import com.avito.android.saved_searches.deeplinks.SearchSubscriptionControlLink;
import com.avito.android.search.filter.link.show.FiltersShowLink;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import com.avito.android.search_ux_feedback.SearchFeedbackCampaign;
import com.avito.android.search_view.ShareButtonEvent;
import com.avito.android.select.Arguments;
import com.avito.android.serp.adapter.InterfaceC34689c;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import com.avito.android.serp.adapter.search_bar.InterfaceC34822a;
import com.avito.android.serp.adapter.search_bar.InterfaceC34826e;
import com.avito.android.serp.adapter.snippet.SnippetItem;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.publish.VerticalPublishState;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.VerticalFilterState;
import com.avito.android.serp.warning.WarningStateProviderState;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.adapter.ClarifyButtonItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItemImpl;
import com.avito.android.shortcut_navigation_bar.adapter.SkeletonItem;
import com.avito.android.shortcut_navigation_bar.adapter.TagShortcutItem;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import com.avito.android.util.C35838l3;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35967w2;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import com.avito.android.util.V2;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.android.widget_filters.deeplink.WidgetFiltersLink;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.google.android.exoplayer2.source.y;
import fY.InterfaceC40372a;
import gj.o;
import i.AbstractC41201a;
import iT.C41343c;
import iT.InterfaceC41341a;
import iT.InterfaceC41342b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import lD.C43617a;
import nI.InterfaceC44259a;
import nl.InterfaceC44438a;
import nl.InterfaceC44440c;
import oW.InterfaceC44697a;
import ob.C44742f;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import qK0.C47311a;
import qK0.C47313c;
import rl.C47677a;
import sN0.InterfaceC48080b;
import shark.AndroidResourceIdNames;
import ur.InterfaceC49101b;
import z1.AbstractC50339a;

/* compiled from: BxContentFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/bxcontent/BxContentFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/e;", "Lcom/avito/android/ui/a;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/bottom_navigation/ui/fragment/l;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lgj/i;", "Lcom/avito/android/select/p;", "Lcom/avito/android/bottom_navigation/b;", "LFV0/c;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes12.dex */
public final class BxContentFragment extends TabBaseFragment implements com.avito.android.bottom_navigation.ui.fragment.e, com.avito.android.ui.a, com.avito.android.ui.fragments.c, InterfaceC28477j.b, com.avito.android.bottom_navigation.ui.fragment.l, com.avito.android.bottom_navigation.ui.fragment.g, gj.i, com.avito.android.select.p, InterfaceC28880b, FV0.c, com.avito.beduin.v2.interaction.detached.flow.b, com.avito.android.ui.status_bar.a {

    /* renamed from: v5, reason: collision with root package name */
    @Y61.k
    public static final C28907a f108886v5;

    /* renamed from: w5, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f108887w5;

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public GridLayoutManager.c f108888A0;

    /* renamed from: A3, reason: collision with root package name */
    @Inject
    public com.avito.android.home.appending_item.retry.f f108889A3;

    /* renamed from: A4, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.serp.a f108890A4;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.Y0 f108891B0;

    /* renamed from: B3, reason: collision with root package name */
    @Inject
    public com.avito.android.deep_linking.x f108892B3;

    /* renamed from: B4, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f108893B4;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f108894C0;

    /* renamed from: C3, reason: collision with root package name */
    @Inject
    public com.avito.android.saved_searches.analytics.d f108895C3;

    /* renamed from: C4, reason: collision with root package name */
    @Inject
    public u3.l<AutoFilterHintToastTestGroup> f108896C4;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f108897D0;

    /* renamed from: D3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.U0 f108898D3;

    /* renamed from: D4, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.search_bar_promo_widget.d f108899D4;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.deal_confirmation.sheet.j f108900E0;

    /* renamed from: E3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.vertical_main.featured.action.f f108901E3;

    /* renamed from: E4, reason: collision with root package name */
    @Inject
    public com.avito.android.hero_banner.widget.g f108902E4;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.avito_blog.article_screen.ui.b f108903F0;

    /* renamed from: F3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs.d f108904F3;

    /* renamed from: F4, reason: collision with root package name */
    @Inject
    public InterfaceC44259a f108905F4;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f108906G0;

    /* renamed from: G3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.vertical_main.featured.navigation.chips.d f108907G3;

    /* renamed from: G4, reason: collision with root package name */
    @Inject
    public u3.l<ShowTicketEntryTestGroup> f108908G4;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.rubricator.list.category.e f108909H0;

    /* renamed from: H1, reason: collision with root package name */
    @Inject
    public com.avito.android.scroll_tracker.d f108910H1;

    /* renamed from: H2, reason: collision with root package name */
    @Inject
    public ProgressInfoToastBarPresenter f108911H2;

    /* renamed from: H3, reason: collision with root package name */
    @Inject
    public com.avito.android.permissions.q f108912H3;

    /* renamed from: H4, reason: collision with root package name */
    @Inject
    public u3.l<LoyaltyProgramTestGroup> f108913H4;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f108914I0;

    /* renamed from: I3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.toolbar_helper.a f108915I3;

    /* renamed from: I4, reason: collision with root package name */
    @Inject
    public u3.h<OctoberRewardTestGroup> f108916I4;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.floating_views.f f108917J0;

    /* renamed from: J3, reason: collision with root package name */
    @Inject
    public InterfaceC44438a f108918J3;

    /* renamed from: J4, reason: collision with root package name */
    @Inject
    public SK0.b f108919J4;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f108920K0;

    /* renamed from: K3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.slider.g f108921K3;

    /* renamed from: K4, reason: collision with root package name */
    @Inject
    public com.avito.android.pinch_to_zoom.b f108922K4;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.kebab.f f108923L0;

    /* renamed from: L3, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.d<com.avito.android.serp.adapter.location_notification.a> f108924L3;

    /* renamed from: L4, reason: collision with root package name */
    @Inject
    public com.avito.android.account.E f108925L4;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.n1 f108926M0;

    /* renamed from: M3, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.d<com.avito.android.serp.adapter.location_notification.a> f108927M3;

    /* renamed from: M4, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N f108928M4;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.T f108929N0;

    /* renamed from: N3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.T0 f108930N3;

    /* renamed from: N4, reason: collision with root package name */
    @Inject
    public com.avito.android.home.o f108931N4;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public InterfaceC29247r0 f108932O0;

    /* renamed from: O3, reason: collision with root package name */
    @Inject
    public ProgressInfoToastBar.a f108933O3;

    /* renamed from: O4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_favorites_toast.a f108934O4;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public com.avito.android.home.tabs_item.c f108935P0;

    /* renamed from: P2, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.a f108936P2;

    /* renamed from: P3, reason: collision with root package name */
    @Inject
    public C34160q2 f108937P3;

    /* renamed from: P4, reason: collision with root package name */
    @Inject
    public InterfaceC49101b f108938P4;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public com.avito.android.home.tags_item.d f108939Q0;

    /* renamed from: Q2, reason: collision with root package name */
    @Inject
    public C29241p f108940Q2;

    /* renamed from: Q3, reason: collision with root package name */
    @Inject
    public InterfaceC40372a f108941Q3;

    /* renamed from: Q4, reason: collision with root package name */
    @Inject
    public C43617a f108942Q4;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.serp.k> f108943R0;

    /* renamed from: R2, reason: collision with root package name */
    @Inject
    public Ax.e f108944R2;

    /* renamed from: R3, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.f f108945R3;

    /* renamed from: R4, reason: collision with root package name */
    @Y61.k
    public NavigationState f108946R4;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public h31.e<InterfaceC35741a1> f108947S0;

    /* renamed from: S2, reason: collision with root package name */
    @Inject
    public com.avito.android.deal_confirmation.d f108948S2;

    /* renamed from: S3, reason: collision with root package name */
    @Inject
    public com.avito.android.search_view.m f108949S3;

    /* renamed from: S4, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f108950S4;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.closable.c f108951T0;

    /* renamed from: T2, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.analytics.a f108952T2;

    /* renamed from: T3, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Integer>> f108953T3;

    /* renamed from: T4, reason: collision with root package name */
    @Inject
    public com.avito.android.ticket_view.mvi.o f108954T4;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public h31.e<La.j> f108955U0;

    /* renamed from: U2, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f108956U2;

    /* renamed from: U3, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Integer>> f108957U3;

    /* renamed from: U4, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f108958U4;

    /* renamed from: V0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.home.default_search_location.f> f108959V0;

    /* renamed from: V2, reason: collision with root package name */
    @Inject
    public h31.e<InterfaceC35845m2> f108960V2;

    /* renamed from: V3, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Boolean>> f108961V3;

    /* renamed from: V4, reason: collision with root package name */
    @Inject
    public CX.c f108962V4;

    /* renamed from: W0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.advert_xl.z f108963W0;

    /* renamed from: W2, reason: collision with root package name */
    @Inject
    public InterfaceC34822a f108964W2;

    /* renamed from: W3, reason: collision with root package name */
    @Inject
    public com.avito.android.video_snippets.g f108965W3;

    /* renamed from: W4, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f108966W4;

    /* renamed from: X0, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.call.a f108967X0;

    /* renamed from: X1, reason: collision with root package name */
    @Inject
    public com.avito.android.scroll_tracker.i f108968X1;

    /* renamed from: X2, reason: collision with root package name */
    @Inject
    public InterfaceC34826e f108969X2;

    /* renamed from: X3, reason: collision with root package name */
    @Inject
    public InterfaceC48080b f108970X3;

    /* renamed from: X4, reason: collision with root package name */
    @Inject
    public InterfaceC13326c f108971X4;

    /* renamed from: Y0, reason: collision with root package name */
    @Inject
    public InterfaceC28616b f108972Y0;

    /* renamed from: Y2, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.search_bar.O f108973Y2;

    /* renamed from: Y3, reason: collision with root package name */
    @Inject
    public InterfaceC14605a f108974Y3;

    /* renamed from: Y4, reason: collision with root package name */
    @Inject
    public com.avito.android.L f108975Y4;

    /* renamed from: Z0, reason: collision with root package name */
    @Inject
    public com.avito.android.async_phone.A f108976Z0;

    /* renamed from: Z2, reason: collision with root package name */
    @Inject
    public Rp0.b f108977Z2;

    /* renamed from: Z3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.closable.a f108978Z3;

    /* renamed from: Z4, reason: collision with root package name */
    @Inject
    public WQ.c f108979Z4;

    /* renamed from: a1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.constructor.A f108980a1;

    /* renamed from: a3, reason: collision with root package name */
    @Inject
    public com.avito.android.location.find.o f108981a3;

    /* renamed from: a4, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.suggest_address.h f108982a4;

    /* renamed from: a5, reason: collision with root package name */
    @Inject
    public com.avito.android.replace_main.toast.b f108983a5;

    /* renamed from: b1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.rich_snippets.j f108984b1;

    /* renamed from: b3, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.map.view.u> f108985b3;

    /* renamed from: b4, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.action_promo_banner.f f108986b4;

    /* renamed from: b5, reason: collision with root package name */
    @Inject
    public com.avito.android.snippet.video.m f108987b5;

    /* renamed from: c1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.warning.g f108988c1;

    /* renamed from: c3, reason: collision with root package name */
    @Inject
    public B2 f108989c3;

    /* renamed from: c4, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.replace_main_widget.j f108990c4;

    /* renamed from: c5, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f108991c5;

    /* renamed from: d1, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.adapter.items.buzzoola.premium.r f108992d1;

    /* renamed from: d3, reason: collision with root package name */
    @Inject
    public C36135w2 f108993d3;

    /* renamed from: d4, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f108994d4;

    /* renamed from: d5, reason: collision with root package name */
    @Y61.k
    public final C47311a f108995d5;

    /* renamed from: e1, reason: collision with root package name */
    @Inject
    public InterfaceC31062w f108996e1;

    /* renamed from: e3, reason: collision with root package name */
    @Inject
    public U20.d f108997e3;

    /* renamed from: e4, reason: collision with root package name */
    @Inject
    public C47677a f108998e4;

    /* renamed from: e5, reason: collision with root package name */
    @Y61.k
    public final C47313c f108999e5;

    /* renamed from: f1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.witcher.r f109000f1;

    /* renamed from: f3, reason: collision with root package name */
    @Inject
    public U20.c f109001f3;

    /* renamed from: f4, reason: collision with root package name */
    @Inject
    public com.avito.android.delayed_ux_feedback.d f109002f4;

    /* renamed from: f5, reason: collision with root package name */
    @Y61.l
    public com.avito.android.serp.adapter.search_bar.M f109003f5;

    /* renamed from: g1, reason: collision with root package name */
    @Inject
    public InterfaceC34782e f109004g1;

    /* renamed from: g3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.analytics.g f109005g3;

    /* renamed from: g4, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite_apprater.g f109006g4;

    /* renamed from: g5, reason: collision with root package name */
    @Y61.l
    public fG0.d f109007g5;

    /* renamed from: h1, reason: collision with root package name */
    @Inject
    public InterfaceC34689c f109008h1;

    /* renamed from: h3, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.map.view.adverts_in_pin.a> f109009h3;

    /* renamed from: h4, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.vertical_main.featured.header.e f109010h4;

    /* renamed from: h5, reason: collision with root package name */
    @Y61.l
    public C31642f f109011h5;

    /* renamed from: i1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.sale_advert_item.c f109012i1;

    /* renamed from: i3, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.map.view.adverts_in_pin.b> f109013i3;

    /* renamed from: i4, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.adapter.items.buzzoola.video.j f109014i4;

    /* renamed from: i5, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f109015i5;

    /* renamed from: j1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.reformulations.j f109016j1;

    /* renamed from: j3, reason: collision with root package name */
    @Inject
    public InterfaceC30999b f109017j3;

    /* renamed from: j4, reason: collision with root package name */
    @Inject
    public h31.e<y.a> f109018j4;

    /* renamed from: j5, reason: collision with root package name */
    @Y61.k
    public final Handler f109019j5;

    /* renamed from: k1, reason: collision with root package name */
    @Inject
    public com.avito.android.rubricator.e f109020k1;

    /* renamed from: k3, reason: collision with root package name */
    @Inject
    public com.avito.android.inline_filters.dialog.z f109021k3;

    /* renamed from: k4, reason: collision with root package name */
    @Inject
    public e70.j f109022k4;

    /* renamed from: k5, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f109023k5;

    /* renamed from: l1, reason: collision with root package name */
    @Inject
    public com.avito.android.stories.adapter.k f109024l1;

    /* renamed from: l3, reason: collision with root package name */
    @Inject
    public com.avito.android.select.i f109025l3;

    /* renamed from: l4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.viewed.d f109026l4;

    /* renamed from: l5, reason: collision with root package name */
    @Y61.k
    public final Object f109027l5;

    /* renamed from: m1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.carousel_widget.I f109028m1;

    /* renamed from: m3, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f109029m3;

    /* renamed from: m4, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.l f109030m4;

    /* renamed from: m5, reason: collision with root package name */
    @Y61.k
    public final Object f109031m5;

    /* renamed from: n1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.vertical_main.usp_banner_widget.g f109032n1;

    /* renamed from: n3, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f109033n3;

    /* renamed from: n4, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.i f109034n4;

    /* renamed from: n5, reason: collision with root package name */
    @Y61.k
    public final Object f109035n5;

    /* renamed from: o1, reason: collision with root package name */
    @Inject
    public com.avito.android.stories.t f109036o1;

    /* renamed from: o3, reason: collision with root package name */
    @Inject
    public com.avito.android.J0 f109037o3;

    /* renamed from: o4, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.loaders.n f109038o4;

    /* renamed from: o5, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f109039o5;

    /* renamed from: p1, reason: collision with root package name */
    @Inject
    public rs0.c f109040p1;

    /* renamed from: p3, reason: collision with root package name */
    @Inject
    public gj.n f109041p3;

    /* renamed from: p4, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.loaders.event_service.c f109042p4;

    /* renamed from: p5, reason: collision with root package name */
    @Y61.k
    public final HashMap f109043p5;

    /* renamed from: q1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.brandspace_widget.i f109044q1;

    /* renamed from: q3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.a f109045q3;

    /* renamed from: q4, reason: collision with root package name */
    @Inject
    public BannerPageSource f109046q4;

    /* renamed from: q5, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<kotlin.G0> f109047q5;

    /* renamed from: r1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.vertical_main.p f109048r1;

    /* renamed from: r3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.a f109049r3;

    /* renamed from: r4, reason: collision with root package name */
    @Inject
    public InterfaceC13381a f109050r4;

    /* renamed from: r5, reason: collision with root package name */
    @Y61.k
    public final c1 f109051r5;

    /* renamed from: s1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.vertical_main.q f109052s1;

    /* renamed from: s3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.a f109053s3;

    /* renamed from: s4, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.adapter.items.web.c f109054s4;

    @Y61.k
    public final d1 s5;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.arch.mvi.b<BxContentInternalAction> f109055t0;

    /* renamed from: t1, reason: collision with root package name */
    @Inject
    public InterfaceC13095a f109056t1;

    /* renamed from: t3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.a f109057t3;

    /* renamed from: t4, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.feature.item.b f109058t4;

    /* renamed from: t5, reason: collision with root package name */
    @Y61.l
    public C29255u f109059t5;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.arch.mvi.b<MapInternalAction> f109060u0;

    /* renamed from: u3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.mini_menu.h f109061u3;

    /* renamed from: u4, reason: collision with root package name */
    @Inject
    public InterfaceC13094a f109062u4;

    /* renamed from: u5, reason: collision with root package name */
    @Y61.l
    public View.OnAttachStateChangeListener f109063u5;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f109064v0;

    /* renamed from: v3, reason: collision with root package name */
    @Inject
    public com.avito.android.visual_rubricator.Q f109065v3;

    /* renamed from: v4, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.utils.d f109066v4;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.bx_beduin_native_items.c f109067w0;

    /* renamed from: w3, reason: collision with root package name */
    @Inject
    public C31050j f109068w3;

    /* renamed from: w4, reason: collision with root package name */
    @Inject
    public com.avito.android.app_rater.b f109069w4;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.h1 f109070x0;

    /* renamed from: x3, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.e f109071x3;

    /* renamed from: x4, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f109072x4;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f109073y0;

    /* renamed from: y3, reason: collision with root package name */
    @Inject
    public com.avito.android.bxcontent.shared_listeners.a f109074y3;

    /* renamed from: y4, reason: collision with root package name */
    @Inject
    public Screen f109075y4;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> f109076z0;

    /* renamed from: z3, reason: collision with root package name */
    @Inject
    public Zp0.d f109077z3;

    /* renamed from: z4, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.analytics.widgets_tracker.g f109078z4;

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$19", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class A extends SuspendLambda implements Y41.p<kotlin.Q<? extends List<? extends Integer>, ? extends List<? extends Integer>>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109079q;

        public A(Continuation<? super A> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            A a12 = BxContentFragment.this.new A(continuation);
            a12.f109079q = obj;
            return a12;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends List<? extends Integer>, ? extends List<? extends Integer>> q12, Continuation<? super kotlin.G0> continuation) {
            return ((A) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlin.Q q12 = (kotlin.Q) this.f109079q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.p0(q12));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$A0", "Lcom/avito/android/home/appending_item/retry/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class A0 implements com.avito.android.home.appending_item.retry.j {
        public A0() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/bxcontent/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/bxcontent/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A1 extends kotlin.jvm.internal.N implements Y41.a<C29235n> {
        public A1() {
            super(0);
        }

        @Override // Y41.a
        public final C29235n invoke() {
            C29241p c29241p = BxContentFragment.this.f108940Q2;
            if (c29241p == null) {
                c29241p = null;
            }
            return (C29235n) c29241p.get();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class B extends kotlin.jvm.internal.H implements Y41.l<Object, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(Object obj) {
            ((C29235n) this.receiver).accept(obj);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$73", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class B0 extends SuspendLambda implements Y41.p<Boolean, Continuation<? super kotlin.G0>, Object> {
        public B0(Continuation<? super B0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BxContentFragment.this.new B0(continuation);
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super kotlin.G0> continuation) {
            return ((B0) create(bool, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Result result;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            BxContentFragment bxContentFragment = BxContentFragment.this;
            InterfaceC31062w interfaceC31062w = bxContentFragment.f108996e1;
            Filter actionHorizontalBlock = null;
            if (interfaceC31062w == null) {
                interfaceC31062w = null;
            }
            interfaceC31062w.s1();
            C29235n c29235nZ5 = bxContentFragment.Z5();
            InterfaceC31062w interfaceC31062w2 = bxContentFragment.f108996e1;
            if (interfaceC31062w2 == null) {
                interfaceC31062w2 = null;
            }
            InlineFilters inlineFiltersU1 = interfaceC31062w2.getF172427u();
            if (inlineFiltersU1 != null && (result = inlineFiltersU1.getResult()) != null) {
                actionHorizontalBlock = result.getActionHorizontalBlock();
            }
            c29235nZ5.accept(new InterfaceC29127b.C3300b(actionHorizontalBlock));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006* \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$20", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.Q<? extends List<? extends Integer>, ? extends List<? extends Integer>>>, Throwable, Continuation<? super kotlin.G0>, Object> {
        public C() {
            super(3, null);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.Q<? extends List<? extends Integer>, ? extends List<? extends Integer>>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            return new C(3, continuation).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.d("BxContent", "Error big visual rubricator visibility stream");
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$74", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0 extends SuspendLambda implements Y41.p<kotlin.Q<? extends DeepLink, ? extends Boolean>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109084q;

        public C0(Continuation<? super C0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C0 c02 = BxContentFragment.this.new C0(continuation);
            c02.f109084q = obj;
            return c02;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends DeepLink, ? extends Boolean> q12, Continuation<? super kotlin.G0> continuation) {
            return ((C0) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.internal.w] */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Result result;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink deepLink = (DeepLink) ((kotlin.Q) this.f109084q).f406619b;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            bxContentFragment.K5().aQ();
            boolean z12 = false;
            DeepLink deepLinkC6 = bxContentFragment.c6(deepLink, false);
            C29235n c29235nZ5 = bxContentFragment.Z5();
            InterfaceC31062w interfaceC31062w = bxContentFragment.f108996e1;
            Filter actionHorizontalBlock = 0;
            actionHorizontalBlock = 0;
            if (interfaceC31062w == null) {
                interfaceC31062w = null;
            }
            c29235nZ5.accept(new InterfaceC29127b.C29163w(deepLinkC6, interfaceC31062w.W0(), false, null, 12, null));
            bxContentFragment.Z5().accept(new InterfaceC25585b.C25592h(deepLinkC6, z12, 2, actionHorizontalBlock));
            C29235n c29235nZ52 = bxContentFragment.Z5();
            InterfaceC31062w interfaceC31062w2 = bxContentFragment.f108996e1;
            if (interfaceC31062w2 == null) {
                interfaceC31062w2 = null;
            }
            InlineFilters inlineFiltersU1 = interfaceC31062w2.getF172427u();
            if (inlineFiltersU1 != null && (result = inlineFiltersU1.getResult()) != null) {
                actionHorizontalBlock = result.getActionHorizontalBlock();
            }
            c29235nZ52.accept(new InterfaceC29127b.C3300b(actionHorizontalBlock));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$D", "Lcom/avito/android/bxcontent/vertical_toolbar/vertical_filter_toolbar/g;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class D implements com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.g {
        public D() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$75", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class D0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.Q<? extends DeepLink, ? extends Boolean>>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109087q;

        public D0(Continuation<? super D0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.Q<? extends DeepLink, ? extends Boolean>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            D0 d02 = BxContentFragment.this.new D0(continuation);
            d02.f109087q = th2;
            return d02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109087q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$E", "Lcom/avito/android/bxcontent/vertical_toolbar/vertical_mini_search_toolbar/h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class E implements com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.h {
        public E() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$76", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class E0 extends SuspendLambda implements Y41.p<Filter.AutoShowPresetFiltersDialog, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109090q;

        public E0(Continuation<? super E0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            E0 e02 = BxContentFragment.this.new E0(continuation);
            e02.f109090q = obj;
            return e02;
        }

        @Override // Y41.p
        public final Object invoke(Filter.AutoShowPresetFiltersDialog autoShowPresetFiltersDialog, Continuation<? super kotlin.G0> continuation) {
            return ((E0) create(autoShowPresetFiltersDialog, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Filter.AutoShowPresetFiltersDialog autoShowPresetFiltersDialog = (Filter.AutoShowPresetFiltersDialog) this.f109090q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.X(autoShowPresetFiltersDialog));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$F", "Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class F implements com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.k {
        public F() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$77", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class F0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Filter.AutoShowPresetFiltersDialog>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109093q;

        public F0(Continuation<? super F0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Filter.AutoShowPresetFiltersDialog> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            F0 f02 = BxContentFragment.this.new F0(continuation);
            f02.f109093q = th2;
            return f02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109093q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$G", "Lcom/avito/android/bxcontent/search_bar_promo_widget/g;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class G implements com.avito.android.bxcontent.search_bar_promo_widget.g {
        public G() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "filterId", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$78", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class G0 extends SuspendLambda implements Y41.p<String, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109096q;

        public G0(Continuation<? super G0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            G0 g02 = BxContentFragment.this.new G0(continuation);
            g02.f109096q = obj;
            return g02;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super kotlin.G0> continuation) {
            return ((G0) create(str, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f109096q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.T(str));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$H", "Lcom/avito/android/hero_banner/widget/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class H implements com.avito.android.hero_banner.widget.j {
        public H() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$79", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class H0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super String>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109099q;

        public H0(Continuation<? super H0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super String> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            H0 h02 = BxContentFragment.this.new H0(continuation);
            h02.f109099q = th2;
            return h02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109099q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$I", "Lcom/avito/android/bxcontent/vertical_toolbar/transportation_services_toolbar/g;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class I implements com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.g {
        public I() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$7", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class I0 extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<? super kotlin.G0>, Object> {
        public I0() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new I0(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            return ((I0) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class J extends kotlin.jvm.internal.H implements Y41.a<Integer> {
        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(((com.avito.android.bxcontent.Y0) this.receiver).ml());
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$80", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class J0 extends SuspendLambda implements Y41.p<InlineFiltersGeo, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109102q;

        public J0(Continuation<? super J0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            J0 j02 = BxContentFragment.this.new J0(continuation);
            j02.f109102q = obj;
            return j02;
        }

        @Override // Y41.p
        public final Object invoke(InlineFiltersGeo inlineFiltersGeo, Continuation<? super kotlin.G0> continuation) {
            return ((J0) create(inlineFiltersGeo, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = ((InlineFiltersGeo) this.f109102q).f283362a;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            com.avito.android.bxcontent.analytics.a aVar = bxContentFragment.f108952T2;
            if (aVar == null) {
                aVar = null;
            }
            aVar.W(bxContentFragment.Z5().f112645M.a().f112345l.getCategoryId());
            bxContentFragment.Z5().accept(new InterfaceC29127b.T(str));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "iconType", "fromPage", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class K extends kotlin.jvm.internal.N implements Y41.p<String, String, kotlin.G0> {
        public K() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(String str, String str2) {
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.V(str, str2, null, 4, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$81", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class K0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InlineFiltersGeo>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109105q;

        public K0(Continuation<? super K0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InlineFiltersGeo> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            K0 k02 = BxContentFragment.this.new K0(continuation);
            k02.f109105q = th2;
            return k02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109105q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(new Exception(th2), null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/e;", "widgetAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/analytics/widgets_tracker/e;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$29", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class L extends SuspendLambda implements Y41.p<com.avito.android.serp.analytics.widgets_tracker.e, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109107q;

        public L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            L l12 = BxContentFragment.this.new L(continuation);
            l12.f109107q = obj;
            return l12;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.serp.analytics.widgets_tracker.e eVar, Continuation<? super kotlin.G0> continuation) {
            return ((L) create(eVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.analytics.widgets_tracker.e eVar = (com.avito.android.serp.analytics.widgets_tracker.e) this.f109107q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.t0(eVar));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$82", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class L0 extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<? super kotlin.G0>, Object> {
        public L0(Continuation<? super L0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BxContentFragment.this.new L0(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            return ((L0) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC29247r0 interfaceC29247r0 = BxContentFragment.this.f108932O0;
            if (interfaceC29247r0 == null) {
                interfaceC29247r0 = null;
            }
            SavedSearchEntryPointType savedSearchEntryPointType = SavedSearchEntryPointType.f258243c;
            interfaceC29247r0.p("underInlines");
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/serp/analytics/widgets_tracker/e;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$30", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class M extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.serp.analytics.widgets_tracker.e>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109110q;

        public M() {
            super(3, null);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.serp.analytics.widgets_tracker.e> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            M m12 = new M(3, continuation);
            m12.f109110q = th2;
            return m12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("BxContent", "Error widgets action tracker collect", this.f109110q);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$83", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class M0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.G0>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109111q;

        public M0(Continuation<? super M0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.G0> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            M0 m02 = BxContentFragment.this.new M0(continuation);
            m02.f109111q = th2;
            return m02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109111q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$B;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/b$B;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$35", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class N extends SuspendLambda implements Y41.p<InterfaceC29127b.B, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109113q;

        public N(Continuation<? super N> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            N n12 = BxContentFragment.this.new N(continuation);
            n12.f109113q = obj;
            return n12;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC29127b.B b12, Continuation<? super kotlin.G0> continuation) {
            return ((N) create(b12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC29127b.B b12 = (InterfaceC29127b.B) this.f109113q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(b12);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "item", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$84", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class N0 extends SuspendLambda implements Y41.p<ShortcutNavigationItem, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109115q;

        public N0(Continuation<? super N0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            N0 n02 = BxContentFragment.this.new N0(continuation);
            n02.f109115q = obj;
            return n02;
        }

        @Override // Y41.p
        public final Object invoke(ShortcutNavigationItem shortcutNavigationItem, Continuation<? super kotlin.G0> continuation) {
            return ((N0) create(shortcutNavigationItem, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Filter.Widget widget;
            Filter.Config config;
            SearchParams searchParams;
            SearchParams searchParams2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ShortcutNavigationItem shortcutNavigationItem = (ShortcutNavigationItem) this.f109115q;
            boolean z12 = shortcutNavigationItem instanceof ShortcutNavigationItemImpl ? true : shortcutNavigationItem instanceof TagShortcutItem;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            Integer categoryId = null;
            if (z12) {
                if (shortcutNavigationItem.getF283245d() instanceof CategoriesLink) {
                    C28907a c28907a = BxContentFragment.f108886v5;
                    bxContentFragment.Z5().accept(InterfaceC29127b.x0.f112185a);
                } else {
                    C28907a c28907a2 = BxContentFragment.f108886v5;
                    bxContentFragment.Z5().accept(new InterfaceC29127b.B(shortcutNavigationItem.getF283245d(), null, null, ItemsSearchLinkHandleForceType.f112038b, null, 22, null));
                    com.avito.android.bxcontent.analytics.a aVar = bxContentFragment.f108952T2;
                    com.avito.android.bxcontent.analytics.a aVar2 = aVar != null ? aVar : null;
                    String f283254e = shortcutNavigationItem.getF283244c();
                    DeepLink f283231f = shortcutNavigationItem.getF283245d();
                    ItemsSearchLink itemsSearchLink = f283231f instanceof ItemsSearchLink ? (ItemsSearchLink) f283231f : null;
                    String categoryId2 = (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) ? null : searchParams.getCategoryId();
                    com.avito.android.map.mvi.entity.a aVarB = bxContentFragment.Z5().f112645M.b();
                    aVar2.G(f283254e, categoryId2, (52 & 8) != 0 ? null : aVarB != null ? aVarB.f185157h : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null, bxContentFragment.Z5().f112645M.a().f112306I);
                }
                Rp0.b bVar = bxContentFragment.f108977Z2;
                if (bVar == null) {
                    bVar = null;
                }
                DeepLink f283231f2 = shortcutNavigationItem.getF283245d();
                ItemsSearchLink itemsSearchLink2 = f283231f2 instanceof ItemsSearchLink ? (ItemsSearchLink) f283231f2 : null;
                bVar.a(new SearchFeedbackCampaign.g((itemsSearchLink2 == null || (searchParams2 = itemsSearchLink2.f133403b) == null) ? null : searchParams2.getCategoryId(), null));
            } else if (shortcutNavigationItem instanceof InlineFilterNavigationItem) {
                InlineFilterNavigationItem inlineFilterNavigationItem = (InlineFilterNavigationItem) shortcutNavigationItem;
                boolean z13 = inlineFilterNavigationItem.f283235j;
                Filter filter = inlineFilterNavigationItem.f283232g;
                if (z13) {
                    com.avito.android.bxcontent.analytics.a aVar3 = bxContentFragment.f108952T2;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    if (filter != null) {
                        filter.getTitle();
                    }
                    if (filter != null && (widget = filter.getWidget()) != null && (config = widget.getConfig()) != null) {
                        categoryId = config.getCategoryId();
                    }
                    aVar3.c0(categoryId, inlineFilterNavigationItem.f283228c);
                }
                C28907a c28907a3 = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(new InterfaceC29127b.S(filter));
            } else if (shortcutNavigationItem instanceof ClarifyButtonItem) {
                C28907a c28907a4 = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(new InterfaceC29127b.V(((ClarifyButtonItem) shortcutNavigationItem).f283217e, null, null, 6, null));
            } else {
                boolean z14 = shortcutNavigationItem instanceof SkeletonItem;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/b$B;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$36", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class O extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC29127b.B>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109117q;

        public O(Continuation<? super O> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC29127b.B> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            O o12 = BxContentFragment.this.new O(continuation);
            o12.f109117q = th2;
            return o12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109117q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$85", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class O0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ShortcutNavigationItem>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109119q;

        public O0(Continuation<? super O0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ShortcutNavigationItem> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            O0 o02 = BxContentFragment.this.new O0(continuation);
            o02.f109119q = th2;
            return o02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109119q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/home_section_tab/SectionTag;", "tag", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/adapter/home_section_tab/SectionTag;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$37", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class P extends SuspendLambda implements Y41.p<SectionTag, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109121q;

        public P(Continuation<? super P> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            P p12 = BxContentFragment.this.new P(continuation);
            p12.f109121q = obj;
            return p12;
        }

        @Override // Y41.p
        public final Object invoke(SectionTag sectionTag, Continuation<? super kotlin.G0> continuation) {
            return ((P) create(sectionTag, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            SectionTag sectionTag = (SectionTag) this.f109121q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            C29235n c29235nZ5 = bxContentFragment.Z5();
            String str = sectionTag.f270145c;
            String str2 = sectionTag.f270147e;
            if (str2.length() <= 0) {
                str2 = null;
            }
            c29235nZ5.accept(new InterfaceC29127b.C29128a(str, str2));
            bxContentFragment.K5().xZ(sectionTag.f270145c);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/shortcut_navigation_bar/adapter/SectionTagPayload;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$86", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class P0 extends SuspendLambda implements Y41.p<kotlin.Q<? extends String, ? extends SectionTagPayload>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109123q;

        /* compiled from: BxContentFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ BxContentFragment f109125l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BxContentFragment bxContentFragment) {
                super(0);
                this.f109125l = bxContentFragment;
            }

            @Override // Y41.a
            public final kotlin.G0 invoke() {
                BxContentFragment bxContentFragment = this.f109125l;
                com.avito.android.floating_views.f fVar = bxContentFragment.f108917J0;
                if (fVar == null) {
                    fVar = null;
                }
                fVar.c(bxContentFragment.K5());
                return kotlin.G0.f406611a;
            }
        }

        public P0(Continuation<? super P0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            P0 p02 = BxContentFragment.this.new P0(continuation);
            p02.f109123q = obj;
            return p02;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends String, ? extends SectionTagPayload> q12, Continuation<? super kotlin.G0> continuation) {
            return ((P0) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlin.Q q12 = (kotlin.Q) this.f109123q;
            String str = (String) q12.f406619b;
            SectionTagPayload sectionTagPayload = (SectionTagPayload) q12.f406620c;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            com.avito.android.floating_views.f fVar = bxContentFragment.f108917J0;
            (fVar != null ? fVar : null).f(0, 1, 0, 0, 0);
            com.avito.android.floating_views.f fVar2 = bxContentFragment.f108917J0;
            if (fVar2 == null) {
                fVar2 = null;
            }
            fVar2.b();
            bxContentFragment.K5().lU();
            bxContentFragment.K5().mV(0, new a(bxContentFragment));
            C29235n c29235nZ5 = bxContentFragment.Z5();
            String str2 = sectionTagPayload.f283239b;
            String str3 = sectionTagPayload.f283240c;
            if (str3.length() <= 0) {
                str3 = null;
            }
            c29235nZ5.accept(new InterfaceC29127b.C29128a(str2, str3));
            com.avito.android.serp.analytics.widgets_tracker.g gVar = bxContentFragment.f109078z4;
            (gVar != null ? gVar : null).k(str, "sticky");
            bxContentFragment.K5().xZ(sectionTagPayload.f283239b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/serp/adapter/home_section_tab/SectionTag;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$38", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SectionTag>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109126q;

        public Q(Continuation<? super Q> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SectionTag> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            Q q12 = BxContentFragment.this.new Q(continuation);
            q12.f109126q = th2;
            return q12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109126q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "", "Lcom/avito/android/shortcut_navigation_bar/adapter/SectionTagPayload;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$87", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Q0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.Q<? extends String, ? extends SectionTagPayload>>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109128q;

        public Q0(Continuation<? super Q0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.Q<? extends String, ? extends SectionTagPayload>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            Q0 q02 = BxContentFragment.this.new Q0(continuation);
            q02.f109128q = th2;
            return q02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109128q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/home/tabs_item/c$a;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/home/tabs_item/c$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$39", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class R extends SuspendLambda implements Y41.p<c.a, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109130q;

        public R(Continuation<? super R> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            R r12 = BxContentFragment.this.new R(continuation);
            r12.f109130q = obj;
            return r12;
        }

        @Override // Y41.p
        public final Object invoke(c.a aVar, Continuation<? super kotlin.G0> continuation) {
            return ((R) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            c.a aVar = (c.a) this.f109130q;
            HomeTabItem homeTabItem = aVar.f162478a;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            C29235n c29235nZ5 = bxContentFragment.Z5();
            HomeTabItem homeTabItem2 = aVar.f162479b;
            c29235nZ5.accept(new InterfaceC29127b.C29128a(homeTabItem2.getFeedId(), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0));
            bxContentFragment.K5().xZ(homeTabItem2.getFeedId());
            com.avito.android.bxcontent.analytics.a aVar2 = bxContentFragment.f108952T2;
            if (aVar2 == null) {
                aVar2 = null;
            }
            String title = homeTabItem != null ? homeTabItem.getTitle() : null;
            if (title == null) {
                title = "";
            }
            aVar2.a0(title, homeTabItem2.getTitle());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$88", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class R0 extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<? super kotlin.G0>, Object> {
        public R0(Continuation<? super R0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BxContentFragment.this.new R0(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            return ((R0) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(InterfaceC29127b.x0.f112185a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/S;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/adapter/S;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$3", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class S extends SuspendLambda implements Y41.p<com.avito.android.serp.adapter.S, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109133q;

        public S(Continuation<? super S> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            S s5 = BxContentFragment.this.new S(continuation);
            s5.f109133q = obj;
            return s5;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.serp.adapter.S s5, Continuation<? super kotlin.G0> continuation) {
            return ((S) create(s5, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.adapter.S s5 = (com.avito.android.serp.adapter.S) this.f109133q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC25585b.C25587c(s5));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$89", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class S0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.G0>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109135q;

        public S0(Continuation<? super S0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.G0> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            S0 s02 = BxContentFragment.this.new S0(continuation);
            s02.f109135q = th2;
            return s02.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109135q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/home/tabs_item/c$a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$40", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class T extends SuspendLambda implements Y41.q<InterfaceC43172j<? super c.a>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109137q;

        public T(Continuation<? super T> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super c.a> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            T t12 = BxContentFragment.this.new T(continuation);
            t12.f109137q = th2;
            return t12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109137q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$8", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class T0 extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<? super kotlin.G0>, Object> {
        public T0(Continuation<? super T0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BxContentFragment.this.new T0(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            return ((T0) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC29247r0 interfaceC29247r0 = BxContentFragment.this.f108932O0;
            if (interfaceC29247r0 == null) {
                interfaceC29247r0 = null;
            }
            interfaceC29247r0.b();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$42", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class U extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109140q;

        public U(Continuation<? super U> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            U u12 = BxContentFragment.this.new U(continuation);
            u12.f109140q = obj;
            return u12;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super kotlin.G0> continuation) {
            return ((U) create(deepLink, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink deepLink = (DeepLink) this.f109140q;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            C28907a c28907a = BxContentFragment.f108886v5;
            DeepLink deepLinkC6 = bxContentFragment.c6(deepLink, false);
            bxContentFragment.Z5().accept(new InterfaceC29127b.C29163w(deepLinkC6, null, true, null, 10, null));
            bxContentFragment.Z5().accept(new InterfaceC25585b.C25592h(deepLinkC6, false, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "iconType", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$9", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class U0 extends SuspendLambda implements Y41.p<String, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109142q;

        public U0(Continuation<? super U0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            U0 u02 = BxContentFragment.this.new U0(continuation);
            u02.f109142q = obj;
            return u02;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super kotlin.G0> continuation) {
            return ((U0) create(str, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f109142q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.V(str, null, null, 6, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$43", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class V extends SuspendLambda implements Y41.q<InterfaceC43172j<? super DeepLink>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109144q;

        public V(Continuation<? super V> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DeepLink> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            V v12 = BxContentFragment.this.new V(continuation);
            v12.f109144q = th2;
            return v12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109144q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"com/avito/android/bxcontent/d0", "invoke", "()Lcom/avito/android/bxcontent/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class V0 extends kotlin.jvm.internal.N implements Y41.a<C28970d0> {
        public V0() {
            super(0);
        }

        @Override // Y41.a
        public final C28970d0 invoke() {
            return new C28970d0(BxContentFragment.this);
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$44", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class W extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109147q;

        public W(Continuation<? super W> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            W w12 = BxContentFragment.this.new W(continuation);
            w12.f109147q = obj;
            return w12;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super kotlin.G0> continuation) {
            return ((W) create(deepLink, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink deepLink = (DeepLink) this.f109147q;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            C28907a c28907a = BxContentFragment.f108886v5;
            DeepLink deepLinkC6 = bxContentFragment.c6(deepLink, false);
            bxContentFragment.Z5().accept(new InterfaceC29127b.C29163w(deepLinkC6, null, false, ItemsSearchLinkHandleForceType.f112039c, 6, null));
            bxContentFragment.Z5().accept(new InterfaceC25585b.C25592h(deepLinkC6, false, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class W0 extends kotlin.jvm.internal.N implements Y41.a<Set<FV0.h>> {
        public W0() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            C28907a c28907a = BxContentFragment.f108886v5;
            return BxContentFragment.this.Z5().f112642J;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$45", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class X extends SuspendLambda implements Y41.q<InterfaceC43172j<? super DeepLink>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109150q;

        public X(Continuation<? super X> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DeepLink> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            X x12 = BxContentFragment.this.new X(continuation);
            x12.f109150q = th2;
            return x12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109150q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/H;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/di/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class X0 extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.di.H> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f109153m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Screen f109154n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ cv.d f109155o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X0(ScreenPerformanceTracker screenPerformanceTracker, Screen screen, cv.d dVar) {
            super(0);
            this.f109153m = screenPerformanceTracker;
            this.f109154n = screen;
            this.f109155o = dVar;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.di.H invoke() {
            ZS.b bVar = new ZS.b(this.f109154n, Owners.f210488g, (String) null, 4, (C42822w) null);
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            com.avito.beduin.v2.engine.component.x xVar = bxContentFragment.Z5().f112644L.f398526b;
            C27106d c27106d = bxContentFragment.Z5().f112644L.f398527c;
            return bxContentFragment.F5(this.f109153m, bVar, this.f109155o, xVar, c27106d);
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$46", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Y extends SuspendLambda implements Y41.p<kotlin.Q<? extends SnippetItem, ? extends Integer>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109156q;

        public Y(Continuation<? super Y> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            Y y12 = BxContentFragment.this.new Y(continuation);
            y12.f109156q = obj;
            return y12;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends SnippetItem, ? extends Integer> q12, Continuation<? super kotlin.G0> continuation) {
            return ((Y) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlin.Q q12 = (kotlin.Q) this.f109156q;
            SnippetItem snippetItem = (SnippetItem) q12.f406619b;
            int iIntValue = ((Number) q12.f406620c).intValue();
            boolean z12 = snippetItem.f272345e.getDeepLink() instanceof SearchSubscriptionControlLink;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            if (z12) {
                InterfaceC29247r0 interfaceC29247r0 = bxContentFragment.f108932O0;
                if (interfaceC29247r0 == null) {
                    interfaceC29247r0 = null;
                }
                interfaceC29247r0.p(null);
                bxContentFragment.Z5().accept(new InterfaceC29127b.C29131c(snippetItem, iIntValue));
            } else {
                C28907a c28907a = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(new InterfaceC29127b.B(snippetItem.f272345e.getDeepLink(), null, null, null, null, 30, null));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$Y0", "Lcom/avito/android/advertising/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Y0 implements com.avito.android.advertising.a {
        public Y0() {
        }

        @Override // com.avito.android.advertising.a
        public final boolean a() {
            boolean z12;
            if (!b()) {
                try {
                    BxContentFragment bxContentFragment = BxContentFragment.this;
                    C28907a c28907a = BxContentFragment.f108886v5;
                    z12 = bxContentFragment.Z5().f112646N.getValue().f111141a.f112348m0.f112364a.f112409j;
                } catch (Throwable unused) {
                    z12 = false;
                }
                if (!z12) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.avito.android.advertising.a
        public final boolean b() {
            try {
                BxContentFragment bxContentFragment = BxContentFragment.this;
                C28907a c28907a = BxContentFragment.f108886v5;
                return bxContentFragment.Z5().f112646N.getValue().f111141a.f112324a0.f112056a != null;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$47", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Z extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.Q<? extends SnippetItem, ? extends Integer>>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109159q;

        public Z(Continuation<? super Z> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.Q<? extends SnippetItem, ? extends Integer>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            Z z12 = BxContentFragment.this.new Z(continuation);
            z12.f109159q = th2;
            return z12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109159q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/utils/b;", "onboardingParams", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/loyalty_program/loyalty_entry_view/utils/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Z0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.loyalty_program.loyalty_entry_view.utils.b, kotlin.G0> {
        public Z0() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.android.loyalty_program.loyalty_entry_view.utils.b bVar) {
            com.avito.android.loyalty_program.loyalty_entry_view.utils.b bVar2 = bVar;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            com.avito.android.bxcontent.Y0 y0K5 = bxContentFragment.K5();
            Onboarding onboarding = bVar2.f184194b;
            y0K5.BS(bVar2.f184193a, onboarding, new C29079e0(bxContentFragment, onboarding), C29082f0.f111068l, new C29085g0(bxContentFragment, bVar2));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/BxContentFragment$a;", "", "<init>", "()V", "", "KEY_BX_CONTENT_LOCATION", "Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$a, reason: case insensitive filesystem */
    public static final class C28907a {
        public /* synthetic */ C28907a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BxContentFragment a(@Y61.k BxContentArguments bxContentArguments, @Y61.l String str, @Y61.l String str2) {
            BxContentFragment bxContentFragment = new BxContentFragment();
            bxContentFragment.setArguments(C22777e.b(new kotlin.Q("arguments", bxContentArguments), new kotlin.Q("extra_message", str), new kotlin.Q("extra_open_section_tab", str2), new kotlin.Q("FRAGMENT_FOR_NEW_UNREAD_POPUPS", Boolean.TRUE)));
            return bxContentFragment;
        }

        public static /* synthetic */ BxContentFragment b(C28907a c28907a, BxContentArguments bxContentArguments) {
            c28907a.getClass();
            return a(bxContentArguments, null, null);
        }

        public C28907a() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$48", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$a0, reason: case insensitive filesystem */
    public static final class C28908a0 extends SuspendLambda implements Y41.p<kotlin.Q<? extends SnippetItem, ? extends Integer>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109162q;

        public C28908a0(Continuation<? super C28908a0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28908a0 c28908a0 = BxContentFragment.this.new C28908a0(continuation);
            c28908a0.f109162q = obj;
            return c28908a0;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends SnippetItem, ? extends Integer> q12, Continuation<? super kotlin.G0> continuation) {
            return ((C28908a0) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlin.Q q12 = (kotlin.Q) this.f109162q;
            SnippetItem snippetItem = (SnippetItem) q12.f406619b;
            int iIntValue = ((Number) q12.f406620c).intValue();
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29158r(snippetItem, iIntValue));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$a1, reason: case insensitive filesystem */
    public static final class C28909a1 extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C28909a1 f109164l = new C28909a1();

        public C28909a1() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$b, reason: case insensitive filesystem */
    public /* synthetic */ class C28910b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109165a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.SERP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PresentationType.PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f109165a = iArr;
            int[] iArr2 = new int[InlineAction.Predefined.State.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                InlineAction.Predefined.State state = InlineAction.Predefined.State.f283118b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                InlineAction.Predefined.State state2 = InlineAction.Predefined.State.f283118b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[BottomNavigationSpace.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$49", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$b0, reason: case insensitive filesystem */
    public static final class C28911b0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.Q<? extends SnippetItem, ? extends Integer>>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109166q;

        public C28911b0(Continuation<? super C28911b0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.Q<? extends SnippetItem, ? extends Integer>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            C28911b0 c28911b0 = BxContentFragment.this.new C28911b0(continuation);
            c28911b0.f109166q = th2;
            return c28911b0.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109166q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Views.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b1 implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f109168b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BxContentFragment f109169c;

        public b1(View view, BxContentFragment bxContentFragment) {
            this.f109168b = view;
            this.f109169c = bxContentFragment;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            C28907a c28907a = BxContentFragment.f108886v5;
            this.f109169c.l6();
            this.f109168b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$c", "Li/a;", "Lkotlin/G0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$c, reason: case insensitive filesystem */
    public static final class C28912c extends AbstractC41201a<kotlin.G0, kotlin.G0> {
        public C28912c() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, kotlin.G0 g02) {
            InterfaceC19542a interfaceC19542a = BxContentFragment.this.f109072x4;
            if (interfaceC19542a == null) {
                interfaceC19542a = null;
            }
            AuthSource authSource = AuthSource.f92694c;
            return interfaceC19542a.d();
        }

        @Override // i.AbstractC41201a
        public final kotlin.G0 parseResult(int i12, Intent intent) {
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(InterfaceC29127b.C29164x.f112184a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$4", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$c0, reason: case insensitive filesystem */
    public static final class C28913c0 extends SuspendLambda implements Y41.p<String, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109171q;

        public C28913c0(Continuation<? super C28913c0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28913c0 c28913c0 = BxContentFragment.this.new C28913c0(continuation);
            c28913c0.f109171q = obj;
            return c28913c0;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super kotlin.G0> continuation) {
            return ((C28913c0) create(str, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f109171q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.InterfaceC29141h.C3301b(str));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentRenderer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bxcontent/S0", "Lcom/avito/android/bxcontent/R0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c1 implements com.avito.android.bxcontent.R0<com.avito.android.bxcontent.mvi.entity.q> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public com.avito.android.bxcontent.mvi.entity.q f109173a;

        public c1() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "intent", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$d, reason: case insensitive filesystem */
    public static final class C28914d extends kotlin.jvm.internal.N implements Y41.l<Intent, Intent> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PresentationType f109176m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28914d(PresentationType presentationType) {
            super(1);
            this.f109176m = presentationType;
        }

        @Override // Y41.l
        public final Intent invoke(Intent intent) {
            Intent intent2 = intent;
            com.avito.android.bxcontent.analytics.a aVar = BxContentFragment.this.f108952T2;
            if (aVar == null) {
                aVar = null;
            }
            C35967w2.b(intent2, aVar.X(this.f109176m));
            return intent2;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$50", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$d0, reason: case insensitive filesystem */
    public static final class C28915d0 extends SuspendLambda implements Y41.p<kotlin.Q<? extends SnippetItem, ? extends Boolean>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109177q;

        public C28915d0(Continuation<? super C28915d0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28915d0 c28915d0 = BxContentFragment.this.new C28915d0(continuation);
            c28915d0.f109177q = obj;
            return c28915d0;
        }

        @Override // Y41.p
        public final Object invoke(kotlin.Q<? extends SnippetItem, ? extends Boolean> q12, Continuation<? super kotlin.G0> continuation) {
            return ((C28915d0) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlin.Q q12 = (kotlin.Q) this.f109177q;
            SnippetItem snippetItem = (SnippetItem) q12.f406619b;
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            BxContentFragment bxContentFragment = BxContentFragment.this;
            if (zBooleanValue) {
                C28907a c28907a = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(new InterfaceC29127b.z0(snippetItem));
            } else {
                C28907a c28907a2 = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(new InterfaceC29127b.D(snippetItem));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentRenderer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bxcontent/S0", "Lcom/avito/android/bxcontent/R0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d1 implements com.avito.android.bxcontent.R0<com.avito.android.map.mvi.entity.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public com.avito.android.map.mvi.entity.b f109179a;

        public d1() {
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "intent", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$e, reason: case insensitive filesystem */
    public static final class C28916e extends kotlin.jvm.internal.N implements Y41.l<Intent, Intent> {
        public C28916e() {
            super(1);
        }

        @Override // Y41.l
        public final Intent invoke(Intent intent) {
            Intent intent2 = intent;
            C19902a.b(intent2, BxContentFragment.this.q5());
            return intent2;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$51", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$e0, reason: case insensitive filesystem */
    public static final class C28917e0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.Q<? extends SnippetItem, ? extends Boolean>>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109182q;

        public C28917e0(Continuation<? super C28917e0> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super kotlin.Q<? extends SnippetItem, ? extends Boolean>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            C28917e0 c28917e0 = BxContentFragment.this.new C28917e0(continuation);
            c28917e0.f109182q = th2;
            return c28917e0.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109182q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e1 extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f109184l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f109184l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f109184l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/BxContentFragment$f", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$f, reason: case insensitive filesystem */
    public static final class C28918f implements a.InterfaceC4053a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f109185b;

        public C28918f() {
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.getClass();
            this.f109185b = new d.a(BxContentFragment.this);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, kotlin.G0> lVar) {
            TabFragmentFactory.Data dataA = C19902a.a(intent);
            BxContentFragment bxContentFragment = BxContentFragment.this;
            if (dataA == null) {
                C35966w1.e(bxContentFragment, intent, i12, lVar);
            } else {
                bxContentFragment.C5(i12, intent);
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, kotlin.G0> lVar) {
            this.f109185b.R(intent, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @Y61.k Intent intent) {
            this.f109185b.X(i12, intent);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@Y61.k Y41.l<? super Context, kotlin.G0> lVar) {
            this.f109185b.g1(lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f109185b.s1();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rubricator/items/RubricatorRefinedItem;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/rubricator/items/RubricatorRefinedItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$52", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$f0, reason: case insensitive filesystem */
    public static final class C28919f0 extends SuspendLambda implements Y41.p<RubricatorRefinedItem, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109187q;

        public C28919f0(Continuation<? super C28919f0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28919f0 c28919f0 = BxContentFragment.this.new C28919f0(continuation);
            c28919f0.f109187q = obj;
            return c28919f0;
        }

        @Override // Y41.p
        public final Object invoke(RubricatorRefinedItem rubricatorRefinedItem, Continuation<? super kotlin.G0> continuation) {
            return ((C28919f0) create(rubricatorRefinedItem, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            RubricatorRefinedItem rubricatorRefinedItem = (RubricatorRefinedItem) this.f109187q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.N0(rubricatorRefinedItem));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f1 extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f109189l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(Y41.a aVar) {
            super(0);
            this.f109189l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f109189l);
        }
    }

    /* compiled from: BxContentFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/core/view/J0;", "insets", "", "left", "top", "right", "bottom", "invoke", "(Landroidx/core/view/J0;IIII)Landroidx/core/view/J0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$g, reason: case insensitive filesystem */
    public static final class C28920g extends kotlin.jvm.internal.N implements Y41.s<androidx.core.view.J0, Integer, Integer, Integer, Integer, androidx.core.view.J0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f109190l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f109191m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ View f109192n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f109193o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Set<Integer> f109194p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f109195q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28920g(LinkedHashMap linkedHashMap, View view, View view2, boolean z12, Set set, boolean z13) {
            super(5);
            this.f109190l = linkedHashMap;
            this.f109191m = view;
            this.f109192n = view2;
            this.f109193o = z12;
            this.f109194p = set;
            this.f109195q = z13;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
        @Override // Y41.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.core.view.J0 invoke(androidx.core.view.J0 r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11) {
            /*
                r6 = this;
                androidx.core.view.J0 r7 = (androidx.core.view.J0) r7
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                java.util.LinkedHashMap r0 = r6.f109190l
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L24:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r3 = r1.getKey()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.lang.Object r1 = r1.getValue()
                android.view.View r1 = (android.view.View) r1
                boolean r4 = r6.f109193o
                if (r4 == 0) goto L52
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.Set<java.lang.Integer> r4 = r6.f109194p
                boolean r3 = r4.contains(r3)
                if (r3 == 0) goto L52
                goto L53
            L52:
                r2 = r9
            L53:
                int r3 = r1.getPaddingLeft()
                int r4 = r1.getPaddingRight()
                int r5 = r1.getPaddingBottom()
                r1.setPadding(r3, r2, r4, r5)
                goto L24
            L63:
                boolean r0 = r6.f109195q
                if (r0 != 0) goto L69
                r0 = r2
                goto L6b
            L69:
                r0 = 8
            L6b:
                android.view.View r1 = r6.f109191m
                r1.setVisibility(r0)
                android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
                if (r0 == 0) goto L9c
                r0.height = r9
                r1.setLayoutParams(r0)
                android.view.View r0 = r6.f109192n
                int r1 = r0.getPaddingTop()
                r0.setPadding(r8, r1, r10, r11)
                androidx.core.view.J0$b r8 = new androidx.core.view.J0$b
                r8.<init>(r7)
                com.avito.android.lib.util.i r7 = com.avito.android.lib.util.i.f181373a
                r7.getClass()
                int r7 = com.avito.android.lib.util.i.f181375c
                androidx.core.graphics.k r9 = androidx.core.graphics.C22771k.b(r2, r9, r2, r2)
                r8.b(r7, r9)
                androidx.core.view.J0 r7 = r8.a()
                return r7
            L9c:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.C28920g.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalFilterItem;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalFilterItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$53", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$g0, reason: case insensitive filesystem */
    public static final class C28921g0 extends SuspendLambda implements Y41.p<VerticalPromoBlockItem.VerticalFilterItem, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109196q;

        public C28921g0(Continuation<? super C28921g0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28921g0 c28921g0 = BxContentFragment.this.new C28921g0(continuation);
            c28921g0.f109196q = obj;
            return c28921g0;
        }

        @Override // Y41.p
        public final Object invoke(VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem, Continuation<? super kotlin.G0> continuation) {
            return ((C28921g0) create(verticalFilterItem, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem = (VerticalPromoBlockItem.VerticalFilterItem) this.f109196q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.M0(verticalFilterItem));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g1 extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public g1() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BxContentFragment.this;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/di/a;", "invoke", "()Lcom/avito/android/bxcontent/beduin_v2/di/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$h, reason: case insensitive filesystem */
    public static final class C28922h extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.bxcontent.beduin_v2.di.a> {
        public C28922h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.bxcontent.beduin_v2.di.a invoke() {
            BxContentFragment bxContentFragment = BxContentFragment.this;
            return ((a.b) C29972i.a(C29972i.b(bxContentFragment), a.b.class)).i9().a(new com.avito.android.bxcontent.L(bxContentFragment), new com.avito.android.bxcontent.M(bxContentFragment), new com.avito.android.bxcontent.N(bxContentFragment), new com.avito.android.bxcontent.O(bxContentFragment), new com.avito.android.bxcontent.P(bxContentFragment), new com.avito.android.bxcontent.Q(bxContentFragment), new com.avito.android.bxcontent.S(bxContentFragment), new com.avito.android.bxcontent.T(bxContentFragment), new com.avito.android.bxcontent.U(bxContentFragment));
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalFilterItem;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$54", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$h0, reason: case insensitive filesystem */
    public static final class C28923h0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super VerticalPromoBlockItem.VerticalFilterItem>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109200q;

        public C28923h0() {
            super(3, null);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super VerticalPromoBlockItem.VerticalFilterItem> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            C28923h0 c28923h0 = new C28923h0(3, continuation);
            c28923h0.f109200q = th2;
            return c28923h0.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("BxContent", "Error  verticalFilterPresenter.filtersChangesFlow", this.f109200q);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h1 extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g1 f109201l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(g1 g1Var) {
            super(0);
            this.f109201l = g1Var;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f109201l.invoke();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LCX/b;", "kotlin.jvm.PlatformType", "invoke", "()LCX/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$i, reason: case insensitive filesystem */
    public static final class C28924i extends kotlin.jvm.internal.N implements Y41.a<CX.b> {
        public C28924i() {
            super(0);
        }

        @Override // Y41.a
        public final CX.b invoke() {
            CX.c cVar = BxContentFragment.this.f108962V4;
            if (cVar == null) {
                cVar = null;
            }
            return (CX.b) cVar.get();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$55", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$i0, reason: case insensitive filesystem */
    public static final class C28925i0 extends SuspendLambda implements Y41.p<Integer, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ int f109203q;

        public C28925i0(Continuation<? super C28925i0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28925i0 c28925i0 = BxContentFragment.this.new C28925i0(continuation);
            c28925i0.f109203q = ((Number) obj).intValue();
            return c28925i0;
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super kotlin.G0> continuation) {
            return ((C28925i0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            C31100l2 c31100l2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            int i12 = this.f109203q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            if (bxContentFragment.g6()) {
                bxContentFragment.Z5().accept(new InterfaceC29127b.K0(i12));
            } else {
                com.avito.android.serp.adapter.search_bar.M m12 = bxContentFragment.f109003f5;
                if (m12 != null && (c31100l2 = m12.f271603d) != null) {
                    c31100l2.d(i12);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i1 extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f109205l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f109205l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f109205l.getValue()).getF42820b();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"com/avito/android/bxcontent/V", "invoke", "()Lcom/avito/android/bxcontent/V;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$j, reason: case insensitive filesystem */
    public static final class C28926j extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.bxcontent.V> {
        public C28926j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.bxcontent.V invoke() {
            return new com.avito.android.bxcontent.V(BxContentFragment.this);
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$56", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$j0, reason: case insensitive filesystem */
    public static final class C28927j0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Integer>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109207q;

        public C28927j0() {
            super(3, null);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Integer> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            C28927j0 c28927j0 = new C28927j0(3, continuation);
            c28927j0.f109207q = th2;
            return c28927j0.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("BxContent", "Error  verticalFilterPresenter.selectedFiltersCountFlow", this.f109207q);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j1 extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f109208l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f109208l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f109208l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onCreateView$1", f = "BxContentFragment.kt", i = {}, l = {1574}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$k, reason: case insensitive filesystem */
    public static final class C28928k extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f109209q;

        /* compiled from: BxContentFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onCreateView$1$1", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.BxContentFragment$k$a */
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f109211q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BxContentFragment f109212r;

            /* compiled from: BxContentFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onCreateView$1$1$1", f = "BxContentFragment.kt", i = {}, l = {1576}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.BxContentFragment$k$a$a, reason: collision with other inner class name */
            public static final class C3258a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f109213q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BxContentFragment f109214r;

                /* compiled from: BxContentFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/l;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lcom/avito/android/bxcontent/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.bxcontent.BxContentFragment$k$a$a$a, reason: collision with other inner class name */
                public static final class C3259a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BxContentFragment f109215b;

                    public C3259a(BxContentFragment bxContentFragment) {
                        this.f109215b = bxContentFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C29099l c29099l = (C29099l) obj;
                        com.avito.android.bxcontent.mvi.entity.l lVar = c29099l.f111141a;
                        BxContentFragment bxContentFragment = this.f109215b;
                        com.avito.android.bxcontent.analytics.g gVar = bxContentFragment.f109005g3;
                        if (gVar == null) {
                            gVar = null;
                        }
                        com.avito.android.analytics.screens.mvi.a.i(lVar, gVar, new com.avito.android.bxcontent.W(bxContentFragment));
                        com.avito.android.map.mvi.entity.a aVar = c29099l.f111142b;
                        if (aVar != null) {
                            com.avito.android.bxcontent.analytics.g gVar2 = bxContentFragment.f109005g3;
                            if (gVar2 == null) {
                                gVar2 = null;
                            }
                            com.avito.android.analytics.screens.mvi.a.i(aVar, gVar2, new com.avito.android.bxcontent.X(bxContentFragment));
                        }
                        AbstractC40048c abstractC40048c = c29099l.f111143c;
                        if (abstractC40048c != null) {
                            com.avito.android.bxcontent.analytics.g gVar3 = bxContentFragment.f109005g3;
                            com.avito.android.analytics.screens.mvi.a.i(abstractC40048c, gVar3 != null ? gVar3 : null, new com.avito.android.bxcontent.Y(bxContentFragment));
                        }
                        return kotlin.G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3258a(BxContentFragment bxContentFragment, Continuation<? super C3258a> continuation) {
                    super(2, continuation);
                    this.f109214r = bxContentFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3258a(this.f109214r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C3258a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f109213q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        C28907a c28907a = BxContentFragment.f108886v5;
                        BxContentFragment bxContentFragment = this.f109214r;
                        C29235n c29235nZ5 = bxContentFragment.Z5();
                        C3259a c3259a = new C3259a(bxContentFragment);
                        this.f109213q = 1;
                        Object objCollect = C43175k.s(c29235nZ5.f112646N, new C29102m(1, c29235nZ5, C29235n.class, "toCombinationViewState", "toCombinationViewState(Lcom/avito/android/bxcontent/BxContentCombinationState;)Lcom/avito/android/bxcontent/BxContentCombinationViewState;", 0)).collect(c3259a, this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = kotlin.G0.f406611a;
                        }
                        if (objCollect == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: BxContentFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onCreateView$1$1$2", f = "BxContentFragment.kt", i = {}, l = {1593}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.BxContentFragment$k$a$b */
            public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f109216q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BxContentFragment f109217r;

                /* compiled from: BxContentFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/b$b;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/bxcontent/b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.bxcontent.BxContentFragment$k$a$b$a, reason: collision with other inner class name */
                public static final class C3260a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BxContentFragment f109218b;

                    public C3260a(BxContentFragment bxContentFragment) {
                        this.f109218b = bxContentFragment;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:432:0x05ff  */
                    /* JADX WARN: Removed duplicated region for block: B:499:0x06f4  */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r39, kotlin.coroutines.Continuation r40) {
                        /*
                            Method dump skipped, instructions count: 3134
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.C28928k.a.b.C3260a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BxContentFragment bxContentFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f109217r = bxContentFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f109217r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f109216q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        C28907a c28907a = BxContentFragment.f108886v5;
                        BxContentFragment bxContentFragment = this.f109217r;
                        C29235n c29235nZ5 = bxContentFragment.Z5();
                        C3260a c3260a = new C3260a(bxContentFragment);
                        this.f109216q = 1;
                        Object objCollect = c29235nZ5.f112647O.collect(c3260a, this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = kotlin.G0.f406611a;
                        }
                        if (objCollect == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BxContentFragment bxContentFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109212r = bxContentFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f109212r, continuation);
                aVar.f109211q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f109211q;
                BxContentFragment bxContentFragment = this.f109212r;
                C43259k.d(t12, null, null, new C3258a(bxContentFragment, null), 3);
                C43259k.d(t12, null, null, new b(bxContentFragment, null), 3);
                return kotlin.G0.f406611a;
            }
        }

        public C28928k(Continuation<? super C28928k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BxContentFragment.this.new C28928k(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((C28928k) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f109209q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BxContentFragment bxContentFragment = BxContentFragment.this;
                a aVar = new a(bxContentFragment, null);
                this.f109209q = 1;
                if (C23056p0.b(bxContentFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$57", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$k0, reason: case insensitive filesystem */
    public static final class C28929k0 extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<? super kotlin.G0>, Object> {
        public C28929k0(Continuation<? super C28929k0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BxContentFragment.this.new C28929k0(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            return ((C28929k0) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(InterfaceC29127b.C29157q.f112161a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k1 extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f109220l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(Y41.a aVar) {
            super(0);
            this.f109220l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f109220l);
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$l, reason: case insensitive filesystem */
    public static final class C28930l<T> implements l41.g {
        public C28930l() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof FiltersShowLink.b.C7865b;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            if (z12) {
                C28907a c28907a = BxContentFragment.f108886v5;
                bxContentFragment.e6(((FiltersShowLink.b.C7865b) interfaceC14249c).f263407b, false);
            }
            if (interfaceC14249c instanceof GigShiftCancelDeeplink.b.a) {
                C28907a c28907a2 = BxContentFragment.f108886v5;
                C29235n c29235nZ5 = bxContentFragment.Z5();
                InterfaceC31062w interfaceC31062w = bxContentFragment.f108996e1;
                if (interfaceC31062w == null) {
                    interfaceC31062w = null;
                }
                c29235nZ5.accept(new InterfaceC29127b.C29136e0(interfaceC31062w.W0()));
            }
            if (interfaceC14249c instanceof GigShiftStartDeeplink.b.a) {
                C28907a c28907a3 = BxContentFragment.f108886v5;
                C29235n c29235nZ52 = bxContentFragment.Z5();
                InterfaceC31062w interfaceC31062w2 = bxContentFragment.f108996e1;
                if (interfaceC31062w2 == null) {
                    interfaceC31062w2 = null;
                }
                c29235nZ52.accept(new InterfaceC29127b.C29136e0(interfaceC31062w2.W0()));
            }
            if (interfaceC14249c instanceof WidgetFiltersLink.b.a) {
                WidgetFiltersLink.b.a aVar = (WidgetFiltersLink.b.a) interfaceC14249c;
                C28907a c28907a4 = BxContentFragment.f108886v5;
                bxContentFragment.e6(aVar.f329743b, aVar.f329745d);
            }
            if (interfaceC14249c instanceof SearchSuggestInternalShowLink.b.C7880b) {
                C28907a c28907a5 = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(new InterfaceC29127b.B(((SearchSuggestInternalShowLink.b.C7880b) interfaceC14249c).f264143b, null, null, null, null, 30, null));
            }
            if (interfaceC14249c instanceof EsiaRedirectDeeplink.b.a) {
                C28907a c28907a6 = BxContentFragment.f108886v5;
                C29235n c29235nZ53 = bxContentFragment.Z5();
                InterfaceC31062w interfaceC31062w3 = bxContentFragment.f108996e1;
                if (interfaceC31062w3 == null) {
                    interfaceC31062w3 = null;
                }
                c29235nZ53.accept(new InterfaceC29127b.C29136e0(interfaceC31062w3.W0()));
            }
            if (interfaceC14249c instanceof GigUploadDocDeeplink.b.C4002b) {
                C28907a c28907a7 = BxContentFragment.f108886v5;
                C29235n c29235nZ54 = bxContentFragment.Z5();
                InterfaceC31062w interfaceC31062w4 = bxContentFragment.f108996e1;
                c29235nZ54.accept(new InterfaceC29127b.C29136e0((interfaceC31062w4 != null ? interfaceC31062w4 : null).W0()));
            }
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$58", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$l0, reason: case insensitive filesystem */
    public static final class C28931l0 extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<? super kotlin.G0>, Object> {
        public C28931l0(Continuation<? super C28931l0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BxContentFragment.this.new C28931l0(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            return ((C28931l0) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(InterfaceC29127b.C29156p.f112159a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l1 extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public l1() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BxContentFragment.this;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$m, reason: case insensitive filesystem */
    public static final class C28932m implements InterfaceC43160i<InterfaceC29127b.B> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f109224b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.BxContentFragment$m$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f109225b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$$inlined$map$1$2", f = "BxContentFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.BxContentFragment$m$a$a, reason: collision with other inner class name */
            public static final class C3261a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f109226q;

                /* renamed from: r, reason: collision with root package name */
                public int f109227r;

                public C3261a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f109226q = obj;
                    this.f109227r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f109225b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.avito.android.bxcontent.BxContentFragment.C28932m.a.C3261a
                    if (r0 == 0) goto L13
                    r0 = r14
                    com.avito.android.bxcontent.BxContentFragment$m$a$a r0 = (com.avito.android.bxcontent.BxContentFragment.C28932m.a.C3261a) r0
                    int r1 = r0.f109227r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f109227r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.BxContentFragment$m$a$a r0 = new com.avito.android.bxcontent.BxContentFragment$m$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f109226q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f109227r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r14)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.C42729a0.b(r14)
                    r5 = r13
                    com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
                    com.avito.android.bxcontent.mvi.entity.b$B r13 = new com.avito.android.bxcontent.mvi.entity.b$B
                    r8 = 0
                    r9 = 0
                    r6 = 0
                    r7 = 0
                    r10 = 30
                    r11 = 0
                    r4 = r13
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                    r0.f109227r = r3
                    kotlinx.coroutines.flow.j r14 = r12.f109225b
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L4f
                    return r1
                L4f:
                    kotlin.G0 r13 = kotlin.G0.f406611a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.C28932m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C28932m(InterfaceC43160i interfaceC43160i) {
            this.f109224b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC29127b.B> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f109224b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$59", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$m0, reason: case insensitive filesystem */
    public static final class C28933m0 extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109229q;

        public C28933m0(Continuation<? super C28933m0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28933m0 c28933m0 = BxContentFragment.this.new C28933m0(continuation);
            c28933m0.f109229q = obj;
            return c28933m0;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super kotlin.G0> continuation) {
            return ((C28933m0) create(deepLink, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink deepLink = (DeepLink) this.f109229q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.B(deepLink, null, null, null, null, 30, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m1 extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l1 f109231l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(l1 l1Var) {
            super(0);
            this.f109231l = l1Var;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f109231l.invoke();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$n, reason: case insensitive filesystem */
    public static final class C28934n implements InterfaceC43160i<InterfaceC29127b.B> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f109232b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.BxContentFragment$n$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f109233b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$$inlined$map$2$2", f = "BxContentFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.BxContentFragment$n$a$a, reason: collision with other inner class name */
            public static final class C3262a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f109234q;

                /* renamed from: r, reason: collision with root package name */
                public int f109235r;

                public C3262a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f109234q = obj;
                    this.f109235r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f109233b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.avito.android.bxcontent.BxContentFragment.C28934n.a.C3262a
                    if (r0 == 0) goto L13
                    r0 = r14
                    com.avito.android.bxcontent.BxContentFragment$n$a$a r0 = (com.avito.android.bxcontent.BxContentFragment.C28934n.a.C3262a) r0
                    int r1 = r0.f109235r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f109235r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.BxContentFragment$n$a$a r0 = new com.avito.android.bxcontent.BxContentFragment$n$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f109234q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f109235r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r14)
                    goto L50
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.C42729a0.b(r14)
                    r5 = r13
                    com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
                    com.avito.android.bxcontent.mvi.entity.b$B r13 = new com.avito.android.bxcontent.mvi.entity.b$B
                    com.avito.android.bxcontent.mvi.entity.ItemsSearchLinkHandleForceType r8 = com.avito.android.bxcontent.mvi.entity.ItemsSearchLinkHandleForceType.f112038b
                    r7 = 0
                    r9 = 0
                    r6 = 0
                    r10 = 22
                    r11 = 0
                    r4 = r13
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                    r0.f109235r = r3
                    kotlinx.coroutines.flow.j r14 = r12.f109233b
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L50
                    return r1
                L50:
                    kotlin.G0 r13 = kotlin.G0.f406611a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.C28934n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C28934n(InterfaceC43160i interfaceC43160i) {
            this.f109232b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC29127b.B> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f109232b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem$ReplaceMain;", "replaceMain", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem$ReplaceMain;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$60", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$n0, reason: case insensitive filesystem */
    public static final class C28935n0 extends SuspendLambda implements Y41.p<ReplaceMainWidgetItem.ReplaceMain, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109237q;

        public C28935n0(Continuation<? super C28935n0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28935n0 c28935n0 = BxContentFragment.this.new C28935n0(continuation);
            c28935n0.f109237q = obj;
            return c28935n0;
        }

        @Override // Y41.p
        public final Object invoke(ReplaceMainWidgetItem.ReplaceMain replaceMain, Continuation<? super kotlin.G0> continuation) {
            return ((C28935n0) create(replaceMain, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ReplaceMainWidgetItem.ReplaceMain replaceMain = (ReplaceMainWidgetItem.ReplaceMain) this.f109237q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.o0(replaceMain));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n1 extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f109239l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f109239l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f109239l.getValue()).getF42820b();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$o, reason: case insensitive filesystem */
    public static final class C28936o implements InterfaceC43160i<InterfaceC29127b.B> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f109240b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.BxContentFragment$o$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f109241b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$$inlined$map$3$2", f = "BxContentFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.BxContentFragment$o$a$a, reason: collision with other inner class name */
            public static final class C3263a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f109242q;

                /* renamed from: r, reason: collision with root package name */
                public int f109243r;

                public C3263a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f109242q = obj;
                    this.f109243r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f109241b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.avito.android.bxcontent.BxContentFragment.C28936o.a.C3263a
                    if (r0 == 0) goto L13
                    r0 = r14
                    com.avito.android.bxcontent.BxContentFragment$o$a$a r0 = (com.avito.android.bxcontent.BxContentFragment.C28936o.a.C3263a) r0
                    int r1 = r0.f109243r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f109243r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.BxContentFragment$o$a$a r0 = new com.avito.android.bxcontent.BxContentFragment$o$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f109242q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f109243r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r14)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.C42729a0.b(r14)
                    r5 = r13
                    com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
                    com.avito.android.bxcontent.mvi.entity.b$B r13 = new com.avito.android.bxcontent.mvi.entity.b$B
                    r8 = 0
                    r9 = 0
                    r6 = 0
                    r7 = 0
                    r10 = 30
                    r11 = 0
                    r4 = r13
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                    r0.f109243r = r3
                    kotlinx.coroutines.flow.j r14 = r12.f109241b
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L4f
                    return r1
                L4f:
                    kotlin.G0 r13 = kotlin.G0.f406611a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.C28936o.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C28936o(InterfaceC43160i interfaceC43160i) {
            this.f109240b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC29127b.B> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f109240b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$61", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$o0, reason: case insensitive filesystem */
    public static final class C28937o0 extends SuspendLambda implements Y41.p<String, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109245q;

        public C28937o0(Continuation<? super C28937o0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28937o0 c28937o0 = BxContentFragment.this.new C28937o0(continuation);
            c28937o0.f109245q = obj;
            return c28937o0;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super kotlin.G0> continuation) {
            return ((C28937o0) create(str, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f109245q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29162v(str));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o1 extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f109247l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f109247l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f109247l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$p, reason: case insensitive filesystem */
    public static final class C28938p implements InterfaceC43160i<InterfaceC29127b.B> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f109248b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.BxContentFragment$p$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f109249b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$$inlined$map$4$2", f = "BxContentFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.BxContentFragment$p$a$a, reason: collision with other inner class name */
            public static final class C3264a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f109250q;

                /* renamed from: r, reason: collision with root package name */
                public int f109251r;

                public C3264a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f109250q = obj;
                    this.f109251r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f109249b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.avito.android.bxcontent.BxContentFragment.C28938p.a.C3264a
                    if (r0 == 0) goto L13
                    r0 = r14
                    com.avito.android.bxcontent.BxContentFragment$p$a$a r0 = (com.avito.android.bxcontent.BxContentFragment.C28938p.a.C3264a) r0
                    int r1 = r0.f109251r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f109251r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.BxContentFragment$p$a$a r0 = new com.avito.android.bxcontent.BxContentFragment$p$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f109250q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f109251r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r14)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.C42729a0.b(r14)
                    r5 = r13
                    com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
                    com.avito.android.bxcontent.mvi.entity.b$B r13 = new com.avito.android.bxcontent.mvi.entity.b$B
                    r8 = 0
                    r9 = 0
                    r6 = 0
                    r7 = 0
                    r10 = 30
                    r11 = 0
                    r4 = r13
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                    r0.f109251r = r3
                    kotlinx.coroutines.flow.j r14 = r12.f109249b
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L4f
                    return r1
                L4f:
                    kotlin.G0 r13 = kotlin.G0.f406611a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.C28938p.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C28938p(InterfaceC43160i interfaceC43160i) {
            this.f109248b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC29127b.B> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f109248b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$62", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$p0, reason: case insensitive filesystem */
    public static final class C28939p0 extends SuspendLambda implements Y41.p<String, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109253q;

        public C28939p0(Continuation<? super C28939p0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28939p0 c28939p0 = BxContentFragment.this.new C28939p0(continuation);
            c28939p0.f109253q = obj;
            return c28939p0;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super kotlin.G0> continuation) {
            return ((C28939p0) create(str, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f109253q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29162v(str));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p1 extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f109255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(Y41.a aVar) {
            super(0);
            this.f109255l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f109255l);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$q, reason: case insensitive filesystem */
    public static final class C28940q implements InterfaceC43160i<DeepLink> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f109256b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.BxContentFragment$q$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f109257b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$$inlined$map$5$2", f = "BxContentFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.BxContentFragment$q$a$a, reason: collision with other inner class name */
            public static final class C3265a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f109258q;

                /* renamed from: r, reason: collision with root package name */
                public int f109259r;

                public C3265a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f109258q = obj;
                    this.f109259r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f109257b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.bxcontent.BxContentFragment.C28940q.a.C3265a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.bxcontent.BxContentFragment$q$a$a r0 = (com.avito.android.bxcontent.BxContentFragment.C28940q.a.C3265a) r0
                    int r1 = r0.f109259r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f109259r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.BxContentFragment$q$a$a r0 = new com.avito.android.bxcontent.BxContentFragment$q$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f109258q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f109259r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.shortcut_navigation_bar.z0 r5 = (com.avito.android.shortcut_navigation_bar.z0) r5
                    com.avito.android.deep_linking.links.DeepLink r5 = r5.f283594c
                    if (r5 != 0) goto L3f
                    com.avito.android.deep_linking.links.NoMatchLink r5 = new com.avito.android.deep_linking.links.NoMatchLink
                    r5.<init>()
                L3f:
                    r0.f109259r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f109257b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.C28940q.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C28940q(InterfaceC43160i interfaceC43160i) {
            this.f109256b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super DeepLink> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f109256b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$63", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$q0, reason: case insensitive filesystem */
    public static final class C28941q0 extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109261q;

        public C28941q0(Continuation<? super C28941q0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28941q0 c28941q0 = BxContentFragment.this.new C28941q0(continuation);
            c28941q0.f109261q = obj;
            return c28941q0;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super kotlin.G0> continuation) {
            return ((C28941q0) create(deepLink, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink deepLink = (DeepLink) this.f109261q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.B(deepLink, null, null, null, null, 30, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q1 extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public q1() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BxContentFragment.this;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$r, reason: case insensitive filesystem */
    public static final class C28942r extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31171n, kotlin.G0> {
        public C28942r() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC31171n interfaceC31171n) {
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.I0(interfaceC31171n));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$64", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$r0, reason: case insensitive filesystem */
    public static final class C28943r0 extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109265q;

        public C28943r0(Continuation<? super C28943r0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28943r0 c28943r0 = BxContentFragment.this.new C28943r0(continuation);
            c28943r0.f109265q = obj;
            return c28943r0;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super kotlin.G0> continuation) {
            return ((C28943r0) create(deepLink, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink deepLink = (DeepLink) this.f109265q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.B(deepLink, null, null, null, null, 30, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r1 extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q1 f109267l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r1(q1 q1Var) {
            super(0);
            this.f109267l = q1Var;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f109267l.invoke();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$s, reason: case insensitive filesystem */
    public static final class C28944s extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31171n, kotlin.G0> {
        public C28944s() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC31171n interfaceC31171n) {
            InterfaceC31171n interfaceC31171n2 = interfaceC31171n;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            if (!bxContentFragment.o6() && (interfaceC31171n2 instanceof InterfaceC31171n.c)) {
                u3.h<OctoberRewardTestGroup> hVar = bxContentFragment.f108916I4;
                if (hVar == null) {
                    hVar = null;
                }
                OctoberRewardTestGroup octoberRewardTestGroup = hVar.f439744a.f439749b;
                octoberRewardTestGroup.getClass();
                if (octoberRewardTestGroup != OctoberRewardTestGroup.f255680c) {
                    u3.l<ShowTicketEntryTestGroup> lVar = bxContentFragment.f108908G4;
                    (lVar != null ? lVar : null).b();
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/h;", "newState", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/search_bar_promo_widget/h;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$65", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$s0, reason: case insensitive filesystem */
    public static final class C28945s0 extends SuspendLambda implements Y41.p<com.avito.android.bxcontent.search_bar_promo_widget.h, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109269q;

        public C28945s0(Continuation<? super C28945s0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28945s0 c28945s0 = BxContentFragment.this.new C28945s0(continuation);
            c28945s0.f109269q = obj;
            return c28945s0;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.bxcontent.search_bar_promo_widget.h hVar, Continuation<? super kotlin.G0> continuation) {
            return ((C28945s0) create(hVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.bxcontent.search_bar_promo_widget.h hVar = (com.avito.android.bxcontent.search_bar_promo_widget.h) this.f109269q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29155o(hVar));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s1 extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f109271l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f109271l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f109271l.getValue()).getF42820b();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/p;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$t, reason: case insensitive filesystem */
    public static final class C28946t extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.search.p, kotlin.G0> {
        public C28946t() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.android.search.p pVar) {
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.O(pVar));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/hero_banner/widget/k;", "newState", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/hero_banner/widget/k;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$66", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$t0, reason: case insensitive filesystem */
    public static final class C28947t0 extends SuspendLambda implements Y41.p<com.avito.android.hero_banner.widget.k, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109273q;

        public C28947t0(Continuation<? super C28947t0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28947t0 c28947t0 = BxContentFragment.this.new C28947t0(continuation);
            c28947t0.f109273q = obj;
            return c28947t0;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.hero_banner.widget.k kVar, Continuation<? super kotlin.G0> continuation) {
            return ((C28947t0) create(kVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.hero_banner.widget.k kVar = (com.avito.android.hero_banner.widget.k) this.f109273q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29153n(kVar));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search_view/ShareButtonEvent;", "value", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/search_view/ShareButtonEvent;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeOnShareButtonListener$1", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class t1 extends SuspendLambda implements Y41.p<ShareButtonEvent, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109275q;

        /* compiled from: BxContentFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[ShareButtonEvent.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ShareButtonEvent shareButtonEvent = ShareButtonEvent.f264426b;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public t1(Continuation<? super t1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            t1 t1Var = BxContentFragment.this.new t1(continuation);
            t1Var.f109275q = obj;
            return t1Var;
        }

        @Override // Y41.p
        public final Object invoke(ShareButtonEvent shareButtonEvent, Continuation<? super kotlin.G0> continuation) {
            return ((t1) create(shareButtonEvent, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            int iOrdinal = ((ShareButtonEvent) this.f109275q).ordinal();
            BxContentFragment bxContentFragment = BxContentFragment.this;
            if (iOrdinal == 0) {
                C28907a c28907a = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(InterfaceC29127b.W.f112111a);
            } else if (iOrdinal == 1) {
                C28907a c28907a2 = BxContentFragment.f108886v5;
                bxContentFragment.Z5().accept(InterfaceC29127b.w0.f112183a);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$u, reason: case insensitive filesystem */
    public static final class C28948u extends kotlin.jvm.internal.N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BxContentFragment f109277l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f109278m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28948u(View view, BxContentFragment bxContentFragment) {
            super(0);
            this.f109277l = bxContentFragment;
            this.f109278m = view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.fragment.app.Fragment] */
        /* JADX WARN: Type inference failed for: r1v6, types: [com.avito.android.bottom_navigation.space.e] */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // Y41.a
        public final View invoke() {
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = this.f109277l;
            if (!bxContentFragment.v5()) {
                return this.f109278m.findViewById(com.avito.android.R.id.toolbar_up_button_view);
            }
            ?? parentFragment = bxContentFragment.getParentFragment();
            while (true) {
                if (parentFragment == 0) {
                    ActivityC22955m activityC22955mL1 = bxContentFragment.l1();
                    if (!(activityC22955mL1 instanceof com.avito.android.bottom_navigation.space.e)) {
                        activityC22955mL1 = null;
                    }
                    parentFragment = (com.avito.android.bottom_navigation.space.e) activityC22955mL1;
                } else {
                    if (parentFragment instanceof com.avito.android.bottom_navigation.space.e) {
                        break;
                    }
                    parentFragment = parentFragment.getParentFragment();
                }
            }
            com.avito.android.bottom_navigation.space.e eVar = (com.avito.android.bottom_navigation.space.e) parentFragment;
            if (eVar != null) {
                return eVar.p1();
            }
            return null;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "progress", "Lkotlin/G0;", "<anonymous>", "(F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$67", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$u0, reason: case insensitive filesystem */
    public static final class C28949u0 extends SuspendLambda implements Y41.p<Float, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ float f109279q;

        public C28949u0(Continuation<? super C28949u0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28949u0 c28949u0 = BxContentFragment.this.new C28949u0(continuation);
            c28949u0.f109279q = ((Number) obj).floatValue();
            return c28949u0;
        }

        @Override // Y41.p
        public final Object invoke(Float f12, Continuation<? super kotlin.G0> continuation) {
            return ((C28949u0) create(Float.valueOf(f12.floatValue()), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            float f12 = this.f109279q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29137f(f12));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/a;", "data", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/adapter/location_notification/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeToLocationNotificationActions$1", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u1 extends SuspendLambda implements Y41.p<com.avito.android.serp.adapter.location_notification.a, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109281q;

        public u1(Continuation<? super u1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            u1 u1Var = BxContentFragment.this.new u1(continuation);
            u1Var.f109281q = obj;
            return u1Var;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.serp.adapter.location_notification.a aVar, Continuation<? super kotlin.G0> continuation) {
            return ((u1) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.adapter.location_notification.a aVar = (com.avito.android.serp.adapter.location_notification.a) this.f109281q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.G(aVar));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$v, reason: case insensitive filesystem */
    public /* synthetic */ class C28950v extends kotlin.jvm.internal.H implements Y41.l<Boolean, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            ((C29255u) this.receiver).f113015d = bool.booleanValue();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "progress", "Lkotlin/G0;", "<anonymous>", "(F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$68", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$v0, reason: case insensitive filesystem */
    public static final class C28951v0 extends SuspendLambda implements Y41.p<Float, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ float f109283q;

        public C28951v0(Continuation<? super C28951v0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28951v0 c28951v0 = BxContentFragment.this.new C28951v0(continuation);
            c28951v0.f109283q = ((Number) obj).floatValue();
            return c28951v0;
        }

        @Override // Y41.p
        public final Object invoke(Float f12, Continuation<? super kotlin.G0> continuation) {
            return ((C28951v0) create(Float.valueOf(f12.floatValue()), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            float f12 = this.f109283q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29137f(f12));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/serp/adapter/location_notification/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeToLocationNotificationActions$2", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class v1 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.serp.adapter.location_notification.a>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109285q;

        public v1() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.serp.adapter.location_notification.a> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            v1 v1Var = new v1(3, continuation);
            v1Var.f109285q = th2;
            return v1Var.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("BxContentPresenter", "Error locationNotificationClickObservable", this.f109285q);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/MiniMenuItem;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/adapter/mini_menu/item/MiniMenuItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$15", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$w, reason: case insensitive filesystem */
    public static final class C28952w extends SuspendLambda implements Y41.p<MiniMenuItem, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109286q;

        public C28952w(Continuation<? super C28952w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28952w c28952w = BxContentFragment.this.new C28952w(continuation);
            c28952w.f109286q = obj;
            return c28952w;
        }

        @Override // Y41.p
        public final Object invoke(MiniMenuItem miniMenuItem, Continuation<? super kotlin.G0> continuation) {
            return ((C28952w) create(miniMenuItem, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            MiniMenuItem miniMenuItem = (MiniMenuItem) this.f109286q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.B(miniMenuItem.f270348d, null, null, null, null, 30, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors;", "colors", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/search_bar/utils/UdfToolbarColors;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$69", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$w0, reason: case insensitive filesystem */
    public static final class C28953w0 extends SuspendLambda implements Y41.p<UdfToolbarColors, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109288q;

        public C28953w0(Continuation<? super C28953w0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28953w0 c28953w0 = BxContentFragment.this.new C28953w0(continuation);
            c28953w0.f109288q = obj;
            return c28953w0;
        }

        @Override // Y41.p
        public final Object invoke(UdfToolbarColors udfToolbarColors, Continuation<? super kotlin.G0> continuation) {
            return ((C28953w0) create(udfToolbarColors, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            UdfToolbarColors udfToolbarColors = (UdfToolbarColors) this.f109288q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.J0(udfToolbarColors));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/a;", "data", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp/adapter/location_notification/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeToLocationNotificationActions$3", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class w1 extends SuspendLambda implements Y41.p<com.avito.android.serp.adapter.location_notification.a, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109290q;

        public w1(Continuation<? super w1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            w1 w1Var = BxContentFragment.this.new w1(continuation);
            w1Var.f109290q = obj;
            return w1Var;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.serp.adapter.location_notification.a aVar, Continuation<? super kotlin.G0> continuation) {
            return ((w1) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.adapter.location_notification.a aVar = (com.avito.android.serp.adapter.location_notification.a) this.f109290q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.H(aVar));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/serp/adapter/mini_menu/item/MiniMenuItem;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$16", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$x, reason: case insensitive filesystem */
    public static final class C28954x extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MiniMenuItem>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109292q;

        public C28954x(Continuation<? super C28954x> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super MiniMenuItem> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            C28954x c28954x = BxContentFragment.this.new C28954x(continuation);
            c28954x.f109292q = th2;
            return c28954x.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f109292q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "cartState", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$6", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$x0, reason: case insensitive filesystem */
    public static final class C28955x0 extends SuspendLambda implements Y41.p<InterfaceC31171n, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109294q;

        public C28955x0(Continuation<? super C28955x0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28955x0 c28955x0 = BxContentFragment.this.new C28955x0(continuation);
            c28955x0.f109294q = obj;
            return c28955x0;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC31171n interfaceC31171n, Continuation<? super kotlin.G0> continuation) {
            return ((C28955x0) create(interfaceC31171n, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC31171n interfaceC31171n = (InterfaceC31171n) this.f109294q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.I0(interfaceC31171n));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/serp/adapter/location_notification/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$subscribeToLocationNotificationActions$4", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class x1 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.serp.adapter.location_notification.a>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f109296q;

        public x1() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.serp.adapter.location_notification.a> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            x1 x1Var = new x1(3, continuation);
            x1Var.f109296q = th2;
            return x1Var.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("BxContentPresenter", "Error locationNotificationVisibilityObservable", this.f109296q);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/visual_rubricator/L;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/visual_rubricator/L;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$17", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$y, reason: case insensitive filesystem */
    public static final class C28956y extends SuspendLambda implements Y41.p<com.avito.android.visual_rubricator.L, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109297q;

        public C28956y(Continuation<? super C28956y> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28956y c28956y = BxContentFragment.this.new C28956y(continuation);
            c28956y.f109297q = obj;
            return c28956y;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.visual_rubricator.L l12, Continuation<? super kotlin.G0> continuation) {
            return ((C28956y) create(l12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            SearchParams searchParams;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.visual_rubricator.L l12 = (com.avito.android.visual_rubricator.L) this.f109297q;
            VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem = l12.f327287a;
            DeepLink f327362e = visualRubricatorWidgetElementItem.getF327362e();
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            PresentationType presentationType = bxContentFragment.Z5().f112645M.a().f112306I;
            if (presentationType.isMain()) {
                if (f327362e instanceof CategoriesLink) {
                    com.avito.android.bxcontent.analytics.a aVar = bxContentFragment.f108952T2;
                    if (aVar == null) {
                        aVar = null;
                    }
                    aVar.e(presentationType);
                } else {
                    com.avito.android.bxcontent.analytics.a aVar2 = bxContentFragment.f108952T2;
                    com.avito.android.bxcontent.analytics.a aVar3 = aVar2 != null ? aVar2 : null;
                    String f327360c = visualRubricatorWidgetElementItem.getF327360c();
                    ItemsSearchLink itemsSearchLink = f327362e instanceof ItemsSearchLink ? (ItemsSearchLink) f327362e : null;
                    aVar3.G(f327360c, (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) ? null : searchParams.getCategoryId(), (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : visualRubricatorWidgetElementItem.getF327368k(), (52 & 32) != 0 ? null : l12.f327288b, presentationType);
                }
            }
            if (f327362e instanceof CategoryTreeLink) {
                C31050j c31050j = bxContentFragment.f109068w3;
                if (c31050j == null) {
                    c31050j = null;
                }
                c31050j.getClass();
                String str = null;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                bxContentFragment.Z5().accept(new InterfaceC29127b.S(new Filter(null, null, new Filter.Widget(WidgetType.CategoryNodes, str, new Filter.Config(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, -1, 458751, null), objArr, objArr2, objArr3, objArr4, 122, 0 == true ? 1 : 0), null, null, str, null, 0 == true ? 1 : 0, new InlineFilterValue.InlineCategoryNodesValue((CategoryTreeLink) f327362e, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 59424, 0 == true ? 1 : 0)));
            } else {
                bxContentFragment.Z5().accept(new InterfaceC29127b.B(f327362e, null, null, null, null, 30, null));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors;", "colors", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/search_bar/utils/UdfToolbarColors;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$70", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$y0, reason: case insensitive filesystem */
    public static final class C28957y0 extends SuspendLambda implements Y41.p<UdfToolbarColors, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109299q;

        public C28957y0(Continuation<? super C28957y0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28957y0 c28957y0 = BxContentFragment.this.new C28957y0(continuation);
            c28957y0.f109299q = obj;
            return c28957y0;
        }

        @Override // Y41.p
        public final Object invoke(UdfToolbarColors udfToolbarColors, Continuation<? super kotlin.G0> continuation) {
            return ((C28957y0) create(udfToolbarColors, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            UdfToolbarColors udfToolbarColors = (UdfToolbarColors) this.f109299q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(new InterfaceC29127b.J0(udfToolbarColors));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/ticket_view/mvi/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/ticket_view/mvi/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y1 extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.ticket_view.mvi.n> {
        public y1() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.ticket_view.mvi.n invoke() {
            com.avito.android.ticket_view.mvi.o oVar = BxContentFragment.this.f108954T4;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.ticket_view.mvi.n) oVar.get();
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/visual_rubricator/L;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$18", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$z, reason: case insensitive filesystem */
    public static final class C28958z extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.visual_rubricator.L>, Throwable, Continuation<? super kotlin.G0>, Object> {
        public C28958z() {
            super(3, null);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.visual_rubricator.L> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            return new C28958z(3, continuation).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.d("BxContent", "Error big visual rubricator clicks");
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$onViewCreated$71", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.BxContentFragment$z0, reason: case insensitive filesystem */
    public static final class C28959z0 extends SuspendLambda implements Y41.p<InterfaceC29127b, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f109302q;

        public C28959z0(Continuation<? super C28959z0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C28959z0 c28959z0 = BxContentFragment.this.new C28959z0(continuation);
            c28959z0.f109302q = obj;
            return c28959z0;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC29127b interfaceC29127b, Continuation<? super kotlin.G0> continuation) {
            return ((C28959z0) create(interfaceC29127b, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC29127b interfaceC29127b = (InterfaceC29127b) this.f109302q;
            C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment.this.Z5().accept(interfaceC29127b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentFragment.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"com/avito/android/bxcontent/l0", "invoke", "()Lcom/avito/android/bxcontent/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z1 extends kotlin.jvm.internal.N implements Y41.a<C29100l0> {
        public z1() {
            super(0);
        }

        @Override // Y41.a
        public final C29100l0 invoke() {
            return new C29100l0(BxContentFragment.this);
        }
    }

    static {
        kotlin.jvm.internal.Y y12 = new kotlin.jvm.internal.Y(BxContentFragment.class, "bxContentView", "getBxContentView()Lcom/avito/android/bxcontent/BxContentView;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f108887w5 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BxContentFragment.class, "replaceMainOnboardingView", "getReplaceMainOnboardingView()Lcom/avito/android/replace_main/onboarding/ReplaceMainOnboardingView;", 0, n0Var)};
        f108886v5 = new C28907a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public BxContentFragment() {
        int i12 = 1;
        super(0, i12, null);
        com.avito.android.bxcontent.mvi.entity.q.f112363s.getClass();
        this.f108946R4 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null), 1, null);
        k1 k1Var = new k1(new A1());
        l1 l1Var = new l1();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new m1(l1Var));
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        this.f108950S4 = new androidx.view.O0(n0Var.b(C29235n.class), new n1(interfaceC42726CB), k1Var, new o1(interfaceC42726CB));
        p1 p1Var = new p1(new y1());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new r1(new q1()));
        this.f108958U4 = new androidx.view.O0(n0Var.b(com.avito.android.ticket_view.mvi.n.class), new s1(interfaceC42726CB2), p1Var, new e1(interfaceC42726CB2));
        f1 f1Var = new f1(new C28924i());
        InterfaceC42726C interfaceC42726CB3 = C42727D.b(lazyThreadSafetyMode, new h1(new g1()));
        this.f108966W4 = new androidx.view.O0(n0Var.b(CX.b.class), new i1(interfaceC42726CB3), f1Var, new j1(interfaceC42726CB3));
        this.f108991c5 = C42727D.c(new W0());
        this.f108995d5 = new C47311a(null, 1, null);
        this.f108999e5 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f109019j5 = new Handler(Looper.getMainLooper());
        this.f109027l5 = C42727D.b(lazyThreadSafetyMode, new z1());
        this.f109031m5 = C42727D.b(lazyThreadSafetyMode, new V0());
        this.f109035n5 = C42727D.b(lazyThreadSafetyMode, new C28926j());
        this.f109039o5 = C42727D.c(new C28922h());
        this.f109043p5 = new HashMap();
        this.f109047q5 = registerForActivityResult(new C28912c(), new C28629h(1));
        this.f109051r5 = new c1();
        this.s5 = new d1();
    }

    public static ArrayList G5(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((com.avito.android.serp.adapter.l1) obj) instanceof AppendingRetryItem)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        C34160q2 c34160q2 = this.f108937P3;
        if (c34160q2 == null) {
            c34160q2 = null;
        }
        c34160q2.getClass();
        kotlin.reflect.n<Object> nVar = C34160q2.f246158g[4];
        if (!((Boolean) c34160q2.f246163f.a().invoke()).booleanValue()) {
            return null;
        }
        View view = getView();
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewWithTag(str) : null;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.e
    public final boolean D3() {
        a.C5436a c5436a;
        Integer num;
        boolean zIsFullMap = Z5().f112645M.a().f112306I.isFullMap();
        com.avito.android.map.mvi.entity.a aVarB = Z5().f112645M.b();
        boolean z12 = false;
        boolean z13 = (aVarB == null || (num = aVarB.f185147A) == null || num.intValue() != 1) ? false : true;
        boolean z14 = Z5().f112645M.a().f112309L == 3;
        com.avito.android.map.mvi.entity.a aVarB2 = Z5().f112645M.b();
        C42822w c42822w = null;
        boolean zF2 = kotlin.jvm.internal.L.f((aVarB2 == null || (c5436a = aVarB2.f185164o) == null) ? null : c5436a.f185183h, HiddenParameter.TYPE);
        if (zIsFullMap && z13 && z14) {
            Z5().accept(new InterfaceC29127b.C29147k(4, z12, 2, c42822w));
            return true;
        }
        if (!zIsFullMap || !z13 || zF2) {
            return false;
        }
        Z5().accept(new InterfaceC25585b.v(HiddenParameter.TYPE));
        return true;
    }

    public final void D5() {
        com.avito.android.bxcontent.mvi.entity.l lVarA = Z5().f112645M.a();
        com.avito.android.bxcontent.Y0 y0K5 = K5();
        com.avito.android.bxcontent.mvi.entity.u uVar = lVarA.f112350n0;
        com.avito.android.bxcontent.analytics.a aVar = this.f108952T2;
        if (aVar == null) {
            aVar = null;
        }
        y0K5.vW(uVar, lVarA.f112349n, aVar);
    }

    @Override // com.avito.android.select.p
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        Zp0.d dVar = this.f109077z3;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(arguments);
    }

    public final boolean E5() {
        com.avito.android.account.E e12 = this.f108925L4;
        if (e12 == null) {
            e12 = null;
        }
        return e12.b() && Z5().f112645M.a().f112306I.isMain();
    }

    public final com.avito.android.lib.beduin_v2.feature.di.H F5(ScreenPerformanceTracker screenPerformanceTracker, ZS.b bVar, cv.d dVar, com.avito.beduin.v2.engine.component.x xVar, C27106d c27106d) {
        return ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed().a(screenPerformanceTracker, bVar, dVar, new com.avito.android.lib.beduin_v2.feature.di.D0((com.avito.android.bxcontent.beduin_v2.di.a) this.f109039o5.getValue()), com.avito.android.lib.beduin_v2.feature.di.K.f176031b, (144 & 32) != 0 ? new C27106d() : c27106d, (144 & 64) != 0 ? new com.avito.beduin.v2.engine.component.x() : xVar, new ZS.c(false));
    }

    @Y61.k
    public final com.avito.android.serp.adapter.suggest_address.h H5() {
        com.avito.android.serp.adapter.suggest_address.h hVar = this.f108982a4;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.home.appending_item.retry.f I5() {
        com.avito.android.home.appending_item.retry.f fVar = this.f108889A3;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    @Y61.k
    public final gj.n J5() {
        gj.n nVar = this.f109041p3;
        if (nVar != null) {
            return nVar;
        }
        return null;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        if (isVisible()) {
            com.avito.android.floating_views.f fVar = this.f108917J0;
            if (fVar == null) {
                fVar = null;
            }
            fVar.f(0, 1, 0, 0, 0);
            K5().yR(false);
        }
    }

    public final com.avito.android.bxcontent.Y0 K5() {
        kotlin.reflect.n<Object> nVar = f108887w5[0];
        return (com.avito.android.bxcontent.Y0) this.f108995d5.a();
    }

    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.featured.navigation.chips.d L5() {
        com.avito.android.serp.adapter.vertical_main.featured.navigation.chips.d dVar = this.f108907G3;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs.d M5() {
        com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs.d dVar = this.f108904F3;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final BxContentArguments O5() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            BxContentArguments bxContentArguments = (BxContentArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arguments", BxContentArguments.class) : arguments.getParcelable("arguments"));
            if (bxContentArguments != null) {
                return bxContentArguments;
            }
        }
        throw new IllegalArgumentException("BxContentArguments must be specified");
    }

    @Y61.k
    public final com.avito.android.serp.adapter.replace_main_widget.j P5() {
        com.avito.android.serp.adapter.replace_main_widget.j jVar = this.f108990c4;
        if (jVar != null) {
            return jVar;
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.home.tabs_item.c Q5() {
        com.avito.android.home.tabs_item.c cVar = this.f108935P0;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.home.tags_item.d R5() {
        com.avito.android.home.tags_item.d dVar = this.f108939Q0;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Y61.k
    public final com.avito.android.rubricator.e S5() {
        com.avito.android.rubricator.e eVar = this.f109020k1;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    @Y61.k
    public final com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Integer>> T5() {
        com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Integer>> dVar = this.f108953T3;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Y61.k
    public final com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Integer>> U5() {
        com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Integer>> dVar = this.f108957U3;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Y61.k
    public final com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Boolean>> V5() {
        com.jakewharton.rxrelay3.d<kotlin.Q<SnippetItem, Boolean>> dVar = this.f108961V3;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<kotlin.G0> aVar3) {
        com.avito.beduin.v2.theme.k kVarA = K5().Iv().a();
        com.avito.android.beduin.v2.page.modal.a aVar4 = com.avito.android.beduin.v2.page.modal.a.f105171a;
        Context contextRequireContext = requireContext();
        aVar4.getClass();
        com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(contextRequireContext, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new C29261w(aVarA, 0);
    }

    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.p Y5() {
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f109048r1;
        if (pVar != null) {
            return pVar;
        }
        return null;
    }

    public final C29235n Z5() {
        return (C29235n) this.f108950S4.getValue();
    }

    public final void a6(boolean z12, boolean z13) {
        View view;
        com.avito.android.lib.util.i.f181373a.getClass();
        if (!com.avito.android.lib.util.i.f181377e || com.avito.android.ui.status_bar.c.a(this) || (view = getView()) == null) {
            return;
        }
        PresentationType presentationType = O5().f108868g;
        Set setL0 = presentationType.isFullMap() ? C42756l.l0(new Integer[]{Integer.valueOf(com.avito.android.R.id.bx_appbar), Integer.valueOf(com.avito.android.R.id.search_view_container), Integer.valueOf(com.avito.android.R.id.shortcuts_scroll_layout), Integer.valueOf(com.avito.android.R.id.bx_content_bottom_sheet)}) : presentationType.isMain() ? Collections.singleton(Integer.valueOf(com.avito.android.R.id.search_view_container)) : C42756l.l0(new Integer[]{Integer.valueOf(com.avito.android.R.id.bx_appbar), Integer.valueOf(com.avito.android.R.id.search_view_container)});
        Set setSingleton = presentationType.isFullMap() ? Collections.singleton(Integer.valueOf(com.avito.android.R.id.map)) : C42756l.l0(new Integer[]{Integer.valueOf(com.avito.android.R.id.map), Integer.valueOf(com.avito.android.R.id.bx_content_feature_root)});
        LinkedHashSet linkedHashSetH = kotlin.collections.b1.h(setL0, setSingleton);
        int iF2 = kotlin.collections.P0.f(C42745f0.q(linkedHashSetH, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : linkedHashSetH) {
            linkedHashMap.put(obj, view.findViewById(((Number) obj).intValue()));
        }
        com.avito.android.ui.status_bar.a.f304645Z1.getClass();
        View viewFindViewById = view.findViewById(com.avito.android.R.id.edge_to_edge_fake_status_bar);
        com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
        C28920g c28920g = new C28920g(linkedHashMap, viewFindViewById, view, z12, setSingleton, z13);
        iVar.getClass();
        C22823h0.K(view, new com.avito.android.lib.util.h(view, c28920g, 0, 0, 0, 0, false));
        com.avito.android.lib.util.i.f(iVar, view);
        C22823h0.A(view);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.l
    public final boolean b0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        if (navigationTabSetItem == NavigationTab.f106970f) {
            return Z5().f112645M.a().f112306I.isMain();
        }
        if (navigationTabSetItem == NavigationTab.f106975k) {
            return C35800g5.c(new C35792f5(Z5().f112646N.getValue().f111141a.f112304G));
        }
        return false;
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b6(com.avito.android.floating_views.FloatingViewsPresenter.Subscriber.b r10, com.avito.android.remote.model.NavigationBarStyle.DisplayType r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.b6(com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$b, com.avito.android.remote.model.NavigationBarStyle$DisplayType):void");
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        View viewFindViewById = requireView().findViewById(com.avito.android.R.id.search_view_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        o.a aVar = new o.a(requireView(), ToastBarPosition.f181044b);
        View viewFindViewById2 = viewFindViewById.findViewById(com.avito.android.R.id.toolbar_container);
        if (viewFindViewById2 != null) {
            return new gj.o(aVar, new o.a(viewFindViewById2, ToastBarPosition.f181045c));
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink c6(com.avito.android.deep_linking.links.DeepLink r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.c6(com.avito.android.deep_linking.links.DeepLink, boolean):com.avito.android.deep_linking.links.DeepLink");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        C28918f c28918f = new C28918f();
        kotlin.collections.builders.b bVarT = C42745f0.t();
        PresentationType presentationType = Z5().f112645M.a().f112306I;
        bVarT.add(new C28914d(presentationType));
        if (!presentationType.isMain()) {
            bVarT.add(new C28916e());
        }
        return new com.avito.android.ui.c(c28918f, C42745f0.p(bVarT));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d6() {
        String string;
        HomeTabItem homeTabItem;
        SectionTag sectionTag;
        List<SectionTag> list;
        Object next;
        Object obj;
        Object next2;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("extra_open_section_tab")) != null) {
            com.avito.android.serp.adapter.home_section_tab.a aVar = Z5().f112645M.a().f112329d;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (aVar == null || (obj = aVar.f270159b) == null) {
                homeTabItem = null;
            } else {
                Iterator it = ((Iterable) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it.next();
                        if (kotlin.jvm.internal.L.f(((HomeTabItem) next2).getFeedId(), string)) {
                            break;
                        }
                    }
                }
                homeTabItem = (HomeTabItem) next2;
            }
            SectionTagsItem sectionTagsItem = Z5().f112645M.a().f112331e;
            if (sectionTagsItem == null || (list = sectionTagsItem.f270152d) == null) {
                sectionTag = null;
            } else {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (kotlin.jvm.internal.L.f(((SectionTag) next).f270145c, string)) {
                            break;
                        }
                    }
                }
                sectionTag = (SectionTag) next;
            }
            if (homeTabItem != null) {
                Z5().accept(new InterfaceC29127b.C29128a(homeTabItem.getFeedId(), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
            }
            if (sectionTag != null) {
                C29235n c29235nZ5 = Z5();
                String str = sectionTag.f270147e;
                c29235nZ5.accept(new InterfaceC29127b.C29128a(sectionTag.f270145c, str.length() > 0 ? str : null));
            }
        }
        l6();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        a.g gVarE5 = super.e5();
        com.avito.android.async_phone.A a12 = this.f108976Z0;
        if (a12 == null) {
            a12 = null;
        }
        return new com.avito.android.deeplink_handler.view.impl.c((com.avito.android.deeplink_handler.view.impl.i) gVarE5, Collections.singletonList(a12));
    }

    public final void e6(DeepLink deepLink, boolean z12) {
        if (!(deepLink instanceof ItemsSearchLink)) {
            C29235n c29235nZ5 = Z5();
            InterfaceC31062w interfaceC31062w = this.f108996e1;
            c29235nZ5.accept(new InterfaceC29127b.B(deepLink, null, null, null, (interfaceC31062w != null ? interfaceC31062w : null).W0(), 14, null));
        } else {
            if (((ItemsSearchLink) deepLink).f133413l.isMap() && Z5().f112645M.a().f112306I.isMap()) {
                DeepLink deepLinkC6 = c6(deepLink, z12);
                C29235n c29235nZ52 = Z5();
                InterfaceC31062w interfaceC31062w2 = this.f108996e1;
                c29235nZ52.accept(new InterfaceC29127b.C29163w(deepLinkC6, (interfaceC31062w2 != null ? interfaceC31062w2 : null).W0(), true, null, 8, null));
                Z5().accept(new InterfaceC25585b.C25592h(deepLinkC6, z12));
                return;
            }
            if (Z5().f112645M.a().f112306I.isMain()) {
                K5().t2();
            }
            C29235n c29235nZ53 = Z5();
            InterfaceC31062w interfaceC31062w3 = this.f108996e1;
            c29235nZ53.accept(new InterfaceC29127b.B(deepLink, null, null, null, (interfaceC31062w3 != null ? interfaceC31062w3 : null).W0(), 14, null));
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28880b
    @Y61.k
    public final String f2() {
        return Z5().f112645M.a().f112306I.name().toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    public final void f6() {
        InterfaceC44438a interfaceC44438a = this.f108918J3;
        if (interfaceC44438a == null) {
            interfaceC44438a = null;
        }
        interfaceC44438a.f0();
        com.avito.android.bxcontent.toolbar_helper.a aVar = this.f108915I3;
        (aVar != null ? aVar : null).b((InterfaceC44440c) this.f109035n5.getValue());
    }

    public final boolean g6() {
        C36135w2 c36135w2 = this.f108993d3;
        if (c36135w2 == null) {
            c36135w2 = null;
        }
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[31];
        return ((Boolean) c36135w2.f327459B.a().getValue()).booleanValue() && Z5().f112645M.a().f112306I.isMain();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    public final void h6(com.avito.android.bxcontent.mvi.entity.x xVar, boolean z12, boolean z13) {
        ViewGroup viewGroup;
        if (z12) {
            com.avito.android.hero_banner.widget.g gVar = this.f108902E4;
            (gVar != null ? gVar : null).d3(z13);
            a6(true, !z13);
            return;
        }
        K5().DM();
        View view = getView();
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(com.avito.android.R.id.bx_appbar)) != null) {
            View viewFindViewById = viewGroup.findViewById(com.avito.android.R.id.hero_banner_collapsing_toolbar);
            if (viewGroup.indexOfChild(viewFindViewById) != 0) {
                viewGroup.removeView(viewFindViewById);
                viewGroup.addView(viewFindViewById, 0);
            }
        }
        com.avito.android.hero_banner.widget.g gVar2 = this.f108902E4;
        (gVar2 != null ? gVar2 : null).z3(xVar.f112442a, xVar.f112443b, z13);
        a6(true, true);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        a.C5436a c5436a;
        Integer num;
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f109048r1;
        if (pVar == null) {
            pVar = null;
        }
        pVar.i0();
        boolean zIsFullMap = Z5().f112645M.a().f112306I.isFullMap();
        com.avito.android.map.mvi.entity.a aVarB = Z5().f112645M.b();
        boolean z12 = (aVarB == null || (num = aVarB.f185147A) == null || num.intValue() != 1) ? false : true;
        boolean z13 = Z5().f112645M.a().f112309L == 3;
        com.avito.android.map.mvi.entity.a aVarB2 = Z5().f112645M.b();
        boolean zF2 = kotlin.jvm.internal.L.f((aVarB2 == null || (c5436a = aVarB2.f185164o) == null) ? null : c5436a.f185183h, HiddenParameter.TYPE);
        if (!zIsFullMap || !z12 || (!z13 && zF2)) {
            Z5().accept(new InterfaceC29127b.C29139g(false));
        }
        C29255u c29255u = this.f109059t5;
        if (c29255u != null) {
            com.avito.android.lib.design.tooltip.k kVar = c29255u.f113014c;
            if (kVar != null) {
                kVar.dismiss();
            }
            c29255u.f113014c = null;
        }
        return false;
    }

    public final void i6() {
        if (p6()) {
            return;
        }
        InterfaceC34826e interfaceC34826e = this.f108969X2;
        if (interfaceC34826e == null) {
            interfaceC34826e = null;
        }
        interfaceC34826e.m(new Z0());
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC31062w interfaceC31062w = this.f108996e1;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.q(list);
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f109048r1;
        (pVar != null ? pVar : null).k(str, list);
    }

    public final void k6(com.avito.android.bxcontent.mvi.entity.z zVar, boolean z12, boolean z13) {
        ViewGroup viewGroup;
        if (z12) {
            com.avito.android.bxcontent.search_bar_promo_widget.d dVar = this.f108899D4;
            (dVar != null ? dVar : null).d3(z13);
            a6(true, !z13);
            return;
        }
        View view = getView();
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(com.avito.android.R.id.bx_appbar)) != null) {
            View viewFindViewById = viewGroup.findViewById(com.avito.android.R.id.collapsing_toolbar_promo_banner);
            if (viewGroup.indexOfChild(viewFindViewById) != 0) {
                viewGroup.removeView(viewFindViewById);
                viewGroup.addView(viewFindViewById, 0);
            }
        }
        com.avito.android.bxcontent.search_bar_promo_widget.d dVar2 = this.f108899D4;
        (dVar2 != null ? dVar2 : null).j3(zVar.f112446a, zVar.f112447b, z13);
        a6(true, true);
    }

    public final void l6() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("extra_message")) == null) {
            return;
        }
        View view = getView();
        if (view == null || !D6.x(view)) {
            View view2 = getView();
            if (view2 != null) {
                view2.addOnLayoutChangeListener(new b1(view2, this));
            }
        } else {
            View view3 = getView();
            if (view3 != null) {
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view3, com.avito.android.printable_text.b.f(string), null, null, null, null, 0, ToastBarPosition.f181047e, null, false, false, null, null, 4030);
            }
        }
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        if (!Z5().f112645M.a().f112307J.getIsForceThemeAvitoRe23()) {
            C36135w2 c36135w2 = this.f108993d3;
            if (c36135w2 == null) {
                c36135w2 = null;
            }
            c36135w2.getClass();
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[35];
            if (!((Boolean) c36135w2.f327463F.a().invoke()).booleanValue()) {
                return null;
            }
        }
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(com.avito.android.R.style.Theme_DesignSystem_Re23));
    }

    public final void m6() {
        C31100l2 c31100l2;
        io.reactivex.rxjava3.core.z<ShareButtonEvent> zVar;
        com.avito.android.serp.adapter.search_bar.M m12 = this.f109003f5;
        if (m12 == null || (c31100l2 = m12.f271603d) == null || (zVar = c31100l2.f174881u) == null) {
            return;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.o(this, new C43197r1(new t1(null), kotlinx.coroutines.rx3.y.a(zVar)));
    }

    public final void n6() {
        if (Z5().f112645M.a().f112306I.isMain()) {
            com.jakewharton.rxrelay3.d<com.avito.android.serp.adapter.location_notification.a> dVar = this.f108924L3;
            if (dVar == null) {
                dVar = null;
            }
            C43175k.K(new C43152f0(new C43197r1(new u1(null), kotlinx.coroutines.rx3.y.a(dVar)), new v1(3, null)), C22984Q.a(getViewLifecycleOwner()));
            com.jakewharton.rxrelay3.d<com.avito.android.serp.adapter.location_notification.a> dVar2 = this.f108927M3;
            if (dVar2 == null) {
                dVar2 = null;
            }
            C43175k.K(new C43152f0(new C43197r1(new w1(null), kotlinx.coroutines.rx3.y.a(dVar2)), new x1(3, null)), C22984Q.a(getViewLifecycleOwner()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o6() {
        /*
            r5 = this;
            u3.l<com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup> r0 = r5.f108908G4
            r1 = 0
            if (r0 == 0) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            u3.m<T> r0 = r0.f439745a
            T r0 = r0.f439749b
            com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup r0 = (com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup) r0
            r0.getClass()
            com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup r2 = com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup.f255684c
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L18
            r0 = r4
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 != 0) goto L2f
            u3.h<com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup> r0 = r5.f108916I4
            if (r0 == 0) goto L20
            goto L21
        L20:
            r0 = r1
        L21:
            u3.m<T> r0 = r0.f439744a
            T r0 = r0.f439749b
            com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup r0 = (com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup) r0
            r0.getClass()
            com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup r2 = com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup.f255680c
            if (r0 == r2) goto L2f
            goto L41
        L2f:
            u3.l<com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup> r0 = r5.f108913H4
            if (r0 == 0) goto L34
            r1 = r0
        L34:
            u3.m<T> r0 = r1.f439745a
            T r0 = r0.f439749b
            com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup r0 = (com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup) r0
            r0.getClass()
            com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup r1 = com.avito.android.loyalty_program.ab_tests.LoyaltyProgramTestGroup.f184150e
            if (r0 != r1) goto L43
        L41:
            r0 = r4
            goto L44
        L43:
            r0 = r3
        L44:
            com.avito.android.bxcontent.n r1 = r5.Z5()
            com.avito.android.bxcontent.d r1 = r1.f112645M
            com.avito.android.bxcontent.mvi.entity.l r1 = r1.a()
            com.avito.android.remote.model.PresentationType r1 = r1.f112306I
            boolean r1 = r1.isMap()
            if (r1 != 0) goto L7c
            com.avito.android.bxcontent.n r1 = r5.Z5()
            com.avito.android.bxcontent.d r1 = r1.f112645M
            com.avito.android.bxcontent.mvi.entity.l r1 = r1.a()
            com.avito.android.remote.model.SearchParams r1 = r1.f112345l
            java.lang.String r1 = r1.getCategoryId()
            java.lang.String r2 = "111"
            boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
            if (r1 != 0) goto L7c
            boolean r1 = r5.E5()
            if (r1 == 0) goto L76
            if (r0 != 0) goto L7c
        L76:
            boolean r0 = r5.v5()
            if (r0 == 0) goto L7d
        L7c:
            r3 = r4
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.o6():boolean");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        Location location;
        super.onActivityResult(i12, i13, intent);
        boolean z12 = i13 == -1;
        if (i12 == 1) {
            if (intent != null) {
                location = (Location) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("location", Location.class) : intent.getParcelableExtra("location"));
            } else {
                location = null;
            }
            if (z12) {
                h31.e<com.avito.android.home.default_search_location.f> eVar = this.f108959V0;
                (eVar != null ? eVar : null).get().a(location);
                return;
            }
            return;
        }
        if (i12 != 2) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        DealConfirmationSheetActivity.f132774r.getClass();
        String stringExtra = intent != null ? intent.getStringExtra("result_key.message") : null;
        if (stringExtra != null) {
            com.avito.android.deal_confirmation.d dVar = this.f108948S2;
            (dVar != null ? dVar : null).d(stringExtra);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        com.avito.android.ui.status_bar.k kVar;
        super.onCreate(bundle);
        FV0.i.a((Collection) this.f108991c5.getValue(), this);
        getParentFragmentManager().p0("REQUEST_ITEM_SELECTION_KEY", this, new C28962a1(this, 5));
        com.avito.android.ui.status_bar.e eVar = this.f108994d4;
        if (eVar == null) {
            eVar = null;
        }
        C47677a c47677a = this.f108998e4;
        if (c47677a == null) {
            c47677a = null;
        }
        InterfaceC44438a interfaceC44438a = this.f108918J3;
        if (interfaceC44438a == null) {
            interfaceC44438a = null;
        }
        com.avito.android.hero_banner.widget.g gVar = this.f108902E4;
        if (gVar == null) {
            gVar = null;
        }
        if (!g6() ? (kVar = this.f108915I3) == null : (kVar = this.f108899D4) == null) {
            kVar = null;
        }
        com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.a aVar = this.f109045q3;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.a aVar2 = this.f109049r3;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.a aVar3 = this.f109053s3;
        if (aVar3 == null) {
            aVar3 = null;
        }
        com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.a aVar4 = this.f109057t3;
        eVar.c(this, C42745f0.U(c47677a, interfaceC44438a, gVar, kVar, aVar, aVar2, aVar3, aVar4 != null ? aVar4 : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    @Override // androidx.fragment.app.Fragment
    @Y61.l
    @android.annotation.SuppressLint({"SourceLockedOrientationActivity"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r7, @Y61.l android.view.ViewGroup r8, @Y61.l android.os.Bundle r9) {
        /*
            r6 = this;
            com.avito.android.bxcontent.BxContentArguments r9 = r6.O5()
            com.avito.android.remote.model.PresentationType r9 = r9.f108868g
            boolean r9 = r9.isFullMap()
            r0 = 3
            r1 = 0
            r2 = 0
            if (r9 == 0) goto L36
            com.avito.android.q2 r9 = r6.f108937P3
            if (r9 == 0) goto L14
            goto L15
        L14:
            r9 = r1
        L15:
            r9.getClass()
            kotlin.reflect.n<java.lang.Object>[] r3 = com.avito.android.C34160q2.f246158g
            r3 = r3[r0]
            com.avito.android.A0$a r9 = r9.f246162e
            DE0.a r9 = r9.a()
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L36
            r9 = 2131559424(0x7f0d0400, float:1.8744192E38)
            android.view.View r7 = r7.inflate(r9, r8, r2)
            goto L3d
        L36:
            r9 = 2131559423(0x7f0d03ff, float:1.874419E38)
            android.view.View r7 = r7.inflate(r9, r8, r2)
        L3d:
            com.avito.android.bxcontent.analytics.g r8 = r6.f109005g3
            if (r8 == 0) goto L42
            goto L43
        L42:
            r8 = r1
        L43:
            r8.e()
            r8 = 2131370107(0x7f0a207b, float:1.8360211E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            Cm0.c r9 = r6.f108971X4
            if (r9 == 0) goto L54
            goto L55
        L54:
            r9 = r1
        L55:
            Cm0.c$a r2 = new Cm0.c$a
            android.content.Context r3 = r7.getContext()
            com.avito.android.bxcontent.K r4 = new com.avito.android.bxcontent.K
            r4.<init>(r6)
            r2.<init>(r3, r4)
            Cm0.b r9 = r9.a(r2)
            qK0.c r2 = r6.f108999e5
            kotlin.reflect.n<java.lang.Object>[] r3 = com.avito.android.bxcontent.BxContentFragment.f108887w5
            r4 = 1
            r5 = r3[r4]
            r2.b(r6, r9)
            r9 = r3[r4]
            java.lang.Object r9 = r2.a()
            Cm0.b r9 = (Cm0.InterfaceC13325b) r9
            android.view.View r9 = r9.getF254526a()
            r8.addView(r9)
            androidx.lifecycle.P r8 = r6.getViewLifecycleOwner()
            androidx.lifecycle.J r8 = androidx.view.C22984Q.a(r8)
            com.avito.android.bxcontent.BxContentFragment$k r9 = new com.avito.android.bxcontent.BxContentFragment$k
            r9.<init>(r1)
            kotlinx.coroutines.C43259k.d(r8, r1, r1, r9, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FV0.i.b((Collection) this.f108991c5.getValue());
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f109051r5.f109173a = null;
        this.s5.f109179a = null;
        this.f109003f5 = null;
        this.f109007g5 = null;
        com.avito.android.floating_views.f fVar = this.f108917J0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a();
        com.avito.android.favorite.n nVar = this.f108920K0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.I();
        com.avito.android.advertising.kebab.f fVar2 = this.f108923L0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        fVar2.b(null);
        com.avito.android.favorite_apprater.g gVar = this.f109006g4;
        if (gVar == null) {
            gVar = null;
        }
        gVar.e0();
        com.avito.android.video_snippets.g gVar2 = this.f108965W3;
        if (gVar2 == null) {
            gVar2 = null;
        }
        gVar2.g();
        com.avito.android.stories.adapter.k kVar = this.f109024l1;
        if (kVar == null) {
            kVar = null;
        }
        kVar.e0();
        InterfaceC31062w interfaceC31062w = this.f108996e1;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.I();
        InterfaceC28616b interfaceC28616b = this.f108972Y0;
        if (interfaceC28616b == null) {
            interfaceC28616b = null;
        }
        interfaceC28616b.e0();
        com.avito.android.favorite_apprater.g gVar3 = this.f109006g4;
        if (gVar3 == null) {
            gVar3 = null;
        }
        gVar3.e0();
        com.avito.android.serp.adapter.closable.c cVar = this.f108951T0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.e0();
        com.avito.android.advert_collection_toast.a aVar = this.f108956U2;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        h31.e<com.avito.android.map.view.adverts_in_pin.b> eVar = this.f109013i3;
        if (eVar == null) {
            eVar = null;
        }
        eVar.get().a();
        com.avito.android.bxcontent.utils.d dVar = this.f109066v4;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a();
        com.avito.android.visual_rubricator.Q q12 = this.f109065v3;
        if (q12 == null) {
            q12 = null;
        }
        q12.invalidate();
        InterfaceC29247r0 interfaceC29247r0 = this.f108932O0;
        if (interfaceC29247r0 == null) {
            interfaceC29247r0 = null;
        }
        interfaceC29247r0.e0();
        com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.a aVar2 = this.f109045q3;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.f0();
        com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.a aVar3 = this.f109057t3;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.f0();
        com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.a aVar4 = this.f109049r3;
        if (aVar4 == null) {
            aVar4 = null;
        }
        aVar4.f0();
        com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.a aVar5 = this.f109053s3;
        if (aVar5 == null) {
            aVar5 = null;
        }
        aVar5.f0();
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f109048r1;
        if (pVar == null) {
            pVar = null;
        }
        pVar.e0();
        com.avito.android.bxcontent.toolbar_helper.a aVar6 = this.f108915I3;
        if (aVar6 == null) {
            aVar6 = null;
        }
        aVar6.f0();
        InterfaceC44438a interfaceC44438a = this.f108918J3;
        if (interfaceC44438a == null) {
            interfaceC44438a = null;
        }
        interfaceC44438a.f0();
        com.avito.android.serp.adapter.vertical_main.q qVar = this.f109052s1;
        if (qVar == null) {
            qVar = null;
        }
        qVar.e0();
        com.avito.android.serp.adapter.slider.g gVar4 = this.f108921K3;
        if (gVar4 == null) {
            gVar4 = null;
        }
        gVar4.f2();
        com.avito.android.serp.adapter.Y0 y02 = this.f108891B0;
        if (y02 == null) {
            y02 = null;
        }
        y02.f(null);
        com.avito.android.bxcontent.analytics.g gVar5 = this.f109005g3;
        if (gVar5 == null) {
            gVar5 = null;
        }
        gVar5.stop();
        C31642f c31642f = this.f109011h5;
        if (c31642f != null) {
            c31642f.f185498b.removeOnLayoutChangeListener(c31642f.f185531r0);
            c31642f.f185506f.destroy();
            c31642f.f185502d.a();
        }
        com.avito.android.bxcontent.shared_listeners.a aVar7 = this.f109074y3;
        if (aVar7 == null) {
            aVar7 = null;
        }
        aVar7.a();
        com.avito.android.serp.adapter.mini_menu.h hVar = this.f109061u3;
        if (hVar == null) {
            hVar = null;
        }
        hVar.clear();
        com.avito.android.pinch_to_zoom.b bVar = this.f108922K4;
        if (bVar == null) {
            bVar = null;
        }
        bVar.e((ViewGroup) requireActivity().getWindow().getDecorView());
        com.avito.android.serp.adapter.search_bar.O o12 = this.f108973Y2;
        if (o12 == null) {
            o12 = null;
        }
        o12.e0();
        com.avito.android.bxcontent.search_bar_promo_widget.d dVar2 = this.f108899D4;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.f0();
        com.avito.android.advert_favorites_toast.a aVar8 = this.f108934O4;
        if (aVar8 == null) {
            aVar8 = null;
        }
        aVar8.a();
        com.avito.android.lib.design.toast_bar.k kVar2 = this.f109015i5;
        if (kVar2 != null) {
            kVar2.f();
        }
        com.avito.android.bx_beduin_native_items.c cVar2 = this.f109067w0;
        (cVar2 != null ? cVar2 : null).onDestroyView();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Z5().accept(InterfaceC25585b.z.f57162a);
        InterfaceC31062w interfaceC31062w = this.f108996e1;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.onPause();
        InterfaceC29247r0 interfaceC29247r0 = this.f108932O0;
        (interfaceC29247r0 != null ? interfaceC29247r0 : null).onPause();
        super.onPause();
        Z5().accept(InterfaceC29127b.M.f112097a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        com.avito.android.bxcontent.shared_listeners.a aVar = this.f109074y3;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(aVar.b(), C22984Q.a(getViewLifecycleOwner()));
        super.onResume();
        Z5().accept(InterfaceC25585b.F.f57124a);
        com.avito.android.deal_confirmation.d dVar = this.f108948S2;
        if (dVar == null) {
            dVar = null;
        }
        dVar.onResume();
        InterfaceC29247r0 interfaceC29247r0 = this.f108932O0;
        if (interfaceC29247r0 == null) {
            interfaceC29247r0 = null;
        }
        interfaceC29247r0.onResume();
        InterfaceC31062w interfaceC31062w = this.f108996e1;
        (interfaceC31062w != null ? interfaceC31062w : null).onResume();
        Z5().accept(InterfaceC29127b.F0.f112079a);
        Z5().accept(InterfaceC29127b.N.f112099a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.getRequestedOrientation();
        }
        Bundle bundle2 = new Bundle(25);
        bundle2.putParcelable("key_location", Z5().f112645M.a().f112343k);
        com.avito.android.bxcontent.call.a aVar = this.f108967X0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.getClass();
        bundle2.putParcelable("dialogs_after_call_state", new DialogsAfterCallState(aVar.f109646c, aVar.f109647d));
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f109064v0;
        if (bVar == null) {
            bVar = null;
        }
        bundle2.putBundle("key_item_visibility_tracker_state", bVar.d0());
        com.avito.android.bx_beduin_native_items.c cVar = this.f109067w0;
        if (cVar == null) {
            cVar = null;
        }
        bundle2.putBundle("key_beduin_native_item_visibility_tracker_state", cVar.d0());
        InterfaceC31062w interfaceC31062w = this.f108996e1;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        bundle2.putParcelable("inline_filters_state", interfaceC31062w.d0());
        com.avito.android.serp.adapter.advert_xl.z zVar = this.f108963W0;
        if (zVar == null) {
            zVar = null;
        }
        bundle2.putParcelable("advert_xl_state", zVar.d0());
        com.avito.android.serp.adapter.constructor.A a12 = this.f108980a1;
        if (a12 == null) {
            a12 = null;
        }
        bundle2.putParcelable("constructor_advert_state", a12.d0());
        com.avito.android.serp.adapter.rich_snippets.j jVar = this.f108984b1;
        if (jVar == null) {
            jVar = null;
        }
        bundle2.putParcelable("advert_rich_state", jVar.d0());
        com.avito.android.serp.warning.g gVar = this.f108988c1;
        if (gVar == null) {
            gVar = null;
        }
        gVar.getClass();
        WarningStateProviderState warningStateProviderState = new WarningStateProviderState(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
        for (com.avito.android.serp.warning.h hVar : gVar.f273977a) {
            warningStateProviderState.f273971b.put(hVar.name(), hVar.d0());
        }
        bundle2.putParcelable("warning_state_provider_state", warningStateProviderState);
        com.avito.android.serp.adapter.witcher.r rVar = this.f109000f1;
        if (rVar == null) {
            rVar = null;
        }
        bundle2.putParcelable("state_witcher", rVar.getF273739g());
        com.avito.android.advertising.adapter.items.buzzoola.premium.r rVar2 = this.f108992d1;
        if (rVar2 == null) {
            rVar2 = null;
        }
        bundle2.putParcelable("commercial_state", rVar2.d0());
        com.avito.android.stories.t tVar = this.f109036o1;
        if (tVar == null) {
            tVar = null;
        }
        bundle2.putParcelable("stories_session_viewed_state", tVar.getF285298a());
        com.avito.android.serp.adapter.brandspace_widget.i iVar = this.f109044q1;
        if (iVar == null) {
            iVar = null;
        }
        bundle2.putParcelable("state_brandspace", iVar.getF269064e());
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f109048r1;
        if (pVar == null) {
            pVar = null;
        }
        bundle2.putParcelable("vertical_filter_state", pVar.d0());
        com.avito.android.serp.adapter.vertical_main.q qVar = this.f109052s1;
        if (qVar == null) {
            qVar = null;
        }
        bundle2.putParcelable("vertical_publish_state", qVar.d0());
        com.avito.android.serp.adapter.reformulations.j jVar2 = this.f109016j1;
        if (jVar2 == null) {
            jVar2 = null;
        }
        bundle2.putBundle("reformulations_state", jVar2.getF270642g());
        com.avito.android.deal_confirmation.d dVar = this.f108948S2;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.util.G.c(bundle2, "deal_confirmation_state", dVar.d0());
        InterfaceC13095a interfaceC13095a = this.f109056t1;
        if (interfaceC13095a == null) {
            interfaceC13095a = null;
        }
        bundle2.putParcelable("disclaimer_pd_viewed_state", interfaceC13095a.getF708a());
        rs0.c cVar2 = this.f109040p1;
        if (cVar2 == null) {
            cVar2 = null;
        }
        bundle2.putParcelable("horizontal_widget_state", cVar2.getF430270a());
        ProgressInfoToastBarPresenter progressInfoToastBarPresenter = this.f108911H2;
        if (progressInfoToastBarPresenter == null) {
            progressInfoToastBarPresenter = null;
        }
        bundle2.putParcelable("vacancy_respond_toast_bar_state", progressInfoToastBarPresenter.getState());
        com.avito.android.serp.adapter.carousel_widget.I i12 = this.f109028m1;
        if (i12 == null) {
            i12 = null;
        }
        bundle2.putParcelable("carousel_items_widget_state", i12.getF269311d());
        com.avito.android.serp.adapter.vertical_main.usp_banner_widget.g gVar2 = this.f109032n1;
        if (gVar2 == null) {
            gVar2 = null;
        }
        com.avito.android.util.G.c(bundle2, "usp_banners_widget_state", gVar2.getF273356d());
        com.avito.android.floating_views.f fVar = this.f108917J0;
        if (fVar == null) {
            fVar = null;
        }
        bundle2.putBundle("floating_views_presenter_state", fVar.d0());
        com.avito.android.bxcontent.utils.d dVar2 = this.f109066v4;
        if (dVar2 == null) {
            dVar2 = null;
        }
        com.avito.android.util.G.c(bundle2, "bx_content_presenter_state_key", dVar2.H());
        WQ.c cVar3 = this.f108979Z4;
        HashSet f111000a = (cVar3 != null ? cVar3 : null).getF111000a();
        ArrayList arrayList = new ArrayList();
        Iterator it = f111000a.iterator();
        while (it.hasNext()) {
            XQ.b bVarD0 = ((XQ.a) it.next()).d0();
            if (bVarD0 != null) {
                arrayList.add(bVarD0);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            XQ.b bVar2 = (XQ.b) it2.next();
            bVar2.getClass();
            bundle2.putBundle("category_widget_item_state", bVar2.f18882a);
        }
        z5(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.permissions.q qVar = this.f108912H3;
        if (qVar == null) {
            qVar = null;
        }
        qVar.g(this);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f108914I0;
        this.f109023k5 = (io.reactivex.rxjava3.internal.observers.y) (aVar != null ? aVar : null).d9().t0(new C28930l());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC29247r0 interfaceC29247r0 = this.f108932O0;
        if (interfaceC29247r0 == null) {
            interfaceC29247r0 = null;
        }
        interfaceC29247r0.onStop();
        com.avito.android.permissions.q qVar = this.f108912H3;
        if (qVar == null) {
            qVar = null;
        }
        qVar.a();
        this.f109019j5.removeCallbacksAndMessages(null);
        io.reactivex.rxjava3.internal.observers.y yVar = this.f109023k5;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f109023k5 = null;
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0473  */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(@Y61.k android.view.View r62, @Y61.l android.os.Bundle r63) {
        /*
            Method dump skipped, instructions count: 3880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.BxContentFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.avito.android.bxcontent.y] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Location location;
        Kundle kundle;
        Kundle kundle2;
        Kundle kundle3;
        WarningStateProviderState warningStateProviderState;
        Kundle kundle4;
        DialogsAfterCallState dialogsAfterCallState;
        Kundle kundle5;
        Kundle kundle6;
        Kundle kundle7;
        Kundle kundle8;
        Bundle bundle2;
        DialogsAfterCallState dialogsAfterCallState2;
        Kundle kundle9;
        Kundle kundle10;
        VerticalFilterState verticalFilterState;
        VerticalFilterState verticalFilterState2;
        VerticalPublishState verticalPublishState;
        Kundle kundle11;
        Kundle kundle12;
        Kundle kundle13;
        ProgressInfoToastBarPresenter.State state;
        Bundle bundle3;
        Kundle kundle14;
        Bundle bundle4;
        Kundle kundleA;
        Screen screen;
        SearchParams searchParamsCopy;
        Area area;
        String str;
        Bundle bundleW5 = w5();
        BxContentArguments bxContentArgumentsO5 = O5();
        if (bundleW5 != null) {
            location = (Location) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("key_location", Location.class) : bundleW5.getParcelable("key_location"));
        } else {
            location = null;
        }
        if (bundleW5 != null) {
            kundle = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("advert_xl_state", Kundle.class) : bundleW5.getParcelable("advert_xl_state"));
        } else {
            kundle = null;
        }
        if (bundleW5 != null) {
            kundle2 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("constructor_advert_state", Kundle.class) : bundleW5.getParcelable("constructor_advert_state"));
        } else {
            kundle2 = null;
        }
        if (bundleW5 != null) {
            kundle3 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("advert_rich_state", Kundle.class) : bundleW5.getParcelable("advert_rich_state"));
        } else {
            kundle3 = null;
        }
        if (bundleW5 != null) {
            warningStateProviderState = (WarningStateProviderState) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("warning_state_provider_state", WarningStateProviderState.class) : bundleW5.getParcelable("warning_state_provider_state"));
        } else {
            warningStateProviderState = null;
        }
        if (bundleW5 != null) {
            kundle4 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("inline_filters_state", Kundle.class) : bundleW5.getParcelable("inline_filters_state"));
        } else {
            kundle4 = null;
        }
        if (bundleW5 != null) {
            dialogsAfterCallState = (DialogsAfterCallState) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("dialogs_after_call_state", DialogsAfterCallState.class) : bundleW5.getParcelable("dialogs_after_call_state"));
        } else {
            dialogsAfterCallState = null;
        }
        if (bundleW5 != null) {
            kundle5 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("state_witcher", Kundle.class) : bundleW5.getParcelable("state_witcher"));
        } else {
            kundle5 = null;
        }
        if (bundleW5 != null) {
            kundle6 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("state_brandspace", Kundle.class) : bundleW5.getParcelable("state_brandspace"));
        } else {
            kundle6 = null;
        }
        if (bundleW5 != null) {
            kundle7 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("stories_session_viewed_state", Kundle.class) : bundleW5.getParcelable("stories_session_viewed_state"));
        } else {
            kundle7 = null;
        }
        if (bundleW5 != null) {
            kundle8 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("horizontal_widget_state", Kundle.class) : bundleW5.getParcelable("horizontal_widget_state"));
        } else {
            kundle8 = null;
        }
        Bundle bundle5 = bundleW5 != null ? bundleW5.getBundle("key_item_visibility_tracker_state") : null;
        Bundle bundle6 = bundleW5 != null ? bundleW5.getBundle("key_beduin_native_item_visibility_tracker_state") : null;
        if (bundleW5 != null) {
            dialogsAfterCallState2 = dialogsAfterCallState;
            bundle2 = bundle6;
            kundle9 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("commercial_state", Kundle.class) : bundleW5.getParcelable("commercial_state"));
        } else {
            bundle2 = bundle6;
            dialogsAfterCallState2 = dialogsAfterCallState;
            kundle9 = null;
        }
        if (bundleW5 != null) {
            kundle10 = kundle9;
            verticalFilterState = (VerticalFilterState) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("vertical_filter_state", VerticalFilterState.class) : bundleW5.getParcelable("vertical_filter_state"));
        } else {
            kundle10 = kundle9;
            verticalFilterState = null;
        }
        if (bundleW5 != null) {
            verticalFilterState2 = verticalFilterState;
            verticalPublishState = (VerticalPublishState) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("vertical_publish_state", VerticalPublishState.class) : bundleW5.getParcelable("vertical_publish_state"));
        } else {
            verticalFilterState2 = verticalFilterState;
            verticalPublishState = null;
        }
        Bundle bundle7 = bundleW5 != null ? bundleW5.getBundle("reformulations_state") : null;
        VerticalPublishState verticalPublishState2 = verticalPublishState;
        Kundle kundleA2 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "deal_confirmation_state") : null;
        Bundle bundle8 = bundle5;
        if (bundleW5 != null) {
            kundle11 = kundle4;
            kundle12 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("disclaimer_pd_viewed_state", Kundle.class) : bundleW5.getParcelable("disclaimer_pd_viewed_state"));
        } else {
            kundle11 = kundle4;
            kundle12 = null;
        }
        if (bundleW5 != null) {
            kundle13 = kundle12;
            state = (ProgressInfoToastBarPresenter.State) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("vacancy_respond_toast_bar_state", ProgressInfoToastBarPresenter.State.class) : bundleW5.getParcelable("vacancy_respond_toast_bar_state"));
        } else {
            kundle13 = kundle12;
            state = null;
        }
        if (bundleW5 != null) {
            bundle3 = bundle7;
            kundle14 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleW5.getParcelable("grid_short_videos_item_state", Kundle.class) : bundleW5.getParcelable("grid_short_videos_item_state"));
        } else {
            bundle3 = bundle7;
            kundle14 = null;
        }
        Kundle kundleA3 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "carousel_items_widget_state") : null;
        Kundle kundle15 = kundle14;
        Kundle kundleA4 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "usp_banners_widget_state") : null;
        Bundle bundle9 = bundleW5 != null ? bundleW5.getBundle("floating_views_presenter_state") : null;
        Kundle kundle16 = kundleA3;
        if (bundleW5 != null) {
            kundleA = com.avito.android.util.G.a(bundleW5, "bx_content_presenter_state_key");
            bundle4 = bundleW5;
        } else {
            bundle4 = bundleW5;
            kundleA = null;
        }
        cv.d dVarD = cv.c.d(this);
        Kundle kundle17 = kundleA;
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        int[] iArr = C28910b.f109165a;
        Kundle kundle18 = kundle8;
        PresentationType presentationType = bxContentArgumentsO5.f108868g;
        switch (iArr[presentationType.ordinal()]) {
            case 1:
                screen = HomeScreen.f90372d;
                break;
            case 2:
                screen = SerpScreen.f90483d;
                break;
            case 3:
                screen = SearchMapScreen.f90473d;
                break;
            case 4:
                screen = SearchMapScreen.f90473d;
                break;
            case 5:
                screen = SearchMapScreen.f90473d;
                break;
            case 6:
                screen = BxContentScreen.f90305d;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Screen screen2 = screen;
        Kundle kundle19 = kundleA2;
        Kundle kundle20 = kundle7;
        Kundle kundle21 = kundle6;
        WarningStateProviderState warningStateProviderState2 = warningStateProviderState;
        com.avito.android.analytics.screens.tracker.F fA2 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(screen2, rVarC, screen2 instanceof SearchMapScreen ? "map" : "screen"));
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA3 = D.a.a();
        C27106d c27106d = new C27106d();
        com.avito.beduin.v2.engine.component.x xVar = new com.avito.beduin.v2.engine.component.x();
        ZS.b bVar = new ZS.b(screen2, Owners.f210394C, (String) null, 4, (C42822w) null);
        a.InterfaceC3272a interfaceC3272aA = com.avito.android.bxcontent.di.e.a();
        interfaceC3272aA.f((InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class));
        interfaceC3272aA.z((com.avito.android.bxcontent.di.b) C29972i.a(C29972i.b(this), com.avito.android.bxcontent.di.b.class));
        interfaceC3272aA.l((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class));
        interfaceC3272aA.K((kj.c) C29972i.a(C29972i.b(this), kj.c.class));
        interfaceC3272aA.v(dVarD);
        interfaceC3272aA.Q((InterfaceC14390a) C29972i.a(C29972i.b(this), InterfaceC14390a.class));
        interfaceC3272aA.U((InterfaceC14102a) C29972i.a(C29972i.b(this), InterfaceC14102a.class));
        interfaceC3272aA.L(bundle9);
        interfaceC3272aA.t(getView());
        interfaceC3272aA.e0(screen2);
        interfaceC3272aA.b(getResources());
        interfaceC3272aA.G(this);
        interfaceC3272aA.d(requireActivity());
        SearchParams searchParams = bxContentArgumentsO5.f108864c;
        if (searchParams != null) {
            String locationId = searchParams.getLocationId();
            if (locationId != null) {
                str = locationId;
                searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : str, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
            } else if (location != null) {
                locationId = location.getId();
                str = locationId;
                searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : str, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
            } else {
                str = null;
                searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : str, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
            }
        } else {
            searchParamsCopy = null;
        }
        interfaceC3272aA.o(searchParamsCopy);
        interfaceC3272aA.H(new LocationInteractorState(location));
        interfaceC3272aA.N(state);
        interfaceC3272aA.J(this);
        interfaceC3272aA.I(bxContentArgumentsO5.f108865d);
        interfaceC3272aA.D(kundle);
        interfaceC3272aA.m(kundle2);
        interfaceC3272aA.s(kundle3);
        interfaceC3272aA.c0(kundle5);
        interfaceC3272aA.b0(warningStateProviderState2);
        interfaceC3272aA.R(kundle21);
        interfaceC3272aA.j0(kundle20);
        interfaceC3272aA.i(kundle19);
        interfaceC3272aA.q(new RecyclerView.t());
        interfaceC3272aA.a0(kundle18);
        interfaceC3272aA.F(bundle3);
        interfaceC3272aA.V(kundle11);
        interfaceC3272aA.k(bundle8);
        interfaceC3272aA.C(bundle2);
        interfaceC3272aA.p(kundle10);
        interfaceC3272aA.j(new C44742f(false, null, new X0(fA2, screen2, dVarD), 3, null));
        interfaceC3272aA.l0(verticalFilterState2);
        interfaceC3272aA.m0(verticalPublishState2);
        interfaceC3272aA.x(kundle13);
        interfaceC3272aA.g0(dialogsAfterCallState2);
        interfaceC3272aA.Y(kundle16);
        interfaceC3272aA.S(kundleA4);
        interfaceC3272aA.d0(new com.jakewharton.rxrelay3.c());
        interfaceC3272aA.n0(new com.jakewharton.rxrelay3.c());
        interfaceC3272aA.W(new com.jakewharton.rxrelay3.c());
        interfaceC3272aA.O(new com.jakewharton.rxrelay3.c());
        interfaceC3272aA.w(new com.jakewharton.rxrelay3.c());
        interfaceC3272aA.r(presentationType);
        interfaceC3272aA.k0(SerpSpaceTypeKt.orDefault(bxContentArgumentsO5.f108872k));
        interfaceC3272aA.M(bxContentArgumentsO5);
        interfaceC3272aA.A(kundle15);
        SearchParams searchParams2 = bxContentArgumentsO5.f108864c;
        Area area2 = bxContentArgumentsO5.f108882u;
        if (area2 != null) {
            area = area2;
        } else if (searchParams2 != null) {
            area2 = searchParams2.getArea();
            area = area2;
        } else {
            area = null;
        }
        interfaceC3272aA.i0(new MapArguments(searchParams2, bxContentArgumentsO5.f108865d, area, bxContentArgumentsO5.f108883v, null, bxContentArgumentsO5.f108872k, bxContentArgumentsO5.f108884w, bxContentArgumentsO5.f108866e, bxContentArgumentsO5.f108868g, bxContentArgumentsO5.f108867f, "SERP", 16, null));
        interfaceC3272aA.e(com.avito.android.analytics.screens.s.c(this));
        interfaceC3272aA.g(getF42820b());
        InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
        interfaceC3272aA.P();
        interfaceC3272aA.f0(this);
        interfaceC3272aA.h(fA2);
        interfaceC3272aA.h0(kundle17);
        interfaceC3272aA.y(new C35838l3(v5()));
        interfaceC3272aA.X(new C31138n0(F5(fA2, bVar, dVarD, xVar, c27106d)));
        interfaceC3272aA.u(new C41343c(xVar, c27106d));
        interfaceC3272aA.T(new InterfaceC41342b() { // from class: com.avito.android.bxcontent.y
            @Override // iT.InterfaceC41342b
            public final InterfaceC41341a invoke() {
                BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
                return this.f113248a.Z5();
            }
        });
        interfaceC3272aA.E(new Y0());
        interfaceC3272aA.B(((a.b) C29972i.a(C29972i.b(this), a.b.class)).g8().create());
        interfaceC3272aA.Z(bundle4);
        interfaceC3272aA.build().a(this);
        com.avito.android.bxcontent.analytics.g gVar = this.f109005g3;
        if (gVar == null) {
            gVar = null;
        }
        gVar.a(fA3.b());
        com.avito.android.bxcontent.analytics.g gVar2 = this.f109005g3;
        if (gVar2 == null) {
            gVar2 = null;
        }
        gVar2.c(this, g5());
        InterfaceC31062w interfaceC31062w = this.f108996e1;
        (interfaceC31062w != null ? interfaceC31062w : null).k1(bxContentArgumentsO5.f108871j);
    }

    public final boolean p6() {
        u3.l<LoyaltyProgramTestGroup> lVar = this.f108913H4;
        if (lVar == null) {
            lVar = null;
        }
        LoyaltyProgramTestGroup loyaltyProgramTestGroup = lVar.f439745a.f439749b;
        loyaltyProgramTestGroup.getClass();
        LoyaltyProgramTestGroup loyaltyProgramTestGroup2 = LoyaltyProgramTestGroup.f184150e;
        if (loyaltyProgramTestGroup == loyaltyProgramTestGroup2 || loyaltyProgramTestGroup == LoyaltyProgramTestGroup.f184151f || loyaltyProgramTestGroup == LoyaltyProgramTestGroup.f184149d) {
            u3.l<LoyaltyProgramTestGroup> lVar2 = this.f108913H4;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.b();
        }
        if (E5()) {
            u3.l<LoyaltyProgramTestGroup> lVar3 = this.f108913H4;
            LoyaltyProgramTestGroup loyaltyProgramTestGroup3 = (lVar3 != null ? lVar3 : null).f439745a.f439749b;
            loyaltyProgramTestGroup3.getClass();
            if (loyaltyProgramTestGroup3 == loyaltyProgramTestGroup2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF71540x5() {
        return this.f108946R4;
    }

    @Override // gj.i
    public final void t0() {
        requireActivity().onBackPressed();
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        cU.s sVarIv = K5().Iv();
        BaseBeduinHostFragment.DetachedBottomSheet.f104752l0.getClass();
        BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheetA = BaseBeduinHostFragment.DetachedBottomSheet.a.a(sVarIv, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getParentFragmentManager(), "bottom-sheet");
        return new C29261w(detachedBottomSheetA, 1);
    }

    @Override // FV0.d
    public final void close() {
    }

    @Override // FV0.c
    @Y61.k
    public final Fragment j1() {
        return this;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
