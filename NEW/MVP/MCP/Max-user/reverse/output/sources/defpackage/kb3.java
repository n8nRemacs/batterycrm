package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kb3 extends g7c {
    public List a;
    public ArrayList b;
    public int c;

    @Override // defpackage.rn5
    public final byte[] a() {
        int iSum = this.a.stream().mapToInt(new n0(7)).sum();
        int iSum2 = this.b.stream().mapToInt(new n0(8)).sum();
        int i = iSum + 4 + iSum2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 4);
        byteBufferAllocate.putShort(kbg.pre_shared_key.a);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) iSum);
        for (jb3 jb3Var : this.a) {
            byteBufferAllocate.putShort((short) jb3Var.a.length);
            byteBufferAllocate.put(jb3Var.a);
            byteBufferAllocate.putInt((int) jb3Var.b);
        }
        this.c = byteBufferAllocate.position();
        byteBufferAllocate.putShort((short) iSum2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ib3 ib3Var = (ib3) it.next();
            byteBufferAllocate.put((byte) ib3Var.a.length);
            byteBufferAllocate.put(ib3Var.a);
        }
        byte[] bArr = new byte[byteBufferAllocate.position()];
        byteBufferAllocate.get(bArr);
        return bArr;
    }
}
