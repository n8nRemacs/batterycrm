package com.avito.android.guests_selector.items.children_add_button;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChildrenAddButtonView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/guests_selector/items/children_add_button/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/guests_selector/items/children_add_button/f;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f161500f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f161501b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f161502c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f161503d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Button f161504e;

    public h(@k View view) {
        super(view);
        this.f161501b = view.getContext();
        this.f161502c = (TextView) view.findViewById(R.id.title);
        this.f161503d = (TextView) view.findViewById(R.id.description);
        this.f161504e = (Button) view.findViewById(R.id.addChild);
    }

    @Override // com.avito.android.guests_selector.items.children_add_button.f
    public final void KS(boolean z12) {
        Button button = this.f161504e;
        if (z12) {
            if (button != null) {
                D6.k(button);
            }
        } else if (button != null) {
            D6.h(button);
        }
    }

    @Override // com.avito.android.guests_selector.items.children_add_button.f
    public final void Sv(@k Y41.a<G0> aVar) {
        Button button = this.f161504e;
        if (button != null) {
            button.setOnClickListener(new g(0, aVar));
        }
    }

    @Override // com.avito.android.guests_selector.items.children_add_button.f
    public final void e2(@k PrintableText printableText) {
        TextView textView = this.f161503d;
        if (textView != null) {
            I5.a(textView, printableText.k0(this.f161501b), false);
        }
    }

    @Override // com.avito.android.guests_selector.items.children_add_button.f
    public final void p1(@k PrintableText printableText) {
        TextView textView = this.f161502c;
        if (textView != null) {
            I5.a(textView, printableText.k0(this.f161501b), false);
        }
    }
}
