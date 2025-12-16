package g40;

import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiOauthCheckResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lg40/a;", "", "", "hasAccess", "success", "<init>", "(ZZ)V", "Z", "a", "()Z", "getSuccess", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40529a {

    @c("hasAccess")
    private final boolean hasAccess;

    @c("success")
    private final boolean success;

    public C40529a(boolean z12, boolean z13) {
        this.hasAccess = z12;
        this.success = z13;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getHasAccess() {
        return this.hasAccess;
    }
}
