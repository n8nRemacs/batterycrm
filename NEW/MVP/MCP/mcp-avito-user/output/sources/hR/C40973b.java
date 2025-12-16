package hr;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationListItem.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhr/b;", "Lhr/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40973b implements InterfaceC40972a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f397421b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f397422c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f397423d;

    /* renamed from: e, reason: collision with root package name */
    public final View f397424e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f397425f;

    public C40973b(@k View view) {
        this.f397421b = view;
        this.f397422c = (TextView) view.findViewById(R.id.date);
        this.f397423d = (TextView) view.findViewById(R.id.description);
        this.f397424e = view.findViewById(R.id.indicator);
        this.f397425f = (TextView) view.findViewById(R.id.title);
    }

    @Override // hr.InterfaceC40972a
    public final void R10() {
        this.f397423d.setTextColor(C35835l0.d(R.attr.gray54, this.f397421b.getContext()));
        D6.g(this.f397424e);
    }

    @Override // hr.InterfaceC40972a
    public final void St() {
        this.f397423d.setTextColor(C35835l0.d(R.attr.black, this.f397421b.getContext()));
        D6.H(this.f397424e);
    }

    @Override // hr.InterfaceC40972a
    public final void b0(@k String str) {
        this.f397422c.setText(str);
    }

    @Override // hr.InterfaceC40972a
    public final void c(@l Y41.a<G0> aVar) {
        View view = this.f397421b;
        if (aVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new i(24, aVar));
        }
    }

    @Override // hr.InterfaceC40972a
    public final void h(@k String str) {
        this.f397423d.setText(str);
    }

    @Override // hr.InterfaceC40972a
    public final void setTitle(@k String str) {
        this.f397425f.setText(str);
    }
}
