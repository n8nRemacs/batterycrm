package Ln;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoriesState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLn/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class e extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f10116e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final e f10117f = new e(true, null, new C14417b("", "", null, new C14418c(C42784z0.f406748b), null));

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10118b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f10119c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C14417b f10120d;

    /* compiled from: CategoriesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLn/e$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(boolean z12, @l String str, @k C14417b c14417b) {
        this.f10118b = z12;
        this.f10119c = str;
        this.f10120d = c14417b;
    }

    public static e a(e eVar, boolean z12, String str) {
        C14417b c14417b = eVar.f10120d;
        eVar.getClass();
        return new e(z12, str, c14417b);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10118b == eVar.f10118b && L.f(this.f10119c, eVar.f10119c) && L.f(this.f10120d, eVar.f10120d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10118b) * 31;
        String str = this.f10119c;
        return this.f10120d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "CategoriesState(loading=" + this.f10118b + ", error=" + this.f10119c + ", category=" + this.f10120d + ')';
    }
}
