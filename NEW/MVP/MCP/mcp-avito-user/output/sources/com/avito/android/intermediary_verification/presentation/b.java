package com.avito.android.intermediary_verification.presentation;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IntermediaryVerificationBenefitView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/b;", "Lcom/avito/android/intermediary_verification/presentation/a;", "a", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.intermediary_verification.presentation.a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f173143f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f173144g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f173145h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f173146i;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f173147a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f173148b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f173149c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f173150d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f173151e;

    /* compiled from: IntermediaryVerificationBenefitView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/b$a;", "", "<init>", "()V", "", "ITEM_RICH_BG", "I", "ITEM_RICH_ICON", "VAS_BG", "VAS_ICON", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IntermediaryVerificationBenefitView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.intermediary_verification.presentation.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C5106b {
        static {
            int[] iArr = new int[IntermediaryVerificationData.Benefit.IconType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IntermediaryVerificationData.Benefit.IconType iconType = IntermediaryVerificationData.Benefit.IconType.f173101b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a(null);
        f173143f = R.drawable.bg_intermediary_verification_ic_vas;
        f173144g = R.attr.ic_vas20;
        f173145h = R.drawable.bg_intermediary_verification_ic_item_rich;
        f173146i = R.attr.ic_itemRich20;
    }

    public b(@k View view) {
        this.f173147a = view;
        this.f173148b = view.getContext();
        this.f173149c = (TextView) view.findViewById(R.id.benefit_title);
        this.f173150d = (TextView) view.findViewById(R.id.benefit_description);
        this.f173151e = (ImageView) view.findViewById(R.id.benefit_icon);
    }
}
