package tB0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLinkBody;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoAdvanceInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LtB0/b;", "", "a", "b", "c", "d", "LtB0/b$a;", "LtB0/b$b;", "LtB0/b$c;", "LtB0/b$d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48531b {

    /* compiled from: TariffCpxInfoAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtB0/b$a;", "LtB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tB0.b$a */
    public static final /* data */ class a implements InterfaceC48531b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439187a;

        public a(@k String str) {
            this.f439187a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f439187a, ((a) obj).f439187a);
        }

        public final int hashCode() {
            return this.f439187a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AmountChange(amount="), this.f439187a, ')');
        }
    }

    /* compiled from: TariffCpxInfoAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtB0/b$b;", "LtB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tB0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12663b implements InterfaceC48531b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bundle f439188a;

        public C12663b(@k Bundle bundle) {
            this.f439188a = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12663b) && L.f(this.f439188a, ((C12663b) obj).f439188a);
        }

        public final int hashCode() {
            return this.f439188a.hashCode();
        }

        @k
        public final String toString() {
            return H.m(new StringBuilder("CloseWithResult(result="), this.f439188a, ')');
        }
    }

    /* compiled from: TariffCpxInfoAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtB0/b$c;", "LtB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tB0.b$c */
    public static final /* data */ class c implements InterfaceC48531b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TariffCpxInfoAdvanceShowLinkBody f439189a;

        public c(@k TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody) {
            this.f439189a = tariffCpxInfoAdvanceShowLinkBody;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f439189a, ((c) obj).f439189a);
        }

        public final int hashCode() {
            return this.f439189a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(content=" + this.f439189a + ')';
        }
    }

    /* compiled from: TariffCpxInfoAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtB0/b$d;", "LtB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tB0.b$d */
    public static final /* data */ class d implements InterfaceC48531b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f439190a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f439191b;

        public d(@k DeepLink deepLink, @k String str) {
            this.f439190a = deepLink;
            this.f439191b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f439190a, dVar.f439190a) && L.f(this.f439191b, dVar.f439191b);
        }

        public final int hashCode() {
            return this.f439191b.hashCode() + (this.f439190a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f439190a);
            sb2.append(", amount=");
            return C22026a.c(sb2, this.f439191b, ')');
        }
    }
}
