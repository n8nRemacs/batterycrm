package cW0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserStatsApi_Module_ProvideUserStatsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LcW0/c;", "Ldagger/internal/h;", "LcW0/a;", "a", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cW0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27114c implements h<InterfaceC27112a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f57914b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f57915a;

    /* compiled from: UserStatsApi_Module_ProvideUserStatsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcW0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cW0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27114c(@k f fVar) {
        this.f57915a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57915a.get();
        f57914b.getClass();
        C27113b.f57913a.getClass();
        InterfaceC27112a interfaceC27112a = (InterfaceC27112a) r02.create(InterfaceC27112a.class);
        t.b(interfaceC27112a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC27112a;
    }
}
