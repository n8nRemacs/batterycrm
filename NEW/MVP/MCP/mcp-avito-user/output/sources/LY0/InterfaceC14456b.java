package Ly0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarRejectOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LLy0/b;", "", "a", "b", "LLy0/b$a;", "LLy0/b$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ly0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14456b {

    /* compiled from: StrCalendarRejectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLy0/b$a;", "LLy0/b;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ly0.b$a */
    public static final class a implements InterfaceC14456b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10308a = new a();
    }

    /* compiled from: StrCalendarRejectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLy0/b$b;", "LLy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ly0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0651b implements InterfaceC14456b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10309a;

        public C0651b(@k DeepLink deepLink) {
            this.f10309a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0651b) && L.f(this.f10309a, ((C0651b) obj).f10309a);
        }

        public final int hashCode() {
            return this.f10309a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f10309a, ')');
        }
    }
}
