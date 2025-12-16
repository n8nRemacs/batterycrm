package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractParser.java */
/* loaded from: classes8.dex */
public abstract class b<MessageType extends o> implements q<MessageType> {
    static {
        int i12 = f.f409348b;
    }

    public static void b(o oVar) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (oVar == null || oVar.isInitialized()) {
            return;
        }
        if (oVar instanceof a) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.f409295b = oVar;
        throw invalidProtocolBufferException;
    }

    public final o c(ByteArrayInputStream byteArrayInputStream, f fVar) throws IOException {
        MessageType messagetype;
        try {
            int i12 = byteArrayInputStream.read();
            if (i12 == -1) {
                messagetype = null;
            } else {
                if ((i12 & 128) != 0) {
                    i12 &= 127;
                    int i13 = 7;
                    while (true) {
                        if (i13 >= 32) {
                            while (i13 < 64) {
                                int i14 = byteArrayInputStream.read();
                                if (i14 == -1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                if ((i14 & 128) != 0) {
                                    i13 += 7;
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                        int i15 = byteArrayInputStream.read();
                        if (i15 == -1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        i12 |= (i15 & 127) << i13;
                        if ((i15 & 128) == 0) {
                            break;
                        }
                        i13 += 7;
                    }
                }
                e eVar = new e(new a.AbstractC11678a.C11679a(byteArrayInputStream, i12));
                MessageType messagetypeA = a(eVar, fVar);
                try {
                    eVar.a(0);
                    messagetype = messagetypeA;
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = messagetypeA;
                    throw e12;
                }
            }
            b(messagetype);
            return messagetype;
        } catch (IOException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        }
    }
}
