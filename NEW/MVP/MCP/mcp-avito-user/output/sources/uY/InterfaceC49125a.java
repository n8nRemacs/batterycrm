package uy;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditCountFieldAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Luy/a;", "", "a", "b", "Luy/a$a;", "Luy/a$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49125a {

    /* compiled from: EditCountFieldAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luy/a$a;", "Luy/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uy.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12736a implements InterfaceC49125a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440350a;

        public C12736a(@k String str) {
            this.f440350a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12736a) && L.f(this.f440350a, ((C12736a) obj).f440350a);
        }

        public final int hashCode() {
            return this.f440350a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputText(text="), this.f440350a, ')');
        }
    }

    /* compiled from: EditCountFieldAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luy/a$b;", "Luy/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uy.a$b */
    public static final /* data */ class b implements InterfaceC49125a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440351a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1373663364;
        }

        @k
        public final String toString() {
            return "SubmitClick";
        }
    }
}
