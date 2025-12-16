package com.avito.android.shortcut_navigation_bar.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutNavigationItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/avito/android/shortcut_navigation_bar/adapter/ClarifyButtonItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/InlineFilterNavigationItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItemImpl;", "Lcom/avito/android/shortcut_navigation_bar/adapter/SkeletonItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/TagShortcutItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ShortcutNavigationItem implements a, Parcelable {
    public /* synthetic */ ShortcutNavigationItem(C42822w c42822w) {
        this();
    }

    @l
    /* renamed from: getDeepLink */
    public abstract DeepLink getF283231f();

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF281447b().hashCode();
    }

    @k
    /* renamed from: getText */
    public abstract String getF283230e();

    public ShortcutNavigationItem() {
    }
}
