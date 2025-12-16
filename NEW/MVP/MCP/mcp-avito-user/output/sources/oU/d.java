package OU;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import hw.InterfaceC41179d;
import kotlin.Metadata;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOU/d;", "LOU/c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f12285b;

    public d(@k View view) {
        this.f12285b = (TextView) view;
    }

    @Override // OU.c
    public final void g0(@l CharSequence charSequence) {
        this.f12285b.setText(charSequence);
    }
}
