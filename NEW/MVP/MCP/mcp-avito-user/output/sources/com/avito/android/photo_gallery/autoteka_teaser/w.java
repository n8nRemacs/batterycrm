package com.avito.android.photo_gallery.autoteka_teaser;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: AutotekaUtil.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/w;", "", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w f216902a = new w();

    @Y61.k
    public static Button a(@Y61.k Context context) {
        Button button = new Button(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23), null, 0, 0, 12, null);
        button.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        a.f216807a.getClass();
        button.setAppearanceFromAttr((button.getResources().getConfiguration().uiMode & 48) == 32 ? R.attr.buttonPrimarySmallTwoRows : R.attr.buttonOverlayPrimaryLargeTwoRows);
        return button;
    }
}
