package androidx.credentials;

import R0.b;
import android.os.Bundle;
import androidx.credentials.AbstractC22849b;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CreatePublicKeyCredentialRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/h;", "Landroidx/credentials/b;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22855h extends AbstractC22849b {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f45219h = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f45220g;

    /* compiled from: CreatePublicKeyCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/h$a;", "", "<init>", "()V", "", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.h$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C22855h(String str, byte[] bArr, boolean z12, boolean z13, AbstractC22849b.C1761b c1761b, String str2, Bundle bundle, Bundle bundle2, C42822w c42822w) {
        this(str, z12, z13, c1761b, str2, bundle, bundle2);
    }

    public C22855h(String str, byte[] bArr, boolean z12, boolean z13, AbstractC22849b.C1761b c1761b, String str2, Bundle bundle, Bundle bundle2, int i12, C42822w c42822w) {
        Bundle bundle3;
        Bundle bundle4;
        String str3 = (i12 & 32) != 0 ? null : str2;
        int i13 = i12 & 64;
        a aVar = f45219h;
        if (i13 != 0) {
            aVar.getClass();
            Bundle bundle5 = new Bundle();
            bundle5.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle5.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle5.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            bundle3 = bundle5;
        } else {
            bundle3 = bundle;
        }
        if ((i12 & 128) != 0) {
            aVar.getClass();
            Bundle bundle6 = new Bundle();
            bundle6.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle6.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle6.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            bundle4 = bundle6;
        } else {
            bundle4 = bundle2;
        }
        this(str, z12, z13, c1761b, str3, bundle3, bundle4);
    }

    public C22855h(String str, boolean z12, boolean z13, AbstractC22849b.C1761b c1761b, String str2, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, z12, c1761b, str2, z13);
        this.f45220g = str;
        R0.b.f14050a.getClass();
        if (!b.a.a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C22855h(String str, byte[] bArr, boolean z12, String str2, boolean z13, int i12, C42822w c42822w) throws JSONException {
        String string = null;
        byte[] bArr2 = (i12 & 2) != 0 ? null : bArr;
        boolean z14 = (i12 & 4) != 0 ? false : z12;
        String str3 = (i12 & 8) != 0 ? null : str2;
        boolean z15 = (i12 & 16) != 0 ? false : z13;
        f45219h.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(ChannelContext.UserToUser.TYPE);
            String string2 = jSONObject.getString("name");
            if (!jSONObject.isNull("displayName")) {
                string = jSONObject.getString("displayName");
            }
            this(str, bArr2, z15, z14, new AbstractC22849b.C1761b(string2, string), str3, null, null, 192, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("user.name must be defined in requestJson");
        }
    }
}
