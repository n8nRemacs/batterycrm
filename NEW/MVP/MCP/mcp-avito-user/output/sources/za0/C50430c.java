package zA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SxAddressVideoVerificationAnalyticsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LzA0/c;", "LzA0/b;", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50430c implements InterfaceC50429b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f443935a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.a f443936b;

    /* compiled from: SxAddressVideoVerificationAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LzA0/c$a;", "", "<init>", "()V", "", "IN_PROGRESS_TYPE", "Ljava/lang/String;", "REJECTED_TYPE", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zA0.c$a */
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
    public C50430c(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.a aVar) {
        this.f443935a = interfaceC28373a;
        this.f443936b = aVar;
    }

    @Override // zA0.InterfaceC50429b
    public final void a(long j12) {
        this.f443935a.c(new g(this.f443936b.a(), j12));
    }

    @Override // zA0.InterfaceC50429b
    public final void b(@l String str, boolean z12, long j12) {
        this.f443935a.c(new f(j12, z12, this.f443936b.a(), str));
    }

    @Override // zA0.InterfaceC50429b
    public final void c(long j12, @l String str, @l String str2) {
        this.f443935a.c(new e(this.f443936b.a(), j12, L.f(str, "INPROGRESS") ? "inProgress" : L.f(str, "REJECTED") ? "rejected" : "", str2));
    }

    @Override // zA0.InterfaceC50429b
    public final void d(@l Long l12, @k String str, @l String str2) {
        String str3;
        if (str.equals("INPROGRESS")) {
            str3 = "inProgress";
        } else if (!str.equals("REJECTED")) {
            return;
        } else {
            str3 = "rejected";
        }
        this.f443935a.c(new C50428a(l12, this.f443936b.a(), str3, str2));
    }

    @Override // zA0.InterfaceC50429b
    public final void e(long j12) {
        this.f443935a.c(new h(this.f443936b.a(), j12));
    }
}
