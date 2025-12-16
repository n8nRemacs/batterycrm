package com.avito.android.messenger.blacklist_reasons.list_items;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.blacklist_reasons.list_items.a;
import com.avito.android.messenger.blacklist_reasons.list_items.r;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TitleItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/n;", "LTV0/b;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/r;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements TV0.b<r, a.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f186635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<r.b> f186636b = new g.a<>(R.layout.messenger_blacklist_reasons_title, a.f186637l);

    /* compiled from: TitleItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/blacklist_reasons/list_items/r$b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/blacklist_reasons/list_items/r$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, r.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f186637l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final r.b invoke(ViewGroup viewGroup, View view) {
            return new r.b(view);
        }
    }

    @Inject
    public n(@Y61.k p pVar) {
        this.f186635a = pVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f186635a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<r.b> b() {
        return this.f186636b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof a.c;
    }
}
