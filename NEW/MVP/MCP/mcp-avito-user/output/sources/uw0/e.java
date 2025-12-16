package UW0;

import com.facebook.infer.annotation.Nullsafe;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: RotationOptions.java */
@Nullsafe
/* loaded from: classes12.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f16416b = new e(false);

    /* renamed from: c, reason: collision with root package name */
    public static final e f16417c = new e(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16418a;

    /* compiled from: RotationOptions.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(boolean z12) {
        this.f16418a = z12;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        return this.f16418a == eVar.f16418a;
    }

    public final int hashCode() {
        Integer num = -1;
        Boolean boolValueOf = Boolean.valueOf(this.f16418a);
        return ((num.hashCode() + 31) * 31) + boolValueOf.hashCode();
    }

    public final String toString() {
        return "-1 defer:" + this.f16418a;
    }
}
