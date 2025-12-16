package com.avito.android.lib.design.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: WheelTextDivider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/picker/n;", "Landroid/widget/FrameLayout;", "", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "text", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final String text;

    public n(@Y61.k Context context, @Y61.k String str) {
        super(context);
        this.text = str;
        LayoutInflater.from(context).inflate(R.layout.design_picker_wheel_text_divider, (ViewGroup) this, true);
        ((TextView) findViewById(R.id.wheelDividerText)).setText(str);
    }

    @Y61.k
    public final String getText() {
        return this.text;
    }
}
