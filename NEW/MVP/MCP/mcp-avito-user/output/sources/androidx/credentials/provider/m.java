package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: BeginGetPublicKeyCredentialOption.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/m;", "Landroidx/credentials/provider/h;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m extends h {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f45267e = new a(null);

    /* compiled from: BeginGetPublicKeyCredentialOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/m$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ m(Bundle bundle, String str, String str2, byte[] bArr, int i12, C42822w c42822w) {
        this(str, str2, bundle);
    }

    @X41.j
    public m(@Y61.k String str, @Y61.k String str2, @Y61.k Bundle bundle) {
        super(str, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        androidx.credentials.provider.utils.i.f45317a.getClass();
        if (str2.length() != 0) {
            try {
                new JSONObject(str2);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
