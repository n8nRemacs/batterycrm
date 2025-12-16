package com.avito.android.vas_planning_checkout.item.disclaimer;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningDisclaimerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/disclaimer/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_planning_checkout/item/disclaimer/f;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f322962b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f322963c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f322964d;

    /* compiled from: VasPlanningDisclaimerItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TextStyle.values().length];
            try {
                TextStyle textStyle = TextStyle.f322947b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextStyle textStyle2 = TextStyle.f322947b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(View view, com.avito.android.util.text.a aVar, TextView textView, SimpleDraweeView simpleDraweeView, int i12, C42822w c42822w) {
        super(view);
        this.f322962b = view;
        this.f322963c = aVar;
        this.f322964d = textView;
    }

    @Override // com.avito.android.vas_planning_checkout.item.disclaimer.f
    public final void r(@k AttributedText attributedText) {
        CharSequence charSequenceC = this.f322963c.c(this.itemView.getContext(), attributedText);
        if (charSequenceC != null) {
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            TextView textView = this.f322964d;
            textView.setMovementMethod(linkMovementMethod);
            textView.setText(charSequenceC);
        }
    }
}
