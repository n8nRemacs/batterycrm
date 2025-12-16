package com.avito.android.profile.remove.screen.items.text_area_item;

import PK0.o;
import Y61.k;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TextAreaItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/text_area_item/i;", "Lcom/avito/android/profile/remove/screen/items/text_area_item/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f224152b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f224153c;

    public i(@k TextView textView, @k com.avito.android.util.text.a aVar) {
        super(textView);
        this.f224152b = textView;
        this.f224153c = aVar;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.profile.remove.screen.items.text_area_item.h
    public final void r(@k AttributedText attributedText) {
        TextView textView = this.f224152b;
        o oVar = textView instanceof o ? (o) textView : null;
        CharSequence charSequenceA = this.f224153c.a(textView.getContext(), oVar != null ? oVar.getTextStyleData() : null, attributedText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequenceA);
        spannableStringBuilder.setSpan(new g(y6.f(13), y6.f(13)), 0, spannableStringBuilder.length(), 33);
        I5.a(textView, spannableStringBuilder, false);
    }
}
