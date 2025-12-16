package bX;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoyaltyApi_Module_ProvideLoyaltyApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LbX/c;", "Ldagger/internal/h;", "LbX/a;", "a", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bX.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C25578c implements h<InterfaceC25576a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f57106b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f57107a;

    /* compiled from: LoyaltyApi_Module_ProvideLoyaltyApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbX/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bX.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25578c(@k f fVar) {
        this.f57107a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57107a.get();
        f57106b.getClass();
        C25577b.f57105a.getClass();
        InterfaceC25576a interfaceC25576a = (InterfaceC25576a) r02.create(InterfaceC25576a.class);
        t.b(interfaceC25576a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC25576a;
    }
}
