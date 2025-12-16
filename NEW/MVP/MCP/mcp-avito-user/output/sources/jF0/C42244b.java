package jF0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"LjF0/b;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "actionUri", "", "LjF0/d;", "descriptionBlocks", "", "planId", "LjF0/g;", "progress", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "termTitle", "title", "type", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/String;LjF0/g;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getActionUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getDescriptionBlocks", "()Ljava/util/List;", "Ljava/lang/String;", "getPlanId", "()Ljava/lang/String;", "LjF0/g;", "getProgress", "()LjF0/g;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTermTitle", "getTitle", "getType", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jF0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42244b {

    @com.google.gson.annotations.c("actionUri")
    @k
    private final DeepLink actionUri;

    @com.google.gson.annotations.c("descriptionBlocks")
    @l
    private final List<C42246d> descriptionBlocks;

    @com.google.gson.annotations.c("planId")
    @k
    private final String planId;

    @com.google.gson.annotations.c("progress")
    @k
    private final C42249g progress;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("termTitle")
    @k
    private final String termTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    public C42244b(@k DeepLink deepLink, @l List<C42246d> list, @k String str, @k C42249g c42249g, @l AttributedText attributedText, @k String str2, @k AttributedText attributedText2, @k String str3) {
        this.actionUri = deepLink;
        this.descriptionBlocks = list;
        this.planId = str;
        this.progress = c42249g;
        this.subtitle = attributedText;
        this.termTitle = str2;
        this.title = attributedText2;
        this.type = str3;
    }
}
