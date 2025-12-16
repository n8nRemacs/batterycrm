package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: MallShortcutsWidgetSpanSizeLookup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/k;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f272996e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public Object f272997f = C42784z0.f406748b;

    /* compiled from: MallShortcutsWidgetSpanSizeLookup.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MallShortcutItem.Layout.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MallShortcutItem.Layout layout = MallShortcutItem.Layout.f273006b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public k(boolean z12) {
        this.f272996e = z12;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        MallShortcutItem mallShortcutItem;
        int iOrdinal;
        if (this.f272996e || (mallShortcutItem = (MallShortcutItem) C42745f0.K(i12, this.f272997f)) == null || (iOrdinal = mallShortcutItem.f273003f.ordinal()) == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
