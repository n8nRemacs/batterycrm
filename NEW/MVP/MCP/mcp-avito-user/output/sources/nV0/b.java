package NV0;

import Y61.k;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.d;
import com.avito.beduin.v2.interaction.flow.keyboard.g;
import dU0.InterfaceC39628a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShowKeyboardInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LNV0/b;", "Landroid/view/View;", "V", "LPT0/a;", "Lcom/avito/beduin/v2/interaction/flow/keyboard/g;", "<init>", "()V", "show-keyboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class b<V extends View> extends PT0.a<V, g> {
    public b() {
        super(g.class);
    }

    @Override // PT0.a
    public /* bridge */ /* synthetic */ void c(InterfaceC39628a interfaceC39628a, View view) {
        d(view);
    }

    public void d(@k View view) {
        view.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) d.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }
}
