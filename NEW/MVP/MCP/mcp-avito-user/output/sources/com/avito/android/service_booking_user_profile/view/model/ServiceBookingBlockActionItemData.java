package com.avito.android.service_booking_user_profile.view.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingBlockData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/model/ServiceBookingBlockActionItemData;", "", "Type", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingBlockActionItemData {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Image f278191a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f278192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f278193c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f278194d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f278195e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Type f278196f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingBlockData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/model/ServiceBookingBlockActionItemData$Type;", "", "a", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f278197c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f278198d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f278199e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278200f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278201b;

        /* compiled from: ServiceBookingBlockData.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/model/ServiceBookingBlockActionItemData$Type$a;", "", "<init>", "()V", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Type type = new Type("LISTING", 0, "listing");
            f278198d = type;
            Type[] typeArr = {type, new Type("REMINDER", 1, "reminder")};
            f278199e = typeArr;
            f278200f = c.a(typeArr);
            f278197c = new a(null);
        }

        public Type(String str, int i12, String str2) {
            this.f278201b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f278199e.clone();
        }
    }

    public ServiceBookingBlockActionItemData(@l Image image, @k DeepLink deepLink, @k String str, @k String str2, @l AttributedText attributedText, @k Type type) {
        this.f278191a = image;
        this.f278192b = deepLink;
        this.f278193c = str;
        this.f278194d = str2;
        this.f278195e = attributedText;
        this.f278196f = type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBlockActionItemData)) {
            return false;
        }
        ServiceBookingBlockActionItemData serviceBookingBlockActionItemData = (ServiceBookingBlockActionItemData) obj;
        return L.f(this.f278191a, serviceBookingBlockActionItemData.f278191a) && L.f(this.f278192b, serviceBookingBlockActionItemData.f278192b) && L.f(this.f278193c, serviceBookingBlockActionItemData.f278193c) && L.f(this.f278194d, serviceBookingBlockActionItemData.f278194d) && L.f(this.f278195e, serviceBookingBlockActionItemData.f278195e) && this.f278196f == serviceBookingBlockActionItemData.f278196f;
    }

    public final int hashCode() {
        Image image = this.f278191a;
        int iD2 = H.d(H.d(a.e(this.f278192b, (image == null ? 0 : image.hashCode()) * 31, 31), 31, this.f278193c), 31, this.f278194d);
        AttributedText attributedText = this.f278195e;
        return this.f278196f.hashCode() + ((iD2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ServiceBookingBlockActionItemData(image=" + this.f278191a + ", deepLink=" + this.f278192b + ", title=" + this.f278193c + ", subtitle=" + this.f278194d + ", additionalText=" + this.f278195e + ", type=" + this.f278196f + ')';
    }
}
