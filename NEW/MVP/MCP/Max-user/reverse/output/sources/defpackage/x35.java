package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class x35 implements p8g {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public Object e;

    public x35(String str, int i, boolean z) {
        int i2 = i * 256;
        this.a = i2;
        this.b = i2;
        this.c = i;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.p8g
    public m8g a(int i, int i2, int i3) {
        int i4 = this.c;
        boolean z = this.d;
        String str = (String) this.e;
        bwf bwfVar = r8g.a;
        StringBuilder sb = new StringBuilder("https://tiles.api-maps.yandex.ru/v1/tiles/?lang=ru_RU&l=map&projection=web_mercator&maptype=future_map&");
        if (i4 != 1) {
            sb.append("scale=");
            sb.append(i4);
            sb.append('&');
        }
        if (!z) {
            sb.append("theme=dark&");
        }
        sb.append("x=");
        sb.append(i);
        sb.append("&y=");
        sb.append(i2);
        sb.append("&z=");
        sb.append(i3);
        sb.append("&apikey=");
        sb.append(str);
        try {
            URL url = new URL(sb.toString());
            try {
                int i5 = this.a;
                int i6 = this.b;
                InputStream inputStream = url.openConnection().getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                s5j.h(inputStream, "from must not be null.");
                byte[] bArr = new byte[4096];
                while (true) {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        return new m8g(i5, byteArrayOutputStream.toByteArray(), i6);
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        } catch (MalformedURLException e) {
            throw new AssertionError(e);
        }
    }

    public void b(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.d) {
            drawable.setColorFilter((ColorFilter) this.e);
        }
        int i2 = this.b;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.c;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }

    public x35() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }
}
