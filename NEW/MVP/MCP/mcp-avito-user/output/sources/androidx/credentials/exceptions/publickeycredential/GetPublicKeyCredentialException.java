package androidx.credentials.exceptions.publickeycredential;

import X41.j;
import Y61.k;
import Y61.l;
import androidx.annotation.RestrictTo;
import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GetPublicKeyCredentialException.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class GetPublicKeyCredentialException extends GetCredentialException {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f45212d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f45213c;

    /* compiled from: GetPublicKeyCredentialException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ GetPublicKeyCredentialException(String str, CharSequence charSequence, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : charSequence);
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    @k
    @RestrictTo
    /* renamed from: a, reason: from getter */
    public final String getF45213c() {
        return this.f45213c;
    }

    @j
    public GetPublicKeyCredentialException(@k String str, @l CharSequence charSequence) {
        super(str, charSequence);
        this.f45213c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
