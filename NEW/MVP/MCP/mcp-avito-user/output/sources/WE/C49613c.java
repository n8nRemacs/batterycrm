package we;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoContactsApiV2_Module_ProvideAutoContactsApiV2Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lwe/c;", "Ldagger/internal/h;", "Lwe/a;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: we.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49613c implements h<InterfaceC49611a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f441720b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f441721a;

    /* compiled from: AutoContactsApiV2_Module_ProvideAutoContactsApiV2Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwe/c$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: we.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49613c(@k f fVar) {
        this.f441721a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f441721a.get();
        f441720b.getClass();
        C49612b.f441719a.getClass();
        InterfaceC49611a interfaceC49611a = (InterfaceC49611a) r02.create(InterfaceC49611a.class);
        t.b(interfaceC49611a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC49611a;
    }
}
