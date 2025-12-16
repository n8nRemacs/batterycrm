package com.avito.android.lib.design.emotion_selector;

import Y41.p;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.lib.design.emotion_selector.ImageSelectorView;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageSelectorView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00060\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$b;", "Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$b;F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements p<ImageSelectorView.b, Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f179172l = new g();

    public g() {
        super(2);
    }

    @Override // Y41.p
    public final G0 invoke(ImageSelectorView.b bVar, Float f12) {
        ImageSelectorView.b bVar2 = bVar;
        bVar2.f179165g = f12.floatValue();
        ImageSelectorView imageSelectorView = ImageSelectorView.this;
        int i12 = ImageSelectorView.f179147k;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        imageSelectorView.postInvalidateOnAnimation();
        return G0.f406611a;
    }
}
