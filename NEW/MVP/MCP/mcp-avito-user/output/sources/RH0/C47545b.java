package rH0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PortfolioEventTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LrH0/b;", "LrH0/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47545b implements InterfaceC47544a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f429718a;

    /* compiled from: PortfolioEventTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LrH0/b$a;", "", "<init>", "()V", "", "TOGGLE_SAME_VALUE", "Ljava/lang/String;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rH0.b$a */
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
    public C47545b(@k InterfaceC28373a interfaceC28373a) {
        this.f429718a = interfaceC28373a;
    }

    @Override // rH0.InterfaceC47544a
    public final void a(@k String str, @l String str2, @k String str3) {
        if (str2 == null) {
            str2 = "same";
        }
        this.f429718a.c(new C47548e(str, str2, str3));
    }

    @Override // rH0.InterfaceC47544a
    public final void b(@k String str) {
        this.f429718a.c(new C47547d(str));
    }
}
