package com.avito.android.profile.remove.screen.items.text;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: TextItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/text/h;", "Lcom/avito/android/profile/remove/screen/items/text/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f224138b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f224139c;

    public h(@k TextView textView, @k com.avito.android.util.text.a aVar) {
        super(textView);
        this.f224138b = textView;
        this.f224139c = aVar;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.profile.remove.screen.items.text.g
    public final void r(@k AttributedText attributedText) {
        j.a(this.f224138b, attributedText, this.f224139c);
    }
}
