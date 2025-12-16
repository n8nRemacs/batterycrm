package D3;

import X41.n;
import Y61.k;
import com.avito.android.actions_sheet.ActionsSheetLink;
import com.avito.android.actions_sheet.d;
import com.avito.android.actions_sheet.g;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ActionsSheetLinkHandlerModule_ProvideActionsSheetDeeplinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LD3/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f2865b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f2866a;

    /* compiled from: ActionsSheetLinkHandlerModule_ProvideActionsSheetDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD3/b$a;", "", "<init>", "()V", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k d dVar) {
            D3.a.f2864a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(ActionsSheetLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ActionsSheetLink.class), dVar));
        }

        public a() {
        }
    }

    public b(@k d dVar) {
        this.f2866a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f2866a;
        f2865b.getClass();
        return a.a(dVar);
    }
}
