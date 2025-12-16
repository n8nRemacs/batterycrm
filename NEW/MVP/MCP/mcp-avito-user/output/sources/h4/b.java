package h4;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadge;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: AdvertBadgeBarLightConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh4/b;", "Lh4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements InterfaceC40768a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f396993a;

    /* compiled from: AdvertBadgeBarLightConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f396994a;

        static {
            int[] iArr = new int[AdvertBadgeStyle.Edge.values().length];
            try {
                iArr[AdvertBadgeStyle.Edge.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertBadgeStyle.Edge.FLAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertBadgeStyle.Edge.PIPKA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertBadgeStyle.Edge.PYRAMID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertBadgeStyle.Edge.ANTI_PYRAMID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f396994a = iArr;
        }
    }

    @Inject
    public b(@k Context context) {
        this.f396993a = context;
    }

    public static DockingBadgeEdgeType b(AdvertBadgeStyle.Edge edge) {
        int i12 = a.f396994a[edge.ordinal()];
        if (i12 == 1) {
            return DockingBadgeEdgeType.Square;
        }
        if (i12 == 2) {
            return DockingBadgeEdgeType.Flag;
        }
        if (i12 == 3) {
            return DockingBadgeEdgeType.Pipka;
        }
        if (i12 == 4) {
            return DockingBadgeEdgeType.Pyramid;
        }
        if (i12 == 5) {
            return DockingBadgeEdgeType.AntiPyramid;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.avito.android.lib.design.docking_badge.DockingBadgeItem] */
    @Override // h4.InterfaceC40768a
    @k
    public final ArrayList a(@k List list) {
        AdvertBadgeStyle.Edge rightEdgeStyle;
        DockingBadgeEdgeType dockingBadgeEdgeTypeB;
        AdvertBadgeStyle.Edge leftEdgeStyle;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdvertBadge advertBadge = (AdvertBadge) it.next();
            AdvertBadgeStyle style = advertBadge.getStyle();
            DockingBadgeEdgeType dockingBadgeItem = null;
            if (style != null) {
                UniversalColor fontColor = style.getFontColor();
                Context context = this.f396993a;
                DockingBadgeType.CustomColors customColors = new DockingBadgeType.CustomColors(R.style.Re23_DockingBadge_SpecialBlackMedium, Integer.valueOf(C48065c.b(context, style.getBackgroundColor(), R.attr.warmGray8)), Integer.valueOf(C48065c.b(context, fontColor, R.attr.black)), null, null, 24, null);
                AdvertBadgeStyle style2 = advertBadge.getStyle();
                if (style2 != null && (rightEdgeStyle = style2.getRightEdgeStyle()) != null && (dockingBadgeEdgeTypeB = b(rightEdgeStyle)) != null) {
                    String title = advertBadge.getTitle();
                    AdvertBadgeStyle style3 = advertBadge.getStyle();
                    if (style3 != null && (leftEdgeStyle = style3.getLeftEdgeStyle()) != null) {
                        dockingBadgeItem = b(leftEdgeStyle);
                    }
                    dockingBadgeItem = new DockingBadgeItem(title, customColors, dockingBadgeItem, dockingBadgeEdgeTypeB, null, 16, null);
                }
            }
            if (dockingBadgeItem != null) {
                arrayList.add(dockingBadgeItem);
            }
        }
        return arrayList;
    }
}
