package bP0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TopUpFormAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LbP0/a;", "", "a", "b", "c", "LbP0/a$a;", "LbP0/a$b;", "LbP0/a$c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC25540a {

    /* compiled from: TopUpFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbP0/a$a;", "LbP0/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1999a implements InterfaceC25540a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.wallet.page.topup.form.items.bubble.a f57051a;

        public C1999a(@k com.avito.android.wallet.page.topup.form.items.bubble.a aVar) {
            this.f57051a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1999a) && L.f(this.f57051a, ((C1999a) obj).f57051a);
        }

        public final int hashCode() {
            return this.f57051a.hashCode();
        }

        @k
        public final String toString() {
            return "BubbleItemClick(item=" + this.f57051a + ')';
        }
    }

    /* compiled from: TopUpFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbP0/a$b;", "LbP0/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.a$b */
    public static final /* data */ class b implements InterfaceC25540a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.wallet.page.topup.form.items.input.a f57052a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f57053b;

        public b(@k com.avito.android.wallet.page.topup.form.items.input.a aVar, @k String str) {
            this.f57052a = aVar;
            this.f57053b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f57052a, bVar.f57052a) && L.f(this.f57053b, bVar.f57053b);
        }

        public final int hashCode() {
            return this.f57053b.hashCode() + (this.f57052a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputChange(item=");
            sb2.append(this.f57052a);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f57053b, ')');
        }
    }

    /* compiled from: TopUpFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbP0/a$c;", "LbP0/a;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.a$c */
    public static final /* data */ class c implements InterfaceC25540a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f57054a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1118676340;
        }

        @k
        public final String toString() {
            return "SubmitButtonClick";
        }
    }
}
