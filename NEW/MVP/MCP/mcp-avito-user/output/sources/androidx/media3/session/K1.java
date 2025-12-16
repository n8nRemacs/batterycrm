package androidx.media3.session;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.C37414t3;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: SessionCommand.java */
/* loaded from: classes.dex */
public final class K1 implements InterfaceC23096j {

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC37401r1<Integer> f52109e = AbstractC37401r1.E(40010);

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC37401r1<Integer> f52110f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f52111g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f52112h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f52113i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final M1 f52114j;

    /* renamed from: b, reason: collision with root package name */
    public final int f52115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52116c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f52117d;

    /* compiled from: SessionCommand.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        C37414t3.a(7, objArr);
        f52110f = AbstractC37401r1.r(7, objArr);
        int i12 = androidx.media3.common.util.M.f47887a;
        f52111g = Integer.toString(0, 36);
        f52112h = Integer.toString(1, 36);
        f52113i = Integer.toString(2, 36);
        f52114j = new M1(13);
    }

    public K1(int i12) {
        C23110a.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i12 != 0);
        this.f52115b = i12;
        this.f52116c = "";
        this.f52117d = Bundle.EMPTY;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof K1)) {
            return false;
        }
        K1 k12 = (K1) obj;
        return this.f52115b == k12.f52115b && TextUtils.equals(this.f52116c, k12.f52116c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52116c, Integer.valueOf(this.f52115b)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f52111g, this.f52115b);
        bundle.putString(f52112h, this.f52116c);
        bundle.putBundle(f52113i, this.f52117d);
        return bundle;
    }

    public K1(Bundle bundle, String str) {
        this.f52115b = 0;
        str.getClass();
        this.f52116c = str;
        bundle.getClass();
        this.f52117d = new Bundle(bundle);
    }
}
