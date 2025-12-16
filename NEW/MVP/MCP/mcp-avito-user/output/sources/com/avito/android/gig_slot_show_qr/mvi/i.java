package com.avito.android.gig_slot_show_qr.mvi;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotShowQrInternalAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/i;", "", "a", "b", "c", "d", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface i {

    /* compiled from: GigSlotShowQrInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/i$a;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f160900a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<AttributedText> f160901b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f160902c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final DeepLink f160903d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f160904e;

        public a(@Y61.l AttributedText attributedText, @Y61.k String str, @Y61.k List list, @Y61.k DeepLink deepLink, @Y61.k String str2) {
            this.f160900a = str;
            this.f160901b = list;
            this.f160902c = str2;
            this.f160903d = deepLink;
            this.f160904e = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f160900a, aVar.f160900a) && L.f(this.f160901b, aVar.f160901b) && L.f(this.f160902c, aVar.f160902c) && L.f(this.f160903d, aVar.f160903d) && L.f(this.f160904e, aVar.f160904e);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f160903d, H.d(H.e(this.f160900a.hashCode() * 31, 31, this.f160901b), 31, this.f160902c), 31);
            AttributedText attributedText = this.f160904e;
            return iE2 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f160900a);
            sb2.append(", stepInstructions=");
            sb2.append(this.f160901b);
            sb2.append(", qr=");
            sb2.append(this.f160902c);
            sb2.append(", supportDeepLink=");
            sb2.append(this.f160903d);
            sb2.append(", info=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f160904e, ')');
        }
    }

    /* compiled from: GigSlotShowQrInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/i$b;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "<init>", "()V", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f160905a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1314516711;
        }

        @Y61.k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: GigSlotShowQrInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/i$c;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "<init>", "()V", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f160906a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1285464077;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: GigSlotShowQrInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/i$d;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f160907a;

        public d(@Y61.k DeepLink deepLink) {
            this.f160907a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f160907a, ((d) obj).f160907a);
        }

        public final int hashCode() {
            return this.f160907a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenSupportScreen(deeplink="), this.f160907a, ')');
        }
    }
}
