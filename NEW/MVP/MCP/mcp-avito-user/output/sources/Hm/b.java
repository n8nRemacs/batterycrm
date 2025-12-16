package HM;

import Y61.k;
import Y61.l;
import com.avito.android.photo_list_view.InterfaceC33208b;
import io.reactivex.rxjava3.core.I;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImagePerceptionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHM/b;", "LHM/a;", "_avito_image-perception_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.image_perception.data.a f7048a;

    public b(@k com.avito.android.image_perception.data.a aVar) {
        this.f7048a = aVar;
    }

    @Override // HM.a
    public final void a(@k String str) {
        this.f7048a.a(str);
    }

    @Override // HM.a
    public final boolean b(@k String str) {
        return this.f7048a.b(str);
    }

    @Override // HM.a
    @l
    public final List<InterfaceC33208b.a> c(@k String str) {
        return this.f7048a.d(str);
    }

    @Override // HM.a
    @k
    public final I d(@k ArrayList arrayList, @k LinkedHashMap linkedHashMap) {
        return this.f7048a.c(arrayList, linkedHashMap);
    }
}
