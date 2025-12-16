package Xh;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.beduin.common.container.banner_gallery.BeduinBannerGalleryContainerModel;
import com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout;
import com.avito.android.beduin.common.container.horizontal_slider.l;
import com.avito.android.beduin.common.utils.y;
import com.avito.android.beduin_models.BeduinAction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinBannerGalleryContainer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXh/b;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17009b implements BeduinBaseHorizontalSliderLayout.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C17008a f19027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f19028b;

    public C17009b(C17008a c17008a, l lVar) {
        this.f19027a = c17008a;
        this.f19028b = lVar;
    }

    @Override // com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout.a
    public final void b(@Y61.l LinearLayoutManager.SavedState savedState, boolean z12) {
        List<BeduinAction> onPageSwipedActions;
        C17008a c17008a = this.f19027a;
        HashMap<y, Parcelable> map = c17008a.f19018f.f15825a;
        y.f103550a.getClass();
        BeduinBannerGalleryContainerModel beduinBannerGalleryContainerModel = c17008a.f19021i;
        map.put(y.c.a(beduinBannerGalleryContainerModel), savedState);
        if (beduinBannerGalleryContainerModel.getAutoScrollInterval() > 0) {
            this.f19028b.d(beduinBannerGalleryContainerModel.getAutoScrollInterval());
        }
        if (z12 || (onPageSwipedActions = beduinBannerGalleryContainerModel.getOnPageSwipedActions()) == null) {
            return;
        }
        Iterator<T> it = onPageSwipedActions.iterator();
        while (it.hasNext()) {
            c17008a.f19020h.o((BeduinAction) it.next());
        }
    }

    @Override // com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout.a
    public final void a(int i12) {
    }
}
