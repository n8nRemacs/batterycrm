package Ie0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.h;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.publish.slots.contact_info.d;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionInfo;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import vf0.C49325f;

/* compiled from: PublishDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIe0/d;", "", "a", "b", "LIe0/d$a;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface d {

    /* compiled from: PublishDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"LIe0/d$b;", "LIe0/d;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/OneTimeEvent;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LIe0/d$b$a;", "LIe0/d$b$b;", "LIe0/d$b$c;", "LIe0/d$b$d;", "LIe0/d$b$e;", "LIe0/d$b$f;", "LIe0/d$b$g;", "LIe0/d$b$h;", "LIe0/d$b$i;", "LIe0/d$b$j;", "LIe0/d$b$k;", "LIe0/d$b$l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends d {

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$b$a;", "LIe0/d$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f8411a = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2140228663;
            }

            @Y61.k
            public final String toString() {
                return "HideKeyboard";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$b;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0478b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final int f8412a;

            public C0478b(int i12) {
                this.f8412a = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0478b) && this.f8412a == ((C0478b) obj).f8412a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f8412a);
            }

            @Y61.k
            public final String toString() {
                return r.t(new StringBuilder("ScrollToAccordionContent(position="), this.f8412a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$c;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            public final int f8413a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8414b;

            public c(int i12, boolean z12) {
                this.f8413a = i12;
                this.f8414b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f8413a == cVar.f8413a && this.f8414b == cVar.f8414b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8414b) + (Integer.hashCode(this.f8413a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScrollToItem(position=");
                sb2.append(this.f8413a);
                sb2.append(", waitForRelayout=");
                return r.x(sb2, this.f8414b, ')');
            }

            public /* synthetic */ c(int i12, boolean z12, int i13, C42822w c42822w) {
                this(i12, (i13 & 2) != 0 ? false : z12);
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$e;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8418a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f8419b;

            public e(@Y61.k String str, @Y61.k String str2) {
                this.f8418a = str;
                this.f8419b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f8418a, eVar.f8418a) && L.f(this.f8419b, eVar.f8419b);
            }

            public final int hashCode() {
                return this.f8419b.hashCode() + (this.f8418a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowAddressActionMessageAlert(address=");
                sb2.append(this.f8418a);
                sb2.append(", action=");
                return C22026a.c(sb2, this.f8419b, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$f;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ru.avito.component.toolbar.d f8420a;

            public f(@Y61.k ru.avito.component.toolbar.d dVar) {
                this.f8420a = dVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && L.f(this.f8420a, ((f) obj).f8420a);
            }

            public final int hashCode() {
                return this.f8420a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ShowAppBarOnboarding(data=" + this.f8420a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$g;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class g implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Confetti f8421a;

            public g(@Y61.k Confetti confetti) {
                this.f8421a = confetti;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && L.f(this.f8421a, ((g) obj).f8421a);
            }

            public final int hashCode() {
                return this.f8421a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ShowConfettiAnimation(confetti=" + this.f8421a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$h;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class h implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8422a;

            public h(@Y61.k String str) {
                this.f8422a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && L.f(this.f8422a, ((h) obj).f8422a);
            }

            public final int hashCode() {
                return this.f8422a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowError(message="), this.f8422a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$i;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class i implements b {
            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                ((i) obj).getClass();
                return L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @Y61.k
            public final String toString() {
                return "ShowErrorWithAction(message=null, action=null)";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$j;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class j implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f8423a;

            public j(@Y61.k String str) {
                this.f8423a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && L.f(this.f8423a, ((j) obj).f8423a);
            }

            public final int hashCode() {
                return this.f8423a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowSimpleMessageAlert(text="), this.f8423a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$k;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class k implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ToastBarState f8424a;

            public k(@Y61.k ToastBarState toastBarState) {
                this.f8424a = toastBarState;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && L.f(this.f8424a, ((k) obj).f8424a);
            }

            public final int hashCode() {
                return this.f8424a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ShowToastBarError(state=" + this.f8424a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$l;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class l implements b {

            /* renamed from: a, reason: collision with root package name */
            public final int f8425a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final TooltipOptions f8426b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final DeepLink f8427c;

            public l(int i12, @Y61.l TooltipOptions tooltipOptions, @Y61.l DeepLink deepLink) {
                this.f8425a = i12;
                this.f8426b = tooltipOptions;
                this.f8427c = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return this.f8425a == lVar.f8425a && L.f(this.f8426b, lVar.f8426b) && L.f(this.f8427c, lVar.f8427c);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f8425a) * 31;
                TooltipOptions tooltipOptions = this.f8426b;
                int iHashCode2 = (iHashCode + (tooltipOptions == null ? 0 : tooltipOptions.hashCode())) * 31;
                DeepLink deepLink = this.f8427c;
                return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowTooltipForItem(position=");
                sb2.append(this.f8425a);
                sb2.append(", options=");
                sb2.append(this.f8426b);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f8427c, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$b$d;", "LIe0/d$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$b$d, reason: collision with other inner class name */
        public static final /* data */ class C0479d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PrintableText f8415a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final PrintableText f8416b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final SlotType f8417c;

            public C0479d(@Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.k SlotType slotType) {
                this.f8415a = printableText;
                this.f8416b = printableText2;
                this.f8417c = slotType;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0479d)) {
                    return false;
                }
                C0479d c0479d = (C0479d) obj;
                return L.f(this.f8415a, c0479d.f8415a) && L.f(this.f8416b, c0479d.f8416b) && this.f8417c == c0479d.f8417c;
            }

            public final int hashCode() {
                int iHashCode = this.f8415a.hashCode() * 31;
                PrintableText printableText = this.f8416b;
                return this.f8417c.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                return "ShowActionError(errorMessage=" + this.f8415a + ", actionText=" + this.f8416b + ", slotType=" + this.f8417c + ')';
            }

            public /* synthetic */ C0479d(PrintableText printableText, PrintableText printableText2, SlotType slotType, int i12, C42822w c42822w) {
                this(printableText, (i12 & 2) != 0 ? null : printableText2, slotType);
            }
        }
    }

    /* compiled from: PublishDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:/\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01\u0082\u0001/23456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, d2 = {"LIe0/d$a;", "LIe0/d;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/OneTimeEvent;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "LIe0/d$a$a;", "LIe0/d$a$b;", "LIe0/d$a$c;", "LIe0/d$a$d;", "LIe0/d$a$e;", "LIe0/d$a$f;", "LIe0/d$a$g;", "LIe0/d$a$h;", "LIe0/d$a$i;", "LIe0/d$a$j;", "LIe0/d$a$k;", "LIe0/d$a$l;", "LIe0/d$a$m;", "LIe0/d$a$n;", "LIe0/d$a$o;", "LIe0/d$a$p;", "LIe0/d$a$q;", "LIe0/d$a$r;", "LIe0/d$a$s;", "LIe0/d$a$t;", "LIe0/d$a$u;", "LIe0/d$a$v;", "LIe0/d$a$w;", "LIe0/d$a$x;", "LIe0/d$a$y;", "LIe0/d$a$z;", "LIe0/d$a$A;", "LIe0/d$a$B;", "LIe0/d$a$C;", "LIe0/d$a$D;", "LIe0/d$a$E;", "LIe0/d$a$F;", "LIe0/d$a$G;", "LIe0/d$a$H;", "LIe0/d$a$I;", "LIe0/d$a$J;", "LIe0/d$a$K;", "LIe0/d$a$L;", "LIe0/d$a$M;", "LIe0/d$a$N;", "LIe0/d$a$O;", "LIe0/d$a$P;", "LIe0/d$a$Q;", "LIe0/d$a$R;", "LIe0/d$a$S;", "LIe0/d$a$T;", "LIe0/d$a$U;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends d {

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$A;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class A implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8331a;

            public A(@k String str) {
                this.f8331a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof A) && kotlin.jvm.internal.L.f(this.f8331a, ((A) obj).f8331a);
            }

            public final int hashCode() {
                return this.f8331a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("OpenWebUrl(url="), this.f8331a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$B;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class B implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final d.b f8332a;

            public B(@k d.b bVar) {
                this.f8332a = bVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof B) && kotlin.jvm.internal.L.f(this.f8332a, ((B) obj).f8332a);
            }

            public final int hashCode() {
                return this.f8332a.hashCode();
            }

            @k
            public final String toString() {
                return "PhoneVerificationScreen(phoneVerificationData=" + this.f8332a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$C;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8333a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f8334b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f8335c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f8336d;

            public C(@k String str, @k String str2, @l String str3, boolean z12) {
                this.f8333a = str;
                this.f8334b = str2;
                this.f8335c = str3;
                this.f8336d = z12;
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$D;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class D implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final D f8337a = new D();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof D);
            }

            public final int hashCode() {
                return 259209183;
            }

            @k
            public final String toString() {
                return "ShowAppSettings";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$E;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class E implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AutoEarlyAccessSelectParams f8338a;

            static {
                Parcelable.Creator<AutoEarlyAccessSelectParams> creator = AutoEarlyAccessSelectParams.CREATOR;
            }

            public E(@k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
                this.f8338a = autoEarlyAccessSelectParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof E) && kotlin.jvm.internal.L.f(this.f8338a, ((E) obj).f8338a);
            }

            public final int hashCode() {
                return this.f8338a.hashCode();
            }

            @k
            public final String toString() {
                return "ShowAutoEarlyAccessSelectScreen(openParams=" + this.f8338a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$F;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class F implements a {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof F)) {
                    return false;
                }
                ((F) obj).getClass();
                return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "ShowConfirmation(confirmation=null, onConfirmed=null)";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$H;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class H implements a {

            /* renamed from: a, reason: collision with root package name */
            public final int f8344a;

            public H(int i12) {
                this.f8344a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof H) && this.f8344a == ((H) obj).f8344a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f8344a);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("ShowCpaTariffRequestScreen(categoryId="), this.f8344a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$I;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class I implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f8345a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.l<Long, G0> f8346b;

            /* JADX WARN: Multi-variable type inference failed */
            public I(@k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f8345a = c29377e;
                this.f8346b = lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof I)) {
                    return false;
                }
                I i12 = (I) obj;
                return kotlin.jvm.internal.L.f(this.f8345a, i12.f8345a) && kotlin.jvm.internal.L.f(this.f8346b, i12.f8346b);
            }

            public final int hashCode() {
                return this.f8346b.hashCode() + (this.f8345a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDateDialog(item=");
                sb2.append(this.f8345a);
                sb2.append(", onApplyDateCallback=");
                return androidx.compose.foundation.H.l(sb2, this.f8346b, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$J;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class J implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final c.a f8347a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f8348b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final kotlin.jvm.internal.N f8349c;

            /* JADX WARN: Multi-variable type inference failed */
            public J(@k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f8347a = aVar;
                this.f8348b = c29377e;
                this.f8349c = (kotlin.jvm.internal.N) lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof J)) {
                    return false;
                }
                J j12 = (J) obj;
                return kotlin.jvm.internal.L.f(this.f8347a, j12.f8347a) && this.f8348b.equals(j12.f8348b) && this.f8349c.equals(j12.f8349c);
            }

            public final int hashCode() {
                return this.f8349c.hashCode() + ((this.f8348b.hashCode() + (this.f8347a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDatePickerDialog(dateSelectInfo=");
                sb2.append(this.f8347a);
                sb2.append(", dateTime=");
                sb2.append(this.f8348b);
                sb2.append(", callback=");
                return C22026a.d(sb2, this.f8349c, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$K;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class K implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final c.a f8350a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f8351b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Y41.l<Long, G0> f8352c;

            /* JADX WARN: Multi-variable type inference failed */
            public K(@k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f8350a = aVar;
                this.f8351b = c29377e;
                this.f8352c = lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof K)) {
                    return false;
                }
                K k12 = (K) obj;
                return kotlin.jvm.internal.L.f(this.f8350a, k12.f8350a) && kotlin.jvm.internal.L.f(this.f8351b, k12.f8351b) && kotlin.jvm.internal.L.f(this.f8352c, k12.f8352c);
            }

            public final int hashCode() {
                return this.f8352c.hashCode() + ((this.f8351b.hashCode() + (this.f8350a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDateTimeRangeDialog(dateSelectInfo=");
                sb2.append(this.f8350a);
                sb2.append(", dateTime=");
                sb2.append(this.f8351b);
                sb2.append(", callback=");
                return androidx.compose.foundation.H.l(sb2, this.f8352c, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$L;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class L implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f8353a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f8354b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f8355c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f8356d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final kotlin.jvm.internal.N f8357e;

            /* JADX WARN: Multi-variable type inference failed */
            public L(@l String str, @k String str2, @k String str3, @k String str4, @k Y41.a<G0> aVar) {
                this.f8353a = str;
                this.f8354b = str2;
                this.f8355c = str3;
                this.f8356d = str4;
                this.f8357e = (kotlin.jvm.internal.N) aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof L)) {
                    return false;
                }
                L l12 = (L) obj;
                return kotlin.jvm.internal.L.f(this.f8353a, l12.f8353a) && kotlin.jvm.internal.L.f(this.f8354b, l12.f8354b) && kotlin.jvm.internal.L.f(this.f8355c, l12.f8355c) && kotlin.jvm.internal.L.f(this.f8356d, l12.f8356d) && this.f8357e.equals(l12.f8357e);
            }

            public final int hashCode() {
                String str = this.f8353a;
                return this.f8357e.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f8354b), 31, this.f8355c), 31, this.f8356d);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDialog(title=");
                sb2.append(this.f8353a);
                sb2.append(", message=");
                sb2.append(this.f8354b);
                sb2.append(", positiveOption=");
                sb2.append(this.f8355c);
                sb2.append(", negativeOption=");
                sb2.append(this.f8356d);
                sb2.append(", onPositiveClicked=");
                return C22026a.d(sb2, this.f8357e, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$M;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class M implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8358a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f8359b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f8360c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8361d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8362e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8363f;

            public M(@k String str, @k String str2, @k String str3, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3) {
                this.f8358a = str;
                this.f8359b = str2;
                this.f8360c = str3;
                this.f8361d = aVar;
                this.f8362e = aVar2;
                this.f8363f = aVar3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof M)) {
                    return false;
                }
                M m12 = (M) obj;
                return kotlin.jvm.internal.L.f(this.f8358a, m12.f8358a) && kotlin.jvm.internal.L.f(this.f8359b, m12.f8359b) && kotlin.jvm.internal.L.f(this.f8360c, m12.f8360c) && kotlin.jvm.internal.L.f(this.f8361d, m12.f8361d) && kotlin.jvm.internal.L.f(this.f8362e, m12.f8362e) && kotlin.jvm.internal.L.f(this.f8363f, m12.f8363f);
            }

            public final int hashCode() {
                return this.f8363f.hashCode() + r.h(r.h(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f8358a.hashCode() * 31, 31, this.f8359b), 31, this.f8360c), 31, this.f8361d), 31, this.f8362e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDialogDismissable(title=");
                sb2.append(this.f8358a);
                sb2.append(", message=");
                sb2.append(this.f8359b);
                sb2.append(", button=");
                sb2.append(this.f8360c);
                sb2.append(", onShow=");
                sb2.append(this.f8361d);
                sb2.append(", onAccept=");
                sb2.append(this.f8362e);
                sb2.append(", onDismiss=");
                return r.v(sb2, this.f8363f, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$N;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class N implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ObjectsParameter f8364a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Integer f8365b;

            public N(@k ObjectsParameter objectsParameter, @l Integer num) {
                this.f8364a = objectsParameter;
                this.f8365b = num;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof N)) {
                    return false;
                }
                N n12 = (N) obj;
                return kotlin.jvm.internal.L.f(this.f8364a, n12.f8364a) && kotlin.jvm.internal.L.f(this.f8365b, n12.f8365b);
            }

            public final int hashCode() {
                int iHashCode = this.f8364a.hashCode() * 31;
                Integer num = this.f8365b;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowEditObjectsScreen(parameter=");
                sb2.append(this.f8364a);
                sb2.append(", selectedObject=");
                return s.j(sb2, this.f8365b, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$O;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class O implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8366a;

            public O(@k String str) {
                this.f8366a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof O) && kotlin.jvm.internal.L.f(this.f8366a, ((O) obj).f8366a);
            }

            public final int hashCode() {
                return this.f8366a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowHelpCenterScreen(url="), this.f8366a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$P;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class P implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AddressParameter f8367a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8368b;

            public P(@k AddressParameter addressParameter, boolean z12) {
                this.f8367a = addressParameter;
                this.f8368b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof P)) {
                    return false;
                }
                P p12 = (P) obj;
                return kotlin.jvm.internal.L.f(this.f8367a, p12.f8367a) && this.f8368b == p12.f8368b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8368b) + (this.f8367a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowLocationPicker(address=");
                sb2.append(this.f8367a);
                sb2.append(", withRedesignTheme=");
                return r.x(sb2, this.f8368b, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$Q;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Q implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f8369a;

            public Q(@k String str) {
                this.f8369a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Q) && kotlin.jvm.internal.L.f(this.f8369a, ((Q) obj).f8369a);
            }

            public final int hashCode() {
                return this.f8369a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowPublishDetailsStepForFillParams(slotWithStepConfigId="), this.f8369a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$R;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class R implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final R f8370a = new R();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof R);
            }

            public final int hashCode() {
                return -1338726817;
            }

            @k
            public final String toString() {
                return "ShowResidentialComplexSuggestScreen";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$S;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class S implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Arguments f8371a;

            public S(@k Arguments arguments) {
                this.f8371a = arguments;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof S) && kotlin.jvm.internal.L.f(this.f8371a, ((S) obj).f8371a);
            }

            public final int hashCode() {
                return this.f8371a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.p(new StringBuilder("ShowSelectScreen(arguments="), this.f8371a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$T;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class T implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.blueprints.selector_card_group_bottom_sheet.k f8372a;

            public T(@k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
                this.f8372a = kVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof T) && kotlin.jvm.internal.L.f(this.f8372a, ((T) obj).f8372a);
            }

            public final int hashCode() {
                return this.f8372a.hashCode();
            }

            @k
            public final String toString() {
                return "ShowSelectorCardGroupBottomSheet(params=" + this.f8372a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$U;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class U implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final U f8373a = new U();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof U);
            }

            public final int hashCode() {
                return -773137979;
            }

            @k
            public final String toString() {
                return "ShowSellerProtectionDialog";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$a;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0476a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final RealtyAddressSubmissionInfo f8374a;

            public C0476a(@k RealtyAddressSubmissionInfo realtyAddressSubmissionInfo) {
                this.f8374a = realtyAddressSubmissionInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0476a) && kotlin.jvm.internal.L.f(this.f8374a, ((C0476a) obj).f8374a);
            }

            public final int hashCode() {
                return this.f8374a.hashCode();
            }

            @k
            public final String toString() {
                return "AddressResubmissionBottomSheet(info=" + this.f8374a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$b;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$b, reason: case insensitive filesystem */
        public static final /* data */ class C14077b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14077b f8375a = new C14077b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14077b);
            }

            public final int hashCode() {
                return 1500591113;
            }

            @k
            public final String toString() {
                return "CheckVideoPicker";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$c;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$c, reason: case insensitive filesystem */
        public static final /* data */ class C14078c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14078c f8376a = new C14078c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14078c);
            }

            public final int hashCode() {
                return 500672983;
            }

            @k
            public final String toString() {
                return "ContinuePublishAfterVerification";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$d;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$d, reason: collision with other inner class name */
        public static final /* data */ class C0477d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0477d f8377a = new C0477d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0477d);
            }

            public final int hashCode() {
                return 2000776398;
            }

            @k
            public final String toString() {
                return "GoToPreviousStep";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$e;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$e, reason: case insensitive filesystem */
        public static final /* data */ class C14079e implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final FormatChange f8378a;

            public C14079e(@k FormatChange formatChange) {
                this.f8378a = formatChange;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14079e) && kotlin.jvm.internal.L.f(this.f8378a, ((C14079e) obj).f8378a);
            }

            public final int hashCode() {
                return this.f8378a.hashCode();
            }

            @k
            public final String toString() {
                return "HtmlFormat(format=" + this.f8378a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$f;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$f, reason: case insensitive filesystem */
        public static final /* data */ class C14080f implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final EditorNavigationEvent f8379a;

            public C14080f(@k EditorNavigationEvent editorNavigationEvent) {
                this.f8379a = editorNavigationEvent;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14080f) && this.f8379a == ((C14080f) obj).f8379a;
            }

            public final int hashCode() {
                return this.f8379a.hashCode();
            }

            @k
            public final String toString() {
                return "HtmlHistoryNavigation(event=" + this.f8379a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$g;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$g, reason: case insensitive filesystem */
        public static final /* data */ class C14081g implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final IacPermissionRequestSource f8380a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8381b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8382c;

            public C14081g(@k IacPermissionRequestSource iacPermissionRequestSource, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
                this.f8380a = iacPermissionRequestSource;
                this.f8381b = aVar;
                this.f8382c = aVar2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C14081g)) {
                    return false;
                }
                C14081g c14081g = (C14081g) obj;
                return this.f8380a == c14081g.f8380a && kotlin.jvm.internal.L.f(this.f8381b, c14081g.f8381b) && kotlin.jvm.internal.L.f(this.f8382c, c14081g.f8382c);
            }

            public final int hashCode() {
                return this.f8382c.hashCode() + r.h(this.f8380a.hashCode() * 31, 31, this.f8381b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("IacMicSystemPermissionRequest(source=");
                sb2.append(this.f8380a);
                sb2.append(", onPermissionGranted=");
                sb2.append(this.f8381b);
                sb2.append(", onPermissionDenied=");
                return r.v(sb2, this.f8382c, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$h;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$h, reason: case insensitive filesystem */
        public static final /* data */ class C14082h implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14082h f8383a = new C14082h();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14082h);
            }

            public final int hashCode() {
                return -310895678;
            }

            @k
            public final String toString() {
                return "LeaveFillingParamsScreen";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$i;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$i, reason: case insensitive filesystem */
        public static final /* data */ class C14083i implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14083i f8384a = new C14083i();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14083i);
            }

            public final int hashCode() {
                return -774913093;
            }

            @k
            public final String toString() {
                return "LeaveScreen";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$j;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$j, reason: case insensitive filesystem */
        public static final /* data */ class C14084j implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DistrictParameter f8385a;

            public C14084j(@k DistrictParameter districtParameter) {
                this.f8385a = districtParameter;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14084j) && kotlin.jvm.internal.L.f(this.f8385a, ((C14084j) obj).f8385a);
            }

            public final int hashCode() {
                return this.f8385a.hashCode();
            }

            @k
            public final String toString() {
                return "NavigateToSelectDistrictsScreen(parameter=" + this.f8385a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$k;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$k, reason: case insensitive filesystem */
        public static final /* data */ class C14085k implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final MetroParameter f8386a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Integer f8387b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f8388c;

            public C14085k(@k MetroParameter metroParameter, @l Integer num, @l String str) {
                this.f8386a = metroParameter;
                this.f8387b = num;
                this.f8388c = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C14085k)) {
                    return false;
                }
                C14085k c14085k = (C14085k) obj;
                return kotlin.jvm.internal.L.f(this.f8386a, c14085k.f8386a) && kotlin.jvm.internal.L.f(this.f8387b, c14085k.f8387b) && kotlin.jvm.internal.L.f(this.f8388c, c14085k.f8388c);
            }

            public final int hashCode() {
                int iHashCode = this.f8386a.hashCode() * 31;
                Integer num = this.f8387b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f8388c;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigateToSelectMetroScreen(parameter=");
                sb2.append(this.f8386a);
                sb2.append(", categoryId=");
                sb2.append(this.f8387b);
                sb2.append(", publishSessionId=");
                return C22026a.c(sb2, this.f8388c, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$l;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$l, reason: case insensitive filesystem */
        public static final /* data */ class C14086l implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ObjectsParameter f8389a;

            public C14086l(@k ObjectsParameter objectsParameter) {
                this.f8389a = objectsParameter;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14086l) && kotlin.jvm.internal.L.f(this.f8389a, ((C14086l) obj).f8389a);
            }

            public final int hashCode() {
                return this.f8389a.hashCode();
            }

            @k
            public final String toString() {
                return "NavigateToSelectPriceListScreen(parameter=" + this.f8389a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$m;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$m, reason: case insensitive filesystem */
        public static final /* data */ class C14087m implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14087m f8390a = new C14087m();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14087m);
            }

            public final int hashCode() {
                return -1327880904;
            }

            @k
            public final String toString() {
                return "OnEditCategoryClicked";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$n;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$n, reason: case insensitive filesystem */
        public static final /* data */ class C14088n implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14088n f8391a = new C14088n();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14088n);
            }

            public final int hashCode() {
                return -1080495785;
            }

            @k
            public final String toString() {
                return "OpenCamera";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$o;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$o, reason: case insensitive filesystem */
        public static final /* data */ class C14089o implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14089o f8392a = new C14089o();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14089o);
            }

            public final int hashCode() {
                return -223102664;
            }

            @k
            public final String toString() {
                return "OpenCameraRequest";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$p;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$p, reason: case insensitive filesystem */
        public static final /* data */ class C14090p implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Y41.a<G0> f8393a;

            public C14090p(@k Y41.a<G0> aVar) {
                this.f8393a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14090p) && kotlin.jvm.internal.L.f(this.f8393a, ((C14090p) obj).f8393a);
            }

            public final int hashCode() {
                return this.f8393a.hashCode();
            }

            @k
            public final String toString() {
                return r.v(new StringBuilder("OpenConfirmDisablingDialog(onConfirmDisable="), this.f8393a, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$q;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$q, reason: case insensitive filesystem */
        public static final /* data */ class C14091q implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f8394a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Bundle f8395b;

            public C14091q(@k DeepLink deepLink, @l Bundle bundle) {
                this.f8394a = deepLink;
                this.f8395b = bundle;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C14091q)) {
                    return false;
                }
                C14091q c14091q = (C14091q) obj;
                return kotlin.jvm.internal.L.f(this.f8394a, c14091q.f8394a) && kotlin.jvm.internal.L.f(this.f8395b, c14091q.f8395b);
            }

            public final int hashCode() {
                int iHashCode = this.f8394a.hashCode() * 31;
                Bundle bundle = this.f8395b;
                return iHashCode + (bundle == null ? 0 : bundle.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenDeepLink(deeplink=");
                sb2.append(this.f8394a);
                sb2.append(", args=");
                return androidx.compose.foundation.H.m(sb2, this.f8395b, ')');
            }

            public /* synthetic */ C14091q(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
                this(deepLink, (i12 & 2) != 0 ? null : bundle);
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$r;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$r, reason: case insensitive filesystem */
        public static final /* data */ class C14092r implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AddressParameter.SellerAddresses.DeleteAddressSheet f8396a;

            public C14092r(@k AddressParameter.SellerAddresses.DeleteAddressSheet deleteAddressSheet) {
                this.f8396a = deleteAddressSheet;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14092r) && kotlin.jvm.internal.L.f(this.f8396a, ((C14092r) obj).f8396a);
            }

            public final int hashCode() {
                return this.f8396a.hashCode();
            }

            @k
            public final String toString() {
                return "OpenDeleteAddressConfirmationDialog(data=" + this.f8396a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$s;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$s, reason: case insensitive filesystem */
        public static final /* data */ class C14093s implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.publish.slots.delivery_addresses.c f8397a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final com.avito.android.publish.slots.delivery_addresses.item.c f8398b;

            public C14093s(@k com.avito.android.publish.slots.delivery_addresses.c cVar, @k com.avito.android.publish.slots.delivery_addresses.item.c cVar2) {
                this.f8397a = cVar;
                this.f8398b = cVar2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C14093s)) {
                    return false;
                }
                C14093s c14093s = (C14093s) obj;
                return kotlin.jvm.internal.L.f(this.f8397a, c14093s.f8397a) && kotlin.jvm.internal.L.f(this.f8398b, c14093s.f8398b);
            }

            public final int hashCode() {
                return this.f8398b.hashCode() + (this.f8397a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "OpenDeliveryAddressesListDialog(presenter=" + this.f8397a + ", data=" + this.f8398b + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$t;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$t, reason: case insensitive filesystem */
        public static final /* data */ class C14094t implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C14094t f8399a = new C14094t();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C14094t);
            }

            public final int hashCode() {
                return -387761383;
            }

            @k
            public final String toString() {
                return "OpenDeliveryToggles";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$u;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ie0.d$a$u, reason: case insensitive filesystem */
        public static final /* data */ class C14095u implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String[] f8400a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8401b;

            public C14095u(@k String[] strArr, boolean z12) {
                this.f8400a = strArr;
                this.f8401b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C14095u)) {
                    return false;
                }
                C14095u c14095u = (C14095u) obj;
                return kotlin.jvm.internal.L.f(this.f8400a, c14095u.f8400a) && this.f8401b == c14095u.f8401b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f8401b) + (Arrays.hashCode(this.f8400a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenFilePicker(mimeTypes=");
                sb2.append(Arrays.toString(this.f8400a));
                sb2.append(", isMultiUploadEnabled=");
                return r.x(sb2, this.f8401b, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIe0/d$a$v;", "LIe0/d$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class v implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final v f8402a = new v();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof v);
            }

            public final int hashCode() {
                return -346848262;
            }

            @k
            public final String toString() {
                return "OpenIacDevicesInfoDialog";
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$w;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class w implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<IacDevice> f8403a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8404b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final kotlin.jvm.internal.N f8405c;

            /* JADX WARN: Multi-variable type inference failed */
            public w(@k List<IacDevice> list, boolean z12, @k Y41.l<? super List<IacDevice>, G0> lVar) {
                this.f8403a = list;
                this.f8404b = z12;
                this.f8405c = (kotlin.jvm.internal.N) lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof w)) {
                    return false;
                }
                w wVar = (w) obj;
                return kotlin.jvm.internal.L.f(this.f8403a, wVar.f8403a) && this.f8404b == wVar.f8404b && this.f8405c.equals(wVar.f8405c);
            }

            public final int hashCode() {
                return this.f8405c.hashCode() + r.i(this.f8403a.hashCode() * 31, 31, this.f8404b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenIacDevicesSelectDialog(devices=");
                sb2.append(this.f8403a);
                sb2.append(", isPro=");
                sb2.append(this.f8404b);
                sb2.append(", onDevicesChosen=");
                return C22026a.d(sb2, this.f8405c, ')');
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$x;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class x implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f8406a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<com.avito.conveyor_item.a> f8407b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final h f8408c;

            /* JADX WARN: Multi-variable type inference failed */
            public x(@l String str, @k List<? extends com.avito.conveyor_item.a> list, @k h hVar) {
                this.f8406a = str;
                this.f8407b = list;
                this.f8408c = hVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof x)) {
                    return false;
                }
                x xVar = (x) obj;
                return kotlin.jvm.internal.L.f(this.f8406a, xVar.f8406a) && kotlin.jvm.internal.L.f(this.f8407b, xVar.f8407b) && kotlin.jvm.internal.L.f(this.f8408c, xVar.f8408c);
            }

            public final int hashCode() {
                String str = this.f8406a;
                return this.f8408c.hashCode() + androidx.compose.foundation.H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f8407b);
            }

            @k
            public final String toString() {
                return "OpenParametersBottomSheet(title=" + this.f8406a + ", parameters=" + this.f8407b + ", consumer=" + this.f8408c + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$y;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class y implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C49325f f8409a;

            public y(@k C49325f c49325f) {
                this.f8409a = c49325f;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y) && kotlin.jvm.internal.L.f(this.f8409a, ((y) obj).f8409a);
            }

            public final int hashCode() {
                return this.f8409a.hashCode();
            }

            @k
            public final String toString() {
                return "OpenSleepingPlacesBedTypesDialog(data=" + this.f8409a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$z;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class z implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ParameterElement.J f8410a;

            public z(@k ParameterElement.J j12) {
                this.f8410a = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z) && kotlin.jvm.internal.L.f(this.f8410a, ((z) obj).f8410a);
            }

            public final int hashCode() {
                return this.f8410a.hashCode();
            }

            @k
            public final String toString() {
                return "OpenVideoPicker(videoUploadItem=" + this.f8410a + ')';
            }
        }

        /* compiled from: PublishDetailsOneTimeEvent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIe0/d$a$G;", "LIe0/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class G implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.NavigationButtonAction f8339a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CategoryPublishStep.Params.Confirmation f8340b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f8341c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final List<BeduinAction> f8342d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.ParamsToFill f8343e;

            /* JADX WARN: Multi-variable type inference failed */
            public G(@l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @k CategoryPublishStep.Params.Confirmation confirmation, @l DeepLink deepLink, @l List<? extends BeduinAction> list, @l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
                this.f8339a = navigationButtonAction;
                this.f8340b = confirmation;
                this.f8341c = deepLink;
                this.f8342d = list;
                this.f8343e = paramsToFill;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof G)) {
                    return false;
                }
                G g12 = (G) obj;
                return this.f8339a == g12.f8339a && kotlin.jvm.internal.L.f(this.f8340b, g12.f8340b) && kotlin.jvm.internal.L.f(this.f8341c, g12.f8341c) && kotlin.jvm.internal.L.f(this.f8342d, g12.f8342d) && kotlin.jvm.internal.L.f(this.f8343e, g12.f8343e);
            }

            public final int hashCode() {
                CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.f8339a;
                int iHashCode = (this.f8340b.hashCode() + ((navigationButtonAction == null ? 0 : navigationButtonAction.hashCode()) * 31)) * 31;
                DeepLink deepLink = this.f8341c;
                int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                List<BeduinAction> list = this.f8342d;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                CategoryPublishStep.Params.ParamsToFill paramsToFill = this.f8343e;
                return iHashCode3 + (paramsToFill != null ? paramsToFill.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "ShowConfirmationDialog(action=" + this.f8339a + ", confirmation=" + this.f8340b + ", deepLink=" + this.f8341c + ", beduinActions=" + this.f8342d + ", paramsToFill=" + this.f8343e + ')';
            }

            public /* synthetic */ G(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, CategoryPublishStep.Params.Confirmation confirmation, DeepLink deepLink, List list, CategoryPublishStep.Params.ParamsToFill paramsToFill, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : navigationButtonAction, confirmation, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : paramsToFill);
            }
        }
    }
}
