package com.avito.android.fees_methods.screen.fees_methods_v2.data;

import CE.a;
import CE.e;
import CE.f;
import CE.g;
import CE.h;
import CE.j;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.fees_methods.generated.api.api_21_fees_fees_methods_get.ApiBadge;
import com.avito.android.fees_methods.generated.api.api_21_fees_fees_methods_get.OkResponseSuccessOkBarCurrentProgress;
import com.avito.android.fees_methods.generated.api.api_21_fees_fees_methods_get.OkResponseSuccessOkBarDescription;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.a;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.FeesMethodsV2HeaderItem;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.FeesMethodsV2LimitsInfoItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.remote.model.badge_bar.SerpBadgeStyle;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wZ.C49578b;

/* compiled from: FeesMethodsV2Mapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/data/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/data/a;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.fees_methods.screen.fees_methods_v2.data.a {

    /* compiled from: FeesMethodsV2Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158191a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f158192b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f158193c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f158194d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f158195e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f158196f;

        static {
            int[] iArr = new int[OkResponseSuccessOkBarCurrentProgress.State.values().length];
            try {
                iArr[OkResponseSuccessOkBarCurrentProgress.State.Warning.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f158191a = iArr;
            int[] iArr2 = new int[OkResponseSuccessOkBarDescription.State.values().length];
            try {
                iArr2[OkResponseSuccessOkBarDescription.State.Warning.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f158192b = iArr2;
            int[] iArr3 = new int[LimitsInfo.Progress.Style.values().length];
            try {
                iArr3[LimitsInfo.Progress.Style.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f158193c = iArr3;
            int[] iArr4 = new int[SerpBadgeStyle.DockingStyle.values().length];
            try {
                iArr4[SerpBadgeStyle.DockingStyle.FLAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr4[SerpBadgeStyle.DockingStyle.PIPKA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr4[SerpBadgeStyle.DockingStyle.PYRAMID.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr4[SerpBadgeStyle.DockingStyle.ANTI_PYRAMID.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr5 = new int[ApiBadge.BadgeType.values().length];
            try {
                iArr5[ApiBadge.BadgeType.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr5[ApiBadge.BadgeType.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr5[ApiBadge.BadgeType.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[ApiBadge.BadgeType.Gray.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[ApiBadge.BadgeType.Red.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            f158194d = iArr5;
            int[] iArr6 = new int[ApiBadge.LeftEdgeStyle.values().length];
            try {
                iArr6[ApiBadge.LeftEdgeStyle.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr6[ApiBadge.LeftEdgeStyle.Pipka.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[ApiBadge.LeftEdgeStyle.Pyramid.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[ApiBadge.LeftEdgeStyle.AntiPyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            f158195e = iArr6;
            int[] iArr7 = new int[ApiBadge.RightEdgeStyle.values().length];
            try {
                iArr7[ApiBadge.RightEdgeStyle.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr7[ApiBadge.RightEdgeStyle.Pipka.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr7[ApiBadge.RightEdgeStyle.Pyramid.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr7[ApiBadge.RightEdgeStyle.AntiPyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            f158196f = iArr7;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.data.a
    @k
    public final ArrayList a(@k a.b bVar, @l LimitsInfo limitsInfo) {
        com.avito.conveyor_item.a feesMethodsV2HeaderItem;
        OkResponseSuccessOkBarDescription description;
        OkResponseSuccessOkBarDescription description2;
        OkResponseSuccessOkBarCurrentProgress currentProgress;
        OkResponseSuccessOkBarCurrentProgress currentProgress2;
        ArrayList arrayList;
        Iterator it;
        boolean z12;
        ArrayList arrayList2;
        List<ApiBadge> listA;
        ArrayList arrayList3 = new ArrayList();
        boolean z13 = true;
        if (limitsInfo == null || L.f(bVar.getShowFeesMethodsInfoForced(), Boolean.TRUE)) {
            AttributedText title = bVar.getTitle();
            AttributedText description3 = bVar.getDescription();
            g bar = bVar.getBar();
            String title2 = bar != null ? bar.getTitle() : null;
            g bar2 = bVar.getBar();
            Float fValueOf = (bar2 == null || (currentProgress2 = bar2.getCurrentProgress()) == null) ? null : Float.valueOf((float) currentProgress2.getValue());
            g bar3 = bVar.getBar();
            OkResponseSuccessOkBarCurrentProgress.State state = (bar3 == null || (currentProgress = bar3.getCurrentProgress()) == null) ? null : currentProgress.getState();
            FeesMethodsV2HeaderItem.State state2 = (state == null ? -1 : a.f158191a[state.ordinal()]) == 1 ? FeesMethodsV2HeaderItem.State.f158391c : FeesMethodsV2HeaderItem.State.f158390b;
            g bar4 = bVar.getBar();
            String title3 = (bar4 == null || (description2 = bar4.getDescription()) == null) ? null : description2.getTitle();
            g bar5 = bVar.getBar();
            OkResponseSuccessOkBarDescription.State state3 = (bar5 == null || (description = bar5.getDescription()) == null) ? null : description.getState();
            feesMethodsV2HeaderItem = new FeesMethodsV2HeaderItem(title, description3, title2, fValueOf, state2, title3, (state3 != null ? a.f158192b[state3.ordinal()] : -1) == 1 ? FeesMethodsV2HeaderItem.State.f158391c : FeesMethodsV2HeaderItem.State.f158390b);
        } else {
            String itemId = bVar.getItemId();
            AttributedText title4 = bVar.getTitle();
            String description4 = limitsInfo.getDescription();
            LimitsInfo.Progress progress = limitsInfo.getProgress();
            Float fValueOf2 = progress != null ? Float.valueOf(progress.getValue()) : null;
            LimitsInfo.Progress progress2 = limitsInfo.getProgress();
            LimitsInfo.Progress.Style style = progress2 != null ? progress2.getStyle() : null;
            FeesMethodsV2LimitsInfoItem.State state4 = (style != null ? a.f158193c[style.ordinal()] : -1) == 1 ? FeesMethodsV2LimitsInfoItem.State.f158418c : FeesMethodsV2LimitsInfoItem.State.f158417b;
            LimitsInfo.Progress progress3 = limitsInfo.getProgress();
            feesMethodsV2HeaderItem = new FeesMethodsV2LimitsInfoItem(itemId, title4, description4, fValueOf2, state4, progress3 != null ? progress3.getProgressHint() : null, limitsInfo.getExtraInfo(), limitsInfo);
        }
        arrayList3.add(feesMethodsV2HeaderItem);
        Iterator it2 = bVar.g().iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            j jVar = (j) next;
            String strG = AK.c.g(i12, "fees_methods_v2_fees_method");
            String id2 = jVar.getId();
            String title5 = jVar.getTitle();
            AttributedText description5 = jVar.getDescription();
            AttributedText price = jVar.getPrice();
            CE.k badgeBar = jVar.getBadgeBar();
            if (badgeBar == null || (listA = badgeBar.a()) == null) {
                it = it2;
                z12 = z13;
                arrayList2 = null;
            } else {
                List<ApiBadge> list = listA;
                ArrayList arrayList4 = new ArrayList(C42745f0.q(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ApiBadge apiBadge = (ApiBadge) it3.next();
                    String title6 = apiBadge.getTitle();
                    int i14 = a.f158194d[apiBadge.getBadgeType().ordinal()];
                    Iterator it4 = it2;
                    DockingBadgeType.Predefined predefined = i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? i14 != 5 ? DockingBadgeType.Predefined.Black : DockingBadgeType.Predefined.Red : DockingBadgeType.Predefined.Gray : DockingBadgeType.Predefined.Blue : DockingBadgeType.Predefined.Violet : DockingBadgeType.Predefined.Green;
                    int i15 = a.f158195e[apiBadge.getLeftEdgeStyle().ordinal()];
                    Iterator it5 = it3;
                    DockingBadgeEdgeType dockingBadgeEdgeType = i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? DockingBadgeEdgeType.Square : DockingBadgeEdgeType.AntiPyramid : DockingBadgeEdgeType.Pyramid : DockingBadgeEdgeType.Pipka : DockingBadgeEdgeType.Flag;
                    int i16 = a.f158196f[apiBadge.getRightEdgeStyle().ordinal()];
                    arrayList4.add(new a.C4627a(title6, predefined, dockingBadgeEdgeType, i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? DockingBadgeEdgeType.Square : DockingBadgeEdgeType.AntiPyramid : DockingBadgeEdgeType.Pyramid : DockingBadgeEdgeType.Pipka : DockingBadgeEdgeType.Flag));
                    z13 = true;
                    it3 = it5;
                    it2 = it4;
                }
                it = it2;
                z12 = z13;
                arrayList2 = arrayList4;
            }
            e icon = jVar.getIcon();
            arrayList3.add(new com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.a(strG, id2, title5, description5, price, arrayList2, icon != null ? new wZ.l(icon.getValue(), icon.getValueDark()) : null, jVar.getUri()));
            z13 = z12;
            i12 = i13;
            it2 = it;
        }
        f alert = bVar.getAlert();
        if (alert != null) {
            String title7 = alert.getTitle();
            AttributedText description6 = alert.getDescription();
            int iB2 = com.avito.android.lib.util.f.b(alert.getStyle());
            List<CE.b> listA2 = alert.a();
            if (listA2 != null) {
                List<CE.b> list2 = listA2;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                for (CE.b bVar2 : list2) {
                    arrayList.add(new C49578b(bVar2.getTitle(), bVar2.getUri(), bVar2.getStyle(), bVar2.getIsEnabled()));
                }
            } else {
                arrayList = null;
            }
            arrayList3.add(new com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.a(iB2, title7, description6, arrayList));
        }
        AttributedText disclaimer = bVar.getDisclaimer();
        if (disclaimer != null) {
            arrayList3.add(new com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer.a(disclaimer));
        }
        h details = bVar.getDetails();
        if (details != null) {
            String text = details.getText();
            e icon2 = details.getIcon();
            wZ.l lVar = icon2 != null ? new wZ.l(icon2.getValue(), icon2.getValueDark()) : null;
            CE.c action = details.getAction();
            arrayList3.add(new com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.a(text, lVar, action != null ? new C49578b(action.getTitle(), action.getUri(), action.getStyle(), action.getIsEnabled()) : null));
        }
        return arrayList3;
    }
}
