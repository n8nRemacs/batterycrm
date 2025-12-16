package Lr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LLr/a;", "", "a", "b", "c", "d", "LLr/a$a;", "LLr/a$b;", "LLr/a$c;", "LLr/a$d;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14431a {

    /* compiled from: CptActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLr/a$a;", "LLr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lr.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0633a implements InterfaceC14431a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0633a f10131a = new C0633a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0633a);
        }

        public final int hashCode() {
            return -316645910;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: CptActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLr/a$b;", "LLr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lr.a$b */
    public static final /* data */ class b implements InterfaceC14431a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f10132a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2077726084;
        }

        @k
        public final String toString() {
            return "OnButtonClicked";
        }
    }

    /* compiled from: CptActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLr/a$c;", "LLr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lr.a$c */
    public static final /* data */ class c implements InterfaceC14431a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f10133a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1150847021;
        }

        @k
        public final String toString() {
            return "OnDataRequested";
        }
    }

    /* compiled from: CptActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLr/a$d;", "LLr/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lr.a$d */
    public static final /* data */ class d implements InterfaceC14431a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10134a;

        public d(@k DeepLink deepLink) {
            this.f10134a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f10134a, ((d) obj).f10134a);
        }

        public final int hashCode() {
            return this.f10134a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deeplink="), this.f10134a, ')');
        }
    }
}
