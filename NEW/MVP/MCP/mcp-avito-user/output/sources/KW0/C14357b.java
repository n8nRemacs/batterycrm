package Kw0;

import Y61.k;
import com.avito.android.silent_update_deeplinks.schedule.SilentUpdateScheduleLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: SilentUpdateScheduleHandlerModule_ProvideSilentUpdateScheduleLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LKw0/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14357b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f9714b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f9715a;

    /* compiled from: SilentUpdateScheduleHandlerModule_ProvideSilentUpdateScheduleLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKw0/b$a;", "", "<init>", "()V", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Kw0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14357b(@k d dVar) {
        this.f9715a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f9715a;
        f9714b.getClass();
        C14356a.f9713a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SilentUpdateScheduleLink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}
