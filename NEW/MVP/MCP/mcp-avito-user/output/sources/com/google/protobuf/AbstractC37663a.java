package com.google.protobuf;

import com.google.protobuf.AbstractC37663a;
import com.google.protobuf.AbstractC37663a.AbstractC10747a;
import com.google.protobuf.AbstractC37700t;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC37707w0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: AbstractMessageLite.java */
/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37663a<MessageType extends AbstractC37663a<MessageType, BuilderType>, BuilderType extends AbstractC10747a<MessageType, BuilderType>> implements InterfaceC37707w0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$b */
    public interface b {
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC10747a.a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC37700t abstractC37700t) {
        if (!abstractC37700t.t()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(T0 t02) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iC2 = t02.c(this);
        setMemoizedSerializedSize(iC2);
        return iC2;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public void setMemoizedSerializedSize(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC37707w0
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.f362603b;
            CodedOutputStream.c cVar = new CodedOutputStream.c(bArr, serializedSize);
            writeTo(cVar);
            if (cVar.J() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e12) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e12);
        }
    }

    @Override // com.google.protobuf.InterfaceC37707w0
    public AbstractC37700t toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC37700t abstractC37700t = AbstractC37700t.f362954c;
            AbstractC37700t.h hVar = new AbstractC37700t.h(serializedSize, null);
            CodedOutputStream codedOutputStream = hVar.f362962a;
            writeTo(codedOutputStream);
            if (codedOutputStream.J() == 0) {
                return new AbstractC37700t.j(hVar.f362963b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e12) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e12);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iD2 = CodedOutputStream.D(serializedSize) + serializedSize;
        if (iD2 > 4096) {
            iD2 = 4096;
        }
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, iD2);
        fVar.X(serializedSize);
        writeTo(fVar);
        if (fVar.f362608f > 0) {
            fVar.f0();
        }
    }

    @Override // com.google.protobuf.InterfaceC37707w0
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = CodedOutputStream.f362603b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, serializedSize);
        writeTo(fVar);
        if (fVar.f362608f > 0) {
            fVar.f0();
        }
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC10747a<MessageType extends AbstractC37663a<MessageType, BuilderType>, BuilderType extends AbstractC10747a<MessageType, BuilderType>> implements InterfaceC37707w0.a {
        public static <T> void a(Iterable<T> iterable, List<? super T> list) {
            Charset charset = C37670d0.f362857a;
            iterable.getClass();
            if (iterable instanceof InterfaceC37684k0) {
                List<?> underlyingElements = ((InterfaceC37684k0) iterable).getUnderlyingElements();
                InterfaceC37684k0 interfaceC37684k0 = (InterfaceC37684k0) list;
                int size = list.size();
                for (Object obj : underlyingElements) {
                    if (obj == null) {
                        String str = "Element at index " + (interfaceC37684k0.size() - size) + " is null.";
                        for (int size2 = interfaceC37684k0.size() - 1; size2 >= size; size2--) {
                            interfaceC37684k0.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof AbstractC37700t) {
                        interfaceC37684k0.u0((AbstractC37700t) obj);
                    } else {
                        interfaceC37684k0.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof M0) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T t12 : iterable) {
                if (t12 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(t12);
            }
        }

        @Override // com.google.protobuf.InterfaceC37707w0.a
        public final AbstractC10747a I2(AbstractC37700t abstractC37700t, M m12) throws InvalidProtocolBufferException {
            try {
                AbstractC37708x abstractC37708xW = abstractC37700t.w();
                m2(abstractC37708xW, m12);
                abstractC37708xW.a(0);
                return this;
            } catch (InvalidProtocolBufferException e12) {
                throw e12;
            } catch (IOException e13) {
                throw new RuntimeException(f("ByteString"), e13);
            }
        }

        @Override // 
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.b clone();

        public final String f(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public abstract GeneratedMessageLite.b g(AbstractC37663a abstractC37663a);

        @Override // com.google.protobuf.InterfaceC37707w0.a
        public final AbstractC10747a h(InterfaceC37707w0 interfaceC37707w0) {
            if (((GeneratedMessageLite.b) this).f362680b.getClass().isInstance(interfaceC37707w0)) {
                return g((AbstractC37663a) interfaceC37707w0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public AbstractC10747a i(int i12, byte[] bArr) throws InvalidProtocolBufferException {
            try {
                AbstractC37708x abstractC37708xJ = AbstractC37708x.j(bArr, 0, i12, false);
                m2(abstractC37708xJ, M.b());
                abstractC37708xJ.a(0);
                return this;
            } catch (InvalidProtocolBufferException e12) {
                throw e12;
            } catch (IOException e13) {
                throw new RuntimeException(f("byte array"), e13);
            }
        }

        @Override // com.google.protobuf.InterfaceC37707w0.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.b m2(AbstractC37708x abstractC37708x, M m12);

        @Override // com.google.protobuf.InterfaceC37707w0.a
        public final AbstractC10747a mergeFrom(byte[] bArr) {
            return i(bArr.length, bArr);
        }

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C10748a extends FilterInputStream {

            /* renamed from: b, reason: collision with root package name */
            public int f362850b;

            public C10748a(InputStream inputStream, int i12) {
                super(inputStream);
                this.f362850b = i12;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f362850b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f362850b <= 0) {
                    return -1;
                }
                int i12 = super.read();
                if (i12 >= 0) {
                    this.f362850b--;
                }
                return i12;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j12) {
                int iSkip = (int) super.skip(Math.min(j12, this.f362850b));
                if (iSkip >= 0) {
                    this.f362850b -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i12, int i13) throws IOException {
                int i14 = this.f362850b;
                if (i14 <= 0) {
                    return -1;
                }
                int i15 = super.read(bArr, i12, Math.min(i13, i14));
                if (i15 >= 0) {
                    this.f362850b -= i15;
                }
                return i15;
            }
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC10747a.a(iterable, list);
    }
}
