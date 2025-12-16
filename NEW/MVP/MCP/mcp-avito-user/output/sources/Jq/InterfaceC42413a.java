package jq;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderCallAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ljq/a;", "", "a", "b", "c", "d", "Ljq/a$a;", "Ljq/a$b;", "Ljq/a$c;", "Ljq/a$d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC42413a {

    /* compiled from: OrderCallAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljq/a$a;", "Ljq/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jq.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11582a implements InterfaceC42413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11582a f405819a = new C11582a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11582a);
        }

        public final int hashCode() {
            return -2090961597;
        }

        @k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: OrderCallAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljq/a$b;", "Ljq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jq.a$b */
    public static final class b implements InterfaceC42413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f405820a;

        public b(@k DeepLink deepLink) {
            this.f405820a = deepLink;
        }
    }

    /* compiled from: OrderCallAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljq/a$c;", "Ljq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jq.a$c */
    public static final /* data */ class c implements InterfaceC42413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405821a;

        public c(@k String str) {
            this.f405821a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f405821a, ((c) obj).f405821a);
        }

        public final int hashCode() {
            return this.f405821a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputPhoneChanged(newValue="), this.f405821a, ')');
        }
    }

    /* compiled from: OrderCallAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljq/a$d;", "Ljq/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jq.a$d */
    public static final /* data */ class d implements InterfaceC42413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f405822a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 886412470;
        }

        @k
        public final String toString() {
            return "ProceedClicked";
        }
    }
}
