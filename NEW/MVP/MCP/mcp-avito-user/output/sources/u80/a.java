package U80;

import Q80.C14871b;
import Q80.l;
import Q80.n;
import Q80.o;
import Q80.p;
import Q80.q;
import Y61.k;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.AdditionalToast;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ApiButtonOptional;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ChartMobileColsItemPromotionsItem;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.SortingControl;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PeriodSortDirection;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PositionInfoByPeriodMapperV1.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: PositionInfoByPeriodMapperV1.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: U80.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1102a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16213a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16214b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f16215c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f16216d;

        static {
            int[] iArr = new int[PositionInfoPeriodAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionInfoPeriodAction positionInfoPeriodAction = PositionInfoPeriodAction.f220478b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PositionInfoPeriodAction positionInfoPeriodAction2 = PositionInfoPeriodAction.f220478b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PositionInfoPeriodAction positionInfoPeriodAction3 = PositionInfoPeriodAction.f220478b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[PeriodSortDirection.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PeriodSortDirection periodSortDirection = PeriodSortDirection.f220409c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[SortingControl.Direction.values().length];
            try {
                iArr3[SortingControl.Direction.Asc.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SortingControl.Direction.Desc.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f16213a = iArr3;
            int[] iArr4 = new int[ApiButtonOptional.Style.values().length];
            try {
                iArr4[ApiButtonOptional.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[ApiButtonOptional.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f16214b = iArr4;
            int[] iArr5 = new int[AdditionalToast.Type.values().length];
            try {
                iArr5[AdditionalToast.Type.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[AdditionalToast.Type.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f16215c = iArr5;
            int[] iArr6 = new int[ChartMobileColsItemPromotionsItem.Type.values().length];
            try {
                iArr6[ChartMobileColsItemPromotionsItem.Type.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr6[ChartMobileColsItemPromotionsItem.Type.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[ChartMobileColsItemPromotionsItem.Type.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[ChartMobileColsItemPromotionsItem.Type.STARTEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[ChartMobileColsItemPromotionsItem.Type.EMPTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            f16216d = iArr6;
        }
    }

    public static final PositionInfoPeriod.AdditionalToast a(AdditionalToast additionalToast) {
        PositionInfoPeriod.AdditionalToast.Type type;
        boolean closable = additionalToast.getClosable();
        String message = additionalToast.getMessage();
        boolean showRefreshButton = additionalToast.getShowRefreshButton();
        int i12 = C1102a.f16215c[additionalToast.getType().ordinal()];
        if (i12 == 1) {
            type = PositionInfoPeriod.AdditionalToast.Type.f220435b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type = PositionInfoPeriod.AdditionalToast.Type.f220436c;
        }
        return new PositionInfoPeriod.AdditionalToast(closable, message, showRefreshButton, type);
    }

    public static final PositionInfoPeriod.d b(n nVar, boolean z12) {
        PositionInfoPeriod.d.C6629d c6629d;
        SortingControl sortingControl;
        PeriodSortDirection periodSortDirection;
        o header = nVar.getHeader();
        PositionInfoPeriod.d.a aVar = new PositionInfoPeriod.d.a(header.getDescription(), header.getLeftColumnTitle(), header.getRightColumnTitle(), header.getTitle());
        List<p> listB = nVar.b();
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            AttributedText delta = pVar.getDelta();
            String id2 = pVar.getId();
            AttributedText link = pVar.getLink();
            StringBuilder sb2 = new StringBuilder();
            AttributedText link2 = pVar.getLink();
            sb2.append(link2 != null ? link2.getText() : null);
            sb2.append(pVar.getId());
            String string = sb2.toString();
            AttributedText position = pVar.getPosition();
            List<q> listF = pVar.f();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listF, i12));
            int i13 = 0;
            for (Object obj : listF) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                q qVar = (q) obj;
                arrayList2.add(new PositionInfoPeriod.d.e(pVar.getId() + i13, qVar.getTitle(), qVar.getValue()));
                i13 = i14;
                it = it;
            }
            arrayList.add(new PositionInfoPeriod.d.c(delta, id2, link, string, position, arrayList2, pVar.getTitle(), pVar.getTooltipText(), pVar.getEventDeepLink()));
            it = it;
            i12 = 10;
        }
        l nextPageButton = nVar.getNextPageButton();
        PositionInfoPeriod.d.b bVar = nextPageButton != null ? new PositionInfoPeriod.d.b(nextPageButton.getNextPageOffset(), nextPageButton.getTitle()) : null;
        if (!z12 || (sortingControl = nVar.getSortingControl()) == null) {
            c6629d = null;
        } else {
            String title = sortingControl.getTitle();
            String slug = sortingControl.getSlug();
            int i15 = C1102a.f16213a[sortingControl.getDirection().ordinal()];
            if (i15 == 1) {
                periodSortDirection = PeriodSortDirection.f220409c;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                periodSortDirection = PeriodSortDirection.f220410d;
            }
            c6629d = new PositionInfoPeriod.d.C6629d(title, slug, periodSortDirection, sortingControl.getDeepLink());
        }
        return new PositionInfoPeriod.d(aVar, c6629d, arrayList, bVar);
    }

    @k
    public static final UniversalColor c(@k C14871b c14871b) {
        Integer numA;
        Integer numA2;
        String valueName = c14871b.getValueName();
        String valueDark = c14871b.getValueDark();
        Color color = null;
        Color color2 = (valueDark == null || (numA2 = C35787f0.a(valueDark)) == null) ? null : new Color(numA2.intValue());
        String value = c14871b.getValue();
        if (value != null && (numA = C35787f0.a(value)) != null) {
            color = new Color(numA.intValue());
        }
        return new UniversalColor(valueName, color2, color);
    }
}
