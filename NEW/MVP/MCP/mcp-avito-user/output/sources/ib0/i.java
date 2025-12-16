package iB0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceResult.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LiB0/i;", "LiB0/h;", "", "isSelected", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "advance", "<init>", "(ZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Z", "c", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements h {

    @com.google.gson.annotations.c("advance")
    @k
    private final String advance;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    public i(boolean z12, @k AttributedText attributedText, @k String str) {
        this.isSelected = z12;
        this.description = attributedText;
        this.advance = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAdvance() {
        return this.advance;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
