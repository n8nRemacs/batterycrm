package vx0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsApi_Module_ProvideSparePartsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lvx0/c;", "Ldagger/internal/h;", "Lvx0/a;", "a", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49393c implements h<InterfaceC49391a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f441049b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f441050a;

    /* compiled from: SparePartsApi_Module_ProvideSparePartsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvx0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vx0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49393c(@k f fVar) {
        this.f441050a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f441050a.get();
        f441049b.getClass();
        C49392b.f441048a.getClass();
        InterfaceC49391a interfaceC49391a = (InterfaceC49391a) r02.create(InterfaceC49391a.class);
        t.b(interfaceC49391a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC49391a;
    }
}
