package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DevelopmentItemBrandspaceGridView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/f;", "Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/n;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class f extends n {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f269818l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f269819m;

    /* compiled from: DevelopmentItemBrandspaceGridView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(f.this.f269819m.c());
        }
    }

    public f(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        super(view, aVar);
        this.f269818l = view;
        this.f269819m = aVar;
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.n, com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public final void x(@Y61.k com.avito.android.image_loader.k kVar) {
        SimpleDraweeView simpleDraweeView = this.f269835e;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(kVar);
        aVarA.f169501s = d.a.a(this.f269834d, simpleDraweeView.getContext(), kVar, null, Integer.valueOf(y6.b(16)), 20);
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.f169497o = new a();
        aVarA.c();
    }
}
