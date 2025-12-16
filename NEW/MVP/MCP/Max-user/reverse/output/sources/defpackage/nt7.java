package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class nt7 implements InvocationHandler {
    public boolean a;
    public String b;
    public final ArrayList c;

    public nt7(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (fni.a(name, "supports") && fni.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (fni.a(name, "unsupported") && fni.a(Void.TYPE, returnType)) {
            this.a = true;
            return null;
        }
        boolean zA = fni.a(name, "protocols");
        ArrayList arrayList = this.c;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((fni.a(name, "selectProtocol") || fni.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.b = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.b = str2;
                return str2;
            }
        }
        if ((!fni.a(name, "protocolSelected") && !fni.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.b = (String) obj4;
        return null;
    }
}
