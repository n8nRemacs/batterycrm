package com.avito.android.lib.deprecated_design.dialog;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import hw.InterfaceC41179d;
import j.e0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/dialog/r;", "Lcom/avito/android/lib/deprecated_design/dialog/q;", "Lcom/avito/android/lib/deprecated_design/button_panel/a;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class r implements q, com.avito.android.lib.deprecated_design.button_panel.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.deprecated_design.button_panel.b f177948a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f177949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final OU.d f177950c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final OU.d f177951d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final OU.d f177952e;

    public r(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.button_panel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f177948a = new com.avito.android.lib.deprecated_design.button_panel.b(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f177949b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f177950c = new OU.d(viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.body);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f177951d = new OU.d(viewFindViewById4);
        View viewFindViewById5 = view.findViewById(R.id.embedded_link);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById5;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f177952e = new OU.d(textView);
    }

    public final void a() {
        D6.w(this.f177951d.f12285b);
    }

    public final void b() {
        D6.w(this.f177950c.f12285b);
    }

    public final void c(@Y61.l CharSequence charSequence) {
        this.f177951d.g0(charSequence);
    }

    public final void d(@e0 int i12) {
        this.f177948a.f177876a.a(i12);
    }

    public final void e(@Y61.l String str) {
        this.f177948a.f177876a.b(str);
    }

    public final void f(@Y61.l Y41.a<G0> aVar) {
        this.f177948a.a(aVar);
    }

    public final void g() {
        this.f177948a.f177877b.d(false);
    }

    public final void h(@Y61.l Y41.a<G0> aVar) {
        this.f177948a.b(aVar);
    }

    public final void i(@Y61.l String str) {
        this.f177950c.g0(str);
    }
}
