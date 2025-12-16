package SF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: GetGigWorkerMotivationPayoutResponse.kt */
@P
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b*\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LSF/a;", "", "LSF/b;", "documentsButton", "LSF/j;", "icon", "LSF/c;", "paymentInfo", "LSF/e;", "paymentRequisites", "LSF/h;", "primaryButton", "", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "supportDeeplink", "title", "LSF/i;", "toastInfo", "<init>", "(LSF/b;LSF/j;LSF/c;LSF/e;LSF/h;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;LSF/i;)V", "LSF/b;", "a", "()LSF/b;", "LSF/j;", "b", "()LSF/j;", "LSF/c;", "c", "()LSF/c;", "LSF/e;", "d", "()LSF/e;", "LSF/h;", "e", "()LSF/h;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "h", "LSF/i;", "i", "()LSF/i;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    @com.google.gson.annotations.c("documentsButton")
    @l
    private final b documentsButton;

    @com.google.gson.annotations.c("icon")
    @k
    private final j icon;

    @com.google.gson.annotations.c("paymentInfo")
    @k
    private final c paymentInfo;

    @com.google.gson.annotations.c("paymentRequisites")
    @l
    private final e paymentRequisites;

    @com.google.gson.annotations.c("primaryButton")
    @l
    private final h primaryButton;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("supportDeeplink")
    @k
    private final DeepLink supportDeeplink;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("toastInfo")
    @l
    private final i toastInfo;

    public a(@l b bVar, @k j jVar, @k c cVar, @l e eVar, @l h hVar, @k String str, @k DeepLink deepLink, @k String str2, @l i iVar) {
        this.documentsButton = bVar;
        this.icon = jVar;
        this.paymentInfo = cVar;
        this.paymentRequisites = eVar;
        this.primaryButton = hVar;
        this.subtitle = str;
        this.supportDeeplink = deepLink;
        this.title = str2;
        this.toastInfo = iVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final b getDocumentsButton() {
        return this.documentsButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final j getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final c getPaymentInfo() {
        return this.paymentInfo;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final e getPaymentRequisites() {
        return this.paymentRequisites;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final h getPrimaryButton() {
        return this.primaryButton;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final DeepLink getSupportDeeplink() {
        return this.supportDeeplink;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final i getToastInfo() {
        return this.toastInfo;
    }
}
