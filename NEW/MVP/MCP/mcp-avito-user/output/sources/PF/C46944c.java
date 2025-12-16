package pF;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GeoCommonApi_Module_ProvideGeoCommonApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpF/c;", "Ldagger/internal/h;", "LpF/a;", "a", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pF.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C46944c implements h<InterfaceC46942a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f428280b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f428281a;

    /* compiled from: GeoCommonApi_Module_ProvideGeoCommonApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpF/c$a;", "", "<init>", "()V", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pF.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C46944c(@k f fVar) {
        this.f428281a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f428281a.get();
        f428280b.getClass();
        C46943b.f428279a.getClass();
        InterfaceC46942a interfaceC46942a = (InterfaceC46942a) r02.create(InterfaceC46942a.class);
        t.b(interfaceC46942a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC46942a;
    }
}
