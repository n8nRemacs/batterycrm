package jz;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmployeePassportModes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ljz/e;", "", "a", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C42454e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f405979b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C42454e f405980c = new C42454e(P0.c());

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f405981a;

    /* compiled from: EmployeePassportModes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljz/e$a;", "", "<init>", "()V", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42454e(@k Map<String, ? extends InterfaceC42451b> map) {
        this.f405981a = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42454e) && this.f405981a.equals(((C42454e) obj).f405981a);
    }

    public final int hashCode() {
        return this.f405981a.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("EmployeePassportModes(modesByProfileId="), this.f405981a, ')');
    }
}
