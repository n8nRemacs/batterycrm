package com.avito.android.map.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: MapCoordinatorLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\tR#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/map/view/MapCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/avito/android/map_core/utils/IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;", "kotlin.jvm.PlatformType", "d", "Lkotlin/C;", "getPinsItems", "()Lcom/avito/android/map_core/utils/IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;", "pinsItems", "OpenedPopupType", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f185360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f185361c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f185362d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapCoordinatorLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/MapCoordinatorLayout$OpenedPopupType;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenedPopupType {

        /* renamed from: b, reason: collision with root package name */
        public static final OpenedPopupType f185363b;

        /* renamed from: c, reason: collision with root package name */
        public static final OpenedPopupType f185364c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ OpenedPopupType[] f185365d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185366e;

        static {
            OpenedPopupType openedPopupType = new OpenedPopupType("PIN_ITEMS", 0);
            f185363b = openedPopupType;
            OpenedPopupType openedPopupType2 = new OpenedPopupType("NONE", 1);
            f185364c = openedPopupType2;
            OpenedPopupType[] openedPopupTypeArr = {openedPopupType, openedPopupType2};
            f185365d = openedPopupTypeArr;
            f185366e = kotlin.enums.c.a(openedPopupTypeArr);
        }

        public OpenedPopupType() {
            throw null;
        }

        public static OpenedPopupType valueOf(String str) {
            return (OpenedPopupType) Enum.valueOf(OpenedPopupType.class, str);
        }

        public static OpenedPopupType[] values() {
            return (OpenedPopupType[]) f185365d.clone();
        }
    }

    /* compiled from: MapCoordinatorLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[OpenedPopupType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OpenedPopupType openedPopupType = OpenedPopupType.f185363b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: MapCoordinatorLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/map_core/utils/IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class b extends N implements Y41.a<IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView invoke() {
            return (IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView) MapCoordinatorLayout.this.findViewById(R.id.pin_items);
        }
    }

    @X41.j
    public MapCoordinatorLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView getPinsItems() {
        return (IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView) this.f185362d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(@Y61.l android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.onInterceptTouchEvent(r7)
            if (r7 != 0) goto L7
            return r0
        L7:
            java.lang.String r1 = r6.f185360b
            java.lang.String r2 = "collapsed"
            boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
            if (r1 != 0) goto L1f
            java.lang.String r1 = r6.f185360b
            java.lang.String r2 = "expanded"
            boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
            if (r1 == 0) goto L1c
            goto L1f
        L1c:
            com.avito.android.map.view.MapCoordinatorLayout$OpenedPopupType r1 = com.avito.android.map.view.MapCoordinatorLayout.OpenedPopupType.f185364c
            goto L21
        L1f:
            com.avito.android.map.view.MapCoordinatorLayout$OpenedPopupType r1 = com.avito.android.map.view.MapCoordinatorLayout.OpenedPopupType.f185363b
        L21:
            int r1 = r1.ordinal()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            goto L6e
        L2c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L32:
            if (r0 == 0) goto L6d
            boolean r0 = r6.f185361c
            if (r0 == 0) goto L6d
            com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView r0 = r6.getPinsItems()
            float r0 = r0.getY()
            com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView r1 = r6.getPinsItems()
            int r1 = r1.getPaddingTop()
            int r4 = r7.getAction()
            if (r4 != 0) goto L50
            r4 = r3
            goto L51
        L50:
            r4 = r2
        L51:
            float r5 = r7.getY()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L65
            float r5 = r7.getY()
            float r1 = (float) r1
            float r0 = r0 + r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L65
            r0 = r3
            goto L66
        L65:
            r0 = r2
        L66:
            if (r4 == 0) goto L6b
            if (r0 == 0) goto L6b
            goto L6d
        L6b:
            r0 = r3
            goto L6e
        L6d:
            r0 = r2
        L6e:
            int r7 = r7.getAction()
            if (r7 != 0) goto L75
            r2 = r0
        L75:
            r6.f185361c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.view.MapCoordinatorLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public MapCoordinatorLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f185362d = C42727D.b(LazyThreadSafetyMode.f406616d, new b());
    }
}
