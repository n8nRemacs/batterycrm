package kN0;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoRequirementsDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LkN0/b;", "Ldagger/internal/h;", "LkN0/a;", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kN0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42607b implements h<C42606a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f406251b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f406252a;

    /* compiled from: VideoRequirementsDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkN0/b$a;", "", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kN0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42607b(@k dv.b bVar) {
        this.f406252a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f406252a.get();
        f406251b.getClass();
        return new C42606a(dVar);
    }
}
