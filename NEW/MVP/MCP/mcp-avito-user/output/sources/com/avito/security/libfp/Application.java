package com.avito.security.libfp;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.List;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.InflaterOutputStream;

/* loaded from: classes5.dex */
public class Application {

    /* renamed from: F, reason: collision with root package name */
    private static Object f338597F;

    /* renamed from: Gj, reason: collision with root package name */
    private static Object[] f338598Gj;
    private static boolean JExj;

    /* renamed from: f, reason: collision with root package name */
    private static byte[] f338599f;

    /* renamed from: com.avito.security.libfp.Application$Application, reason: collision with other inner class name */
    public class C10496Application extends Inflater {

        /* renamed from: pl, reason: collision with root package name */
        l f338600pl;

        /* renamed from: com.avito.security.libfp.Application$Application$Application, reason: collision with other inner class name */
        public class C10497Application {
            public static native void d();

            public static native void e();

            public static native void f();

            public static native void n();

            public static native void r();

            public static native void x();
        }

        /* renamed from: com.avito.security.libfp.Application$Application$FingerprintService */
        public class FingerprintService extends ContextWrapper {
            public FingerprintService(Context context) {
                super(context);
            }

            public static Context GcgDigqtB() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
                Context contextIzcmgFB = (Context) Class.forName(Application.AbliGG("\uf20f\uecf6렱쌙褆鿯㬫ꛮ崈瓼昕ۥѾ戈䊋ಂꂐ\ue817㋼\ud82b䪗꜂赍\udc34뀘凌")).getDeclaredMethod(Application.AbliGG("\uf20d\ueced렧쌙褌鿨㬻ꚁ崙瓼昉ڢќ戊䊋ಂꂉ\ue810"), null).invoke(null, null);
                if (contextIzcmgFB == null) {
                    contextIzcmgFB = izcmgFB();
                }
                return new FingerprintService(contextIzcmgFB);
            }

