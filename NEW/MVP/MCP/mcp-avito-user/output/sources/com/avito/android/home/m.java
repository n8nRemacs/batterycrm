package com.avito.android.home;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HomeSerpHeaderBluePrint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/home/m;", "LTV0/b;", "Lcom/avito/android/conveyor_shared_item/single_text/e;", "Lcom/avito/android/conveyor_shared_item/single_text/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements TV0.b<com.avito.android.conveyor_shared_item.single_text.e, com.avito.android.conveyor_shared_item.single_text.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.conveyor_shared_item.single_text.b f162433a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.conveyor_shared_item.single_text.f> f162434b = new g.a<>(R.layout.home_serp_header_item, a.f162435l);

    /* compiled from: HomeSerpHeaderBluePrint.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/conveyor_shared_item/single_text/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/conveyor_shared_item/single_text/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.conveyor_shared_item.single_text.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f162435l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.conveyor_shared_item.single_text.f invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.serp_header_title);
            if (viewFindViewById != null) {
                return new com.avito.android.conveyor_shared_item.single_text.f(view2, (TextView) viewFindViewById);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    @Inject
    public m(@Y61.k com.avito.android.conveyor_shared_item.single_text.b bVar) {
        this.f162433a = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f162433a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.conveyor_shared_item.single_text.f> b() {
        return this.f162434b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.conveyor_shared_item.single_text.a;
    }
}
