package androidx.credentials.provider;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.C;
import androidx.credentials.provider.u;
import androidx.credentials.provider.w;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CredentialEntry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/q;", "", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f45279f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f45280a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f45281b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CharSequence f45282c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final CharSequence f45284e;

    /* compiled from: CredentialEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/q$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: CredentialEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/q$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X
        @X41.n
        @Y61.l
        @RestrictTo
        public static q a(@Y61.k Slice slice) {
            try {
                SliceSpec spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                if (L.f(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    w.f45318q.getClass();
                    if (Build.VERSION.SDK_INT >= 28) {
                        return w.a.a(slice);
                    }
                    return null;
                }
                if (L.f(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    C.f45228q.getClass();
                    if (Build.VERSION.SDK_INT >= 28) {
                        return C.a.a(slice);
                    }
                    return null;
                }
                u.f45285r.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    return u.a.a(slice);
                }
                return null;
            } catch (Exception unused) {
                u.f45285r.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    return u.a.a(slice);
                }
                return null;
            }
        }

        @X41.n
        @Y61.l
        @X
        public static Slice b(@Y61.k q qVar) {
            if (qVar instanceof w) {
                w wVar = (w) qVar;
                w.f45318q.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    return w.a.b(wVar);
                }
                return null;
            }
            if (qVar instanceof C) {
                C c12 = (C) qVar;
                C.f45228q.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    return C.a.b(c12);
                }
                return null;
            }
            if (!(qVar instanceof u)) {
                return null;
            }
            u uVar = (u) qVar;
            u.f45285r.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                return u.a.b(uVar);
            }
            return null;
        }

        public b() {
        }
    }

    public q(@Y61.k String str, @Y61.k h hVar, @Y61.k CharSequence charSequence, boolean z12, @Y61.l CharSequence charSequence2) {
        this.f45280a = str;
        this.f45281b = hVar;
        this.f45282c = charSequence;
        this.f45283d = z12;
        this.f45284e = charSequence2;
    }

    @Y61.k
    @RestrictTo
    /* renamed from: a, reason: from getter */
    public String getF45280a() {
        return this.f45280a;
    }

    public /* synthetic */ q(String str, h hVar, CharSequence charSequence, boolean z12, CharSequence charSequence2, int i12, C42822w c42822w) {
        this(str, hVar, charSequence, z12, (i12 & 16) != 0 ? null : charSequence2);
    }
}
