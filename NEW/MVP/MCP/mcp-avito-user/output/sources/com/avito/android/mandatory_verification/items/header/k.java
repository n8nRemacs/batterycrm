package com.avito.android.mandatory_verification.items.header;

import Y41.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MandatoryVerificationHeaderItemViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/items/header/k;", "Lcom/avito/android/mandatory_verification/items/header/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_mandatory-verification-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f184663f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f184664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f184665c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f184666d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f184667e;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Y41.a<G0> aVar2) {
        super(view);
        this.f184664b = aVar;
        this.f184665c = aVar2;
        this.f184666d = (TextView) view.findViewById(R.id.header_title);
        this.f184667e = (TextView) view.findViewById(R.id.header_description);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f184665c.invoke();
    }

    @Override // com.avito.android.mandatory_verification.items.header.j
    public final void wx(@Y61.k MandatoryVerificationHeaderItem mandatoryVerificationHeaderItem, @Y61.k l<? super DeepLink, G0> lVar) {
        I5.a(this.f184666d, mandatoryVerificationHeaderItem.f184649c, false);
        SE0.a aVar = new SE0.a(27, lVar);
        AttributedText attributedText = mandatoryVerificationHeaderItem.f184650d;
        attributedText.setOnDeepLinkClickListener(aVar);
        com.avito.android.util.text.j.a(this.f184667e, attributedText, this.f184664b);
    }
}
