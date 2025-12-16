package fX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsV3Action.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LfX/a;", "", "a", "b", "c", "LfX/a$a;", "LfX/a$b;", "LfX/a$c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fX.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC40353a {

    /* compiled from: BadgeDetailsV3Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfX/a$a;", "LfX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fX.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11155a implements InterfaceC40353a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.loyalty.ui.items.collapse.a f395896a;

        public C11155a(@k com.avito.android.loyalty.ui.items.collapse.a aVar) {
            this.f395896a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11155a) && L.f(this.f395896a, ((C11155a) obj).f395896a);
        }

        public final int hashCode() {
            return this.f395896a.hashCode();
        }

        @k
        public final String toString() {
            return "CollapseItemClicked(collapseItem=" + this.f395896a + ')';
        }
    }

    /* compiled from: BadgeDetailsV3Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfX/a$b;", "LfX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fX.a$b */
    public static final /* data */ class b implements InterfaceC40353a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395897a;

        public b(@k DeepLink deepLink) {
            this.f395897a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f395897a, ((b) obj).f395897a);
        }

        public final int hashCode() {
            return this.f395897a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f395897a, ')');
        }
    }

    /* compiled from: BadgeDetailsV3Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfX/a$c;", "LfX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fX.a$c */
    public static final /* data */ class c implements InterfaceC40353a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f395898a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 312784879;
        }

        @k
        public final String toString() {
            return "RetryClicked";
        }
    }
}
