package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import android.content.Context;
import android.content.Intent;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import i.AbstractC41201a;
import kB.InterfaceC42561a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalWidgetImageRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/n;", "Li/a;", "Lcom/avito/android/extended_profile_image_edit/ExtendedProfileImageEditConfig;", "Lkotlin/G0;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n extends AbstractC41201a<ExtendedProfileImageEditConfig, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f154111b;

    public n(p pVar) {
        this.f154111b = pVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
        return this.f154111b.f154115c.a(extendedProfileImageEditConfig);
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        String stringExtra;
        if (i12 == -1 && intent != null && (stringExtra = intent.getStringExtra("image_id")) != null) {
            this.f154111b.f154117e.invoke(new InterfaceC42561a.d(stringExtra));
        }
        return G0.f406611a;
    }
}
