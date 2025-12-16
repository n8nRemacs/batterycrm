package androidx.credentials.provider;

import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.CallingAppInfo;
import androidx.credentials.provider.utils.c;
import j.InterfaceC42164u;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeginCreateCredentialRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/c;", "", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.provider.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22866c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f45248a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bundle f45249b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final n f45250c;

    /* compiled from: BeginCreateCredentialRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/c$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/c;", "request", "Lkotlin/G0;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/c;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/c;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.credentials.provider.c$a */
    public static final class a {
        static {
            new a();
        }

        @X41.n
        @InterfaceC42164u
        public static final void a(@Y61.k Bundle bundle, @Y61.k AbstractC22866c request) {
            CallingAppInfo callingAppInfoK;
            androidx.credentials.provider.utils.c.f45299a.getClass();
            n nVar = request.f45250c;
            if (nVar != null) {
                s.B();
                callingAppInfoK = s.k(nVar.f45268a, nVar.f45269b, nVar.f45270c);
            } else {
                callingAppInfoK = null;
            }
            s.C();
            bundle.putParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", s.h(request.f45248a, request.f45249b, callingAppInfoK));
        }

        @X41.n
        @InterfaceC42164u
        @Y61.l
        public static final AbstractC22866c b(@Y61.k Bundle bundle) {
            BeginCreateCredentialRequest beginCreateCredentialRequest = (BeginCreateCredentialRequest) bundle.getParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest == null) {
                return null;
            }
            androidx.credentials.provider.utils.c.f45299a.getClass();
            return c.a.b(beginCreateCredentialRequest);
        }
    }

    /* compiled from: BeginCreateCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/c$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public AbstractC22866c(@Y61.k Bundle bundle, @Y61.l n nVar, @Y61.k String str) {
        this.f45248a = str;
        this.f45249b = bundle;
        this.f45250c = nVar;
    }
}
