package Px;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EarlyAccessApiOld_Module_ProvideEarlyAccessApiOldFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPx/c;", "Ldagger/internal/h;", "LPx/a;", "a", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Px.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14850c implements h<InterfaceC14848a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f13377b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f13378a;

    /* compiled from: EarlyAccessApiOld_Module_ProvideEarlyAccessApiOldFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPx/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Px.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14850c(@k f fVar) {
        this.f13378a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f13378a.get();
        f13377b.getClass();
        C14849b.f13376a.getClass();
        InterfaceC14848a interfaceC14848a = (InterfaceC14848a) r02.create(InterfaceC14848a.class);
        t.b(interfaceC14848a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14848a;
    }
}
