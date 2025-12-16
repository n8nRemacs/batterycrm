package com.avito.android.ai_assistant.adapter.repeat_button;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RepeatButtonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/repeat_button/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/konveyor/util/d;", "Lcom/avito/android/ai_assistant/adapter/repeat_button/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements com.avito.konveyor.util.d<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f88847b;

    public f(@k View view, @k e eVar) {
        super(view);
        this.f88847b = eVar;
        Context context = this.itemView.getContext();
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        textView.setPadding(textView.getPaddingLeft(), y6.b(9), textView.getPaddingRight(), textView.getPaddingBottom());
        FV.a aVar = FV.a.f4720a;
        String strK0 = com.avito.android.printable_text.b.c(R.string.ai_assistant_repeat_button_text, new Serializable[0]).k0(context);
        int iB2 = y6.b(3);
        aVar.getClass();
        I5.a(textView, FV.a.i(strK0, context, R.attr.textIconRepeat, iB2), false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        this.itemView.setOnClickListener(new B(this, 16));
    }
}
