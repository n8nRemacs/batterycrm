package com.avito.android.lib.design.toggle;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioButton.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/toggle/RadioButton;", "Lcom/avito/android/lib/design/toggle/Toggle;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RadioButton extends Toggle {
    public RadioButton(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButton);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        ToggleState toggleState = getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String();
        if ((toggleState != null ? toggleState.f181163a : null) != null || isChecked()) {
            return;
        }
        super.toggle();
    }
}
