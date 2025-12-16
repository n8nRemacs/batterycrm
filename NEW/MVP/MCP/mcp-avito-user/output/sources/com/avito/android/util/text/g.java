package com.avito.android.util.text;

import Y61.k;
import android.text.Editable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.BadgeAttribute;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.remote.model.text.ParametersAttribute;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.text.UnknownAttribute;
import com.avito.android.util.D5;
import com.avito.android.util.text.span.UrlSpan;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LegacyAttributedTextFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/text/g;", "Lcom/avito/android/util/D5$a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements D5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AttributedText f319080a;

    /* compiled from: LegacyAttributedTextFormatter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/text/g$a", "Lcom/avito/android/deep_linking/links/w;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AttributedText f319081b;

        public a(AttributedText attributedText) {
            this.f319081b = attributedText;
        }

        @Override // com.avito.android.deep_linking.links.w
        public final void i7(@k DeepLink deepLink) {
            w onDeepLinkClickListener = this.f319081b.getOnDeepLinkClickListener();
            if (onDeepLinkClickListener != null) {
                onDeepLinkClickListener.i7(deepLink);
            }
        }
    }

    public g(AttributedText attributedText, h hVar) {
        this.f319080a = attributedText;
    }

    @Override // com.avito.android.util.D5.a
    public final void a(@k Editable editable, @k String str, int i12, int i13) {
        Object next;
        String string = editable.subSequence(i12, i13).toString();
        AttributedText attributedText = this.f319080a;
        Iterator<T> it = attributedText.getAttributes().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((Attribute) next).getName(), str)) {
                    break;
                }
            }
        }
        Attribute attribute = (Attribute) next;
        if (attribute instanceof DeepLinkAttribute) {
            DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) attribute;
            Object bVar = new OK0.b(deepLinkAttribute.getDeepLink(), new a(attributedText), false, 4, null);
            String title = deepLinkAttribute.getTitle();
            editable.replace(i12, string.length() + i12, title);
            editable.setSpan(bVar, i12, title.length() + i12, 0);
            return;
        }
        if (attribute instanceof LinkAttribute) {
            LinkAttribute linkAttribute = (LinkAttribute) attribute;
            Object urlSpan = new UrlSpan(linkAttribute.getUrl(), attributedText.getOnUrlClickListener(), false, 4, null);
            String title2 = linkAttribute.getTitle();
            editable.replace(i12, string.length() + i12, title2);
            editable.setSpan(urlSpan, i12, title2.length() + i12, 0);
            return;
        }
        if ((attribute instanceof BadgeAttribute) || (attribute instanceof ParametersAttribute) || (attribute instanceof UnknownAttribute) || (attribute instanceof SpacerAttribute)) {
            return;
        }
        boolean z12 = attribute instanceof TooltipAttribute;
    }
}
