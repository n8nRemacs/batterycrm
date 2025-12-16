package com.avito.android.beduin.common.component.cart_item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinCartItemLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class j extends N implements Y41.a<Drawable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f100918l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(0);
        this.f100918l = context;
    }

    @Override // Y41.a
    public final Drawable invoke() {
        return C35835l0.h(R.attr.img_logoPhotoPlaceholder, this.f100918l);
    }
}
