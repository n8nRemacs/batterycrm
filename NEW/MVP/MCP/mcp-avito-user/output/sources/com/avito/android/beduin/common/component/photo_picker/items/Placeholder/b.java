package com.avito.android.beduin.common.component.photo_picker.items.Placeholder;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlaceholderItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/b;", "LTV0/b;", "Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/f;", "Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<f, com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f102013a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f102014b = new g.a<>(R.layout.beduin_photo_picker_placeholder, a.f102015l);

    /* compiled from: PlaceholderItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102015l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    public b(@k e eVar) {
        this.f102013a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f102013a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f102014b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a;
    }
}
