package ru.cyberity.cbr.core.common;

import android.app.Activity;
import android.content.res.TypedArray;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: ActivityExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/app/Activity;", "", "resId", "a", "(Landroid/app/Activity;I)I", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: ru.cyberity.cbr.core.common.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47845a {
    public static final int a(@Y61.k Activity activity, @InterfaceC42150f int i12) {
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{i12});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
