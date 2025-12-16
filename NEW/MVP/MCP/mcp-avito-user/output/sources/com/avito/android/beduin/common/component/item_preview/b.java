package com.avito.android.beduin.common.component.item_preview;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinItemPreviewComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/item_preview/b;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/item_preview/BeduinItemPreviewModel;", "Lcom/avito/android/beduin/common/component/item_preview/a;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends h<BeduinItemPreviewModel, com.avito.android.beduin.common.component.item_preview.a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinItemPreviewModel f101640e;

    /* compiled from: BeduinItemPreviewComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/item_preview/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f101641a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101642b = Collections.singletonList("itemOrderPreview");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<? extends BeduinModel> f101643c = BeduinItemPreviewModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return f101643c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101642b;
        }
    }

    public b(@k BeduinItemPreviewModel beduinItemPreviewModel) {
        this.f101640e = beduinItemPreviewModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101640e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        com.avito.android.beduin.common.component.item_preview.a aVar = new com.avito.android.beduin.common.component.item_preview.a(viewGroup.getContext(), null, 0, 6, null);
        aVar.setId(View.generateViewId());
        aVar.setLayoutParams(layoutParams);
        return aVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        com.avito.android.beduin.common.component.item_preview.a aVar = (com.avito.android.beduin.common.component.item_preview.a) view;
        BeduinItemPreviewModel beduinItemPreviewModel = this.f101640e;
        aVar.setImage(beduinItemPreviewModel.getImage());
        aVar.setTitleStyle(beduinItemPreviewModel.getTitleStyle());
        aVar.setTitle(beduinItemPreviewModel.getTitle());
    }
}
