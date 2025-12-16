package com.avito.android.remote.safedeal;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import cn.C27223b;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.safedeal.SafeDeal;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddItemToCartResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/safedeal/a;", "", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Button;", "button", "", "quantity", "Lcom/avito/android/deep_linking/links/DeepLink;", "toastDeeplink", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "bottomSheetContent", "Lcn/b;", "nativeBottomSheetContent", "<init>", "(Lcom/avito/android/remote/safedeal/SafeDeal$Component$Button;ILcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/beduin_models/BeduinUniversalPageContent;Lcn/b;)V", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Button;", "b", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$Button;", "I", "d", "()I", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "a", "()Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "Lcn/b;", "c", "()Lcn/b;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a {

    @c("bottomSheetContent")
    @l
    private final BeduinUniversalPageContent bottomSheetContent;

    @c("button")
    @k
    private final SafeDeal.Component.Button button;

    @c("nativeBottomSheetContent")
    @l
    private final C27223b nativeBottomSheetContent;

    @c("quantity")
    private final int quantity;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink toastDeeplink;

    public a(@k SafeDeal.Component.Button button, int i12, @l DeepLink deepLink, @l BeduinUniversalPageContent beduinUniversalPageContent, @l C27223b c27223b) {
        this.button = button;
        this.quantity = i12;
        this.toastDeeplink = deepLink;
        this.bottomSheetContent = beduinUniversalPageContent;
        this.nativeBottomSheetContent = c27223b;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final BeduinUniversalPageContent getBottomSheetContent() {
        return this.bottomSheetContent;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final SafeDeal.Component.Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C27223b getNativeBottomSheetContent() {
        return this.nativeBottomSheetContent;
    }

    /* renamed from: d, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getToastDeeplink() {
        return this.toastDeeplink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.button, aVar.button) && this.quantity == aVar.quantity && L.f(this.toastDeeplink, aVar.toastDeeplink) && L.f(this.bottomSheetContent, aVar.bottomSheetContent) && L.f(this.nativeBottomSheetContent, aVar.nativeBottomSheetContent);
    }

    public final int hashCode() {
        int iE2 = r.e(this.quantity, this.button.hashCode() * 31, 31);
        DeepLink deepLink = this.toastDeeplink;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        BeduinUniversalPageContent beduinUniversalPageContent = this.bottomSheetContent;
        int iHashCode2 = (iHashCode + (beduinUniversalPageContent == null ? 0 : beduinUniversalPageContent.hashCode())) * 31;
        C27223b c27223b = this.nativeBottomSheetContent;
        return iHashCode2 + (c27223b != null ? c27223b.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AddItemToCartResponse(button=" + this.button + ", quantity=" + this.quantity + ", toastDeeplink=" + this.toastDeeplink + ", bottomSheetContent=" + this.bottomSheetContent + ", nativeBottomSheetContent=" + this.nativeBottomSheetContent + ')';
    }
}
