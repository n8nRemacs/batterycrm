package kotlin;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.str_booking.network.models.common.Prompt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: TextUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-booking_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {
    @Y61.k
    public static final AttributedText a(@Y61.k AttributedText attributedText) {
        List<Attribute> attributes = attributedText.getAttributes();
        ArrayList arrayList = new ArrayList(C42745f0.q(attributes, 10));
        for (Parcelable parcelableCopy$default : attributes) {
            boolean z12 = parcelableCopy$default instanceof DeepLinkAttribute;
            List parameters = z12 ? ((DeepLinkAttribute) parcelableCopy$default).getParameters() : parcelableCopy$default instanceof LinkAttribute ? ((LinkAttribute) parcelableCopy$default).getParameters() : C42784z0.f406748b;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(parameters != null ? parameters : C42784z0.f406748b);
            arrayList2.add(FontParameter.UnderlineParameter.INSTANCE);
            if (z12) {
                parcelableCopy$default = DeepLinkAttribute.copy$default((DeepLinkAttribute) parcelableCopy$default, null, null, null, null, null, arrayList2, 31, null);
            } else if (parcelableCopy$default instanceof LinkAttribute) {
                parcelableCopy$default = LinkAttribute.copy$default((LinkAttribute) parcelableCopy$default, null, null, null, arrayList2, 7, null);
            }
            arrayList.add(parcelableCopy$default);
        }
        return AttributedText.copy$default(attributedText, null, arrayList, 1, 1, null);
    }

    public static void b(TextView textView, AttributedText attributedText) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    public static final void c(@Y61.k TextView textView, @Y61.l AttributedText attributedText, @Y61.k Y41.r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar, @Y61.l com.avito.android.util.text.a aVar) {
        List<Attribute> attributes;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (attributedText != null && (attributes = attributedText.getAttributes()) != null) {
            for (Attribute attribute : attributes) {
                if (attribute instanceof LinkAttribute) {
                    attributedText.setOnUrlClickListener(new com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.L(rVar, (LinkAttribute) attribute));
                }
            }
        }
        com.avito.android.util.text.j.a(textView, attributedText, aVar);
    }

    @Y61.k
    public static final AbstractC15725a d(@Y61.k String str) {
        return (C43066x.h0(str, "api/", false) || C43066x.h0(str, "web/", false)) ? new AbstractC15725a.C1218a(str, null) : C43066x.h0(str, "ru.avito", false) ? new AbstractC15725a.b(str, null) : C43066x.h0(str, "tel", false) ? new AbstractC15725a.c(str, null) : new AbstractC15725a.d(str, null);
    }
}
