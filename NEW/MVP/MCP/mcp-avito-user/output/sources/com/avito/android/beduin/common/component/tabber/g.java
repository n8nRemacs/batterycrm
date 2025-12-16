package com.avito.android.beduin.common.component.tabber;

import Y61.l;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.shared.tabs.BeduinTabStyle;
import kotlin.Metadata;

/* compiled from: BeduinTabberLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/g;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/beduin/common/shared/tabs/d;", "getResolvedTabs", "()Lcom/avito/android/beduin/common/shared/tabs/d;", "resolvedTabs", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public BeduinTabStyle f102767b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.beduin.common.shared.tabs.c f102768c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.beduin.common.shared.tabs.a f102769d;

    /* compiled from: BeduinTabberLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102770a;

        static {
            int[] iArr = new int[BeduinTabStyle.values().length];
            try {
                iArr[BeduinTabStyle.TABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinTabStyle.AVITO_NON_TRANSPARENT_TABS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102770a = iArr;
        }
    }

    @l
    public final com.avito.android.beduin.common.shared.tabs.d getResolvedTabs() {
        BeduinTabStyle beduinTabStyle = this.f102767b;
        return (beduinTabStyle == BeduinTabStyle.TABS || beduinTabStyle == BeduinTabStyle.AVITO_NON_TRANSPARENT_TABS) ? this.f102768c : this.f102769d;
    }
}
