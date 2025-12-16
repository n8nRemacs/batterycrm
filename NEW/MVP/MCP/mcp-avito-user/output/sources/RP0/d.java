package rP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: WalletPinVerificationContentResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LrP0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "a", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c("subtitle")
    @l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final AttributedText title;

    public d(@l AttributedText attributedText, @l AttributedText attributedText2) {
        this.title = attributedText;
        this.subtitle = attributedText2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
