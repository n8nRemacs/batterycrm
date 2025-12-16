package z0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Locale.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lz0/e;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f443674b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Locale f443675a;

    /* compiled from: Locale.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz0/e$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k Locale locale) {
        this.f443675a = locale;
    }

    public final boolean equals(@l Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return L.f(this.f443675a.toLanguageTag(), ((e) obj).f443675a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f443675a.toLanguageTag().hashCode();
    }

    @k
    public final String toString() {
        return this.f443675a.toLanguageTag();
    }
}
