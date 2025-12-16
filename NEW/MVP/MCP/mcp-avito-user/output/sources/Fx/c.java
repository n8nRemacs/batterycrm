package FX;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UtilApi_Module_ProvideUtilApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LFX/c;", "Ldagger/internal/h;", "LFX/a;", "a", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<FX.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f4726b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f4727a;

    /* compiled from: UtilApi_Module_ProvideUtilApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFX/c$a;", "", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f4727a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f4727a.get();
        f4726b.getClass();
        b.f4725a.getClass();
        FX.a aVar = (FX.a) r02.create(FX.a.class);
        t.b(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
