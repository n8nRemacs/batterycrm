package Ev;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CombinedButtonsAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LEv/b;", "", "a", "b", "c", "LEv/b$a;", "LEv/b$b;", "LEv/b$c;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ev.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13531b {

    /* compiled from: CombinedButtonsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEv/b$a;", "LEv/b;", "<init>", "()V", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ev.b$a */
    public static final /* data */ class a implements InterfaceC13531b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f4374a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1005600126;
        }

        @k
        public final String toString() {
            return "BuyButtonTextTruncated";
        }
    }

    /* compiled from: CombinedButtonsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEv/b$b;", "LEv/b;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ev.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0266b implements InterfaceC13531b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4375a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f4376b;

        public C0266b(@k DeepLink deepLink, @l Bundle bundle) {
            this.f4375a = deepLink;
            this.f4376b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0266b)) {
                return false;
            }
            C0266b c0266b = (C0266b) obj;
            return L.f(this.f4375a, c0266b.f4375a) && L.f(this.f4376b, c0266b.f4376b);
        }

        public final int hashCode() {
            int iHashCode = this.f4375a.hashCode() * 31;
            Bundle bundle = this.f4376b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f4375a);
            sb2.append(", args=");
            return H.m(sb2, this.f4376b, ')');
        }

        public /* synthetic */ C0266b(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: CombinedButtonsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEv/b$c;", "LEv/b;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ev.b$c */
    public static final /* data */ class c implements InterfaceC13531b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4377a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4378b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4379c;

        public c(int i12, int i13, int i14) {
            this.f4377a = i12;
            this.f4378b = i13;
            this.f4379c = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4377a == cVar.f4377a && this.f4378b == cVar.f4378b && this.f4379c == cVar.f4379c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f4379c) + r.e(this.f4378b, Integer.hashCode(this.f4377a) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("QuantityChange(oldQuantity=");
            sb2.append(this.f4377a);
            sb2.append(", newQuantity=");
            sb2.append(this.f4378b);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f4379c, ')');
        }
    }
}
