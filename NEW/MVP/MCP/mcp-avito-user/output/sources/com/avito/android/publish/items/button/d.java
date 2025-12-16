package com.avito.android.publish.items.button;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: DeepLinkActionButtonItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/button/d;", "Lcom/avito/android/publish/items/button/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f236790b;

    public d(@k View view) {
        super(view);
        this.f236790b = (Button) view;
    }

    @Override // com.avito.android.publish.items.button.c
    public final void qV(@k String str, @l String str2, @k com.avito.android.profile.pro.impl.screen.item.recommendations.h hVar) {
        Button button = this.f236790b;
        button.setText(str);
        if (str2 == null) {
            str2 = "primary";
        }
        button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(str2));
        button.setOnClickListener(hVar);
    }
}
