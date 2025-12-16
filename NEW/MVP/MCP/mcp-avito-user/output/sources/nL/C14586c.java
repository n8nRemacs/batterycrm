package Nl;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: C2CTrxApi_Module_ProvideC2CTrxApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNl/c;", "Ldagger/internal/h;", "LNl/a;", "a", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nl.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14586c implements h<InterfaceC14584a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11737b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11738a;

    /* compiled from: C2CTrxApi_Module_ProvideC2CTrxApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNl/c$a;", "", "<init>", "()V", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nl.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14586c(@k f fVar) {
        this.f11738a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11738a.get();
        f11737b.getClass();
        C14585b.f11736a.getClass();
        InterfaceC14584a interfaceC14584a = (InterfaceC14584a) r02.create(InterfaceC14584a.class);
        t.b(interfaceC14584a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14584a;
    }
}
