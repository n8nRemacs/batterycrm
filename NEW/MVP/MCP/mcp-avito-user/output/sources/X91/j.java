package X91;

import android.content.Context;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class j extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.main.ui.m f18738l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ru.mts.biometry.sdk.feature.main.ui.m mVar) {
        super(1);
        this.f18738l = mVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // Y41.l
    public final Object invoke(Object obj) {
        v vVar;
        ru.mts.biometry.sdk.feature.main.ui.m mVar = this.f18738l;
        x xVar = mVar.f436477i0;
        u uVar = (u) mVar.f436479k0.getValue();
        uVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        int i12 = 1;
        while (it.hasNext()) {
            t tVar = (t) uVar.f18759b.get((String) it.next());
            if (tVar == null) {
                vVar = null;
            } else {
                int i13 = i12 + 1;
                Object[] objArr = {Integer.valueOf(i12)};
                Context context = uVar.f18758a;
                v vVar2 = new v(H91.b.c(tVar.f18756a, context), context.getString(R.string.sdk_bio_step_title, objArr), context.getString(tVar.f18757b));
                i12 = i13;
                vVar = vVar2;
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        xVar.getClass();
        ArrayList arrayList2 = xVar.f18764c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        xVar.notifyDataSetChanged();
        return G0.f406611a;
    }
}
