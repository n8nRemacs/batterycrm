package com.avito.android.photo_gallery.autoteka_teaser;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AutotekaExtensions.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/a;", "", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f216807a = new a();

    @Y61.k
    public static Q a(@Y61.k v vVar) {
        int measuredWidth;
        int iRound;
        ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
        int i12 = layoutParams.height;
        boolean z12 = false;
        boolean z13 = (i12 == -1 || i12 == -2) ? false : true;
        int i13 = layoutParams.width;
        if (i13 != -1 && i13 != -2) {
            z12 = true;
        }
        if (z13 && z12) {
            measuredWidth = vVar.getMeasuredWidth();
            iRound = vVar.getMeasuredHeight();
        } else if (z13) {
            iRound = vVar.getMeasuredHeight();
            measuredWidth = layoutParams.width;
        } else {
            measuredWidth = vVar.getMeasuredWidth();
            iRound = Math.round(measuredWidth * 0.75f);
        }
        return new Q(Integer.valueOf(measuredWidth), Integer.valueOf(iRound));
    }
}
