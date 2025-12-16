package qC0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLevelsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LqC0/b;", "", "a", "b", "c", "LqC0/b$a;", "LqC0/b$b;", "LqC0/b$c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47280b {

    /* compiled from: TariffCptConfigureLevelsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqC0/b$a;", "LqC0/b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.b$a */
    public static final /* data */ class a implements InterfaceC47280b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429113a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -218657600;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffCptConfigureLevelsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqC0/b$b;", "LqC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12314b implements InterfaceC47280b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429114a;

        public C12314b(@k DeepLink deepLink) {
            this.f429114a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12314b) && L.f(this.f429114a, ((C12314b) obj).f429114a);
        }

        public final int hashCode() {
            return this.f429114a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FinishFlowWithDeepLink(deeplink="), this.f429114a, ')');
        }
    }

    /* compiled from: TariffCptConfigureLevelsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqC0/b$c;", "LqC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qC0.b$c */
    public static final /* data */ class c implements InterfaceC47280b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f429115a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f429116b;

        public c(@l DeepLink deepLink, @l Bundle bundle) {
            this.f429115a = deepLink;
            this.f429116b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f429115a, cVar.f429115a) && L.f(this.f429116b, cVar.f429116b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f429115a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Bundle bundle = this.f429116b;
            return iHashCode + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f429115a);
            sb2.append(", bundle=");
            return H.m(sb2, this.f429116b, ')');
        }
    }
}
