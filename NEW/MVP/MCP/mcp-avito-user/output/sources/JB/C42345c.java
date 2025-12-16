package jb;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertStatsApi_Module_ProvideAdvertStatsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ljb/c;", "Ldagger/internal/h;", "Ljb/a;", "a", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jb.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C42345c implements h<InterfaceC42343a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f405663b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f405664a;

    /* compiled from: AdvertStatsApi_Module_ProvideAdvertStatsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljb/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jb.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42345c(@k f fVar) {
        this.f405664a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f405664a.get();
        f405663b.getClass();
        C42344b.f405662a.getClass();
        InterfaceC42343a interfaceC42343a = (InterfaceC42343a) r02.create(InterfaceC42343a.class);
        t.b(interfaceC42343a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC42343a;
    }
}
