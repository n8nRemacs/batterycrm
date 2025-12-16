package androidx.media3.common.util;

import android.os.Bundle;
import androidx.media3.common.InterfaceC23096j;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: BundleableUtil.java */
@J
/* renamed from: androidx.media3.common.util.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23114e {
    public static <T extends InterfaceC23096j> AbstractC37401r1<T> a(InterfaceC23096j.a<T> aVar, List<Bundle> list) {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar2 = new AbstractC37401r1.a();
        for (int i12 = 0; i12 < list.size(); i12++) {
            Bundle bundle = list.get(i12);
            bundle.getClass();
            aVar2.g(aVar.fromBundle(bundle));
        }
        return aVar2.i();
    }

    public static <T extends InterfaceC23096j> ArrayList<Bundle> b(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k());
        }
        return arrayList;
    }
}
