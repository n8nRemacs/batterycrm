package mq;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lmq/a;", "", "a", "b", "c", "d", "Lmq/a$a;", "Lmq/a$b;", "Lmq/a$c;", "Lmq/a$d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44119a {

    /* compiled from: PromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/a$a;", "Lmq/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11844a implements InterfaceC44119a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11844a f414765a = new C11844a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11844a);
        }

        public final int hashCode() {
            return 1176716286;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: PromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/a$b;", "Lmq/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.a$b */
    public static final /* data */ class b implements InterfaceC44119a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414766a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 479113025;
        }

        @k
        public final String toString() {
            return "BottomProceedClicked";
        }
    }

    /* compiled from: PromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmq/a$c;", "Lmq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.a$c */
    public static final /* data */ class c implements InterfaceC44119a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414767a;

        public c(@k String str) {
            this.f414767a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f414767a, ((c) obj).f414767a);
        }

        public final int hashCode() {
            return this.f414767a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputPhoneChanged(newValue="), this.f414767a, ')');
        }
    }

    /* compiled from: PromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/a$d;", "Lmq/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.a$d */
    public static final /* data */ class d implements InterfaceC44119a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f414768a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 196078070;
        }

        @k
        public final String toString() {
            return "ProceedClicked";
        }
    }
}
