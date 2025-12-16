package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hf3 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "BLOCK";
        }
        if (i == 2) {
            return "UNBLOCK";
        }
        if (i == 3) {
            return "REMOVE";
        }
        if (i == 4) {
            return "ADD";
        }
        if (i == 5) {
            return "UPDATE";
        }
        throw null;
    }

    public static int b(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static ArrayList c(int i, HashMap map, ArrayList arrayList, int i2, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static void d(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void e(long j, String str, String str2, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    public static void f(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
    }

    public static void g(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void h(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 1:
                return "INIT";
            case 2:
                return "WAITING_FOR_CONNECT";
            case 3:
                return "CONNECTED";
            case 4:
                return "WAITING_FOR_UPLOAD_STATUS";
            case 5:
                return "SENDING_UPLOAD_REQUEST";
            case 6:
                return "SENDING_DATA";
            case 7:
                return "WAITING_FOR_CHUNK_STATUS";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FEMALE" : "MALE" : "UNKNOWN";
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? "null" : "REMOVED" : "BLOCKED";
    }
}
