package com.avito.android.publish.items.atributed_text;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishAttributedTextItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/atributed_text/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/atributed_text/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f236778b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f236779c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f236780d;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f236778b = aVar;
        View viewFindViewById = view.findViewById(R.id.publish_attributed_text_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f236779c = textView;
        View viewFindViewById2 = view.findViewById(R.id.publish_attributed_text_view_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f236780d = (TextView) viewFindViewById2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.publish.items.atributed_text.g
    public final void r(@k AttributedText attributedText) {
        TextView textView = this.f236779c;
        textView.setText(this.f236778b.c(textView.getContext(), attributedText));
    }

    @Override // com.avito.android.publish.items.atributed_text.g
    public final void setTitle(@l String str) {
        I5.a(this.f236780d, str, false);
    }
}
