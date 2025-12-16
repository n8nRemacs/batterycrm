package om;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CampaignsSaleApi_Module_ProvideCampaignsSaleApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lom/c;", "Ldagger/internal/h;", "Lom/a;", "a", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: om.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44820c implements h<InterfaceC44818a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f420166b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f420167a;

    /* compiled from: CampaignsSaleApi_Module_ProvideCampaignsSaleApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lom/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: om.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44820c(@k f fVar) {
        this.f420167a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f420167a.get();
        f420166b.getClass();
        C44819b.f420165a.getClass();
        InterfaceC44818a interfaceC44818a = (InterfaceC44818a) r02.create(InterfaceC44818a.class);
        t.b(interfaceC44818a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC44818a;
    }
}
