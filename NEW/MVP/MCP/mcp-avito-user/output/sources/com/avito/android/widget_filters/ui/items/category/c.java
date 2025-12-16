package com.avito.android.widget_filters.ui.items.category;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: WidgetFiltersCategorySelectorCardContentBinder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/category/c;", "Lcom/avito/android/lib/design/selector_card/f;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public TextView f330331a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public SimpleDraweeView f330332b;

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f330331a = (TextView) view.findViewById(R.id.category_selector_title);
        this.f330332b = (SimpleDraweeView) view.findViewById(R.id.category_selector_image);
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k r rVar) {
        NP0.c cVar = (NP0.c) rVar;
        TextView textView = this.f330331a;
        if (textView != null) {
            I5.a(textView, cVar.f11428c, false);
        }
        SimpleDraweeView simpleDraweeView = this.f330332b;
        if (simpleDraweeView != null) {
            UniversalImage universalImage = cVar.f11431f ? cVar.f11429d : cVar.f11430e;
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null), null, null, null, 14);
        }
    }
}
