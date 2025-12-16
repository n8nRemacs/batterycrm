package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22877a;
import androidx.datastore.preferences.protobuf.AbstractC22877a.AbstractC1779a;
import androidx.datastore.preferences.protobuf.AbstractC22934w;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.F0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: AbstractMessageLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22877a<MessageType extends AbstractC22877a<MessageType, BuilderType>, BuilderType extends AbstractC1779a<MessageType, BuilderType>> implements F0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$b */
    public interface b {
    }

    public static <T> void c(Iterable<T> iterable, List<? super T> list) {
        Charset charset = C22914m0.f45874a;
        iterable.getClass();
        if (iterable instanceof InterfaceC22927s0) {
            List<?> underlyingElements = ((InterfaceC22927s0) iterable).getUnderlyingElements();
            InterfaceC22927s0 interfaceC22927s0 = (InterfaceC22927s0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC22927s0.size() - size) + " is null.";
                    for (int size2 = interfaceC22927s0.size() - 1; size2 >= size; size2--) {
                        interfaceC22927s0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC22934w) {
                    interfaceC22927s0.n4((AbstractC22934w) obj);
                } else {
                    interfaceC22927s0.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof Y0) {
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

    public int d() {
        throw new UnsupportedOperationException();
    }

    public final int e(InterfaceC22897g1 interfaceC22897g1) {
        int iD2 = d();
        if (iD2 != -1) {
            return iD2;
        }
        int iA2 = interfaceC22897g1.a(this);
        f(iA2);
        return iA2;
    }

    public void f(int i12) {
        throw new UnsupportedOperationException();
    }

    public final void g(OutputStream outputStream) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int serializedSize = generatedMessageLite.getSerializedSize();
        Logger logger = CodedOutputStream.f45598b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, serializedSize);
        generatedMessageLite.b(fVar);
        if (fVar.f45603f > 0) {
            fVar.e0();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.F0
    public final AbstractC22934w toByteString() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int serializedSize = generatedMessageLite.getSerializedSize();
            AbstractC22934w abstractC22934w = AbstractC22934w.f45925c;
            AbstractC22934w.h hVar = new AbstractC22934w.h(serializedSize, null);
            CodedOutputStream codedOutputStream = hVar.f45933a;
            generatedMessageLite.b(codedOutputStream);
            CodedOutputStream.c cVar = (CodedOutputStream.c) codedOutputStream;
            if (cVar.f45605e - cVar.f45606f == 0) {
                return new AbstractC22934w.j(hVar.f45934b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e12) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e12);
        }
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1779a<MessageType extends AbstractC22877a<MessageType, BuilderType>, BuilderType extends AbstractC1779a<MessageType, BuilderType>> implements F0.a {
        @Override // 
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.b clone();

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: androidx.datastore.preferences.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C1780a extends FilterInputStream {

            /* renamed from: b, reason: collision with root package name */
            public int f45800b;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f45800b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f45800b <= 0) {
                    return -1;
                }
                int i12 = super.read();
                if (i12 >= 0) {
                    this.f45800b--;
                }
                return i12;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j12) throws IOException {
                long jSkip = super.skip(Math.min(j12, this.f45800b));
                if (jSkip >= 0) {
                    this.f45800b = (int) (this.f45800b - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i12, int i13) throws IOException {
                int i14 = this.f45800b;
                if (i14 <= 0) {
                    return -1;
                }
                int i15 = super.read(bArr, i12, Math.min(i13, i14));
                if (i15 >= 0) {
                    this.f45800b -= i15;
                }
                return i15;
            }
        }
    }
}
