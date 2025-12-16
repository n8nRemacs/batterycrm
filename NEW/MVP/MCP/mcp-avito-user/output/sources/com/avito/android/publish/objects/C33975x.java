package com.avito.android.publish.objects;

import Gd0.C13867a;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.view.P0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.details.b;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33789t;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.publish.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestSetFieldValue;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.validation.InterfaceC36030r0;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import yc.C50213a;

/* compiled from: ObjectFillFormViewModel.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/objects/x;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/details/ItemDetailsView$b;", "Lcom/avito/android/details/b$b;", "Lcom/avito/android/publish/view/a;", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.objects.x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33975x extends androidx.view.M0 implements ItemDetailsView.b, b.InterfaceC4110b, com.avito.android.publish.view.a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f238108E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final h31.e<ObjectsParameter> f238109J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final ObjectFillFormScreenParams.SelectedValue f238110K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f238111L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C50213a f238112M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33955k f238113N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.view.a f238114O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.b f238115P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f238116Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f238117R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final Resources f238118S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final Locale f238119T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final Q1 f238120U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f238121V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f238122W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final P0 f238123X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.objects.slot.c f238124Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.analytics.h0 f238125Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.imv.f f238126a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f238127b0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public C33789t f238129d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public ObjectFillFormFragment f238130e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final C33953j f238131f0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f238133h0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f238128c0 = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> f238132g0 = new LinkedHashSet();

    /* compiled from: ObjectFillFormViewModel.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/x$a;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.objects.x$a */
    public static final class a implements P0.c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36030r0 f238134a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final h31.e<ObjectsParameter> f238135b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ObjectFillFormScreenParams.SelectedValue f238136c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC33955k f238137d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.publish.view.a f238138e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.details.b f238139f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.category_parameters.a f238140g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final InterfaceC35745a5 f238141h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Resources f238142i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final Locale f238143j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final Q1 f238144k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final InterfaceC33535v f238145l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final P0 f238146m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.publish.objects.slot.c f238147n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final InterfaceC28373a f238148o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f238149p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        public final C50213a f238150q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.publish.analytics.h0 f238151r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.publish.imv.f f238152s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.k
        public final u3.l<SimpleTestGroupWithNone> f238153t;

        @Inject
        public a(@Y61.k Resources resources, @Y61.k Q1 q12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.category_parameters.a aVar, @Y61.k com.avito.android.details.b bVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.publish.analytics.h0 h0Var, @Y61.k com.avito.android.publish.imv.f fVar, @Y61.k InterfaceC33955k interfaceC33955k, @Y61.l ObjectFillFormScreenParams.SelectedValue selectedValue, @Y61.k P0 p02, @Y61.k com.avito.android.publish.objects.slot.c cVar, @Y61.k com.avito.android.publish.view.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC36030r0 interfaceC36030r0, @com.avito.android.publish.objects.di.Y @Y61.k h31.e eVar, @Y61.k Locale locale, @t3.l0 @Y61.k u3.l lVar, @Y61.k C50213a c50213a, boolean z12) {
            this.f238134a = interfaceC36030r0;
            this.f238135b = eVar;
            this.f238136c = selectedValue;
            this.f238137d = interfaceC33955k;
            this.f238138e = aVar2;
            this.f238139f = bVar;
            this.f238140g = aVar;
            this.f238141h = interfaceC35745a5;
            this.f238142i = resources;
            this.f238143j = locale;
            this.f238144k = q12;
            this.f238145l = interfaceC33535v;
            this.f238146m = p02;
            this.f238147n = cVar;
            this.f238148o = interfaceC28373a;
            this.f238149p = z12;
            this.f238150q = c50213a;
            this.f238151r = h0Var;
            this.f238152s = fVar;
            this.f238153t = lVar;
        }

        @Override // androidx.lifecycle.P0.c
        @Y61.k
        public final <T extends androidx.view.M0> T create(@Y61.k Class<T> cls) {
            com.avito.android.publish.imv.f fVar = this.f238152s;
            u3.l<SimpleTestGroupWithNone> lVar = this.f238153t;
            InterfaceC36030r0 interfaceC36030r0 = this.f238134a;
            h31.e<ObjectsParameter> eVar = this.f238135b;
            ObjectFillFormScreenParams.SelectedValue selectedValue = this.f238136c;
            InterfaceC28373a interfaceC28373a = this.f238148o;
            C50213a c50213a = this.f238150q;
            InterfaceC33955k interfaceC33955k = this.f238137d;
            com.avito.android.publish.view.a aVar = this.f238138e;
            com.avito.android.details.b bVar = this.f238139f;
            com.avito.android.category_parameters.a aVar2 = this.f238140g;
            InterfaceC35745a5 interfaceC35745a5 = this.f238141h;
            Resources resources = this.f238142i;
            Locale locale = this.f238143j;
            Q1 q12 = this.f238144k;
            boolean z12 = this.f238149p;
            return new C33975x(resources, q12, interfaceC28373a, aVar2, bVar, this.f238145l, this.f238151r, fVar, interfaceC33955k, selectedValue, this.f238146m, this.f238147n, aVar, interfaceC35745a5, interfaceC36030r0, eVar, locale, lVar, c50213a, z12);
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/x$b;", "Lcom/avito/android/publish/view/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.objects.x$b */
    public interface b extends a.b {

        /* compiled from: ObjectFillFormViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.objects.x$b$a */
        public static final class a {
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.objects.x$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238154a;

        static {
            int[] iArr = new int[CategoryPublishStep.Params.NavigationButtonAction.values().length];
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.CONDITIONAL_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.SET_MANUAL_DATA_ENTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.EXECUTE_BEDUIN_ACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.PERFORM_DEEP_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.CONTINUE_PUBLISH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f238154a = iArr;
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.objects.x$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33975x c33975x = C33975x.this;
            c33975x.f238113N.i8();
            if (c33975x.f238121V) {
                c33975x.f238111L.c(new C13867a(c33975x.ne(), c33975x.oe(), c33975x.me(), c33975x.f238112M));
            }
            c33975x.f238123X.a(c33975x.le());
            ObjectFillFormFragment objectFillFormFragment = c33975x.f238130e0;
            if (objectFillFormFragment != null) {
                objectFillFormFragment.s5(c33975x.le().getId());
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.objects.x$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CategoryPublishStep.Params.NavigationButtonAction f238157m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DeepLink f238158n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, DeepLink deepLink) {
            super(0);
            this.f238157m = navigationButtonAction;
            this.f238158n = deepLink;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33975x.this.ke(this.f238157m, this.f238158n);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.objects.x$f */
    public static final class f<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f238160c;

        public f(String str) {
            this.f238160c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AbstractC35806h3 abstractC35806h3 = (AbstractC35806h3) obj;
            boolean zEquals = abstractC35806h3.equals(AbstractC35806h3.e.f318894a);
            C33975x c33975x = C33975x.this;
            if (zEquals) {
                C33789t c33789t = c33975x.f238129d0;
                if (c33789t != null) {
                    c33789t.h();
                    return;
                }
                return;
            }
            boolean z12 = abstractC35806h3 instanceof AbstractC35806h3.d;
            String str = this.f238160c;
            if (z12) {
                ParametersTree parametersTreeWa = c33975x.f238113N.wa();
                if (parametersTreeWa != null) {
                    c33975x.f238132g0 = c33975x.f238124Y.a(c33975x.f238132g0, parametersTreeWa);
                }
                ParametersTree parametersTreeWa2 = c33975x.f238113N.wa();
                ParameterSlot parameterSlotFindParameter = parametersTreeWa2 != null ? parametersTreeWa2.findParameter(str) : null;
                SelectParameter selectParameter = parameterSlotFindParameter instanceof SelectParameter ? (SelectParameter) parameterSlotFindParameter : null;
                if (selectParameter != null) {
                    selectParameter.applyChosenValue();
                }
                C33789t c33789t2 = c33975x.f238129d0;
                if (c33789t2 != null) {
                    c33789t2.i();
                }
                c33975x.re();
                return;
            }
            if (!(abstractC35806h3 instanceof AbstractC35806h3.a)) {
                if ((abstractC35806h3 instanceof AbstractC35806h3.b) || abstractC35806h3.equals(AbstractC35806h3.c.f318892a)) {
                    return;
                }
                abstractC35806h3.equals(AbstractC35806h3.f.f318895a);
                return;
            }
            ParametersTree parametersTreeWa3 = c33975x.f238113N.wa();
            Parcelable parcelableFindParameter = parametersTreeWa3 != null ? parametersTreeWa3.findParameter(str) : null;
            MultiselectParameter multiselectParameter = parcelableFindParameter instanceof MultiselectParameter ? (MultiselectParameter) parcelableFindParameter : null;
            if (multiselectParameter != null) {
                multiselectParameter.rollbackToOldValue();
            }
            AbstractC35806h3.a aVar = (AbstractC35806h3.a) abstractC35806h3;
            C33789t c33789t3 = c33975x.f238129d0;
            if (c33789t3 != null) {
                c33789t3.i();
            }
            ApiError apiError = aVar.f318890a;
            if (apiError instanceof ApiError.Unauthorized) {
                ObjectFillFormFragment objectFillFormFragment = c33975x.f238130e0;
                if (objectFillFormFragment != null) {
                    objectFillFormFragment.t5();
                    return;
                }
                return;
            }
            C33789t c33789t4 = c33975x.f238129d0;
            if (c33789t4 != null) {
                c33789t4.j3(apiError.getF244063c());
            }
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.objects.x$g */
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f238161b = new g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to updateObjectForm onError", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/PretendResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.objects.x$h */
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            PretendResult pretendResult = (PretendResult) obj;
            C33975x c33975x = C33975x.this;
            C33789t c33789t = c33975x.f238129d0;
            if (c33789t != null) {
                c33789t.i();
            }
            if (pretendResult.getSuccess()) {
                c33975x.f238123X.a(c33975x.le());
                ObjectFillFormFragment objectFillFormFragment = c33975x.f238130e0;
                if (objectFillFormFragment != null) {
                    objectFillFormFragment.s5(c33975x.le().getId());
                    return;
                }
                return;
            }
            if (!pretendResult.getSuccess()) {
                c33975x.f238133h0 = true;
                if (c33975x.f238121V && (str = (String) C42745f0.F(pretendResult.getErrors().keySet())) != null) {
                    String strNe = c33975x.ne();
                    String strOe = c33975x.oe();
                    String strMe = c33975x.me();
                    PretendErrorValue pretendErrorValue = pretendResult.getErrors().get(str);
                    c33975x.f238111L.c(new Gd0.c(c33975x.f238112M, strNe, strOe, strMe, pretendErrorValue != null ? pretendErrorValue.getSingleMessage() : null, str));
                }
            }
            c33975x.re();
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.objects.x$i */
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            C33975x c33975x = C33975x.this;
            C33789t c33789t = c33975x.f238129d0;
            if (c33789t != null) {
                c33789t.i();
            }
            C33789t c33789t2 = c33975x.f238129d0;
            if (c33789t2 != null) {
                c33789t2.C0();
            }
            com.avito.android.error.z.h(th2, new D0(c33975x), null, new E0(c33975x), 58);
        }
    }

    @Inject
    public C33975x(@Y61.k Resources resources, @Y61.k Q1 q12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.category_parameters.a aVar, @Y61.k com.avito.android.details.b bVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.publish.analytics.h0 h0Var, @Y61.k com.avito.android.publish.imv.f fVar, @Y61.k InterfaceC33955k interfaceC33955k, @Y61.l ObjectFillFormScreenParams.SelectedValue selectedValue, @Y61.k P0 p02, @Y61.k com.avito.android.publish.objects.slot.c cVar, @Y61.k com.avito.android.publish.view.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC36030r0 interfaceC36030r0, @com.avito.android.publish.objects.di.Y @Y61.k h31.e eVar, @Y61.k Locale locale, @t3.l0 @Y61.k u3.l lVar, @Y61.k C50213a c50213a, boolean z12) {
        this.f238108E = interfaceC36030r0;
        this.f238109J = eVar;
        this.f238110K = selectedValue;
        this.f238111L = interfaceC28373a;
        this.f238112M = c50213a;
        this.f238113N = interfaceC33955k;
        this.f238114O = aVar2;
        this.f238115P = bVar;
        this.f238116Q = aVar;
        this.f238117R = interfaceC35745a5;
        this.f238118S = resources;
        this.f238119T = locale;
        this.f238120U = q12;
        this.f238121V = z12;
        this.f238122W = interfaceC33535v;
        this.f238123X = p02;
        this.f238124Y = cVar;
        this.f238125Z = h0Var;
        this.f238126a0 = fVar;
        this.f238127b0 = lVar;
        this.f238131f0 = new C33953j(eVar);
        aVar2.F(interfaceC33955k);
        bVar.L3(this);
        bVar.I(interfaceC33955k);
    }

    @Override // com.avito.android.details.a
    @Y61.l
    public final CategoryParameters C0() {
        return this.f238114O.C0();
    }

    @Override // com.avito.android.publish.view.a
    public final void F(@Y61.k com.avito.android.details.a aVar) {
        this.f238114O.F(aVar);
    }

    @Override // com.avito.android.publish.view.a
    public final void G(@Y61.k com.avito.conveyor_item.a aVar) {
        this.f238114O.G(aVar);
    }

    @Override // com.avito.android.publish.view.a
    public final void Q9(@Y61.k ItemWithAdditionalButton itemWithAdditionalButton) {
        this.f238114O.Q9(itemWithAdditionalButton);
    }

    @Override // com.avito.android.publish.view.a
    public final void U7(@Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12) {
        this.f238114O.U7(c29377e, l12);
    }

    @Override // com.avito.android.publish.view.a
    public final void Z2(@Y61.k com.avito.android.items.d dVar, @Y61.k String str, boolean z12) {
        this.f238114O.Z2(dVar, str, z12);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void Zc(@Y61.k String str) {
        this.f238122W.L0(str);
    }

    @Override // com.avito.android.publish.view.a
    public final void be(@Y61.k ParameterElement.C29376d c29376d, @Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12, boolean z12, boolean z13) {
        this.f238114O.be(c29376d, c29377e, l12, z12, z13);
    }

    @Override // com.avito.android.publish.view.a
    public final void c0() {
        this.f238130e0 = null;
        this.f238114O.c0();
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void c3(@Y61.l ParameterSlot parameterSlot, @Y61.l String str) {
        if (str == null) {
            re();
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.O oMc = this.f238113N.mc();
        InterfaceC35745a5 interfaceC35745a5 = this.f238117R;
        oMc.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).u0(new f(str), g.f238161b);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
        if (confirmation == null) {
            ke(navigationButtonAction, deepLink);
            return;
        }
        ObjectFillFormFragment objectFillFormFragment = this.f238130e0;
        if (objectFillFormFragment != null) {
            com.avito.android.publish.confirmation_dialog.c.a(objectFillFormFragment, confirmation, new e(navigationButtonAction, deepLink));
        }
    }

    @Override // com.avito.android.publish.view.a
    public final void e(@Y61.k a.b bVar) {
        this.f238114O.e(bVar);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@Y61.l String str) {
        re();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void j2() throws Resources.NotFoundException {
        kotlin.Q q12;
        Resources resources = this.f238118S;
        String string = resources.getString(R.string.delete);
        String string2 = resources.getString(R.string.dismiss);
        if (this.f238127b0.f439745a.f439749b.b()) {
            q12 = new kotlin.Q(resources.getString(R.string.object_fill_form_remove_item_title), resources.getString(R.string.object_fill_form_remove_item_subtitle));
        } else {
            q12 = new kotlin.Q(null, string + ' ' + le().getTitle().toLowerCase(this.f238119T) + '?');
        }
        String str = (String) q12.f406619b;
        String str2 = (String) q12.f406620c;
        ObjectFillFormFragment objectFillFormFragment = this.f238130e0;
        if (objectFillFormFragment != null) {
            d dVar = new d();
            u3.l<SimpleTestGroupWithNone> lVar = objectFillFormFragment.f237539K0;
            if (lVar == null) {
                lVar = null;
            }
            if (lVar.f439745a.f439749b.b()) {
                C33789t c33789t = objectFillFormFragment.f237542N0;
                (c33789t != null ? c33789t : null).s(str, str2, string, string2, dVar);
            } else {
                C33789t c33789t2 = objectFillFormFragment.f237542N0;
                (c33789t2 != null ? c33789t2 : null).r(str, str2, string, string2, dVar);
            }
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void k2(boolean z12) {
        ObjectFillFormFragment objectFillFormFragment = this.f238130e0;
        if (objectFillFormFragment != null) {
            objectFillFormFragment.E0();
        }
    }

    public final void ke(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, DeepLink deepLink) {
        ObjectFillFormFragment objectFillFormFragment;
        int i12 = navigationButtonAction == null ? -1 : c.f238154a[navigationButtonAction.ordinal()];
        if (i12 != -1) {
            if (i12 == 4) {
                if (deepLink == null || (objectFillFormFragment = this.f238130e0) == null) {
                    return;
                }
                objectFillFormFragment.K2(deepLink, null);
                return;
            }
            if (i12 != 5) {
                return;
            }
        }
        se();
    }

    public final ObjectsParameter le() {
        return this.f238109J.get();
    }

    public final String me() {
        List list;
        List<? extends List<? extends ParameterSlot>> value = le().getValue();
        ParameterSlot parameterSlot = (value == null || (list = (List) C42745f0.G(value)) == null) ? null : (ParameterSlot) C42745f0.G(list);
        SelectParameter.Flat flat = parameterSlot instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlot : null;
        if (flat != null) {
            return flat.getDisplayTitle();
        }
        return null;
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void nb() {
        se();
    }

    public final String ne() {
        Navigation navigation2;
        List<Map<String, String>> attributes;
        Map map;
        Collection collectionValues;
        CategoryParameters categoryParametersC0 = this.f238114O.C0();
        if (categoryParametersC0 == null || (navigation2 = categoryParametersC0.getNavigation()) == null || (attributes = navigation2.getAttributes()) == null || (map = (Map) C42745f0.G(attributes)) == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return (String) C42745f0.F(collectionValues);
    }

    public final String oe() {
        Navigation navigation2;
        List<Map<String, String>> attributes;
        CategoryParameters categoryParametersC0 = this.f238114O.C0();
        if (categoryParametersC0 == null || (navigation2 = categoryParametersC0.getNavigation()) == null || (attributes = navigation2.getAttributes()) == null || attributes.size() <= 1) {
            return null;
        }
        return (String) C42745f0.F(attributes.get(1).values());
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        if (this.f238120U.v().invoke().booleanValue()) {
            this.f238124Y.f238098d.e();
        }
        Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f238132g0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof com.avito.android.publish.slots.q) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.avito.android.publish.slots.q) it.next()).clear();
        }
    }

    public final void pe(List<? extends SuggestAction> list) {
        for (SuggestAction suggestAction : list) {
            if (suggestAction instanceof SuggestAnalyticsEvent) {
                this.f238122W.w0((SuggestAnalyticsEvent) suggestAction);
            } else if (suggestAction instanceof SuggestSetFieldValue) {
                SuggestSetFieldValue suggestSetFieldValue = (SuggestSetFieldValue) suggestAction;
                String fieldId = suggestSetFieldValue.getFieldId();
                String value = suggestSetFieldValue.getValue();
                ParametersTree parametersTreeWa = this.f238113N.wa();
                ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(fieldId) : null;
                PriceParameter priceParameter = parameterSlotFindParameter instanceof PriceParameter ? (PriceParameter) parameterSlotFindParameter : null;
                if (priceParameter != null) {
                    priceParameter.setValue(value);
                }
                re();
            }
        }
    }

    public final void qe(Ij.b bVar) {
        ParameterSlot parameterSlotFindParameter;
        ParametersTree parametersTreeWa = this.f238114O.wa();
        if (parametersTreeWa == null || (parameterSlotFindParameter = parametersTreeWa.findParameter(bVar.f8494a)) == null) {
            return;
        }
        this.f238115P.m3(bVar, parameterSlotFindParameter, true);
    }

    public final void re() {
        AttributedText f173932g;
        InterfaceC33955k interfaceC33955k = this.f238113N;
        ParametersTree parametersTreeWa = interfaceC33955k.wa();
        if (parametersTreeWa == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(com.avito.android.category_parameters.a.c(this.f238116Q, parametersTreeWa, null, this.f238132g0, null, 26));
        if (!interfaceC33955k.T0() && !this.f238127b0.f439745a.f439749b.b()) {
            arrayList.add(new H0());
        }
        InterfaceC36030r0 interfaceC36030r0 = this.f238108E;
        interfaceC36030r0.f(parametersTreeWa, null);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            if ((aVar instanceof JO.i) && (f173932g = ((JO.i) aVar).getF173932g()) != null) {
                f173932g.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 11));
            }
            arrayList2.add(aVar);
        }
        interfaceC36030r0.c().accept(arrayList2);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void s(@Y61.k BubbleInfo bubbleInfo) {
        List<SuggestAction> actions = bubbleInfo.getActions();
        if (actions == null) {
            actions = C42784z0.f406748b;
        }
        pe(actions);
    }

    public final void se() {
        C33789t c33789t = this.f238129d0;
        if (c33789t != null) {
            c33789t.h();
        }
        if (this.f238121V) {
            this.f238111L.c(new Gd0.e(ne(), oe(), me(), this.f238112M));
        }
        C42022u c42022uK1 = this.f238113N.k1();
        InterfaceC35745a5 interfaceC35745a5 = this.f238117R;
        this.f238128c0.b(c42022uK1.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new h(), new i()));
    }

    @Override // com.avito.android.details.e
    @Y61.l
    public final ParametersTree wa() {
        return this.f238114O.wa();
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void Nc() {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void O5() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void n9() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void vd() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void C5(@Y61.k AddressParameter addressParameter) {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void D(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void I9(@Y61.k String str) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@Y61.k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void n(@Y61.k DeepLink deepLink) {
    }
}
