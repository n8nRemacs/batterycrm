package rv0;

import X41.n;
import Y61.k;
import com.avito.android.services_realty_sheet.link.ServicesRealtySheetLink;
import com.avito.android.services_realty_sheet.link.f;
import com.avito.android.services_realty_sheet.link.g;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ServicesRealtySheetLinkModule_ProvideServicesRealtySheetLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lrv0/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47922b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437164b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f437165a;

    /* compiled from: ServicesRealtySheetLinkModule_ProvideServicesRealtySheetLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrv0/b$a;", "", "<init>", "()V", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rv0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k f fVar) {
            C47921a.f437163a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(ServicesRealtySheetLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServicesRealtySheetLink.class), fVar));
        }

        public a() {
        }
    }

    public C47922b(@k f fVar) {
        this.f437165a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f437165a;
        f437164b.getClass();
        return a.a(fVar);
    }
}
