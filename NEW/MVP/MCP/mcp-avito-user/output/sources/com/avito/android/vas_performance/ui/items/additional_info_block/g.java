package com.avito.android.vas_performance.ui.items.additional_info_block;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: AdditionalInfoBlockItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/additional_info_block/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_performance/ui/items/additional_info_block/f;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f321546b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f321547c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321548d;

    public g(@k View view) {
        super(view);
        this.f321546b = view;
        this.f321547c = (TextView) view.findViewById(R.id.additional_info_block_description);
        this.f321548d = (SimpleDraweeView) view.findViewById(R.id.additional_info_block_image);
    }

    @Override // com.avito.android.vas_performance.ui.items.additional_info_block.f
    public final void h8(@k UniversalImage universalImage, @k AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f321547c;
        textView.setMovementMethod(linkMovementMethod);
        j.c(textView, attributedText, null);
        Image imageG = l.g(this.f321546b, universalImage);
        com.avito.android.image_loader.a aVarB = imageG != null ? com.avito.android.image_loader.b.b(imageG) : null;
        SimpleDraweeView simpleDraweeView = this.f321548d;
        if (aVarB == null) {
            D6.w(simpleDraweeView);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVarB);
        aVarA.c();
    }
}
