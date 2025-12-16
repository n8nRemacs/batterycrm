package com.avito.android.profile_phones.phones_list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhoneItem.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/PhoneItem;", "Lcom/avito/android/lib/design/list_item/ListItem;", "", "isVisible", "Lkotlin/G0;", "setProtected", "(Z)V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneItem extends ListItem {

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ImageView f227379u;

    @X41.j
    public PhoneItem(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setProtected(boolean isVisible) {
        D6.G(this.f227379u, isVisible);
    }

    public PhoneItem(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f227379u = (ImageView) findViewById(R.id.protected_badge);
    }
}
