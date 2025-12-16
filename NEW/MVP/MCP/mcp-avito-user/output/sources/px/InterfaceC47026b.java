package pX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import dX.g;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LpX/b;", "", "a", "b", "c", "d", "e", "LpX/b$a;", "LpX/b$b;", "LpX/b$c;", "LpX/b$d;", "LpX/b$e;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC47026b {

    /* compiled from: QualityServiceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/b$a;", "LpX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.b$a */
    public static final /* data */ class a implements InterfaceC47026b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f428578a;

        public a(@k String str) {
            this.f428578a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f428578a, ((a) obj).f428578a);
        }

        public final int hashCode() {
            return this.f428578a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadAlert(alert="), this.f428578a, ')');
        }
    }

    /* compiled from: QualityServiceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/b$b;", "LpX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12277b implements InterfaceC47026b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.loyalty.ui.quality_service.items.effect.a f428579a;

        public C12277b(@k com.avito.android.loyalty.ui.quality_service.items.effect.a aVar) {
            this.f428579a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12277b) && L.f(this.f428579a, ((C12277b) obj).f428579a);
        }

        public final int hashCode() {
            return this.f428579a.hashCode();
        }

        @k
        public final String toString() {
            return "NavigateToEffectDetails(effectItem=" + this.f428579a + ')';
        }
    }

    /* compiled from: QualityServiceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpX/b$c;", "LpX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.b$c */
    public static final /* data */ class c implements InterfaceC47026b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428580a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -795542951;
        }

        @k
        public final String toString() {
            return "NavigateToMain";
        }
    }

    /* compiled from: QualityServiceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/b$d;", "LpX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.b$d */
    public static final /* data */ class d implements InterfaceC47026b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Content f428581a;

        public d(@k Content content) {
            this.f428581a = content;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f428581a, ((d) obj).f428581a);
        }

        public final int hashCode() {
            return this.f428581a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPopup(content=" + this.f428581a + ')';
        }
    }

    /* compiled from: QualityServiceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/b$e;", "LpX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.b$e */
    public static final /* data */ class e implements InterfaceC47026b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final g f428582a;

        public e(@k g gVar) {
            this.f428582a = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f428582a, ((e) obj).f428582a);
        }

        public final int hashCode() {
            return this.f428582a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowAlert(alertContent=" + this.f428582a + ')';
        }
    }
}
