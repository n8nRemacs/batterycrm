package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class w60 {
    public final k18 a;
    public volatile byte[] b;
    public final ArrayList c;
    public final IntEvaluator d;
    public final FloatEvaluator e;
    public final ContextScope f;
    public final tcf g;
    public final hbd h;
    public Integer i;
    public js j;
    public Byte k;
    public Float l;
    public Float m;
    public volatile x9f n;

    public w60(k18 k18Var) {
        o6i o6iVar = o6i.a;
        bwf bwfVarD = o6iVar.getAccessor().d(8);
        bwf bwfVarD2 = o6iVar.getAccessor().d(84);
        this.a = k18Var;
        this.c = new ArrayList();
        this.d = new IntEvaluator();
        this.e = new FloatEvaluator();
        this.f = d7j.a(((q2b) ((lzf) bwfVarD.getValue())).a().limitedParallelism(1, "audiowave_delegate").plus((x74) bwfVarD2.getValue()));
        tcf tcfVarA = ucf.a(null);
        this.g = tcfVarA;
        this.h = new hbd(tcfVarA);
    }

    public final void a() {
        Integer num;
        float fFloatValue;
        Float fValueOf = Float.valueOf(0.0f);
        js jsVar = this.j;
        if (jsVar == null || (num = this.i) == null) {
            return;
        }
        int iIntValue = num.intValue();
        byte[] bArr = this.b;
        if (bArr == null) {
            return;
        }
        Byte b = this.k;
        int i = 0;
        if (b == null) {
            this.k = (byte) 0;
            return;
        }
        float fByteValue = b.byteValue();
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        byte bFloatValue = (byte) this.e.evaluate(0.5f, (Number) Float.valueOf(fByteValue), (Number) Float.valueOf(bArr[bArr.length - 1])).floatValue();
        this.k = Byte.valueOf(bFloatValue);
        float fB = b(bFloatValue);
        r60 r60Var = jsVar.c == iIntValue ? (r60) jsVar.removeFirst() : null;
        if (r60Var == null) {
            r60Var = new r60();
            r60Var.a = 0.0f;
            r60Var.b = 0.0f;
        }
        Float f = this.m;
        r60Var.a = f != null ? f.floatValue() : 0.0f;
        r60Var.b = fB;
        jsVar.addLast(r60Var);
        int i2 = jsVar.c;
        if (8 <= i2) {
            i2 = 8;
        }
        int iCeil = (int) Math.ceil(i2 / 2.0f);
        int i3 = jsVar.c - iCeil;
        tcf tcfVar = this.g;
        ArrayList arrayList = new ArrayList(we3.q(jsVar, 10));
        Iterator it = jsVar.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            r60 r60Var2 = (r60) next;
            if (i < iCeil && jsVar.c >= (iIntValue - iCeil) + i) {
                fFloatValue = this.e.evaluate(n7j.b((iCeil - i) / iCeil, 0.0f, 1.0f), (Number) Float.valueOf(r60Var2.b), (Number) fValueOf).floatValue();
            } else if (i >= i3) {
                float f2 = i - i3;
                float f3 = iCeil - 1.0f;
                if (f3 < 1.0f) {
                    f3 = 1.0f;
                }
                fFloatValue = this.e.evaluate(n7j.b(f2 / f3, 0.0f, 1.0f), (Number) Float.valueOf(r60Var2.b), (Number) fValueOf).floatValue();
            } else {
                fFloatValue = r60Var2.a;
            }
            r60Var2.a = fFloatValue;
            arrayList.add(Float.valueOf(fFloatValue));
            i = i4;
        }
        tcfVar.m(null, new p60(arrayList));
    }

    public final float b(byte b) {
        Float f = this.l;
        if (f != null) {
            float fFloatValue = f.floatValue();
            Float f2 = this.m;
            if (f2 != null) {
                float fFloatValue2 = f2.floatValue();
                float f3 = (fFloatValue / 127) * b;
                return f3 < fFloatValue2 ? fFloatValue2 : f3;
            }
        }
        return 0.0f;
    }
}
