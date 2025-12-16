package com.avito.android.gig_apply.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_apply.models.PaymentState;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/gig_apply/ui/E;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/gig_apply/models/PaymentState$IconType;", "iconType", "Lkotlin/G0;", "setIconByIconType", "(Lcom/avito/android/gig_apply/models/PaymentState$IconType;)V", "", "resId", "setDescriptionColor", "(I)V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class E extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f159817h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f159818b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f159819c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f159820d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f159821e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f159822f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f159823g;

    /* compiled from: PaymentView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159824a;

        static {
            int[] iArr = new int[PaymentState.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentState.Status status = PaymentState.Status.f159709b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f159824a = iArr;
            int[] iArr2 = new int[PaymentState.IconType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PaymentState.IconType iconType = PaymentState.IconType.f159705b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public E(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gig_slot_payment_view, (ViewGroup) this, true);
        this.f159818b = (ImageView) viewInflate.findViewById(R.id.button_icon);
        this.f159819c = (Button) viewInflate.findViewById(R.id.button);
        this.f159820d = (TextView) viewInflate.findViewById(R.id.title);
        this.f159821e = (TextView) viewInflate.findViewById(R.id.subtitle);
        this.f159822f = (TextView) viewInflate.findViewById(R.id.trailing_text);
        this.f159823g = (ImageView) viewInflate.findViewById(R.id.click_marker);
    }

    private final void setDescriptionColor(int resId) {
        this.f159821e.setTextColor(this.f159818b.getContext().getColor(resId));
    }

    private final void setIconByIconType(PaymentState.IconType iconType) {
        Drawable drawableH;
        Button button = this.f159819c;
        button.setVisibility(0);
        Context context = button.getContext();
        int iOrdinal = iconType.ordinal();
        if (iOrdinal == 0) {
            drawableH = C35835l0.h(R.attr.ic_sbp24, context);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            drawableH = C35835l0.h(R.attr.ic_card24, context);
        }
        button.setState(new UU.a(null, null, false, false, false, null, drawableH, null, null, false, 447, null));
    }

    public final void a(@Y61.k PaymentState paymentState, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        UU.a aVar = new UU.a(null, null, false, false, false, null, null, null, null, false, 1023, null);
        Button button = this.f159819c;
        button.setState(aVar);
        ImageView imageView = this.f159818b;
        imageView.setImageDrawable(null);
        String str = paymentState.f159702f;
        if (str != null) {
            imageView.setVisibility(0);
            ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(imageView));
            aVar2.f(Uri.parse(str));
            aVar2.c();
        } else {
            PaymentState.IconType iconType = paymentState.f159701e;
            if (iconType != null) {
                setIconByIconType(iconType);
            } else {
                button.setVisibility(8);
            }
        }
        PaymentState.Status status = paymentState.f159704h;
        int i12 = status == null ? -1 : a.f159824a[status.ordinal()];
        if (i12 == 1 || i12 != 2) {
            setDescriptionColor(R.color.common_gray_54);
        } else {
            setDescriptionColor(R.color.common_red_600);
        }
        this.f159820d.setText(paymentState.f159697a);
        AttributedText attributedText = paymentState.f159698b;
        TextView textView = this.f159821e;
        if (attributedText != null) {
            com.avito.android.util.text.j.c(textView, attributedText, null);
        } else {
            I5.a(textView, paymentState.f159699c, false);
        }
        TextView textView2 = this.f159822f;
        String str2 = paymentState.f159703g;
        I5.a(textView2, str2, false);
        DeepLink deepLink = paymentState.f159700d;
        this.f159823g.setVisibility((str2 != null || deepLink == null) ? 8 : 0);
        if (deepLink != null) {
            setOnClickListener(new com.avito.android.extended_profile_ui_components.c(18, lVar, paymentState));
        } else {
            setOnClickListener(null);
        }
    }
}
