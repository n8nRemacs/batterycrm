package PG;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ShowQrv1Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"LPG/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", RequestReviewResultKt.INFO_TYPE, "", "qr", "", "stepInstructions", "Lcom/avito/android/deep_linking/links/DeepLink;", "supportChatDeepLink", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "e", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    @c(RequestReviewResultKt.INFO_TYPE)
    @l
    private final AttributedText info;

    @c("qr")
    @k
    private final String qr;

    @c("stepInstructions")
    @k
    private final List<AttributedText> stepInstructions;

    @c("supportChatDeepLink")
    @k
    private final DeepLink supportChatDeepLink;

    @c("title")
    @k
    private final String title;

    public a(@l AttributedText attributedText, @k String str, @k List<AttributedText> list, @k DeepLink deepLink, @k String str2) {
        this.info = attributedText;
        this.qr = str;
        this.stepInstructions = list;
        this.supportChatDeepLink = deepLink;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getInfo() {
        return this.info;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getQr() {
        return this.qr;
    }

    @k
    public final List<AttributedText> c() {
        return this.stepInstructions;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DeepLink getSupportChatDeepLink() {
        return this.supportChatDeepLink;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
