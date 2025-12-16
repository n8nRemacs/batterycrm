package iA;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileApi_Module_ProvideExtendedProfileApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LiA/c;", "Ldagger/internal/h;", "LiA/a;", "a", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iA.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C41260c implements h<InterfaceC41258a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f398413b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f398414a;

    /* compiled from: ExtendedProfileApi_Module_ProvideExtendedProfileApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiA/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iA.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41260c(@k f fVar) {
        this.f398414a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398414a.get();
        f398413b.getClass();
        C41259b.f398412a.getClass();
        InterfaceC41258a interfaceC41258a = (InterfaceC41258a) r02.create(InterfaceC41258a.class);
        t.b(interfaceC41258a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC41258a;
    }
}
