package l50;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.beduin.v2.page.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesOrdersTabBlueprint.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ll50/b;", "Lcom/avito/android/lib/deprecated_design/tab/b;", "Ll50/a;", "a", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.lib.deprecated_design.tab.b<C43546a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f413509a;

    /* compiled from: ServicesOrdersTabBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ll50/b$a;", "", "<init>", "()V", "", "ENDPOINT", "Ljava/lang/String;", "SCREEN_NAME", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b(@k n nVar) {
        this.f413509a = nVar;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    @l
    public final Fragment a(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return this.f413509a.create();
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    public final boolean b(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return aVar instanceof C43546a;
    }
}
