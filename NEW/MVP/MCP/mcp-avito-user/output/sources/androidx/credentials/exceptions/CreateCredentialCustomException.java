package androidx.credentials.exceptions;

import X41.j;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CreateCredentialCustomException.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialCustomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreateCredentialCustomException extends CreateCredentialException {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f45204c;

    public /* synthetic */ CreateCredentialCustomException(String str, CharSequence charSequence, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : charSequence);
    }

    @Override // androidx.credentials.exceptions.CreateCredentialException
    @k
    /* renamed from: a, reason: from getter */
    public final String getF45204c() {
        return this.f45204c;
    }

    @j
    public CreateCredentialCustomException(@k String str, @l CharSequence charSequence) {
        super(str, charSequence);
        this.f45204c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
