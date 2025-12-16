package t80;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PickerApi_Module_ProvidePickerApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lt80/c;", "Ldagger/internal/h;", "Lt80/a;", "a", "_avito-discouraged_avito-api_photo-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<InterfaceC48515a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439158b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f439159a;

    /* compiled from: PickerApi_Module_ProvidePickerApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt80/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_photo-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f439159a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439159a.get();
        f439158b.getClass();
        C48516b.f439157a.getClass();
        InterfaceC48515a interfaceC48515a = (InterfaceC48515a) r02.create(InterfaceC48515a.class);
        t.b(interfaceC48515a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC48515a;
    }
}
