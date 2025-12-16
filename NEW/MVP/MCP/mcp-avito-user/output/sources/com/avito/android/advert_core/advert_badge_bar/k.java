package com.avito.android.advert_core.advert_badge_bar;

import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.advert_docking_badge_bar.AdvertDockingBadgeBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDockingBadgeBarConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/advert_badge_bar/k;", "Lcom/avito/android/advert_core/advert_badge_bar/j;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* compiled from: AdvertDockingBadgeBarConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82730a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f82731b;

        static {
            int[] iArr = new int[AdvertDockingBadgeBar.Badge.Type.values().length];
            try {
                iArr[AdvertDockingBadgeBar.Badge.Type.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertDockingBadgeBar.Badge.Type.VIOLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertDockingBadgeBar.Badge.Type.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertDockingBadgeBar.Badge.Type.GRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertDockingBadgeBar.Badge.Type.RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertDockingBadgeBar.Badge.Type.BLACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdvertDockingBadgeBar.Badge.Type.SPECIAL_BLACK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f82730a = iArr;
            int[] iArr2 = new int[AdvertDockingBadgeBar.Badge.Edge.values().length];
            try {
                iArr2[AdvertDockingBadgeBar.Badge.Edge.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AdvertDockingBadgeBar.Badge.Edge.FLAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AdvertDockingBadgeBar.Badge.Edge.PIPKA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AdvertDockingBadgeBar.Badge.Edge.PYRAMID.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AdvertDockingBadgeBar.Badge.Edge.ANTI_PYRAMID.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            f82731b = iArr2;
        }
    }

    @Inject
    public k() {
    }

    public static DockingBadgeEdgeType b(AdvertDockingBadgeBar.Badge.Edge edge) {
        int i12 = a.f82731b[edge.ordinal()];
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
    /* JADX WARN: Type inference failed for: r2v11, types: [com.avito.android.lib.design.docking_badge.DockingBadgeItem] */
    @Override // com.avito.android.advert_core.advert_badge_bar.j
    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        DockingBadgeType custom;
        AdvertDockingBadgeBar.Badge.Edge endEdge;
        DockingBadgeEdgeType dockingBadgeEdgeTypeB;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdvertDockingBadgeBar.Badge badge = (AdvertDockingBadgeBar.Badge) it.next();
            AdvertDockingBadgeBar.Badge.Type type = badge.getType();
            if (type != null) {
                switch (a.f82730a[type.ordinal()]) {
                    case 1:
                        custom = DockingBadgeType.Predefined.Green;
                        break;
                    case 2:
                        custom = DockingBadgeType.Predefined.Violet;
                        break;
                    case 3:
                        custom = DockingBadgeType.Predefined.Blue;
                        break;
                    case 4:
                        custom = DockingBadgeType.Predefined.Gray;
                        break;
                    case 5:
                        custom = DockingBadgeType.Predefined.Red;
                        break;
                    case 6:
                        custom = DockingBadgeType.Predefined.Black;
                        break;
                    case 7:
                        custom = new DockingBadgeType.Custom(R.style.Re23_DockingBadge_SpecialBlackMedium);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                DockingBadgeType dockingBadgeType = custom;
                if (dockingBadgeType != null && (endEdge = badge.getEndEdge()) != null && (dockingBadgeEdgeTypeB = b(endEdge)) != null) {
                    String title = badge.getTitle();
                    AdvertDockingBadgeBar.Badge.Edge startEdge = badge.getStartEdge();
                    dockingBadgeItem = new DockingBadgeItem(title, dockingBadgeType, startEdge != null ? b(startEdge) : null, dockingBadgeEdgeTypeB, null, 16, null);
                }
            }
            if (dockingBadgeItem != null) {
                arrayList.add(dockingBadgeItem);
            }
        }
        return arrayList;
    }
}
