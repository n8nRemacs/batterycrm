package rx0;

import Y61.k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsBottomSheetModule_ProvideItemBinderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lrx0/e;", "Ldagger/internal/h;", "Lcom/avito/konveyor/a;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rx0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47936e implements h<com.avito.konveyor.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437261b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.d f437262a;

    /* compiled from: SparePartsBottomSheetModule_ProvideItemBinderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrx0/e$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rx0.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47936e(@k com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.d dVar) {
        this.f437262a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.c cVar = (com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.c) this.f437262a.get();
        f437261b.getClass();
        int i12 = C47933b.f437255a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        return c10493a.a();
    }
}
