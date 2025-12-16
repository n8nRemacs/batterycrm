package sE0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UtilApi_Module_ProvideUtilApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LsE0/c;", "Ldagger/internal/h;", "LsE0/a;", "a", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sE0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48040c implements h<InterfaceC48038a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437547b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f437548a;

    /* compiled from: UtilApi_Module_ProvideUtilApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsE0/c$a;", "", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sE0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48040c(@k f fVar) {
        this.f437548a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f437548a.get();
        f437547b.getClass();
        C48039b.f437546a.getClass();
        InterfaceC48038a interfaceC48038a = (InterfaceC48038a) r02.create(InterfaceC48038a.class);
        t.b(interfaceC48038a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC48038a;
    }
}
