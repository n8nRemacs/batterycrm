package fL;

import Y61.k;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import cL.InterfaceC27060a;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacCallActivityRouter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LfL/b;", "LfL/a;", "a", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40308b implements InterfaceC40307a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ActivityC22955m f395838a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27060a f395839b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OK.b f395840c;

    /* compiled from: IacCallActivityRouter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LfL/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fL.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C40308b(@k ActivityC22955m activityC22955m, @k InterfaceC27060a interfaceC27060a, @k OK.b bVar) {
        this.f395838a = activityC22955m;
        this.f395839b = interfaceC27060a;
        this.f395840c = bVar;
    }

    public final void a(Fragment fragment) {
        H hE2 = this.f395838a.getSupportFragmentManager().e();
        hE2.n(R.id.calls_root, fragment, null);
        hE2.e();
    }
}
