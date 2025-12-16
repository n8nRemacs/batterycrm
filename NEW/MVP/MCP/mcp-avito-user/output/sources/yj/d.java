package YJ;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.screen.i;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryScreenActivityModule_ProvideCallsHistoryPageResourcesProviderFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LYJ/d;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/screen/h;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements h<com.avito.android.iac_calls_history.impl_module.screen.h> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f19434b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f19435a;

    /* compiled from: CallsHistoryScreenActivityModule_ProvideCallsHistoryPageResourcesProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYJ/d$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k l lVar) {
        this.f19435a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f19435a.f393949a;
        f19434b.getClass();
        int i12 = b.f19433a;
        return new i(resources);
    }
}
