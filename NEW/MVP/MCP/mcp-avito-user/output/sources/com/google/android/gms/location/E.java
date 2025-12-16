package com.google.android.gms.location;

import com.google.android.gms.common.internal.C36729v;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class E implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        C36729v.j(activityTransition);
        C36729v.j(activityTransition2);
        int i12 = activityTransition.f354172b;
        int i13 = activityTransition2.f354172b;
        if (i12 != i13) {
            return i12 >= i13 ? 1 : -1;
        }
        int i14 = activityTransition.f354173c;
        int i15 = activityTransition2.f354173c;
        if (i14 == i15) {
            return 0;
        }
        return i14 < i15 ? -1 : 1;
    }
}
