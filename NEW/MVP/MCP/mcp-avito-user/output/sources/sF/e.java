package SF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetGigWorkerMotivationPayoutResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LSF/e;", "", "LSF/f;", "actionButton", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LSF/g;", "requisite", "<init>", "(LSF/f;Lcom/avito/android/remote/model/text/AttributedText;LSF/g;)V", "LSF/f;", "a", "()LSF/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "LSF/g;", "c", "()LSF/g;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    @com.google.gson.annotations.c("actionButton")
    @k
    private final f actionButton;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("requisite")
    @l
    private final g requisite;

    public e(@k f fVar, @k AttributedText attributedText, @l g gVar) {
        this.actionButton = fVar;
        this.description = attributedText;
        this.requisite = gVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final f getActionButton() {
        return this.actionButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final g getRequisite() {
        return this.requisite;
    }
}
