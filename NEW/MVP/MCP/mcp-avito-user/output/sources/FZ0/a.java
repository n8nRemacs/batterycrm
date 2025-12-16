package FZ0;

import Ba1.B;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* loaded from: classes6.dex */
public class a implements h {
    @Override // com.google.firebase.components.h
    public final List<com.google.firebase.components.b<?>> c(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.components.b<?> bVar : componentRegistrar.getComponents()) {
            String str = bVar.f360725a;
            if (str != null) {
                B b12 = new B(2, str, bVar);
                bVar = new com.google.firebase.components.b<>(str, bVar.f360726b, bVar.f360727c, bVar.f360728d, bVar.f360729e, b12, bVar.f360731g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
