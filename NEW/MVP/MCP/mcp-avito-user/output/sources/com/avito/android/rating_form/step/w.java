package com.avito.android.rating_form.step;

import com.avito.android.R;
import com.avito.android.rating_form.api.remote.model.ButtonStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingFormStepUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_rating-form_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w {

    /* compiled from: RatingFormStepUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f249762a;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f249762a = iArr;
        }
    }

    public static final int a(@Y61.l ButtonStyle buttonStyle) {
        int i12 = buttonStyle == null ? -1 : a.f249762a[buttonStyle.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                return R.attr.buttonSecondaryLarge;
            }
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return R.attr.buttonPrimaryLarge;
    }
}
