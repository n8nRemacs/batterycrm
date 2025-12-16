package NA0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiGetVerificationInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LNA0/b;", "", "LNA0/c;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "", "sizeLimit", "<init>", "(LNA0/c;Lcom/avito/android/remote/model/text/AttributedText;J)V", "LNA0/c;", "a", "()LNA0/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "c", "()J", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c("action")
    @k
    private final c action;

    @com.google.gson.annotations.c("content")
    @k
    private final AttributedText content;

    @com.google.gson.annotations.c("sizeLimit")
    private final long sizeLimit;

    public b(@k c cVar, @k AttributedText attributedText, long j12) {
        this.action = cVar;
        this.content = attributedText;
        this.sizeLimit = j12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final c getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getContent() {
        return this.content;
    }

    /* renamed from: c, reason: from getter */
    public final long getSizeLimit() {
        return this.sizeLimit;
    }
}
