package com.avito.android.hotel_booking.konveyor.text;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.hotel_booking.konveyor.text.BookingFormTextItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/text/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/text/l;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f163817b;

    /* compiled from: BookingFormTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BookingFormTextItem.Ellipsize.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BookingFormTextItem.Ellipsize ellipsize = BookingFormTextItem.Ellipsize.f163788b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BookingFormTextItem.Ellipsize ellipsize2 = BookingFormTextItem.Ellipsize.f163788b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BookingFormTextItem.Ellipsize ellipsize3 = BookingFormTextItem.Ellipsize.f163788b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(@Y61.k View view, @Y61.k BookingFormTextItem.Ellipsize ellipsize) {
        TextUtils.TruncateAt truncateAt;
        super(view);
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f163817b = textView;
        int iOrdinal = ellipsize.ordinal();
        if (iOrdinal == 0) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (iOrdinal == 1) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (iOrdinal == 2) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            truncateAt = null;
        }
        textView.setEllipsize(truncateAt);
    }

    @Override // com.avito.android.hotel_booking.konveyor.text.l
    public final void F(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f163817b, attributedText, null);
    }

    @Override // com.avito.android.hotel_booking.konveyor.text.l
    public final void X(@Y61.k Y41.a<G0> aVar) {
        D6.a(aVar, this.f163817b);
    }

    @Override // com.avito.android.hotel_booking.konveyor.text.l
    public final void u3(int i12) {
        boolean z12 = i12 == 1;
        TextView textView = this.f163817b;
        textView.setSingleLine(z12);
        textView.setMaxLines(i12);
    }
}
