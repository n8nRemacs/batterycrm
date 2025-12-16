package com.avito.android.hotel_booking.konveyor.text;

import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormTextItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/text/BookingFormTextItem;", "Lcom/avito/conveyor_item/a;", "Ellipsize", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BookingFormTextItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f163783b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f163784c;

    /* renamed from: d, reason: collision with root package name */
    public final int f163785d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Ellipsize f163786e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public DeepLink f163787f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BookingFormTextItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/text/BookingFormTextItem$Ellipsize;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ellipsize {

        /* renamed from: b, reason: collision with root package name */
        public static final Ellipsize f163788b;

        /* renamed from: c, reason: collision with root package name */
        public static final Ellipsize f163789c;

        /* renamed from: d, reason: collision with root package name */
        public static final Ellipsize f163790d;

        /* renamed from: e, reason: collision with root package name */
        public static final Ellipsize f163791e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Ellipsize[] f163792f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f163793g;

        static {
            Ellipsize ellipsize = new Ellipsize("START", 0);
            f163788b = ellipsize;
            Ellipsize ellipsize2 = new Ellipsize("MIDDLE", 1);
            f163789c = ellipsize2;
            Ellipsize ellipsize3 = new Ellipsize("END", 2);
            f163790d = ellipsize3;
            Ellipsize ellipsize4 = new Ellipsize("NONE", 3);
            f163791e = ellipsize4;
            Ellipsize[] ellipsizeArr = {ellipsize, ellipsize2, ellipsize3, ellipsize4};
            f163792f = ellipsizeArr;
            f163793g = kotlin.enums.c.a(ellipsizeArr);
        }

        public Ellipsize() {
            throw null;
        }

        public static Ellipsize valueOf(String str) {
            return (Ellipsize) Enum.valueOf(Ellipsize.class, str);
        }

        public static Ellipsize[] values() {
            return (Ellipsize[]) f163792f.clone();
        }
    }

    public BookingFormTextItem(@Y61.l String str, @Y61.l AttributedText attributedText, int i12, @Y61.k Ellipsize ellipsize) {
        this.f163783b = str;
        this.f163784c = attributedText;
        this.f163785d = i12;
        this.f163786e = ellipsize;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingFormTextItem)) {
            return false;
        }
        BookingFormTextItem bookingFormTextItem = (BookingFormTextItem) obj;
        bookingFormTextItem.getClass();
        return L.f(this.f163783b, bookingFormTextItem.f163783b) && L.f(this.f163784c, bookingFormTextItem.f163784c) && this.f163785d == bookingFormTextItem.f163785d && this.f163786e == bookingFormTextItem.f163786e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76078b() {
        return -877021400;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF76079c() {
        return "textId";
    }

    public final int hashCode() {
        String str = this.f163783b;
        int iHashCode = ((-1417859624) + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f163784c;
        return this.f163786e.hashCode() + r.e(this.f163785d, (iHashCode + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "BookingFormTextItem(stringId=textId, parameterId=" + this.f163783b + ", text=" + this.f163784c + ", maxLines=" + this.f163785d + ", ellipsize=" + this.f163786e + ')';
    }
}
