package com.avito.android.candy;

import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResourcesCarImageSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/candy/u;", "", "<init>", "()V", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u {
    @Inject
    public u() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Integer a(String str, boolean z12) {
        switch (str.hashCode()) {
            case -1444946964:
                if (str.equals("hatchback3")) {
                    return Integer.valueOf(z12 ? R.drawable.hatchback3_checked : R.drawable.hatchback3_default);
                }
                return null;
            case -1444946962:
                if (str.equals("hatchback5")) {
                    return Integer.valueOf(z12 ? R.drawable.hatchback5_checked : R.drawable.hatchback5_default);
                }
                return null;
            case -1150300473:
                if (str.equals("cabriolet")) {
                    return Integer.valueOf(z12 ? R.drawable.cabriolet_checked : R.drawable.cabriolet_default);
                }
                return null;
            case -988476804:
                if (str.equals("pickup")) {
                    return Integer.valueOf(z12 ? R.drawable.pickup_checked : R.drawable.pickup_default);
                }
                return null;
            case 116515:
                if (str.equals("van")) {
                    return Integer.valueOf(z12 ? R.drawable.van_checked : R.drawable.van_default);
                }
                return null;
            case 3542111:
                if (str.equals("suv3")) {
                    return Integer.valueOf(z12 ? R.drawable.suv3_checked : R.drawable.suv3_default);
                }
                return null;
            case 3542113:
                if (str.equals("suv5")) {
                    return Integer.valueOf(z12 ? R.drawable.suv5_checked : R.drawable.suv5_default);
                }
                return null;
            case 94851390:
                if (str.equals("coupe")) {
                    return Integer.valueOf(z12 ? R.drawable.coupe_checked : R.drawable.coupe_default);
                }
                return null;
            case 109313023:
                if (str.equals("sedan")) {
                    return Integer.valueOf(z12 ? R.drawable.sedan_checked : R.drawable.sedan_default);
                }
                return null;
            case 112891260:
                if (str.equals("wagon")) {
                    return Integer.valueOf(z12 ? R.drawable.wagon_checked : R.drawable.wagon_default);
                }
                return null;
            case 973878898:
                if (str.equals("liftback")) {
                    return Integer.valueOf(z12 ? R.drawable.liftback_checked : R.drawable.liftback_default);
                }
                return null;
            case 1064527561:
                if (str.equals("minibus")) {
                    return Integer.valueOf(z12 ? R.drawable.minibus_checked : R.drawable.minibus_default);
                }
                return null;
            case 1064546156:
                if (str.equals("minivan")) {
                    return Integer.valueOf(z12 ? R.drawable.minivan_checked : R.drawable.minivan_default);
                }
                return null;
            default:
                return null;
        }
    }
}
