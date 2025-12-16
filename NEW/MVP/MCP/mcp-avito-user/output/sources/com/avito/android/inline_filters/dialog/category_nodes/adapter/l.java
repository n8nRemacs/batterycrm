package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lV.C43688d;
import lV.InterfaceC43686b;

/* compiled from: NodeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/G0;", "accept", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f171437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f171438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Size f171439d;

    public l(String str, n nVar, Size size) {
        this.f171437b = str;
        this.f171438c = nVar;
        this.f171439d = size;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Integer numA;
        Bitmap bitmap = (Bitmap) obj;
        String str = this.f171437b;
        if (str == null || (numA = com.avito.android.lib.util.e.a(str)) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        n nVar = this.f171438c;
        int iD2 = C35835l0.d(iIntValue, nVar.f171442b.getContext());
        ListItemCheckmark listItemCheckmark = nVar.f171442b;
        float fJ2 = D6.j(listItemCheckmark, 12);
        androidx.core.graphics.drawable.g gVarA = androidx.core.graphics.drawable.h.a(listItemCheckmark.getContext().getResources(), bitmap);
        gVarA.b(fJ2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fJ2);
        gradientDrawable.setColor(iD2);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gVarA});
        C43688d c43688dB80 = nVar.B80();
        Size size = this.f171439d;
        listItemCheckmark.setStyle((InterfaceC43686b) C43688d.a(c43688dB80, null, layerDrawable, new ImageRequest.c(y6.b(size.getWidth()), y6.b(size.getHeight())), 95));
    }
}
