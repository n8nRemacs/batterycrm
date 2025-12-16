package com.avito.android.extended_profile_map.bottom_sheet;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.extended_profile_map.ExtendedProfileAddress;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileAddressBottomSheetDataConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/bottom_sheet/i;", "Lcom/avito/android/extended_profile_map/bottom_sheet/h;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f151214a;

    @Inject
    public i(@Y61.k Resources resources) {
        this.f151214a = resources;
    }

    public static String c(int i12) {
        return String.format((i12 / 60) + ":%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12 % 60)}, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x017d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    @Override // com.avito.android.extended_profile_map.bottom_sheet.h
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.extended_profile_map.bottom_sheet.g a(@Y61.k com.avito.android.extended_profile_map.ExtendedProfileAddress r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_map.bottom_sheet.i.a(com.avito.android.extended_profile_map.ExtendedProfileAddress):com.avito.android.extended_profile_map.bottom_sheet.g");
    }

    public final String b(ExtendedProfileAddress.TimeInterval timeInterval) {
        if (timeInterval.f151151d) {
            return this.f151214a.getString(R.string.address_around_the_clock);
        }
        return c(timeInterval.f151149b) + " – " + c(timeInterval.f151150c);
    }
}
