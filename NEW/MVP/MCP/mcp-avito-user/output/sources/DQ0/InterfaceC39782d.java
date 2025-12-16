package dq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ldq0/d;", "", "a", "b", "c", "d", "Ldq0/d$a;", "Ldq0/d$b;", "Ldq0/d$c;", "Ldq0/d$d;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dq0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39782d {

    /* compiled from: SelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/d$a;", "Ldq0/d;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.d$a */
    public static final /* data */ class a implements InterfaceC39782d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394129a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1809488610;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: SelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/d$b;", "Ldq0/d;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.d$b */
    public static final /* data */ class b implements InterfaceC39782d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f394130a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1149322218;
        }

        @k
        public final String toString() {
            return "RequestSearchFocus";
        }
    }

    /* compiled from: SelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/d$c;", "Ldq0/d;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.d$c */
    public static final /* data */ class c implements InterfaceC39782d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394131a;

        public c(@k String str) {
            this.f394131a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f394131a, ((c) obj).f394131a);
        }

        public final int hashCode() {
            return this.f394131a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Reset(requestId="), this.f394131a, ')');
        }
    }

    /* compiled from: SelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/d$d;", "Ldq0/d;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C11040d implements InterfaceC39782d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f394132a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f394133b;

        /* JADX WARN: Multi-variable type inference failed */
        public C11040d(@k List<? extends ParcelableEntity<String>> list, @l String str) {
            this.f394132a = list;
            this.f394133b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11040d)) {
                return false;
            }
            C11040d c11040d = (C11040d) obj;
            return L.f(this.f394132a, c11040d.f394132a) && L.f(this.f394133b, c11040d.f394133b);
        }

        public final int hashCode() {
            int iHashCode = this.f394132a.hashCode() * 31;
            String str = this.f394133b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Submit(selected=");
            sb2.append(this.f394132a);
            sb2.append(", sectionTitle=");
            return C22026a.c(sb2, this.f394133b, ')');
        }
    }
}
