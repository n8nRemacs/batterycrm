package com.google.android.play.core.splitinstall.internal;

import androidx.media3.common.C23088b;
import java.lang.reflect.Field;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    public final Object f358734a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f358735b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f358736c;

    public J(Object obj, Field field, Class cls) {
        this.f358734a = obj;
        this.f358735b = field;
        this.f358736c = cls;
    }

    public final Object a() {
        Object obj = this.f358734a;
        Field field = this.f358735b;
        Class cls = this.f358736c;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e12) {
            String name = field.getName();
            String name2 = obj.getClass().getName();
            String name3 = cls.getName();
            StringBuilder sbB = C23088b.b("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            sbB.append(name3);
            throw new zzbl(sbB.toString(), e12);
        }
    }

    public final void b(Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object obj2 = this.f358734a;
        Field field = this.f358735b;
        try {
            field.set(obj2, obj);
        } catch (Exception e12) {
            String name = field.getName();
            String name2 = obj2.getClass().getName();
            String name3 = this.f358736c.getName();
            StringBuilder sbB = C23088b.b("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            sbB.append(name3);
            throw new zzbl(sbB.toString(), e12);
        }
    }
}
