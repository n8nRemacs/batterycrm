package com.avito.android.loyalty.ui.quality_service.items.plate;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.loyalty.remote.model.quality_service.QualityServiceWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PlateItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/plate/e;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f183937b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f183938c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f183939d;

    /* compiled from: PlateItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/plate/e$a;", "", "<init>", "()V", "", "MARGIN_BOTTOM_DEFAULT", "I", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PlateItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183940a;

        static {
            int[] iArr = new int[QualityServiceWidget.PlatesItem.PlateItem.Color.values().length];
            try {
                iArr[QualityServiceWidget.PlatesItem.PlateItem.Color.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QualityServiceWidget.PlatesItem.PlateItem.Color.RED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QualityServiceWidget.PlatesItem.PlateItem.Color.YELLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QualityServiceWidget.PlatesItem.PlateItem.Color.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f183940a = iArr;
        }
    }

    static {
        new a(null);
    }

    public e(@k View view) {
        super(view);
        this.f183937b = view;
        View viewFindViewById = view.findViewById(R.id.item_plate_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f183938c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_plate_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f183939d = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
