package Ie0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.h;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.delivery_abuse.price_reduction.deeplink.PriceReductionLink;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.details.seller_protection.SellerProtectionDialogResult;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import vf0.C49325f;

/* compiled from: PublishDetailsAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LIe0/a;", "", "a", "b", "c", "d", "LIe0/a$a;", "LIe0/a$b;", "LIe0/a$c;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ie0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14065a {

    /* compiled from: PublishDetailsAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LIe0/a$a;", "LIe0/a;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/Action;", "a", "b", "c", "LIe0/a$a$a;", "LIe0/a$a$b;", "LIe0/a$a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ie0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0468a extends InterfaceC14065a {

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$a$a;", "LIe0/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0469a implements InterfaceC0468a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.NavigationButtonAction f8223a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final DeepLink f8224b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final List<BeduinAction> f8225c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0469a(@l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @l DeepLink deepLink, @l List<? extends BeduinAction> list) {
                this.f8223a = navigationButtonAction;
                this.f8224b = deepLink;
                this.f8225c = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0469a)) {
                    return false;
                }
                C0469a c0469a = (C0469a) obj;
                return this.f8223a == c0469a.f8223a && L.f(this.f8224b, c0469a.f8224b) && L.f(this.f8225c, c0469a.f8225c);
            }

            public final int hashCode() {
                CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.f8223a;
                int iHashCode = (navigationButtonAction == null ? 0 : navigationButtonAction.hashCode()) * 31;
                DeepLink deepLink = this.f8224b;
                int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                List<BeduinAction> list = this.f8225c;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ConfirmationDialogConfirmed(action=");
                sb2.append(this.f8223a);
                sb2.append(", deepLink=");
                sb2.append(this.f8224b);
                sb2.append(", beduinActions=");
                return H.p(sb2, this.f8225c, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$a$b;", "LIe0/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$a$b */
        public static final /* data */ class b implements InterfaceC0468a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.NavigationButtonAction f8226a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.Confirmation f8227b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f8228c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final List<BeduinAction> f8229d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.ParamsToFill f8230e;

            public b() {
                this(null, null, null, null, null, 31, null);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f8226a == bVar.f8226a && L.f(this.f8227b, bVar.f8227b) && L.f(this.f8228c, bVar.f8228c) && L.f(this.f8229d, bVar.f8229d) && L.f(this.f8230e, bVar.f8230e);
            }

            public final int hashCode() {
                CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.f8226a;
                int iHashCode = (navigationButtonAction == null ? 0 : navigationButtonAction.hashCode()) * 31;
                CategoryPublishStep.Params.Confirmation confirmation = this.f8227b;
                int iHashCode2 = (iHashCode + (confirmation == null ? 0 : confirmation.hashCode())) * 31;
                DeepLink deepLink = this.f8228c;
                int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                List<BeduinAction> list = this.f8229d;
                int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                CategoryPublishStep.Params.ParamsToFill paramsToFill = this.f8230e;
                return iHashCode4 + (paramsToFill != null ? paramsToFill.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "NavigationButtonClicked(action=" + this.f8226a + ", confirmation=" + this.f8227b + ", deepLink=" + this.f8228c + ", beduinActions=" + this.f8229d + ", paramsToFill=" + this.f8230e + ')';
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(@l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @l CategoryPublishStep.Params.Confirmation confirmation, @l DeepLink deepLink, @l List<? extends BeduinAction> list, @l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
                this.f8226a = navigationButtonAction;
                this.f8227b = confirmation;
                this.f8228c = deepLink;
                this.f8229d = list;
                this.f8230e = paramsToFill;
            }

            public /* synthetic */ b(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, CategoryPublishStep.Params.Confirmation confirmation, DeepLink deepLink, List list, CategoryPublishStep.Params.ParamsToFill paramsToFill, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : navigationButtonAction, (i12 & 2) != 0 ? null : confirmation, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : paramsToFill);
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$a$c;", "LIe0/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$a$c */
        public static final /* data */ class c implements InterfaceC0468a {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "ShowConfirmation(confirmation=null, onConfirmed=null)";
            }
        }
    }

    /* compiled from: PublishDetailsAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"LIe0/a$b;", "LIe0/a;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/Action;", "a", "b", "c", "d", "e", "LIe0/a$b$a;", "LIe0/a$b$b;", "LIe0/a$b$c;", "LIe0/a$b$d;", "LIe0/a$b$e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ie0.a$b */
    public interface b extends InterfaceC14065a {

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$b$a;", "LIe0/a$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C0470a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0470a f8231a = new C0470a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0470a);
            }

            public final int hashCode() {
                return -112445060;
            }

            @k
            public final String toString() {
                return "PhoneReverificationInfoAccepted";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$b$b;", "LIe0/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0471b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PriceReductionLink.b f8232a;

            public C0471b(@k PriceReductionLink.b bVar) {
                this.f8232a = bVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0471b) && L.f(this.f8232a, ((C0471b) obj).f8232a);
            }

            public final int hashCode() {
                return this.f8232a.hashCode();
            }

            @k
            public final String toString() {
                return "PriceReductionSheetResult(result=" + this.f8232a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$b$c;", "LIe0/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$b$c */
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final SlotType f8233a;

            public c(@k SlotType slotType) {
                this.f8233a = slotType;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f8233a == ((c) obj).f8233a;
            }

            public final int hashCode() {
                return this.f8233a.hashCode();
            }

            @k
            public final String toString() {
                return "ReloadSlotClicked(slotType=" + this.f8233a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$b$d;", "LIe0/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$b$d */
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final SelectParameter.Value f8234a;

            public d(@k SelectParameter.Value value) {
                this.f8234a = value;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f8234a, ((d) obj).f8234a);
            }

            public final int hashCode() {
                return this.f8234a.hashCode();
            }

            @k
            public final String toString() {
                return "ResidentialComplexResult(data=" + this.f8234a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$b$e;", "LIe0/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$b$e */
        public static final /* data */ class e implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final SellerProtectionDialogResult f8235a;

            public e(@k SellerProtectionDialogResult sellerProtectionDialogResult) {
                this.f8235a = sellerProtectionDialogResult;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f8235a == ((e) obj).f8235a;
            }

            public final int hashCode() {
                return this.f8235a.hashCode();
            }

            @k
            public final String toString() {
                return "SellerProtectionResult(result=" + this.f8235a + ')';
            }
        }
    }

    /* compiled from: PublishDetailsAction.kt */
    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:%\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'\u0082\u0001%()*+,-./0123456789:;<=>?@ABCDEFGHIJKL¨\u0006M"}, d2 = {"LIe0/a$c;", "LIe0/a;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/Action;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "LIe0/a$c$a;", "LIe0/a$c$b;", "LIe0/a$c$c;", "LIe0/a$c$d;", "LIe0/a$c$e;", "LIe0/a$c$f;", "LIe0/a$c$g;", "LIe0/a$c$h;", "LIe0/a$c$i;", "LIe0/a$c$j;", "LIe0/a$c$k;", "LIe0/a$c$l;", "LIe0/a$c$m;", "LIe0/a$c$n;", "LIe0/a$c$o;", "LIe0/a$c$p;", "LIe0/a$c$q;", "LIe0/a$c$r;", "LIe0/a$c$s;", "LIe0/a$c$t;", "LIe0/a$c$u;", "LIe0/a$c$v;", "LIe0/a$c$w;", "LIe0/a$c$x;", "LIe0/a$c$y;", "LIe0/a$c$z;", "LIe0/a$c$A;", "LIe0/a$c$B;", "LIe0/a$c$C;", "LIe0/a$c$D;", "LIe0/a$c$E;", "LIe0/a$c$F;", "LIe0/a$c$G;", "LIe0/a$c$H;", "LIe0/a$c$I;", "LIe0/a$c$J;", "LIe0/a$c$K;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ie0.a$c */
    public interface c extends InterfaceC14065a {

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$A;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$A */
        public static final /* data */ class A implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final c.a f8236a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f8237b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final N f8238c;

            /* JADX WARN: Multi-variable type inference failed */
            public A(@k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f8236a = aVar;
                this.f8237b = c29377e;
                this.f8238c = (N) lVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof A)) {
                    return false;
                }
                A a12 = (A) obj;
                return L.f(this.f8236a, a12.f8236a) && this.f8237b.equals(a12.f8237b) && this.f8238c.equals(a12.f8238c);
            }

            public final int hashCode() {
                return this.f8238c.hashCode() + ((this.f8237b.hashCode() + (this.f8236a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDatePickerDialog(dateSelectInfo=");
                sb2.append(this.f8236a);
                sb2.append(", dateTime=");
                sb2.append(this.f8237b);
                sb2.append(", callback=");
                return C22026a.d(sb2, this.f8238c, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$B;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$B */
        public static final /* data */ class B implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final c.a f8239a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f8240b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Y41.l<Long, G0> f8241c;

            /* JADX WARN: Multi-variable type inference failed */
            public B(@k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f8239a = aVar;
                this.f8240b = c29377e;
                this.f8241c = lVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof B)) {
                    return false;
                }
                B b12 = (B) obj;
                return L.f(this.f8239a, b12.f8239a) && L.f(this.f8240b, b12.f8240b) && L.f(this.f8241c, b12.f8241c);
            }

            public final int hashCode() {
                return this.f8241c.hashCode() + ((this.f8240b.hashCode() + (this.f8239a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDateTimeRangeDialog(dateSelectInfo=");
                sb2.append(this.f8239a);
                sb2.append(", dateTime=");
                sb2.append(this.f8240b);
                sb2.append(", callback=");
                return androidx.compose.foundation.H.l(sb2, this.f8241c, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$C;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$C */
        public static final /* data */ class C implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f8242a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f8243b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f8244c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f8245d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final N f8246e;

            /* JADX WARN: Multi-variable type inference failed */
            public C(@Y61.l String str, @k String str2, @k String str3, @k String str4, @k Y41.a<G0> aVar) {
                this.f8242a = str;
                this.f8243b = str2;
                this.f8244c = str3;
                this.f8245d = str4;
                this.f8246e = (N) aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C)) {
                    return false;
                }
                C c12 = (C) obj;
                return L.f(this.f8242a, c12.f8242a) && L.f(this.f8243b, c12.f8243b) && L.f(this.f8244c, c12.f8244c) && L.f(this.f8245d, c12.f8245d) && this.f8246e.equals(c12.f8246e);
            }

            public final int hashCode() {
                String str = this.f8242a;
                return this.f8246e.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f8243b), 31, this.f8244c), 31, this.f8245d);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDialog(title=");
                sb2.append(this.f8242a);
                sb2.append(", message=");
                sb2.append(this.f8243b);
                sb2.append(", positiveOption=");
                sb2.append(this.f8244c);
                sb2.append(", negativeOption=");
                sb2.append(this.f8245d);
                sb2.append(", onPositiveClicked=");
                return C22026a.d(sb2, this.f8246e, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$D;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$D */
        public static final /* data */ class D implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8247a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f8248b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f8249c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8250d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8251e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8252f;

            public D(@k String str, @k String str2, @k String str3, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3) {
                this.f8247a = str;
                this.f8248b = str2;
                this.f8249c = str3;
                this.f8250d = aVar;
                this.f8251e = aVar2;
                this.f8252f = aVar3;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof D)) {
                    return false;
                }
                D d12 = (D) obj;
                return L.f(this.f8247a, d12.f8247a) && L.f(this.f8248b, d12.f8248b) && L.f(this.f8249c, d12.f8249c) && L.f(this.f8250d, d12.f8250d) && L.f(this.f8251e, d12.f8251e) && L.f(this.f8252f, d12.f8252f);
            }

            public final int hashCode() {
                return this.f8252f.hashCode() + androidx.appcompat.app.r.h(androidx.appcompat.app.r.h(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f8247a.hashCode() * 31, 31, this.f8248b), 31, this.f8249c), 31, this.f8250d), 31, this.f8251e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDialogDismissable(title=");
                sb2.append(this.f8247a);
                sb2.append(", message=");
                sb2.append(this.f8248b);
                sb2.append(", button=");
                sb2.append(this.f8249c);
                sb2.append(", onShow=");
                sb2.append(this.f8250d);
                sb2.append(", onAccept=");
                sb2.append(this.f8251e);
                sb2.append(", onDismiss=");
                return androidx.appcompat.app.r.v(sb2, this.f8252f, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$E;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$E */
        public static final /* data */ class E implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ObjectsParameter f8253a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f8254b;

            public E(@k ObjectsParameter objectsParameter, @Y61.l Integer num) {
                this.f8253a = objectsParameter;
                this.f8254b = num;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof E)) {
                    return false;
                }
                E e12 = (E) obj;
                return L.f(this.f8253a, e12.f8253a) && L.f(this.f8254b, e12.f8254b);
            }

            public final int hashCode() {
                int iHashCode = this.f8253a.hashCode() * 31;
                Integer num = this.f8254b;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowEditObjectsScreen(parameter=");
                sb2.append(this.f8253a);
                sb2.append(", selectedObject=");
                return com.akita.compose.component.accordion.s.j(sb2, this.f8254b, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$F;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$F */
        public static final /* data */ class F implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8255a;

            public F(@k String str) {
                this.f8255a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof F) && L.f(this.f8255a, ((F) obj).f8255a);
            }

            public final int hashCode() {
                return this.f8255a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowHelpCenterScreen(url="), this.f8255a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$G;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$G */
        public static final /* data */ class G implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AddressParameter f8256a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8257b;

            public G(@k AddressParameter addressParameter, boolean z12) {
                this.f8256a = addressParameter;
                this.f8257b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof G)) {
                    return false;
                }
                G g12 = (G) obj;
                return L.f(this.f8256a, g12.f8256a) && this.f8257b == g12.f8257b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8257b) + (this.f8256a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowLocationPicker(address=");
                sb2.append(this.f8256a);
                sb2.append(", withRedesignTheme=");
                return androidx.appcompat.app.r.x(sb2, this.f8257b, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$H;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$H */
        public static final /* data */ class H implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8258a;

            public H(@k String str) {
                this.f8258a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof H) && L.f(this.f8258a, ((H) obj).f8258a);
            }

            public final int hashCode() {
                return this.f8258a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowPublishDetailsStepForFillParams(slotWithStepConfigId="), this.f8258a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$I;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$I */
        public static final /* data */ class I implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final I f8259a = new I();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof I);
            }

            public final int hashCode() {
                return -603160366;
            }

            @k
            public final String toString() {
                return "ShowResidentialComplexSuggestScreen";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$J;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$J */
        public static final /* data */ class J implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Arguments f8260a;

            public J(@k Arguments arguments) {
                this.f8260a = arguments;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof J) && L.f(this.f8260a, ((J) obj).f8260a);
            }

            public final int hashCode() {
                return this.f8260a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.p(new StringBuilder("ShowSelectScreen(arguments="), this.f8260a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$K;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$K */
        public static final /* data */ class K implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.blueprints.selector_card_group_bottom_sheet.k f8261a;

            public K(@k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
                this.f8261a = kVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof K) && L.f(this.f8261a, ((K) obj).f8261a);
            }

            public final int hashCode() {
                return this.f8261a.hashCode();
            }

            @k
            public final String toString() {
                return "ShowSelectorCardGroupBottomSheet(params=" + this.f8261a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$a;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C0472a implements c {
            static {
                new C0472a();
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C0472a);
            }

            public final int hashCode() {
                return 19013750;
            }

            @k
            public final String toString() {
                return "CheckVideoPicker";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$b;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$b, reason: case insensitive filesystem */
        public static final /* data */ class C14066b implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14066b f8262a = new C14066b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C14066b);
            }

            public final int hashCode() {
                return 1451498564;
            }

            @k
            public final String toString() {
                return "ContinuePublishAfterVerification";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$c;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$c, reason: collision with other inner class name */
        public static final /* data */ class C0473c implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f8263a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Bundle f8264b;

            public C0473c(@k DeepLink deepLink, @Y61.l Bundle bundle) {
                this.f8263a = deepLink;
                this.f8264b = bundle;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0473c)) {
                    return false;
                }
                C0473c c0473c = (C0473c) obj;
                return L.f(this.f8263a, c0473c.f8263a) && L.f(this.f8264b, c0473c.f8264b);
            }

            public final int hashCode() {
                int iHashCode = this.f8263a.hashCode() * 31;
                Bundle bundle = this.f8264b;
                return iHashCode + (bundle == null ? 0 : bundle.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DeeplinkClicked(deepLink=");
                sb2.append(this.f8263a);
                sb2.append(", args=");
                return androidx.compose.foundation.H.m(sb2, this.f8264b, ')');
            }

            public /* synthetic */ C0473c(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
                this(deepLink, (i12 & 2) != 0 ? null : bundle);
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$d;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$d, reason: case insensitive filesystem */
        public static final /* data */ class C14067d implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14067d f8265a = new C14067d();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C14067d);
            }

            public final int hashCode() {
                return 519199035;
            }

            @k
            public final String toString() {
                return "GoToPreviousStep";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$e;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$e, reason: case insensitive filesystem */
        public static final /* data */ class C14068e implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14068e f8266a = new C14068e();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C14068e);
            }

            public final int hashCode() {
                return -1848768722;
            }

            @k
            public final String toString() {
                return "LeaveScreen";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$f;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$f, reason: case insensitive filesystem */
        public static final /* data */ class C14069f implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DistrictParameter f8267a;

            public C14069f(@k DistrictParameter districtParameter) {
                this.f8267a = districtParameter;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14069f) && L.f(this.f8267a, ((C14069f) obj).f8267a);
            }

            public final int hashCode() {
                return this.f8267a.hashCode();
            }

            @k
            public final String toString() {
                return "NavigateToSelectDistrictsScreen(parameter=" + this.f8267a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$g;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$g, reason: case insensitive filesystem */
        public static final /* data */ class C14070g implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final MetroParameter f8268a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f8269b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f8270c;

            public C14070g(@k MetroParameter metroParameter, @Y61.l Integer num, @Y61.l String str) {
                this.f8268a = metroParameter;
                this.f8269b = num;
                this.f8270c = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C14070g)) {
                    return false;
                }
                C14070g c14070g = (C14070g) obj;
                return L.f(this.f8268a, c14070g.f8268a) && L.f(this.f8269b, c14070g.f8269b) && L.f(this.f8270c, c14070g.f8270c);
            }

            public final int hashCode() {
                int iHashCode = this.f8268a.hashCode() * 31;
                Integer num = this.f8269b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f8270c;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigateToSelectMetroScreen(parameter=");
                sb2.append(this.f8268a);
                sb2.append(", categoryId=");
                sb2.append(this.f8269b);
                sb2.append(", publishSessionId=");
                return C22026a.c(sb2, this.f8270c, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$h;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$h, reason: case insensitive filesystem */
        public static final /* data */ class C14071h implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ObjectsParameter f8271a;

            public C14071h(@k ObjectsParameter objectsParameter) {
                this.f8271a = objectsParameter;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14071h) && L.f(this.f8271a, ((C14071h) obj).f8271a);
            }

            public final int hashCode() {
                return this.f8271a.hashCode();
            }

            @k
            public final String toString() {
                return "NavigateToSelectPriceListScreen(parameter=" + this.f8271a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$i;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$i, reason: case insensitive filesystem */
        public static final /* data */ class C14072i implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14072i f8272a = new C14072i();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C14072i);
            }

            public final int hashCode() {
                return -925043477;
            }

            @k
            public final String toString() {
                return "OnEditCategoryClicked";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$j;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$j, reason: case insensitive filesystem */
        public static final /* data */ class C14073j implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14073j f8273a = new C14073j();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C14073j);
            }

            public final int hashCode() {
                return 131789700;
            }

            @k
            public final String toString() {
                return "OpenCamera";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$k;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$k, reason: case insensitive filesystem */
        public static final /* data */ class C14074k implements c {
            static {
                new C14074k();
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C14074k);
            }

            public final int hashCode() {
                return 1092639339;
            }

            @k
            public final String toString() {
                return "OpenCameraRequest";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$l;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$l */
        public static final /* data */ class l implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8274a;

            public l(@k Y41.a<G0> aVar) {
                this.f8274a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && L.f(this.f8274a, ((l) obj).f8274a);
            }

            public final int hashCode() {
                return this.f8274a.hashCode();
            }

            @k
            public final String toString() {
                return androidx.appcompat.app.r.v(new StringBuilder("OpenConfirmDisablingDialog(onConfirmDisable="), this.f8274a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$m;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$m */
        public static final /* data */ class m implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AddressParameter.SellerAddresses.DeleteAddressSheet f8275a;

            public m(@k AddressParameter.SellerAddresses.DeleteAddressSheet deleteAddressSheet) {
                this.f8275a = deleteAddressSheet;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && L.f(this.f8275a, ((m) obj).f8275a);
            }

            public final int hashCode() {
                return this.f8275a.hashCode();
            }

            @k
            public final String toString() {
                return "OpenDeleteAddressConfirmationDialog(data=" + this.f8275a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$n;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$n */
        public static final /* data */ class n implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.publish.slots.delivery_addresses.c f8276a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final com.avito.android.publish.slots.delivery_addresses.item.c f8277b;

            public n(@k com.avito.android.publish.slots.delivery_addresses.c cVar, @k com.avito.android.publish.slots.delivery_addresses.item.c cVar2) {
                this.f8276a = cVar;
                this.f8277b = cVar2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return L.f(this.f8276a, nVar.f8276a) && L.f(this.f8277b, nVar.f8277b);
            }

            public final int hashCode() {
                return this.f8277b.hashCode() + (this.f8276a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "OpenDeliveryAddressesListDialog(presenter=" + this.f8276a + ", data=" + this.f8277b + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$o;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$o */
        public static final /* data */ class o implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final o f8278a = new o();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return 1319918476;
            }

            @k
            public final String toString() {
                return "OpenDeliveryToggles";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$p;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$p */
        public static final /* data */ class p implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String[] f8279a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8280b;

            public p(@k String[] strArr, boolean z12) {
                this.f8279a = strArr;
                this.f8280b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                p pVar = (p) obj;
                return L.f(this.f8279a, pVar.f8279a) && this.f8280b == pVar.f8280b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8280b) + (Arrays.hashCode(this.f8279a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenFilePicker(mimeTypes=");
                sb2.append(Arrays.toString(this.f8279a));
                sb2.append(", isMultiUploadEnabled=");
                return androidx.appcompat.app.r.x(sb2, this.f8280b, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$q;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$q */
        public static final /* data */ class q implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final q f8281a = new q();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 444314471;
            }

            @k
            public final String toString() {
                return "OpenIacDevicesInfoDialog";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$r;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$r */
        public static final /* data */ class r implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<IacDevice> f8282a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8283b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final N f8284c;

            /* JADX WARN: Multi-variable type inference failed */
            public r(@k List<IacDevice> list, boolean z12, @k Y41.l<? super List<IacDevice>, G0> lVar) {
                this.f8282a = list;
                this.f8283b = z12;
                this.f8284c = (N) lVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return L.f(this.f8282a, rVar.f8282a) && this.f8283b == rVar.f8283b && this.f8284c.equals(rVar.f8284c);
            }

            public final int hashCode() {
                return this.f8284c.hashCode() + androidx.appcompat.app.r.i(this.f8282a.hashCode() * 31, 31, this.f8283b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenIacDevicesSelectDialog(devices=");
                sb2.append(this.f8282a);
                sb2.append(", isPro=");
                sb2.append(this.f8283b);
                sb2.append(", onDevicesChosen=");
                return C22026a.d(sb2, this.f8284c, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$s;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$s */
        public static final /* data */ class s implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f8285a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<com.avito.conveyor_item.a> f8286b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final h f8287c;

            /* JADX WARN: Multi-variable type inference failed */
            public s(@Y61.l String str, @k List<? extends com.avito.conveyor_item.a> list, @k h hVar) {
                this.f8285a = str;
                this.f8286b = list;
                this.f8287c = hVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return L.f(this.f8285a, sVar.f8285a) && L.f(this.f8286b, sVar.f8286b) && L.f(this.f8287c, sVar.f8287c);
            }

            public final int hashCode() {
                String str = this.f8285a;
                return this.f8287c.hashCode() + androidx.compose.foundation.H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f8286b);
            }

            @k
            public final String toString() {
                return "OpenParametersBottomSheet(title=" + this.f8285a + ", parameters=" + this.f8286b + ", consumer=" + this.f8287c + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$t;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$t */
        public static final /* data */ class t implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C49325f f8288a;

            public t(@k C49325f c49325f) {
                this.f8288a = c49325f;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && L.f(this.f8288a, ((t) obj).f8288a);
            }

            public final int hashCode() {
                return this.f8288a.hashCode();
            }

            @k
            public final String toString() {
                return "OpenSleepingPlacesBedTypesDialog(data=" + this.f8288a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$u;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$u */
        public static final /* data */ class u implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ParameterElement.J f8289a;

            public u(@k ParameterElement.J j12) {
                this.f8289a = j12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && L.f(this.f8289a, ((u) obj).f8289a);
            }

            public final int hashCode() {
                return this.f8289a.hashCode();
            }

            @k
            public final String toString() {
                return "OpenVideoPicker(videoUploadItem=" + this.f8289a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$v;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$v */
        public static final /* data */ class v implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8290a;

            public v(@k String str) {
                this.f8290a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v) && L.f(this.f8290a, ((v) obj).f8290a);
            }

            public final int hashCode() {
                return this.f8290a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("OpenWebUrl(url="), this.f8290a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$c$w;", "LIe0/a$c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$w */
        public static final /* data */ class w implements c {
            static {
                new w();
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof w);
            }

            public final int hashCode() {
                return 1458342354;
            }

            @k
            public final String toString() {
                return "ShowAppSettings";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$x;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$x */
        public static final /* data */ class x implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AutoEarlyAccessSelectParams f8291a;

            static {
                Parcelable.Creator<AutoEarlyAccessSelectParams> creator = AutoEarlyAccessSelectParams.CREATOR;
            }

            public x(@k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
                this.f8291a = autoEarlyAccessSelectParams;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof x) && L.f(this.f8291a, ((x) obj).f8291a);
            }

            public final int hashCode() {
                return this.f8291a.hashCode();
            }

            @k
            public final String toString() {
                return "ShowAutoEarlyAccessSelectScreen(openParams=" + this.f8291a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$y;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$y */
        public static final /* data */ class y implements c {

            /* renamed from: a, reason: collision with root package name */
            public final int f8292a;

            public y(int i12) {
                this.f8292a = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y) && this.f8292a == ((y) obj).f8292a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f8292a);
            }

            @k
            public final String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("ShowCpaTariffRequestScreen(categoryId="), this.f8292a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$c$z;", "LIe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$c$z */
        public static final /* data */ class z implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f8293a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.l<Long, G0> f8294b;

            /* JADX WARN: Multi-variable type inference failed */
            public z(@k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f8293a = c29377e;
                this.f8294b = lVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof z)) {
                    return false;
                }
                z zVar = (z) obj;
                return L.f(this.f8293a, zVar.f8293a) && L.f(this.f8294b, zVar.f8294b);
            }

            public final int hashCode() {
                return this.f8294b.hashCode() + (this.f8293a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDateDialog(item=");
                sb2.append(this.f8293a);
                sb2.append(", onApplyDateCallback=");
                return androidx.compose.foundation.H.l(sb2, this.f8294b, ')');
            }
        }
    }

    /* compiled from: PublishDetailsAction.kt */
    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\u001e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0082\u0001\u001e!\"#$%&'()*+,-./0123456789:;<=>¨\u0006?"}, d2 = {"LIe0/a$d;", "LIe0/a;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/Action;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "LIe0/a$d$a;", "LIe0/a$d$b;", "LIe0/a$d$c;", "LIe0/a$d$d;", "LIe0/a$d$e;", "LIe0/a$d$f;", "LIe0/a$d$g;", "LIe0/a$d$h;", "LIe0/a$d$i;", "LIe0/a$d$j;", "LIe0/a$d$k;", "LIe0/a$d$l;", "LIe0/a$d$m;", "LIe0/a$d$n;", "LIe0/a$d$o;", "LIe0/a$d$p;", "LIe0/a$d$q;", "LIe0/a$d$r;", "LIe0/a$d$s;", "LIe0/a$d$t;", "LIe0/a$d$u;", "LIe0/a$d$v;", "LIe0/a$d$w;", "LIe0/a$d$x;", "LIe0/a$d$y;", "LIe0/a$d$z;", "LIe0/a$d$A;", "LIe0/a$d$B;", "LIe0/a$d$C;", "LIe0/a$d$D;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ie0.a$d */
    public interface d extends InterfaceC14065a {

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$A;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$A */
        public static final /* data */ class A implements d {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f8295a;

            public A(boolean z12) {
                this.f8295a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof A) && this.f8295a == ((A) obj).f8295a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8295a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("UpdateHtmlEditorToolbarVisible(isShow="), this.f8295a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$B;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$B */
        public static final /* data */ class B implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Set<String> f8296a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final N f8297b;

            /* JADX WARN: Multi-variable type inference failed */
            public B(@Y61.k Set<String> set, @Y61.k Y41.l<? super Boolean, G0> lVar) {
                this.f8296a = set;
                this.f8297b = (N) lVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof B)) {
                    return false;
                }
                B b12 = (B) obj;
                return L.f(this.f8296a, b12.f8296a) && this.f8297b.equals(b12.f8297b);
            }

            public final int hashCode() {
                return this.f8297b.hashCode() + (this.f8296a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ValidateForm(excludeIds=");
                sb2.append(this.f8296a);
                sb2.append(", onResult=");
                return C22026a.d(sb2, this.f8297b, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$C;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$C */
        public static final /* data */ class C implements d {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f8298a;

            public C(boolean z12) {
                this.f8298a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C) && this.f8298a == ((C) obj).f8298a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8298a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("VideoStepUpdated(isVideoLoaded="), this.f8298a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$D;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$D */
        public static final /* data */ class D implements d {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f8299a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Y41.a<G0> f8300b;

            public D(@Y61.l Y41.a aVar, boolean z12) {
                this.f8299a = z12;
                this.f8300b = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof D)) {
                    return false;
                }
                D d12 = (D) obj;
                return this.f8299a == d12.f8299a && L.f(this.f8300b, d12.f8300b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f8299a) * 31;
                Y41.a<G0> aVar = this.f8300b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VideoUpMainButton(mainButtonEnabled=");
                sb2.append(this.f8299a);
                sb2.append(", mainButtonDisabledCallBack=");
                return androidx.appcompat.app.r.v(sb2, this.f8300b, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$a;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C0474a implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C0474a f8301a = new C0474a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C0474a);
            }

            public final int hashCode() {
                return -1742886249;
            }

            @Y61.k
            public final String toString() {
                return "AttachView";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$b;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$b, reason: case insensitive filesystem */
        public static final /* data */ class C14075b implements d {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f8302a;

            public C14075b() {
                this(false, 1, null);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14075b) && this.f8302a == ((C14075b) obj).f8302a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8302a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("BackButtonClicked(isImmediatelyBack="), this.f8302a, ')');
            }

            public C14075b(boolean z12) {
                this.f8302a = z12;
            }

            public /* synthetic */ C14075b(boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? false : z12);
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$c;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$c, reason: case insensitive filesystem */
        public static final /* data */ class C14076c implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PublishDetailsFlowTracker.FlowContext[] f8303a;

            public C14076c(@Y61.k PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
                this.f8303a = flowContextArr;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14076c) && L.f(this.f8303a, ((C14076c) obj).f8303a);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.f8303a);
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("CommitDataChanges(flowContext="), Arrays.toString(this.f8303a), ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$d;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$d, reason: collision with other inner class name */
        public static final /* data */ class C0475d implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final com.avito.android.publish.slots.card_select.item.k f8304a;

            public C0475d(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
                this.f8304a = kVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0475d) && L.f(this.f8304a, ((C0475d) obj).f8304a);
            }

            public final int hashCode() {
                com.avito.android.publish.slots.card_select.item.k kVar = this.f8304a;
                if (kVar == null) {
                    return 0;
                }
                return kVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ConditionalButtonChange(state=" + this.f8304a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$e;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$e */
        public static final /* data */ class e implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f8305a = new e();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1709794109;
            }

            @Y61.k
            public final String toString() {
                return "DeleteButtonClicked";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$f;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$f */
        public static final /* data */ class f implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f8306a = new f();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 582880082;
            }

            @Y61.k
            public final String toString() {
                return "DestroyView";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$g;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$g */
        public static final /* data */ class g implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final g f8307a = new g();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1054234890;
            }

            @Y61.k
            public final String toString() {
                return "ErrorActionClicked";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$h;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$h */
        public static final /* data */ class h implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final h f8308a = new h();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1513498835;
            }

            @Y61.k
            public final String toString() {
                return "HideLoading";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$i;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$i */
        public static final /* data */ class i implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final FormatChange f8309a;

            public i(@Y61.k FormatChange formatChange) {
                this.f8309a = formatChange;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && L.f(this.f8309a, ((i) obj).f8309a);
            }

            public final int hashCode() {
                return this.f8309a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "HtmlFormatClicked(format=" + this.f8309a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$j;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$j */
        public static final /* data */ class j implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final EditorNavigationEvent f8310a;

            public j(@Y61.k EditorNavigationEvent editorNavigationEvent) {
                this.f8310a = editorNavigationEvent;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.f8310a == ((j) obj).f8310a;
            }

            public final int hashCode() {
                return this.f8310a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "HtmlHistoryNavigationClicked(event=" + this.f8310a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$k;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$k */
        public static final /* data */ class k implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f8311a;

            public k(@Y61.l String str) {
                this.f8311a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && L.f(this.f8311a, ((k) obj).f8311a);
            }

            public final int hashCode() {
                String str = this.f8311a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("InvalidateForm(updatesFormForParamId="), this.f8311a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$l;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$l */
        public static final /* data */ class l implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final l f8312a = new l();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return 1110733487;
            }

            @Y61.k
            public final String toString() {
                return "MainButtonClicked";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$m;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$m */
        public static final /* data */ class m implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final N f8313a;

            /* JADX WARN: Multi-variable type inference failed */
            public m(@Y61.k Y41.l<? super InterfaceC33764k0.a, InterfaceC33764k0.a> lVar) {
                this.f8313a = (N) lVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && L.f(this.f8313a, ((m) obj).f8313a);
            }

            public final int hashCode() {
                return this.f8313a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.d(new StringBuilder("ModifyButtonsState(update="), this.f8313a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$n;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$n */
        public static final /* data */ class n implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.conveyor_item.a f8314a;

            public n(@Y61.k com.avito.conveyor_item.a aVar) {
                this.f8314a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && L.f(this.f8314a, ((n) obj).f8314a);
            }

            public final int hashCode() {
                return this.f8314a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "RenderSlotsItemUpdate(item=" + this.f8314a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$o;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$o */
        public static final /* data */ class o implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final o f8315a = new o();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return 384508204;
            }

            @Y61.k
            public final String toString() {
                return "RetryClicked";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$p;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$p */
        public static final /* data */ class p implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final JO.a f8316a;

            public p(@Y61.k JO.a aVar) {
                this.f8316a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && L.f(this.f8316a, ((p) obj).f8316a);
            }

            public final int hashCode() {
                return this.f8316a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ScrollToAccordionContent(item=" + this.f8316a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/a$d$q;", "LIe0/a$d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$q */
        public static final /* data */ class q implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final q f8317a = new q();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return -846349933;
            }

            @Y61.k
            public final String toString() {
                return "ScrollToError";
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$r;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$r */
        public static final /* data */ class r implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final com.avito.android.publish.slots.card_select.item.k f8318a;

            public r(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
                this.f8318a = kVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && L.f(this.f8318a, ((r) obj).f8318a);
            }

            public final int hashCode() {
                com.avito.android.publish.slots.card_select.item.k kVar = this.f8318a;
                if (kVar == null) {
                    return 0;
                }
                return kVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "SetConditionalActionButton(state=" + this.f8318a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$s;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$s */
        public static final /* data */ class s implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8319a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f8320b;

            public s(@Y61.k String str, @Y61.k String str2) {
                this.f8319a = str;
                this.f8320b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return L.f(this.f8319a, sVar.f8319a) && L.f(this.f8320b, sVar.f8320b);
            }

            public final int hashCode() {
                return this.f8320b.hashCode() + (this.f8319a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowAddressActionMessage(address=");
                sb2.append(this.f8319a);
                sb2.append(", actionString=");
                return C22026a.c(sb2, this.f8320b, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$t;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$t */
        public static final /* data */ class t implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Confetti f8321a;

            public t(@Y61.k Confetti confetti) {
                this.f8321a = confetti;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && L.f(this.f8321a, ((t) obj).f8321a);
            }

            public final int hashCode() {
                return this.f8321a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ShowConfettiAnimation(confetti=" + this.f8321a + ')';
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$u;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$u */
        public static final /* data */ class u implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8322a;

            public u(@Y61.k String str) {
                this.f8322a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && L.f(this.f8322a, ((u) obj).f8322a);
            }

            public final int hashCode() {
                return this.f8322a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowErrorMessage(errorMessage="), this.f8322a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$v;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$v */
        public static final /* data */ class v implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8323a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f8324b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Y41.l<Boolean, G0> f8325c;

            public v(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) {
                this.f8323a = str;
                this.f8324b = str2;
                this.f8325c = lVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof v)) {
                    return false;
                }
                v vVar = (v) obj;
                return L.f(this.f8323a, vVar.f8323a) && L.f(this.f8324b, vVar.f8324b) && L.f(this.f8325c, vVar.f8325c);
            }

            public final int hashCode() {
                return this.f8325c.hashCode() + H.d(this.f8323a.hashCode() * 31, 31, this.f8324b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowLoading(loadingMessage=");
                sb2.append(this.f8323a);
                sb2.append(", interruptText=");
                sb2.append(this.f8324b);
                sb2.append(", interruptCallback=");
                return H.l(sb2, this.f8325c, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$w;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$w */
        public static final /* data */ class w implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8326a;

            public w(@Y61.k String str) {
                this.f8326a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof w) && L.f(this.f8326a, ((w) obj).f8326a);
            }

            public final int hashCode() {
                return this.f8326a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowSimpleMessageAlert(text="), this.f8326a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$x;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$x */
        public static final /* data */ class x implements d {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f8327a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8328b;

            public x(boolean z12, boolean z13) {
                this.f8327a = z12;
                this.f8328b = z13;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof x)) {
                    return false;
                }
                x xVar = (x) obj;
                return this.f8327a == xVar.f8327a && this.f8328b == xVar.f8328b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8328b) + (Boolean.hashCode(this.f8327a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UpdateEditorNavigationButtonsState(undoEnabled=");
                sb2.append(this.f8327a);
                sb2.append(", redoEnabled=");
                return androidx.appcompat.app.r.x(sb2, this.f8328b, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$y;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$y */
        public static final /* data */ class y implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8329a;

            public y(@Y61.k String str) {
                this.f8329a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y) && L.f(this.f8329a, ((y) obj).f8329a);
            }

            public final int hashCode() {
                return this.f8329a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("UpdateForm(updatedParamId="), this.f8329a, ')');
            }
        }

        /* compiled from: PublishDetailsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/a$d$z;", "LIe0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.a$d$z */
        public static final /* data */ class z implements d {

            /* renamed from: a, reason: collision with root package name */
            public final int f8330a;

            public z(int i12) {
                this.f8330a = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z) && this.f8330a == ((z) obj).f8330a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f8330a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("UpdateHtmlEditorToolbarFlags(flags="), this.f8330a, ')');
            }
        }
    }
}
