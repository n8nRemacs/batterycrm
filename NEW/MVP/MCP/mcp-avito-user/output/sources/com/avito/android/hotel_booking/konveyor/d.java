package com.avito.android.hotel_booking.konveyor;

import com.avito.android.hotel.model.EllipsizeType;
import com.avito.android.hotel.model.HotelBookingInputType;
import com.avito.android.hotel.model.HotelLoanTerm;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_payment_methods.model.LoanTerm;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelBookingItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/d;", "Lcom/avito/android/hotel_booking/konveyor/c;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* compiled from: HotelBookingItemsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163646a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f163647b;

        static {
            int[] iArr = new int[EllipsizeType.values().length];
            try {
                iArr[EllipsizeType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EllipsizeType.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EllipsizeType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f163646a = iArr;
            int[] iArr2 = new int[HotelBookingInputType.values().length];
            try {
                iArr2[HotelBookingInputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HotelBookingInputType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HotelBookingInputType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f163647b = iArr2;
        }
    }

    @Inject
    public d() {
    }

    public static LoanTerm.Progress.ProgressBlock b(HotelLoanTerm.Block block) {
        AttributedText title = block.getTitle();
        return new LoanTerm.Progress.ProgressBlock(block.getBlockWidth() != null ? Long.valueOf(r0.intValue()) : null, block.getDashColor(), block.getDashCount(), Long.valueOf(block.getDashSpacing()), block.getSubtitle(), Long.valueOf(block.getTextMarginTop()), title);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    @Override // com.avito.android.hotel_booking.konveyor.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.util.List r31) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.konveyor.d.a(java.util.List):java.util.ArrayList");
    }
}
