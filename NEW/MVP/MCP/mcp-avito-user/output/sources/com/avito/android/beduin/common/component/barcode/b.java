package com.avito.android.beduin.common.component.barcode;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.beduin.common.component.barcode.a;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinBarcodeComponent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ImageView f100763l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinContainerIndent f100764m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f100765n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ImageView imageView, BeduinContainerIndent beduinContainerIndent, a aVar) {
        super(0);
        this.f100763l = imageView;
        this.f100764m = beduinContainerIndent;
        this.f100765n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f100765n;
        ImageView imageView = this.f100763l;
        int iS2 = D6.s(imageView);
        BeduinContainerIndent beduinContainerIndent = this.f100764m;
        int horizontalIndent = iS2 - (beduinContainerIndent != null ? beduinContainerIndent.getHorizontalIndent() : 0);
        int iR2 = D6.r(imageView) - (beduinContainerIndent != null ? beduinContainerIndent.getVerticalIndent() : 0);
        try {
            Pg.c cVar = aVar.f100760e;
            BeduinBarcodeModel beduinBarcodeModel = aVar.f100762g;
            imageView.setImageBitmap(cVar.a(horizontalIndent, iR2, beduinBarcodeModel.getCode(), beduinBarcodeModel.getType()));
        } catch (Exception unused) {
            imageView.setVisibility(8);
            a.C3025a c3025a = a.f100757h;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = 0;
            imageView.setLayoutParams(layoutParams);
        }
        return G0.f406611a;
    }
}
