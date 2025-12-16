package com.avito.android.search.filter;

import Ap0.C13066a;
import Ap0.C13068c;
import Cp0.C13337a;
import Hr.InterfaceC14024a;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.location.LocationSource;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.Quarter;
import com.avito.android.remote.model.QuarterKt;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.LocalPriorityParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectCategoryParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.BaseParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.adapter.h;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.ActionWithPlaceholdersItem;
import com.avito.android.search.filter.converter.common.RecommendationCardsItem;
import com.avito.android.search.filter.converter.common.SwitcherItem;
import com.avito.android.search.filter.converter.common.SwitcherWithHintItem;
import com.avito.android.select.ResetResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.view.C37722i;
import gq0.InterfaceC40721a;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.l0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;

/* compiled from: FiltersPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/h0;", "Lcom/avito/android/search/filter/e0;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C34574h0 implements InterfaceC34566e0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final Bp0.c f263303A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.adapter.action_with_placeholders.d f263304B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<? extends com.avito.conveyor_item.a> f263305C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<? extends ParameterElement> f263306D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<? extends ParameterElement> f263307E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<? extends DeepLink> f263308F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<? extends com.avito.android.search.filter.adapter.i> f263309G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<? extends ParameterElement> f263310H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ParameterElement.g> f263311I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ParameterElement.k> f263312J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.s f263313K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f263314L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public k1 f263315M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public FiltersFragment f263316N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f263317O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f263318P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public ParametersTreeWithAdditional f263319Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f263320R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public SerpDisplayType f263321S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f263322T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f263323U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public PresentationType f263324V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public PresentationType f263325W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public UV0.c f263326X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C43059p f263327Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f263328Z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FiltersInteractor f263329a;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public Object f263330a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f263331b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public Boolean f263332b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.converter.j f263333c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public Boolean f263334c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34536a1 f263335d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public PriceParameter f263336d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f263337e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.analytics.c f263338f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40721a f263339g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.tracker.a f263340h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.Q f263341i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.di.w f263342j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public String f263343k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f263344l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.i f263345m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f263346n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.x f263347o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.adapter.category_group.i f263348p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.adapter.location_group.d f263349q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.C0 f263350r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Rp0.b f263351s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final QG0.c f263352t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Sp0.b f263353u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f263354v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.link.apply.f f263355w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f263356x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.interactor.a f263357y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.adapter.recommendation_cards.c f263358z;

    /* compiled from: FiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "x", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "kotlin.jvm.PlatformType", "y", "invoke", "(Lcom/avito/android/remote/model/ParcelableEntity;Lcom/avito/android/remote/model/ParcelableEntity;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.h0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ParcelableEntity<String>, ParcelableEntity<String>, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ParameterSlot f263359l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParameterSlot parameterSlot) {
            super(2);
            this.f263359l = parameterSlot;
        }

        @Override // Y41.p
        public final Integer invoke(ParcelableEntity<String> parcelableEntity, ParcelableEntity<String> parcelableEntity2) {
            SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) this.f263359l;
            return Integer.valueOf(sectionedMultiselectParameter.getValues().indexOf(parcelableEntity) - sectionedMultiselectParameter.getValues().indexOf(parcelableEntity2));
        }
    }

    /* compiled from: FiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "x", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "kotlin.jvm.PlatformType", "y", "invoke", "(Lcom/avito/android/remote/model/ParcelableEntity;Lcom/avito/android/remote/model/ParcelableEntity;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.h0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<ParcelableEntity<String>, ParcelableEntity<String>, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ParameterSlot f263360l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ParameterSlot parameterSlot) {
            super(2);
            this.f263360l = parameterSlot;
        }

        @Override // Y41.p
        public final Integer invoke(ParcelableEntity<String> parcelableEntity, ParcelableEntity<String> parcelableEntity2) {
            MultiselectParameter multiselectParameter = (MultiselectParameter) this.f263360l;
            return Integer.valueOf(multiselectParameter.getValues().indexOf(parcelableEntity) - multiselectParameter.getValues().indexOf(parcelableEntity2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C34574h0(@Y61.k com.avito.android.search.filter.FiltersInteractor r7, @Y61.k com.avito.android.search.filter.InterfaceC34581l r8, @com.avito.android.search.filter.di.f.c @Y61.k com.avito.android.recycler.data_aware.c r9, @Y61.k com.avito.android.search.filter.converter.j r10, @Y61.k com.avito.android.search.filter.InterfaceC34536a1 r11, @Y61.k com.avito.android.util.InterfaceC35745a5 r12, @Y61.k com.avito.android.search.filter.analytics.c r13, @Y61.k gq0.InterfaceC40721a r14, @Y61.k com.avito.android.search.filter.tracker.a r15, @Y61.k com.avito.android.analytics.screens.tracker.Q r16, @com.avito.android.search.filter.di.o.c boolean r17, @Y61.k com.avito.android.search.filter.di.w r18, @com.avito.android.search.filter.di.o.i @Y61.l java.lang.String r19, @com.avito.android.search.filter.di.o.j @Y61.l java.lang.String r20, @Y61.k com.avito.android.select.i r21, @Y61.k com.avito.android.location.r r22, @Y61.k com.avito.android.select.x r23, @Y61.k com.avito.android.search.filter.adapter.category_group.i r24, @Y61.k com.avito.android.search.filter.adapter.location_group.d r25, @Y61.k com.avito.android.C0 r26, @Y61.k Rp0.b r27, @Y61.k QG0.c r28, @Y61.k Sp0.b r29, @Y61.k Hr.InterfaceC14024a r30, @Y61.k com.avito.android.search.filter.link.apply.f r31, @Y61.k com.avito.android.deeplink_handler.handler.composite.a r32, @Y61.k com.avito.android.search.filter.interactor.a r33, @Y61.k com.avito.android.search.filter.adapter.recommendation_cards.c r34, @Y61.k Bp0.c r35, @Y61.k com.avito.android.search.filter.adapter.action_with_placeholders.d r36) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.C34574h0.<init>(com.avito.android.search.filter.FiltersInteractor, com.avito.android.search.filter.l, com.avito.android.recycler.data_aware.c, com.avito.android.search.filter.converter.j, com.avito.android.search.filter.a1, com.avito.android.util.a5, com.avito.android.search.filter.analytics.c, gq0.a, com.avito.android.search.filter.tracker.a, com.avito.android.analytics.screens.tracker.Q, boolean, com.avito.android.search.filter.di.w, java.lang.String, java.lang.String, com.avito.android.select.i, com.avito.android.location.r, com.avito.android.select.x, com.avito.android.search.filter.adapter.category_group.i, com.avito.android.search.filter.adapter.location_group.d, com.avito.android.C0, Rp0.b, QG0.c, Sp0.b, Hr.a, com.avito.android.search.filter.link.apply.f, com.avito.android.deeplink_handler.handler.composite.a, com.avito.android.search.filter.interactor.a, com.avito.android.search.filter.adapter.recommendation_cards.c, Bp0.c, com.avito.android.search.filter.adapter.action_with_placeholders.d):void");
    }

    public static final void b(C34574h0 c34574h0) {
        k1 k1Var = c34574h0.f263315M;
        if (k1Var != null) {
            io.reactivex.rxjava3.internal.observers.y yVar = c34574h0.f263318P;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            c34574h0.f263318P = io.reactivex.rxjava3.kotlin.A1.h(c34574h0.f263329a.p(true).j0(c34574h0.f263337e.e()), null, new C34592q0(k1Var, c34574h0), 3);
        }
    }

    public static final void c(C34574h0 c34574h0, PresentationType presentationType) {
        LocationParameter locationParameter;
        FiltersInteractor filtersInteractor = c34574h0.f263329a;
        ItemsSearchLink itemsSearchLinkV = filtersInteractor.v(presentationType);
        String categoryId = filtersInteractor.f().getCategoryId();
        com.avito.android.search.filter.analytics.c cVar = c34574h0.f263338f;
        cVar.j(categoryId);
        if (c34574h0.f263322T) {
            SearchParams searchParamsF = filtersInteractor.f();
            SerpDisplayType displayType = searchParamsF.getDisplayType();
            String categoryId2 = searchParamsF.getCategoryId();
            if (displayType != null && displayType != c34574h0.f263321S) {
                cVar.m(displayType, categoryId2);
            }
        }
        k1 k1Var = c34574h0.f263315M;
        if (k1Var != null) {
            k1Var.a();
        }
        Boolean boolZ = filtersInteractor.z();
        if (boolZ != null) {
            boolean zBooleanValue = boolZ.booleanValue();
            ParametersTreeWithAdditional parametersTreeWithAdditional = c34574h0.f263319Q;
            Location value = (parametersTreeWithAdditional == null || (locationParameter = (LocationParameter) parametersTreeWithAdditional.getFirstParameterOfType(LocationParameter.class)) == null) ? null : locationParameter.getValue();
            LocationInfo f261789z = filtersInteractor.getF261789z();
            Location location = f261789z != null ? f261789z.f261875b : null;
            if (!kotlin.jvm.internal.L.f(value != null ? value.getId() : null, location != null ? location.getId() : null)) {
                zBooleanValue = false;
            }
            if (value != null) {
                c34574h0.f263346n.a(value, zBooleanValue ? LocationSource.f181714f : LocationSource.f181713e, true);
            }
        }
        FiltersFragment filtersFragment = c34574h0.f263316N;
        if (filtersFragment != null) {
            boolean z12 = c34574h0.f263323U;
            if (!(filtersFragment.l1() instanceof FiltersActivity)) {
                new IE.a();
                filtersFragment.B5(-1, new Intent().putExtra("result", itemsSearchLinkV).putExtra("reset_area", z12));
                filtersFragment.r5();
                return;
            }
            ActivityC22955m activityC22955mL1 = filtersFragment.l1();
            if (activityC22955mL1 != null) {
                new IE.a();
                activityC22955mL1.setResult(-1, new Intent().putExtra("result", itemsSearchLinkV).putExtra("reset_area", z12));
            }
            ActivityC22955m activityC22955mL12 = filtersFragment.l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.finish();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.avito.android.search.filter.C34574h0 r2, java.lang.String r3, java.lang.Boolean r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L17
            r2.getClass()
            boolean r4 = r4.booleanValue()
            com.avito.android.search.filter.k1 r1 = r2.f263315M
            if (r1 == 0) goto L14
            r1.f(r4)
            kotlin.G0 r4 = kotlin.G0.f406611a
            goto L15
        L14:
            r4 = r0
        L15:
            if (r4 != 0) goto L21
        L17:
            com.avito.android.search.filter.k1 r4 = r2.f263315M
            if (r4 == 0) goto L21
            r1 = 1
            r4.f(r1)
            kotlin.G0 r4 = kotlin.G0.f406611a
        L21:
            if (r3 == 0) goto L2e
            com.avito.android.search.filter.k1 r4 = r2.f263315M
            if (r4 == 0) goto L2c
            r4.d(r3)
            kotlin.G0 r0 = kotlin.G0.f406611a
        L2c:
            if (r0 != 0) goto L3d
        L2e:
            com.avito.android.search.filter.k1 r3 = r2.f263315M
            if (r3 == 0) goto L3d
            com.avito.android.search.filter.a1 r2 = r2.f263335d
            java.lang.String r2 = r2.c()
            r3.d(r2)
            kotlin.G0 r2 = kotlin.G0.f406611a
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.C34574h0.d(com.avito.android.search.filter.h0, java.lang.String, java.lang.Boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    public static final void e(C34574h0 c34574h0, ParameterElement.v vVar, Cp0.e eVar) {
        ParameterElement.v next;
        UV0.c cVar = c34574h0.f263326X;
        if (cVar != null) {
            Iterator it = com.avito.konveyor.util.g.b(cVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((com.avito.conveyor_item.a) next).getF262931b(), vVar.f262689b)) {
                        break;
                    }
                }
            }
            ParameterElement.v vVar2 = next instanceof ParameterElement.v ? next : null;
            if (vVar2 == null) {
                return;
            }
            vVar2.f262844g = eVar;
        }
    }

    public static final void g(C34574h0 c34574h0, Boolean bool) {
        kotlin.G0 g02;
        if (bool != null) {
            c34574h0.getClass();
            boolean zBooleanValue = bool.booleanValue();
            k1 k1Var = c34574h0.f263315M;
            if (k1Var != null) {
                k1Var.e(true);
            }
            k1 k1Var2 = c34574h0.f263315M;
            if (k1Var2 != null) {
                k1Var2.f263375g.setEnabled(zBooleanValue);
                g02 = kotlin.G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 != null) {
                return;
            }
        }
        k1 k1Var3 = c34574h0.f263315M;
        if (k1Var3 != null) {
            k1Var3.e(false);
            kotlin.G0 g03 = kotlin.G0.f406611a;
        }
    }

    public static String k(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static io.reactivex.rxjava3.internal.observers.y z(C34574h0 c34574h0, SearchParams searchParams, Y41.l lVar, int i12) {
        if ((i12 & 1) != 0) {
            searchParams = null;
        }
        if ((i12 & 2) != 0) {
            lVar = null;
        }
        return (io.reactivex.rxjava3.internal.observers.y) c34574h0.f263329a.q(searchParams).j0(c34574h0.f263337e.e()).v0(new F0(c34574h0, lVar), new G0(c34574h0), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void a() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f263317O;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f263317O = z(this, null, null, 2);
        com.avito.android.search.filter.di.w wVar = this.f263342j;
        wVar.f263292c = null;
        wVar.f263293d = null;
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void c0() {
        this.f263316N = null;
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void d0() {
        Bundle bundle = new Bundle();
        bundle.putString("display_type", this.f263320R.name());
        SerpDisplayType serpDisplayType = this.f263321S;
        bundle.putString("display_type_initial", serpDisplayType != null ? serpDisplayType.name() : null);
        bundle.putBoolean("display_type_changed", this.f263322T);
        bundle.putParcelable("parameters_tree", this.f263319Q);
        bundle.putBoolean("show_more_filter_key", this.f263328Z);
        bundle.putBoolean("reset_area_on_change", this.f263323U);
        Boolean bool = this.f263332b0;
        if (bool != null) {
            bundle.putBoolean("localPriority", bool.booleanValue());
        }
        com.avito.android.search.filter.di.w wVar = this.f263342j;
        wVar.f263290a = bundle;
        wVar.f263291b = this.f263329a.d0();
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void e0() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f263317O;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f263318P;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f263314L.e();
        this.f263315M = null;
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void f(@Y61.k String str, @Y61.k Map<String, ? extends Set<String>> map) {
        this.f263329a.u(v(), str, map);
    }

    public final void h(Date date, Date date2) {
        DateRangeParameter dateRangeParameter;
        DateRangeParameter.FormattedDateParameter checkOut;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263319Q;
        if (parametersTreeWithAdditional == null || (dateRangeParameter = (DateRangeParameter) parametersTreeWithAdditional.getFirstParameterOfType(DateRangeParameter.class)) == null) {
            return;
        }
        FiltersInteractor filtersInteractor = this.f263329a;
        String categoryId = filtersInteractor.f().getCategoryId();
        InterfaceC43057n interfaceC43057nB = C43059p.b(this.f263327Y, dateRangeParameter.getId());
        DateRangeParameter.FormattedDateParameter checkIn = dateRangeParameter.getCheckIn();
        if (checkIn == null || (checkOut = dateRangeParameter.getCheckOut()) == null) {
            return;
        }
        String strDateToString = date != null ? checkIn.dateToString(date) : null;
        String strDateToString2 = date2 != null ? checkOut.dateToString(date2) : null;
        FiltersInteractor.a.a(filtersInteractor, checkIn, strDateToString, null, 56);
        FiltersInteractor.a.a(filtersInteractor, checkOut, strDateToString2, null, 60);
        if (categoryId != null) {
            this.f263338f.k(categoryId, dateRangeParameter.getTitle(), interfaceC43057nB != null ? interfaceC43057nB.getValue() : dateRangeParameter.getId(), C42745f0.U(String.valueOf(strDateToString), String.valueOf(strDateToString2)), C42784z0.f406748b, dateRangeParameter.getType(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(String str, String str2, List list) {
        ParameterSlot parameterSlotFindParameter;
        Object next;
        String value = str;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263319Q;
        if (parametersTreeWithAdditional == null || (parameterSlotFindParameter = parametersTreeWithAdditional.findParameter(value)) == null) {
            return;
        }
        FiltersInteractor filtersInteractor = this.f263329a;
        String categoryId = filtersInteractor.f().getCategoryId();
        C43059p c43059p = this.f263327Y;
        InterfaceC43057n interfaceC43057nB = C43059p.b(c43059p, value);
        if (parameterSlotFindParameter instanceof SelectParameter) {
            if (parameterSlotFindParameter instanceof SelectParameter.Sectioned) {
                this.f263338f.i(((SelectParameter) parameterSlotFindParameter).getTitle(), str2, filtersInteractor.f().getLocationId());
            }
            EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
            ParcelableEntity parcelableEntity = (ParcelableEntity) C42745f0.G(list);
            FiltersInteractor.a.a(filtersInteractor, editableParameter, parcelableEntity != null ? (String) parcelableEntity.getId() : null, null, 60);
            SelectParameter selectParameter = (SelectParameter) parameterSlotFindParameter;
            String title = selectParameter.getTitle();
            if (interfaceC43057nB != null) {
                value = interfaceC43057nB.getValue();
            }
            String str3 = value;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((ParcelableEntity) it.next()).getF119974b()));
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((ParcelableEntity) it2.next()).getId());
            }
            String type = selectParameter.getType();
            SelectParameter.Displaying displaying = selectParameter.getDisplaying();
            this.f263338f.k(categoryId, title, str3, arrayList, arrayList2, type, displaying != null ? displaying.getType() : null);
            return;
        }
        if (parameterSlotFindParameter instanceof MultiselectParameter) {
            EditableParameter editableParameter2 = (EditableParameter) parameterSlotFindParameter;
            final b bVar = new b(parameterSlotFindParameter);
            final int i12 = 0;
            List listB0 = C42745f0.B0(list, new Comparator() { // from class: com.avito.android.search.filter.g0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    switch (i12) {
                    }
                    return ((Number) bVar.invoke(obj, obj2)).intValue();
                }
            });
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listB0, 10));
            Iterator it3 = listB0.iterator();
            while (it3.hasNext()) {
                arrayList3.add((String) ((ParcelableEntity) it3.next()).getId());
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter2, arrayList3, null, 60);
            MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
            List<MultiselectParameter.Value> values = multiselectParameter.getValues();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : values) {
                MultiselectParameter.Value value2 = (MultiselectParameter.Value) obj;
                List<? extends String> value3 = multiselectParameter.getValue();
                if (value3 != null ? value3.contains(value2.getId()) : false) {
                    arrayList4.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                String parentId = ((MultiselectParameter.Value) next2).getParentId();
                if (parentId == null) {
                    parentId = parameterSlotFindParameter.getId();
                }
                Object objR = linkedHashMap.get(parentId);
                if (objR == null) {
                    objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, parentId);
                }
                ((List) objR).add(next2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!((List) entry.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                String value4 = (String) entry2.getKey();
                List list3 = (List) entry2.getValue();
                InterfaceC43057n interfaceC43057nB2 = C43059p.b(c43059p, value4);
                if (interfaceC43057nB2 != null) {
                    value4 = interfaceC43057nB2.getValue();
                }
                arrayList5.add(new kotlin.Q(value4, list3));
            }
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                kotlin.Q q12 = (kotlin.Q) it5.next();
                String str4 = (String) q12.f406619b;
                List list4 = (List) q12.f406620c;
                String title2 = multiselectParameter.getTitle();
                List list5 = list4;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(list5, 10));
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((MultiselectParameter.Value) it6.next()).getF119974b());
                }
                ArrayList arrayList7 = new ArrayList(C42745f0.q(list5, 10));
                Iterator it7 = list5.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(((MultiselectParameter.Value) it7.next()).getId());
                }
                String type2 = multiselectParameter.getType();
                MultiselectParameter.Displaying displaying2 = multiselectParameter.getDisplaying();
                this.f263338f.k(categoryId, title2, str4, arrayList6, arrayList7, type2, displaying2 != null ? displaying2.getType() : null);
            }
            return;
        }
        if (parameterSlotFindParameter instanceof SectionedMultiselectParameter) {
            SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) parameterSlotFindParameter;
            String title3 = sectionedMultiselectParameter.getTitle();
            String id2 = parameterSlotFindParameter.getId();
            List list6 = list;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list6, 10));
            Iterator it8 = list6.iterator();
            while (it8.hasNext()) {
                arrayList8.add(String.valueOf(((ParcelableEntity) it8.next()).getF119974b()));
            }
            ArrayList arrayList9 = new ArrayList(C42745f0.q(list6, 10));
            Iterator it9 = list6.iterator();
            while (it9.hasNext()) {
                arrayList9.add((String) ((ParcelableEntity) it9.next()).getId());
            }
            String type3 = sectionedMultiselectParameter.getType();
            SectionedMultiselectParameter.Displaying displaying3 = sectionedMultiselectParameter.getDisplaying();
            this.f263338f.k(categoryId, title3, id2, arrayList8, arrayList9, type3, displaying3 != null ? displaying3.getType() : null);
            EditableParameter editableParameter3 = (EditableParameter) parameterSlotFindParameter;
            final a aVar = new a(parameterSlotFindParameter);
            final int i13 = 1;
            List listB02 = C42745f0.B0(list6, new Comparator() { // from class: com.avito.android.search.filter.g0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj22) {
                    switch (i13) {
                    }
                    return ((Number) aVar.invoke(obj2, obj22)).intValue();
                }
            });
            ArrayList arrayList10 = new ArrayList(C42745f0.q(listB02, 10));
            Iterator it10 = listB02.iterator();
            while (it10.hasNext()) {
                arrayList10.add((String) ((ParcelableEntity) it10.next()).getId());
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter3, C42745f0.P0(arrayList10), null, 60);
            return;
        }
        if (parameterSlotFindParameter instanceof MetroParameter) {
            EditableParameter editableParameter4 = (EditableParameter) parameterSlotFindParameter;
            List<ParcelableEntity> list7 = list;
            ArrayList arrayList11 = new ArrayList(C42745f0.q(list7, 10));
            for (ParcelableEntity parcelableEntity2 : list7) {
                String str5 = (String) parcelableEntity2.getId();
                String f119974b = parcelableEntity2.getF119974b();
                if (f119974b == null) {
                    f119974b = "";
                }
                arrayList11.add(new Metro(str5, f119974b, null));
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter4, arrayList11, null, 60);
            MetroParameter metroParameter = (MetroParameter) parameterSlotFindParameter;
            String title4 = metroParameter.getTitle();
            if (interfaceC43057nB != null) {
                value = interfaceC43057nB.getValue();
            }
            String str6 = value;
            ArrayList arrayList12 = new ArrayList(C42745f0.q(list7, 10));
            Iterator it11 = list7.iterator();
            while (it11.hasNext()) {
                arrayList12.add(String.valueOf(((ParcelableEntity) it11.next()).getF119974b()));
            }
            ArrayList arrayList13 = new ArrayList(C42745f0.q(list7, 10));
            Iterator it12 = list7.iterator();
            while (it12.hasNext()) {
                arrayList13.add((String) ((ParcelableEntity) it12.next()).getId());
            }
            String type4 = metroParameter.getType();
            DisplayingOptions displayingOptions = metroParameter.getDisplayingOptions();
            this.f263338f.k(categoryId, title4, str6, arrayList12, arrayList13, type4, displayingOptions != null ? displayingOptions.getType() : null);
            return;
        }
        if (parameterSlotFindParameter instanceof QuartersParameter) {
            EditableParameter editableParameter5 = (EditableParameter) parameterSlotFindParameter;
            QuartersParameter quartersParameter = (QuartersParameter) parameterSlotFindParameter;
            Iterator<T> it13 = quartersParameter.getValues().iterator();
            while (true) {
                if (!it13.hasNext()) {
                    next = null;
                    break;
                }
                next = it13.next();
                String id3 = ((Quarter) next).getId();
                ParcelableEntity parcelableEntity3 = (ParcelableEntity) C42745f0.G(list);
                if (kotlin.jvm.internal.L.f(id3, parcelableEntity3 != null ? (String) parcelableEntity3.getId() : null)) {
                    break;
                }
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter5, QuarterKt.toQuartersParameterValue((Quarter) next), null, 60);
            String title5 = quartersParameter.getTitle();
            if (interfaceC43057nB != null) {
                value = interfaceC43057nB.getValue();
            }
            String str7 = value;
            List list8 = list;
            ArrayList arrayList14 = new ArrayList(C42745f0.q(list8, 10));
            Iterator it14 = list8.iterator();
            while (it14.hasNext()) {
                arrayList14.add(String.valueOf(((ParcelableEntity) it14.next()).getF119974b()));
            }
            ArrayList arrayList15 = new ArrayList(C42745f0.q(list8, 10));
            Iterator it15 = list8.iterator();
            while (it15.hasNext()) {
                arrayList15.add((String) ((ParcelableEntity) it15.next()).getId());
            }
            String type5 = quartersParameter.getType();
            DisplayingOptions displaying4 = quartersParameter.getDisplaying();
            this.f263338f.k(categoryId, title5, str7, arrayList14, arrayList15, type5, displaying4 != null ? displaying4.getType() : null);
        }
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void i0() {
        this.f263338f.f(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        if (str.equals("category_group_select_id")) {
            ParcelableEntity parcelableEntity = (ParcelableEntity) C42745f0.G(list);
            this.f263348p.y4(parcelableEntity != null ? (String) parcelableEntity.getId() : null);
            return;
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f263317O;
        if (yVar == null || yVar.getF318621e()) {
            this.f263317O = z(this, null, new C34582l0(new l0.a(), this, str, list, str2), 1);
        } else {
            i(str, str2, list);
        }
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void l(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Map map) {
        ParameterSlot parameterSlotFindParameter;
        ParametersTreeWithAdditional parametersTreeWithAdditional;
        ParameterSlot parameterSlotFindParameter2;
        DisplayingOptions displayingOptions;
        String type;
        Long l12 = (Long) map.get(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME);
        Long lValueOf = Long.valueOf(l12 != null ? l12.longValue() : 0L);
        Long l13 = (Long) map.get(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME);
        Long lValueOf2 = Long.valueOf(l13 != null ? l13.longValue() : 0L);
        long jLongValue = lValueOf.longValue();
        long jLongValue2 = lValueOf2.longValue();
        ParametersTreeWithAdditional parametersTreeWithAdditional2 = this.f263319Q;
        if (parametersTreeWithAdditional2 == null || (parameterSlotFindParameter = parametersTreeWithAdditional2.findParameter(str)) == null || (parametersTreeWithAdditional = this.f263319Q) == null || (parameterSlotFindParameter2 = parametersTreeWithAdditional.findParameter(str2)) == null) {
            return;
        }
        FiltersInteractor filtersInteractor = this.f263329a;
        String categoryId = filtersInteractor.f().getCategoryId();
        InterfaceC43057n interfaceC43057nB = C43059p.b(this.f263327Y, str3);
        String value = interfaceC43057nB != null ? interfaceC43057nB.getValue() : str3;
        if (parameterSlotFindParameter instanceof IntParameter) {
            Long value2 = ((IntParameter) parameterSlotFindParameter).getValue();
            boolean z12 = value2 == null || value2.longValue() != jLongValue;
            BaseParameter baseParameter = parameterSlotFindParameter instanceof BaseParameter ? (BaseParameter) parameterSlotFindParameter : null;
            String str5 = (baseParameter == null || (type = baseParameter.getType()) == null) ? "" : type;
            TextParameter textParameter = parameterSlotFindParameter instanceof TextParameter ? (TextParameter) parameterSlotFindParameter : null;
            String type2 = (textParameter == null || (displayingOptions = textParameter.getDisplayingOptions()) == null) ? null : displayingOptions.getType();
            if (z12) {
                String str6 = categoryId == null ? "" : categoryId;
                List<String> listSingletonList = Collections.singletonList(String.valueOf(jLongValue));
                C42784z0 c42784z0 = C42784z0.f406748b;
                this.f263338f.k(str6, str4, value, listSingletonList, c42784z0, str5, type2);
                this.f263338f.k(categoryId == null ? "" : categoryId, str4, value, Collections.singletonList(String.valueOf(jLongValue2)), c42784z0, str5, type2);
            }
        }
        Long lValueOf3 = Long.valueOf(jLongValue);
        if (jLongValue == 0) {
            lValueOf3 = null;
        }
        filtersInteractor.w(kotlin.collections.P0.g(new kotlin.Q(parameterSlotFindParameter.getId(), String.valueOf(lValueOf3)), new kotlin.Q(parameterSlotFindParameter2.getId(), String.valueOf(jLongValue2 != 0 ? Long.valueOf(jLongValue2) : null))));
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void m(@Y61.l Location location) {
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263319Q;
        if (parametersTreeWithAdditional != null) {
            FiltersInteractor filtersInteractor = this.f263329a;
            String categoryId = filtersInteractor.f().getCategoryId();
            LocationParameter locationParameter = (LocationParameter) parametersTreeWithAdditional.getFirstParameterOfType(LocationParameter.class);
            if (locationParameter == null) {
                return;
            }
            InterfaceC43057n interfaceC43057nB = C43059p.b(this.f263327Y, locationParameter.getId());
            FiltersInteractor.a.a(filtersInteractor, locationParameter, location, null, 60);
            this.f263338f.k(categoryId, locationParameter.getTitle(), interfaceC43057nB != null ? interfaceC43057nB.getValue() : locationParameter.getId(), Collections.singletonList(String.valueOf(location != null ? location.getF119974b() : null)), Collections.singletonList(String.valueOf(location != null ? location.getId() : null)), locationParameter.getType(), null);
        }
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void n(@Y61.k String str, @Y61.k String str2) {
        this.f263329a.w(kotlin.collections.P0.g(new kotlin.Q(str, null), new kotlin.Q(str2, null)));
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void o(@Y61.l Radius radius) {
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263319Q;
        if (parametersTreeWithAdditional != null) {
            FiltersInteractor filtersInteractor = this.f263329a;
            String categoryId = filtersInteractor.f().getCategoryId();
            RadiusParameter radiusParameter = (RadiusParameter) parametersTreeWithAdditional.getFirstParameterOfType(RadiusParameter.class);
            if (radiusParameter == null) {
                return;
            }
            InterfaceC43057n interfaceC43057nB = C43059p.b(this.f263327Y, radiusParameter.getId());
            FiltersInteractor.a.a(filtersInteractor, radiusParameter, radius, null, 60);
            String title = radiusParameter.getTitle();
            String value = interfaceC43057nB != null ? interfaceC43057nB.getValue() : radiusParameter.getId();
            List<String> listSingletonList = Collections.singletonList(String.valueOf(radius != null ? radius.getTitle() : null));
            List<String> listSingletonList2 = Collections.singletonList(String.valueOf(radius != null ? radius.getId() : null));
            String type = radiusParameter.getType();
            DisplayingOptions displayingOptions = radiusParameter.getDisplayingOptions();
            this.f263338f.k(categoryId, title, value, listSingletonList, listSingletonList2, type, displayingOptions != null ? displayingOptions.getType() : null);
        }
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void p(boolean z12) {
        PriceParameter priceParameter;
        if (z12) {
            return;
        }
        com.avito.android.C0 c02 = this.f263350r;
        c02.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.C0.f67235e[0];
        if (!((Boolean) c02.f67236b.a().invoke()).booleanValue() || (priceParameter = this.f263336d0) == null || kotlin.jvm.internal.L.f(this.f263334c0, Boolean.valueOf(priceParameter.hasValue()))) {
            return;
        }
        this.f263334c0 = Boolean.valueOf(priceParameter.hasValue());
        String value = priceParameter.getValue();
        FiltersInteractor.a.a(this.f263329a, priceParameter, value != null ? k(value) : null, null, 52);
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void q(@Y61.k FiltersFragment filtersFragment) {
        this.f263316N = filtersFragment;
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void r(@Y61.k k1 k1Var) {
        io.reactivex.rxjava3.internal.observers.y yVar;
        this.f263340h.c();
        this.f263315M = k1Var;
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f263317O;
        if (yVar2 == null || yVar2.getF318621e()) {
            this.f263317O = z(this, null, new C34578j0(this), 1);
        }
        k1 k1Var2 = this.f263315M;
        InterfaceC35745a5 interfaceC35745a5 = this.f263337e;
        FiltersInteractor filtersInteractor = this.f263329a;
        if (k1Var2 != null && ((yVar = this.f263318P) == null || yVar.getF318621e())) {
            this.f263318P = io.reactivex.rxjava3.kotlin.A1.h(filtersInteractor.p(false).j0(interfaceC35745a5.e()), null, new C34592q0(k1Var2, this), 3);
        }
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.f401954c;
        io.reactivex.rxjava3.internal.subscribers.n nVarJ = io.reactivex.rxjava3.kotlin.A1.j(k1Var.f263383o.G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new P0(this), 3);
        io.reactivex.rxjava3.disposables.c cVar = this.f263314L;
        cVar.b(nVarJ);
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(k1Var.f263381m.G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new N0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(k1Var.f263382n.G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new O0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(C37722i.a(k1Var.f263372d.f261744g).G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new J0(this), 3));
        BackpressureStrategy backpressureStrategy2 = BackpressureStrategy.f401953b;
        io.reactivex.rxjava3.core.z<? extends com.avito.conveyor_item.a> zVar = this.f263305C;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(zVar.G0(backpressureStrategy2).m(interfaceC35745a5.e()), null, new C34607y0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(this.f263310H.G0(backpressureStrategy2).m(interfaceC35745a5.e()), null, new C34609z0(this), 3));
        io.reactivex.rxjava3.core.z<? extends ParameterElement> zVar2 = this.f263306D;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(zVar2.G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new E0(this), 3));
        io.reactivex.rxjava3.core.z<? extends com.avito.android.search.filter.adapter.i> zVar3 = this.f263309G;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(zVar3.G0(backpressureStrategy2).m(interfaceC35745a5.e()), null, new M0(this), 3));
        io.reactivex.rxjava3.core.z<? extends ParameterElement> zVar4 = this.f263307E;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(zVar4.G0(backpressureStrategy).m(interfaceC35745a5.e()).k(C0.f261750b), null, new D0(1, this, C34574h0.class, "onParameterClearClicked", "onParameterClearClicked(Ljava/lang/String;)V", 0), 3));
        io.reactivex.rxjava3.core.z<? extends DeepLink> zVar5 = this.f263308F;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(zVar5.G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new C34597t0(this), 3));
        final com.avito.android.deeplink_handler.handler.composite.a aVar = this.f263356x;
        cVar.b(aVar.d9().N(C34593r0.f263798b).t0(new C34595s0(this)));
        com.avito.android.search.filter.adapter.category_group.i iVar = this.f263348p;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(iVar.Q3().j0(interfaceC35745a5.e()), null, new C34586n0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(this.f263349q.l2().j0(interfaceC35745a5.e()), null, new A0(this), 3));
        io.reactivex.rxjava3.core.z zVarH0 = io.reactivex.rxjava3.core.z.h0(C42745f0.U(zVar.d0(Q0.f261895b), zVar3.d0(R0.f261896b), zVar5.d0(S0.f261902b), zVar2.d0(T0.f261904b), zVar4.d0(U0.f261906b)));
        zVarH0.getClass();
        cVar.b(io.reactivex.rxjava3.kotlin.A1.i(new io.reactivex.rxjava3.internal.operators.observable.S(zVarH0).h(new V0(k1Var)), W0.f261911l, new X0(this), 2));
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        cVar2.b(this.f263355w.f263397b.t0(new C34601v0(this)));
        cVar2.b(filtersInteractor.g().t0(new l41.g() { // from class: com.avito.android.search.filter.w0
            @Override // l41.g
            public final void accept(Object obj) {
                b.a.a(aVar, (DeepLink) obj, null, null, 6);
            }
        }));
        cVar.b(cVar2);
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(k1Var.f263384p.G0(backpressureStrategy).w(new K0(this)).m(interfaceC35745a5.e()), null, new L0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(io.reactivex.rxjava3.core.z.g0(iVar.T0(), iVar.p6().K(new C34588o0(this))).G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new C34590p0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(iVar.E7().G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new B0(this), 3));
        io.reactivex.rxjava3.internal.operators.flowable.O0 o0M = this.f263311I.G0(backpressureStrategy2).m(interfaceC35745a5.e());
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        Objects.requireNonNull(oVar, "keySelector is null");
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(new io.reactivex.rxjava3.internal.operators.flowable.O(o0M, oVar, io.reactivex.rxjava3.internal.functions.b.f402016a), null, new C34599u0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(this.f263312J.j0(interfaceC35745a5.e()), null, new C34605x0(this), 3));
        com.avito.android.search.filter.adapter.recommendation_cards.c cVar3 = this.f263358z;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(cVar3.w2().G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new I0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.j(cVar3.h2().G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new H0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(this.f263304B.q6().j0(interfaceC35745a5.e()), null, new C34584m0(this), 3));
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void s(@Y61.k ResetResult resetResult) {
        w(resetResult.f264968b);
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void t(@Y61.k String str, @Y61.k String str2) {
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263319Q;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(str) : null;
        GuestsSelectParameter guestsSelectParameter = parameterSlotFindParameter instanceof GuestsSelectParameter ? (GuestsSelectParameter) parameterSlotFindParameter : null;
        if (guestsSelectParameter == null) {
            return;
        }
        FiltersInteractor.a.a(this.f263329a, guestsSelectParameter, str2, null, 52);
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0
    public final void u(boolean z12) {
        this.f263323U = z12;
    }

    public final String v() {
        SelectCategoryParameter selectCategoryParameter;
        Category value;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263319Q;
        String id2 = (parametersTreeWithAdditional == null || (selectCategoryParameter = (SelectCategoryParameter) parametersTreeWithAdditional.getFirstParameterOfType(SelectCategoryParameter.class)) == null || (value = selectCategoryParameter.getValue()) == null) ? null : value.getId();
        return id2 == null ? "" : id2;
    }

    public final void w(String str) {
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263319Q;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(str) : null;
        boolean z12 = parameterSlotFindParameter instanceof BottomSheetGroupParameter;
        FiltersInteractor filtersInteractor = this.f263329a;
        if (z12) {
            filtersInteractor.u(null, str, null);
            return;
        }
        if (parameterSlotFindParameter instanceof DateRangeParameter) {
            h(null, null);
            return;
        }
        if (parameterSlotFindParameter instanceof MetroParameter) {
            SearchParams searchParamsF = filtersInteractor.f();
            String categoryId = searchParamsF.getCategoryId();
            Integer numY0 = categoryId != null ? C43066x.y0(categoryId) : null;
            String locationId = searchParamsF.getLocationId();
            Integer numY02 = locationId != null ? C43066x.y0(locationId) : null;
            if (numY02 != null) {
                this.f263339g.c(numY02.intValue(), numY0);
            }
            FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, null, null, 60);
            return;
        }
        if (parameterSlotFindParameter instanceof PriceParameter) {
            com.avito.android.C0 c02 = this.f263350r;
            c02.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.C0.f67235e[0];
            if (((Boolean) c02.f67236b.a().invoke()).booleanValue()) {
                this.f263334c0 = Boolean.FALSE;
                FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, null, null, 52);
                return;
            }
            return;
        }
        if (parameterSlotFindParameter instanceof EditableParameter) {
            if ((parameterSlotFindParameter instanceof SelectParameter) && kotlin.jvm.internal.L.f(str, "parameter_id_categories")) {
                FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, "0", null, 60);
                return;
            }
            if (!(parameterSlotFindParameter instanceof SelectParameter.Flat)) {
                FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, null, null, 60);
                return;
            }
            EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
            SelectParameter.Flat flat = (SelectParameter.Flat) parameterSlotFindParameter;
            String resetValue = flat.getResetValue();
            FiltersInteractor.a.a(filtersInteractor, editableParameter, (resetValue == null || resetValue.length() == 0) ? null : flat.getResetValue(), null, 60);
        }
    }

    public final void x(ApiError apiError) {
        this.f263341i.a();
        com.avito.android.search.filter.tracker.a aVar = this.f263340h;
        aVar.f(apiError);
        aVar.j();
        if (this.f263315M != null) {
            com.avito.android.error.z.k(apiError);
        }
        k1 k1Var = this.f263315M;
        if (k1Var != null) {
            k1Var.g(apiError);
        }
        aVar.h(apiError);
    }

    public final void y(List<? extends com.avito.conveyor_item.a> list) {
        Object next;
        LocalPriorityParameter localPriorityParameter;
        RecyclerView.m layoutManager;
        List<ParameterSlot> list2;
        Object next2;
        k1 k1Var;
        ArrayList arrayList = new ArrayList();
        for (com.avito.conveyor_item.a aVar : list) {
            if (aVar instanceof ParameterElement.v) {
                ParameterElement.v vVar = (ParameterElement.v) aVar;
                if (vVar.f262845h instanceof ParameterElement.DisplayType.g) {
                    arrayList.add(aVar);
                }
                ParameterElement.DisplayType displayType = vVar.f262845h;
                if ((displayType instanceof ParameterElement.DisplayType.l) && ((k1Var = this.f263315M) == null || !k1Var.f263369a.getContext().getResources().getBoolean(R.bool.is_tablet))) {
                    arrayList.add(aVar);
                }
                if (!(displayType instanceof ParameterElement.DisplayType.g) && !(displayType instanceof ParameterElement.DisplayType.b) && !(displayType instanceof ParameterElement.DisplayType.Chips) && !(displayType instanceof ParameterElement.DisplayType.i) && !(displayType instanceof ParameterElement.DisplayType.l) && !(displayType instanceof ParameterElement.DisplayType.e) && !(displayType instanceof ParameterElement.DisplayType.a)) {
                    arrayList.add(aVar);
                }
                if (displayType instanceof ParameterElement.DisplayType.Chips) {
                    arrayList.add(aVar);
                }
                if (displayType instanceof ParameterElement.DisplayType.e) {
                    arrayList.add(aVar);
                }
                if (displayType instanceof ParameterElement.DisplayType.a) {
                    arrayList.add(aVar);
                }
                if ((displayType instanceof ParameterElement.DisplayType.k) && vVar.a().size() < 2) {
                    arrayList.remove(aVar);
                }
            } else if (aVar instanceof ParameterElement.s) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.v.a) {
                arrayList.add(aVar);
            } else if (aVar instanceof com.avito.android.search.filter.converter.common.b) {
                arrayList.add(aVar);
            } else if (aVar instanceof com.avito.android.search.filter.converter.common.c) {
                arrayList.add(aVar);
            } else if (aVar instanceof SwitcherItem) {
                arrayList.add(aVar);
            } else if (aVar instanceof SwitcherWithHintItem) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.q) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.g) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.o) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.r) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.d) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.Header) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.b) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.C34553a) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.p) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.i) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.n) {
                arrayList.add(aVar);
            } else if (aVar instanceof ParameterElement.k) {
                arrayList.add(aVar);
            } else if (aVar instanceof C13337a) {
                arrayList.add(aVar);
            } else if (aVar instanceof RecommendationCardsItem) {
                arrayList.add(aVar);
            } else if (aVar instanceof ActionWithPlaceholdersItem) {
                arrayList.add(aVar);
            }
        }
        UV0.c cVar = new UV0.c(arrayList);
        this.f263326X = cVar;
        this.f263331b.c(cVar);
        k1 k1Var2 = this.f263315M;
        if (k1Var2 != null) {
            RecyclerView recyclerView = k1Var2.f263371c;
            if (recyclerView.getAdapter() == null) {
                recyclerView.setAdapter(k1Var2.f263370b);
            }
            RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
            Parcelable parcelableY0 = layoutManager2 != null ? layoutManager2.Y0() : null;
            com.avito.android.search.filter.adapter.h hVar = k1Var2.f263380l;
            if (hVar != null) {
                recyclerView.r0(hVar);
            }
            View view = k1Var2.f263369a;
            Drawable drawable = view.getResources().getDrawable(R.drawable.redesign_filters_view_divider, view.getContext().getTheme());
            drawable.setTint(0);
            h.a aVar2 = new h.a(new C13068c(new C13066a(drawable.getIntrinsicHeight(), y6.b(8), y6.b(8))));
            aVar2.f262348b = arrayList;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next instanceof ParameterElement.q) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (!(next instanceof ParameterElement.q)) {
                next = null;
            }
            ParameterElement.q qVar = (ParameterElement.q) next;
            if (qVar == null || (list2 = qVar.f262814f) == null) {
                localPriorityParameter = null;
            } else {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (next2 instanceof LocalPriorityParameter) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (!(next2 instanceof LocalPriorityParameter)) {
                    next2 = null;
                }
                localPriorityParameter = (LocalPriorityParameter) next2;
            }
            Integer numValueOf = localPriorityParameter != null ? Integer.valueOf(arrayList.indexOf(qVar)) : null;
            if (numValueOf != null && numValueOf.intValue() > 0) {
                aVar2.f262349c = C42745f0.U(Integer.valueOf(numValueOf.intValue() - 1), numValueOf);
            }
            com.avito.android.search.filter.adapter.h hVar2 = new com.avito.android.search.filter.adapter.h(aVar2.f262348b, aVar2.f262347a, aVar2.f262349c, null);
            k1Var2.f263380l = hVar2;
            recyclerView.l(hVar2, -1);
            if (parcelableY0 == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            layoutManager.X0(parcelableY0);
        }
    }
}
