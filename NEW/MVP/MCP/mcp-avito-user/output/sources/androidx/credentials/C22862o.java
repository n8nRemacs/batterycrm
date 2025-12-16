package androidx.credentials;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: CredentialManager.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/credentials/o;", "Landroidx/credentials/v;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22862o implements InterfaceC22872v<AbstractC22850c, CreateCredentialException> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f45226a;

    public C22862o(kotlinx.coroutines.r rVar) {
        this.f45226a = rVar;
    }

    @Override // androidx.credentials.InterfaceC22872v
    public final void a(CreateCredentialException createCredentialException) {
        CreateCredentialException createCredentialException2 = createCredentialException;
        kotlinx.coroutines.r rVar = this.f45226a;
        if (rVar.isActive()) {
            int i12 = Z.f406624c;
            rVar.resumeWith(new Z.b(createCredentialException2));
        }
    }

    @Override // androidx.credentials.InterfaceC22872v
    public final void onResult(AbstractC22850c abstractC22850c) {
        AbstractC22850c abstractC22850c2 = abstractC22850c;
        kotlinx.coroutines.r rVar = this.f45226a;
        if (rVar.isActive()) {
            int i12 = Z.f406624c;
            rVar.resumeWith(abstractC22850c2);
        }
    }
}
