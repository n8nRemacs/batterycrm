package com.avito.android.ui.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import hw.InterfaceC41177b;
import kotlin.Metadata;

/* compiled from: RestrictedSelectionEditText.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ui/view/RestrictedSelectionEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RestrictedSelectionEditText extends AppCompatEditText {
    public RestrictedSelectionEditText(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i12, int i13) {
        Editable text = getText();
        if (text == null || (i12 == text.length() && i13 == text.length())) {
            super.onSelectionChanged(i12, i13);
        } else {
            setSelection(text.length(), text.length());
        }
    }
}
