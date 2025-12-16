package UM0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputBillAmountAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LUM0/a;", "", "a", "b", "c", "d", "LUM0/a$a;", "LUM0/a$b;", "LUM0/a$c;", "LUM0/a$d;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: InputBillAmountAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUM0/a$a;", "LUM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UM0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1118a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1118a f16353a = new C1118a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1118a);
        }

        public final int hashCode() {
            return 1191443381;
        }

        @k
        public final String toString() {
            return "ActionClick";
        }
    }

    /* compiled from: InputBillAmountAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUM0/a$b;", "LUM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f16354a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2081869924;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: InputBillAmountAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUM0/a$c;", "LUM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16355a;

        public c(@k DeepLink deepLink) {
            this.f16355a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f16355a, ((c) obj).f16355a);
        }

        public final int hashCode() {
            return this.f16355a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f16355a, ')');
        }
    }

    /* compiled from: InputBillAmountAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUM0/a$d;", "LUM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f16356a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1318126749;
        }

        @k
        public final String toString() {
            return "RetryClick";
        }
    }
}
