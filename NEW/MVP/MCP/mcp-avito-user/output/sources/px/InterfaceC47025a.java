package pX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LpX/a;", "", "a", "b", "c", "d", "e", "LpX/a$a;", "LpX/a$b;", "LpX/a$c;", "LpX/a$d;", "LpX/a$e;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pX.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC47025a {

    /* compiled from: QualityServiceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/a$a;", "LpX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12276a implements InterfaceC47025a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f428573a;

        public C12276a(@k DeepLink deepLink) {
            this.f428573a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12276a) && L.f(this.f428573a, ((C12276a) obj).f428573a);
        }

        public final int hashCode() {
            return this.f428573a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f428573a, ')');
        }
    }

    /* compiled from: QualityServiceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpX/a$b;", "LpX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.a$b */
    public static final /* data */ class b implements InterfaceC47025a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f428574a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -337339665;
        }

        @k
        public final String toString() {
            return "ErrorActionClick";
        }
    }

    /* compiled from: QualityServiceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/a$c;", "LpX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.a$c */
    public static final /* data */ class c implements InterfaceC47025a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.conveyor_item.a f428575a;

        public c(@k com.avito.conveyor_item.a aVar) {
            this.f428575a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f428575a, ((c) obj).f428575a);
        }

        public final int hashCode() {
            return this.f428575a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemClick(item=" + this.f428575a + ')';
        }
    }

    /* compiled from: QualityServiceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/a$d;", "LpX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.a$d */
    public static final /* data */ class d implements InterfaceC47025a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f428576a;

        public d(@k String str) {
            this.f428576a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f428576a, ((d) obj).f428576a);
        }

        public final int hashCode() {
            return this.f428576a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadAlert(alert="), this.f428576a, ')');
        }
    }

    /* compiled from: QualityServiceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/a$e;", "LpX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.a$e */
    public static final /* data */ class e implements InterfaceC47025a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Content f428577a;

        public e(@k Content content) {
            this.f428577a = content;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f428577a, ((e) obj).f428577a);
        }

        public final int hashCode() {
            return this.f428577a.hashCode();
        }

        @k
        public final String toString() {
            return "PopupItemClick(content=" + this.f428577a + ')';
        }
    }
}
