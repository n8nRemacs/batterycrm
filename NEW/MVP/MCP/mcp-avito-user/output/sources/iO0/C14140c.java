package Io0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SavedSearchesCoreApi_Module_ProvideSavedSearchesCoreApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIo0/c;", "Ldagger/internal/h;", "LIo0/a;", "a", "_avito_saved-searches-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Io0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14140c implements h<InterfaceC14138a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8544b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f8545a;

    /* compiled from: SavedSearchesCoreApi_Module_ProvideSavedSearchesCoreApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIo0/c$a;", "", "<init>", "()V", "_avito_saved-searches-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Io0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14140c(@k f fVar) {
        this.f8545a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f8545a.get();
        f8544b.getClass();
        C14139b.f8543a.getClass();
        InterfaceC14138a interfaceC14138a = (InterfaceC14138a) r02.create(InterfaceC14138a.class);
        t.b(interfaceC14138a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14138a;
    }
}
