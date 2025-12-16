package om0;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RemoteDeviceIdProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lom0/e;", "Lom0/d;", "a", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC44824d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f420171a;

    /* compiled from: RemoteDeviceIdProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lom0/e$a;", "", "<init>", "()V", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public e(@k l lVar) {
        this.f420171a = lVar;
    }

    @Override // om0.InterfaceC44824d
    @Y61.l
    public final String a() {
        return this.f420171a.getString("remote_device_id");
    }

    @Override // om0.InterfaceC44824d
    public final void b(@k String str) {
        this.f420171a.putString("remote_device_id", str);
    }
}
