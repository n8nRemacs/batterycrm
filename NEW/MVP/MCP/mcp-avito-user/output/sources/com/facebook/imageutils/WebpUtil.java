package com.facebook.imageutils;

import I41.h;
import android.util.Pair;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;

@Nullsafe
/* loaded from: classes15.dex */
public class WebpUtil {
    public static void a(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    @h
    public static Pair<Integer, Integer> b(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        short s5 = (short) (inputStream.read() & 255);
        short s12 = (short) (inputStream.read() & 255);
        short s13 = (short) (inputStream.read() & 255);
        if (s5 == 157 && s12 == 1 && s13 == 42) {
            return new Pair<>(Integer.valueOf(get2BytesAsInt(inputStream)), Integer.valueOf(get2BytesAsInt(inputStream)));
        }
        return null;
    }

    @h
    public static Pair<Integer, Integer> c(InputStream inputStream) throws IOException {
        a(inputStream);
        if (((byte) (inputStream.read() & 255)) != 47) {
            return null;
        }
        int i12 = ((byte) inputStream.read()) & 255;
        byte b12 = (byte) inputStream.read();
        return new Pair<>(Integer.valueOf((i12 | ((b12 & 63) << 8)) + 1), Integer.valueOf((((((byte) inputStream.read()) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((b12 & 192) >> 6)) + 1));
    }

    public static int d(InputStream inputStream) {
        byte b12 = (byte) (inputStream.read() & 255);
        return ((((byte) (inputStream.read() & 255)) << 16) & 16711680) | ((((byte) (inputStream.read() & 255)) << 8) & 65280) | (b12 & 255);
    }

    public static int get2BytesAsInt(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    @h
    public static Pair<Integer, Integer> getSize(InputStream inputStream) {
        int i12;
        boolean z12;
        boolean z13;
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 4) {
                            z12 = true;
                            break;
                        }
                        if ("RIFF".charAt(i13) != bArr[i13]) {
                            z12 = false;
                            break;
                        }
                        i13++;
                    }
                } catch (IOException e12) {
                    e12.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            if (!z12) {
                try {
                    inputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return null;
            }
            a(inputStream);
            inputStream.read(bArr);
            int i14 = 0;
            while (true) {
                if (i14 >= 4) {
                    z13 = true;
                    break;
                }
                if ("WEBP".charAt(i14) != bArr[i14]) {
                    z13 = false;
                    break;
                }
                i14++;
            }
            if (!z13) {
                try {
                    inputStream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (i12 = 0; i12 < 4; i12++) {
                sb2.append((char) bArr[i12]);
            }
            String string = sb2.toString();
            if ("VP8 ".equals(string)) {
                Pair<Integer, Integer> pairB = b(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
                return pairB;
            }
            if ("VP8L".equals(string)) {
                Pair<Integer, Integer> pairC = c(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
                return pairC;
            }
            if (!"VP8X".equals(string)) {
                inputStream.close();
                return null;
            }
            inputStream.skip(8L);
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(d(inputStream) + 1), Integer.valueOf(d(inputStream) + 1));
            try {
                inputStream.close();
            } catch (IOException e18) {
                e18.printStackTrace();
            }
            return pair;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e19) {
                    e19.printStackTrace();
                }
            }
            throw th2;
        }
    }
}
