package m31;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.transition.TransitionManager;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.vectordrawable.graphics.drawable.b;
import com.avito.android.R;
import java.util.Arrays;
import kotlin.jvm.internal.u0;
import y2.C50041b;

/* loaded from: classes8.dex */
public final class m extends b.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ub1.b f414298b;

    public m(Ub1.b bVar) {
        this.f414298b = bVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b.a
    public final void b(Drawable drawable) {
        Ub1.b bVar = this.f414298b;
        if (!bVar.f16509s) {
            C50041b c50041b = bVar.f16499i;
            if (!c50041b.f442864b) {
                if (bVar.f16510t != null) {
                    int length = String.valueOf(bVar.f16511u).length();
                    String str = bVar.f16510t;
                    bVar.f16511u = (str != null ? Integer.valueOf(str.length()) : null).intValue() > length ? bVar.f16510t : r.q(bVar.getResources().getString(R.string.login_as_text), bVar.f16510t);
                    u0 u0Var = u0.f406856a;
                    bVar.setContentDescription(String.format(bVar.getResources().getString(R.string.talkback_click_text), Arrays.copyOf(new Object[]{r.q(bVar.getResources().getString(R.string.login_as_text), bVar.f16510t)}, 1)));
                }
                if (bVar.f16509s || c50041b.f442864b) {
                    return;
                }
                TransitionManager.beginDelayedTransition(bVar);
                TextView textView = bVar.f16503m;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(bVar.f16511u);
                TextView textView2 = bVar.f16503m;
                (textView2 != null ? textView2 : null).setCompoundDrawablePadding(bVar.f16506p);
                return;
            }
        }
        Handler handler = bVar.getHandler();
        if (handler != null) {
            handler.post(bVar.f16513w);
        }
    }
}
