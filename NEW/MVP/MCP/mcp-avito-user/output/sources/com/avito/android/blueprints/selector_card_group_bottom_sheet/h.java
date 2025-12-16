package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: SelectorCardGroupBottomSheetContentBinder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/h;", "Lcom/avito/android/lib/design/selector_card/f;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<j> f106693a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public TextView f106694b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public TextView f106695c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public SimpleDraweeView f106696d;

    public h(@Y61.k Y41.a<j> aVar) {
        this.f106693a = aVar;
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f106694b = (TextView) view.findViewById(R.id.selector_card_title);
        this.f106695c = (TextView) view.findViewById(R.id.selector_card_subtitle);
        this.f106696d = (SimpleDraweeView) view.findViewById(R.id.selector_card_image);
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k r rVar) {
        j jVar = (j) rVar;
        TextView textView = this.f106694b;
        if (textView != null) {
            I5.a(textView, jVar.f106698b, false);
        }
        TextView textView2 = this.f106695c;
        if (textView2 != null) {
            I5.a(textView2, jVar.f106700d, false);
        }
        SimpleDraweeView simpleDraweeView = this.f106696d;
        if (simpleDraweeView != null) {
            UniversalImage universalImage = rVar.equals(((a) this.f106693a).f106678l.f106685I) ? jVar.f106701e : jVar.f106702f;
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null), null, null, null, 14);
        }
    }
}
