package com.avito.android.success.konveyor.title;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: SuccessTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/success/konveyor/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/success/konveyor/title/f;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f291666b;

    public g(@k TextView textView) {
        super(textView);
        this.f291666b = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.success.konveyor.title.f
    public final void O1(@k AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        j.c(this.f291666b, attributedText, aVar);
    }
}
