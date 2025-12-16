package QJ0;

import Y61.l;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.DATE_TYPE;
import kotlin.Metadata;

/* compiled from: TabStatsViewModel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {
    @l
    public static final String a(@l StatsConfig statsConfig, boolean z12) {
        long jLongValue = ((statsConfig != null ? statsConfig.f317152b : null) != null ? statsConfig.f317153c - statsConfig.f317152b.longValue() : 0L) / 86400000;
        if (!z12) {
            return null;
        }
        if (jLongValue < 62) {
            DATE_TYPE[] date_typeArr = DATE_TYPE.f317801b;
            return SelectionType.TYPE_DAY;
        }
        if (jLongValue < 218) {
            DATE_TYPE[] date_typeArr2 = DATE_TYPE.f317801b;
            return "week";
        }
        DATE_TYPE[] date_typeArr3 = DATE_TYPE.f317801b;
        return SelectionType.TYPE_MONTH;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final fW0.p b(@Y61.l com.avito.android.user_stats.extended_user_stats.StatsConfig r18, boolean r19) {
        /*
            r0 = r18
            r1 = 0
            if (r0 == 0) goto L8
            java.lang.Long r2 = r0.f317152b
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 == 0) goto L1e
            java.util.Date r2 = new java.util.Date
            java.lang.Long r3 = r0.f317152b
            long r3 = r3.longValue()
            r2.<init>(r3)
            java.util.Date r3 = new java.util.Date
            long r4 = r0.f317153c
            r3.<init>(r4)
            goto L20
        L1e:
            r2 = r1
            r3 = r2
        L20:
            if (r19 == 0) goto L41
            if (r2 != 0) goto L41
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r3 = 6
            r4 = -29
            r2.add(r3, r4)
            java.util.Date r3 = new java.util.Date
            long r4 = r2.getTimeInMillis()
            r3.<init>(r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            r17 = r3
            r3 = r2
            r2 = r17
        L41:
            java.lang.String r4 = "yyyy-MM-dd'T'HH:mm:ssZZZZZ"
            if (r2 == 0) goto L54
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.util.Locale r6 = java.util.Locale.getDefault()
            r5.<init>(r4, r6)
            java.lang.String r5 = r5.format(r2)
            r7 = r5
            goto L55
        L54:
            r7 = r1
        L55:
            if (r2 == 0) goto L7a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L7a
            long r2 = r3.getTime()
            r5 = 86399000(0x5265818, float:7.821463E-36)
            long r5 = (long) r5
            long r2 = r2 + r5
            java.util.Date r5 = new java.util.Date
            r5.<init>(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = java.util.Locale.getDefault()
            r2.<init>(r4, r3)
            java.lang.String r2 = r2.format(r5)
        L78:
            r8 = r2
            goto L8b
        L7a:
            if (r3 == 0) goto L8a
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r5 = java.util.Locale.getDefault()
            r2.<init>(r4, r5)
            java.lang.String r2 = r2.format(r3)
            goto L78
        L8a:
            r8 = r1
        L8b:
            java.lang.String r9 = a(r18, r19)
            if (r0 == 0) goto L95
            java.util.List<java.lang.String> r2 = r0.f317155e
            r10 = r2
            goto L96
        L95:
            r10 = r1
        L96:
            if (r0 == 0) goto L9c
            java.util.List<java.lang.String> r2 = r0.f317154d
            r13 = r2
            goto L9d
        L9c:
            r13 = r1
        L9d:
            if (r0 == 0) goto La3
            java.util.List<java.lang.String> r2 = r0.f317156f
            r11 = r2
            goto La4
        La3:
            r11 = r1
        La4:
            if (r0 == 0) goto Laa
            java.util.List<java.lang.String> r2 = r0.f317157g
            r12 = r2
            goto Lab
        Laa:
            r12 = r1
        Lab:
            if (r0 == 0) goto Lb1
            java.util.List<java.lang.String> r2 = r0.f317158h
            r14 = r2
            goto Lb2
        Lb1:
            r14 = r1
        Lb2:
            if (r0 == 0) goto Lb9
            java.util.List<java.lang.String> r2 = r0.f317160j
            r16 = r2
            goto Lbb
        Lb9:
            r16 = r1
        Lbb:
            if (r0 == 0) goto Lbf
            java.util.List<java.lang.String> r1 = r0.f317159i
        Lbf:
            r15 = r1
            fW0.p r0 = new fW0.p
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ0.e.b(com.avito.android.user_stats.extended_user_stats.StatsConfig, boolean):fW0.p");
    }
}
