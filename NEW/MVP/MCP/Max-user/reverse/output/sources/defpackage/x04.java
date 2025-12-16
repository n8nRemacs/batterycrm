package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class x04 {
    public static y04 a(byte[] bArr) throws ProtoException {
        Tasks.ContactUpdate contactUpdate;
        long j;
        long j2;
        String str;
        int i;
        int i2;
        try {
            contactUpdate = (Tasks.ContactUpdate) fl9.mergeFrom(new Tasks.ContactUpdate(), bArr);
            j = contactUpdate.requestId;
            j2 = contactUpdate.contactId;
            str = contactUpdate.action;
            str.getClass();
            i = 4;
            switch (str) {
                case "REMOVE":
                    i2 = 3;
                    return new y04(i2, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "UPDATE":
                    i = 5;
                case "ADD":
                    i2 = i;
                    return new y04(i2, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "BLOCK":
                    i2 = 1;
                    return new y04(i2, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "UNBLOCK":
                    i2 = 2;
                    return new y04(i2, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                default:
                    throw new IllegalArgumentException(ho7.i("No such value ", str, " for ContactUpdateAction"));
            }
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
