package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class so8 {
    public static boolean a = false;
    public static int b = 1;
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};

    public static final HashSet a(String str) {
        HashSet hashSet = new HashSet();
        try {
            Iterator it = vmf.S(str, new String[]{","}, 6).iterator();
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
            return hashSet;
        } catch (Throwable th) {
            wqi.e("WorkersQueue/TagsTypeConverter", "fail to convert string to tags", th);
            return hashSet;
        }
    }

    public static synchronized int b(Context context) {
        try {
            s5j.h(context, "Context is null");
            Log.d("so8", "preferredRenderer: ".concat("null"));
            if (!a) {
                try {
                    eki ekiVarJ = vui.j(context);
                    try {
                        xei xeiVarW = ekiVarJ.W();
                        s5j.g(xeiVarW);
                        yxi.a = xeiVarW;
                        dwi dwiVarZ = ekiVarJ.Z();
                        if (t49.c == null) {
                            s5j.h(dwiVarZ, "delegate must not be null");
                            t49.c = dwiVarZ;
                        }
                        a = true;
                        try {
                            Parcel parcelS = ekiVarJ.S(ekiVarJ.T(), 9);
                            int i = parcelS.readInt();
                            parcelS.recycle();
                            if (i == 2) {
                                b = 2;
                            }
                            tqa tqaVar = new tqa(context);
                            Parcel parcelT = ekiVarJ.T();
                            mgi.d(parcelT, tqaVar);
                            parcelT.writeInt(0);
                            ekiVarJ.V(parcelT, 10);
                        } catch (RemoteException e) {
                            Log.e("so8", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i2 = b;
                        Log.d("so8", "loadedRenderer: ".concat(i2 != 1 ? i2 != 2 ? "null" : "LATEST" : "LEGACY"));
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                } catch (GooglePlayServicesNotAvailableException e3) {
                    return e3.a;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    public static Set c(String str) {
        Character ch;
        if (str.length() == 0) {
            return rd5.a;
        }
        String strSubstring = str.substring(vmf.C(str, '(', 0, 6) + 1, vmf.G(str, ')', 0, 6));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i2);
            int i4 = i3 + 1;
            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(cCharAt));
                } else {
                    Character ch2 = (Character) arrayDeque.peek();
                    if (ch2 != null && ch2.charValue() == cCharAt) {
                        arrayDeque.pop();
                    }
                }
            } else if (cCharAt == '[') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(cCharAt));
                }
            } else if (cCharAt == ']') {
                if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                    arrayDeque.pop();
                }
            } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                String strSubstring2 = strSubstring.substring(i + 1, i3);
                int length = strSubstring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    boolean z2 = fni.b(strSubstring2.charAt(!z ? i5 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i5++;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                i = i3;
            }
            i2++;
            i3 = i4;
        }
        arrayList.add(vmf.c0(strSubstring.substring(i + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            int i6 = 0;
            while (true) {
                if (i6 >= 9) {
                    break;
                }
                if (dnf.r(str2, yl6.d[i6], false)) {
                    arrayList2.add(next);
                    break;
                }
                i6++;
            }
        }
        return ue3.h0(arrayList2);
    }
}
