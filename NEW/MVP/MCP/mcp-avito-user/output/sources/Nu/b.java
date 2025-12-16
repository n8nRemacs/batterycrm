package NU;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.d;
import com.avito.android.R;
import com.avito.android.util.D6;
import hw.InterfaceC41179d;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableSIngleLine.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNU/b;", "LNU/a;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f11524b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Resources f11525c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f11526d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f11527e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f11528f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f11529g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ColorStateList f11530h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ColorStateList f11531i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11532j;

    public b(@k View view) {
        this.f11524b = view;
        this.f11525c = view.getContext().getResources();
        View viewFindViewById = view.findViewById(R.id.hint);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f11526d = textView;
        View viewFindViewById2 = view.findViewById(R.id.value);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f11527e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.reset_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f11528f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f11529g = viewFindViewById4;
        this.f11530h = textView.getTextColors();
        this.f11531i = d.getColorStateList(view.getContext(), R.color.text_error_disableable);
    }

    @Override // NU.a
    public final void a(@k Y41.a<G0> aVar) {
        this.f11524b.setOnClickListener(new ViewOnClickListenerC13121a(3, aVar));
    }

    @Override // NU.a
    public final void m(@l String str) {
        String quantityString;
        List listV = C42745f0.V(str);
        boolean z12 = true;
        if (listV.size() <= 1) {
            quantityString = (String) C42745f0.G(listV);
        } else {
            int size = listV.size();
            quantityString = this.f11525c.getQuantityString(R.plurals.selectable_single_line_selected, size, Integer.valueOf(size));
        }
        TextView textView = this.f11527e;
        textView.setText(quantityString);
        boolean z13 = !listV.isEmpty();
        this.f11532j = z13;
        D6.G(this.f11526d, z13);
        boolean z14 = this.f11532j;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        if (z14) {
            layoutParams.addRule(15, 0);
        } else {
            layoutParams.addRule(15, -1);
        }
        textView.requestLayout();
        if (D6.y(this.f11528f) && this.f11532j) {
            z12 = false;
        }
        D6.G(this.f11529g, z12);
    }

    @Override // NU.a
    public final void m3(@k CharSequence charSequence) {
        this.f11526d.setText(charSequence);
        this.f11527e.setHint(charSequence);
    }

    @Override // NU.a
    public final void w3(boolean z12) {
        TextView textView = this.f11527e;
        TextView textView2 = this.f11526d;
        if (z12) {
            ColorStateList colorStateList = this.f11531i;
            textView2.setTextColor(colorStateList);
            textView.setHintTextColor(colorStateList);
        } else {
            ColorStateList colorStateList2 = this.f11530h;
            textView2.setTextColor(colorStateList2);
            textView.setHintTextColor(colorStateList2);
        }
    }

    @Override // NU.a
    public final void xq(int i12) {
        this.f11526d.setText(R.string.city_in_items);
        this.f11527e.setHint(R.string.city_in_items);
    }
}
