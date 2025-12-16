package Yw0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EsiaState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LYw0/d;", "", "a", "b", "c", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC18344d {

    /* compiled from: EsiaState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYw0/d$a;", "LYw0/d;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yw0.d$a */
    public static final /* data */ class a implements InterfaceC18344d {
        static {
            new a();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1563041306;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: EsiaState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYw0/d$b;", "LYw0/d;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yw0.d$b */
    public static final /* data */ class b implements InterfaceC18344d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19751a;

        public b(@k String str) {
            this.f19751a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f19751a, ((b) obj).f19751a);
        }

        public final int hashCode() {
            return this.f19751a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Loaded(urlToOpen="), this.f19751a, ')');
        }
    }

    /* compiled from: EsiaState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYw0/d$c;", "LYw0/d;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yw0.d$c */
    public static final /* data */ class c implements InterfaceC18344d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f19752a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 659779790;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
