package Hl0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortTermRentApi_Module_ProvideShortTermRentApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LHl0/c;", "Ldagger/internal/h;", "LHl0/a;", "a", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14004c implements h<InterfaceC14002a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f7678b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f7679a;

    /* compiled from: ShortTermRentApi_Module_ProvideShortTermRentApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHl0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hl0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14004c(@k f fVar) {
        this.f7679a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f7679a.get();
        f7678b.getClass();
        C14003b.f7677a.getClass();
        InterfaceC14002a interfaceC14002a = (InterfaceC14002a) r02.create(InterfaceC14002a.class);
        t.b(interfaceC14002a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14002a;
    }
}
