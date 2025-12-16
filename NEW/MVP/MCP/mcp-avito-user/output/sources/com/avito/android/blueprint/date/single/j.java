package com.avito.android.blueprint.date.single;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDateView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/date/single/j;", "LHj/c;", "Lcom/avito/android/blueprint/date/single/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends Hj.c implements i {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f105505r = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ContextThemeWrapper f105506m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Input f105507n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final TextView f105508o;

    /* renamed from: p, reason: collision with root package name */
    public final ColorStateList f105509p;

    /* renamed from: q, reason: collision with root package name */
    public final ColorStateList f105510q;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_date_content, aVar);
        this.f105506m = new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23);
        Input input = (Input) this.f7656e.findViewById(R.id.input);
        this.f105507n = input;
        TextView textView = (TextView) this.f7656e.findViewById(R.id.input_text);
        this.f105508o = textView;
        this.f105509p = textView.getTextColors();
        this.f105510q = textView.getHintTextColors();
        D6.b(textView, Integer.valueOf(input.getF179354z()), Integer.valueOf(input.getF179308A()), Integer.valueOf(input.getF179309B()), Integer.valueOf(input.getF179310C()));
        input.setTextColor(0);
        input.setHintTextColor(0);
    }

    @Override // Hj.c
    public final void B80() {
        Input.f179303W.getClass();
        this.f105507n.setState(Input.f179305b0);
    }

    @Override // Hj.c
    public final void C80() {
        Input.f179303W.getClass();
        this.f105507n.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprint.date.single.i
    public final void M5(@k Y41.a<G0> aVar) {
        this.f105507n.setClearButtonListener(aVar);
    }

    @Override // com.avito.android.blueprint.date.single.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f105507n.setOnClickListener(new com.avito.android.blueprint.date.interval.j(2, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Input input = this.f105507n;
        input.setOnClickListener(null);
        input.setClearButtonListener(null);
    }

    @Override // com.avito.android.blueprint.date.single.i
    public final void m(@l String str) {
        CharSequence charSequenceI;
        Input input = this.f105507n;
        Input.t(input, str, false, 6);
        TextView textView = this.f105508o;
        ContextThemeWrapper contextThemeWrapper = this.f105506m;
        if (str != null) {
            FV.a aVar = FV.a.f4720a;
            int iB2 = y6.b(6);
            aVar.getClass();
            textView.setText(FV.a.i(str, contextThemeWrapper, R.attr.textIconCalendarToday, iB2));
            textView.setTextColor(this.f105509p);
            return;
        }
        CharSequence hint = input.getHint();
        if (hint == null) {
            charSequenceI = null;
        } else {
            FV.a aVar2 = FV.a.f4720a;
            int iB3 = y6.b(6);
            aVar2.getClass();
            charSequenceI = FV.a.i(hint, contextThemeWrapper, R.attr.textIconCalendarToday, iB3);
        }
        textView.setText(charSequenceI);
        textView.setTextColor(this.f105510q);
    }

    @Override // com.avito.android.blueprint.date.single.i
    public final void o(@l String str) {
        CharSequence charSequenceI;
        Input input = this.f105507n;
        input.setHint(str);
        CharSequence hint = input.getHint();
        if (hint == null) {
            charSequenceI = null;
        } else {
            FV.a aVar = FV.a.f4720a;
            ContextThemeWrapper contextThemeWrapper = this.f105506m;
            int iB2 = y6.b(6);
            aVar.getClass();
            charSequenceI = FV.a.i(hint, contextThemeWrapper, R.attr.textIconCalendarToday, iB2);
        }
        TextView textView = this.f105508o;
        textView.setText(charSequenceI);
        textView.setTextColor(this.f105510q);
    }
}
