package com.avito.android.publish.items.video_upload;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoUploadItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/video_upload/b;", "LTV0/b;", "Lcom/avito/android/publish/items/video_upload/VideoUploadItemView;", "Lcom/avito/android/category_parameters/ParameterElement$J;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<VideoUploadItemView, ParameterElement.J> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f237263a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f237264b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f237265c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f237266d;

    /* compiled from: VideoUploadItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/video_upload/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/video_upload/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new k(view, bVar.f237264b, bVar.f237265c);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k com.avito.android.player_holder.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k Q1 q12) {
        this.f237263a = dVar;
        this.f237264b = aVar;
        this.f237265c = aVar2;
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[84];
        this.f237266d = new g.a<>(((Boolean) q12.f67509r0.a().invoke()).booleanValue() ? R.layout.video_upload_item_redesigned : R.layout.video_upload_item_legacy, new a());
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f237263a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f237266d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ParameterElement.J;
    }
}
