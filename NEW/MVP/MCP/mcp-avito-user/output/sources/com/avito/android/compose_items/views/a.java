package com.avito.android.compose_items.views;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.akita.compose.component.chips.ChipsDisplayType;
import com.akita.compose.component.chips.y;
import com.akita.compose.theme.re23.style.W;
import com.avito.android.category_parameters.ParameterElement;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: ChipsStylesHelper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/compose_items/views/a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f125426a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f125427b = C42727D.c(b.f125429l);

    /* compiled from: ChipsStylesHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.compose_items.views.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3725a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125428a;

        static {
            int[] iArr = new int[ParameterElement.DisplayType.Chips.Style.values().length];
            try {
                ParameterElement.DisplayType.Chips.Style style = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style2 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style3 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style4 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f125428a = iArr;
        }
    }

    /* compiled from: ChipsStylesHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lcom/akita/compose/component/chips/y;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Map<String, ? extends y>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f125429l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends y> invoke() {
            return P0.g(new Q(Constants.SMALL, W.a().getF66018a()), new Q("smallRound", W.a().getF66020b()), new Q("medium", W.a().getF66022c()), new Q("mediumRound", W.a().getF66024d()), new Q(Constants.LARGE, W.a().getF66026e()), new Q("largeRound", W.a().getF66028f()), new Q("disableablePrimarySmall", W.a().getF66030g()), new Q("disableablePrimarySmallRound", W.a().getF66032h()), new Q("disableablePrimaryMedium", W.a().getF66034i()), new Q("disableablePrimaryMediumRound", W.a().getF66035j()), new Q("disableablePrimaryLarge", W.a().getF66036k()), new Q("disableablePrimaryLargeRound", W.a().getF66037l()), new Q("overlayPrimarySmall", W.a().getF66038m()), new Q("overlayPrimarySmallRound", W.a().getF66039n()), new Q("overlayPrimaryMedium", W.a().getF66040o()), new Q("overlayPrimaryMediumRound", W.a().getF66041p()), new Q("overlayPrimaryLarge", W.a().getF66042q()), new Q("overlayPrimaryLargeRound", W.a().getF66043r()), new Q("disableableOverlayPrimarySmall", W.a().getF66044s()), new Q("disableableOverlayPrimarySmallRound", W.a().getF66045t()), new Q("disableableOverlayPrimaryMedium", W.a().getF66046u()), new Q("disableableOverlayPrimaryMediumRound", W.a().getF66047v()), new Q("disableableOverlayPrimaryLarge", W.a().getF66048w()), new Q("disableableOverlayPrimaryLargeRound", W.a().getF66049x()), new Q("overlaySecondarySmall", W.a().getF66050y()), new Q("overlaySecondarySmallRound", W.a().getF66051z()), new Q("overlaySecondaryMedium", W.a().getF65992A()), new Q("overlaySecondaryMediumRound", W.a().getF65993B()), new Q("overlaySecondaryLarge", W.a().getF65994C()), new Q("overlaySecondaryLargeRound", W.a().getF65995D()), new Q("disableableOverlaySecondarySmall", W.a().getF65996E()), new Q("disableableOverlaySecondarySmallRound", W.a().getF65997F()), new Q("disableableOverlaySecondaryMedium", W.a().getF65998G()), new Q("disableableOverlaySecondaryMediumRound", W.a().getF65999H()), new Q("disableableOverlaySecondaryLarge", W.a().getF66000I()), new Q("disableableOverlaySecondaryLargeRound", W.a().getF66001J()), new Q("outlinedSmall", W.a().getF66002K()), new Q("outlinedSmallRound", W.a().getF66003L()), new Q("outlinedMedium", W.a().getF66004M()), new Q("outlinedMediumRound", W.a().getF66005N()), new Q("outlinedLarge", W.a().getF66006O()), new Q("outlinedLargeRound", W.a().getF66007P()), new Q("disableableOutlinedSmall", W.a().getF66008Q()), new Q("disableableOutlinedSmallRound", W.a().getF66009R()), new Q("disableableOutlinedMedium", W.a().getF66010S()), new Q("disableableOutlinedMediumRound", W.a().getF66011T()), new Q("disableableOutlinedLarge", W.a().getF66012U()), new Q("disableableOutlinedLargeRound", W.a().getF66013V()), new Q("overlayOutlinedSmall", W.a().getF66014W()), new Q("overlayOutlinedSmallRound", W.a().getF66015X()), new Q("overlayOutlinedMedium", W.a().getF66016Y()), new Q("overlayOutlinedMediumRound", W.a().getF66017Z()), new Q("overlayOutlinedLarge", W.a().getF66019a0()), new Q("overlayOutlinedLargeRound", W.a().getF66021b0()), new Q("disableableOverlayOutlinedSmall", W.a().getF66023c0()), new Q("disableableOverlayOutlinedSmallRound", W.a().getF66025d0()), new Q("disableableOverlayOutlinedMedium", W.a().getF66027e0()), new Q("disableableOverlayOutlinedMediumRound", W.a().getF66029f0()), new Q("disableableOverlayOutlinedLarge", W.a().getF66031g0()), new Q("disableableOverlayOutlinedLargeRound", W.a().getF66033h0()));
        }
    }

    @Y61.k
    public static ChipsDisplayType a(@l ParameterElement.DisplayType displayType) {
        ParameterElement.DisplayType.Chips chips = displayType instanceof ParameterElement.DisplayType.Chips ? (ParameterElement.DisplayType.Chips) displayType : null;
        ParameterElement.DisplayType.Chips.Style style = chips != null ? chips.f117247b : null;
        int i12 = style == null ? -1 : C3725a.f125428a[style.ordinal()];
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? ChipsDisplayType.f60864e : ChipsDisplayType.f60864e : ChipsDisplayType.f60863d : ChipsDisplayType.f60862c : ChipsDisplayType.f60861b;
    }
}
