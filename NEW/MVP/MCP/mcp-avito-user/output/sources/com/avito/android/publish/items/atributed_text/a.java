package com.avito.android.publish.items.atributed_text;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishAttributedTextItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/atributed_text/a;", "LTV0/b;", "Lcom/avito/android/publish/items/atributed_text/g;", "Lcom/avito/android/publish/items/atributed_text/PublishAttributedTextItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, PublishAttributedTextItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f236770a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f236771b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f236772c = new g.a<>(R.layout.publish_attributed_text_item, new C7132a());

    /* compiled from: PublishAttributedTextItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/atributed_text/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/atributed_text/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.items.atributed_text.a$a, reason: collision with other inner class name */
    public static final class C7132a extends N implements p<ViewGroup, View, h> {
        public C7132a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f236771b);
        }
    }

    @Inject
    public a(@k d dVar, @k com.avito.android.util.text.a aVar) {
        this.f236770a = dVar;
        this.f236771b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f236770a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f236772c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PublishAttributedTextItem;
    }
}
