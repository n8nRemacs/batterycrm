package com.avito.android.lib.design.tab_bar;

import Y61.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.y6;
import j.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TabBarItemWithTitleView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015R$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u000b\u0010\f*\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012*\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/d;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/lib/design/tab_bar/a;", "Lcom/avito/android/lib/design/tab_bar/b;", "value", "getTabBarItem", "()Lcom/avito/android/lib/design/tab_bar/b;", "setTabBarItem", "(Lcom/avito/android/lib/design/tab_bar/b;)V", "tabBarItem", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "getIcon$delegate", "(Lcom/avito/android/lib/design/tab_bar/d;)Ljava/lang/Object;", "icon", "Lcom/avito/android/lib/design/badge/Badge;", "getNotification", "()Lcom/avito/android/lib/design/badge/Badge;", "getNotification$delegate", NotificationsSettings.Section.SECTION_PAID_SERVICES, "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends LinearLayout implements com.avito.android.lib.design.tab_bar.a {

    /* renamed from: d, reason: collision with root package name */
    @r
    public static final float f180708d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f180709b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f180710c;

    /* compiled from: TabBarItemWithTitleView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/d$a;", "", "<init>", "()V", "", "FIGMA_TEXT_COMPENSATION", "F", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f180708d = 0.5f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.tabBarItemIconWithMediumBadgeWithTitle : i12;
        super(context, attributeSet);
        c cVar = new c(context, null, 0, 6, null);
        cVar.setDuplicateParentStateEnabled(true);
        this.f180709b = cVar;
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setId(R.id.tab_bar_item_title);
        aVar.setDuplicateParentStateEnabled(true);
        aVar.setMaxLines(1);
        this.f180710c = aVar;
        setOrientation(1);
        setGravity(1);
        setClipChildren(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178928J0, i12, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        addView(cVar, -2, -2);
        aVar.setTextAppearance(resourceId);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, -y6.a(4 + f180708d), 0, 0);
        G0 g02 = G0.f406611a;
        addView(aVar, layoutParams);
    }

    @Override // com.avito.android.lib.design.tab_bar.a
    @k
    public AppCompatImageView getIcon() {
        return this.f180709b.getIcon();
    }

    @Override // com.avito.android.lib.design.tab_bar.a
    @k
    public Badge getNotification() {
        return this.f180709b.getNotification();
    }

    @Override // com.avito.android.lib.design.tab_bar.a
    @k
    public b getTabBarItem() {
        return this.f180709b.getTabBarItem();
    }

    @Override // com.avito.android.lib.design.tab_bar.a
    public void setTabBarItem(@k b bVar) {
        this.f180709b.setTabBarItem(bVar);
        com.avito.android.lib.design.text_view.a aVar = this.f180710c;
        PrintableText printableText = bVar.f180694b;
        aVar.setText(printableText != null ? printableText.k0(getContext()) : null);
    }
}
