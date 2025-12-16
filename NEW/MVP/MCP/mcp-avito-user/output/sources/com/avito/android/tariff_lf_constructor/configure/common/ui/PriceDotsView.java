package com.avito.android.tariff_lf_constructor.configure.common.ui;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import dD0.C39568a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PriceDotsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/common/ui/PriceDotsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "value", "setValue", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "oldValue", "setOldValue", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceDotsView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f299547b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f299548c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f299549d;

    @j
    public PriceDotsView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setOldValue(@l AttributedText oldValue) {
        D6.G(this, oldValue != null);
        com.avito.android.util.text.j.a(this.f299549d, oldValue, null);
    }

    public final void setTitle(@l String title) {
        D6.G(this, title != null);
        this.f299547b.setText(title);
    }

    public final void setValue(@l AttributedText value) {
        D6.G(this, value != null);
        com.avito.android.util.text.j.a(this.f299548c, value, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PriceDotsView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.tariff_price_dots_view, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f299547b = textView;
        TextView textView2 = (TextView) findViewById(R.id.value);
        this.f299548c = textView2;
        TextView textView3 = (TextView) findViewById(R.id.old_value);
        this.f299549d = textView3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39568a.h.f393747a, i12, 0);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            textView2.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            textView3.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
