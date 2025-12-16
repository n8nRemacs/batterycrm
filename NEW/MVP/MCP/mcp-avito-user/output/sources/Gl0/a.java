package GL0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Description.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LGL0/a;", "", "", "changesCount", "Lcom/avito/android/remote/model/text/AttributedText;", "message", "<init>", "(ILcom/avito/android/remote/model/text/AttributedText;)V", "I", "a", "()I", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("changesCount")
    private final int changesCount;

    @com.google.gson.annotations.c("message")
    @k
    private final AttributedText message;

    public a(int i12, @k AttributedText attributedText) {
        this.changesCount = i12;
        this.message = attributedText;
    }

    /* renamed from: a, reason: from getter */
    public final int getChangesCount() {
        return this.changesCount;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getMessage() {
        return this.message;
    }
}
