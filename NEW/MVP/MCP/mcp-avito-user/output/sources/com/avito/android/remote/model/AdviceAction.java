package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Advices.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/AdviceAction;", "", "buttonText", "", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getButtonText", "()Ljava/lang/String;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdviceAction {

    @c("buttonText")
    @k
    private final String buttonText;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    public AdviceAction(@k String str, @k DeepLink deepLink) {
        this.buttonText = str;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ AdviceAction copy$default(AdviceAction adviceAction, String str, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = adviceAction.buttonText;
        }
        if ((i12 & 2) != 0) {
            deepLink = adviceAction.deepLink;
        }
        return adviceAction.copy(str, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final AdviceAction copy(@k String buttonText, @k DeepLink deepLink) {
        return new AdviceAction(buttonText, deepLink);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdviceAction)) {
            return false;
        }
        AdviceAction adviceAction = (AdviceAction) other;
        return L.f(this.buttonText, adviceAction.buttonText) && L.f(this.deepLink, adviceAction.deepLink);
    }

    @k
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public int hashCode() {
        return this.deepLink.hashCode() + (this.buttonText.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdviceAction(buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }
}
