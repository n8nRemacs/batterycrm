package mD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorConfigureLevelOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LmD0/c;", "", "a", "b", "LmD0/c$a;", "LmD0/c$b;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mD0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43951c {

    /* compiled from: ConstructorConfigureLevelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmD0/c$a;", "LmD0/c;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD0.c$a */
    public static final class a implements InterfaceC43951c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f414423a = new a();
    }

    /* compiled from: ConstructorConfigureLevelOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmD0/c$b;", "LmD0/c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD0.c$b */
    public static final /* data */ class b implements InterfaceC43951c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414424a;

        public b(@k DeepLink deepLink) {
            this.f414424a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f414424a, ((b) obj).f414424a);
        }

        public final int hashCode() {
            return this.f414424a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f414424a, ')');
        }
    }
}
