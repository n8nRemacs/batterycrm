package ht;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: DtoMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-paid-cvs_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ht.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40981c {

    /* compiled from: DtoMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ht.c$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FilterItem.FilterType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FilterItem.FilterType filterType = FilterItem.FilterType.f130361b;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final Q<Long, Long> a(long j12) {
        LocalDate localDateNow = LocalDate.now();
        long j13 = 1000;
        return new Q<>(Long.valueOf(ZonedDateTime.of(localDateNow.minusDays(j12 - 1).atStartOfDay(), ZoneId.systemDefault()).toInstant().toEpochMilli() / j13), Long.valueOf(ZonedDateTime.of(localDateNow.plusDays(1L).atStartOfDay(), ZoneId.systemDefault()).toInstant().toEpochMilli() / j13));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @k
    public static final CvStatus b(@l String str) {
        int i12;
        int i13;
        String str2 = str == null ? "" : str;
        int i14 = 0;
        if (str != null) {
            int iHashCode = str.hashCode();
            i12 = R.string.paid_cvs_status_pending;
            switch (iHashCode) {
                case -682587753:
                    str.equals("pending");
                    break;
                case 108960:
                    if (str.equals("new")) {
                        i12 = R.string.paid_cvs_status_new;
                        break;
                    }
                    break;
                case 568196142:
                    if (str.equals("declined")) {
                        i12 = R.string.paid_cvs_status_declined;
                        break;
                    }
                    break;
                case 1185244855:
                    if (str.equals("approved")) {
                        i12 = R.string.paid_cvs_status_approved;
                        break;
                    }
                    break;
            }
        } else {
            i12 = 0;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -682587753:
                    str.equals("pending");
                    i14 = R.color.common_blue_700;
                    break;
                case 108960:
                    if (str.equals("new")) {
                        i13 = R.color.common_orange_700;
                        i14 = i13;
                        break;
                    }
                    i14 = R.color.common_blue_700;
                    break;
                case 568196142:
                    if (str.equals("declined")) {
                        i13 = R.color.common_red_600;
                        i14 = i13;
                        break;
                    }
                    i14 = R.color.common_blue_700;
                    break;
                case 1185244855:
                    if (str.equals("approved")) {
                        i13 = R.color.common_green_800;
                        i14 = i13;
                        break;
                    }
                    i14 = R.color.common_blue_700;
                    break;
                default:
                    i14 = R.color.common_blue_700;
                    break;
            }
        }
        return new CvStatus(str2, i12, i14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final FilterItem.FilterType c(String str) {
        switch (str.hashCode()) {
            case -906021636:
                if (str.equals("select")) {
                    return FilterItem.FilterType.f130363d;
                }
                return null;
            case -85276959:
                if (str.equals("switcher")) {
                    return FilterItem.FilterType.f130361b;
                }
                return null;
            case 94631335:
                if (str.equals("chips")) {
                    return FilterItem.FilterType.f130366g;
                }
                return null;
            case 570418373:
                if (str.equals("interval")) {
                    return FilterItem.FilterType.f130365f;
                }
                return null;
            case 642087797:
                if (str.equals("multiselect")) {
                    return FilterItem.FilterType.f130364e;
                }
                return null;
            case 1793702779:
                if (str.equals("datetime")) {
                    return FilterItem.FilterType.f130362c;
                }
                return null;
            default:
                return null;
        }
    }
}
