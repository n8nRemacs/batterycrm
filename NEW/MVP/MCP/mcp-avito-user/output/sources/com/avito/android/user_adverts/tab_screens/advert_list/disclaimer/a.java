package com.avito.android.user_adverts.tab_screens.advert_list.disclaimer;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.conveyor_shared_item.single_text.e;
import com.avito.android.conveyor_shared_item.single_text.f;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/disclaimer/a;", "LTV0/b;", "Lcom/avito/android/conveyor_shared_item/single_text/e;", "Lcom/avito/android/conveyor_shared_item/single_text/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<e, com.avito.android.conveyor_shared_item.single_text.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.conveyor_shared_item.single_text.b f314723a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f314724b = new g.a<>(R.layout.user_adverts_disclaimer_item_re23, C9731a.f314725l);

    /* compiled from: DisclaimerBlueprint.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/conveyor_shared_item/single_text/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/conveyor_shared_item/single_text/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.a$a, reason: collision with other inner class name */
    public static final class C9731a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9731a f314725l = new C9731a();

        public C9731a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.serp_header_title);
            if (viewFindViewById != null) {
                return new f(view2, (TextView) viewFindViewById);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public a(@k com.avito.android.conveyor_shared_item.single_text.b bVar) {
        this.f314723a = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f314723a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f314724b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof b;
    }
}
