package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfn {
    public static final void a(StringBuilder sb2, int i12, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i12, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i12, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzgn.a(zzdb.zzs((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzdb) {
            sb2.append(": \"");
            sb2.append(zzgn.a((zzdb) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzec) {
            sb2.append(" {");
            c((zzec) obj, sb2, i12 + 2);
            sb2.append("\n");
            while (i13 < i12) {
                sb2.append(' ');
                i13++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i15 = i12 + 2;
        a(sb2, i15, "key", entry.getKey());
        a(sb2, i15, "value", entry.getValue());
        sb2.append("\n");
        while (i13 < i12) {
            sb2.append(' ');
            i13++;
        }
        sb2.append("}");
    }

    public static final String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    public static void c(zzec zzecVar, StringBuilder sb2, int i12) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzecVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb2, i12, b(strConcat), zzec.i(method2, zzecVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb2, i12, b(strConcat2), zzec.i(method3, zzecVar, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objI = zzec.i(method4, zzecVar, new Object[0]);
                    if (method5 == null) {
                        if (objI instanceof Boolean) {
                            if (((Boolean) objI).booleanValue()) {
                                a(sb2, i12, b(strConcat3), objI);
                            }
                        } else if (objI instanceof Integer) {
                            if (((Integer) objI).intValue() != 0) {
                                a(sb2, i12, b(strConcat3), objI);
                            }
                        } else if (objI instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objI).floatValue()) != 0) {
                                a(sb2, i12, b(strConcat3), objI);
                            }
                        } else if (!(objI instanceof Double)) {
                            if (objI instanceof String) {
                                zEquals = objI.equals("");
                            } else if (objI instanceof zzdb) {
                                zEquals = objI.equals(zzdb.zzb);
                            } else if (objI instanceof zzfl) {
                                if (objI != ((zzfl) objI).zzX()) {
                                    a(sb2, i12, b(strConcat3), objI);
                                }
                            } else if (!(objI instanceof Enum) || ((Enum) objI).ordinal() != 0) {
                                a(sb2, i12, b(strConcat3), objI);
                            }
                            if (!zEquals) {
                                a(sb2, i12, b(strConcat3), objI);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objI).doubleValue()) != 0) {
                            a(sb2, i12, b(strConcat3), objI);
                        }
                    } else if (((Boolean) zzec.i(method5, zzecVar, new Object[0])).booleanValue()) {
                        a(sb2, i12, b(strConcat3), objI);
                    }
                }
            }
        }
        if (zzecVar instanceof zzdy) {
            Iterator itZzf = ((zzdy) zzecVar).zza.zzf();
            while (itZzf.hasNext()) {
                Map.Entry entry = (Map.Entry) itZzf.next();
                int i13 = ((zzdz) entry.getKey()).f352438b;
                StringBuilder sb3 = new StringBuilder(13);
                sb3.append("[");
                sb3.append(i13);
                sb3.append("]");
                a(sb2, i12, sb3.toString(), entry.getValue());
            }
        }
        zzgq zzgqVar = zzecVar.zzc;
        if (zzgqVar != null) {
            for (int i14 = 0; i14 < zzgqVar.f352534a; i14++) {
                a(sb2, i12, String.valueOf(zzgqVar.f352535b[i14] >>> 3), zzgqVar.f352536c[i14]);
            }
        }
    }
}
