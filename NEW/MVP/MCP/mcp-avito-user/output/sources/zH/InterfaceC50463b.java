package zH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import wH.C49507c;

/* compiled from: MotivationsListInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LzH/b;", "", "a", "b", "c", "d", "LzH/b$a;", "LzH/b$b;", "LzH/b$c;", "LzH/b$d;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zH.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC50463b {

    /* compiled from: MotivationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzH/b$a;", "LzH/b;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.b$a */
    public static final /* data */ class a implements InterfaceC50463b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C49507c f443994a;

        public a(@k C49507c c49507c) {
            this.f443994a = c49507c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443994a, ((a) obj).f443994a);
        }

        public final int hashCode() {
            return this.f443994a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f443994a + ')';
        }
    }

    /* compiled from: MotivationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzH/b$b;", "LzH/b;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12950b implements InterfaceC50463b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443995a;

        public C12950b(@k String str) {
            this.f443995a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12950b) && L.f(this.f443995a, ((C12950b) obj).f443995a);
        }

        public final int hashCode() {
            return this.f443995a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(errorText="), this.f443995a, ')');
        }
    }

    /* compiled from: MotivationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzH/b$c;", "LzH/b;", "<init>", "()V", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.b$c */
    public static final /* data */ class c implements InterfaceC50463b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f443996a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1040258192;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: MotivationsListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzH/b$d;", "LzH/b;", "<init>", "()V", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.b$d */
    public static final /* data */ class d implements InterfaceC50463b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f443997a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -488188426;
        }

        @k
        public final String toString() {
            return "OnBackClick";
        }
    }
}