            private static Context izcmgFB() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
                Thread thread = Looper.getMainLooper().getThread();
                Class<?> cls = Class.forName(Application.AbliGG("ꦯ냱矰䠸\uedf2\ue754\ueea8\ue801껣\uf699১㜪煠홆ढ़\uf5c4퇩뤶돑\udb33\uf210\uf1a3\udc77㕿\ued2d⟅"));
                Field declaredField = thread.getClass().getDeclaredField(Application.AbliGG("ꦢ냰矷䠫\uedf1\ue76b\ueead\ue843껷\uf68c\u09e4"));
                declaredField.setAccessible(true);
                Object obj = declaredField.get(thread);
                Field declaredField2 = obj.getClass().getDeclaredField(Application.AbliGG("ꦺ냾矶䠦\uedf8"));
                declaredField2.setAccessible(true);
                Object[] objArr = (Object[]) declaredField2.get(obj);
                for (int i12 = 1; i12 < objArr.length; i12 += 2) {
                    Object obj2 = objArr[i12];
                    if (obj2 != null && obj2.getClass() == cls) {
                        return (Context) cls.getDeclaredMethod(Application.AbliGG("ꦩ냺矠䠋\ueded\ue74d\ueea0\ue846껡\uf688ৣ㝭煎홋"), new Class[0]).invoke(obj2, new Object[0]);
                    }
                }
                return null;
            }
        }

        public C10496Application(l lVar) {
            super(false);
            this.f338600pl = lVar;
        }

        @Override // java.util.zip.Inflater
        public void setInput(byte[] bArr, int i12, int i13) {
            this.f338600pl.fgt(bArr, i12, i13);
            super.setInput(bArr, i12, i13);
        }
    }

    public class BD extends FilterInputStream {
        l auB;

        /* renamed from: n, reason: collision with root package name */
        private byte[] f338601n;

        public BD(InputStream inputStream, l lVar) {
            super(inputStream);
            this.f338601n = new byte[1];
            this.auB = lVar;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized int read() {
            int i12;
            i12 = -1;
            if (read(this.f338601n, 0, 1) != -1) {
                i12 = this.f338601n[0] & 255;
            }
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i12, int i13) throws IOException {
            int i14 = super.read(bArr, i12, i13);
            if (i14 > 0) {
                this.auB.fgt(bArr, i12, i14);
            }
            return i14;
        }
    }

    public class l extends FilterInputStream {
        private static Object[] Biud;
        int JAjE;

        /* renamed from: n, reason: collision with root package name */
        int[] f338602n;

        private l(InputStream inputStream) throws IOException {
            InputStream bd2;
            super(new PushbackInputStream(inputStream, 4));
            try {
                dyrG();
                this.f338602n = new int[4];
                this.JAjE = 0;
            } catch (Exception unused) {
            }
            byte[] bArr = (byte[]) Biud[7];
            byte[] bArr2 = new byte[16];
            IOException e12 = null;
            char c12 = 0;
            while (c12 == 0) {
                c12 = 3;
                try {
                    int i12 = ((FilterInputStream) this).in.read(bArr2, 0, 4);
                    if (i12 > 0) {
                        if (i12 == 4 && bArr2[0] == bArr[0] && bArr2[1] == bArr[1] && bArr2[2] == bArr[2] && bArr2[3] == bArr[3] + 1) {
                            ((FilterInputStream) this).in.read(bArr2, 4, 12);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int[] iArr = this.f338602n;
                                iArr[i13 / 4] = (iArr[i13 / 4] << 8) | (bArr2[i13] & 255);
                            }
                            bd2 = new InflaterInputStream(((FilterInputStream) this).in, new C10496Application(this));
                        } else {
                            if (i12 != 4 || bArr2[0] != bArr[0] || bArr2[1] != bArr[1] || bArr2[2] != bArr[2] || bArr2[3] != bArr[3]) {
                                ((PushbackInputStream) ((FilterInputStream) this).in).unread(bArr2, 0, 4);
                                return;
                            }
                            ((FilterInputStream) this).in.read(bArr2, 4, 12);
                            for (int i14 = 0; i14 < 16; i14++) {
                                int[] iArr2 = this.f338602n;
                                iArr2[i14 / 4] = (iArr2[i14 / 4] << 8) | (bArr2[i14] & 255);
                            }
                            bd2 = new BD(((FilterInputStream) this).in, this);
                        }
                        ((FilterInputStream) this).in = bd2;
                        return;
                    }
                    return;
                } catch (IOException e13) {
                    e12 = e13;
                }
            }
            throw e12;
        }

        public static final void dyrG() throws NumberFormatException {
            int i12 = 256;
            int[] iArr = new int[256];
            byte[] bArr = new byte[256];
            int[] iArr2 = new int[256];
            int[] iArr3 = new int[256];
            int[] iArr4 = new int[256];
            int[] iArr5 = new int[256];
            int[] iArr6 = new int[30];
            int i13 = 0;
            loop0: while (i13 == 0) {
                i13 += 2;
                int i14 = 1;
                for (int i15 = 0; i15 < i12; i15++) {
                    try {
                        iArr[i15] = i14;
                        i14 ^= (i14 << 1) ^ ((i14 >>> 7) * 283);
                    } catch (Exception unused) {
                    }
                }
                bArr[0] = 99;
                for (int i16 = 0; i16 < 255; i16++) {
                    int i17 = iArr[255 - i16];
                    int i18 = i17 | (i17 << 8);
                    bArr[iArr[i16]] = (byte) ((i18 ^ ((((i18 >> 4) ^ (i18 >> 5)) ^ (i18 >> 6)) ^ (i18 >> 7))) ^ 99);
                }
                int i19 = 0;
                while (i19 < i12) {
                    int i22 = bArr[i19] & 255;
                    int i23 = ((i22 >>> 7) * 283) ^ (i22 << 1);
                    int i24 = i23 ^ ((i22 << 8) ^ (((i22 ^ i23) << 24) ^ (i22 << 16)));
                    try {
                        iArr2[i19] = i24;
                        iArr3[i19] = (i24 << 8) | (i24 >>> (-8));
                        iArr4[i19] = (i24 << 16) | (i24 >>> (-16));
                        iArr5[i19] = (i24 >>> (-24)) | (i24 << 24);
                        i19++;
                        i12 = 256;
                    } catch (Exception unused2) {
                        i12 = 256;
                    }
                }
                int i25 = 1;
                for (int i26 = 0; i26 < 30; i26++) {
                    iArr6[i26] = i25;
                    i25 = ((i25 >>> 7) * 283) ^ (i25 << 1);
                }
            }
            byte[] bArr2 = null;
            boolean z12 = false;
            loop5: while (true) {
                if (z12) {
                    break;
                }
                try {
                    long j12 = Long.parseLong("-6227459957257491891") ^ (((Long.MAX_VALUE - System.currentTimeMillis()) >> 63) & 1);
                    long j13 = Long.parseLong("297702344275325432");
                    bArr2 = new byte[16];
                    int i27 = 0;
                    for (int i28 = 16; i27 < i28; i28 = 16) {
                        int[] iArr7 = iArr6;
                        try {
                            bArr2[i27] = (byte) (((i27 > 7 ? j13 : j12) >> ((7 - (i27 % 8)) * 8)) & 255);
                            i27++;
                            iArr6 = iArr7;
                        } catch (Exception unused3) {
                            iArr6 = iArr7;
                        }
                    }
                    break loop5;
                } catch (Exception unused4) {
                }
                z12 = true;
            }
            int[] iArr8 = iArr6;
            int length = bArr2.length / 4;
            int i29 = length + 7;
            char c12 = 2;
            int[][] iArr9 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i29, 4);
            int i32 = 0;
            int i33 = 0;
            while (i32 < bArr2.length) {
                iArr9[i33 >> 2][i33 & 3] = (bArr2[i32] & 255) | ((bArr2[i32 + 1] & 255) << 8) | ((bArr2[i32 + 2] & 255) << 16) | (bArr2[i32 + 3] << 24);
                i32 += 4;
                i33++;
                c12 = 2;
            }
            int i34 = i29 << 2;
            for (int i35 = length; i35 < i34; i35++) {
                int i36 = i35 - 1;
                int iPmxIqw = iArr9[i36 >> 2][i36 & 3];
                int i37 = i35 % length;
                if (i37 == 0) {
                    iPmxIqw = pmxIqw(bArr, gE(iPmxIqw, 8)) ^ iArr8[(i35 / length) - 1];
                } else if (length > 6 && i37 == 4) {
                    iPmxIqw = pmxIqw(bArr, iPmxIqw);
                }
                int i38 = i35 - length;
                iArr9[i35 >> 2][i35 & 3] = iArr9[i38 >> 2][i38 & 3] ^ iPmxIqw;
            }
            byte[] bArr3 = new byte[4];
            try {
                int i39 = Integer.parseInt("-1747610166");
                for (int i42 = 0; i42 < 4; i42++) {
                    bArr3[i42] = (byte) ((i39 >> ((3 - (i42 % 8)) * 8)) & 255);
                }
            } catch (Exception unused5) {
            }
            Biud = new Object[]{bArr, iArr2, iArr3, iArr4, iArr5, iArr9, new int[]{Integer.parseInt("1285057772"), Integer.parseInt("-1786974563"), Integer.parseInt("2064374138"), Integer.parseInt("162451534")}, bArr3};
        }

        private static int gE(int i12, int i13) {
            return (i12 << (-i13)) | (i12 >>> i13);
        }

        public static InputStream lGIzI(InputStream inputStream) {
            return new l(inputStream);
        }

        private static int pmxIqw(byte[] bArr, int i12) {
            int i13 = bArr[14] << 16;
            int i14 = 0;
            while (i14 == 0) {
                i14 += 3;
                try {
                    return (bArr[i12 & 255] & 255) | ((bArr[(i12 >> 8) & 255] & 255) << 8) | ((bArr[(i12 >> 16) & 255] & 255) << 16) | (bArr[(i12 >> 24) & 255] << 24);
                } catch (Exception unused) {
                }
            }
            try {
                return bArr[i12 & 127] >> 8;
            } catch (Exception unused2) {
                return i13;
            }
        }

        public final void fgt(byte[] bArr, int i12, int i13) {
            byte[] bArr2;
            int i14;
            char c12;
            int i15;
            int i16;
            int i17;
            int[] iArr;
            int i18;
            int i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int[] iArr2;
            l lVar = this;
            Object[] objArr = Biud;
            int[][] iArr3 = (int[][]) objArr[5];
            int i26 = 1;
            int[] iArr4 = (int[]) objArr[1];
            int i27 = 2;
            int[] iArr5 = (int[]) objArr[2];
            char c13 = 3;
            int[] iArr6 = (int[]) objArr[3];
            int i28 = 4;
            int[] iArr7 = (int[]) objArr[4];
            int i29 = 0;
            byte[] bArr3 = (byte[]) objArr[0];
            int i32 = i13;
            int i33 = 0;
            while (i33 < i32) {
                int i34 = lVar.JAjE;
                int i35 = (i34 % 16) / i28;
                int i36 = (i34 % 16) % 4;
                if (i34 % 16 == 0) {
                    int i37 = i29;
                    while (i37 == 0) {
                        i37 += 3;
                        try {
                            int[] iArr8 = lVar.f338602n;
                            int i38 = iArr8[i29];
                            int[] iArr9 = iArr3[i29];
                            iArr8[i29] = i38 ^ iArr9[i29];
                            iArr8[i26] = iArr8[i26] ^ iArr9[i26];
                            iArr8[i27] = iArr8[i27] ^ iArr9[i27];
                            iArr8[c13] = iArr8[c13] ^ iArr9[c13];
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    int i39 = i26;
                    while (i39 < iArr3.length - i27) {
                        int[] iArr10 = lVar.f338602n;
                        int i42 = iArr10[i29];
                        int i43 = iArr4[i42 & 255];
                        int i44 = iArr10[i26];
                        int i45 = iArr5[(i44 >> 8) & 255] ^ i43;
                        int i46 = iArr10[2];
                        int i47 = i45 ^ iArr6[(i46 >> 16) & 255];
                        int i48 = i35;
                        int i49 = iArr10[3];
                        int i52 = i47 ^ iArr7[(i49 >> 24) & 255];
                        int[] iArr11 = iArr3[i39];
                        int i53 = i52 ^ iArr11[0];
                        byte[] bArr4 = bArr3;
                        int i54 = (((iArr5[(i46 >> 8) & 255] ^ iArr4[i44 & 255]) ^ iArr6[(i49 >> 16) & 255]) ^ iArr7[(i42 >> 24) & 255]) ^ iArr11[1];
                        int i55 = (((iArr5[(i49 >> 8) & 255] ^ iArr4[i46 & 255]) ^ iArr6[(i42 >> 16) & 255]) ^ iArr7[(i44 >> 24) & 255]) ^ iArr11[2];
                        int i56 = ((iArr6[(i44 >> 16) & 255] ^ (iArr5[(i42 >> 8) & 255] ^ iArr4[i49 & 255])) ^ iArr7[(i46 >> 24) & 255]) ^ iArr11[3];
                        int i57 = ((iArr4[i53 & 255] ^ iArr5[(i54 >> 8) & 255]) ^ iArr6[(i55 >> 16) & 255]) ^ iArr7[(i56 >> 24) & 255];
                        int[] iArr12 = iArr3[i39 + 1];
                        iArr10[0] = i57 ^ iArr12[0];
                        iArr10[1] = (((iArr4[i54 & 255] ^ iArr5[(i55 >> 8) & 255]) ^ iArr6[(i56 >> 16) & 255]) ^ iArr7[(i53 >> 24) & 255]) ^ iArr12[1];
                        iArr10[2] = (((iArr4[i55 & 255] ^ iArr5[(i56 >> 8) & 255]) ^ iArr6[(i53 >> 16) & 255]) ^ iArr7[(i54 >> 24) & 255]) ^ iArr12[2];
                        i39 += 2;
                        iArr10[3] = (iArr7[(i55 >> 24) & 255] ^ (iArr6[(i54 >> 16) & 255] ^ (iArr5[(i53 >> 8) & 255] ^ iArr4[i56 & 255]))) ^ iArr12[3];
                        i26 = 1;
                        i27 = 2;
                        i29 = 0;
                        lVar = this;
                        i35 = i48;
                        i33 = i33;
                        bArr3 = bArr4;
                    }
                    bArr2 = bArr3;
                    i15 = i33;
                    i16 = i35;
                    try {
                        int[] iArr13 = lVar.f338602n;
                        try {
                            int i58 = iArr13[0];
                            int i59 = iArr4[i58 & 255];
                            int i62 = iArr13[1];
                            int i63 = i59 ^ iArr5[(i62 >> 8) & 255];
                            try {
                                int i64 = iArr13[2];
                                int i65 = i63 ^ iArr6[(i64 >> 16) & 255];
                                try {
                                    i17 = iArr13[3];
                                    int i66 = i65 ^ iArr7[(i17 >> 24) & 255];
                                    iArr = iArr3[i39];
                                    try {
                                        i18 = i66 ^ iArr[0];
                                        i19 = (((iArr4[i62 & 255] ^ iArr5[(i64 >> 8) & 255]) ^ iArr6[(i17 >> 16) & 255]) ^ iArr7[(i58 >> 24) & 255]) ^ iArr[1];
                                    } catch (Exception unused2) {
                                        i29 = 0;
                                    }
                                } catch (Exception unused3) {
                                    c12 = 3;
                                }
                                try {
                                    i22 = (((iArr5[(i17 >> 8) & 255] ^ iArr4[i64 & 255]) ^ iArr6[(i58 >> 16) & 255]) ^ iArr7[(i62 >> 24) & 255]) ^ iArr[2];
                                    i23 = i39 + 1;
                                } catch (Exception unused4) {
                                    i14 = 2;
                                    c12 = 3;
                                    i29 = 0;
                                    int i67 = i12 + i15;
                                    lVar = this;
                                    bArr[i67] = (byte) (((byte) (lVar.f338602n[i16] >> (i36 * 8))) ^ bArr[i67]);
                                    lVar.JAjE++;
                                    i33 = i15 + 1;
                                    c13 = c12;
                                    i26 = 1;
                                    i27 = i14;
                                    bArr3 = bArr2;
                                    i28 = 4;
                                    i32 = i13;
                                }
                                try {
                                    i24 = (((iArr5[(i58 >> 8) & 255] ^ iArr4[i17 & 255]) ^ iArr6[(i62 >> 16) & 255]) ^ iArr7[(i64 >> 24) & 255]) ^ iArr[3];
                                    i25 = (((bArr2[i18 & 255] & 255) ^ ((bArr2[(i19 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i22 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i24 >> 24) & 255] << 24);
                                    iArr2 = iArr3[i23];
                                    i29 = 0;
                                } catch (Exception unused5) {
                                    c12 = 3;
                                    i29 = 0;
                                    i14 = 2;
                                    int i672 = i12 + i15;
                                    lVar = this;
                                    bArr[i672] = (byte) (((byte) (lVar.f338602n[i16] >> (i36 * 8))) ^ bArr[i672]);
                                    lVar.JAjE++;
                                    i33 = i15 + 1;
                                    c13 = c12;
                                    i26 = 1;
                                    i27 = i14;
                                    bArr3 = bArr2;
                                    i28 = 4;
                                    i32 = i13;
                                }
                                try {
                                    iArr13[0] = i25 ^ iArr2[0];
                                    iArr13[1] = ((((bArr2[i19 & 255] & 255) ^ ((bArr2[(i22 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i24 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i18 >> 24) & 255] << 24)) ^ iArr2[1];
                                    i14 = 2;
                                    try {
                                        iArr13[2] = ((((bArr2[i22 & 255] & 255) ^ ((bArr2[(i24 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i18 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i19 >> 24) & 255] << 24)) ^ iArr2[2];
                                        int i68 = (bArr2[(i22 >> 24) & 255] << 24) ^ ((((bArr2[(i18 >> 8) & 255] & 255) << 8) ^ (bArr2[i24 & 255] & 255)) ^ ((bArr2[(i19 >> 16) & 255] & 255) << 16));
                                        c12 = 3;
                                        try {
                                            iArr13[3] = i68 ^ iArr2[3];
                                        } catch (Exception unused6) {
                                        }
                                    } catch (Exception unused7) {
                                        c12 = 3;
                                    }
                                } catch (Exception unused8) {
                                    c12 = 3;
                                    i14 = 2;
                                    int i6722 = i12 + i15;
                                    lVar = this;
                                    bArr[i6722] = (byte) (((byte) (lVar.f338602n[i16] >> (i36 * 8))) ^ bArr[i6722]);
                                    lVar.JAjE++;
                                    i33 = i15 + 1;
                                    c13 = c12;
                                    i26 = 1;
                                    i27 = i14;
                                    bArr3 = bArr2;
                                    i28 = 4;
                                    i32 = i13;
                                }
                            } catch (Exception unused9) {
                                i14 = 2;
                            }
                        } catch (Exception unused10) {
                            i29 = 0;
                        }
                    } catch (Exception unused11) {
                        c12 = 3;
                    }
                } else {
                    bArr2 = bArr3;
                    i14 = i27;
                    c12 = c13;
                    i15 = i33;
                    i16 = i35;
                }
                int i67222 = i12 + i15;
                lVar = this;
                bArr[i67222] = (byte) (((byte) (lVar.f338602n[i16] >> (i36 * 8))) ^ bArr[i67222]);
                lVar.JAjE++;
                i33 = i15 + 1;
                c13 = c12;
                i26 = 1;
                i27 = i14;
                bArr3 = bArr2;
                i28 = 4;
                i32 = i13;
            }
        }
    }

    static {
        char[] charArray = AbliGG("⬀絧ሠϠ驀訥ǈ诩ᤄ⋘쐕蓅悭ꇫ䊲待\ue1ab㓹褓ꓑﮄĒ✅\ud949緃ᐴ緫珌㈴崫동遝蜞\uec66著叟ᱦ⾢䥵胝\ue382䳧㧅標졩､\ude09盜㐺纱⸢\uf3ea踀\ue128꿰ꆯ痵ฦꙏ\uf181ド㇋鞷氋ꨋ蛎\u16fd㒼䡩ᘒ姆询檽㰕杻芿汋쀍\uf25f┒寞ꯍ坻ㄇ\ue8be榻낦￤㿹Ꭰ\ud899썸愱앫\uf667倡뜾\ueffe⠄毝羫醅菀₭\ue94a\u3101䌬ݙ蔂⽅냛땺ְݖ끑䑴㥉\u0ef4ⷭ䙴䃖㷑㿣蕗㌹姤\ue2a6㷀ᾠ댅䶏查ꉎ뢃ꈨ蜹ፔ䦷ﴃ엿䞄巃鼕⾕≣혪뻺롆䱲팀ቾ㿟昄恊췛㍾雪硳씒\uda3f\uf594䋪뻏桠듣뀘멖뇙頴巣Ⳡ編洣ኚ㌳鷇濡堔兜愺븕䛛迀\udb0a᯦풼綾엚\ue84cꆍ笊뛯ꑻ똮ᰨ\uda84汱版뾞씭⻒˵뵟䴄\udd33௱梏\uf25dლ䊭錊苈媵ᤅ⁔⣿ᠺ䳉\ue611뱨ᚾ닌휸饀ꦾꂰ\uf3bf\ueab5﨎轕矿\ue896鳫請솏謴⯷Ƕ㏻䷍嫠톙䦫\uda04\ud89c踟饒ਵ书ᑀᴏ鉪仕ﰕ倲\uf8e5\ue637싾ﾖ⟯씨嵌䦝栣Ů橜乧謘蛯\ue6a6界堦ắ셦\ufaeb⿸⌣鄨櫪ʿ䣻\udf45흺߀\u193d枓䠙\uef5c⤠牥뒕啍뽌⼭ﺬ嗰෮［ꋜ쥳ఊꪍ匓M駲\ue61b缔臭\uf058⟑ゼ\udb26铂抺ẇ\udc86\uf1a7屇荂슸됯\ue172㖺럥넽窰빻쮊䁐켓穝鯋ꤘ幉\ue65f뼗\u0015멟阿橅э\ue09e\uf82c⯼\uf04aＮⱂ\ue95aꔷﳖ驪㚨\uf1f8欚됌蟏\uef65쁱䪰凣媨晟\u2fda슝햶텑ꦖƸ皓懠淣褫中\uf64e烮⡑睻騹◗蔾谵\ue1e7䡒皝㷼ힼメ\ueefb䳤ǜᣜ君꽀\u2e61\u17ea余廕푙ⷦ竝든摠⌫Ǿﶋ綔븦싟鿡詠눲懣◻᪳柮⣇尤\ue9c6㜘뺢\uf224쫍䮎\ue558ᅸꏽ\ue5e4ꌒ魲⤷呌킥컭⛮ꙻ躭爆䃬줖靥̛䉌堰\uf69e\ue1b8Ⓠ꺸弋羹\uda9b㬴ꅾ⋋膳ማ츳㼴畝\uddbb隞鋜\uf34e︊㋢蛢ﵗ퇖솹꿗腬\uebb1謹帛>ᒪ閴\ua87a䰋숅屔碸ᡧඬʨ纽講Ῑ곱갣ة݆ꊚ\udc0d荢⌈푬閂冄႕濄謤褎띟떺頔컳㾙㹺鼗欻ᮕꉕ㬭\u16fe㰛喎鏂倛ꮷ쓻봸뀛ࠢ㬔䰖碓琢ﯲ\uf6b4㐌誂⯢籌瘨㲲⮔뱝沍飱⋼멌颺⾶왆\ue0dd傗琟㖠퀜㫍\ue148ꞣၥ贉剜魸뤟볗踶퐪饭嚝翸ᕯ⠯₨\ue894꿆\uf1ff\uf826\uedd1榫\ue37e\uf2eb১ત\udd5d弞繛牝稝벇䴝뼮췺\u0af2㦘璶鄽큣蔩ﮨ者腕측齯⼡㫨钻민꓃䘉봆㬡츴剅ᑽ㴡ᛃ\ue019揜龍題짖껫ᆇｸ\udb00짴\ue244愢푈ᲁ翧놿⸾ꆉ寝ᤝ祅촜\ue2b7홂⩷瘀ꫤ⩑状\uf385琳\ue283륚됥쿘\uf80f婻즩ꛂ\u1bf6寄匿샏ⅵ凭\uecd4㊺䐕殷닭\ue3a7윿\uf62f껙ᕵ玫琝᳨雡ᇦ\ue7bb绷纭잰鹼\uf7b9\u1b4f篮缛뇜챠\ue28f⤽⋬낍⚘澋鞟ఋ훫\uef40\uee06轵쫵\u1af7﹦賗삠\ue251\ue2a3\udd06㰲−䕖砀\u0cc9㦘\uef8c鏩姾፣甶⭺넟웩\ue8d8\uf3acꃆ祿⸂偦ഉ抬茊\uf26f햸揙\ue82b끧ᵙ\u0cd8戲飘窛\ueff4粡ꗸ뢼ꍨ븭ⷉ觱襆锠\uead0漱푄駉癒Ω䛻䶓≴뻍펎\ue995쵟홽ᘒ\uf845⽄擪磊蘅벲띗륏苑猁ⱳ췉\uf3f9\ueebb먓\uf7f1䞂\ue0b3ᆼ헀飁ᬧ쮸ꈭ➒दᴼሽ렱츚\uf547微渄쁩\u0b7f䜸渉\uf70b鴇ꇴ⦨\ue26b龽ະ엌슇⻌뾋壘⑼\ud818ꌬ㫀❌㪤\u0cff\uec8f뉼螎鄉ᑯ\udbbc儛㱂㷱ᨫ봑熅ᐩ삾礚簈阏㔑稓϶䱡泌炥ந첑、텮\ud909旜￤\ue7ecₙἩ䊫哰롈悘ꣃ舲媴\ue08b\ue351䕻ᕀ巊ਔ箐\ue7f4艑慴夓\uf5b6귟鶿ܥ≁垃⍅爜덽ꓰ斚ၥ\uedaf䨡嚯◱뱘찌\uf0b5▣됪⬽埼\uf736⥜맆虄밸鴸絊ۘᄝ\ued09ⵢ듨ၫ땫劇快徹ꎋ쵀梩Ⴠ챏踵芇笠\udfcd绿\uffdf\ue384ꄫ頱㕄蜴᭦⽩累\u0a64異\ude17掬兠湽⎭︌ト회풫᷶\uf491멳ߥ薠寣뜳斞͒嗰ꢈ\ufde7ꮎ᠍\uf69f䦊䎲\ud86e船晶斬켱ⅉɂ\ueea9⻂돡﮷쒆输燵惣ꧥጉ彨韈\uee41ダ\ueebeﾘŬ\uf65e손\uf4db䯽혦뱡䨈癦덓ᶶ爱녑糓䄐ꖨ㝌\udd7cㅫ᰾⻐䶐⡏\ud807\ueba1坰䷄輬进⏦铳늈㱧\udec6⢟䌷ᬔꥳ赎\udaeb\uf528㈛㌡℀諦欻濚﹎䌁砯\ue356塇\u0dfa幐䒸û㱾⺜솽ⵔ庄袑䧂靊錖囶힌\udfc9\ue3f2ꤌ㫊匴慷熾陋㭄糷\uf078媌ꪄ\u0add\ue43a省㪺ᶆ\uee13難ꕴ陎얞ữ㦅㈪䝂\uf11d葆\uf65c傻\udb8dꎰ\ue545ᐴ珒\u139d邳孟Ṅ蚛쀳䷱ೄ⺧瞝㞊Ꮷ꠴ᕔ㰂ಥ\ue162辙낭툸ퟪ塄官⦮㔑黦\uf485쀣\uedb2㰶䝹줫渞⋴缜ꅊ쐅鮣䍊\ue633呕ﰋ서ᷡᲫ胏鎪ᇅ।￼៑\ue8f1椖ǅ\uf2bc⺬浾\ueb12ፏ◟彼Ԉ\uf574ⱍ䟓↰캨뾳뢺\uf357挶៨\ued01孏欣璙蕣䍪䶣癁碛ﴰ侥픅櫼恂㗫ว\ue029⪹\ued3f麚꺡鴠\uf898썮퐯ꆨ砘❌ꡈ韺褡洵유ꗾⰂ腝䕖\uf753뻘軀\uf76f\uf6c6ᢚ쐢뮄蒾⠎\ue887ヮ䛐럾쉍㥥랎⤉둤劂잙\uf4acṃ倰贼툸ݘ\uf833뵄펃䦄㏁㗳\ud9aa䄭ꁫ\uf4f6ᬼづ䤇楪霴쇩ｵ\ue7e3㞭ꈜ匕⇜⟱⊁ꏘПഅ뜬股銮ﯬ⌨⊲䷋為\u0bc5⚲\udb7f誶㺬誸Ṯ\uffe7螔팅쀵\uf49e풝㐄퀭\ue3c5升࠹폁珣띾璒䙘ꎉ鍊닺矝䎗苂䢝漎糋ᅡ윉䱻옮켂뢸盳廋⅜\uf40f䍋⫢毳䲢誢粫뺴萍ᡥ缋秏ﮚꐒ៳腙星\ude3b檝硈䨝鞆ર堆鋙甚컥\ude70ḈὺḮଠ첐瘅ﾭ澰峆楽\u1fdc᱘\ue3b7ொ屉ത蠕ᢜ\uf436\uea71ഉ鸇ꔭ뿹\ue7cb䏿쿣⎀뒨Ꝇഋꢩ饌\t磂雯\uedbe脱攓᪠例\uea29扫ᔭ솬錼凍ᵟ\udfaf䢛ꎱ驃碬ㄇ퀡憖ﱙ蟝겹ᖳ㇈魊Ѥ߯듐\uecde꽪耣Ṭ퍟ꪾ䑱驤锡࢘㜚Ⳉ찫퐡罞鱘㝏棊膜㩋⥯밁啭ꐾ愀ꮸ퍭㞁춈\uf11b愷䗶▯䋛鿭괺ᢆé廕਼ｋ攏揜芎ꏿ\uefbf鞱炥탕᎐싪జ辍\ue8d5쇱琨邅ｴ袐\udec2뺽Ể銤伌眩⟴㦳尥箐倔㮱뒔\ue737៉澃쭡⪌ﮏ⥞\ue97d\ue6e0憜竵ꚥጣ뻨\u09a9ꥋ鈯\uf451䅣\uf81e鿈렿䊀蔓앍싡渠钴匑歨陘鹞镞鹢媳溩힡輶\udcdb͝ꁇ넧縖\ueb29즀☀\uf07d쬻葜쩽鎵इ薕ᬉ잁\uf2e4뇚㦜\ue18f\uf640\ue735蘞掣䙖醼ⲉ볍\uf34e\uda5d䰵\ue990㥇蛞ﻱႨ蝕̿젇틚◂믐\uf5d9蹹핥쥺鄒㰬\uf594뷍\ue108\u0c64ᙣ軿剽᯾㱔\uda2a淑\uf4d6﮲驴褱ﲋ㤦\u1a1c㢼彜옩㢷죑찼\uebfaꘆ馷Ό쿢枑헹砬\uf3a0諾\uf61e湃厤∄丧ꭠ쫎䪄탣␅櫫削ൖ㪝涚ﶻ鞻ꪶ뛖뺃亝⟙⽜ڞゝ갚ᴉ쑙촉\uded0ꈷ㝫\uef2d퉙\uefdc崜娤虎뀞綌륓推种芽䦔㯺좞ꎈ肖뺢⬊憡髧䦊\u2429覂\ue86b\udd02㵳軓홍쩛\uf1e3웋甐\udcca瀫늆浌制ድ쎥藐ീﮡ\uf6b9᪙擩鋫촤ࢣȍ\uf78f廣迾䟉榃쮡䴪\u2439澾\ud7ae炷ᄮ饬\ue544\ufdd7ᨙ뱻\ude4d玼ᇓ㋅ㆤ곕네탨\uef75節핥⣀ᯀꠚ\ue8a8⢾\ueb74병໘뀔蠙殘췆\uf2f3谞\u0de0ਗ਼솛ݴግㆧ\uf57bꑃᯋ褔폋㙞懐⢙\uf1a4罺ꈯ\udb00煹ק痱㬵\uf025뷮탔툅⬽蒉\udf3b鿸櫓쿖\ufb1a\ue7fc聀ᢋ\ue11b椀\u243d\uf052渠ݒ\u2cf8答ڪ彂\ue848䮠\uf143\uf0e1\ue066턅帹ꪴ衸묀膴◲ᰶ崤ῇ㮪냟㯞灻\u196e\uf2dfᗳ\u07be䈗怼ꫤ癝䄉䭘❬㔘芤澊\ue7e7ﴕ\ue99d峨첐\ue952\uf5aaḗ㸨丒黀\u1ad7쑍ǉ瞋쑺蘪캮爥眛鏢ኦ\uf751\uf2fa緒\udf65ퟒ本\udf94帥昧䣎\ud9c2㼭襑弍㍔鑣䆮廾绅ᥬﻺ킛ᝧ紮ᘗᆳ줛뫑퇝⼖怑⪯ꀄ姭ꋟｐﬞ뇄쓊溤칇䑜㷁홂鰣\u0c29䰠ི쮟愯겳䱲监朴⣐萀䴡㝎宲\ueb59鉇䮏躷轘炾廦彲ആ뤰ఄご뿵輟\ue27b肭炇꿴\u2e78瞻\ued6a钸墙䣙൧\uc0ce5ጥ藫ף⥫䱥䩐兤\uf0beꝶ懵ٜ成\ue7c5ਛ\uf3e0Ჲ囂ኴ쁀軰弊႟ﱌ泱杼\ue3c2紉팝ቧ䤼炙㲲ⰻ恺ꨨ짽䕬蹳鶎\ueb9fꛋp⇛\u1aebِ卸櫚秶㡪햅\uf1db薛롕청\ue0b8너粂鱵\uf33cዟϾ譶㯁鍊\uee0f츬튕땎ꐲ㪣ぺ\ueb7f㫀靤\uf35b\ue784ꇄ\ue6ac맙甁궧袌ⅅ曽⺬䂠鵐ೠ냈ٵ擔革٢羠ᗩ⎇梂蒩嬿퉤㺯慺ൗꙪ엙涝ꍛ\ue815\ue870ҏ돟텡㼫性뛥쪫㌼ପ뺬賤锃彽ࠏ籓\ue522뼽鸀ꡲǶ\u139a财ޅ∨ї듟䊘赬봡☣政縈뼄歳쾣닩稁唬肾꣢묉쁥붼寇㏘㍸踤굟剎钎偾럏䃘\uf8a7\ue442\ue8b0뛥ꙶ筤弜\ueb41瑱哹켳孋靜掅︱愗嵠똪痵춉伜ꂆ閮⒒磬把ｇ͗젺ꝕ姆如\udd7f韯籖⦞켁㈛⽰淋籭產ꚮ툚\udb21ݼ\uf845ຸ従㍯楙ꅔꝄꀬ㛿땿䐺뉼頱郃↙⋏ᠿ젤璅雃担箚ᢻ䟂鸍⟮픏䬃恶쬋礧ሔ曾딘醁鳵\ue015咫羃㩓힇㳚\uedce所鬀\ueb1d覩倭欞嵳炱ꐝㅑ棜ﻧ넥읿걋ꇶ惤劓惵䠸ㄝᤩ\uddcb斋줳Ე왹켇列洉鴙瀧籀涟䩂괡Ȑ嬿鞊⾹都豞홎滛嗗⹂ℨ\uef30珫Ӓ邞\ude7b\uda02鐢ꀮ飘ꏦ엤Ḛ\uee97棳샸얒န璯甕쫰Ⱙ㪚蹖\u0a54⠷않嶟쵽템蹕㍧螺㷪\ua4c8겘ⷌ꒰賲騭쫥ꦟ둧櫓ṙ\ueb2a㚧⒍힢踬륲㍬餳꼾藻껇䛎붷닷ֹ렍\uf8fd✡똺팷Ⳣ乽쫬\ue7d3ગ捌䲌鱁뀘㎣酫쫊砑\u001f꠷\ueb6d䞶㏧鷰\ud931痩휖㝎✧샒꘧岭타ᤒ韱隆㚕ꑺ\ude98ӃᆙῨ뜪莒迧♇꿱굹䒡\ue882䏌뉇ᖱ퉢颜\udd1f쀺᮵웜ඞᚉ킯敵\u09bbﮯ\udc0eㇲዶ蜟峪㘉ᅤᖂ퐙䴺\udadb⹀ꗔ\ud99a끍阢\ueb16稛鿺揋ꧦ‴ꆵ䴴篺⾄钜뜹稼ỿ\uf658箅剷邜瀫䊹\udbec㎽鼆喭ླྀ\uf313鍘㔹ދ綷梗挣詉\ue369戇Ɔ፠ऱ⺗蚑忱媃ഓ왉㪞ꢼ츎提㠯䁪ಉ짅៵\ufafa筧뉾\ueadb롗ᩢ嶗㚀겈ଟꜨ勐謴⼆\u135b䀕ꌷ솨ེḦ드룅갊㸁\uf2c5繏\uf3f9⦎싹勘\uf39a㽚\ued70션疢欈\ue9cf驎쥉ﭖ᥄䙸퉋\udd16⪶␑髉孅䱝\u0ad6槾楺備\u10ce쟴ꬦ\ue5eeά︽격埋\ud9df䕄걣靽勚ᰰ縖䢞䇹ꔬ進ྕ샸潿굺\ue288㍌\uaafc॓\ue240謍⟈뮯⸈馫\uf840췿눝ȗ扼藙奛揘㕽\u2d75ꩰ鳫뒷䋷ꁚ\u0bab䌇웅ḏ\uf7bd絘\u009a\ued1fꎋ稖\ue738S旖\udbc6\ud803❹禊㱆硇ꞌ皡\u19dc䶃❙蝌祲煤糾蹰מ蚊詔倩鯠挻\uf344ᡀ㸠ᔑ䞟舮ᢍﭞ攋ꭲ\ue2c9寑ᬈ灣䤎웒䤇昫藣躊喹莝ャ鯦㖚\ud804挎쀍窯⠅惂\uddc8䴅\uea24⦞訓㨛♻먙㘗୫帓\uea09鳑쭞է\ue106\ud873\ue76e控퍧鈩儒䜤㦀僧\ue8c1ᾁ鬵藛銁뇰\uefb3䂛䮖\ue60b\u0a00쎦⍨夣\u2437㱀긦漄氶࿗\ue314鸅\ue3f9\udd09ᢅ\ueef7\udbd5䊶쨇縷擃瞉བྷ\udf58톯\udbde錿뒸⏚懷䣃莯⾄矗\uf6ba詧\uda58\uf2dc\u0cce흲ັᔼ⹚⺞瘧\ue1ca霴湇␡䄾㉓㙭민வ梅㝅\ue7d0⽌ㆇ欪\udb64仅湫\ue1d1\uf44fㄻ\uf261䬹\ufd91⻢\uef10墌ᐄ퇌\u0b8d￥韤\udd94뗑騅艶損\udf84䧟\uecb2톂\ud947\ue8b0빬ᢐ䢆ѣĳﲂ쮦\uf812뇮᠘㓾䋫䆆ꘚꈗ䉱⒛嚔駔摙⺯伋ⓠꆱ횹捎ᣡ芏觝㻳靘ች䟚잚霯웖䆝넾⦐㋕玂瘾뇰祦̦\ueccd荖ギǔư奮쿻ᐞ䰷䗹疯Հ㗙↣솥歸ど⅒連嗥㋭춢\udddf⸩䅚補捸䈏ﲖ羖㩡蹜격\uf788梅銵ᇩ僪\uaafb掺뛸硭ጉ\ue44a\ue981ሽ鉗鲮訝녟㯣趁\ue612삔庑䵶㾕亳ᐰ뒪龪攈朜\ud8eb\uf1feꬶ棇\uef84呬\ueb70氣ۚ뱆昴⮬鍶⛙蝮\ueab3꺩䍘\uef4e\uddfa\uf0b2ꠕ\ud86b䊊쓍䤻唘溙眵럇ж䢋뜖悲䮷䓝嗶\ued49ꝓ儡増泉燎泹귻㴽ꕯ꩖ъ끟得㻠ᓍ犽ᗾ鰁ﹹ\udd89긱픶飂ꓔ吮\uf70d곓舃륛강赓ꥐ옡䏛\ue70c槎⋁돫뢆⌅⍣浴뙾鴦\uf307⻨픝襷ᴴ낦靿䟷鉜퓠쨪\udb26ꉄ\udbdb걳칂뎣娦훓䨑\ud82f・\uabfd솲丼틦눉ᖻ궈ꁕ㟡㰸㛂ⷦố㾋諔ሲ觳暛敱厎ꅬ萰\udb11\ue1db覹｢푗\uf5cdビ浙␚ଞ楲魘卛㼕䭑䠷\uf24aṆ嬣슔姼թ쒴㞿昤鳴ᴫ晋↳泖鰢\ue53c卑濓鏣樌\ue317蟴귅ᅇ閹ꏯ뫁ᾡ蕓巩囲耿ൾ輸飍\ue30f쉬⮫⮶璇蔅載鉠큹\u0ff4픩셌툯\uf056ᾨᒬ\ud8fc줛潠\udde8묔ᯙꛬ삊ꓖ릟걳䠆濶Ī謈甫龕炁뙚爅렛䧁㪷ꍧ玌궔叛\uf382ᑴ쀾⢞൯飑ꬆ\uf89f읶梅\ue86a먁潳猤ޥ\uecccၰꓖꖷ栉✶瘚\udc07ኡ㑙瀚㿍㵞픺㯫\uf1a4ܪ煰韭窞\ue5ce\udc21\udc5f縅嶄\uf3bf毿윛딀ϑ\uf71e\ued97蔜຺⇶쭊ᷧῆ绡閭䫮斌駯ႊ떣ᛱນ濗\uefb0롁持\udee6Ӏ\uedb1肅娆ﶱ\uf6be붯⊕䦈砭\udd9b鶶ᝠᅮᝨ蟆猔ᬭ那ﾰ쫉쀯ᑩⷆ\uf0aa撙하⨄퇵懝옛ࢨ糚\ued19⾞庫桛膯飂㦾竇慎뛗\uf378狉꘠뀷\ue4ce凩醨䧺ナ\u05f7媸띪絞\uefadຎ㢝t歩\uea23养楒\ue219呚✱됓㱔ᶹ㐹骷윔렏\u0b80ﶨṤ⬔뛁짤⭦Ỹ༕\uf4ecךּ㒝\u1ae0勘┿\uee58\ueda4\u0ab4礆ㄙ쭠爫㹄輨\ue769\ueed3\u086d⬡ﹰ\ua9dd錠扥秠璓龐\ue903殅恑竼\uf2b1扱뇲憑\uf639쭌휉\ue533ꅙ㖡툵蓴沆镒\udea6咐熨兕⣄꽿\ue3ef\ue2bf면\udf7f泇煌⑼䯉눿됉椳\ue32b鐹節扶⎽瓥놕㓐鍙\ueed0臣\ue977舁\uf0bfﻮ䶠辇豣퐑鏙\uf045納\udb94뷏Ἅ㯈ᆯ뽘歑祗筋堝\uecb8ꅟ\ue8eb콪뻀\ue4e4規\uf1ff璓⽣\ue4ca筬禽刾㇡뒈\udcaf嶛늖僷솑ꇝ绽\uf7a3\ue5cb빬戊ഇ\ue7da㩰ﾪ☦猁痚ꁤ챝ㄪ쪧츄⟆很긎䗭绎䐜\u20ce铟ᰶ栃蛃ꏺ檹闊咯\ue6fc\ue324腸\uf254\udbde쉋咒煯\ue13d\u1afe\ue00a쐷ꯗጽⰈ⬍䓸蘭臬셥鿼錿灹헷잞颷띳킹찪ꕟ醶鰏錞泌Ⳡ說\uf3b2\uea55엩\uf00a閃ᗹ蘉⯑扟\uf36f楰柝審ﺲ켂袗枔ᛝ䧭㾮逌艑億\uf70bﭺￚ駆污쫵ﴭ㛔눠뤡Ზ\ue01f낚᷉侏匈\ud9e0蹆\ue561展벅ᢵ\ue742\uec76ㅰ溃䅟뾜龡桒桸氶ۢ뵊⺑虗䳑꧸㽰祪䒙䯻ꢍ픨돮\uf79a鎼购뻰ﯞ酷칠歮嚨랋鳜뼵㒤\ue954鞻鎭噰洚ኦƄꖮ䗳臘푙涅렱䅉\u2ffdꪟ楃愋偖黪\ueef9걠㞚돏䃄읕㪹ﲰ﯀ঞ将䓪搽鳸阘Ǯှ區톙ﱂ⓱戔넑⤾ᝎ腼䭻煚昃ꄐ䗖ꭽ\ud870揖㆖注\ud86e럆\ud97e您隵㪷ឿ跥镇\ude4e\ue472ᗇ\udfd5ᗀ袿ೞ敔\ued7e컭\udd88\u0095\u2427\ue6fb\u038bᎶ雛ᚳ읹\ude3e씃왭源넧䌽孽ἧ\uf58c⥕⊦씖꺜㽬\uf7ba혍䜜篜谔\uf1db嶺혲쥲ョꛐ崣沠킽澐\uf494\uf315㐵ឧᲧ鳡\ue056铖ḃ윲ￕ嬣飖䵖ꎅ萖颦ऐ\ue0c5犲Ʋ\udeba䩟뎇\uf89e䗂漝ﴪᗃ贏٭䌖⦑䜔\u2063絎\ud8fa\uda89小突陒牙鄸ꍪ♕隫\ude70퐌묿ऍ᮶먩Ώ맙\ud7a7ꢶ╅ꌋ\u1ad1袖册\udc1f\uf215\ue1c3䛉맲倐溌鱴\uea13阃謜ꑲɂ両\u18fd諒佌嫚\ue257\uf236쫰礳톺䵮껥\uf5c2ﾂ㝻\u0e68훙䓜ꀕꢚᶴ帻䲛Ӝ嫰Ё펛䙩趗宛\u2e6f瑾푏唉絇\udd83ꮰ괃厖ﮀ턗仭濗넱箲㒩莿話\ue919ﾸ뇘쭑籚䢦\ue65e\u2d9bि擹\ue4e8ㄩ됓ᯎ⽍Α\uf290㗱\u0ac6裈♱뎻롕딏Ȓ쓮ร再ᮉ㍝䕱쀭푄\ude35ೇ첱ꉜ\uf673펭\ue0e5㞱鮭˂뷲氯\ue451ㆾ쟣퍝묤\ueebf\u200aᔑ㝒\uf7a4丼邨鍅梐谊㜀\udbb1䑾Ȭ篘賝췮♾ꉞ욲䝄㐕ⅵП骑뙮멛\ue5e6憚⨾豀쇨蛫⾛䦯끓籮瞛\ua8c7\u05ebꙡ삄\ueb25睤\ued6c痡䲃叿\udc4b쪩撟푰稓㘏ꕱ呷嬱\u2b74葍ﻙ莹ㅜ❀赁\uf680贌迬씑\ue65e\udae5椬\uf4fbᜨ奘䷲\udacc舂\ue953ꬻ逭쥡뱄ು胦眑帇鿫縵䱼㼖퇷￣\uf0afⱢᡙ䊈䒒凘㌞릱졛몞坷\ue071혀㭣܌簙\udd35ꈰ訢磧蟏\uf06b퐘⍕깐勃哈䙃緗垆맵끕⒂䭳뽼\u0bc9袯鄮쨕\udc56鱙淗ᕱ逿ᑧ뒉헩罓ꀹ鶼余˂琾ꔠ\ue58e籸夫䴓\ue3e5䄩衷ᯞจ꧑व\ued00脳웦뜕意㸴\udd20澓폅ᘖ\udd51ⲓ蜸\ue6ec\ue5d6饶얿걧\ue4fa∂\uf7f0Ჯ\uf2c8郍닾\udb60䧬탔⌹꿬폁駽椎ɲ\ueedc郀촀ꀋꙚ\udfc4㷐幹굽ៗŌ╩⧴툈ᦺ柳\uefa1哩莩桙閹䓵\uf3e1\udf45핪\ue065\ue72d灈붰슢䈬䰚殺\u0acf뷙\ueddd禸\uec7f섘坷灕\ud8c2賽䮇⭐왽詶쵛澖氝ັ\u0558报쭿\uf82e硭\u0891柿軠ᓿ쨼㊇ᏹ\uf1a5䮑\u19ad龸딧呶⺜飑셬㥋\ue5b6仑涉䟍ꀮ\ue920\u0b0e廣컝贚ꋳ\u0acfά鿊霎Ꝁ궝ﴋ䌌鯤⯑苫櫁\udcebݏ\uf223ᯊ誜Ⱥࣦ뛖摘귬獟꽶褭䷿ꪔ멬㯕洌據髮콰ꂊ덎ᔂ屾헷㸸彥㯃駂Ίᔎ\ue1da㋒㦥〤瓄谅籪ໆॱﴛ啂ᑋ\uf6e5\uded6폭\udf96官绖댰牭め䲋Ϩㅁ᷄슠㥀䆸Ҳࡺࡍ뀊䦪ꕴ섚챵ꆐᆃꬔ徰뱈ദﶍ얹ꨧ쁲木䓪◣ꗀ醭颲ꢸ⸎ꌒ⭐멿㞖ࣽ\uea34뮧Ö\u0893ዶ饪\udeb3\u2d73舞㯩ᮙ㱱鼆ꞇ嫰\ued9a䕽긣斩箿톾淆ᅒㇵ\ud850\ud88f滁ꫂ䁻✠⪖鏈\udfbf떠揅䠙ⷌ\udc78䅍\uf515落\udd0f䷡텁㟎ವ덌\udc7a⠯\uefdf悭ᦂ嚂륰䅁浽䐿⸄\u1ade\uffe7⊍贮鲸⇗\ud8d2ᑣ냥\uf4f4㏰춻調ꘔ먱쿕왜毳ᰁ\udaf9玢ߢ⊼뇡⑈Ⴗ嗵ꕚ쇯\ud96b䜭헣䆛跛㊕晳ඐ鬎즰蔽嚹ᦀ\u2e77ᒧ\udc82ꥇذो魗䣤⟲\ude24疬栎뢌䰄\ueb4b镦訓┉⫆\ue8b2姁꼄\uf4a2첽\ud8c3떠둾櫞ꆕ뵡낚峠\uda8d慲폓慆\udec3\ude48৵섫ᯔ拗ᛡ⫉\uf23f䍗䛚횃䘃舩ꅯ\uf0c6烸\uf44b็䡡\ue562㢴휽㖇㭠徘温䭢개⒘윫⛍홂쿹依\u1a8b䴨䭦⁃棸㺋\uea06\uf837\uf1de₅Ყ羳ₖ婤ꧻ㋅\udceb\uf8c5瑛뇟ʎ曮늂쐭萓㽢偊ꔜ툂\uf4f6豧\uea6a봆飣崀裢곝ꂉ⓰쨍ㅧⳕ\ue231떭陳牫蚠㌷\ud9a3喨ퟕ፮嗮ꇩ웄\uf62b嶡㢐㻱\uee5b搘:쒪춣渲㈹\ue6a8Ｍ贘빧祎ᡍ\uedef⡋ᙓ䜢\ue266ꇲ蝸砱ꈮꪐ霳\uda8b嚍⧮欄䌔睎猱麻\ude0cϳ펆譽洋酄茕쓦⼗⍏挆壘麸萹眸깲冡聘㛀ꃶ䥢\udd5fµ䆕嵸횰保\ue7a9嫾熺楦⼚ꦋ寏鶩㣍휂\ue373㷧텑傈鏘䜸닖蛜韅ச耆晸凱䝭숞\ue8e5\u0380チ렙큿朠诐䞏忚뷩\ua7e3㌘霈惔豳잼췶ᦛﮡ皷\uf66eἋꠒ\udc5f⢑ꇰ溞짭㣦\ue82f튫\uf06d퇣蓲퍡牾ӭ鵊呈㾐\uecfa뮛浪̯뼣䩓⣳麳纑趴跮\uf1ce䊇敯止\uee89㫟闚夐뼹☓螽鋪☿寶ꖭ冦ᓤ畲\ued54ᩁꮑ\ued50庑ӗ\uda15笶썹嚳鎩ℹ㓧몧꿧鯷措\u1fc5㐸勓ᗝ㿚\udccf䋤饝⁏ꓞ坼䡯倃蒱\uf2c3\u0603몊襸Ṧ艣亍촐᪂ꭷ⦺뱙㽘嫠董ヨ럚\ue005讳葎\udcdf盖贅窾秒\uee8dꙪ䒝ㅜᝃ驽肛줎畳悵帻͵쮸鳟ⰸ弬Ѯ\u1ff0痢)鋦碚礇ಉ꿳腨\uefc8ᘗ\u0010瀌縵삋᱕풉䎇\udd0e㏕㿛⻡쿆᥈导㜩ԓ밧㋆⒏푝详鲪앢♆夹钗삱칙\uf2b0\udf2d쎣尜멇藣뱙Ἳ႟’臝\ud954췄囨ꕍ眎䜓ꀂ棐鲗堭\uf4ca䯮裯⾨᱖멇ﳗ\udf24澟뎔꾑\udde9녾卮佹衑᭖࿔\u12c6\u0ee2䟯\udf4dꦎ見ᵐ\ue582犁끍묈ର兒쁈뗛ﶩꞶ㉬ᒌ껨集徶鉶Ꙟ\ue328탶∆ꝭ쇂ꜫ⾰큌膑롦嬟\ue87f㬇䬖댈\ue5fc\uf46e斬ါ\uec83\ud890ऺ紝㔤诿ᮤ\u0b84훀퐗珏쵏饎幽頬匰\ue61fꆟ쏃ꇳ절⠝鰏렎蔆\ue32a\uf8d7哯먘ᝐ췞䑜ỏ薵ࡘ裔䈱㠶ᓇ„貂䅚冑概䣦槸뗣폶掯\udbfc둋觖\uf47f젠\udfa7瀭㪵嗗㡧⋕꩗\ue5d1\ua4c8嚩禡∩襈菄ꚸ퍤緲脶蕚㘼߽裪\ue846ඵ\u0ba7វ꿕ࠠ䋓絿윺愥赡䄵ϵ鄚ɞ딗죟拤\uedc0欶蕦Ꞓ}\uf73c快꒞䐽\uaa4eﵹ듯䪪ᵡ开\ud996ൈ\uf62e搡躟我椞㞱斔釢冷ꑄ憙焒\ud96f碶鵧覓㞮䧙ꐄ\ud9f6㌆᳝훨係鰵㥴⫁摏ᄄ왡襇曩Ҭ㽣룟㙴楥ꆆ뛎䱞\ude59깆趭쪖扄㕲煦㌢䤍甾\uf70b핚ꧬ얍⯭\ue3d7먠\uf5ecᰄ穢邗讀垰夞ꛥᨵ䡨诣㠅嘮\uf20e\uee52ﮃ묵嘊\udeb0ꏭ黓朝瑐鷘똺ષ윭㰡띊\uefdf㘓\uf277칺뫋貼鈢埿\ue9b4㽈\uec65畾₧䥘䦘㽻黾⁋睁䰁但鸒ᮃ쉛ꑕ莴켥⒩ࡖ⳨鎴五伈\ue7fe\uf7cb\ue5c3\ufffa笵씔כּﰝ\ueb6b쫌\uaad4櫁蒞ꇄ떕먶脻\u1c8c痳\ude6a\ue121䵍ꋑ㙩\uf3f4笝⯠ⴘ礧ꎢ屭럶幦\ue941耫䀢礕쒻ϒ\ue5a6ඏꤏǎ㖌\u2d2cﴖ慴؟쫶걚Ḹ괔\udf54覼趗姑ᡬ䖬নᡮ扛㌳頺㶕⣃⠲徴垛ᬖ헶꿬嗵륜쮛瀈Ӣ钰귻ꌻ啖㵉习唶ߺ㺻\udb46\uf095諤୷蘙繌鑸杫\uf6d8\uf6c7ே㸞ꢰꤑ䒒柌ᐾ塄ྑꋴ캲ꝳ刑陒왪ﭺ榉穒헿漑ʹꗕ\ueb59䓃ֹ穻\ufe67ꭉ賹慬兰鈃Ⲯ⥺す⟪ూ\ud9d1쀖檀㖴ꦊ圀套ཱུ똅\ue5a5\u0b7b㺅뙢\uea5f顰鏘\ue877ޛﳷ⛢྿㦐\udcb2⋰\ue78f\ud865ᵊﶅ\uf846쵳誟\ufefd\uebfa덽┤돦遒\ue414旀䷝諭浧\uddeaᮆ᱇텪\ue8bb麇ᆣ\u008a㰞㶺霄뒟줩밊ቶ颶樇犨ꏋꐑ\ue564倒魁됽ᴅ腖塞좀蓓虗馤镻餵々权秾蚖讚䞲\ue7fb눹\ue7d1嬋勁\ued51⁏썰叛翨ꅛ龳䓀㩉ﷹ奨䊹稍䮫齋駿넠婲鋔⹀鳤휅\uddbb귭譏❴찚㭛刴շ飜㔐꺞ᅰ㩒㏮뽨뾦놙漎輻괴苼貃Ꮙ셜⾖榔鸿༘瘊뻧먹⺔闱ᬘ몽⤣\uf36fﴄ뤿ꧪ㴘婧㛪⯆䁧ﶁ☮약煼닃\ue312浇銣쑄狐삸\ue475訟矴\ue524㍴뢕ꌚṲ脈琲羅윬ᔵ푞᧶柩𥳐ᆹꋳ殳\u0991\u16fb\ude52ꖕ\ufde1鏐핤視\uf4ab돷푾븵\ued41\ud9d4괲跥ፉ◃\ud902椕\uea14ℨ⯏茹癟ᖃﭪ鎈ᓱ赫첤㩶ᄆ顚@틟肝䞡猞뼚ᔑ䍘\udac8㙆惿㇝㤬榩㈥㇕콍詊얻␊\udd9e阣\udbcd쭕ॊ콐䞬䨋偀\uf882꡴ȑꉱꄰ〱籄諽笁⁖䧠췀뢘\ud867좥뽼⏣䭍ꥭ熏拢ﮮ醙闣겙᱁ţ\ue8a8䒻̥㯛伲⃥쏜ᷟ틺\u0bd8얆\u0ffc⼳잌彮ꙕ锐햄ꡘ伪\udef4멩ᆌ噀䲈余끭\u10c9䲱䫉銈犭㪦ꩉ\ue1bf鵾ガ⏍貂ꀟ⩭퀂蕔ځ짉\uf7aeᴬᤄ᙭⾬螿苩戻鷢虮덝揫\udb22樁꭛힋钶焹汯ᤖ黎ﳘ\uf3c3\udb2b\uf431蘥䒇\ufae3쪭\ue254熭㕍춱☜井폟鷤茩ﲊ\uec2b⒧鰄\ue480斻\uf109ક흐쯳荠⥁珰먣췀\u2fe1䗛\uf0cfꗖ⽓ﰚ弦톩ᤈ쥷⨠ﶵ㥔賍끈ၳᤁ\uf32c蛋\udc89\u0ad4븣\uf1cc䔼✜ᾟ\u10ca㹅\ue7d1譛큾㹢꿏薗ꑜᾺ\u09de\u1ad8\ua5dd0椶곺泈蛫ふ྄\u200e们旹鋸즇ꧡ\u0dff\uf30f텉\uf78f냻ໆఽ뗷䆿鯴\ue577ꏲ뾸腐頼㖈쿲\udbe6ꌓ\uf521᪡Ｑʭꓪ蜤\ue0f2\uf39b㽉鋵樓ᒺ抃䵪ᴒ觫鰱귛丗糝ܥ\ue635Შ圮屨ᖕν捘\ue545◄총킗끭ֱ驨甓ᾜ아\ud815뵿\ue9d0僬\uda37嬢隐趷괉좩ￄ蛳悕ֶ翯⢪\ue1be\u0080ﬖ鹘櫽Σ\udba2\uf403喽綉麓按ᵘ⺶둊攣홳☁㗚잒㯵䡽꿵\uf140\ue906ᇬ糈꾫尷֨綥莃\uf7a2턢㻤㌼䆵澊閊ℚ\uee68䫝郄㡍ᔚࡄ\uf42a껬쾲\uf682屜弝\u0e5c㜇댇扆꼰ﰌ\uece7\ue79a\uabfd쉫㌴\ue15e\ud9d5뎮뒡\uec8d䁹\ufb19䆙깄㣝ꃟ櫥\ue031\uf6ea푧ꟑ䶓⍄닥\ue946퀷ꅈ폙슚ሇ\ue968൭寊윣㾇坝끬긚埜\uece8ⱺּ룳榩\uf626⣹왞\ued3f숭쒆哴\u07b8徍ﳜ쐪ࢤꂋ鐁\uf37b\ue023\ue59b㫱됋开棲梍낥\ue7e8슆㟍ꌬ襈㌔滑鋍\udddb佻肪ᴈ챝姦浗옉ⵧ\uf5b1\u0ea6陠ﲬ푢\ue8cb\uee27횷\uf83e痿䳺\uf280俞\ueddb鯜꼵⎔\u0a46쾡읮ᯭ㜩儜\ueaaf녥胟廫蕴庉ઇө옒➵\ud80f좹饌텹緛ଡ붚剬옊￩ꗱ颇穠돨≰䤧㬤\ud844ϙ睍됵ᭊ菝꣎\u0ee0빞䏿鳲\uebd3㏐췼멸\ufbc8\ue371䠨㜿ற蜇♦⠷官컯ﮊ༉ፇ呕潭窚ຠ䵖鳣稧蹱\ue18b霻줌燯\ue147\u13f7챼詜\ueef8〵髲읲鹏\uee0d餫垪⽭奍䷊≖蟊㡑暉ġ팻\uf5e7ꃐⶅ▓ᵝ\ud834\uda57쁟Ȝ⺼谐鿽毊υ䚸ୣ﮹뛸㞤릹ﳊ㫣\uf457粻ካ跤侓⊔⩼膜퀂⨈뫚莠ᬘ豼뭲⢘腟視뿍돊椇\ue71fꃏ浉뽱阖롽⮜嚦䤩ḯ\ud8e1默鏨\ud9b3ꧤꨶ縛쓃߫ᦊꔆ鏫萠鯍\ue5f8炞睱랒\uf101㎮ఇ湂⑸\udbf1ﾳ唽\ud94a応돐Ⓝ鸸懤禭ℂ끺\uf36d䚄雕㏐隖ᛴᰏ늦籎圲\ude2b\ue8b7桝组ὸ㻆Èⰵ릌Ƕ释⇉嚾ヴ佫胜ᦔጵ尐\uf4bd龑핁\u0a56孒兩槎끖祽ਸ਼\udf61⯛沢끯딮ӊ゙닥졏獿怩㆜虺䩲\uf347\ud899\uec91삀령蟻﹣ㄖ隔鹆뫵喝兯ꚞﶧ᪙짚熖㸂듫싶嶴杗뙯惇溩처趲렖ࡧ噫굫샹ၫ፤堬僫舦긵ᒾ挩履ࡍ뿴苶뱷癬䳺뉪暅嶗⫤㘀睁ᝃᔋ齠\ua8c9騷Ꙍ\udc52帚\ufefd臛鵊ﻖリ\ue06c\u0ee4ᇐ記氧覯巯Р휵崰\ue0cb\u1316\ue287鏼颿竲䊞뾳踮ힰḌ璲㓞纑οㄺ\uea03ᠪ\ueb52迶⹊ᾫ䝔厳珓皺㍄䢶㙟⥂멈✅ᡠ嘮\ue97f\u0c4eꑷ房\u206c魯콆䊄䟽ﯥ諉\uf459忒ꥠ\uf873욕뾢놚嚉勩诮鿼줲\ue36c젒Ꮋ붕䐝Ꞩ鵇낌旝Ⳮ⾴ぬ㛴胣椼\uf691\uaafb㠆Ջፃ\uf178躎ḏ视\ue23f䴶䯍瓌⣂㫸\uf40e\uec8a㴙禙璓䗱\uee3b謪蘧ﳣ郚ኔ㨍뮔铣\ue0d0嫦䚋仿⛥ߺả▮껕꼒凝삳\ueb6b\uf602濶ꭎ┴围ផ븈\ue5d4\u09d0䐯ؼ㮼閱歒뱢㼿㕮㔅\ue297᫋㧋Ⴁ艉ꔎ䁢ಀ㤄ꎔ蟒ꎮ\udd76\u0016멫ḕㄈᩀ\ud99a穀毄\uf8a9돦ﲌ뷂앸鯳酃尬\uf4bf蓥睋㚱㢪⼔㿚萀띓܉罕♒̽쮒䴳셨喐뎍澧귬뺯ﺩ\uf3b5ꆱ፳䩷\u0e3dﶠ↫됢叏틅㗝\ue0e1\udd53븑鋷罦䤷篷䢟溁턛\udd72忇췀\ud918䗫빬谴妖졯贬哇두켘\ue609\ueb4e眿噗곺ﹴ鍞\ude41뿅蠊\udac1孹썍쓱춯聉⾧\udda3ꉅꐎ\u196eೇ蓴邬窇☁蠰\uebb0ᡑ\udffc挅࣯쐖痒洯№\uefe4ﾗ顠\uefdc껉僧豒팰놟ሯ젼竰嘾뀕인詢\ue4e6犮聭㤇뻇櫤끮⧅獅䀝⭤\udd18紎㰋嶟\ue1bb螭瑓꾤됨倭\uead3휾炗廻⑅\ud9de餰跪佶珆ㆪ銮薽䌋꾤ﶜ䗜턯誕袉ￗ\ue5d2ꞝ땚㗌豣㘰ᥛ\ue7c8흫튡Ɀ㪽賞\ue0dc큽杄쬙杇劰䳟詘ഓ考暣≜㦑坊暎鮕씞\ue803岟봦ꆂধ끖\ue610\uaace㶵怌泃ੱ暺ᤅ殴탙\uf4d5탱왌㑻Ʒ소Ҵ橦ᐽ䠴逢굜ꭀᥬ\ue39b殹潴\uf07a後Ύ\ued14猤╕窋㩂ᘌ쿣㵫\uee34酸\u200f㓗ᰣ䐩衦줟㝌苂炳奍镄鍪獪宅캓㘎ﲢ\u1afeϜ\u0b64츹参淓恠흃\ua7e7\ue90b䛉䤿匏䇕\udf83쫃ᓘʊ⋑埥\uec66\ue2d3∣ᰶ䢬䲬浬䔡櫳絷ུ秹\ue0ed콦堹⭕뜛⢼麏が駡\ued20\uefad趏륲췄Ⰾ\udf75狅븬⢗⬆ᆩ폕Ⓠﺤ괶渳ឿ璡䆬\ud9d0숞ผ许䱡\uf638\ueef4댃朞熤\u2ddf\uf880ᤑ㕽싮웖\ue3ae渣⚂\udcf6੧侎䨦উ糖夷兛聭쳿皡\ue192猙絝呏쵅轥㣥櫰ট尼Ửｷ\uf374ࡴ㕾鸌ꦢ\u1f17ጮ\udd35䍓쥥䵔\uf46d৴兩協莰њ痤䍼柴䊷苚\uf26bן䦀\ue6e9ƕ럝焎金\uedc7Ạឫ\udc1e䄥掐㖚霣羶䢤♆㡒䁒⊠鮔\ue336럍⌇녰蟏ܘ﹆\u008a뺯㹀\udb56쿟㡖㥏ํ듡㦷\u0382Âﰘ࠱䎰\ue060蘏堿⮞叡蹁滮ዤ鞭뭇욥\ud810肈쮮쥧噕䚷뱐坋\uda55䝺ᔚǘⶠⰋꕲｷ䜜橤쮑㌢栵瀖閇\udb8f疖\u2fe0榘ꅰ\uf2b5崳讘닇죄讠柨䲷ࡏ虩ﻁ\udb81\uf811ﭒ逢ꐗꜾ鳝店鍀䁊꺵ܱ㨣㺪ꢟ쮱ꄴ㮍\udc68鱽阁㍵ɯ㒑騤䡁\udffd㌘\uf0f7差荞ᨰᮤ亏喀鱦ꛗ\uf70c魀㒥㱝䫸賤掯ᅶ誏Ⅹ棧钒枽\uf738㷏軼뾞\udcf8혱↵ꞻ䍸䭾꼪蹩\udade㚡嶝吡鯷촿⧨讐쩖絒䠲ﺫ䬕쾔䂗靰\ue3cdꙷ嵜䝿浆ᛙ輢궇陪䎔蝈셍ꊨţ\uef70䑠\ue0ae懒诜\uee3c\ue839\uf53a嵡䦲ꧺ쬧筇\u0c70犩띂䙙죲㚝\uf146迮첢㛳肟䐝颚\uf40b攒\udf1d쮳興贊괛턳⛨竇庁▬涩蕖⣒㴲㣋ᛉጠꍰỤ\udfe3䤈ࣹｽ여쐀晌\uebd6틞黝ㄭⵓἐ垈⌎稣愔揌넵㴎║Ȋ仆羻\u0bfeᒒﻍ轻ꢹ虬\uf83bእ먘⟚ꕐଂ廝沟\ue5f6\ue86fꋕ\ue8ac釹灪ໃ滖ﵔ慗峒폰፴䃉▕朗斌衆\udd06ი룴鄍륋য়땠\uf5e0앑Șꓸ\uf66c덏뷻ᛋ☰ᓾ셣鍛ꌦࠐ㰈뉝泖떙胾浩\u2d9e셟䤈ᅼ䞇샸⮅轈悦໊ꙷ㕭뭬좟\ue6ef궩쮂\ue11e\ude7aꆽ\u0a80늮␖쟭댘龭䯈寷䦗ᒀ⍣⺃ㄈꚚ醘⯶賺㿌諆谶\ud94d\uea15㸳ༀ឴䶣䬍\ufb0d呯涐礹훌霐觖\ue235\ueba6✴\uea93㹄\u0bbd趏铛삏滎们騭压ୖ↫剨䖎죍ឱ㭉\u07b6挤퇌㾂เլⲫ⦌⒄\udc78⣤ܩꄯ禮ꥃ\udd45獅ዜ蛭놴\uf38a較ٞ穣킕缹솅ｾ欟컀鴲Ϩ웗踎稒弓ſ鿲촇\ue563슒㾬\ueef9≀ﮝ⡠鹲ᖚ䪦㞸敜灞䦇ಶϔ앟\udf98缶\udb68ᝎ\uee5a\uf2aa챁떩\ue14f㳯흠닱첣ὕ燝䰐鷠笓퐫\ue5cd\uea89ᯒˠ⺄贓ⵑᎏ귩㆘퍒홷⧜פ哑≓\u197bꆶ斄−辷㠱\ud926䛡ੌ⏴苓棰㆒\uf169\ufde7颶\uefff⦪ꄐ\uf8eeꁎ㠑ᩫ擀\ue734؊줍\u2d9e⩉ￖ์㇆뀙챐겅纆⟅Ⳇ֟졪꿟麗삁\ue0a1㥥㨧麓\ue775皊\uf3c8줠慃噺\ue532ऺᘁ㧎ꔬ虩ꢔ䊡ⷙ䟌冀뾁े\udf47滼酤ꩯᰰ땷⛈\ue2bd흤녂\u17ea瘳༏刖솉먒\ue095\ue280জꄑἿ\ue276怯蒆㚐䊏曋\u2da7⡃胳阻랝皑䨕纎끏ꈗ걼隸뙒䩅㳹䢭暒쮾┣ꙏ䅷탗僽⼊ﲞ\udf01\ue3df枪プ\ue8a9\uf87f⮎鱣䍒茐戋ѠⰅ虪練ࡖᑒ䬍薹畤\uee72\uf55c쌺ꦹᇝꏟ赇㘣\udb66䃳⣄耳\uebef쮠嗎아䪴앖\u09d9\ue28c쭬찵ザ詻\ue981䳊梅抅멊ⶶ翆箢칞꤄㖵뵂\ueaa9칅틑ꁰ뇕䟣㎵枓臩縺༨ꐠ쑦禭㊻颃侚\uf51c吂ⴛ⩥\udbb3縞\udfdd陌\udf2f汯䃿\udd61㺨\uf14a䘇㕺ｒ\ufae9귈鴵즢폼琯ﮇ钮퇽\u1aae︀\uee79ՙꁝⴇ沔垖趿⭚n䬷炥셝蔴띁ḙ稨펽鋓\uf085薕ື\u0a3a嘉㳒墹擔趉溯\ue021\ue24f䢙咵鄝ꍏ귙쑹⫪琮\udd98ݖ\udb46\uee41㫃፵斮\uedc0Ϣ楗\u0bfc씎⯐呜\udb9a节鏦왃뾼铿掗艧ꕥ뫔풿싻檥\ude7aˆ꒢ੵ떻牄␁삤\ue207狶鞍儐桀쇘쀜ᅪꎔ\u1a9aꨕ輦\uf4e6").toCharArray();
        byte[] bArr = new byte[charArray.length];
        for (int i12 = 0; i12 < charArray.length; i12++) {
            bArr[i12] = (byte) (charArray[i12] & 255);
        }
        f338599f = bArr;
    }

    public static final String AbliGG(String str) {
        char c12;
        int i12;
        char[] cArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (f338598Gj == null) {
            xxIltDr17621();
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iHashCode = (stackTrace[((Integer) f338598Gj[7]).intValue()].getClassName() + stackTrace[((Integer) f338598Gj[7]).intValue()].getMethodName()).hashCode();
        Object[] objArr = f338598Gj;
        int[] iArr = (int[]) objArr[6];
        int i18 = 0;
        int i19 = iArr[0] ^ iHashCode;
        char c13 = 1;
        int i22 = iArr[1] ^ iHashCode;
        char c14 = 2;
        int i23 = iArr[2] ^ iHashCode;
        int i24 = iHashCode ^ iArr[3];
        int[] iArr2 = (int[]) objArr[5];
        int[] iArr3 = (int[]) objArr[1];
        int[] iArr4 = (int[]) objArr[2];
        int[] iArr5 = (int[]) objArr[3];
        int[] iArr6 = (int[]) objArr[4];
        byte[] bArr = (byte[]) objArr[0];
        char[] charArray = str.toCharArray();
        for (boolean z12 = false; !z12; z12 = true) {
            try {
                int length = charArray.length;
                int i25 = i18;
                while (i25 < length) {
                    try {
                        if (i25 % 8 == 0) {
                            int i26 = i19 ^ iArr2[i18];
                            c12 = 3;
                            try {
                                int i27 = i24;
                                int i28 = i26;
                                int i29 = i22 ^ iArr2[c13];
                                int i32 = i23 ^ iArr2[c14];
                                int i33 = i24 ^ iArr2[3];
                                int i34 = i19;
                                int i35 = i22;
                                int i36 = 4;
                                while (i36 < 36) {
                                    try {
                                        i13 = i23;
                                        try {
                                            i15 = (((iArr3[i28 & 255] ^ iArr4[(i29 >> 8) & 255]) ^ iArr5[(i32 >> 16) & 255]) ^ iArr6[i33 >>> 24]) ^ iArr2[i36];
                                            i16 = length;
                                            i17 = (((iArr3[i29 & 255] ^ iArr4[(i32 >> 8) & 255]) ^ iArr5[(i33 >> 16) & 255]) ^ iArr6[i28 >>> 24]) ^ iArr2[i36 + 1];
                                            cArr = charArray;
                                        } catch (Exception unused) {
                                            i24 = i27;
                                            i19 = i34;
                                            i22 = i35;
                                            i23 = i13;
                                            i18 = 0;
                                            c13 = 1;
                                            c14 = 2;
                                        }
                                        try {
                                            int i37 = (((iArr3[i32 & 255] ^ iArr4[(i33 >> 8) & 255]) ^ iArr5[(i28 >> 16) & 255]) ^ iArr6[i29 >>> 24]) ^ iArr2[i36 + 2];
                                            int i38 = (((iArr3[i33 & 255] ^ iArr4[(i28 >> 8) & 255]) ^ iArr5[(i29 >> 16) & 255]) ^ iArr6[i32 >>> 24]) ^ iArr2[i36 + 3];
                                            i28 = iArr2[i36 + 4] ^ (((iArr3[i15 & 255] ^ iArr4[(i17 >> 8) & 255]) ^ iArr5[(i37 >> 16) & 255]) ^ iArr6[i38 >>> 24]);
                                            i29 = (((iArr3[i17 & 255] ^ iArr4[(i37 >> 8) & 255]) ^ iArr5[(i38 >> 16) & 255]) ^ iArr6[i15 >>> 24]) ^ iArr2[i36 + 5];
                                            i32 = (((iArr3[i37 & 255] ^ iArr4[(i38 >> 8) & 255]) ^ iArr5[(i15 >> 16) & 255]) ^ iArr6[i17 >>> 24]) ^ iArr2[i36 + 6];
                                            i33 = (((iArr3[i38 & 255] ^ iArr4[(i15 >> 8) & 255]) ^ iArr5[(i17 >> 16) & 255]) ^ iArr6[i37 >>> 24]) ^ iArr2[i36 + 7];
                                            i36 += 8;
                                            i23 = i13;
                                            length = i16;
                                            charArray = cArr;
                                        } catch (Exception unused2) {
                                            i24 = i27;
                                            i19 = i34;
                                            i22 = i35;
                                            i23 = i13;
                                            charArray = cArr;
                                            i18 = 0;
                                            c13 = 1;
                                            c14 = 2;
                                        }
                                    } catch (Exception unused3) {
                                        i24 = i27;
                                        i19 = i34;
                                        i22 = i35;
                                    }
                                }
                                i13 = i23;
                                i12 = length;
                                cArr = charArray;
                                int i39 = (((iArr3[i28 & 255] ^ iArr4[(i29 >> 8) & 255]) ^ iArr5[(i32 >> 16) & 255]) ^ iArr6[i33 >>> 24]) ^ iArr2[i36];
                                int i42 = (((iArr3[i29 & 255] ^ iArr4[(i32 >> 8) & 255]) ^ iArr5[(i33 >> 16) & 255]) ^ iArr6[i28 >>> 24]) ^ iArr2[i36 + 1];
                                int i43 = (((iArr3[i32 & 255] ^ iArr4[(i33 >> 8) & 255]) ^ iArr5[(i28 >> 16) & 255]) ^ iArr6[i29 >>> 24]) ^ iArr2[i36 + 2];
                                int i44 = (((iArr3[i33 & 255] ^ iArr4[(i28 >> 8) & 255]) ^ iArr5[(i29 >> 16) & 255]) ^ iArr6[i32 >>> 24]) ^ iArr2[i36 + 3];
                                int i45 = iArr2[i36 + 4] ^ ((((bArr[i39 & 255] & 255) ^ ((bArr[(i42 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i43 >> 16) & 255] & 255) << 16)) ^ (bArr[i44 >>> 24] << 24));
                                try {
                                    i14 = ((((bArr[i42 & 255] & 255) ^ ((bArr[(i43 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i44 >> 16) & 255] & 255) << 16)) ^ (bArr[i39 >>> 24] << 24)) ^ iArr2[i36 + 5];
                                } catch (Exception unused4) {
                                    i24 = i27;
                                    i19 = i45;
                                    i22 = i35;
                                    i23 = i13;
                                    charArray = cArr;
                                    i18 = 0;
                                    c13 = 1;
                                    c14 = 2;
                                }
                                try {
                                    int i46 = ((((bArr[i43 & 255] & 255) ^ ((bArr[(i44 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i39 >> 16) & 255] & 255) << 16)) ^ (bArr[i42 >>> 24] << 24)) ^ iArr2[i36 + 6];
                                    try {
                                        i24 = ((((bArr[i44 & 255] & 255) ^ ((bArr[(i39 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i42 >> 16) & 255] & 255) << 16)) ^ (bArr[i43 >>> 24] << 24)) ^ iArr2[i36 + 7];
                                        i19 = i45;
                                        i22 = i14;
                                        i23 = i46;
                                    } catch (Exception unused5) {
                                        i24 = i27;
                                        i19 = i45;
                                        i22 = i14;
                                        i23 = i46;
                                        charArray = cArr;
                                        i18 = 0;
                                        c13 = 1;
                                        c14 = 2;
                                    }
                                } catch (Exception unused6) {
                                    i24 = i27;
                                    i19 = i45;
                                    i22 = i14;
                                    i23 = i13;
                                    charArray = cArr;
                                    i18 = 0;
                                    c13 = 1;
                                    c14 = 2;
                                }
                            } catch (Exception unused7) {
                                c13 = 1;
                            }
                        } else {
                            i12 = length;
                            cArr = charArray;
                        }
                        try {
                            switch (i25 % 8) {
                                case 0:
                                    cArr[i25] = (char) ((i19 >> 16) ^ cArr[i25]);
                                    break;
                                case 1:
                                    cArr[i25] = (char) (cArr[i25] ^ i19);
                                    break;
                                case 2:
                                    cArr[i25] = (char) ((i22 >> 16) ^ cArr[i25]);
                                    break;
                                case 3:
                                    cArr[i25] = (char) (cArr[i25] ^ i22);
                                    break;
                                case 4:
                                    cArr[i25] = (char) ((i23 >> 16) ^ cArr[i25]);
                                    break;
                                case 5:
                                    cArr[i25] = (char) (cArr[i25] ^ i23);
                                    break;
                                case 6:
                                    cArr[i25] = (char) ((i24 >> 16) ^ cArr[i25]);
                                    break;
                                case 7:
                                    cArr[i25] = (char) (cArr[i25] ^ i24);
                                    break;
                            }
                        } catch (Exception unused8) {
                        }
                        i25++;
                        length = i12;
                        charArray = cArr;
                        i18 = 0;
                        c13 = 1;
                        c14 = 2;
                    } catch (Exception unused9) {
                        c12 = 3;
                    }
                }
                return new String(charArray);
            } catch (Exception unused10) {
            }
        }
        return new String(charArray);
    }

    private static void Ayu(File file, String str) throws IOException {
        String strAbliGG;
        String str2;
        if (AbliGG("\uf0eb螚ໝ").equals(str)) {
            strAbliGG = AbliGG("꿲\uda0d癳\uf129眳荃仌ᣵ뷾\udbceὅ띏");
            str2 = "\uf0ee螘ພ鮈뜘枛\ue33c㍮\u171aꛢ觊፰恣췐嬮櫮縩庥ꈾ\uee44꾫";
        } else if (AbliGG("\uf0eb螚ໝ鯟띞").equals(str)) {
            strAbliGG = AbliGG("團퀼ז팎䄦嗏鬌㊇̬ዟ࡛꜓");
            str2 = "\uf0ee螘ພ鮈뜘枛\ue33c㍮᜕ꛢ觊፰恣춐嬮櫥繮庥ꈾ\uee44꾫";
        } else if (AbliGG("\uf0f2蟐ຆ").equals(str)) {
            strAbliGG = AbliGG("\ue591㪩펀믯荪\ue3de㏤沺垬䔀窴甩");
            str2 = "\uf0ee螘ພ鮑띒柀\ue33f㍫ᝂꛢ覍፴怽췇孶櫮繬庸";
        } else {
            if (!AbliGG("\uf0f2蟐ຆ鮶띜柂").equals(str)) {
                throw new IllegalArgumentException(AbliGG("\uf0df螆ໃ鮜뜚枆\ue37e㍪\u1759ꚩ觝ጿ怤췋嬫櫷繮廾ꈰ\uee40꿱\uee55揋\ue44a赠ꋰꅊ\ue3c5") + str);
            }
            strAbliGG = AbliGG("ꔇ弭𤋮禝\udb11꾛斧\ue528\ue9b4鱈\uf3d0겪");
            str2 = "\uf0ee螘ພ鮑띒柀\ue34e㌮\u1719ꛢ觊፰恣췟嬱檲繪庥ꈾ\uee44꾫";
        }
        InputStream inputStreamOpen = ((Context) f338597F).getAssets().open(AbliGG(str2));
        try {
            InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(new FileOutputStream(file));
            try {
                pf(strAbliGG, inputStreamOpen, inflaterOutputStream);
            } finally {
                inflaterOutputStream.close();
            }
        } finally {
            inputStreamOpen.close();
        }
    }

    private static final int Bysm(int i12, int i13) {
        return (i12 << (-i13)) | (i12 >>> i13);
    }

    private static final void FzE() {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int length = stackTrace.length;
            for (int i12 = 1; i12 < length; i12++) {
                StringBuilder sb2 = new StringBuilder();
                try {
                    try {
                        sb2.append(stackTrace[i12].getClassName());
                        sb2.append(stackTrace[i12].getMethodName());
                    } catch (Exception unused) {
                        f338598Gj[7] = 4;
                        if (sb2.toString().hashCode() == 172269919) {
                            f338598Gj[7] = Integer.valueOf(i12);
                            return;
                        }
                    }
                    if (sb2.toString().hashCode() == 172269919) {
                        f338598Gj[7] = Integer.valueOf(i12);
                        return;
                    }
                } catch (Throwable th2) {
                    if (sb2.toString().hashCode() != 172269919) {
                        throw th2;
                    }
                    f338598Gj[7] = Integer.valueOf(i12);
                    return;
                }
            }
        } catch (Exception unused2) {
            f338598Gj[7] = 3;
        }
    }

    private static int[] GDHed(int[] iArr) {
        int[] iArr2 = new int[27];
        int i12 = 0;
        int i13 = iArr[0];
        iArr2[0] = i13;
        int[] iArr3 = new int[3];
        iArr3[0] = iArr[1];
        iArr3[1] = iArr[2];
        iArr3[2] = iArr[3];
        while (i12 < 26) {
            int i14 = i12 % 3;
            int i15 = iArr3[i14];
            int i16 = (((i15 << 24) | (i15 >>> 8)) + i13) ^ i12;
            iArr3[i14] = i16;
            i13 = ((i13 << 3) | (i13 >>> 29)) ^ i16;
            i12++;
            iArr2[i12] = i13;
        }
        return iArr2;
    }

    public static InputStream Jhe(Class cls, String str) {
        String strSubstring;
        if (str == null) {
            return cls.getResourceAsStream(str);
        }
        if (str.charAt(0) == '/') {
            strSubstring = str.substring(1);
        } else {
            strSubstring = cls.getName().replace('.', '/') + '/' + str;
        }
        return txvgF(strSubstring);
    }

    private static final int ep(byte[] bArr, int i12) {
        try {
            return (bArr[i12 & 255] & 255) | ((bArr[(i12 >> 8) & 255] & 255) << 8) | ((bArr[(i12 >> 16) & 255] & 255) << 16) | (bArr[(i12 >> 24) & 255] << 24);
        } catch (Exception unused) {
            try {
                return bArr[i12 & 127] >> 8;
            } catch (Exception unused2) {
                return bArr[14] << 16;
            }
        }
    }

    public static native boolean g(String str, int i12, List list);

    private static native void ipC(int[] iArr);

    private static void lytIh(int[] iArr, int[] iArr2) {
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = (((i13 << 24) | (i13 >>> 8)) + i12) ^ iArr[0];
        int i15 = ((i12 >>> 29) | (i12 << 3)) ^ i14;
        int i16 = (((i14 << 24) | (i14 >>> 8)) + i15) ^ iArr[1];
        int i17 = ((i15 >>> 29) | (i15 << 3)) ^ i16;
        int i18 = (((i16 << 24) | (i16 >>> 8)) + i17) ^ iArr[2];
        int i19 = ((i17 >>> 29) | (i17 << 3)) ^ i18;
        int i22 = (((i18 << 24) | (i18 >>> 8)) + i19) ^ iArr[3];
        int i23 = ((i19 >>> 29) | (i19 << 3)) ^ i22;
        int i24 = (((i22 << 24) | (i22 >>> 8)) + i23) ^ iArr[4];
        int i25 = ((i23 >>> 29) | (i23 << 3)) ^ i24;
        int i26 = (((i24 << 24) | (i24 >>> 8)) + i25) ^ iArr[5];
        int i27 = ((i25 >>> 29) | (i25 << 3)) ^ i26;
        int i28 = (((i26 << 24) | (i26 >>> 8)) + i27) ^ iArr[6];
        int i29 = ((i27 >>> 29) | (i27 << 3)) ^ i28;
        int i32 = (((i28 << 24) | (i28 >>> 8)) + i29) ^ iArr[7];
        int i33 = ((i29 >>> 29) | (i29 << 3)) ^ i32;
        int i34 = (((i32 << 24) | (i32 >>> 8)) + i33) ^ iArr[8];
        int i35 = ((i33 >>> 29) | (i33 << 3)) ^ i34;
        int i36 = (((i34 << 24) | (i34 >>> 8)) + i35) ^ iArr[9];
        int i37 = ((i35 >>> 29) | (i35 << 3)) ^ i36;
        int i38 = (((i36 << 24) | (i36 >>> 8)) + i37) ^ iArr[10];
        int i39 = ((i37 >>> 29) | (i37 << 3)) ^ i38;
        int i42 = (((i38 << 24) | (i38 >>> 8)) + i39) ^ iArr[11];
        int i43 = ((i39 >>> 29) | (i39 << 3)) ^ i42;
        int i44 = (((i42 << 24) | (i42 >>> 8)) + i43) ^ iArr[12];
        int i45 = ((i43 >>> 29) | (i43 << 3)) ^ i44;
        int i46 = (((i44 << 24) | (i44 >>> 8)) + i45) ^ iArr[13];
        int i47 = ((i45 >>> 29) | (i45 << 3)) ^ i46;
        int i48 = (((i46 << 24) | (i46 >>> 8)) + i47) ^ iArr[14];
        int i49 = ((i47 >>> 29) | (i47 << 3)) ^ i48;
        int i52 = (((i48 << 24) | (i48 >>> 8)) + i49) ^ iArr[15];
        int i53 = ((i49 >>> 29) | (i49 << 3)) ^ i52;
        int i54 = (((i52 << 24) | (i52 >>> 8)) + i53) ^ iArr[16];
        int i55 = ((i53 >>> 29) | (i53 << 3)) ^ i54;
        int i56 = (((i54 << 24) | (i54 >>> 8)) + i55) ^ iArr[17];
        int i57 = ((i55 >>> 29) | (i55 << 3)) ^ i56;
        int i58 = (((i56 << 24) | (i56 >>> 8)) + i57) ^ iArr[18];
        int i59 = ((i57 >>> 29) | (i57 << 3)) ^ i58;
        int i62 = (((i58 << 24) | (i58 >>> 8)) + i59) ^ iArr[19];
        int i63 = ((i59 >>> 29) | (i59 << 3)) ^ i62;
        int i64 = (((i62 << 24) | (i62 >>> 8)) + i63) ^ iArr[20];
        int i65 = ((i63 >>> 29) | (i63 << 3)) ^ i64;
        int i66 = (((i64 << 24) | (i64 >>> 8)) + i65) ^ iArr[21];
        int i67 = ((i65 >>> 29) | (i65 << 3)) ^ i66;
        int i68 = (((i66 << 24) | (i66 >>> 8)) + i67) ^ iArr[22];
        int i69 = ((i67 >>> 29) | (i67 << 3)) ^ i68;
        int i72 = (((i68 << 24) | (i68 >>> 8)) + i69) ^ iArr[23];
        int i73 = ((i69 >>> 29) | (i69 << 3)) ^ i72;
        int i74 = (((i72 << 24) | (i72 >>> 8)) + i73) ^ iArr[24];
        int i75 = ((i73 >>> 29) | (i73 << 3)) ^ i74;
        int i76 = (((i74 << 24) | (i74 >>> 8)) + i75) ^ iArr[25];
        int i77 = ((i75 >>> 29) | (i75 << 3)) ^ i76;
        int i78 = iArr[26];
        int i79 = i78 ^ (((i76 << 24) | (i76 >>> 8)) + i77);
        iArr2[0] = ((i77 >>> 29) | (i77 << 3)) ^ i79;
        iArr2[1] = i79;
    }

    private static void oiwrI(String str) {
        File file = new File(((Context) f338597F).getDir(AbliGG("妞酶㻬▖ￋ冈"), 0), AbliGG("妝酪㻺▖ￋ冈亞謟情䱻\uee44ꌿ浉斌늇苍斞棽棦䞎랈ᦵ䠳㨟") + Process.myPid() + AbliGG("姟酰㻷"));
        try {
            Ayu(file, str);
            System.load(file.getAbsolutePath());
        } finally {
            file.delete();
        }
    }

    private static void pf(String str, InputStream inputStream, OutputStream outputStream) throws IOException {
        char[] charArray = str.toCharArray();
        int[] iArr = {charArray[0] | (charArray[1] << 16), charArray[2] | (charArray[3] << 16), charArray[4] | (charArray[5] << 16), charArray[6] | (charArray[7] << 16)};
        int[] iArr2 = {charArray[8] | (charArray[9] << 16), (charArray[11] << 16) | charArray[10]};
        int[] iArrGDHed = GDHed(iArr);
        byte[] bArr = new byte[8192];
        int i12 = 0;
        while (true) {
            int i13 = inputStream.read(bArr);
            if (i13 < 0) {
                return;
            }
            int i14 = i12 + i13;
            int i15 = 0;
            while (i12 < i14) {
                int i16 = i12 % 8;
                int i17 = i16 / 4;
                int i18 = i12 % 4;
                if (i16 == 0) {
                    lytIh(iArrGDHed, iArr2);
                }
                bArr[i15] = (byte) (((byte) (iArr2[i17] >> (i18 * 8))) ^ bArr[i15]);
                i12++;
                i15++;
            }
            outputStream.write(bArr, 0, i13);
        }
    }

    public static native String s(String str);

    private static void tb(Object obj) throws IOException {
        if (JExj) {
            return;
        }
        f338597F = obj;
        String strU = u();
        String str = AbliGG("꾊ퟗӕ\u0a7f떁깰ო竁ڍ鰸莞鸐\ue08b䐎딆犧\uf565ⲧ煆\ufe6dꨅ駃鞅爱\u0a3d\ue4c7먀묔瓊ꖯኂ鹦ຳ袨\udbfbᙪ\uf184퍡\udedf鴸\ueec4ꨑᛨ⥯") + strU + ':' + Build.CPU_ABI + ' ' + Build.VERSION.SDK_INT + ' ' + Build.FINGERPRINT;
        AbliGG("꾈ퟛӃੈ떖깭კ竖ڇ鰢莅鹂");
        AbliGG("꾊ퟗӕ\u0a7f떁깰ო竁ڍ鰸莞鸐").concat(str);
        oiwrI(strU);
        char[] charArray = AbliGG("\ue178韝ᾈ霗婔먭\uddf9灭峎\ud827崩ឱ棸⬐⑾㳣").toCharArray();
        int length = charArray.length / 2;
        int[] iArr = new int[length];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i12 + 1;
            char c12 = charArray[i12];
            i12 += 2;
            iArr[i13] = (charArray[i14] << 16) | c12;
        }
        ipC(iArr);
        JExj = true;
    }

    private static native InputStream txvgF(String str);

    private static String u() throws IOException {
        byte[] bArr = new byte[20];
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AbliGG("∺ꤙ毤㕲Ꮡ┥鸄溙‖肄퇬耏㖿袣"), AbliGG("≧"));
            try {
                randomAccessFile.readFully(bArr);
                if (bArr[0] != 127 || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70) {
                    return AbliGG("≗꤈毲㔽\u13f7╆鸱滜‗肃톤考㖤");
                }
                int i12 = ((bArr[19] & 255) << 8) | (bArr[18] & 255);
                if (i12 == 3) {
                    return AbliGG("≭ꥑ殠");
                }
                if (i12 == 40) {
                    return AbliGG("≴ꤛ毻");
                }
                if (i12 == 62) {
                    return AbliGG("≭ꥑ殠㕂ᎄ┾");
                }
                if (i12 == 183) {
                    return AbliGG("≴ꤛ毻㔫ᎆ");
                }
                return AbliGG("≖ꤦ毒㕘᎒┺鸏") + Integer.toHexString(i12);
            } finally {
                randomAccessFile.close();
            }
        } catch (Exception unused) {
            return AbliGG("≇ꤌ毷㕹᎒╏鸻溺⁚肇톱耘㖨袴");
        }
    }

    private static final void xxIltDr17621() {
        int[] iArr = new int[256];
        byte[] bArr = new byte[256];
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[256];
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int[] iArr6 = new int[30];
        int i12 = 0;
        int i13 = 1;
        for (int i14 = 0; i14 < 256; i14++) {
            iArr[i14] = i13;
            i13 ^= (i13 << 1) ^ ((i13 >>> 7) * 283);
        }
        bArr[0] = 99;
        for (int i15 = 0; i15 < 255; i15++) {
            try {
                int i16 = iArr[255 - i15];
                int i17 = i16 | (i16 << 8);
                bArr[iArr[i15]] = (byte) ((i17 ^ ((((i17 >> 4) ^ (i17 >> 5)) ^ (i17 >> 6)) ^ (i17 >> 7))) ^ 99);
            } catch (Exception unused) {
            }
        }
        for (int i18 = 0; i18 < 256; i18++) {
            int i19 = bArr[i18] & 255;
            int i22 = (i19 << 1) ^ ((i19 >>> 7) * 283);
            int i23 = ((i19 << 8) ^ (((i19 ^ i22) << 24) ^ (i19 << 16))) ^ i22;
            iArr2[i18] = i23;
            iArr3[i18] = (i23 << 8) | (i23 >>> (-8));
            iArr4[i18] = (i23 << 16) | (i23 >>> (-16));
            iArr5[i18] = (i23 >>> (-24)) | (i23 << 24);
        }
        int i24 = 1;
        for (int i25 = 0; i25 < 30; i25++) {
            iArr6[i25] = i24;
            i24 = ((i24 >>> 7) * 283) ^ (i24 << 1);
        }
        byte[] bArr2 = new byte[16];
        int i26 = 0;
        while (true) {
            if (i26 != 0) {
                bArr2[8] = -50;
                bArr2[9] = 92;
                bArr2[10] = 0;
                bArr2[11] = -49;
                bArr2[12] = -21;
                bArr2[13] = -20;
                bArr2[14] = 52;
                bArr2[15] = -65;
                break;
            }
            i26++;
            try {
                bArr2[0] = -37;
                bArr2[1] = -105;
                bArr2[2] = -79;
                bArr2[3] = -19;
                bArr2[4] = -19;
                bArr2[5] = 67;
                bArr2[6] = 59;
                bArr2[7] = 28;
                bArr2[8] = -50;
                bArr2[9] = 92;
                bArr2[10] = 0;
                bArr2[11] = -49;
                bArr2[12] = -21;
                bArr2[13] = -20;
                bArr2[14] = 52;
                bArr2[15] = -65;
                break;
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                bArr2[8] = -50;
                bArr2[9] = 92;
                bArr2[10] = 0;
                bArr2[11] = -49;
                bArr2[12] = -21;
                bArr2[13] = -20;
                bArr2[14] = 52;
                bArr2[15] = -65;
                throw th2;
            }
        }
        int[] iArr7 = new int[44];
        int i27 = 0;
        loop3: while (i27 == 0) {
            i27 += 3;
            int i28 = i12;
            int i29 = i28;
            while (true) {
                int i32 = i12;
                while (i32 == 0) {
                    i32 += 3;
                    if (i28 >= 16) {
                        break;
                    }
                    try {
                    } catch (Exception unused3) {
                    }
                    try {
                        iArr7[(((i29 >> 2) * 4) + i29) & 3] = (bArr2[i28] & 255) | ((bArr2[i28 + 1] & 255) << 8) | ((bArr2[i28 + 2] & 255) << 16) | (bArr2[i28 + 3] << 24);
                        break;
                    } catch (Exception unused4) {
                    }
                }
                i28 += 4;
                i29++;
                i12 = 0;
            }
            for (int i33 = 4; i33 < 44; i33++) {
                int i34 = i33 - 1;
                try {
                    int iEp = iArr7[((i34 >> 2) * 4) + (i34 & 3)];
                    if (i33 % 4 == 0) {
                        iEp = ep(bArr, Bysm(iEp, 8)) ^ iArr6[(i33 / 4) - 1];
                    }
                    int i35 = i33 - 4;
                    iArr7[((i33 >> 2) * 4) + (i33 & 3)] = iEp ^ iArr7[((i35 >> 2) * 4) + (i35 & 3)];
                } catch (Exception unused5) {
                    i12 = 0;
                }
            }
            break loop3;
        }
        Object[] objArr = new Object[8];
        objArr[0] = bArr;
        objArr[1] = iArr2;
        objArr[2] = iArr3;
        objArr[3] = iArr4;
        objArr[4] = iArr5;
        objArr[5] = iArr7;
        objArr[6] = new int[]{1446260657, 2063475010, 1237024749, 1069569276};
        f338598Gj = objArr;
        FzE();
    }

    public static void zCDEAyeaF(Context context) throws IOException {
        tb(context);
    }
}
