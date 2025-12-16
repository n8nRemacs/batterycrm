package CE0;

import Y61.k;
import Y61.l;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Inputs.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_tns-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    public static final void a(@k Input input, boolean z12, @InterfaceC42165v @l Integer num, @InterfaceC42165v @l Integer num2) {
        G0 g02 = null;
        if (z12) {
            if (num2 != null) {
                input.setRightIcon(num2.intValue());
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                input.setRightIcon(C35835l0.h(R.attr.ic_invisible20, input.getContext()));
            }
            input.setTransformationMethod(PasswordTransformationMethod.getInstance());
            return;
        }
        if (num != null) {
            input.setRightIcon(num.intValue());
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            input.setRightIcon(C35835l0.h(R.attr.ic_visible20, input.getContext()));
        }
        input.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }
}
