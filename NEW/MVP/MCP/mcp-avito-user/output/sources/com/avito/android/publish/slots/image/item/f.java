package com.avito.android.publish.slots.image.item;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.category_parameters.slot.image.ImageSlotConfig;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ImageItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/image/item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/image/item/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f244102b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f244103c;

    /* compiled from: ImageItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(f.this.f244102b.getResources().getDimensionPixelOffset(R.dimen.publish_container_horizontal_padding));
        }
    }

    public f(@k View view) {
        super(view);
        this.f244102b = (SimpleDraweeView) view.findViewById(R.id.image_slot);
        this.f244103c = C42727D.b(LazyThreadSafetyMode.f406616d, new a());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.publish.slots.image.item.e
    public final void fG(@k JO.e eVar) {
        Integer bottom;
        Integer right;
        Integer top;
        Integer left;
        SimpleDraweeView simpleDraweeView = this.f244102b;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(eVar.f8947c, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ?? r22 = this.f244103c;
        ImageSlotConfig.ContentInsets contentInsets = eVar.f8948d;
        Integer numValueOf = Integer.valueOf((contentInsets == null || (left = contentInsets.getLeft()) == null) ? ((Number) r22.getValue()).intValue() : y6.b(left.intValue()));
        int iB2 = 0;
        Integer numValueOf2 = Integer.valueOf((contentInsets == null || (top = contentInsets.getTop()) == null) ? 0 : y6.b(top.intValue()));
        Integer numValueOf3 = Integer.valueOf((contentInsets == null || (right = contentInsets.getRight()) == null) ? ((Number) r22.getValue()).intValue() : y6.b(right.intValue()));
        if (contentInsets != null && (bottom = contentInsets.getBottom()) != null) {
            iB2 = y6.b(bottom.intValue());
        }
        D6.b(simpleDraweeView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(iB2));
        Size size = (Size) C42745f0.D(imageDependsOnThemeOrDefault.getVariants().keySet());
        simpleDraweeView.setAspectRatio(size.getWidth() / size.getHeight());
        l.w(imageDependsOnThemeOrDefault, C35949t5.a(simpleDraweeView));
    }
}
