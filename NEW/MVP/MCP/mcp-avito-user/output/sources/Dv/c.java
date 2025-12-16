package dv;

import X41.n;
import Y61.k;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import qv.InterfaceC47451a;

/* compiled from: DeeplinkViewModule_ProvideEmptyIntentModifiersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldv/c;", "Ldagger/internal/h;", "", "Lqv/a;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<Set<InterfaceC47451a>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f394175a = new c();

    @n
    @k
    public static final c a() {
        return f394175a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C39806a.f394172a.getClass();
        B0 b02 = B0.f406639b;
        t.b(b02, "Cannot return null from a non-@Nullable @Provides method");
        return b02;
    }
}
