package com.avito.android.beduin.common.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.avito.android.R;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48063a;

/* compiled from: ImageUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v {

    /* compiled from: ImageUtil.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Landroid/graphics/drawable/Drawable;", "", "invoke", "()Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Q<? extends Drawable, ? extends Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f103547l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IconBase64 f103548m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, IconBase64 iconBase64) {
            super(0);
            this.f103547l = context;
            this.f103548m = iconBase64;
        }

        @Override // Y41.a
        public final Q<? extends Drawable, ? extends Integer> invoke() {
            Context context = this.f103547l;
            return new Q<>(v.b(context, this.f103548m), Integer.valueOf(C35835l0.d(R.attr.transparentBlack, context)));
        }
    }

    @Y61.k
    public static final Q<Drawable, Integer> a(@Y61.k Context context, @Y61.l LocalIcon localIcon, @Y61.l IconBase64 iconBase64) {
        Drawable drawableH;
        Integer numValueOf;
        a aVar = new a(context, iconBase64);
        if (localIcon == null) {
            return (Q) aVar.invoke();
        }
        Integer numA = com.avito.android.lib.util.q.a(localIcon.getName());
        if (numA == null || (drawableH = C35835l0.h(numA.intValue(), context)) == null) {
            return (Q) aVar.invoke();
        }
        UniversalColor dynamicColor = localIcon.getDynamicColor();
        if (dynamicColor != null) {
            numValueOf = Integer.valueOf(C48063a.f437606a.a(context, dynamicColor));
        } else {
            String color = localIcon.getColor();
            if (color == null) {
                color = "";
            }
            Integer numA2 = com.avito.android.lib.util.e.a(color);
            numValueOf = numA2 != null ? Integer.valueOf(C35835l0.d(numA2.intValue(), context)) : null;
        }
        return new Q<>(drawableH, numValueOf);
    }

    public static final BitmapDrawable b(Context context, IconBase64 iconBase64) {
        if (iconBase64 == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode((!com.avito.android.lib.util.darkTheme.c.a(context) || iconBase64.getIconBase64Dark() == null) ? iconBase64.getIconBase64() : iconBase64.getIconBase64Dark(), 0);
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    @Y61.l
    public static final Drawable c(@Y61.k Context context, @Y61.l LocalIcon localIcon, @Y61.l IconBase64 iconBase64) {
        Integer numValueOf;
        Integer numA;
        Drawable drawableA;
        Drawable drawableH;
        if (localIcon == null) {
            return b(context, iconBase64);
        }
        UniversalColor dynamicColor = localIcon.getDynamicColor();
        Drawable drawable = null;
        if (dynamicColor != null) {
            numValueOf = Integer.valueOf(C48063a.f437606a.a(context, dynamicColor));
        } else {
            String color = localIcon.getColor();
            numValueOf = (color == null || (numA = com.avito.android.lib.util.e.a(color)) == null) ? null : Integer.valueOf(C35835l0.d(numA.intValue(), context));
        }
        String name = localIcon.getName();
        Integer numValueOf2 = name.equals("buyWithDeliveryOutline20") ? Integer.valueOf(R.drawable.ic_buy_with_delivery_outline_20) : name.equals("chatOutlineBold20") ? Integer.valueOf(R.drawable.ic_chat_outline_bold_20) : null;
        if (numValueOf2 == null || (drawableA = C43852a.a(context, numValueOf2.intValue())) == null) {
            drawableA = null;
        } else if (numValueOf == null) {
            drawableA.mutate().setTintList(null);
        } else {
            V0.d(drawableA, numValueOf.intValue());
        }
        if (drawableA != null) {
            return drawableA;
        }
        Integer numA2 = com.avito.android.lib.util.q.a(localIcon.getName());
        if (numA2 != null && (drawableH = C35835l0.h(numA2.intValue(), context)) != null) {
            if (numValueOf == null) {
                drawableH.mutate().setTintList(null);
            } else {
                V0.d(drawableH, numValueOf.intValue());
            }
            drawable = drawableH;
        }
        return drawable == null ? b(context, iconBase64) : drawable;
    }
}
