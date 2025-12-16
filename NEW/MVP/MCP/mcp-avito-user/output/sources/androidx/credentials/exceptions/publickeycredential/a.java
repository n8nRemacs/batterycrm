package androidx.credentials.exceptions.publickeycredential;

import Q0.e;
import Y61.k;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DomExceptionUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/a;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C1762a f45214a = new C1762a(null);

    /* compiled from: DomExceptionUtils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/a$a;", "", "<init>", "()V", "", "SEPARATOR", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.exceptions.publickeycredential.a$a, reason: collision with other inner class name */
    public static final class C1762a {
        public /* synthetic */ C1762a(C42822w c42822w) {
            this();
        }

        public static final Exception a(C1762a c1762a, e eVar, String str, Exception exc) {
            c1762a.getClass();
            if (exc instanceof CreatePublicKeyCredentialDomException) {
                return new CreatePublicKeyCredentialDomException(eVar, str);
            }
            if (exc instanceof GetPublicKeyCredentialDomException) {
                return new GetPublicKeyCredentialDomException(eVar, str);
            }
            throw new FrameworkClassParsingException();
        }

        public C1762a() {
        }
    }
}
