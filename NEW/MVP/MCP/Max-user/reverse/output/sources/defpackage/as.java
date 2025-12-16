package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.function.Consumer;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final /* synthetic */ class as implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ as(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                byte[] bytes = ((String) obj).getBytes(Charset.forName("UTF-8"));
                byte length = (byte) bytes.length;
                ByteBuffer byteBuffer = this.b;
                byteBuffer.put(length);
                byteBuffer.put(bytes);
                return;
            case 1:
                X500Principal x500Principal = (X500Principal) obj;
                short length2 = (short) x500Principal.getEncoded().length;
                ByteBuffer byteBuffer2 = this.b;
                byteBuffer2.putShort(length2);
                byteBuffer2.put(x500Principal.getEncoded());
                return;
            case 2:
                byte[] bArr = (byte[]) obj;
                if (bArr.length > 65520) {
                    throw new RuntimeException("Certificate size not supported");
                }
                ByteBuffer byteBuffer3 = this.b;
                byteBuffer3.put((byte) 0);
                byteBuffer3.putShort((short) bArr.length);
                byteBuffer3.put(bArr);
                byteBuffer3.putShort((short) 0);
                return;
            case 3:
                this.b.put((byte[]) obj);
                return;
            case 4:
                this.b.put(((nbg) obj).a);
                return;
            case 5:
                ((atc) obj).g(this.b);
                return;
            case 6:
                this.b.put(((zzg) obj).a());
                return;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                if (((Long) entry.getKey()).longValue() != 8 || ((Long) entry.getValue()).longValue() == 1) {
                    long jLongValue = ((Long) entry.getKey()).longValue();
                    ByteBuffer byteBuffer4 = this.b;
                    epi.c(jLongValue, byteBuffer4);
                    epi.c(((Long) entry.getValue()).longValue(), byteBuffer4);
                    return;
                }
                return;
            default:
                this.b.put(((zzg) obj).a());
                return;
        }
    }
}
