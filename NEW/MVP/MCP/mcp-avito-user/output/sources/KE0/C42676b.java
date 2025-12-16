package ke0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.server_time.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishIdempotencyKeyHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lke0/b;", "Landroidx/lifecycle/M0;", "Lke0/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ke0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42676b extends M0 implements InterfaceC42675a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final C23060r0 f406522E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final h f406523J;

    /* compiled from: PublishIdempotencyKeyHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lke0/b$a;", "", "<init>", "()V", "", "IDEMPOTENCY_SAVED_KEY", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ke0.b$a */
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

    public C42676b(@k C23060r0 c23060r0, @k h hVar) {
        this.f406522E = c23060r0;
        this.f406523J = hVar;
    }

    @Override // ke0.InterfaceC42675a
    public final int A1() {
        C23060r0 c23060r0 = this.f406522E;
        Integer num = (Integer) c23060r0.b("publish_idempotency_saved_state_key");
        if (num != null) {
            return num.intValue();
        }
        int iNow = (int) this.f406523J.now();
        c23060r0.e(Integer.valueOf(iNow), "publish_idempotency_saved_state_key");
        return iNow;
    }
}
