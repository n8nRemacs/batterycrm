package Pl0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV4Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"LPl0/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "blockAction", "LPl0/b;", "button", "", ServiceTransportationWidget.DisclaimerField.TYPE, "LPl0/j;", "image", "rightIcon", "subtitle", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LPl0/b;Ljava/lang/String;LPl0/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LPl0/b;", "b", "()LPl0/b;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LPl0/j;", "d", "()LPl0/j;", "e", "f", "g", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14803a {

    @com.google.gson.annotations.c("blockAction")
    @l
    private final DeepLink blockAction;

    @com.google.gson.annotations.c("button")
    @l
    private final C14804b button;

    @com.google.gson.annotations.c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final String disclaimer;

    @com.google.gson.annotations.c("image")
    @l
    private final j image;

    @com.google.gson.annotations.c("rightIcon")
    @l
    private final String rightIcon;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C14803a(@l DeepLink deepLink, @l C14804b c14804b, @l String str, @l j jVar, @l String str2, @l String str3, @k String str4) {
        this.blockAction = deepLink;
        this.button = c14804b;
        this.disclaimer = str;
        this.image = jVar;
        this.rightIcon = str2;
        this.subtitle = str3;
        this.title = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getBlockAction() {
        return this.blockAction;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C14804b getButton() {
        return this.button;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final j getImage() {
        return this.image;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
