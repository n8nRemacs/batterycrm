package com.avito.android.advert_core.feature_teasers.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.avito.android.R;
import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFeatureTeaserItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: AdvertDetailsFeatureTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.feature_teasers.common.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2477a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83613a;

        static {
            int[] iArr = new int[AdvertDetailsFeatureTeaserItem.Icon.values().length];
            try {
                AdvertDetailsFeatureTeaserItem.Icon icon = AdvertDetailsFeatureTeaserItem.Icon.f83607b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertDetailsFeatureTeaserItem.Icon icon2 = AdvertDetailsFeatureTeaserItem.Icon.f83607b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdvertDetailsFeatureTeaserItem.Icon icon3 = AdvertDetailsFeatureTeaserItem.Icon.f83607b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f83613a = iArr;
        }
    }

    @Y61.l
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public static final Drawable a(@Y61.l AdvertDetailsFeatureTeaserItem.Icon icon, @Y61.k Context context) {
        Drawable drawable;
        int i12 = icon == null ? -1 : C2477a.f83613a[icon.ordinal()];
        if (i12 == 1) {
            return context.getDrawable(R.drawable.ic_shield_24);
        }
        if (i12 != 2) {
            if (i12 != 3 || (drawable = context.getDrawable(R.drawable.ic_status_lock)) == null) {
                return null;
            }
            V0.d(drawable, C35835l0.d(R.attr.gray28, context));
            return new InsetDrawable(drawable, 0, y6.b(3), 0, 0);
        }
        Drawable drawable2 = context.getDrawable(R.drawable.ic_checkmark_20);
        if (drawable2 == null) {
            return null;
        }
        V0.d(drawable2, C35835l0.d(R.attr.green, context));
        return drawable2;
    }
}
