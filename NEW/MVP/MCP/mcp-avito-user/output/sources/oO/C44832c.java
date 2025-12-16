package oo;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CharityApi_Module_ProvideCharityApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Loo/c;", "Ldagger/internal/h;", "Loo/a;", "a", "_avito_charity_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44832c implements h<InterfaceC44830a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f420182b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f420183a;

    /* compiled from: CharityApi_Module_ProvideCharityApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loo/c$a;", "", "<init>", "()V", "_avito_charity_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oo.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44832c(@k f fVar) {
        this.f420183a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f420183a.get();
        f420182b.getClass();
        C44831b.f420181a.getClass();
        InterfaceC44830a interfaceC44830a = (InterfaceC44830a) r02.create(InterfaceC44830a.class);
        t.b(interfaceC44830a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC44830a;
    }
}
