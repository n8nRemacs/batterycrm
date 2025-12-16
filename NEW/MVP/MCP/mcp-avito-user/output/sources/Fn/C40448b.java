package fn;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1DiscountDeliveryStatusGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfn/b;", "", "Lfn/c;", "progressBar", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lfn/c;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lfn/c;", "a", "()Lfn/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40448b {

    @com.google.gson.annotations.c("progressBar")
    @k
    private final C40449c progressBar;

    @com.google.gson.annotations.c("text")
    @k
    private final AttributedText text;

    public C40448b(@k C40449c c40449c, @k AttributedText attributedText) {
        this.progressBar = c40449c;
        this.text = attributedText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C40449c getProgressBar() {
        return this.progressBar;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
