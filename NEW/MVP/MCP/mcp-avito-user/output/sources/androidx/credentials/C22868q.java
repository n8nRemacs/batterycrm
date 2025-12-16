package androidx.credentials;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: CredentialManager.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/credentials/q;", "Landroidx/credentials/v;", "Landroidx/credentials/L;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22868q implements InterfaceC22872v<L, GetCredentialException> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f45329a;

    public C22868q(kotlinx.coroutines.r rVar) {
        this.f45329a = rVar;
    }

    @Override // androidx.credentials.InterfaceC22872v
    public final void a(GetCredentialException getCredentialException) {
        GetCredentialException getCredentialException2 = getCredentialException;
        kotlinx.coroutines.r rVar = this.f45329a;
        if (rVar.isActive()) {
            int i12 = Z.f406624c;
            rVar.resumeWith(new Z.b(getCredentialException2));
        }
    }

    @Override // androidx.credentials.InterfaceC22872v
    public final void onResult(L l12) {
        L l13 = l12;
        kotlinx.coroutines.r rVar = this.f45329a;
        if (rVar.isActive()) {
            int i12 = Z.f406624c;
            rVar.resumeWith(l13);
        }
    }
}
