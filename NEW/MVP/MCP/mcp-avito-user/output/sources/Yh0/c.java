package Yh0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import com.avito.android.R;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import u0.i;

/* compiled from: LotSortingType.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* compiled from: LotSortingType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LotSortingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LotSortingType.a aVar = LotSortingType.f251215b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LotSortingType.a aVar2 = LotSortingType.f251215b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @InterfaceC22132o
    @k
    public static final String a(@k LotSortingType lotSortingType, @l A a12) {
        String strC;
        a12.C(1011130366);
        int iOrdinal = lotSortingType.ordinal();
        if (iOrdinal == 0) {
            a12.C(1901698494);
            strC = i.c(a12, R.string.realty_agency_checkerboard_lots_list_sort_by_price_asc);
            a12.h();
        } else if (iOrdinal == 1) {
            a12.C(1901702495);
            strC = i.c(a12, R.string.realty_agency_checkerboard_lots_list_sort_by_price_desc);
            a12.h();
        } else {
            if (iOrdinal != 2) {
                a12.C(1901674031);
                a12.h();
                throw new NoWhenBranchMatchedException();
            }
            a12.C(1901706791);
            strC = i.c(a12, R.string.realty_agency_checkerboard_lots_list_sort_by_completion_quarter);
            a12.h();
        }
        a12.h();
        return strC;
    }
}
