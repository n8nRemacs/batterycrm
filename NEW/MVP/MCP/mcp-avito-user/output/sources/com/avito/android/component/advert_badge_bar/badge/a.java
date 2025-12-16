package com.avito.android.component.advert_badge_bar.badge;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import hw.InterfaceC41177b;
import kotlin.Metadata;

/* compiled from: BadgeItemView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/a;", "LTV0/e;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a extends TV0.e {

    /* compiled from: BadgeItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.component.advert_badge_bar.badge.a$a, reason: collision with other inner class name */
    public static final class C3715a {
    }

    void da(@l UniversalColor universalColor);

    void dx(@l UniversalColor universalColor, @l UniversalColor universalColor2);

    void g7(int i12);

    void h(@k String str);

    void i(@l UniversalImage universalImage);

    void k50(int i12);

    void setOnClickListener(@l View.OnClickListener onClickListener);

    void setTitle(@k String str);

    void u40(boolean z12);

    void vN();
}
