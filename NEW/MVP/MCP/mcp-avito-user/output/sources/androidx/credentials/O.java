package androidx.credentials;

import R0.b;
import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: GetPublicKeyCredentialOption.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/O;", "Landroidx/credentials/x;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O extends AbstractC22874x {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f45184i = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f45185h;

    /* compiled from: GetPublicKeyCredentialOption.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/O$a;", "", "<init>", "()V", "", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @X41.j
    public O() {
        throw null;
    }

    public /* synthetic */ O(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i12, C42822w c42822w) {
        this(str, set, bundle, bundle2, i12);
    }

    public O(String str, byte[] bArr, Set set, int i12, C42822w c42822w) {
        byte[] bArr2 = (i12 & 2) != 0 ? null : bArr;
        set = (i12 & 4) != 0 ? B0.f406639b : set;
        f45184i.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr2);
        this(str, bArr2, set, bundle, bundle2, 0, 32, null);
    }

    public /* synthetic */ O(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i12, int i13, C42822w c42822w) {
        this(str, set, bundle, bundle2, (i13 & 32) != 0 ? 100 : i12);
    }

    public O(String str, Set set, Bundle bundle, Bundle bundle2, int i12) {
        super(i12, bundle, bundle2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", set, false, true);
        this.f45185h = str;
        R0.b.f14050a.getClass();
        if (!b.a.a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }
}
