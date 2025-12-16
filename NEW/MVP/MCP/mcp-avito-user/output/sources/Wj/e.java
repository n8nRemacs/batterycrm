package Wj;

import Y61.k;
import Zj.b;
import androidx.fragment.app.Fragment;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabStubFragmentTypedFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWj/e;", "LWj/f;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final NavigationTab f18023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f18024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f18025d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(NavigationTab navigationTab, Y41.a aVar, Y41.a aVar2) {
        this.f18024c = (N) aVar;
        this.f18025d = (N) aVar2;
        this.f18023b = navigationTab;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Wj.f
    @k
    public final b.a a() {
        return (b.a) this.f18025d.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Wj.f
    @k
    public final Fragment b() {
        return (Fragment) this.f18024c.invoke();
    }

    @Override // Wj.f
    @k
    public final NavigationTabSetItem getType() {
        return this.f18023b;
    }
}
