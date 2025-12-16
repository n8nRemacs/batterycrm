package com.avito.android.gig_slot_show_qr.mvi;

import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotShowQrState.kt */
@H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/o;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/gig_slot_show_qr/mvi/o$a;", "Lcom/avito/android/gig_slot_show_qr/mvi/o$b;", "Lcom/avito/android/gig_slot_show_qr/mvi/o$c;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class o {

    /* compiled from: GigSlotShowQrState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/o$a;", "Lcom/avito/android/gig_slot_show_qr/mvi/o;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f160911a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f160912b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<AttributedText> f160913c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f160914d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final DeepLink f160915e;

        public a(@Y61.l AttributedText attributedText, @Y61.k String str, @Y61.k List list, @Y61.k DeepLink deepLink, @Y61.k String str2) {
            super(null);
            this.f160911a = str;
            this.f160912b = str2;
            this.f160913c = list;
            this.f160914d = attributedText;
            this.f160915e = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f160911a, aVar.f160911a) && L.f(this.f160912b, aVar.f160912b) && L.f(this.f160913c, aVar.f160913c) && L.f(this.f160914d, aVar.f160914d) && L.f(this.f160915e, aVar.f160915e);
        }

        public final int hashCode() {
            int iE2 = H.e(H.d(this.f160911a.hashCode() * 31, 31, this.f160912b), 31, this.f160913c);
            AttributedText attributedText = this.f160914d;
            return this.f160915e.hashCode() + ((iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(title=");
            sb2.append(this.f160911a);
            sb2.append(", qr=");
            sb2.append(this.f160912b);
            sb2.append(", stepInstructions=");
            sb2.append(this.f160913c);
            sb2.append(", info=");
            sb2.append(this.f160914d);
            sb2.append(", supportDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f160915e, ')');
        }
    }

    /* compiled from: GigSlotShowQrState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/o$b;", "Lcom/avito/android/gig_slot_show_qr/mvi/o;", "<init>", "()V", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f160916a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -626747585;
        }

        @Y61.k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: GigSlotShowQrState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/o$c;", "Lcom/avito/android/gig_slot_show_qr/mvi/o;", "<init>", "()V", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f160917a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 806630579;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ o(C42822w c42822w) {
        this();
    }

    public o() {
    }
}
