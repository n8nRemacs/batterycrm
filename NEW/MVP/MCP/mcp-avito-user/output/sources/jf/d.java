package Jf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.autoteka.helpers.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaConfirmEmailState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LJf/d;", "", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f9091c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f9092d = new d(null, false);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final k.a f9093a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9094b;

    /* compiled from: AutotekaConfirmEmailState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJf/d$a;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l k.a aVar, boolean z12) {
        this.f9093a = aVar;
        this.f9094b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f9093a, dVar.f9093a) && this.f9094b == dVar.f9094b;
    }

    public final int hashCode() {
        k.a aVar = this.f9093a;
        return Boolean.hashCode(this.f9094b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaConfirmEmailState(verifyEmailResult=");
        sb2.append(this.f9093a);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f9094b, ')');
    }
}
