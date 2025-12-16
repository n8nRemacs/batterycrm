package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class o8a extends sn8 implements py7 {
    public final atb d;
    public Object o;

    public o8a(atb atbVar, Object obj, Object obj2) {
        super(obj, 0, obj2);
        this.d = atbVar;
        this.o = obj2;
    }

    @Override // defpackage.sn8, java.util.Map.Entry
    public final Object getValue() {
        return this.o;
    }

    @Override // defpackage.sn8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.o;
        this.o = obj;
        ysb ysbVar = this.d.a;
        xsb xsbVar = ysbVar.d;
        Object obj3 = this.b;
        if (!xsbVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ysbVar.c;
        if (!z) {
            xsbVar.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            vig vigVar = ysbVar.a[ysbVar.b];
            Object obj4 = vigVar.a[vigVar.c];
            xsbVar.put(obj3, obj);
            ysbVar.c(obj4 == null ? 0 : obj4.hashCode(), xsbVar.c, obj4, 0);
        }
        ysbVar.Y = xsbVar.o;
        return obj2;
    }
}
