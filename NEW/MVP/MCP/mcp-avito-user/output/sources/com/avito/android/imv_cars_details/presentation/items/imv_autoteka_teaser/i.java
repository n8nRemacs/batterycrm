package com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.teaser.TeaserIcon;
import com.avito.android.remote.model.teaser.TeaserStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsTeaserInsightView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/i;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImageView f170097a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f170098b;

    /* compiled from: ImvCarsDetailsTeaserInsightView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170099a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f170100b;

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
            f170099a = iArr;
            int[] iArr2 = new int[TeaserStatus.values().length];
            try {
                iArr2[TeaserStatus.f253941Ok.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TeaserStatus.Locked.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f170100b = iArr2;
        }
    }

    public i(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f170097a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170098b = (TextView) viewFindViewById2;
    }
}
