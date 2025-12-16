package net.bytebuddy.utility;

import java.lang.reflect.Field;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FieldComparator implements Comparator<Field> {

    /* renamed from: b, reason: collision with root package name */
    public static final FieldComparator f418851b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FieldComparator[] f418852c;

    static {
        FieldComparator fieldComparator = new FieldComparator("INSTANCE", 0);
        f418851b = fieldComparator;
        f418852c = new FieldComparator[]{fieldComparator};
    }

    public FieldComparator() {
        throw null;
    }

    public static FieldComparator valueOf(String str) {
        return (FieldComparator) Enum.valueOf(FieldComparator.class, str);
    }

    public static FieldComparator[] values() {
        return (FieldComparator[]) f418852c.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Field field, Field field2) {
        Field field3 = field;
        Field field4 = field2;
        if (field3 == field4) {
            return 0;
        }
        int iCompareTo = field3.getName().compareTo(field4.getName());
        return iCompareTo == 0 ? field3.getType().getName().compareTo(field4.getType().getName()) : iCompareTo;
    }
}
