package Hn;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoriesApi_Module_ProvideCategoriesApiFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LHn/c;", "Ldagger/internal/h;", "LHn/a;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14012c implements h<InterfaceC14010a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f7695b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f7696a;

    /* compiled from: CategoriesApi_Module_ProvideCategoriesApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHn/c$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hn.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14012c(@k f fVar) {
        this.f7696a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f7696a.get();
        f7695b.getClass();
        C14011b.f7694a.getClass();
        InterfaceC14010a interfaceC14010a = (InterfaceC14010a) r02.create(InterfaceC14010a.class);
        t.b(interfaceC14010a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14010a;
    }
}
