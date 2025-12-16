package androidx.credentials.provider;

import android.content.pm.SigningInfo;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CallingAppInfo.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/n;", "", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f45268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SigningInfo f45269b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f45270c;

    /* compiled from: CallingAppInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/provider/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CallingAppInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/n$b;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class b {
    }

    static {
        new a(null);
    }

    @X41.j
    public n(@Y61.k String str, @Y61.k SigningInfo signingInfo, @Y61.l String str2) {
        this.f45268a = str;
        this.f45269b = signingInfo;
        this.f45270c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }

    public /* synthetic */ n(String str, SigningInfo signingInfo, String str2, int i12, C42822w c42822w) {
        this(str, signingInfo, (i12 & 4) != 0 ? null : str2);
    }
}
