package com.avito.android.beduin.common.component.text_with_icon;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinTextWithIconViewContainer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/beduin/common/component/text_with_icon/e;", "Landroid/widget/LinearLayout;", "Lej/e;", "Landroid/view/View;", "b", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "getIconImageView", "()Landroid/widget/ImageView;", "iconImageView", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends LinearLayout implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f102791b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView iconImageView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final TextView textView;

    public e(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f102791b = this;
        LayoutInflater.from(context).inflate(R.layout.beduin_component_text_with_icon, (ViewGroup) this, true);
        this.iconImageView = (ImageView) findViewById(R.id.image);
        this.textView = (TextView) findViewById(R.id.text);
    }

    @k
    public final ImageView getIconImageView() {
        return this.iconImageView;
    }

    @Override // ej.InterfaceC40116e
    @k
    public View getRoot() {
        return this.f102791b;
    }

    @k
    public final TextView getTextView() {
        return this.textView;
    }
}
