package LG;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LLG/n;", "", "LLG/q;", "primaryButton", "secondaryButton", "<init>", "(LLG/q;LLG/q;)V", "LLG/q;", "a", "()LLG/q;", "b", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {

    @com.google.gson.annotations.c("primaryButton")
    @Y61.l
    private final q primaryButton;

    @com.google.gson.annotations.c("secondaryButton")
    @Y61.l
    private final q secondaryButton;

    public n(@Y61.l q qVar, @Y61.l q qVar2) {
        this.primaryButton = qVar;
        this.secondaryButton = qVar2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final q getPrimaryButton() {
        return this.primaryButton;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final q getSecondaryButton() {
        return this.secondaryButton;
    }
}
