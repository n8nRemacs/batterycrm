package com.avito.android.beduin.common.container.horizontal_slider;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout;
import com.avito.android.beduin.common.form.transforms.ChangePageTransform;
import com.avito.android.beduin.common.utils.y;
import com.avito.android.beduin_models.BeduinAction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinHorizontalSliderContainer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/g;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements BeduinBaseHorizontalSliderLayout.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f103109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeduinHorizontalSliderContainerModel f103110b;

    public g(f fVar, BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel) {
        this.f103109a = fVar;
        this.f103110b = beduinHorizontalSliderContainerModel;
    }

    @Override // com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout.a
    public final void a(int i12) {
        com.avito.android.beduin_shared.model.utils.j.a(this.f103109a.f103099f, this.f103110b.getF100853b(), new ChangePageTransform(i12));
    }

    @Override // com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout.a
    public final void b(@Y61.l LinearLayoutManager.SavedState savedState, boolean z12) {
        List<BeduinAction> onPageSwipedActions;
        f fVar = this.f103109a;
        HashMap<y, Parcelable> map = fVar.f103103j.f15825a;
        y.f103550a.getClass();
        BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel = this.f103110b;
        map.put(y.c.a(beduinHorizontalSliderContainerModel), savedState);
        if (z12 || (onPageSwipedActions = beduinHorizontalSliderContainerModel.getOnPageSwipedActions()) == null) {
            return;
        }
        Iterator<T> it = onPageSwipedActions.iterator();
        while (it.hasNext()) {
            fVar.f103100g.o((BeduinAction) it.next());
        }
    }
}
