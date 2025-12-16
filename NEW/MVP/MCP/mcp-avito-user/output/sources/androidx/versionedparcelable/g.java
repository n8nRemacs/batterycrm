package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.C20199a;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Settings;

/* compiled from: VersionedParcelStream.java */
@RestrictTo
/* loaded from: classes10.dex */
class g extends VersionedParcel {

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f54963m = Charset.forName("UTF-16");

    /* renamed from: d, reason: collision with root package name */
    public final DataInputStream f54964d;

    /* renamed from: e, reason: collision with root package name */
    public final DataOutputStream f54965e;

    /* renamed from: f, reason: collision with root package name */
    public final DataInputStream f54966f;

    /* renamed from: g, reason: collision with root package name */
    public DataOutputStream f54967g;

    /* renamed from: h, reason: collision with root package name */
    public b f54968h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54969i;

    /* renamed from: j, reason: collision with root package name */
    public int f54970j;

    /* renamed from: k, reason: collision with root package name */
    public int f54971k;

    /* renamed from: l, reason: collision with root package name */
    public int f54972l;

    /* compiled from: VersionedParcelStream.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f54974a;

        /* renamed from: b, reason: collision with root package name */
        public final DataOutputStream f54975b;

        /* renamed from: c, reason: collision with root package name */
        public final int f54976c;

        /* renamed from: d, reason: collision with root package name */
        public final DataOutputStream f54977d;

        public b(int i12, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f54974a = byteArrayOutputStream;
            this.f54975b = new DataOutputStream(byteArrayOutputStream);
            this.f54976c = i12;
            this.f54977d = dataOutputStream;
        }
    }

    public g(InputStream inputStream, OutputStream outputStream, C20199a<String, Method> c20199a, C20199a<String, Method> c20199a2, C20199a<String, Class> c20199a3) {
        super(c20199a, c20199a2, c20199a3);
        this.f54970j = 0;
        this.f54971k = -1;
        this.f54972l = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f54964d = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f54965e = dataOutputStream;
        this.f54966f = dataInputStream;
        this.f54967g = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() throws IOException {
        b bVar = this.f54968h;
        if (bVar != null) {
            try {
                if (bVar.f54974a.size() != 0) {
                    b bVar2 = this.f54968h;
                    bVar2.f54975b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = bVar2.f54974a;
                    int size = byteArrayOutputStream.size();
                    int i12 = bVar2.f54976c << 16;
                    int i13 = size >= 65535 ? 65535 : size;
                    DataOutputStream dataOutputStream = bVar2.f54977d;
                    dataOutputStream.writeInt(i12 | i13);
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.f54968h = null;
            } catch (IOException e12) {
                throw new VersionedParcel.ParcelException(e12);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        return new g(this.f54966f, this.f54967g, this.f54952a, this.f54953b, this.f54954c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        try {
            return this.f54966f.readBoolean();
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() throws IOException {
        DataInputStream dataInputStream = this.f54966f;
        try {
            int i12 = dataInputStream.readInt();
            if (i12 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i12];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i12) throws IOException {
        while (true) {
            try {
                int i13 = this.f54971k;
                if (i13 == i12) {
                    return true;
                }
                if (String.valueOf(i13).compareTo(String.valueOf(i12)) > 0) {
                    return false;
                }
                int i14 = this.f54970j;
                int i15 = this.f54972l;
                DataInputStream dataInputStream = this.f54964d;
                if (i14 < i15) {
                    dataInputStream.skip(i15 - i14);
                }
                this.f54972l = -1;
                int i16 = dataInputStream.readInt();
                this.f54970j = 0;
                int i17 = i16 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if (i17 == 65535) {
                    i17 = dataInputStream.readInt();
                }
                this.f54971k = (i16 >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                this.f54972l = i17;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        try {
            return this.f54966f.readInt();
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T m() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() throws IOException {
        DataInputStream dataInputStream = this.f54966f;
        try {
            int i12 = dataInputStream.readInt();
            if (i12 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i12];
            dataInputStream.readFully(bArr);
            return new String(bArr, f54963m);
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i12) throws IOException {
        a();
        b bVar = new b(i12, this.f54965e);
        this.f54968h = bVar;
        this.f54967g = bVar.f54975b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(boolean z12, boolean z13) {
        if (!z12) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f54969i = z13;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z12) throws IOException {
        try {
            this.f54967g.writeBoolean(z12);
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) throws IOException {
        try {
            if (bArr != null) {
                this.f54967g.writeInt(bArr.length);
                this.f54967g.write(bArr);
            } else {
                this.f54967g.writeInt(-1);
            }
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        if (!this.f54969i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i12) throws IOException {
        try {
            this.f54967g.writeInt(i12);
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        if (!this.f54969i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) throws IOException {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f54963m);
                this.f54967g.writeInt(bytes.length);
                this.f54967g.write(bytes);
            } else {
                this.f54967g.writeInt(-1);
            }
        } catch (IOException e12) {
            throw new VersionedParcel.ParcelException(e12);
        }
    }

    /* compiled from: VersionedParcelStream.java */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            g gVar = g.this;
            int i12 = gVar.f54972l;
            if (i12 != -1 && gVar.f54970j >= i12) {
                throw new IOException();
            }
            int i13 = super.read();
            gVar.f54970j++;
            return i13;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j12) throws IOException {
            g gVar = g.this;
            int i12 = gVar.f54972l;
            if (i12 != -1 && gVar.f54970j >= i12) {
                throw new IOException();
            }
            long jSkip = super.skip(j12);
            if (jSkip > 0) {
                gVar.f54970j += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) throws IOException {
            g gVar = g.this;
            int i14 = gVar.f54972l;
            if (i14 != -1 && gVar.f54970j >= i14) {
                throw new IOException();
            }
            int i15 = super.read(bArr, i12, i13);
            if (i15 > 0) {
                gVar.f54970j += i15;
            }
            return i15;
        }
    }
}
