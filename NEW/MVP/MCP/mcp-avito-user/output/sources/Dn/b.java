package DN;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomEntryPointView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDN/b;", "LDN/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f3162a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f3163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f3164c;

    public b(@k View view) {
        View viewFindViewById = view.findViewById(R.id.bottom_entry_point);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        TabBarLayout.a.d(TabBarLayout.f180679h, viewFindViewById);
        this.f3162a = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.bottom_entry_point_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f3163b = (Button) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.bottom_entry_point_cancel_area);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f3164c = viewFindViewById3;
    }

    @Override // DN.a
    public final void a(@k EntryPoint entryPoint, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        Integer numA;
        String text = entryPoint.getText();
        Button button = this.f3163b;
        button.setText(text);
        String leftIcon = entryPoint.getLeftIcon();
        View view = this.f3162a;
        Drawable drawableH = (leftIcon == null || (numA = q.a(leftIcon)) == null) ? null : C35835l0.h(numA.intValue(), view.getContext());
        Drawable drawableH2 = C35835l0.h(R.attr.ic_close16, view.getContext());
        boolean z12 = entryPoint.getCancelButtonDeeplink() != null;
        Button.g(this.f3163b, drawableH, (drawableH2 == null || !z12) ? null : drawableH2, false, aVar2, 4);
        int i12 = z12 ? 0 : 8;
        View view2 = this.f3164c;
        view2.setVisibility(i12);
        view2.setOnClickListener(new Ae0.b(6, aVar2));
        button.setOnClickListener(new Ae0.b(7, aVar));
    }

    @Override // DN.a
    @k
    /* renamed from: b, reason: from getter */
    public final View getF3162a() {
        return this.f3162a;
    }
}
