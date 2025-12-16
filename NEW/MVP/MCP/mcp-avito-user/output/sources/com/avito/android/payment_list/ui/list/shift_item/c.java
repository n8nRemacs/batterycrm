package com.avito.android.payment_list.ui.list.shift_item;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.payment_list.ui.list.shift_item.PaymentItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment_list/ui/list/shift_item/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends com.avito.konveyor.adapter.b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f215063i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f215064b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f215065c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f215066d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f215067e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f215068f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f215069g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f215070h;

    /* compiled from: PaymentItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f215071a;

        static {
            int[] iArr = new int[PaymentItem.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentItem.Status status = PaymentItem.Status.f215055b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f215071a = iArr;
            int[] iArr2 = new int[PaymentItem.IconType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PaymentItem.IconType iconType = PaymentItem.IconType.f215051b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(@k View view) {
        super(view);
        this.f215064b = (ViewGroup) view.findViewById(R.id.button_root);
        this.f215065c = (ImageView) view.findViewById(R.id.button_icon);
        this.f215066d = (Button) view.findViewById(R.id.button);
        this.f215067e = (TextView) view.findViewById(R.id.title);
        this.f215068f = (TextView) view.findViewById(R.id.subtitle);
        this.f215069g = (TextView) view.findViewById(R.id.trailing_text);
        this.f215070h = (ImageView) view.findViewById(R.id.click_marker);
    }
}
