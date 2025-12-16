package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import Q80.C14870a;
import Q80.d;
import Q80.n;
import Q80.p;
import Q80.q;
import androidx.compose.runtime.internal.P;
import c90.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ActionType;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ApiButtonOptional;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_v_1.ApiButtonOptional;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.ActionButton;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: PositionInSearchMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/e;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PositionInSearchStorage f221404a;

    /* compiled from: PositionInSearchMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f221405a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f221406b;

        static {
            int[] iArr = new int[PositionInfoPeriodAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionInfoPeriodAction positionInfoPeriodAction = PositionInfoPeriodAction.f221449b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PositionInfoPeriodAction positionInfoPeriodAction2 = PositionInfoPeriodAction.f221449b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ApiButtonOptional.Style.values().length];
            try {
                iArr2[ApiButtonOptional.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiButtonOptional.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f221405a = iArr2;
            int[] iArr3 = new int[ApiButtonOptional.Style.values().length];
            try {
                iArr3[ApiButtonOptional.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ApiButtonOptional.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f221406b = iArr3;
        }
    }

    @Inject
    public e(@Y61.k PositionInSearchStorage positionInSearchStorage) {
        this.f221404a = positionInSearchStorage;
    }

    public static ActionButton i(com.avito.android.position_in_search.stats.generated.api.api_search_position_v_1.ApiButtonOptional apiButtonOptional) {
        ActionButton.Style style;
        String title = apiButtonOptional.getTitle();
        DeepLink deepLink = apiButtonOptional.getDeepLink();
        int i12 = a.f221405a[apiButtonOptional.getStyle().ordinal()];
        if (i12 == 1) {
            style = ActionButton.Style.f221440b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            style = ActionButton.Style.f221441c;
        }
        return new ActionButton(title, deepLink, style);
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.l
    public final c.e a(@Y61.k R80.c cVar) {
        List<R80.h> listE = cVar.e();
        List<R80.h> list = listE;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (R80.h hVar : list) {
            arrayList.add(new SegmentedControl.c(hVar.getAvailable(), hVar.getTitle()));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        for (R80.h hVar2 : list) {
            PeriodType.a aVar = PeriodType.f221444c;
            String strB = hVar2.getId();
            aVar.getClass();
            arrayList2.add(new c.e.a(PeriodType.a.a(strB), new c.e.a.C2035a(hVar2.getTitle(), hVar2.getAvailable(), hVar2.getUnavailableHint()), null, null, null));
        }
        Iterator<R80.h> it = listE.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().getAvailable()) {
                break;
            }
            i12++;
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 < 0) {
            numValueOf = null;
        }
        return new c.e(arrayList, arrayList2, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.l
    public final c.e.a.C2036c b(@Y61.l n nVar) {
        if (nVar == null) {
            return null;
        }
        String title = nVar.getHeader().getTitle();
        String description = nVar.getHeader().getDescription();
        String leftColumnTitle = nVar.getHeader().getLeftColumnTitle();
        String rightColumnTitle = nVar.getHeader().getRightColumnTitle();
        List<p> listB = nVar.b();
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (p pVar : listB) {
            String title2 = pVar.getTitle();
            AttributedText delta = pVar.getDelta();
            String id2 = pVar.getId();
            AttributedText link = pVar.getLink();
            AttributedText position = pVar.getPosition();
            List<q> listF = pVar.f();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listF, i12));
            for (Iterator it = listF.iterator(); it.hasNext(); it = it) {
                q qVar = (q) it.next();
                arrayList2.add(new c.e.a.C2036c.b.C2038a(qVar.getTitle(), qVar.getValue()));
            }
            arrayList.add(new c.e.a.C2036c.b(title2, delta, id2, link, position, arrayList2, pVar.getTooltipText(), pVar.getEventDeepLink()));
            i12 = 10;
        }
        Q80.l nextPageButton = nVar.getNextPageButton();
        return new c.e.a.C2036c(title, description, leftColumnTitle, rightColumnTitle, arrayList, nextPageButton != null ? new c.e.a.C2036c.C2037a(nextPageButton.getTitle(), nextPageButton.getNextPageOffset()) : null);
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.l
    public final c.e.a.b c(@Y61.k d.a aVar) {
        Q80.m positionData = aVar.getPositionData();
        return new c.e.a.b(positionData.getDescription(), positionData.getPosition(), positionData.getDelta(), positionData.getTitle(), aVar.getPeriodTitle(), positionData.getTooltipText());
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.l
    public final c.d d(@Y61.k R80.c cVar) {
        R80.d bottomInfo = cVar.getBottomInfo();
        if (bottomInfo == null) {
            return null;
        }
        Image image = bottomInfo.getItem().getImage();
        String price = bottomInfo.getItem().getPrice();
        String title = bottomInfo.getItem().getTitle();
        com.avito.android.position_in_search.stats.generated.api.api_search_position_v_1.ApiButtonOptional leftButton = bottomInfo.getLeftButton();
        ActionButton actionButtonI = leftButton != null ? i(leftButton) : null;
        com.avito.android.position_in_search.stats.generated.api.api_search_position_v_1.ApiButtonOptional rightButton = bottomInfo.getRightButton();
        return new c.d(price, image, C42756l.B(new ActionButton[]{actionButtonI, rightButton != null ? i(rightButton) : null}), title);
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.l
    public final c.a e(@Y61.k d.a aVar) {
        ActionButton.Style style;
        C14870a adviceBanner = aVar.getAdviceBanner();
        ActionButton actionButton = null;
        if (adviceBanner == null) {
            return null;
        }
        if (this.f221404a.b(PositionInSearchStorage.Place.f221564c).contains(adviceBanner.getId())) {
            return null;
        }
        String id2 = adviceBanner.getId();
        boolean closable = adviceBanner.getClosable();
        String title = adviceBanner.getTitle();
        String description = adviceBanner.getDescription();
        com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ApiButtonOptional button = adviceBanner.getButton();
        if (button != null) {
            String title2 = button.getTitle();
            DeepLink deepLink = button.getDeepLink();
            int i12 = a.f221406b[button.getStyle().ordinal()];
            if (i12 == 1) {
                style = ActionButton.Style.f221440b;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                style = ActionButton.Style.f221441c;
            }
            actionButton = new ActionButton(title2, deepLink, style);
        }
        return new c.a(id2, closable, title, description, actionButton);
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.k
    public final ActionType f(@Y61.k PositionInfoPeriodAction positionInfoPeriodAction) {
        int iOrdinal = positionInfoPeriodAction.ordinal();
        if (iOrdinal == 0) {
            return ActionType.Init;
        }
        if (iOrdinal == 1) {
            return ActionType.PeriodChange;
        }
        if (iOrdinal == 2) {
            return ActionType.QueriesPortion;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.l
    public final c.a g(@Y61.k R80.c cVar) {
        R80.b banner = cVar.getBanner();
        if (banner == null) {
            return null;
        }
        if (this.f221404a.b(PositionInSearchStorage.Place.f221563b).contains(banner.getId())) {
            return null;
        }
        String id2 = banner.getId();
        boolean closable = banner.getClosable();
        String title = banner.getTitle();
        String description = banner.getDescription();
        com.avito.android.position_in_search.stats.generated.api.api_search_position_v_1.ApiButtonOptional button = banner.getButton();
        return new c.a(id2, closable, title, description, button != null ? i(button) : null);
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.domain.d
    @Y61.l
    public final c.C2034c h(@Y61.k R80.c cVar) {
        c.C2034c.b bVar;
        R80.e competitorsData = cVar.getCompetitorsData();
        if (competitorsData == null) {
            return null;
        }
        String strC = competitorsData.getTitle();
        AttributedText attributedTextA = competitorsData.getDescription();
        List<R80.f> listB = competitorsData.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (R80.f fVar : listB) {
            Image imageB = fVar.getImage();
            String strD = fVar.getPrice();
            String strE = fVar.getTitle();
            String strC2 = fVar.getLocation();
            R80.g gVarF = fVar.getViews();
            if (gVarF != null) {
                com.akita.compose.theme.re23.g gVar = com.akita.compose.theme.re23.g.f65049a;
                String iconName = gVarF.getIconName();
                gVar.getClass();
                bVar = new c.C2034c.b(com.akita.compose.theme.re23.g.a(iconName), gVarF.getCurrentCount(), gVarF.getDeltaCount());
            } else {
                bVar = null;
            }
            arrayList.add(new c.C2034c.a(imageB, strD, strE, strC2, bVar, fVar.getDeepLink()));
        }
        return new c.C2034c(attributedTextA, strC, arrayList);
    }
}
