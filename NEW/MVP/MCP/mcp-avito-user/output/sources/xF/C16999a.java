package Xf;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.remote.model.teaser.TeaserIcon;
import com.avito.android.remote.model.teaser.TeaserStatus;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* compiled from: AutotekaTeaserHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXf/a;", "", "<init>", "()V", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16999a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C16999a f18998a = new C16999a();

    /* compiled from: AutotekaTeaserHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xf.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1343a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18999a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19000b;

        static {
            int[] iArr = new int[TeaserIcon.values().length];
            try {
                iArr[TeaserIcon.JOBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TeaserIcon.PERSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TeaserIcon.ACCIDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TeaserIcon.GRAPH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TeaserIcon.SELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TeaserIcon.SHIELD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TeaserIcon.COURT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TeaserIcon.MILEAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TeaserIcon.TAXI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f18999a = iArr;
            int[] iArr2 = new int[TeaserStatus.values().length];
            try {
                iArr2[TeaserStatus.f253941Ok.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TeaserStatus.Locked.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f19000b = iArr2;
        }
    }

    @InterfaceC42165v
    @l
    public static Integer a(@l TeaserIcon teaserIcon) {
        switch (teaserIcon == null ? -1 : C1343a.f18999a[teaserIcon.ordinal()]) {
            case 1:
                return Integer.valueOf(R.drawable.common_ic_wrench_20);
            case 2:
                return Integer.valueOf(R.drawable.common_ic_person_20);
            case 3:
                return Integer.valueOf(R.drawable.common_ic_accident_20);
            case 4:
                return Integer.valueOf(R.drawable.common_ic_diagram_20);
            case 5:
                return Integer.valueOf(R.drawable.common_ic_sell_20);
            case 6:
                return Integer.valueOf(R.drawable.common_ic_shield_20);
            case 7:
                return Integer.valueOf(R.drawable.common_ic_court_20);
            case 8:
                return Integer.valueOf(R.drawable.common_ic_mileage_20);
            case 9:
                return Integer.valueOf(R.drawable.common_ic_taxi_20);
            default:
                return null;
        }
    }

    @InterfaceC42165v
    @l
    public static Integer b(@k TeaserStatus teaserStatus) {
        int i12 = C1343a.f19000b[teaserStatus.ordinal()];
        if (i12 == 1) {
            return Integer.valueOf(R.drawable.common_ic_check_thin_20);
        }
        if (i12 != 2) {
            return null;
        }
        return Integer.valueOf(R.drawable.common_ic_lock_20);
    }
}
