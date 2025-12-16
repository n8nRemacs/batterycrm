package com.avito.android.beduin.common.component.item_preview;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinItemOrderPreview.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/beduin/common/component/item_preview/a;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/remote/model/Image;", "image", "Lkotlin/G0;", "setImage", "(Lcom/avito/android/remote/model/Image;)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setTitleStyle", "(Ljava/lang/String;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f101638b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f101639c;

    public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.item_order_preview, (ViewGroup) this, true);
        this.f101638b = (SimpleDraweeView) findViewById(R.id.item_image);
        this.f101639c = (TextView) findViewById(R.id.item_title);
        D6.f(this, 0, y6.b(4), 0, y6.b(8), 5);
    }

    public final void setImage(@l Image image) {
        SimpleDraweeView simpleDraweeView = this.f101638b;
        Uri uriD = image != null ? C35829k2.c(image, simpleDraweeView, 2, 22).d() : null;
        if (uriD == null) {
            C35949t5.a(simpleDraweeView).b();
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    public final void setTitle(@l CharSequence text) {
        I5.a(this.f101639c, text, false);
    }

    public final void setTitleStyle(@l String style) {
        this.f101639c.setTextAppearance(f.r(getContext(), style));
    }

    public final void setTitle(@l AttributedText attributedText) {
        j.a(this.f101639c, attributedText, null);
    }
}
