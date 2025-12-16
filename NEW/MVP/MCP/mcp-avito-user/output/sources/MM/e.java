package MM;

import Y61.k;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CalculateTravelTimeUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMM/e;", "Ldagger/internal/h;", "LMM/c;", "a", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f10650c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f10651a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C30102l3 f10652b;

    /* compiled from: CalculateTravelTimeUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMM/e$a;", "", "<init>", "()V", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k C30102l3 c30102l3, @k u uVar) {
        this.f10651a = uVar;
        this.f10652b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        KM.a aVar = (KM.a) this.f10651a.get();
        Context context = (Context) this.f10652b.get();
        f10650c.getClass();
        return new c(aVar, context);
    }
}
