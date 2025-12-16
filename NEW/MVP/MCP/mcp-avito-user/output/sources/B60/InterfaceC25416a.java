package b60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lb60/a;", "", "a", "b", "Lb60/a$a;", "Lb60/a$b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC25416a {

    /* compiled from: CodeConfirmAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb60/a$a;", "Lb60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b60.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1991a implements InterfaceC25416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56907a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56908b;

        public C1991a(@k String str, @k String str2) {
            this.f56907a = str;
            this.f56908b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1991a)) {
                return false;
            }
            C1991a c1991a = (C1991a) obj;
            return L.f(this.f56907a, c1991a.f56907a) && L.f(this.f56908b, c1991a.f56908b);
        }

        public final int hashCode() {
            return this.f56908b.hashCode() + (this.f56907a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CodeInput(phone=");
            sb2.append(this.f56907a);
            sb2.append(", code=");
            return C22026a.c(sb2, this.f56908b, ')');
        }
    }

    /* compiled from: CodeConfirmAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb60/a$b;", "Lb60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b60.a$b */
    public static final /* data */ class b implements InterfaceC25416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56909a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56910b;

        public b(@k String str, @k String str2) {
            this.f56909a = str;
            this.f56910b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f56909a, bVar.f56909a) && L.f(this.f56910b, bVar.f56910b);
        }

        public final int hashCode() {
            return this.f56910b.hashCode() + (this.f56909a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConfirmCode(phone=");
            sb2.append(this.f56909a);
            sb2.append(", code=");
            return C22026a.c(sb2, this.f56910b, ')');
        }
    }
}
