package k31;

import com.adjust.sdk.Constants;
import de.ailis.pherialize.exceptions.SerializeException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Serializer.java */
/* renamed from: k31.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42495d {

    /* renamed from: a, reason: collision with root package name */
    public final Charset f406032a = Charset.forName(Constants.ENCODING);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f406033b = new ArrayList();

    public final void a(Object obj, StringBuffer stringBuffer, boolean z12) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        String str;
        ArrayList arrayList = this.f406033b;
        if (obj == null) {
            stringBuffer.append("N;");
        } else {
            if (z12 && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof String)) {
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if (it.next() == obj) {
                        stringBuffer.append("R:");
                        stringBuffer.append(i12 + 1);
                        stringBuffer.append(';');
                        return;
                    }
                    i12++;
                }
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                try {
                    str = new String(str2.getBytes(this.f406032a), "ISO-8859-1");
                } catch (UnsupportedEncodingException unused) {
                    str = str2;
                }
                stringBuffer.append("s:");
                stringBuffer.append(str.length());
                stringBuffer.append(":\"");
                stringBuffer.append(str2);
                stringBuffer.append("\";");
            } else if (obj instanceof Character) {
                stringBuffer.append("s:1:\"");
                stringBuffer.append((Character) obj);
                stringBuffer.append("\";");
            } else if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                stringBuffer.append("i:");
                stringBuffer.append(iIntValue);
                stringBuffer.append(';');
            } else if (obj instanceof Short) {
                int iIntValue2 = ((Short) obj).intValue();
                stringBuffer.append("i:");
                stringBuffer.append(iIntValue2);
                stringBuffer.append(';');
            } else if (obj instanceof Byte) {
                int iIntValue3 = ((Byte) obj).intValue();
                stringBuffer.append("i:");
                stringBuffer.append(iIntValue3);
                stringBuffer.append(';');
            } else if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                stringBuffer.append("i:");
                stringBuffer.append(jLongValue);
                stringBuffer.append(';');
            } else if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                stringBuffer.append("d:");
                stringBuffer.append(dDoubleValue);
                stringBuffer.append(';');
            } else if (obj instanceof Float) {
                double dDoubleValue2 = ((Float) obj).doubleValue();
                stringBuffer.append("d:");
                stringBuffer.append(dDoubleValue2);
                stringBuffer.append(';');
            } else {
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof C42492a) {
                        a(((C42492a) obj).f406030b, stringBuffer, true);
                        return;
                    }
                    if (obj instanceof Object[]) {
                        Object[] objArr = (Object[]) obj;
                        arrayList.add(objArr);
                        stringBuffer.append("a:");
                        int length = objArr.length;
                        stringBuffer.append(length);
                        stringBuffer.append(":{");
                        for (int i13 = 0; i13 < length; i13++) {
                            a(Integer.valueOf(i13), stringBuffer, false);
                            arrayList.remove(arrayList.size() - 1);
                            a(objArr[i13], stringBuffer, true);
                        }
                        stringBuffer.append('}');
                        return;
                    }
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        arrayList.add(collection);
                        stringBuffer.append("a:");
                        stringBuffer.append(collection.size());
                        stringBuffer.append(":{");
                        Iterator it2 = collection.iterator();
                        int i14 = 0;
                        while (it2.hasNext()) {
                            a(Integer.valueOf(i14), stringBuffer, false);
                            arrayList.remove(arrayList.size() - 1);
                            a(it2.next(), stringBuffer, true);
                            i14++;
                        }
                        stringBuffer.append('}');
                        return;
                    }
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        arrayList.add(map);
                        stringBuffer.append("a:");
                        stringBuffer.append(map.size());
                        stringBuffer.append(":{");
                        for (Object obj2 : map.keySet()) {
                            a(obj2, stringBuffer, false);
                            arrayList.remove(arrayList.size() - 1);
                            a(map.get(obj2), stringBuffer, true);
                        }
                        stringBuffer.append('}');
                        return;
                    }
                    if (!(obj instanceof Serializable)) {
                        throw new SerializeException("Unable to serialize ".concat(obj.getClass().getName()));
                    }
                    Serializable serializable = (Serializable) obj;
                    arrayList.add(serializable);
                    Class<?> superclass = serializable.getClass();
                    String simpleName = superclass.getSimpleName();
                    stringBuffer.append("O:");
                    stringBuffer.append(simpleName.length());
                    stringBuffer.append(":\"");
                    stringBuffer.append(simpleName);
                    stringBuffer.append("\":");
                    StringBuffer stringBuffer2 = new StringBuffer();
                    int i15 = 0;
                    while (superclass != null) {
                        for (Field field : superclass.getDeclaredFields()) {
                            if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isVolatile(field.getModifiers())) {
                                try {
                                    field.setAccessible(true);
                                    String name = field.getName();
                                    Object obj3 = field.get(serializable);
                                    a(name, stringBuffer2, true);
                                    arrayList.remove(arrayList.size() - 1);
                                    a(obj3, stringBuffer2, true);
                                    i15++;
                                } catch (IllegalAccessException | IllegalArgumentException | SecurityException unused2) {
                                }
                            }
                        }
                        superclass = superclass.getSuperclass();
                    }
                    stringBuffer.append(i15);
                    stringBuffer.append(":{");
                    stringBuffer.append(stringBuffer2);
                    stringBuffer.append("}");
                    return;
                }
                stringBuffer.append("b:");
                stringBuffer.append(((Boolean) obj).booleanValue() ? 1 : 0);
                stringBuffer.append(';');
            }
        }
        arrayList.add(obj);
    }
}
