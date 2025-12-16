package com.avito.android.seller_coach.adverts_hint.item;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c;

/* compiled from: HintsViewPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/item/a;", "", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final View f267232a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f267233b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f267234c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f267235d;

    /* compiled from: HintsViewPagerAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.seller_coach.adverts_hint.item.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7970a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f267236a;

        static {
            int[] iArr = new int[UserAdvertsHintItem.BackgroundColor.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertsHintItem.BackgroundColor.a aVar = UserAdvertsHintItem.BackgroundColor.f267217c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UserAdvertsHintItem.BackgroundColor.a aVar2 = UserAdvertsHintItem.BackgroundColor.f267217c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UserAdvertsHintItem.BackgroundColor.a aVar3 = UserAdvertsHintItem.BackgroundColor.f267217c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[UserAdvertsHintItem.Type.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f267236a = iArr2;
        }
    }

    public a(@k View view) {
        this.f267232a = view.findViewById(R.id.cc_advert_hint_card);
        this.f267233b = (TextView) view.findViewById(R.id.advert_hint_card_header);
        this.f267234c = (TextView) view.findViewById(R.id.advert_hint_card_title);
        this.f267235d = (TextView) view.findViewById(R.id.advert_hint_description);
    }

    public final void a(@k UserAdvertsHintItem userAdvertsHintItem, @k l<? super UserAdvertsHintItem, G0> lVar) {
        com.avito.android.lib.design.gradient.a aVarB;
        int iOrdinal = userAdvertsHintItem.f267215h.ordinal();
        if (iOrdinal == 0) {
            aVarB = b(R.attr.gradientRadialTopRightVioletYellow);
        } else if (iOrdinal == 1) {
            aVarB = b(R.attr.gradientRadialTopRightGreenViolet);
        } else if (iOrdinal == 2) {
            aVarB = b(R.attr.gradientRadialTopRightYellowRed);
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVarB = b(R.attr.gradientRadialTopLeftVioletBlue);
        }
        View view = this.f267232a;
        view.setBackground(aVarB);
        view.setOnClickListener(new c(8, lVar, userAdvertsHintItem));
        int i12 = C7970a.f267236a[userAdvertsHintItem.f267213f.ordinal()] == 1 ? R.attr.ic_ads14 : R.attr.ic_attentionRound16;
        TextView textView = this.f267233b;
        textView.setCompoundDrawablesWithIntrinsicBounds(C35835l0.h(i12, textView.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(userAdvertsHintItem.f267212e);
        this.f267234c.setText(userAdvertsHintItem.f267210c);
        this.f267235d.setText(userAdvertsHintItem.f267211d);
    }

    public final com.avito.android.lib.design.gradient.a b(@InterfaceC42150f int i12) {
        Context context = this.f267232a.getContext();
        a.C5276a.C5277a c5277a = new a.C5276a.C5277a(context, i12, 0, 4, null);
        c5277a.f179264a = D6.i(20, context);
        return new com.avito.android.lib.design.gradient.a(context, c5277a.a());
    }
}
