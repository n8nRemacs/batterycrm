package ob;

import Y61.l;
import androidx.view.C22977J;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.remote.model.SerpDisplayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdBlueprintHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lob/f;", "Lob/d;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ob.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44742f implements InterfaceC44740d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f419938a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<? extends H> f419939b;

    public C44742f() {
        throw null;
    }

    public C44742f(boolean z12, SerpDisplayType serpDisplayType, Y41.a aVar, int i12, C42822w c42822w) {
        this.f419938a = (i12 & 1) != 0 ? false : z12;
        this.f419939b = aVar;
    }

    @Override // ob.InterfaceC44740d
    /* renamed from: a, reason: from getter */
    public final boolean getF419938a() {
        return this.f419938a;
    }

    @Override // ob.InterfaceC44740d
    @Y61.k
    public final aU0.b b() {
        return this.f419939b.invoke().b();
    }

    @Override // ob.InterfaceC44740d
    @Y61.k
    public final x c(@l FV0.a aVar, @l InterfaceC22983P interfaceC22983P, @Y61.k C22977J c22977j) {
        Lifecycle lifecycle;
        H hInvoke = this.f419939b.invoke();
        if (aVar != null) {
            Set<FV0.h> setD = hInvoke.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setD) {
                if (!(((FV0.h) obj) instanceof com.avito.beduin.v2.interaction.flow.file_picker.flow.k)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((FV0.h) it.next()).Q(aVar);
            }
            if (interfaceC22983P != null && (lifecycle = interfaceC22983P.getLifecycle()) != null) {
                lifecycle.a(new C44741e(arrayList));
            }
        }
        return hInvoke.c().a(c22977j);
    }
}
