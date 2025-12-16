package com.avito.android.remote.model.text;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AttributedTextCreator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/text/AttributedTextCreatorImpl;", "Lcom/avito/android/remote/model/text/AttributedTextCreator;", "()V", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/remote/model/text/AttributedText;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkText", "", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttributedTextCreatorImpl implements AttributedTextCreator {
    @Inject
    public AttributedTextCreatorImpl() {
    }

    @Override // com.avito.android.remote.model.text.AttributedTextCreator
    @k
    public AttributedText from(@k DeepLink deepLink, @k String deepLinkText) {
        return new AttributedText("{{attr}}", Collections.singletonList(new DeepLinkAttribute("attr", deepLinkText, deepLink, null, null, null, 56, null)), 0, 4, null);
    }
}
