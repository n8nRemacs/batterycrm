package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.theme.k;
import kotlin.Metadata;

/* compiled from: ExtendedProfileNativeWidgetComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/nativewidget/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/nativewidget/d;", "Landroid/view/ViewGroup;", "<init>", "()V", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC36333c<d, ViewGroup> {
    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final /* bridge */ /* synthetic */ void l(View view, k kVar, d dVar) {
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new FrameLayout(viewGroup.getContext());
    }
}
