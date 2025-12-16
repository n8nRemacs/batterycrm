package RX;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1MandatoryVerificationPostResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LRX/b;", "", "LRX/a;", "accountVerification", "LRX/e;", "benefits", "Lcom/avito/android/remote/model/text/AttributedText;", "bottomText", "LRX/g;", "header", "", "itemId", "LRX/i;", "objectVerification", "LRX/f;", "proceedButton", "<init>", "(LRX/a;LRX/e;Lcom/avito/android/remote/model/text/AttributedText;LRX/g;JLRX/i;LRX/f;)V", "LRX/a;", "a", "()LRX/a;", "LRX/e;", "b", "()LRX/e;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LRX/g;", "d", "()LRX/g;", "J", "e", "()J", "LRX/i;", "f", "()LRX/i;", "LRX/f;", "g", "()LRX/f;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    @com.google.gson.annotations.c("accountVerification")
    @k
    private final a accountVerification;

    @com.google.gson.annotations.c("benefits")
    @k
    private final e benefits;

    @com.google.gson.annotations.c("bottomText")
    @l
    private final AttributedText bottomText;

    @com.google.gson.annotations.c("header")
    @k
    private final g header;

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    @com.google.gson.annotations.c("objectVerification")
    @k
    private final i objectVerification;

    @com.google.gson.annotations.c("proceedButton")
    @k
    private final f proceedButton;

    public b(@k a aVar, @k e eVar, @l AttributedText attributedText, @k g gVar, long j12, @k i iVar, @k f fVar) {
        this.accountVerification = aVar;
        this.benefits = eVar;
        this.bottomText = attributedText;
        this.header = gVar;
        this.itemId = j12;
        this.objectVerification = iVar;
        this.proceedButton = fVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final a getAccountVerification() {
        return this.accountVerification;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final e getBenefits() {
        return this.benefits;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getBottomText() {
        return this.bottomText;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final g getHeader() {
        return this.header;
    }

    /* renamed from: e, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final i getObjectVerification() {
        return this.objectVerification;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final f getProceedButton() {
        return this.proceedButton;
    }
}
