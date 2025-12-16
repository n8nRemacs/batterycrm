package kF0;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"LkF0/i;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "actionUri", "", "LkF0/c;", "descriptionBlocks", "", "planId", "LkF0/h;", "progress", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "termTitle", "title", "type", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/String;LkF0/h;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LkF0/h;", "d", "()LkF0/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "g", "h", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    @com.google.gson.annotations.c("actionUri")
    @Y61.k
    private final DeepLink actionUri;

    @com.google.gson.annotations.c("descriptionBlocks")
    @l
    private final List<c> descriptionBlocks;

    @com.google.gson.annotations.c("planId")
    @Y61.k
    private final String planId;

    @com.google.gson.annotations.c("progress")
    @Y61.k
    private final h progress;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("termTitle")
    @Y61.k
    private final String termTitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final String type;

    public i(@Y61.k DeepLink deepLink, @l List<c> list, @Y61.k String str, @Y61.k h hVar, @l AttributedText attributedText, @Y61.k String str2, @Y61.k AttributedText attributedText2, @Y61.k String str3) {
        this.actionUri = deepLink;
        this.descriptionBlocks = list;
        this.planId = str;
        this.progress = hVar;
        this.subtitle = attributedText;
        this.termTitle = str2;
        this.title = attributedText2;
        this.type = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final DeepLink getActionUri() {
        return this.actionUri;
    }

    @l
    public final List<c> b() {
        return this.descriptionBlocks;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final h getProgress() {
        return this.progress;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTermTitle() {
        return this.termTitle;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
