package com.avito.android.crm_candidates.domain;

import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.job.crm_candidates_public.generated.api.api_apply_action_v_3.JobApplicationApiBadgesV3;
import com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationApiBadgesV3;
import com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationApiBadgesV3;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmCandidatesMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-candidates_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r {

    /* compiled from: JobCrmCandidatesMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129420a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f129421b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f129422c;

        static {
            int[] iArr = new int[JobApplicationApiBadgesV3.Icon.values().length];
            try {
                iArr[JobApplicationApiBadgesV3.Icon.GreenCheckMark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f129420a = iArr;
            int[] iArr2 = new int[JobApplicationApiBadgesV3.Icon.values().length];
            try {
                iArr2[JobApplicationApiBadgesV3.Icon.GreenCheckMark.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f129421b = iArr2;
            int[] iArr3 = new int[JobApplicationApiBadgesV3.Icon.values().length];
            try {
                iArr3[JobApplicationApiBadgesV3.Icon.GreenCheckMark.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f129422c = iArr3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final DockingBadgeType.Predefined a(String str) {
        switch (str.hashCode()) {
            case -816343937:
                if (str.equals("violet")) {
                    return DockingBadgeType.Predefined.Violet;
                }
                break;
            case 112785:
                if (str.equals("red")) {
                    return DockingBadgeType.Predefined.Red;
                }
                break;
            case 3027034:
                if (str.equals("blue")) {
                    return DockingBadgeType.Predefined.Blue;
                }
                break;
            case 3181155:
                if (str.equals("gray")) {
                    return DockingBadgeType.Predefined.Gray;
                }
                break;
            case 93818879:
                if (str.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)) {
                    return DockingBadgeType.Predefined.Black;
                }
                break;
            case 98619139:
                if (str.equals("green")) {
                    return DockingBadgeType.Predefined.Green;
                }
                break;
        }
        return DockingBadgeType.Predefined.Gray;
    }

    public static final Long b(String str) {
        ZonedDateTime zonedDateTime;
        if (str == null || (zonedDateTime = ZonedDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME)) == null) {
            return null;
        }
        return Long.valueOf(zonedDateTime.toEpochSecond());
    }
}
