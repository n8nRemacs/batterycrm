package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class qg9 {
    public final /* synthetic */ int a;
    public final tze b;

    public /* synthetic */ qg9(tze tzeVar, int i) {
        this.a = i;
        this.b = tzeVar;
    }

    public static final ah5 a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        xg5 xg5Var = new xg5(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) ys.x(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            xg5Var.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) ys.x(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    int i4 = xg5Var.d;
                    List[] listArr = xg5Var.f;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[xg5Var.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        ah5 ah5Var = new ah5(str, enumArr);
        ah5Var.b = xg5Var;
        return ah5Var;
    }
}
