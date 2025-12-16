package ba;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrBookingNeighboringDatesByItemIdGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lba/b;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lba/c;", "changeParams", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lba/c;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lba/c;", "b", "()Lba/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ba.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C25605b {

    @com.google.gson.annotations.c("attributedText")
    @k
    private final AttributedText attributedText;

    @com.google.gson.annotations.c("changeParams")
    @k
    private final C25606c changeParams;

    public C25605b(@k AttributedText attributedText, @k C25606c c25606c) {
        this.attributedText = attributedText;
        this.changeParams = c25606c;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C25606c getChangeParams() {
        return this.changeParams;
    }
}
