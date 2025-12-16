package com.avito.android.beduin.common.container.horizontal_slider;

import android.animation.ValueAnimator;
import androidx.core.view.y0;
import androidx.recyclerview.widget.B;
import com.avito.android.beduin.common.form.transforms.FakeScrollTransform;
import com.avito.android.beduin.common.form.transforms.ResetFakeScrollTransform;
import com.avito.android.beduin.common.form.transforms.ScrollToPositionTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinHorizontalSliderContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinHorizontalSliderContainerChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinHorizontalSliderContainerChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.l<BeduinHorizontalSliderContainerChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f103111l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f103112m;

    /* compiled from: BeduinHorizontalSliderContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BeduinHorizontalSliderContainerChange.values().length];
            try {
                iArr[BeduinHorizontalSliderContainerChange.f103078c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinHorizontalSliderContainerChange.f103079d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinHorizontalSliderContainerChange.f103080e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinHorizontalSliderContainerChange.f103081f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinHorizontalSliderContainerChange.f103082g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, l lVar) {
        super(1);
        this.f103111l = fVar;
        this.f103112m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinHorizontalSliderContainerChange beduinHorizontalSliderContainerChange) {
        int iOrdinal = beduinHorizontalSliderContainerChange.ordinal();
        l lVar = this.f103112m;
        f fVar = this.f103111l;
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal == 3) {
                    boolean zF2 = L.f(fVar.f103101h.getScrollToPositionWithLeftAlign(), Boolean.TRUE);
                    BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel = fVar.f103101h;
                    boolean z12 = zF2 || beduinHorizontalSliderContainerModel.isPagingEnabled();
                    Integer scrollToPosition = beduinHorizontalSliderContainerModel.getScrollToPosition();
                    lVar.getClass();
                    if (scrollToPosition == null || scrollToPosition.intValue() != -1) {
                        lVar.e(scrollToPosition != null ? scrollToPosition.intValue() : 0, true, z12);
                    }
                    com.avito.android.beduin_shared.model.utils.j.a(fVar.f103099f, beduinHorizontalSliderContainerModel.getId(), new ScrollToPositionTransform(-1));
                    G0 g02 = G0.f406611a;
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (fVar.f103101h.getFakeScrollTransform() != null) {
                        BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel2 = fVar.f103101h;
                        FakeScrollTransform fakeScrollTransform = beduinHorizontalSliderContainerModel2.getFakeScrollTransform();
                        lVar.getClass();
                        long durationMs = fakeScrollTransform.getDurationMs();
                        int iB2 = y6.b(fakeScrollTransform.getDepth());
                        ValueAnimator valueAnimator = lVar.f103065g;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iB2, 0);
                        lVar.f103065g = valueAnimatorOfInt;
                        if (valueAnimatorOfInt != null) {
                            valueAnimatorOfInt.setInterpolator(new n());
                            valueAnimatorOfInt.setDuration(durationMs);
                            l0.f fVar2 = new l0.f();
                            valueAnimatorOfInt.addUpdateListener(new y0(2, fVar2, lVar));
                            valueAnimatorOfInt.addListener(new b(lVar, fVar2));
                            valueAnimatorOfInt.start();
                        }
                        com.avito.android.beduin_shared.model.utils.j.a(fVar.f103099f, beduinHorizontalSliderContainerModel2.getId(), new ResetFakeScrollTransform(null, 1, null));
                        G0 g03 = G0.f406611a;
                    }
                }
            }
            return G0.f406611a;
        }
        List<BeduinModel> children = fVar.f103101h.getChildren();
        if (children == null) {
            children = C42784z0.f406748b;
        }
        List<BeduinModel> list = children;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fVar.u((BeduinModel) it.next()));
        }
        B b12 = lVar.f103063e;
        (b12 != null ? b12 : null).m(arrayList);
        G0 g04 = G0.f406611a;
        return G0.f406611a;
    }
}
