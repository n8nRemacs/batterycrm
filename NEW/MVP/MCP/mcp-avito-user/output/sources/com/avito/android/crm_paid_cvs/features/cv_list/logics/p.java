package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import ct.C39410a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CvListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-paid-cvs_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p {

    /* compiled from: CvListReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CvListState.Tab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CvListState.Tab tab = CvListState.Tab.f130509c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CvListState.Tab tab2 = CvListState.Tab.f130509c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final CvListState a(CvListState cvListState) {
        ArrayList arrayList = new ArrayList(cvListState.f130496d);
        arrayList.add(C39410a.a(false));
        G0 g02 = G0.f406611a;
        return CvListState.a(cvListState, null, null, arrayList, null, null, null, null, null, null, 507);
    }
}
