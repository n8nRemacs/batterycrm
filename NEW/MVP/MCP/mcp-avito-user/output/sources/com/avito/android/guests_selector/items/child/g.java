package com.avito.android.guests_selector.items.child;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChildView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/guests_selector/items/child/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/guests_selector/items/child/f;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Context f161483b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f161484c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f161485d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ImageView f161486e;

    public g(@k View view) {
        super(view);
        this.f161483b = view.getContext();
        this.f161484c = (TextView) view.findViewById(R.id.title);
        this.f161485d = (TextView) view.findViewById(R.id.description);
        this.f161486e = (ImageView) view.findViewById(R.id.remove);
    }

    @Override // com.avito.android.guests_selector.items.child.f
    public final void e2(@l PrintableText printableText) {
        TextView textView = this.f161485d;
        if (textView != null) {
            I5.a(textView, printableText != null ? printableText.k0(this.f161483b) : null, false);
        }
    }

    @Override // com.avito.android.guests_selector.items.child.f
    public final void oh(@k Y41.a<G0> aVar) {
        ImageView imageView = this.f161486e;
        if (imageView != null) {
            D6.a(aVar, imageView);
        }
    }

    @Override // com.avito.android.guests_selector.items.child.f
    public final void p1(@k PrintableText printableText) {
        TextView textView = this.f161484c;
        if (textView != null) {
            I5.a(textView, printableText.k0(this.f161483b), false);
        }
    }
}
