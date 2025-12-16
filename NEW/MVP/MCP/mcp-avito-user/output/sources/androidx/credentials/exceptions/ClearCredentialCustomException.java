package androidx.credentials.exceptions;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ClearCredentialCustomException.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialCustomException;", "Landroidx/credentials/exceptions/ClearCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClearCredentialCustomException extends ClearCredentialException {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f45202c;

    public ClearCredentialCustomException(String str, CharSequence charSequence, int i12, C42822w c42822w) {
        super(str, (i12 & 2) != 0 ? null : charSequence);
        this.f45202c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // androidx.credentials.exceptions.ClearCredentialException
    @k
    /* renamed from: a, reason: from getter */
    public final String getF45202c() {
        return this.f45202c;
    }
}
