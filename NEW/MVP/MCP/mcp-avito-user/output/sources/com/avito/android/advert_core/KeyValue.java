package com.avito.android.advert_core;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.d;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: KeyValue.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/advert_core/KeyValue;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "value", "setTextAsLink", "", "isSelectable", "setTextSelectable", "(Z)V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class KeyValue extends LinearLayoutCompat {

    /* renamed from: q, reason: collision with root package name */
    public TextView f82417q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f82418r;

    @j
    public KeyValue(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f82417q = (TextView) findViewById(R.id.key_view);
        this.f82418r = (TextView) findViewById(R.id.value_view);
    }

    public final void setTextAsLink(@k String value) {
        TextView textView = this.f82418r;
        if (textView == null) {
            textView = null;
        }
        textView.setText(value);
        TextView textView2 = this.f82418r;
        (textView2 != null ? textView2 : null).setTextColor(d.getColorStateList(getContext(), R.color.params_link));
    }

    public final void setTextSelectable(boolean isSelectable) {
        TextView textView = this.f82417q;
        if (textView == null) {
            textView = null;
        }
        textView.setTextIsSelectable(isSelectable);
        TextView textView2 = this.f82418r;
        (textView2 != null ? textView2 : null).setTextIsSelectable(isSelectable);
    }

    public final void setTitle(@k String title) {
        TextView textView = this.f82417q;
        if (textView == null) {
            textView = null;
        }
        textView.setText(title);
    }

    public KeyValue(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}
