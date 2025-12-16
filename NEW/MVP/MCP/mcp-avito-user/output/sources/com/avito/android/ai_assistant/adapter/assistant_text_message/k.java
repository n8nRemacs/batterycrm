package com.avito.android.ai_assistant.adapter.assistant_text_message;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AssistantTextMessageItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/assistant_text_message/k;", "Lcom/avito/android/ai_assistant/adapter/assistant_text_message/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f88760b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f88761c;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f88760b = aVar;
        View viewFindViewById = view.findViewById(R.id.assistant_text_message);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f88761c = textView;
    }

    @Override // com.avito.android.ai_assistant.adapter.assistant_text_message.j
    public final void q8(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f88761c, attributedText, this.f88760b);
    }
}
