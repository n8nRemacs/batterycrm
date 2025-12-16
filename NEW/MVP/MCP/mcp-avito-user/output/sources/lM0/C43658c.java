package lM0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlannerCheckout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LlM0/c;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "actionTitle", "closeButtonTitle", "price", "offer", "", "LlM0/a;", "list", "emptyActionTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "delayedAction", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "a", "b", "h", "g", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43658c {

    @com.google.gson.annotations.c("actionTitle")
    @k
    private final String actionTitle;

    @com.google.gson.annotations.c("closeButtonTitle")
    @k
    private final String closeButtonTitle;

    @com.google.gson.annotations.c("delayedAction")
    @l
    private final DeepLink delayedAction;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("emptyActionTitle")
    @l
    private final String emptyActionTitle;

    @com.google.gson.annotations.c("list")
    @k
    private final List<InterfaceC43656a> list;

    @com.google.gson.annotations.c("offer")
    @l
    private final AttributedText offer;

    @com.google.gson.annotations.c("price")
    @l
    private final String price;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public C43658c(@k String str, @l AttributedText attributedText, @k String str2, @k String str3, @l String str4, @l AttributedText attributedText2, @k List<? extends InterfaceC43656a> list, @l String str5, @l DeepLink deepLink) {
        this.title = str;
        this.description = attributedText;
        this.actionTitle = str2;
        this.closeButtonTitle = str3;
        this.price = str4;
        this.offer = attributedText2;
        this.list = list;
        this.emptyActionTitle = str5;
        this.delayedAction = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getCloseButtonTitle() {
        return this.closeButtonTitle;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getDelayedAction() {
        return this.delayedAction;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getEmptyActionTitle() {
        return this.emptyActionTitle;
    }

    @k
    public final List<InterfaceC43656a> f() {
        return this.list;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final AttributedText getOffer() {
        return this.offer;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ C43658c(String str, AttributedText attributedText, String str2, String str3, String str4, AttributedText attributedText2, List list, String str5, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, attributedText, str2, str3, str4, attributedText2, list, str5, (i12 & 256) != 0 ? null : deepLink);
    }
}
