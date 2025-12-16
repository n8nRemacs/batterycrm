package AP0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: WalletPinBiometry.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LAP0/a;", "", "LAP0/b;", "prompt", "LAP0/c;", "success", "defaultError", "limitExceededError", "<init>", "(LAP0/b;LAP0/c;LAP0/c;LAP0/c;)V", "LAP0/b;", "c", "()LAP0/b;", "LAP0/c;", "d", "()LAP0/c;", "a", "b", "_avito_wallet-biometry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("default_error")
    @l
    private final c defaultError;

    @com.google.gson.annotations.c("limit_exceeded_error")
    @l
    private final c limitExceededError;

    @com.google.gson.annotations.c("prompt")
    @l
    private final b prompt;

    @com.google.gson.annotations.c("success")
    @l
    private final c success;

    public a(@l b bVar, @l c cVar, @l c cVar2, @l c cVar3) {
        this.prompt = bVar;
        this.success = cVar;
        this.defaultError = cVar2;
        this.limitExceededError = cVar3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final c getDefaultError() {
        return this.defaultError;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final c getLimitExceededError() {
        return this.limitExceededError;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final b getPrompt() {
        return this.prompt;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final c getSuccess() {
        return this.success;
    }

    public final boolean e() {
        b bVar = this.prompt;
        if (!(bVar != null ? bVar.e() : false)) {
            return false;
        }
        c cVar = this.defaultError;
        return cVar != null ? cVar.d() : false;
    }
}
