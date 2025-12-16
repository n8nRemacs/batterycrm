package ow;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DevelopmentsAdviceApi_Module_ProvideDevelopmentsAdviceApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Low/c;", "Ldagger/internal/h;", "Low/a;", "a", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ow.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44948c implements h<InterfaceC44946a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f422328b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f422329a;

    /* compiled from: DevelopmentsAdviceApi_Module_ProvideDevelopmentsAdviceApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44948c(@k f fVar) {
        this.f422329a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f422329a.get();
        f422328b.getClass();
        C44947b.f422327a.getClass();
        InterfaceC44946a interfaceC44946a = (InterfaceC44946a) r02.create(InterfaceC44946a.class);
        t.b(interfaceC44946a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC44946a;
    }
}
