package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public final class hqc extends rn5 {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public hqc(int i, ByteBuffer byteBuffer) throws DecodeErrorException {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList();
                int iB = b(byteBuffer, kbg.supported_groups.a, 4);
                short s = byteBuffer.getShort();
                if (iB != s + 2) {
                    throw new DecodeErrorException("inconsistent length");
                }
                if (s % 2 != 0) {
                    throw new DecodeErrorException("invalid group length");
                }
                for (int i2 = 0; i2 < s; i2 += 2) {
                    Arrays.stream(mbg.values()).filter(new fb3(byteBuffer.getShort() % 65535, 5)).findFirst().ifPresent(new m4(23, this));
                }
                return;
            default:
                this.b = new ArrayList();
                int iB2 = b(byteBuffer, kbg.psk_key_exchange_modes.a, 2);
                byte b = byteBuffer.get();
                if (iB2 != b + 1) {
                    throw new DecodeErrorException("inconsistent length");
                }
                for (int i3 = 0; i3 < b; i3++) {
                    Arrays.stream(nbg.values()).filter(new fb3(byteBuffer.get(), 6)).findFirst().ifPresent(new m4(17, this));
                }
                return;
        }
    }

    @Override // defpackage.rn5
    public final byte[] a() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                short size = (short) (arrayList.size() + 1);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
                byteBufferAllocate.putShort(kbg.psk_key_exchange_modes.a);
                byteBufferAllocate.putShort(size);
                byteBufferAllocate.put((byte) arrayList.size());
                arrayList.forEach(new as(4, byteBufferAllocate));
                return byteBufferAllocate.array();
            default:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size() * 2;
                int i = size2 + 2;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(size2 + 6);
                byteBufferAllocate2.putShort(kbg.supported_groups.a);
                byteBufferAllocate2.putShort((short) i);
                byteBufferAllocate2.putShort((short) (arrayList2.size() * 2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    byteBufferAllocate2.putShort(((mbg) it.next()).a);
                }
                return byteBufferAllocate2.array();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "SupportedGroupsExtension" + this.b;
            default:
                return super.toString();
        }
    }

    public hqc(mbg mbgVar) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(mbgVar);
    }

    public hqc(nbg nbgVar) {
        this.a = 0;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(nbgVar);
    }

    public hqc(nbg[] nbgVarArr) {
        this.a = 0;
        this.b = new ArrayList();
        for (nbg nbgVar : nbgVarArr) {
            this.b.add(nbgVar);
        }
    }
}
