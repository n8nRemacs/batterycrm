package ru.avito.component.toolbar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: AppBarLayoutWithIconAction.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/avito/component/toolbar/AppBarLayoutWithIconAction;", "Lru/avito/component/toolbar/CollapsingTitleAppBarLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppBarLayoutWithIconAction extends CollapsingTitleAppBarLayout {
    public AppBarLayoutWithIconAction(@k Context context, @l AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        View imageView = new ImageView(getContext());
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.legacy_toolbar_home_icon_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setBackground(androidx.core.content.d.getDrawable(getContext(), R.drawable.bg_publish_toolbar_arrow));
        setActionView(imageView);
    }
}
