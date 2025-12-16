package androidx.credentials;

import R0.b;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublicKeyCredential.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/W;", "Landroidx/credentials/j;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W extends AbstractC22857j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f45192b = new a(null);

    /* compiled from: PublicKeyCredential.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/W$a;", "", "<init>", "()V", "", "BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", "Ljava/lang/String;", "BUNDLE_KEY_SUBTYPE", "TYPE_PUBLIC_KEY_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ W(String str, Bundle bundle, C42822w c42822w) {
        this(str);
    }

    public W(String str) {
        R0.b.f14050a.getClass();
        if (!b.a.a(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
