package zc;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnalyticsApi_Module_ProvideAnalyticsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lzc/c;", "Ldagger/internal/h;", "Lzc/a;", "a", "_avito-discouraged_avito-api_analytics"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50547c implements h<InterfaceC50545a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f444092b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f444093a;

    /* compiled from: AnalyticsApi_Module_ProvideAnalyticsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzc/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_analytics"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zc.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50547c(@k f fVar) {
        this.f444093a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f444093a.get();
        f444092b.getClass();
        C50546b.f444091a.getClass();
        InterfaceC50545a interfaceC50545a = (InterfaceC50545a) r02.create(InterfaceC50545a.class);
        t.b(interfaceC50545a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC50545a;
    }
}
