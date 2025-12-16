package com.avito.android.lib.design.emotion_selector;

import Y41.p;
import Y61.k;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.avito.android.lib.design.emotion_selector.ImageSelectorView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageSelectorView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/h;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageSelectorView f179173b;

    /* compiled from: ImageSelectorView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00060\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$b;", "Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$b;F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ImageSelectorView.b, Float, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f179174l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(ImageSelectorView.b bVar, Float f12) {
            bVar.a(f12.floatValue());
            return G0.f406611a;
        }
    }

    public h(ImageSelectorView imageSelectorView) {
        this.f179173b = imageSelectorView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@k MotionEvent motionEvent) {
        int i12 = ImageSelectorView.f179147k;
        ImageSelectorView imageSelectorView = this.f179173b;
        int iA2 = imageSelectorView.a(motionEvent);
        Integer numValueOf = Integer.valueOf(iA2);
        if (iA2 == imageSelectorView.f179149c) {
            numValueOf = null;
        }
        imageSelectorView.b(numValueOf != null ? numValueOf.intValue() : -1, a.f179174l);
        ImageSelectorView.a aVar = imageSelectorView.f179153g;
        if (aVar != null) {
            aVar.a();
            throw null;
        }
        if (aVar == null) {
            imageSelectorView.f179149c = -1;
            return true;
        }
        aVar.b();
        throw null;
    }
}
