package androidx.credentials.provider;

import android.os.Bundle;
import android.service.credentials.BeginGetCredentialResponse;
import androidx.credentials.provider.utils.e;
import j.InterfaceC42164u;
import j.X;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeginGetCredentialResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/j;", "", "a", "b", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<q> f45261a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<C22864a> f45262b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<C22865b> f45263c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final D f45264d;

    /* compiled from: BeginGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/j$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/j;", "response", "Lkotlin/G0;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/j;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/j;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }

        @X41.n
        @InterfaceC42164u
        public static final void a(@Y61.k Bundle bundle, @Y61.k j response) {
            androidx.credentials.provider.utils.e.f45305a.getClass();
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialResponse", e.a.b(response));
        }

        @X41.n
        @InterfaceC42164u
        @Y61.l
        public static final j b(@Y61.k Bundle bundle) {
            BeginGetCredentialResponse beginGetCredentialResponse = (BeginGetCredentialResponse) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialResponse", BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse == null) {
                return null;
            }
            androidx.credentials.provider.utils.e.f45305a.getClass();
            return e.a.d(beginGetCredentialResponse);
        }
    }

    /* compiled from: BeginGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/j$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public b() {
            new ArrayList();
            new ArrayList();
            new ArrayList();
        }
    }

    /* compiled from: BeginGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/j$c;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public j() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k List<? extends q> list, @Y61.k List<C22864a> list2, @Y61.k List<C22865b> list3, @Y61.l D d12) {
        this.f45261a = list;
        this.f45262b = list2;
        this.f45263c = list3;
        this.f45264d = d12;
    }

    public j(List list, List list2, List list3, D d12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? C42784z0.f406748b : list3, (i12 & 8) != 0 ? null : d12);
    }
}
