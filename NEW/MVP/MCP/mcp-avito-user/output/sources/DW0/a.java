package DW0;

import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collections;
import uW0.C48986a;

/* compiled from: ForwardingImageOriginListener.java */
@Nullsafe
/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3222a;

    public a(e... eVarArr) {
        ArrayList arrayList = new ArrayList(eVarArr.length);
        this.f3222a = arrayList;
        Collections.addAll(arrayList, eVarArr);
    }

    @Override // DW0.e
    public final synchronized void a(int i12, String str, @I41.h String str2, boolean z12) {
        int size = this.f3222a.size();
        for (int i13 = 0; i13 < size; i13++) {
            e eVar = (e) this.f3222a.get(i13);
            if (eVar != null) {
                try {
                    eVar.a(i12, str, str2, z12);
                } catch (Exception e12) {
                    C48986a.c("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e12);
                }
            }
        }
    }
}
