package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rbd implements r9i {
    public int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public rbd(int i, int i2, float[] fArr, float[] fArr2) {
        this.f = IntBuffer.allocate(1);
        this.g = IntBuffer.allocate(2);
        this.a = i;
        this.b = i2;
        this.c = 2;
        this.e = 5;
        this.d = 4;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        this.i = floatBufferAsFloatBuffer2;
    }

    public static rbd c(rbd rbdVar, int i, gge ggeVar, zmd zmdVar, int i2) {
        if ((i2 & 1) != 0) {
            i = rbdVar.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            ggeVar = (gge) rbdVar.h;
        }
        gge ggeVar2 = ggeVar;
        if ((i2 & 4) != 0) {
            zmdVar = (zmd) rbdVar.i;
        }
        int i4 = rbdVar.c;
        int i5 = rbdVar.d;
        int i6 = rbdVar.e;
        return new rbd((mbd) rbdVar.f, (ArrayList) rbdVar.g, i3, ggeVar2, zmdVar, i4, i5, i6);
    }

    @Override // defpackage.r9i
    public void a() {
        GLES20.glDeleteBuffers(2, (IntBuffer) this.g);
        dui.b("glDeleteBuffers");
        GLES30.glDeleteVertexArrays(1, (IntBuffer) this.f);
        dui.b("glDeleteVertexArrays");
    }

    @Override // defpackage.r9i
    public void b() {
        int i = this.a;
        FloatBuffer floatBuffer = (FloatBuffer) this.i;
        FloatBuffer floatBuffer2 = (FloatBuffer) this.h;
        IntBuffer intBuffer = (IntBuffer) this.g;
        IntBuffer intBuffer2 = (IntBuffer) this.f;
        if (intBuffer2.get(0) == 0) {
            if (floatBuffer2 == null || floatBuffer == null) {
                return;
            }
            GLES30.glGenVertexArrays(1, intBuffer2);
            GLES20.glGenBuffers(2, intBuffer);
            GLES20.glBindBuffer(34962, intBuffer.get(0));
            dui.b("glBindBuffer");
            GLES20.glBufferData(34962, floatBuffer2.remaining() * 4, floatBuffer2, 35044);
            dui.b("glBufferData");
            GLES20.glBindBuffer(34962, 0);
            dui.b("glBindBuffer");
            GLES20.glBindBuffer(34962, intBuffer.get(1));
            dui.b("glBindBuffer");
            GLES20.glBufferData(34962, floatBuffer.remaining() * 4, floatBuffer, 35044);
            dui.b("glBufferData");
            GLES20.glBindBuffer(34962, 0);
            dui.b("glBindBuffer");
            GLES30.glBindVertexArray(intBuffer2.get(0));
            dui.b("glBindVertexArray");
            intBuffer.rewind();
            GLES20.glBindBuffer(34962, intBuffer.get(0));
            dui.b("glBindBuffer");
            int i2 = this.a;
            int i3 = this.c;
            GLES20.glVertexAttribPointer(i2, i3, 5126, false, i3 * 4, 0);
            dui.b("glVertexAttribPointer");
            GLES20.glBindBuffer(34962, 0);
            dui.b("glBindBuffer");
            intBuffer.rewind();
            GLES20.glBindBuffer(34962, intBuffer.get(1));
            dui.b("glBindBuffer");
            GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, 0);
            dui.b("glVertexAttribPointer");
            GLES20.glBindBuffer(34962, 0);
            dui.b("glBindBuffer");
            GLES30.glBindVertexArray(0);
            dui.b("glBindVertexArray");
        }
        GLES30.glBindVertexArray(intBuffer2.get(0));
        dui.b("glBindVertexArray");
        GLES20.glEnableVertexAttribArray(i);
        dui.b("glEnableVertexAttribArray");
        int i4 = this.b;
        GLES20.glEnableVertexAttribArray(i4);
        dui.b("glEnableVertexAttribArray");
        GLES20.glDrawArrays(this.e, 0, this.d);
        dui.b("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i);
        dui.b("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(i4);
        dui.b("glDisableVertexAttribArray");
        GLES30.glBindVertexArray(0);
        dui.b("glBindVertexArray");
    }

    public ood d(zmd zmdVar) {
        gge ggeVar = (gge) this.h;
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        int i = this.b;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.a++;
        if (ggeVar != null) {
            gj5 gj5Var = (gj5) ggeVar.d;
            ga7 ga7Var = zmdVar.b;
            ga7 ga7Var2 = gj5Var.h.a;
            if (ga7Var.f != ga7Var2.f || !fni.a(ga7Var.e, ga7Var2.e)) {
                throw new IllegalStateException(("network interceptor " + ((bp7) arrayList.get(i - 1)) + " must retain the same host and port").toString());
            }
            if (this.a != 1) {
                throw new IllegalStateException(("network interceptor " + ((bp7) arrayList.get(i - 1)) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        rbd rbdVarC = c(this, i2, null, zmdVar, 58);
        bp7 bp7Var = (bp7) arrayList.get(i);
        ood oodVarA = bp7Var.a(rbdVarC);
        if (oodVarA == null) {
            throw new NullPointerException("interceptor " + bp7Var + " returned null");
        }
        if (ggeVar != null && i2 < arrayList.size() && rbdVarC.a != 1) {
            throw new IllegalStateException(("network interceptor " + bp7Var + " must call proceed() exactly once").toString());
        }
        if (oodVarA.Y != null) {
            return oodVarA;
        }
        throw new IllegalStateException(("interceptor " + bp7Var + " returned a response with no body").toString());
    }

    public rbd(mbd mbdVar, ArrayList arrayList, int i, gge ggeVar, zmd zmdVar, int i2, int i3, int i4) {
        this.f = mbdVar;
        this.g = arrayList;
        this.b = i;
        this.h = ggeVar;
        this.i = zmdVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
