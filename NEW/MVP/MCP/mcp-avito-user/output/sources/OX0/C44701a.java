package oX0;

import java.io.CharConversionException;
import java.io.InputStream;

/* compiled from: ByteSourceJsonBootstrapper.java */
/* renamed from: oX0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44701a {

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.core.io.f f419808a;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f419810c;

    /* renamed from: e, reason: collision with root package name */
    public int f419812e;

    /* renamed from: h, reason: collision with root package name */
    public int f419815h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f419814g = true;

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f419809b = null;

    /* renamed from: d, reason: collision with root package name */
    public int f419811d = 0;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f419813f = false;

    public C44701a(com.fasterxml.jackson.core.io.f fVar, byte[] bArr, int i12) {
        this.f419808a = fVar;
        this.f419810c = bArr;
        this.f419812e = i12;
    }

    public static void b(String str) {
        throw new CharConversionException(AK.c.k("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public final boolean a(int i12) {
        int i13;
        int i14 = this.f419812e - this.f419811d;
        while (i14 < i12) {
            InputStream inputStream = this.f419809b;
            if (inputStream == null) {
                i13 = -1;
            } else {
                int i15 = this.f419812e;
                byte[] bArr = this.f419810c;
                i13 = inputStream.read(bArr, i15, bArr.length - i15);
            }
            if (i13 < 1) {
                return false;
            }
            this.f419812e += i13;
            i14 += i13;
        }
        return true;
    }
}
