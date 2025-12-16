package androidx.credentials.exceptions.publickeycredential;

import Q0.A;
import Q0.B;
import Q0.C;
import Q0.C14863a;
import Q0.C14864b;
import Q0.C14865c;
import Q0.C14866d;
import Q0.D;
import Q0.e;
import Q0.f;
import Q0.g;
import Q0.h;
import Q0.i;
import Q0.j;
import Q0.m;
import Q0.o;
import Q0.p;
import Q0.q;
import Q0.r;
import Q0.s;
import Q0.t;
import Q0.u;
import Q0.v;
import Q0.w;
import Q0.x;
import Q0.y;
import Q0.z;
import X41.n;
import Y61.k;
import Y61.l;
import androidx.annotation.RestrictTo;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.a;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GetPublicKeyCredentialDomException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f45211e = new a(null);

    /* compiled from: GetPublicKeyCredentialDomException.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException$a;", "", "<init>", "()V", "", "TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @n
        @k
        @RestrictTo
        public static GetCredentialException a(@k String str, @l String str2) throws FrameworkClassParsingException {
            Exception excA;
            try {
                a.C1762a c1762a = androidx.credentials.exceptions.publickeycredential.a.f45214a;
                GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new B(), null, 2, 0 == true ? 1 : 0);
                if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    excA = a.C1762a.a(c1762a, new C14863a(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                    excA = a.C1762a.a(c1762a, new C14864b(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                    excA = a.C1762a.a(c1762a, new C14865c(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                    excA = a.C1762a.a(c1762a, new C14866d(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                    excA = a.C1762a.a(c1762a, new f(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                    excA = a.C1762a.a(c1762a, new g(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                    excA = a.C1762a.a(c1762a, new h(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                    excA = a.C1762a.a(c1762a, new i(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                    excA = a.C1762a.a(c1762a, new j(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                    excA = a.C1762a.a(c1762a, new Q0.k(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                    excA = a.C1762a.a(c1762a, new Q0.l(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                    excA = a.C1762a.a(c1762a, new m(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                    excA = a.C1762a.a(c1762a, new Q0.n(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                    excA = a.C1762a.a(c1762a, new o(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                    excA = a.C1762a.a(c1762a, new p(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                    excA = a.C1762a.a(c1762a, new q(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                    excA = a.C1762a.a(c1762a, new r(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                    excA = a.C1762a.a(c1762a, new s(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                    excA = a.C1762a.a(c1762a, new t(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                    excA = a.C1762a.a(c1762a, new u(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                    excA = a.C1762a.a(c1762a, new v(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                    excA = a.C1762a.a(c1762a, new w(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                    excA = a.C1762a.a(c1762a, new x(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                    excA = a.C1762a.a(c1762a, new y(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                    excA = a.C1762a.a(c1762a, new z(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                    excA = a.C1762a.a(c1762a, new A(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                    excA = a.C1762a.a(c1762a, new B(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                    excA = a.C1762a.a(c1762a, new C(), str2, getPublicKeyCredentialDomException);
                } else {
                    if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                        throw new FrameworkClassParsingException();
                    }
                    excA = a.C1762a.a(c1762a, new D(), str2, getPublicKeyCredentialDomException);
                }
                return (GetCredentialException) excA;
            } catch (FrameworkClassParsingException unused) {
                return new GetCredentialCustomException(str, str2);
            }
        }

        public a() {
        }
    }

    public /* synthetic */ GetPublicKeyCredentialDomException(e eVar, CharSequence charSequence, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : charSequence);
    }

    @X41.j
    public GetPublicKeyCredentialDomException(@k e eVar, @l CharSequence charSequence) {
        super("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + eVar.f13395a, charSequence);
    }
}
