package com.avito.android.re_agent_landing.landing.items.question;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: QuestionView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/question/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/re_agent_landing/landing/items/question/g;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f250788b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Accordion f250789c;

    public h(@k View view) {
        super(view);
        this.f250788b = view.getContext();
        this.f250789c = (Accordion) view.findViewById(R.id.re_agent_profile_create_landing_question);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.question.g
    public final void Ur(@k c cVar) {
        TextView textView = new TextView(this.f250788b);
        j.c(textView, cVar.f250784d, null);
        textView.setTextAppearance(C35835l0.j(R.attr.textM20, textView.getContext()));
        this.f250789c.setState(new QU.d(cVar.f250783c, null, true, false, false, textView, null, null, false, null, 986, null));
    }
}
