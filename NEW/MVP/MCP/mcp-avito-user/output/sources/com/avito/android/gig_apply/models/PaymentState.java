package com.avito.android.gig_apply.models;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/models/PaymentState;", "", "IconType", "Status", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentState {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f159697a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f159698b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f159699c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f159700d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final IconType f159701e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f159702f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f159703g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Status f159704h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GigSlotState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/models/PaymentState$IconType;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconType {

        /* renamed from: b, reason: collision with root package name */
        public static final IconType f159705b;

        /* renamed from: c, reason: collision with root package name */
        public static final IconType f159706c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ IconType[] f159707d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f159708e;

        static {
            IconType iconType = new IconType("SBP", 0);
            f159705b = iconType;
            IconType iconType2 = new IconType("CARD", 1);
            f159706c = iconType2;
            IconType[] iconTypeArr = {iconType, iconType2};
            f159707d = iconTypeArr;
            f159708e = c.a(iconTypeArr);
        }

        public IconType() {
            throw null;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) f159707d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GigSlotState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/models/PaymentState$Status;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f159709b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f159710c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Status[] f159711d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f159712e;

        static {
            Status status = new Status("DEFAULT", 0);
            f159709b = status;
            Status status2 = new Status("FAILED", 1);
            f159710c = status2;
            Status[] statusArr = {status, status2};
            f159711d = statusArr;
            f159712e = c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f159711d.clone();
        }
    }

    public PaymentState(@k String str, @l AttributedText attributedText, @l String str2, @l DeepLink deepLink, @l IconType iconType, @l String str3, @l String str4, @l Status status) {
        this.f159697a = str;
        this.f159698b = attributedText;
        this.f159699c = str2;
        this.f159700d = deepLink;
        this.f159701e = iconType;
        this.f159702f = str3;
        this.f159703g = str4;
        this.f159704h = status;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentState)) {
            return false;
        }
        PaymentState paymentState = (PaymentState) obj;
        return L.f(this.f159697a, paymentState.f159697a) && L.f(this.f159698b, paymentState.f159698b) && L.f(this.f159699c, paymentState.f159699c) && L.f(this.f159700d, paymentState.f159700d) && this.f159701e == paymentState.f159701e && L.f(this.f159702f, paymentState.f159702f) && L.f(this.f159703g, paymentState.f159703g) && this.f159704h == paymentState.f159704h;
    }

    public final int hashCode() {
        int iHashCode = this.f159697a.hashCode() * 31;
        AttributedText attributedText = this.f159698b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f159699c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f159700d;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        IconType iconType = this.f159701e;
        int iHashCode5 = (iHashCode4 + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str2 = this.f159702f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f159703g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Status status = this.f159704h;
        return iHashCode7 + (status != null ? status.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PaymentState(title=" + this.f159697a + ", attributedSubtitle=" + this.f159698b + ", subtitle=" + this.f159699c + ", deeplink=" + this.f159700d + ", iconType=" + this.f159701e + ", iconUrl=" + this.f159702f + ", trailingText=" + this.f159703g + ", status=" + this.f159704h + ')';
    }
}
