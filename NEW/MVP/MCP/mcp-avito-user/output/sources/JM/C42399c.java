package jm;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CampaignsSaleApi_Module_ProvideCampaignsSaleApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ljm/c;", "Ldagger/internal/h;", "Ljm/a;", "a", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42399c implements h<InterfaceC42397a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f405807b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f405808a;

    /* compiled from: CampaignsSaleApi_Module_ProvideCampaignsSaleApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljm/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jm.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42399c(@k f fVar) {
        this.f405808a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f405808a.get();
        f405807b.getClass();
        C42398b.f405806a.getClass();
        InterfaceC42397a interfaceC42397a = (InterfaceC42397a) r02.create(InterfaceC42397a.class);
        t.b(interfaceC42397a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC42397a;
    }
}
