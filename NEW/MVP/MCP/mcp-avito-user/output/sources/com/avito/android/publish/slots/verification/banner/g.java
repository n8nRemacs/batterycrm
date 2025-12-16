package com.avito.android.publish.slots.verification.banner;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/verification/banner/g;", "Lcom/avito/android/publish/slots/verification/banner/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RelativeLayout f245158b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f245159c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f245160d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f245161e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f245162f;

    public g(@k View view) {
        super(view);
        RelativeLayout relativeLayout = (RelativeLayout) view;
        this.f245158b = relativeLayout;
        View viewFindViewById = relativeLayout.findViewById(R.id.verification_banner_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f245159c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = relativeLayout.findViewById(R.id.verification_banner_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f245160d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = relativeLayout.findViewById(R.id.verification_banner_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245161e = (TextView) viewFindViewById3;
        View viewFindViewById4 = relativeLayout.findViewById(R.id.verification_banner_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245162f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.publish.slots.verification.banner.f
    public final void fb(@k String str) {
        boolean zEquals = str.equals("verified");
        ImageView imageView = this.f245160d;
        RelativeLayout relativeLayout = this.f245158b;
        if (zEquals) {
            relativeLayout.setBackgroundResource(R.drawable.bg_verification_verified);
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_checkRound20, relativeLayout.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.green600, relativeLayout.getContext()));
        } else {
            relativeLayout.setBackgroundResource(R.drawable.bg_verification_in_process);
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_time20, relativeLayout.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.blue700, relativeLayout.getContext()));
        }
    }

    @Override // com.avito.android.publish.slots.verification.banner.f
    public final void i(@k UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f245158b.getContext()));
        SimpleDraweeView simpleDraweeView = this.f245159c;
        simpleDraweeView.setImageURI(C35829k2.c(imageDependsOnThemeOrDefault, simpleDraweeView, 0, 30).d());
    }

    @Override // com.avito.android.publish.slots.verification.banner.f
    public final void n(@l String str) {
        I5.a(this.f245162f, str, false);
    }

    @Override // com.avito.android.publish.slots.verification.banner.f
    public final void setTitle(@k String str) {
        this.f245161e.setText(str);
    }
}
