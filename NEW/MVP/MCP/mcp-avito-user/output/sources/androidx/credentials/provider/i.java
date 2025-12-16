package androidx.credentials.provider;

import android.os.Bundle;
import android.service.credentials.BeginGetCredentialRequest;
import androidx.credentials.provider.utils.e;
import j.InterfaceC42164u;
import j.X;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeginGetCredentialRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/i;", "", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<h> f45259a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final n f45260b;

    /* compiled from: BeginGetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/i$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/i;", "request", "Lkotlin/G0;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/i;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/i;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }

        @X41.n
        @InterfaceC42164u
        public static final void a(@Y61.k Bundle bundle, @Y61.k i request) {
            androidx.credentials.provider.utils.e.f45305a.getClass();
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialRequest", e.a.a(request));
        }

        @X41.n
        @InterfaceC42164u
        @Y61.l
        public static final i b(@Y61.k Bundle bundle) {
            BeginGetCredentialRequest beginGetCredentialRequest = (BeginGetCredentialRequest) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialRequest", BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest == null) {
                return null;
            }
            androidx.credentials.provider.utils.e.f45305a.getClass();
            return e.a.c(beginGetCredentialRequest);
        }
    }

    /* compiled from: BeginGetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/i$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    @X41.j
    public i(@Y61.k List<? extends h> list, @Y61.l n nVar) {
        this.f45259a = list;
        this.f45260b = nVar;
    }

    public /* synthetic */ i(List list, n nVar, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : nVar);
    }
}
