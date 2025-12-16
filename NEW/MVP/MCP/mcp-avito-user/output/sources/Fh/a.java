package FH;

import Y61.k;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.gig_shift_start.ui.GigShiftStartType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GigStartShiftAnalyticsSender.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFH/a;", "", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f4653a;

    /* compiled from: GigStartShiftAnalyticsSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: FH.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0287a {
        static {
            int[] iArr = new int[GigShiftStartType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<GigShiftStartType> creator = GigShiftStartType.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public a(@k InterfaceC28373a interfaceC28373a) {
        this.f4653a = interfaceC28373a;
    }

    public static int a(GigShiftStartType gigShiftStartType) {
        int iOrdinal = gigShiftStartType.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
