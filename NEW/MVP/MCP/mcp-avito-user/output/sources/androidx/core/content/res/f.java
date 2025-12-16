package androidx.core.content.res;

import H0.a;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import com.adjust.sdk.Constants;
import j.InterfaceC42149e;
import j.N;
import j.P;
import j.X;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
@RestrictTo
/* loaded from: classes.dex */
public class f {

    /* compiled from: FontResourcesParserCompat.java */
    @X
    public static class a {
    }

    /* compiled from: FontResourcesParserCompat.java */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final e[] f44659a;

        public d(@N e[] eVarArr) {
            this.f44659a = eVarArr;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final String f44660a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44661b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44662c;

        /* renamed from: d, reason: collision with root package name */
        public final String f44663d;

        /* renamed from: e, reason: collision with root package name */
        public final int f44664e;

        /* renamed from: f, reason: collision with root package name */
        public final int f44665f;

        public e(@N String str, int i12, @P String str2, int i13, int i14, boolean z12) {
            this.f44660a = str;
            this.f44661b = i12;
            this.f44662c = z12;
            this.f44663d = str2;
            this.f44664e = i13;
            this.f44665f = i14;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    public static final class C1729f implements b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final androidx.core.provider.h f44666a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final androidx.core.provider.h f44667b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44668c;

        /* renamed from: d, reason: collision with root package name */
        public final int f44669d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final String f44670e;

        @RestrictTo
        public C1729f(@N androidx.core.provider.h hVar, @P androidx.core.provider.h hVar2, int i12, int i13, @P String str) {
            this.f44666a = hVar;
            this.f44667b = hVar2;
            this.f44669d = i12;
            this.f44668c = i13;
            this.f44670e = str;
        }
    }

    @P
    public static b a(@N XmlResourceParser xmlResourceParser, @N Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a.j.f6904b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(5);
            String string3 = typedArrayObtainAttributes.getString(6);
            String string4 = typedArrayObtainAttributes.getString(2);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(3, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
            String string5 = typedArrayObtainAttributes.getString(7);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    c(xmlResourceParser);
                }
                List<List<byte[]>> listB = b(resources, resourceId);
                return new C1729f(new androidx.core.provider.h(string, string2, string3, listB), string4 != null ? new androidx.core.provider.h(string, string2, string4, listB) : null, integer, integer2, string5);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a.j.f6905c);
                        int i12 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, Constants.MINIMAL_ERROR_STATUS_CODE);
                        boolean z12 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i13 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i14 = typedArrayObtainAttributes2.getInt(i13, 0);
                        int i15 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i15, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i15);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            c(xmlResourceParser);
                        }
                        arrayList.add(new e(string7, i12, string6, i14, resourceId2, z12));
                    } else {
                        c(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new d((e[]) arrayList.toArray(new e[0]));
            }
        } else {
            c(xmlResourceParser);
        }
        return null;
    }

    @N
    public static List<List<byte[]>> b(@N Resources resources, @InterfaceC42149e int i12) throws Resources.NotFoundException {
        if (i12 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i12);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i13 = 0; i13 < typedArrayObtainTypedArray.length(); i13++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i13, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i12);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i12 = 1;
        while (i12 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i12++;
            } else if (next == 3) {
                i12--;
            }
        }
    }
}
