package one.me.sdk.transfer.exceptions;

import defpackage.wy1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/transfer/exceptions/UnexpectedResponseBodyException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "transfer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnexpectedResponseBodyException extends RuntimeException {
    public final String a;

    public UnexpectedResponseBodyException(String str) {
        super("Not found token in response");
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return wy1.j("UnexpectedResponseBodyException(msg='", getMessage(), "', response='", this.a, "')");
    }
}
