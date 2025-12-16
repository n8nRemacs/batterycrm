package com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VinCroppedImageView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/vin_cropped_image/item/vin_cropped_image/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/vin_cropped_image/item/vin_cropped_image/n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final Context f245192b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f245193c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f245194d;

    public o(@Y61.k View view) {
        super(view);
        this.f245192b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.cropped_vin_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f245193c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245194d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.n
    public final void BQ(@Y61.l CharSequence charSequence) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f245194d;
        textView.setMovementMethod(linkMovementMethod);
        I5.a(textView, charSequence, false);
    }

    @Override // com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.n
    public final void KW(@Y61.k Bitmap bitmap) {
        SimpleDraweeView simpleDraweeView = this.f245193c;
        D6.H(simpleDraweeView);
        simpleDraweeView.getHierarchy().q(new BitmapDrawable(this.f245192b.getResources(), bitmap), (s.a) s.c.f340133e);
    }

    @Override // com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.n
    public final void p0() {
        D6.w(this.f245193c);
    }
}
