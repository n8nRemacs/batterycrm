package com.avito.android.ai_assistant.adapter.user_message;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserMessageItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/user_message/j;", "Lcom/avito/android/ai_assistant/adapter/user_message/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f88922b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f88923c;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f88922b = aVar;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f88923c = textView;
        textView.setPadding(textView.getPaddingLeft(), y6.b(9), textView.getPaddingRight(), textView.getPaddingBottom());
    }

    @Override // com.avito.android.ai_assistant.adapter.user_message.i
    public final void q8(@k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f88923c, attributedText, this.f88922b);
    }
}
