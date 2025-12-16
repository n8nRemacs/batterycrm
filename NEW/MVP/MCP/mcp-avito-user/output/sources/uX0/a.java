package UX0;

import android.util.Log;
import com.google.android.gms.common.internal.C36713l;
import j.N;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16441c;

    @RX0.a
    public a(@N String str, @N String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f16440b = string;
        this.f16439a = str;
        new C36713l(str, null);
        int i12 = 2;
        while (i12 <= 7 && !Log.isLoggable(this.f16439a, i12)) {
            i12++;
        }
        this.f16441c = i12;
    }

    @RX0.a
    public final void a(@N String str, @N Object... objArr) {
        if (this.f16441c <= 3) {
            b(str, objArr);
        }
    }

    @N
    @RX0.a
    public final void b(@N String str, @N Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        this.f16440b.concat(str);
    }
}
