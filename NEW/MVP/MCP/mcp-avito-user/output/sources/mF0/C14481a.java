package Mf0;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LimitsInfoAnalytics.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish-limits-info_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14481a {

    /* compiled from: LimitsInfoAnalytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mf0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0695a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10981a;

        static {
            int[] iArr = new int[LimitsInfo.Progress.Style.values().length];
            try {
                iArr[LimitsInfo.Progress.Style.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LimitsInfo.Progress.Style.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10981a = iArr;
        }
    }

    @k
    public static final String a(@k LimitsInfo limitsInfo) {
        LimitsInfo.Progress progress = limitsInfo.getProgress();
        if (progress == null) {
            return "absent";
        }
        if (progress.getValue() == 0.0f) {
            return "empty";
        }
        int i12 = C0695a.f10981a[progress.getStyle().ordinal()];
        if (i12 == 1) {
            return Constants.NORMAL;
        }
        if (i12 == 2) {
            return ConstraintKt.WARNING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
