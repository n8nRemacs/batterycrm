package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.AbstractC22849b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CreatePasswordRequest.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/f;", "Landroidx/credentials/b;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22853f extends AbstractC22849b {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f45215i = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f45216g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f45217h;

    /* compiled from: CreatePasswordRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/credentials/f$a;", "", "<init>", "()V", "", "BUNDLE_KEY_ID", "Ljava/lang/String;", "BUNDLE_KEY_PASSWORD", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C22853f(String str, String str2, boolean z12, AbstractC22849b.C1761b c1761b, String str3, boolean z13, Bundle bundle, Bundle bundle2, C42822w c42822w) {
        this(str, str2, z12, c1761b, str3, z13, bundle, bundle2);
    }

    public C22853f(String str, String str2, boolean z12, AbstractC22849b.C1761b c1761b, String str3, boolean z13, Bundle bundle, Bundle bundle2, int i12, C42822w c42822w) {
        Bundle bundle3;
        Bundle bundle4;
        String str4 = (i12 & 16) != 0 ? null : str3;
        int i13 = i12 & 64;
        a aVar = f45215i;
        if (i13 != 0) {
            aVar.getClass();
            Bundle bundle5 = new Bundle();
            bundle5.putString("androidx.credentials.BUNDLE_KEY_ID", str);
            bundle5.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
            bundle3 = bundle5;
        } else {
            bundle3 = bundle;
        }
        if ((i12 & 128) != 0) {
            aVar.getClass();
            bundle4 = new Bundle();
        } else {
            bundle4 = bundle2;
        }
        this(str, str2, z12, c1761b, str4, z13, bundle3, bundle4);
    }

    public C22853f(String str, String str2, boolean z12, AbstractC22849b.C1761b c1761b, String str3, boolean z13, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z12, c1761b, str3, z13);
        this.f45216g = str;
        this.f45217h = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public C22853f(String str, String str2, String str3, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 16) != 0 ? false : z13, new AbstractC22849b.C1761b(str, null), (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? false : z12, null, null, 192, null);
    }
}
