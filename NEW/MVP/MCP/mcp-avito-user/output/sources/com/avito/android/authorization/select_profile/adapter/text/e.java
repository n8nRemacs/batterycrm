package com.avito.android.authorization.select_profile.adapter.text;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.authorization.select_profile.adapter.AttributeParams;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.util.text.j;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TextItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/text/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/authorization/select_profile/adapter/text/d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f94289c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f94290b;

    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.select_profile_message_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f94290b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.authorization.select_profile.adapter.text.d
    public final void Cr(@k SelectProfileField.Text text, @k l<? super DeepLink, G0> lVar) {
        TextView textView = this.f94290b;
        String strK0 = text.f94262c.k0(textView.getContext());
        AttributeParams attributeParams = text.f94263d;
        if (attributeParams == null) {
            textView.setText(strK0);
            return;
        }
        AttributedText attributedText = new AttributedText(strK0, Collections.singletonList(new DeepLinkAttribute(attributeParams.f94256b, textView.getResources().getString(attributeParams.f94257c), attributeParams.f94258d, null, null, C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK)), 24, null)), 1);
        attributedText.setOnDeepLinkClickListener(new SE0.a(10, lVar));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        j.c(textView, attributedText, null);
    }
}
