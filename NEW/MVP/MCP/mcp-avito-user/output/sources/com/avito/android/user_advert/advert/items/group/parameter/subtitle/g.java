package com.avito.android.user_advert.advert.items.group.parameter.subtitle;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

/* compiled from: GroupParameterSubtitleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/group/parameter/subtitle/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/group/parameter/subtitle/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f309469b;

    public g(@k View view) {
        super(view);
        this.f309469b = (TextView) view;
    }

    @Override // com.avito.android.user_advert.advert.items.group.parameter.subtitle.f
    public final void ap(@k String str) {
        this.f309469b.setText(str);
    }
}
