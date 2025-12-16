package PL;

import com.avito.android.iac_miui_utils.util_module.MiUiShowOnLockScreenAnalyticTask;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MiUiShowOnLockScreenAnalyticTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPL/g;", "Ldagger/internal/h;", "Lcom/avito/android/iac_miui_utils/util_module/MiUiShowOnLockScreenAnalyticTask;", "a", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<MiUiShowOnLockScreenAnalyticTask> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f13012b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<PL.a> f13013a;

    /* compiled from: MiUiShowOnLockScreenAnalyticTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPL/g$a;", "", "<init>", "()V", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k Provider<PL.a> provider) {
        this.f13013a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        PL.a aVar = this.f13013a.get();
        f13012b.getClass();
        return new MiUiShowOnLockScreenAnalyticTask(aVar);
    }
}
