package androidx.credentials.provider;

import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import androidx.credentials.provider.utils.c;
import j.InterfaceC42164u;
import j.X;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeginCreateCredentialResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/d;", "", "a", "b", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.provider.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22867d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<p> f45251a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final D f45252b;

    /* compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/d$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/d;", "response", "Lkotlin/G0;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/d;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/d;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.credentials.provider.d$a */
    public static final class a {
        static {
            new a();
        }

        @X41.n
        @InterfaceC42164u
        public static final void a(@Y61.k Bundle bundle, @Y61.k C22867d response) {
            androidx.credentials.provider.utils.c.f45299a.getClass();
            bundle.putParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", c.a.a(response));
        }

        @X41.n
        @InterfaceC42164u
        @Y61.l
        public static final C22867d b(@Y61.k Bundle bundle) {
            BeginCreateCredentialResponse beginCreateCredentialResponse = (BeginCreateCredentialResponse) bundle.getParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", BeginCreateCredentialResponse.class);
            if (beginCreateCredentialResponse == null) {
                return null;
            }
            androidx.credentials.provider.utils.c.f45299a.getClass();
            return c.a.c(beginCreateCredentialResponse);
        }
    }

    /* compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/d$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.d$b */
    public static final class b {
        public b() {
            new ArrayList();
        }
    }

    /* compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/d$c;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.d$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new c(null);
    }

    public C22867d() {
        this(null, null, 3, null);
    }

    public C22867d(@Y61.k List<p> list, @Y61.l D d12) {
        this.f45251a = list;
        this.f45252b = d12;
    }

    public C22867d(List list, D d12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : d12);
    }
}
