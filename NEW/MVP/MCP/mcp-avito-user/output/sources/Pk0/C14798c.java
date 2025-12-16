package Pk0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OwnershipCostApi_Module_ProvideOwnershipCostApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPk0/c;", "Ldagger/internal/h;", "LPk0/a;", "a", "_avito-discouraged_avito-api_ownership-cost"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pk0.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C14798c implements h<InterfaceC14796a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f13263b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f13264a;

    /* compiled from: OwnershipCostApi_Module_ProvideOwnershipCostApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPk0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_ownership-cost"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pk0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14798c(@k f fVar) {
        this.f13264a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f13264a.get();
        f13263b.getClass();
        C14797b.f13262a.getClass();
        InterfaceC14796a interfaceC14796a = (InterfaceC14796a) r02.create(InterfaceC14796a.class);
        t.b(interfaceC14796a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14796a;
    }
}
