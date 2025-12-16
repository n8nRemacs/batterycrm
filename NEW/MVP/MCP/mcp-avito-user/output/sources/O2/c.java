package O2;

import androidx.annotation.RestrictTo;
import androidx.compose.foundation.H;
import java.util.ArrayList;

/* compiled from: FontCharacter.java */
@RestrictTo
/* loaded from: classes10.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11936a;

    /* renamed from: b, reason: collision with root package name */
    public final char f11937b;

    /* renamed from: c, reason: collision with root package name */
    public final double f11938c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11939d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11940e;

    public c(ArrayList arrayList, char c12, double d12, String str, String str2) {
        this.f11936a = arrayList;
        this.f11937b = c12;
        this.f11938c = d12;
        this.f11939d = str;
        this.f11940e = str2;
    }

    public static int a(char c12, String str, String str2) {
        return str2.hashCode() + H.d(c12 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f11937b, this.f11940e, this.f11939d);
    }
}
