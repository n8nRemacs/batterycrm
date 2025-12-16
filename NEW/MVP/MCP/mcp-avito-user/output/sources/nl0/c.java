package Nl0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsApi_Module_ProvideSparePartsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNl0/c;", "Ldagger/internal/h;", "LNl0/a;", "a", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements h<InterfaceC14587a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11740b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11741a;

    /* compiled from: SparePartsApi_Module_ProvideSparePartsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNl0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f11741a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11741a.get();
        f11740b.getClass();
        b.f11739a.getClass();
        InterfaceC14587a interfaceC14587a = (InterfaceC14587a) r02.create(InterfaceC14587a.class);
        t.b(interfaceC14587a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14587a;
    }
}
