package Hf0;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishButtonImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf0/b;", "LHf0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements InterfaceC13984a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Button f7601a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Button f7602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7604d;

    public b(@k View view) {
        Button button = (Button) view.findViewById(R.id.main_button);
        this.f7601a = button;
        this.f7602b = button;
        this.f7603c = D6.t(view, R.dimen.publish_params_continue_button_margin_horizontal);
        this.f7604d = D6.t(view, R.dimen.publish_params_continue_button_margin_horizontal_redesign);
    }

    @Override // Hf0.InterfaceC13984a
    @l
    /* renamed from: a, reason: from getter */
    public final Button getF7602b() {
        return this.f7602b;
    }

    public final void b(@l Y41.a<G0> aVar) {
        G0 g02;
        Button button = this.f7601a;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC13121a(2, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 != null || button == null) {
            return;
        }
        button.setOnClickListener(null);
        G0 g03 = G0.f406611a;
    }

    public final void c(int i12, boolean z12) throws Resources.NotFoundException {
        Button button = this.f7601a;
        if (button != null) {
            button.setAppearance(i12);
            int i13 = z12 ? this.f7604d : this.f7603c;
            D6.c(button, Integer.valueOf(i13), null, Integer.valueOf(i13), null, 10);
        }
    }

    public final void d(@k String str) {
        Button button = this.f7601a;
        if (button != null) {
            button.setText(str);
        }
    }

    @Override // Hf0.InterfaceC13984a
    public final int getHeight() {
        Button button = this.f7601a;
        if (button == null) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) button.getLayoutParams();
        return button.getHeight() + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }
}
