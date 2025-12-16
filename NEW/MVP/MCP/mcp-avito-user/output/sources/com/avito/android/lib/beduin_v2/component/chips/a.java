package com.avito.android.lib.beduin_v2.component.chips;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.C29270c0;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.chips.state.DisplayView;
import com.avito.beduin.v2.avito.component.chips.state.a;
import com.avito.beduin.v2.avito.component.chips.state.m;
import com.avito.beduin.v2.component.common.HorizontalAlignment;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/chips/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/chips/state/a;", "Lcom/avito/android/lib/design/chips/ui/Chips;", "a", "_design-modules_beduin-v2_renderer_component_chips"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.chips.state.a, Chips> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final C29270c0 f175526m;

    /* compiled from: ChipsComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/chips/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/chips/state/a;", "_design-modules_beduin-v2_renderer_component_chips"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.chips.a$a, reason: collision with other inner class name */
    public static final class C5182a extends n<com.avito.beduin.v2.avito.component.chips.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C29270c0 f175527c;

        public C5182a(@k C29270c0 c29270c0) {
            super(m.f334078c);
            this.f175527c = c29270c0;
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a(this.f175527c);
        }
    }

    /* compiled from: ChipsComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175528a;

        static {
            int[] iArr = new int[DisplayView.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DisplayView displayView = DisplayView.f334047b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DisplayView displayView2 = DisplayView.f334047b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DisplayView displayView3 = DisplayView.f334047b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[HorizontalAlignment.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                HorizontalAlignment horizontalAlignment = HorizontalAlignment.f335656b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                HorizontalAlignment horizontalAlignment2 = HorizontalAlignment.f335656b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f175528a = iArr2;
        }
    }

    public a(@k C29270c0 c29270c0) {
        super(null, 1, null);
        this.f175526m = c29270c0;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.chips.state.a aVar) {
        Chips chips = (Chips) view;
        com.avito.beduin.v2.avito.component.chips.state.a aVar2 = aVar;
        g gVar = (g) D.a(aVar2.f334053d, kVar);
        ArrayList arrayList = new ArrayList();
        com.avito.android.lib.beduin_v2.component.chips.b bVar = new com.avito.android.lib.beduin_v2.component.chips.b(kVar);
        int i12 = 0;
        for (Object obj : aVar2.f334051b.f4014b) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a.C10371a c10371a = (a.C10371a) obj;
            String str = c10371a.f334058a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            HorizontalAlignment horizontalAlignment = c10371a.f334063f;
            int i14 = horizontalAlignment == null ? -1 : b.f175528a[horizontalAlignment.ordinal()];
            ItemChipable itemChipable = new ItemChipable(i12, c10371a.f334062e, i14 != 1 ? i14 != 2 ? i14 != 3 ? ItemChipable.Alignment.f178772b : ItemChipable.Alignment.f178774d : ItemChipable.Alignment.f178773c : ItemChipable.Alignment.f178772b, c10371a.f334064g, c10371a.f334060c, null, str2, c10371a.f334059b, c10371a.f334061d, 32, null);
            itemChipable.f178771k = bVar;
            arrayList.add(itemChipable);
            i12 = i13;
        }
        chips.setStyle(gVar);
        int iOrdinal = aVar2.f334050a.ordinal();
        ChipsState.DisplayType displayType = iOrdinal != 0 ? iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal != 3) ? ChipsState.DisplayType.f178758d : ChipsState.DisplayType.f178759e : ChipsState.DisplayType.f178757c : ChipsState.DisplayType.f178756b;
        chips.setState(new ChipsState(0, displayType, aVar2.f334052c, arrayList, null, 17, null));
        D6.G(chips, aVar2.f334054e);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        Chips chips = new Chips(viewGroup.getContext(), null);
        chips.setOverScrollMode(2);
        C29270c0 c29270c0 = this.f175526m;
        c29270c0.getClass();
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[5];
        if (((Boolean) c29270c0.f113269g.a().invoke()).booleanValue()) {
            chips.setNestedScrollingEnabled(false);
        }
        return chips;
    }
}
