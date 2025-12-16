package ru.avito.component.snippet_badge_bar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import java.util.ArrayList;
import java.util.List;
import kG0.C42580a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;
import ru.avito.component.snippet_badge_bar.a;
import sK0.C48065c;

/* compiled from: SnippetBadgeBar.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/avito/component/snippet_badge_bar/SnippetBadgeBar;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/lib/deprecated_design/badge_bar/CompactFlexibleLayout;", "d", "Lkotlin/C;", "getFlexibleLayout", "()Lcom/avito/android/lib/deprecated_design/badge_bar/CompactFlexibleLayout;", "flexibleLayout", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeContainer;", "e", "getDockingBadgeContainer", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeContainer;", "dockingBadgeContainer", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
@InterfaceC47204b
/* loaded from: classes9.dex */
public final class SnippetBadgeBar extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f430550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430551c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C flexibleLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C dockingBadgeContainer;

    /* compiled from: SnippetBadgeBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f430554a;

        static {
            int[] iArr = new int[DockingBadgeSize.values().length];
            try {
                iArr[DockingBadgeSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DockingBadgeSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f430554a = iArr;
        }
    }

    @j
    public SnippetBadgeBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final DockingBadgeContainer getDockingBadgeContainer() {
        return (DockingBadgeContainer) this.dockingBadgeContainer.getValue();
    }

    private final CompactFlexibleLayout getFlexibleLayout() {
        return (CompactFlexibleLayout) this.flexibleLayout.getValue();
    }

    public final void a(@l d dVar) {
        if (dVar != null) {
            ArrayList arrayList = dVar.f430566b;
            if (!arrayList.isEmpty()) {
                int i12 = this.f430551c;
                if (dVar.f430565a == 2) {
                    D6.w(getFlexibleLayout());
                    DockingBadgeContainer dockingBadgeContainer = getDockingBadgeContainer();
                    List<ru.avito.component.snippet_badge_bar.a> listE0 = C42745f0.E0(arrayList, i12);
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listE0, 10));
                    for (ru.avito.component.snippet_badge_bar.a aVar : listE0) {
                        Context context = getDockingBadgeContainer().getContext();
                        DockingBadgeSize dockingBadgeSize = aVar.f430556b.f430562f;
                        int i13 = dockingBadgeSize == null ? -1 : a.f430554a[dockingBadgeSize.ordinal()];
                        String str = "greenSmall";
                        if (i13 != -1 && i13 != 1) {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "greenMedium";
                        }
                        int iF2 = f.f(context, str);
                        a.C12401a c12401a = aVar.f430556b;
                        DockingBadgeType.CustomColors customColors = new DockingBadgeType.CustomColors(iF2, Integer.valueOf(C48065c.d(context, c12401a.f430557a, R.attr.constantWhite)), Integer.valueOf(C48065c.d(context, c12401a.f430558b, R.attr.constantBlack)), null, null, 24, null);
                        DockingBadgeEdgeType dockingBadgeEdgeType = c12401a.f430561e;
                        if (dockingBadgeEdgeType == null) {
                            dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
                        }
                        arrayList2.add(new DockingBadgeItem(aVar.f430555a, customColors, c12401a.f430560d, dockingBadgeEdgeType, null, 16, null));
                    }
                    dockingBadgeContainer.setBadgeItems(arrayList2);
                    D6.H(getDockingBadgeContainer());
                } else {
                    D6.w(getDockingBadgeContainer());
                    CompactFlexibleLayout flexibleLayout = getFlexibleLayout();
                    List<ru.avito.component.snippet_badge_bar.a> listE02 = C42745f0.E0(arrayList, i12);
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listE02, 10));
                    for (ru.avito.component.snippet_badge_bar.a aVar2 : listE02) {
                        String str2 = aVar2.f430555a;
                        Context context2 = getContext();
                        a.C12401a c12401a2 = aVar2.f430556b;
                        int iD2 = C48065c.d(context2, c12401a2.f430558b, R.attr.constantBlack);
                        int iD3 = C48065c.d(getContext(), c12401a2.f430557a, R.attr.constantWhite);
                        UniversalImage universalImage = c12401a2.f430559c;
                        arrayList3.add(new JU.c(str2, iD2, iD3, universalImage != null ? com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(getContext()))) : null));
                    }
                    new JU.a(flexibleLayout, 0).c(flexibleLayout, arrayList3);
                    D6.H(getFlexibleLayout());
                }
                D6.H(this);
                return;
            }
        }
        D6.w(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SnippetBadgeBar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.f430551c = Integer.MAX_VALUE;
        this.flexibleLayout = C42727D.c(new c(this));
        this.dockingBadgeContainer = C42727D.c(new b(this));
        View.inflate(context, R.layout.snippet_badge_bar_view, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42580a.o.f406220j, i12, i13);
        int integer = typedArrayObtainStyledAttributes.getInteger(1, this.f430550b);
        this.f430550b = integer;
        this.f430551c = typedArrayObtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        getFlexibleLayout().setMaxLines(integer);
    }
}
