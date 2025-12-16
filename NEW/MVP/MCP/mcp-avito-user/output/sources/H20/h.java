package h20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetClientFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh20/h;", "", "", "acceptButton", "Lh20/d;", "agentBlock", "Lh20/e;", "clientBlock", "screenTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/lang/String;Lh20/d;Lh20/e;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lh20/d;", "b", "()Lh20/d;", "Lh20/e;", "c", "()Lh20/e;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h {

    @com.google.gson.annotations.c("acceptButton")
    @k
    private final String acceptButton;

    @com.google.gson.annotations.c("agentBlock")
    @k
    private final d agentBlock;

    @com.google.gson.annotations.c("clientBlock")
    @k
    private final e clientBlock;

    @com.google.gson.annotations.c("screenTitle")
    @k
    private final String screenTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public h(@k String str, @k d dVar, @k e eVar, @k String str2, @k AttributedText attributedText) {
        this.acceptButton = str;
        this.agentBlock = dVar;
        this.clientBlock = eVar;
        this.screenTitle = str2;
        this.title = attributedText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAcceptButton() {
        return this.acceptButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final d getAgentBlock() {
        return this.agentBlock;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final e getClientBlock() {
        return this.clientBlock;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
