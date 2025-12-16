package Q81;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import q50.InterfaceC47203a;
import sK0.C48063a;
import wK0.AbstractC49526a;
import wK0.C49527b;

/* compiled from: Badges.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes9.dex */
public final class c {
    public static C49527b a(View view) {
        return AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, C35835l0.e(R.attr.constantWhite, view.getContext()), null, view.getResources().getDimensionPixelSize(R.dimen.price_badge_corner_radius), null, 0, 122);
    }

    @InterfaceC41178c
    public static final void b(@k TextView textView, @k Badge badge) {
        textView.setText(badge.getF268989b());
        Context context = textView.getContext();
        UniversalColor universalTitleColor = badge.getF268990c();
        C48063a c48063a = C48063a.f437606a;
        textView.setTextColor(c48063a.a(context, universalTitleColor));
        UniversalColor universalBackgroundColor = badge.getF268991d();
        if (universalBackgroundColor == null) {
            textView.setBackground(null);
        } else {
            textView.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, ColorStateList.valueOf(c48063a.a(textView.getContext(), universalBackgroundColor)), null, textView.getResources().getDimensionPixelSize(R.dimen.price_badge_corner_radius), null, 0, 122));
        }
    }
}
