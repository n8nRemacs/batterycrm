package com.avito.android.advert.item.disclaimer_pd;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerPDView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/disclaimer_pd/h;", "Lcom/avito/android/advert/item/disclaimer_pd/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f75231c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f75232b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.disclaimer_body);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75232b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.disclaimer_pd.g
    public final void By(@k l lVar, @k AttributedText attributedText) {
        List<Attribute> attributes = attributedText.getAttributes();
        ArrayList arrayList = new ArrayList(C42745f0.q(attributes, 10));
        for (Attribute linkAttribute : attributes) {
            if (linkAttribute instanceof DeepLinkAttribute) {
                DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) linkAttribute;
                List<FontParameter> parameters = deepLinkAttribute.getParameters();
                ArrayList arrayList2 = new ArrayList(parameters != null ? parameters : C42784z0.f406748b);
                arrayList2.add(FontParameter.UnderlineParameter.INSTANCE);
                linkAttribute = new DeepLinkAttribute(linkAttribute.getName(), linkAttribute.getTitle(), deepLinkAttribute.getDeepLink(), deepLinkAttribute.getFallbackUrl(), deepLinkAttribute.getDeepLinkString(), arrayList2);
            } else if (linkAttribute instanceof LinkAttribute) {
                LinkAttribute linkAttribute2 = (LinkAttribute) linkAttribute;
                List<FontParameter> parameters2 = linkAttribute2.getParameters();
                ArrayList arrayList3 = new ArrayList(parameters2 != null ? parameters2 : C42784z0.f406748b);
                arrayList3.add(FontParameter.UnderlineParameter.INSTANCE);
                linkAttribute = new LinkAttribute(linkAttribute.getName(), linkAttribute.getTitle(), linkAttribute2.getUrl(), arrayList3);
            }
            arrayList.add(linkAttribute);
        }
        AttributedText attributedTextCopy$default = AttributedText.copy$default(attributedText, null, arrayList, 1, 1, null);
        TextView textView = this.f75232b;
        j.c(textView, attributedTextCopy$default, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        attributedTextCopy$default.setOnDeepLinkClickListener(new SE0.a(2, lVar));
    }
}
