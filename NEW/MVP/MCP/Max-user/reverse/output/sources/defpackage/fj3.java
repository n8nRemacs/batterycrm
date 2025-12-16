package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class fj3 {
    public static gj3 a(byte[] bArr) throws ProtoException {
        Object next;
        try {
            Tasks.Complain complain = (Tasks.Complain) fl9.mergeFrom(new Tasks.Complain(), bArr);
            long j = complain.requestId;
            byte b = (byte) complain.typeId;
            f2 f2Var = new f2(0, rj3.u0);
            while (true) {
                if (!f2Var.hasNext()) {
                    next = null;
                    break;
                }
                next = f2Var.next();
                if (((rj3) next).a == b) {
                    break;
                }
            }
            rj3 rj3Var = (rj3) next;
            if (rj3Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            byte b2 = (byte) complain.reasonId;
            long[] jArr = complain.ids;
            long[] jArr2 = complain.serverIds;
            long j2 = complain.parentId;
            return new gj3(j, rj3Var, b2, jArr, jArr2, j2 != 0 ? Long.valueOf(j2) : null, complain.details);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
