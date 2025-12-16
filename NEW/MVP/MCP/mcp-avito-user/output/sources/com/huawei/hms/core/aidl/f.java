package com.huawei.hms.core.aidl;

import android.os.Bundle;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MessageCodecV2.java */
/* loaded from: classes7.dex */
public class f extends e {
    @Override // com.huawei.hms.core.aidl.e
    public List<Object> a(Type type, Bundle bundle) throws InstantiationException {
        int i12 = bundle.getInt("_list_size_");
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            Object obj = bundle.get("_list_item_" + i13);
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                int i14 = bundle2.getInt("_val_type_", -1);
                if (i14 == 1) {
                    throw new InstantiationException("Nested List can not be supported");
                }
                if (i14 != 0) {
                    throw new InstantiationException("Unknown type can not be supported");
                }
                arrayList.add(a(bundle2, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else {
                continue;
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.core.aidl.e
    public void a(String str, List list, Bundle bundle) {
        Bundle bundleE = AK.c.e(1, "_val_type_");
        bundleE.putInt("_list_size_", list.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            a(AK.c.g(i12, "_list_item_"), list.get(i12), bundleE);
        }
        bundle.putBundle(str, bundleE);
    }
}
