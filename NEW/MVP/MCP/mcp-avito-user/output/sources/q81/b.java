package Q81;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.badge_bar.SerpBadgeStyle;
import com.avito.android.util.D6;
import hw.InterfaceC41178c;
import j.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;
import ru.avito.component.snippet_badge_bar.a;
import sK0.C48065c;

/* compiled from: BadgeBars.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes9.dex */
public final class b {

    /* compiled from: BadgeBars.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13549a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13550b;

        static {
            int[] iArr = new int[SerpBadgeStyle.DockingStyle.values().length];
            try {
                iArr[SerpBadgeStyle.DockingStyle.FLAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SerpBadgeStyle.DockingStyle.PIPKA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SerpBadgeStyle.DockingStyle.PYRAMID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SerpBadgeStyle.DockingStyle.ANTI_PYRAMID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13549a = iArr;
            int[] iArr2 = new int[SerpBadgeStyle.DockingSize.values().length];
            try {
                iArr2[SerpBadgeStyle.DockingSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SerpBadgeStyle.DockingSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f13550b = iArr2;
        }
    }

    @InterfaceC41178c
    public static final void a(@k CompactFlexibleLayout compactFlexibleLayout, @l List<SerpBadge> list, @f0 int i12) {
        UniversalImage icon;
        List<SerpBadge> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            D6.w(compactFlexibleLayout);
            return;
        }
        List<SerpBadge> list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        for (SerpBadge serpBadge : list3) {
            String title = serpBadge.getTitle();
            Context context = compactFlexibleLayout.getContext();
            SerpBadgeStyle style = serpBadge.getStyle();
            com.avito.android.image_loader.a aVarB = null;
            int iB2 = C48065c.b(context, style != null ? style.getFontColor() : null, R.color.legacy_constant_black);
            Context context2 = compactFlexibleLayout.getContext();
            SerpBadgeStyle style2 = serpBadge.getStyle();
            int iB3 = C48065c.b(context2, style2 != null ? style2.getBackgroundColor() : null, R.color.legacy_constant_white);
            SerpBadgeStyle style3 = serpBadge.getStyle();
            if (style3 != null && (icon = style3.getIcon()) != null) {
                aVarB = com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(icon, com.avito.android.lib.util.darkTheme.c.b(compactFlexibleLayout.getContext())));
            }
            arrayList.add(new JU.c(title, iB2, iB3, aVarB));
        }
        D6.H(compactFlexibleLayout);
        new JU.a(compactFlexibleLayout, i12).c(compactFlexibleLayout, arrayList);
    }

    @InterfaceC41178c
    public static final int b(@k List<SerpBadge> list) {
        Integer num;
        Iterator<T> it = list.iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            SerpBadge serpBadge = (SerpBadge) it.next();
            Integer version = serpBadge.getVersion();
            if (serpBadge.getIcon() == null) {
                num = version;
            }
        } while (num == null);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final DockingBadgeEdgeType c(SerpBadgeStyle.DockingStyle dockingStyle) {
        int i12 = a.f13549a[dockingStyle.ordinal()];
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? DockingBadgeEdgeType.Square : DockingBadgeEdgeType.AntiPyramid : DockingBadgeEdgeType.Pyramid : DockingBadgeEdgeType.Pipka : DockingBadgeEdgeType.Flag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.avito.android.lib.design.docking_badge.DockingBadgeSize] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.avito.android.lib.design.docking_badge.DockingBadgeSize] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.avito.android.lib.design.docking_badge.DockingBadgeSize] */
    @InterfaceC41178c
    @k
    public static final ru.avito.component.snippet_badge_bar.d d(@k SerpBadgeBar serpBadgeBar) {
        SerpBadgeStyle.DockingSize size;
        ru.avito.component.snippet_badge_bar.a aVar;
        SerpBadgeStyle.DockingStyle rightEdgeStyle;
        SerpBadgeStyle.DockingStyle leftEdgeStyle;
        List<SerpBadge> badges = serpBadgeBar.getBadges();
        if (badges == null) {
            badges = C42784z0.f406748b;
        }
        int iB2 = b(badges);
        List<SerpBadge> badges2 = serpBadgeBar.getBadges();
        if (badges2 == null) {
            badges2 = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (SerpBadge serpBadge : badges2) {
            ru.avito.component.snippet_badge_bar.a aVar2 = null;
            if (serpBadge.getIcon() == null || iB2 != 2) {
                String title = serpBadge.getTitle();
                SerpBadgeStyle style = serpBadge.getStyle();
                UniversalColor backgroundColor = style != null ? style.getBackgroundColor() : null;
                SerpBadgeStyle style2 = serpBadge.getStyle();
                UniversalColor fontColor = style2 != null ? style2.getFontColor() : null;
                SerpBadgeStyle style3 = serpBadge.getStyle();
                UniversalImage icon = style3 != null ? style3.getIcon() : null;
                SerpBadgeStyle style4 = serpBadge.getStyle();
                DockingBadgeEdgeType dockingBadgeEdgeTypeC = (style4 == null || (leftEdgeStyle = style4.getLeftEdgeStyle()) == null) ? null : c(leftEdgeStyle);
                SerpBadgeStyle style5 = serpBadge.getStyle();
                DockingBadgeEdgeType dockingBadgeEdgeTypeC2 = (style5 == null || (rightEdgeStyle = style5.getRightEdgeStyle()) == null) ? null : c(rightEdgeStyle);
                SerpBadgeStyle style6 = serpBadge.getStyle();
                if (style6 != null && (size = style6.getSize()) != null) {
                    int i12 = a.f13550b[size.ordinal()];
                    if (i12 == 1) {
                        aVar = DockingBadgeSize.SMALL;
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = DockingBadgeSize.MEDIUM;
                    }
                    aVar2 = aVar;
                }
                aVar2 = new ru.avito.component.snippet_badge_bar.a(title, new a.C12401a(backgroundColor, fontColor, icon, dockingBadgeEdgeTypeC, dockingBadgeEdgeTypeC2, aVar2));
            }
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        return new ru.avito.component.snippet_badge_bar.d(iB2, arrayList);
    }
}
