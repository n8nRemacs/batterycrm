package com.avito.android.serp.adapter.actions_horizontal_block;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionsHorizontalBlockItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/b;", "Lcom/avito/android/serp/adapter/actions_horizontal_block/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.serp.adapter.actions_horizontal_block.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f268662a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<s> f268663b = new g.a<>(R.layout.actions_horizontal_block_item, a.f268664l);

    /* compiled from: ActionsHorizontalBlockItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/actions_horizontal_block/s;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/actions_horizontal_block/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, s> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f268664l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final s invoke(ViewGroup viewGroup, View view) {
            return new s(view);
        }
    }

    @Inject
    public b(@Y61.k f fVar) {
        this.f268662a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f268662a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<s> b() {
        return this.f268663b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ActionsHorizontalBlockItem;
    }
}
