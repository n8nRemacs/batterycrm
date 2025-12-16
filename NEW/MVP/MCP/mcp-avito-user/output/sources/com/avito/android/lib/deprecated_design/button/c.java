package com.avito.android.lib.deprecated_design.button;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.D6;
import hw.InterfaceC41179d;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/button/c;", "Lcom/avito/android/lib/deprecated_design/button/a;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f177872a;

    public c(@k View view) {
        this.f177872a = (TextView) view;
    }

    public final void a(int i12) {
        this.f177872a.setText(i12);
    }

    public final void b(@l CharSequence charSequence) {
        this.f177872a.setText(charSequence);
    }

    @Override // com.avito.android.lib.deprecated_design.button.a
    public final void c(@l final Y41.a<G0> aVar) {
        TextView textView = this.f177872a;
        if (aVar == null) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new View.OnClickListener(aVar) { // from class: com.avito.android.lib.deprecated_design.button.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ N f177871b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f177871b = (N) aVar;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177871b.invoke();
                }
            });
        }
    }

    public final void d(boolean z12) {
        D6.G(this.f177872a, z12);
    }
}
