package Km;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartApi_Module_ProvideCartApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LKm/c;", "Ldagger/internal/h;", "LKm/a;", "a", "_avito-discouraged_avito-api_cart"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Km.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14329c implements h<InterfaceC14327a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f9647b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f9648a;

    /* compiled from: CartApi_Module_ProvideCartApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKm/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_cart"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Km.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14329c(@k f fVar) {
        this.f9648a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f9648a.get();
        f9647b.getClass();
        C14328b.f9646a.getClass();
        InterfaceC14327a interfaceC14327a = (InterfaceC14327a) r02.create(InterfaceC14327a.class);
        t.b(interfaceC14327a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14327a;
    }
}
