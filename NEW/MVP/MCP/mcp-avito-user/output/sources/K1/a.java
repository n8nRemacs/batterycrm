package K1;

import android.os.Bundle;
import androidx.view.AbstractC23292H0;
import androidx.view.C23317W;
import androidx.view.C23389r;
import androidx.view.C23397v;
import androidx.view.InterfaceC23373j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AbstractAppBarOnDestinationChangedListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK1/a;", "Landroidx/navigation/v$c;", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a implements C23397v.c {
    @Override // androidx.view.C23397v.c
    public void a(@Y61.k C23317W c23317w, @Y61.l Bundle bundle) {
        String string;
        C23389r c23389r;
        if (c23317w instanceof InterfaceC23373j) {
            return;
        }
        CharSequence charSequence = c23317w.f52882e;
        if (charSequence != null) {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (bundle == null || !bundle.containsKey(strGroup)) {
                    StringBuilder sb2 = new StringBuilder("Could not find \"");
                    sb2.append(strGroup);
                    sb2.append("\" in ");
                    sb2.append(bundle);
                    sb2.append(" to fill label \"");
                    throw new IllegalArgumentException(AK.c.r(sb2, charSequence, '\"'));
                }
                matcher.appendReplacement(stringBuffer, "");
                if (L.f((strGroup == null || (c23389r = (C23389r) c23317w.f52885h.get(strGroup)) == null) ? null : c23389r.f53171a, AbstractC23292H0.f52784d)) {
                    bundle.getInt(strGroup);
                    throw null;
                }
                stringBuffer.append(String.valueOf(bundle.get(strGroup)));
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        } else {
            string = null;
        }
        string.getClass();
        b();
        throw null;
    }

    public abstract void b();
}
