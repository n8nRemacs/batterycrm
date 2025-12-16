package PU;

import OU.c;
import OU.d;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import hw.InterfaceC41179d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClickableElement.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LPU/b;", "LPU/a;", "LOU/c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class b implements a, c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f13076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f13077c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f13078d;

    public b(@k View view) {
        this.f13076b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f13077c = new d(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f13078d = (TextView) viewFindViewById2;
    }

    @Override // PU.a
    public final void a(@l Y41.a<G0> aVar) {
        View view = this.f13076b;
        if (aVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new Ae0.b(16, aVar));
        }
    }

    public final void b(@l CharSequence charSequence) {
        I5.a(this.f13078d, charSequence, false);
    }

    @Override // OU.c
    public final void g0(@l CharSequence charSequence) {
        this.f13077c.g0(charSequence);
    }
}
