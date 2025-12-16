package androidx.credentials.exceptions;

import X41.j;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClearCredentialUnknownException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialUnknownException;", "Landroidx/credentials/exceptions/ClearCredentialException;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClearCredentialUnknownException extends ClearCredentialException {

    /* compiled from: ClearCredentialUnknownException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialUnknownException$a;", "", "<init>", "()V", "", "TYPE_CLEAR_CREDENTIAL_UNKNOWN_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public ClearCredentialUnknownException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialUnknownException(CharSequence charSequence, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : charSequence);
    }

    @j
    public ClearCredentialUnknownException(@l CharSequence charSequence) {
        super("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", charSequence);
    }
}
