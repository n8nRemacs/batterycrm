package wo;

import Y61.l;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV9Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwo/i;", "", "Lwo/a;", "button", "", "progress", "<init>", "(Lwo/a;Ljava/lang/Double;)V", "Lwo/a;", "a", "()Lwo/a;", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    @com.google.gson.annotations.c("button")
    @l
    private final C49658a button;

    @com.google.gson.annotations.c("progress")
    @l
    private final Double progress;

    public i(@l C49658a c49658a, @l Double d12) {
        this.button = c49658a;
        this.progress = d12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C49658a getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Double getProgress() {
        return this.progress;
    }
}
