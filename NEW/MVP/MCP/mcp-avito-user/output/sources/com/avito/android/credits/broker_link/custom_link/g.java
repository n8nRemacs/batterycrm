package com.avito.android.credits.broker_link.custom_link;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.Icon;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: CreditBrokerCustomLinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/broker_link/custom_link/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/credits/broker_link/custom_link/f;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f128590g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f128591b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f128592c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f128593d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f128594e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f128595f;

    /* compiled from: CreditBrokerCustomLinkView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128596a;

        static {
            int[] iArr = new int[EntryPoint.Part.HighlightType.values().length];
            try {
                iArr[EntryPoint.Part.HighlightType.BORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryPoint.Part.HighlightType.FILLED_BORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryPoint.Part.HighlightType.FLAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128596a = iArr;
        }
    }

    public g(@k View view) {
        super(view);
        this.f128591b = view;
        View viewFindViewById = view.findViewById(R.id.left_part);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128592c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.right_part);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128593d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.bottom_part);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128594e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f128595f = (SimpleDraweeView) viewFindViewById4;
    }

    public static void B80(TextView textView, EntryPoint.Part part, Integer num) {
        j.a(textView, part.getAttributedText(), null);
        EntryPoint.Part.HighlightType highlightType = part.getHighlightType();
        int i12 = highlightType == null ? -1 : a.f128596a[highlightType.ordinal()];
        if (i12 == 1) {
            textView.setPadding(y6.b(8), y6.b(3), y6.b(8), y6.b(3));
            Drawable drawable = androidx.core.content.d.getDrawable(textView.getContext(), R.drawable.bg_credit_broker_custom_link_border);
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            if (drawableMutate instanceof GradientDrawable) {
                ((GradientDrawable) drawableMutate).setStroke(y6.b(1), C48065c.a(textView.getContext(), part.getHighlightColor(), R.attr.gray68));
                textView.setBackground(drawableMutate);
            } else {
                textView.setBackgroundResource(R.drawable.bg_credit_broker_custom_link_border);
            }
        } else if (i12 == 2) {
            textView.setPadding(y6.b(4), y6.b(0), y6.b(8), y6.b(0));
            textView.setBackgroundResource(R.drawable.bg_credit_broker_custom_link_border_filled);
            textView.setBackgroundTintList(C48065c.a(textView.getContext(), part.getHighlightColor(), R.attr.gray92));
        } else if (i12 == 3) {
            D6.f(textView, y6.b(4), 0, y6.b(4), 0, 10);
            textView.setBackgroundResource(R.drawable.bg_black_flag);
            textView.setBackgroundTintList(C48065c.a(textView.getContext(), part.getHighlightColor(), R.attr.black));
        }
        if (num != null) {
            D6.c(textView, Integer.valueOf(y6.b(num.intValue())), null, null, null, 14);
        }
        Icon leftIcon = part.getLeftIcon();
        Drawable drawableA = leftIcon != null ? com.avito.android.credits.utils.d.a(leftIcon, textView.getContext()) : null;
        Icon rightIcon = part.getRightIcon();
        I5.d(textView, drawableA, rightIcon != null ? com.avito.android.credits.utils.d.a(rightIcon, textView.getContext()) : null, 10);
        Integer spacing = part.getSpacing();
        if (spacing != null) {
            textView.setCompoundDrawablePadding(y6.b(spacing.intValue()));
        }
    }

    @Override // com.avito.android.credits.broker_link.custom_link.f
    public final void Gj(@l EntryPoint.Part part, @l EntryPoint.Part part2, @l EntryPoint.Part part3, @l Integer num) {
        if (part != null) {
            B80(this.f128592c, part, null);
        }
        if (part2 != null) {
            B80(this.f128593d, part2, num);
        }
        if (part3 != null) {
            B80(this.f128594e, part3, null);
        }
    }

    @Override // com.avito.android.credits.broker_link.custom_link.f
    public final void P8(@l Integer num, @l Integer num2) {
        D6.c(this.f128591b, null, num != null ? Integer.valueOf(y6.b(num.intValue())) : null, null, num2 != null ? Integer.valueOf(y6.b(num2.intValue())) : null, 5);
    }

    @Override // com.avito.android.credits.broker_link.custom_link.f
    public final void R5(@l UniversalImage universalImage) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f128591b, universalImage) : null;
        if (imageG != null) {
            SimpleDraweeView simpleDraweeView = this.f128595f;
            Uri uriD = C35829k2.c(imageG, simpleDraweeView, 2, 22).d();
            if (uriD != null) {
                simpleDraweeView.setVisibility(0);
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.f(uriD);
                aVarA.c();
            }
        }
    }

    @Override // com.avito.android.credits.broker_link.custom_link.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f128591b.setOnClickListener(new com.avito.android.component.user_hat.items.k(7, aVar));
    }
}
