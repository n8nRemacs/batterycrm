package gj;

import androidx.appcompat.app.r;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLaunchHandlerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgj/a;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C40690a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<BeduinAction> f396751a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f396752b;

    /* JADX WARN: Multi-variable type inference failed */
    public C40690a(@Y61.k List<? extends BeduinAction> list, @Y61.k Map<String, ? extends Object> map) {
        this.f396751a = list;
        this.f396752b = map;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40690a)) {
            return false;
        }
        C40690a c40690a = (C40690a) obj;
        return L.f(this.f396751a, c40690a.f396751a) && L.f(this.f396752b, c40690a.f396752b);
    }

    public final int hashCode() {
        return this.f396752b.hashCode() + (this.f396751a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCloseModuleParams(parentModuleActions=");
        sb2.append(this.f396751a);
        sb2.append(", resultParams=");
        return r.w(sb2, this.f396752b, ')');
    }
}
