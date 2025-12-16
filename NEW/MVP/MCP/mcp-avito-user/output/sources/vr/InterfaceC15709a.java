package Vr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LVr/a;", "", "a", "b", "c", "d", "LVr/a$a;", "LVr/a$b;", "LVr/a$c;", "LVr/a$d;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15709a {

    /* compiled from: CptMassActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVr/a$a;", "LVr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vr.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1205a implements InterfaceC15709a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1205a f17425a = new C1205a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1205a);
        }

        public final int hashCode() {
            return 1972407153;
        }

        @k
        public final String toString() {
            return "OnButtonClicked";
        }
    }

    /* compiled from: CptMassActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVr/a$b;", "LVr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vr.a$b */
    public static final /* data */ class b implements InterfaceC15709a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f17426a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1392811565;
        }

        @k
        public final String toString() {
            return "OnCancelled";
        }
    }

    /* compiled from: CptMassActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVr/a$c;", "LVr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vr.a$c */
    public static final /* data */ class c implements InterfaceC15709a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f17427a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1256165952;
        }

        @k
        public final String toString() {
            return "OnDataRequested";
        }
    }

    /* compiled from: CptMassActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVr/a$d;", "LVr/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vr.a$d */
    public static final /* data */ class d implements InterfaceC15709a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17428a;

        public d(@k DeepLink deepLink) {
            this.f17428a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f17428a, ((d) obj).f17428a);
        }

        public final int hashCode() {
            return this.f17428a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deeplink="), this.f17428a, ')');
        }
    }
}
