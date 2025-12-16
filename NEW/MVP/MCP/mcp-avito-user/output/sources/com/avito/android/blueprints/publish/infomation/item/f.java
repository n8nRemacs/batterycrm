package com.avito.android.blueprints.publish.infomation.item;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.category_parameters.slot.information.TextStyle;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/infomation/item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/infomation/item/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f106331b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106332c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f106333d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SimpleDraweeView f106334e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TextView f106335f;

    /* renamed from: g, reason: collision with root package name */
    public final int f106336g;

    /* compiled from: DisclaimerViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106337a;

        static {
            int[] iArr = new int[TextStyle.values().length];
            try {
                iArr[TextStyle.BODY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStyle.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f106337a = iArr;
        }
    }

    public f(@k View view, @k com.avito.android.util.text.a aVar, @k TextView textView, @l SimpleDraweeView simpleDraweeView, @l TextView textView2) {
        super(view);
        this.f106331b = view;
        this.f106332c = aVar;
        this.f106333d = textView;
        this.f106334e = simpleDraweeView;
        this.f106335f = textView2;
        this.f106336g = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // com.avito.android.blueprints.publish.infomation.item.e
    public final void RN(@l Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView = this.f106333d;
            D6.c(textView, Integer.valueOf(D6.j(textView, iIntValue)), null, null, null, 14);
            TextView textView2 = this.f106335f;
            if (textView2 != null) {
                D6.c(textView2, Integer.valueOf(D6.j(textView, iIntValue)), null, null, null, 14);
            }
        }
    }

    @Override // com.avito.android.blueprints.publish.infomation.item.e
    public final void b30(@k UniversalImage universalImage) {
        SimpleDraweeView simpleDraweeView = this.f106334e;
        if (simpleDraweeView == null) {
            return;
        }
        C35949t5.c(this.f106334e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext()))), null, null, null, 14);
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.blueprints.publish.infomation.item.e
    public final void k(@l AttributedText attributedText) {
        TextView textView = this.f106335f;
        if (textView != null) {
            j.a(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.blueprints.publish.infomation.item.e
    public final void l20(@l TextStyle textStyle) {
        int i12 = textStyle == null ? -1 : a.f106337a[textStyle.ordinal()];
        TextView textView = this.f106333d;
        if (i12 != -1) {
            if (i12 == 1) {
                textView.setTextAppearance(R.style.DisclaimerStyleBody);
                return;
            } else if (i12 != 2) {
                return;
            }
        }
        textView.setTextAppearance(R.style.DisclaimerStyleDefault);
    }

    @Override // com.avito.android.blueprints.publish.infomation.item.e
    public final void p0() {
        SimpleDraweeView simpleDraweeView = this.f106334e;
        if (simpleDraweeView != null) {
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.blueprints.publish.infomation.item.e
    public final void r(@k AttributedText attributedText) {
        SimpleDraweeView simpleDraweeView = this.f106334e;
        if ((simpleDraweeView != null && !D6.y(simpleDraweeView)) || simpleDraweeView == null) {
            D6.c(this.f106333d, 0, null, null, null, 14);
        }
        CharSequence charSequenceC = this.f106332c.c(this.itemView.getContext(), attributedText);
        if (charSequenceC != null) {
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            TextView textView = this.f106333d;
            textView.setMovementMethod(linkMovementMethod);
            textView.setText(charSequenceC);
        }
    }

    @Override // com.avito.android.blueprints.publish.infomation.item.e
    public final void zt(@l Integer num) {
        D6.c(this.f106331b, null, Integer.valueOf(num != null ? D6.j(this.f106331b, num.intValue()) : this.f106336g), null, null, 13);
    }

    public /* synthetic */ f(View view, com.avito.android.util.text.a aVar, TextView textView, SimpleDraweeView simpleDraweeView, TextView textView2, int i12, C42822w c42822w) {
        this(view, aVar, textView, (i12 & 8) != 0 ? null : simpleDraweeView, (i12 & 16) != 0 ? null : textView2);
    }
}
