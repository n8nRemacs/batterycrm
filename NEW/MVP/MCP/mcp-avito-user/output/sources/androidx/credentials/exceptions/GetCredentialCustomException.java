package androidx.credentials.exceptions;

import X41.j;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GetCredentialCustomException.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialCustomException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetCredentialCustomException extends GetCredentialException {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f45206c;

    public /* synthetic */ GetCredentialCustomException(String str, CharSequence charSequence, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : charSequence);
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    @k
    /* renamed from: a, reason: from getter */
    public final String getF45206c() {
        return this.f45206c;
    }

    @j
    public GetCredentialCustomException(@k String str, @l CharSequence charSequence) {
        super(str, charSequence);
        this.f45206c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
