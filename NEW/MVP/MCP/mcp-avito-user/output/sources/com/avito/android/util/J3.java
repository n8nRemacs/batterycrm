package com.avito.android.util;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C20199a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: Parcels.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.collection.o1<ClassLoader, androidx.collection.o1<String, Parcelable.Creator<?>>> f318636a = new androidx.collection.o1<>(0, 1, null);

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    @Y61.l
    @InterfaceC42830m
    public static final List a(@Y61.k Parcel parcel, @Y61.l ClassLoader classLoader) {
        Parcelable.Creator<?> creator;
        Parcelable.Creator<?> creator2;
        ClassLoader classLoader2;
        int i12 = 1;
        int i13 = parcel.readInt();
        C42822w c42822w = null;
        if (i13 == -1) {
            return null;
        }
        Parcelable.Creator[] creatorArr = new Parcelable.Creator[i13];
        ?? r52 = 0;
        int i14 = 0;
        while (i14 < i13) {
            String string = parcel.readString();
            if (string == null) {
                creator2 = null;
            } else {
                androidx.collection.o1<ClassLoader, androidx.collection.o1<String, Parcelable.Creator<?>>> o1Var = f318636a;
                synchronized (o1Var) {
                    try {
                        androidx.collection.o1<String, Parcelable.Creator<?>> o1Var2 = o1Var.get(classLoader);
                        if (o1Var2 == null) {
                            o1Var2 = new androidx.collection.o1<>(r52, i12, c42822w);
                            o1Var.put(classLoader, o1Var2);
                        }
                        creator = o1Var2.get(string);
                        if (creator == null) {
                            if (classLoader == null) {
                                try {
                                    classLoader2 = parcel.getClass().getClassLoader();
                                } catch (ClassNotFoundException unused) {
                                    throw new BadParcelableException("ClassNotFoundException when unmarshalling: ".concat(string));
                                } catch (IllegalAccessException unused2) {
                                    throw new BadParcelableException("IllegalAccessException when unmarshalling: ".concat(string));
                                } catch (NoSuchFieldException unused3) {
                                    throw new BadParcelableException("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class ".concat(string));
                                }
                            } else {
                                classLoader2 = classLoader;
                            }
                            Class<?> cls = Class.forName(string, r52, classLoader2);
                            if (!Parcelable.class.isAssignableFrom(cls)) {
                                throw new BadParcelableException("Parcelable protocol requires that the class implements Parcelable");
                            }
                            Field field = cls.getField("CREATOR");
                            if ((field.getModifiers() & 8) == 0) {
                                throw new BadParcelableException("Parcelable protocol requires the CREATOR object to be static on class ".concat(string));
                            }
                            if (!Parcelable.Creator.class.isAssignableFrom(field.getType())) {
                                throw new BadParcelableException("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class ".concat(string));
                            }
                            creator = (Parcelable.Creator) field.get(null);
                            o1Var2.put(string, creator);
                        }
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                creator2 = creator;
            }
            creatorArr[parcel.readInt()] = creator2;
            i14++;
            r52 = 0;
        }
        int i15 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i15);
        for (int i16 = 0; i16 < i15; i16++) {
            arrayList.add((Parcelable) creatorArr[parcel.readInt()].createFromParcel(parcel));
        }
        return C42745f0.M0(arrayList);
    }

    @InterfaceC42830m
    public static final boolean c(@Y61.k Parcel parcel) {
        return parcel.readInt() == 1;
    }

    @InterfaceC42830m
    public static final <T extends Enum<T>> void d(@Y61.k Parcel parcel, @Y61.k T t12) {
        parcel.writeInt(t12.ordinal());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42830m
    public static final void e(@Y61.l List list, @Y61.k Parcel parcel, int i12) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        C20199a c20199a = new C20199a();
        List<Parcelable> list2 = list;
        for (Parcelable parcelable : list2) {
            if (!c20199a.containsKey(parcelable.getClass())) {
                c20199a.put(parcelable.getClass(), Integer.valueOf(c20199a.f25790d));
            }
        }
        parcel.writeInt(c20199a.f25790d);
        for (Map.Entry entry : c20199a.entrySet()) {
            parcel.writeString(((Class) entry.getKey()).getName());
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
        parcel.writeInt(list.size());
        for (Parcelable parcelable2 : list2) {
            parcel.writeInt(((Integer) c20199a.get(parcelable2.getClass())).intValue());
            parcelable2.writeToParcel(parcel, i12);
        }
    }

    @InterfaceC42830m
    public static final <K, V> void f(@Y61.k Parcel parcel, @Y61.l Map<K, ? extends V> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        Iterator itI = com.akita.compose.theme.re23.style.C0.i(parcel, map);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            parcel.writeValue(key);
            parcel.writeValue(value);
        }
    }
}
