package jr0;

import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.remote.model.badge_bar.SerpBadgeStyle;
import com.avito.android.remote.model.badge_bar.SerpBadgeType;
import kotlin.Metadata;

/* compiled from: SerpBadgeBars.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: jr0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42418a {

    /* compiled from: SerpBadgeBars.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jr0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11585a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f405836a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f405837b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f405838c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f405839d;

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
            f405836a = iArr;
            int[] iArr2 = new int[SerpBadgeStyle.DockingSize.values().length];
            try {
                iArr2[SerpBadgeStyle.DockingSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SerpBadgeStyle.DockingSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f405837b = iArr2;
            int[] iArr3 = new int[SerpBadgeType.values().length];
            try {
                iArr3[SerpBadgeType.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SerpBadgeType.VIOLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SerpBadgeType.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SerpBadgeType.GRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SerpBadgeType.RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[SerpBadgeType.BLACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f405838c = iArr3;
            int[] iArr4 = new int[DockingBadgeSize.values().length];
            try {
                iArr4[DockingBadgeSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DockingBadgeSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f405839d = iArr4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    @hw.InterfaceC41178c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.lib.design.docking_badge.DockingBadgeItem a(@Y61.k com.avito.android.remote.model.badge_bar.SerpBadge r15, @Y61.k android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr0.C42418a.a(com.avito.android.remote.model.badge_bar.SerpBadge, android.content.Context):com.avito.android.lib.design.docking_badge.DockingBadgeItem");
    }

    public static final DockingBadgeEdgeType b(SerpBadgeStyle.DockingStyle dockingStyle) {
        int i12 = C11585a.f405836a[dockingStyle.ordinal()];
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? DockingBadgeEdgeType.Square : DockingBadgeEdgeType.AntiPyramid : DockingBadgeEdgeType.Pyramid : DockingBadgeEdgeType.Pipka : DockingBadgeEdgeType.Flag;
    }
}
