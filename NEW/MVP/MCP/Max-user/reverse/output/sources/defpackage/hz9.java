package defpackage;

import android.graphics.Typeface;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final class hz9 {
    public final az9 a;
    public final char[] b;
    public final gz9 c = new gz9(1024);
    public final Typeface d;

    public hz9(Typeface typeface, az9 az9Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = az9Var;
        int iA = az9Var.a(6);
        if (iA != 0) {
            int i5 = iA + az9Var.a;
            i = ((ByteBuffer) az9Var.d).getInt(((ByteBuffer) az9Var.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = az9Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + az9Var.a;
            i2 = ((ByteBuffer) az9Var.d).getInt(((ByteBuffer) az9Var.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            zog zogVar = new zog(this, i7);
            zy9 zy9VarB = zogVar.b();
            int iA3 = zy9VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) zy9VarB.d).getInt(iA3 + zy9VarB.a) : 0, this.b, i7 * 2);
            zy9 zy9VarB2 = zogVar.b();
            int iA4 = zy9VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + zy9VarB2.a;
                i3 = ((ByteBuffer) zy9VarB2.d).getInt(((ByteBuffer) zy9VarB2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            z5j.a("invalid metadata codepoint length", i3 > 0);
            gz9 gz9Var = this.c;
            zy9 zy9VarB3 = zogVar.b();
            int iA5 = zy9VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + zy9VarB3.a;
                i4 = ((ByteBuffer) zy9VarB3.d).getInt(((ByteBuffer) zy9VarB3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            gz9Var.a(zogVar, 0, i4 - 1);
        }
    }

    public static hz9 a(Typeface typeface, MappedByteBuffer mappedByteBuffer) {
        try {
            int i = beg.a;
            Trace.beginSection("EmojiCompat.MetadataRepo.create");
            ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
            byteBufferDuplicate.position((int) swi.b(new x6i(byteBufferDuplicate)).b);
            az9 az9Var = new az9();
            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
            int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
            az9Var.d = byteBufferDuplicate;
            az9Var.a = iPosition;
            int i2 = iPosition - byteBufferDuplicate.getInt(iPosition);
            az9Var.b = i2;
            az9Var.c = ((ByteBuffer) az9Var.d).getShort(i2);
            hz9 hz9Var = new hz9(typeface, az9Var);
            Trace.endSection();
            return hz9Var;
        } catch (Throwable th) {
            int i3 = beg.a;
            Trace.endSection();
            throw th;
        }
    }
}
