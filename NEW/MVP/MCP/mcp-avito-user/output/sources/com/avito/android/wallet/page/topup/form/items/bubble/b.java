package com.avito.android.wallet.page.topup.form.items.bubble;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BubbleItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/bubble/b;", "LTV0/b;", "Lcom/avito/android/wallet/page/topup/form/items/bubble/h;", "Lcom/avito/android/wallet/page/topup/form/items/bubble/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<h, com.avito.android.wallet.page.topup.form.items.bubble.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f328304a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<i> f328305b = new g.a<>(R.layout.select_bubble, a.f328306l);

    /* compiled from: BubbleItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/wallet/page/topup/form/items/bubble/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/wallet/page/topup/form/items/bubble/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f328306l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public b(@Y61.k e eVar) {
        this.f328304a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f328304a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<i> b() {
        return this.f328305b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.wallet.page.topup.form.items.bubble.a;
    }
}
