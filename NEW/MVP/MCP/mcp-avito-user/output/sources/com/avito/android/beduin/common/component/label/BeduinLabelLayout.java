package com.avito.android.beduin.common.component.label;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.network.model.Style;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinLabelLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/label/BeduinLabelLayout;", "Landroid/widget/LinearLayout;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinLabelLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f101649e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f101650b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f101651c;

    /* renamed from: d, reason: collision with root package name */
    public int f101652d;

    /* compiled from: BeduinLabelLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101653a;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.ARROWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f101653a = iArr;
        }
    }

    @j
    public BeduinLabelLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(int i12, int i13, @l TextUtils.TruncateAt truncateAt, @k CharSequence charSequence, boolean z12) {
        TextView textView = this.f101650b;
        textView.setGravity(i12);
        textView.setEllipsize(truncateAt);
        textView.setText(charSequence);
        if (z12) {
            textView.setOnTouchListener(new f());
        } else {
            textView.setOnTouchListener(null);
        }
        textView.setMaxLines(Integer.MAX_VALUE);
        this.f101652d = i13;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        TextView textView = this.f101650b;
        textView.measure(i12, i13);
        TextView textView2 = this.f101651c;
        CharSequence text = textView2.getText();
        textView2.setVisibility((text == null || text.length() == 0 || textView.getLineCount() <= this.f101652d) ? 8 : 0);
        textView.setMaxLines(this.f101652d);
        super.onMeasure(i12, i13);
    }

    public BeduinLabelLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f101652d = Integer.MAX_VALUE;
        LayoutInflater.from(context).inflate(R.layout.beduin_component_label, (ViewGroup) this, true);
        setOrientation(1);
        View viewFindViewById = findViewById(R.id.mainText);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f101650b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.expandText);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f101651c = (TextView) viewFindViewById2;
    }
}
