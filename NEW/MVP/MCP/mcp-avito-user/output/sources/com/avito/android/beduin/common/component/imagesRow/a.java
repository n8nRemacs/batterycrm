package com.avito.android.beduin.common.component.imagesRow;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.alignment.HorizontalAlignment;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.image.BeduinImageModel;
import com.avito.android.beduin.common.component.spacing.BeduinSpacingModel;
import com.avito.android.beduin.common.component.text.Alignment;
import com.avito.android.beduin.common.component.text.BeduinTextModel;
import com.avito.android.beduin.common.container.layered.BeduinLayeredContainerChild;
import com.avito.android.beduin.common.container.layered.BeduinLayeredContainerModel;
import com.avito.android.beduin.common.container.layered.LayeredContainerLayoutMode;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinImagesRowComponent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f101472l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f101473m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f101474n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, RecyclerView recyclerView, g gVar) {
        super(0);
        this.f101472l = bVar;
        this.f101473m = recyclerView;
        this.f101474n = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // Y41.a
    public final G0 invoke() {
        List<Image> list;
        BeduinModel beduinModelA;
        ?? r22 = 1;
        b bVar = this.f101472l;
        f fVar = bVar.f101477g;
        int iE2 = y6.e(this.f101473m.getMeasuredWidth());
        fVar.getClass();
        BeduinImagesRowModel beduinImagesRowModel = bVar.f101475e;
        List<Image> visibleImages = beduinImagesRowModel.getVisibleImages(iE2);
        boolean z12 = visibleImages.size() != beduinImagesRowModel.getImages().size();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : visibleImages) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Image image = (Image) obj;
            boolean z13 = i12 == visibleImages.size() - r22 ? r22 : false;
            if (z12 && z13) {
                int size = beduinImagesRowModel.getImages().size();
                String str = beduinImagesRowModel.getF100853b() + "_image_container" + i12;
                LayeredContainerLayoutMode layeredContainerLayoutMode = LayeredContainerLayoutMode.BY_CONTENT_SIZE;
                BeduinImageModel beduinImageModelA = f.a(beduinImagesRowModel, i12, image, r22);
                HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
                VerticalAlignment verticalAlignment = VerticalAlignment.CENTER;
                StringBuilder sb2 = new StringBuilder();
                list = visibleImages;
                sb2.append(beduinImagesRowModel.getF100853b());
                sb2.append("_image_counter");
                sb2.append(i12);
                beduinModelA = new BeduinLayeredContainerModel(str, null, null, null, null, null, layeredContainerLayoutMode, beduinImageModelA, Collections.singletonList(new BeduinLayeredContainerChild(horizontalAlignment, verticalAlignment, new BeduinTextModel(sb2.toString(), "+" + ((size - i12) - 1), null, null, beduinImagesRowModel.getCounterTextStyle(), BeduinComponentTheme.AVITO_RE_23, beduinImagesRowModel.getCounterTextColor(), null, Alignment.CENTER, null, null))));
            } else {
                list = visibleImages;
                beduinModelA = f.a(beduinImagesRowModel, i12, image, false);
            }
            C42745f0.h(C42756l.B(new BeduinModel[]{beduinModelA, z13 ? null : new BeduinSpacingModel(beduinImagesRowModel.getF100853b() + "_spacing" + i12, Integer.valueOf(beduinImagesRowModel.getInterItemSpacing()), null, null)}), arrayList);
            r22 = 1;
            i12 = i13;
            visibleImages = list;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(bVar.f101476f.a((BeduinModel) it.next()));
        }
        this.f101474n.f101484c.m(arrayList2);
        return G0.f406611a;
    }
}
