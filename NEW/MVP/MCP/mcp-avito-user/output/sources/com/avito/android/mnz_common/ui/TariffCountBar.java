package com.avito.android.mnz_common.ui;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffCountBar.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/mnz_common/ui/TariffCountBar;", "Landroid/widget/LinearLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "", "styleId", "setSubTitleStyle", "(Ljava/lang/Integer;)V", "colorId", "setSubTitleColor", "Lcom/avito/android/paid_services/routing/TariffCountStatus;", "status", "setDescriptionStatus", "(Lcom/avito/android/paid_services/routing/TariffCountStatus;)V", "", "value", "setProgress", "(F)V", "Lcom/avito/android/paid_services/routing/ProgressState;", "progressState", "setProgressState", "(Lcom/avito/android/paid_services/routing/ProgressState;)V", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TariffCountBar extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f197987b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f197988c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f197989d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f197990e;

    /* compiled from: TariffCountBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TariffCountStatus.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TariffCountStatus tariffCountStatus = TariffCountStatus.f210627b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ProgressState.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProgressState progressState = ProgressState.f210623b;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @j
    public TariffCountBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int a(ProgressState progressState) {
        int iOrdinal = progressState.ordinal();
        if (iOrdinal == 0) {
            return C35835l0.d(R.attr.green200, getContext());
        }
        if (iOrdinal == 1) {
            return C35835l0.d(R.attr.red100, getContext());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int b(ProgressState progressState) {
        int iOrdinal = progressState.ordinal();
        if (iOrdinal == 0) {
            return C35835l0.d(R.attr.green600, getContext());
        }
        if (iOrdinal == 1) {
            return C35835l0.d(R.attr.red600, getContext());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setDescriptionStatus(@k TariffCountStatus status) {
        int i12;
        int iOrdinal = status.ordinal();
        if (iOrdinal == 0) {
            i12 = R.attr.gray54;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.red600;
        }
        TextView textView = this.f197989d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(C35835l0.d(i12, getContext()));
    }

    public final void setProgress(float value) {
        ProgressBar progressBar = this.f197990e;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setProgress(value);
    }

    public final void setProgressState(@k ProgressState progressState) {
        ProgressBar progressBar = this.f197990e;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setFillColor(b(progressState));
        ProgressBar progressBar2 = this.f197990e;
        (progressBar2 != null ? progressBar2 : null).setEmptyColor(a(progressState));
    }

    public final void setSubTitleColor(@InterfaceC42150f @l Integer colorId) {
        if (colorId != null) {
            int iIntValue = colorId.intValue();
            TextView textView = this.f197988c;
            if (textView == null) {
                textView = null;
            }
            textView.setTextColor(C35835l0.d(iIntValue, getContext()));
        }
    }

    public final void setSubTitleStyle(@InterfaceC42150f @l Integer styleId) {
        if (styleId != null) {
            int iIntValue = styleId.intValue();
            TextView textView = this.f197988c;
            if (textView == null) {
                textView = null;
            }
            textView.setTextAppearance(C35835l0.j(iIntValue, getContext()));
        }
    }

    public final void setTitle(@k String title) {
        TextView textView = this.f197987b;
        if (textView == null) {
            textView = null;
        }
        textView.setText(title);
    }

    public TariffCountBar(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        int iB2 = y6.b(4);
        LayoutInflater.from(getContext()).inflate(R.layout.count_bar_view, (ViewGroup) this, true);
        this.f197987b = (TextView) findViewById(R.id.title);
        this.f197988c = (TextView) findViewById(R.id.subtitle);
        this.f197989d = (TextView) findViewById(R.id.description);
        this.f197990e = (ProgressBar) findViewById(R.id.bar);
        setOrientation(1);
        D6.f(this, 0, iB2, 0, iB2, 5);
    }
}
