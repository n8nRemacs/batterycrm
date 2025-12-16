package Mn0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SafeDealApi_Module_ProvideSafeDealApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMn0/d;", "Ldagger/internal/h;", "LMn0/b;", "a", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements h<InterfaceC14512b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11015b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11016a;

    /* compiled from: SafeDealApi_Module_ProvideSafeDealApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMn0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k f fVar) {
        this.f11016a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11016a.get();
        f11015b.getClass();
        C14513c.f11014a.getClass();
        InterfaceC14512b interfaceC14512b = (InterfaceC14512b) r02.create(InterfaceC14512b.class);
        t.b(interfaceC14512b, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14512b;
    }
}
