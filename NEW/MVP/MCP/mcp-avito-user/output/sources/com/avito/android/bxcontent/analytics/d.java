package com.avito.android.bxcontent.analytics;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.UserTypeCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BxContentAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_serp_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* compiled from: BxContentAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109485a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.SERP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f109485a = iArr;
        }
    }

    public static final String a(List list) {
        List list2 = list;
        return (list2 == null || list2.isEmpty()) ? "0" : L.f(C42745f0.G(list), UserTypeCode.PRIVATE) ? "1" : "2";
    }

    public static final String b(PresentationType presentationType) {
        int i12 = presentationType == null ? -1 : a.f109485a[presentationType.ordinal()];
        return i12 != 1 ? i12 != 2 ? (i12 == 3 || i12 == 4 || i12 == 5) ? "SERP" : "BX_CONTENT" : "MAIN" : "SERP";
    }
}
