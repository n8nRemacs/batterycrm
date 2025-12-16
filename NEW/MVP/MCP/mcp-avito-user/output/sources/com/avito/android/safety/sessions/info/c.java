package com.avito.android.safety.sessions.info;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import j.e0;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SessionsInfoDescriptionBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/info/c;", "Lcom/avito/android/safety/sessions/info/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f257948a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<FontParameter> f257949b = C42745f0.U(new FontParameter.TextStyleParameter(null, "h50"), new FontParameter.ParagraphSpacingParameter(22.0f));

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<FontParameter.ColorParameter> f257950c = Collections.singletonList(new FontParameter.ColorParameter(null, null, "blue600"));

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<FontParameter.TextStyleParameter> f257951d = com.avito.android.advert.item.delivery_suggests.l.u(null, "m10");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final HelpCenterUrlShowLink f257952e = new HelpCenterUrlShowLink("request/119?eventData[articleId]=1399&eventData[contextId]=102");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f257953f;

    @Inject
    public c(@Y61.k Resources resources) {
        this.f257948a = resources;
        StringBuilder sb2 = new StringBuilder();
        e.a(sb2, "p1");
        e.a(sb2, "sh");
        e.a(sb2, "p2");
        e.a(sb2, "su");
        e.a(sb2, "ed");
        this.f257953f = sb2.toString();
    }

    @Override // com.avito.android.safety.sessions.info.b
    @Y61.k
    public final AttributedText a() {
        return e(R.string.sessions_result_password_change_description_multiprofile);
    }

    @Override // com.avito.android.safety.sessions.info.b
    @Y61.k
    public final AttributedText b() {
        return e(R.string.sessions_result_password_change_description);
    }

    @Override // com.avito.android.safety.sessions.info.b
    @Y61.k
    public final AttributedText c() {
        return e(R.string.sessions_result_password_change_description_multiprofile);
    }

    @Override // com.avito.android.safety.sessions.info.b
    @Y61.k
    public final AttributedText d() {
        return e(R.string.sessions_result_password_change_description);
    }

    public final AttributedText e(@e0 int i12) throws Resources.NotFoundException {
        Resources resources = this.f257948a;
        String string = resources.getString(i12);
        List<FontParameter.TextStyleParameter> list = this.f257951d;
        return new AttributedText(this.f257953f, C42745f0.U(new FontAttribute("p1", string, list), new FontAttribute("sh", resources.getString(R.string.sessions_result_common_subheading), this.f257949b), new FontAttribute("p2", resources.getString(R.string.sessions_result_common_description_part_2), list), new DeepLinkAttribute("su", resources.getString(R.string.sessions_result_common_support), this.f257952e, null, null, this.f257950c, 24, null), new FontAttribute("ed", resources.getString(R.string.sessions_result_common_end), list)), 1);
    }
}
