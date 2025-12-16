package l3;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.TextView;
import androidx.core.widget.n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextStyleData.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@Y61.k TextView textView, @Y61.k i iVar) {
        ColorStateList colorStateListA;
        if (textView instanceof c) {
            ((c) textView).setAkitaTextStyleData(iVar);
            return;
        }
        textView.setTypeface(iVar.f413425c);
        Float f12 = iVar.f413423a;
        if (f12 != null) {
            textView.setTextSize(0, f12.floatValue());
        }
        com.akita.view.foundation.util.a aVar = iVar.f413424b;
        if (aVar != null && (colorStateListA = aVar.a()) != null) {
            textView.setTextColor(colorStateListA);
        }
        Integer num = iVar.f413427e;
        if (num != null) {
            n.d(textView, num.intValue());
        }
        Integer num2 = iVar.f413433k;
        Integer num3 = iVar.f413432j;
        if (num3 != null || num2 != null) {
            textView.setIncludeFontPadding(true);
            if (Build.VERSION.SDK_INT >= 33) {
                textView.setFallbackLineSpacing(false);
            }
        }
        if (num3 != null) {
            int iIntValue = num3.intValue();
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setFirstBaselineToTopHeight(iIntValue);
            } else {
                n.b(textView, iIntValue);
            }
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setLastBaselineToBottomHeight(iIntValue2);
            } else {
                n.c(textView, iIntValue2);
            }
        }
        textView.setText(textView.getText());
    }
}
