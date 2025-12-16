package WJ;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.api.CallsHistoryTypeAdapter;
import com.avito.android.iac_calls_history.impl_module.api.remote.elements.CallsHistoryElement;
import com.avito.android.util.X5;
import dagger.internal.h;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CallsHistoryJsonModule_ProvideTypeAdaptersFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LWJ/b;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements h<Set<X5>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f17854a = new b();

    @Override // javax.inject.Provider
    public final Object get() {
        a.f17853a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(CallsHistoryElement.class, new CallsHistoryTypeAdapter()));
        return linkedHashSet;
    }
}
