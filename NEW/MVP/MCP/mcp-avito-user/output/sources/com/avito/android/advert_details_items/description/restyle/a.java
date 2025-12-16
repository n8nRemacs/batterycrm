package com.avito.android.advert_details_items.description.restyle;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem;
import com.avito.android.advert_details_items.description.c;
import com.avito.android.advert_details_items.description.f;
import com.avito.android.advert_details_items.description.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsDescriptionBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/description/restyle/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/description/f;", "Lcom/avito/android/advert_details_items/description/AdvertDetailsDescriptionItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, AdvertDetailsDescriptionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f84642a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f84643b = new g.a<>(R.layout.advert_details_description_restyle, C2511a.f84644l);

    /* compiled from: AdvertDetailsDescriptionBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/description/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/description/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.description.restyle.a$a, reason: collision with other inner class name */
    public static final class C2511a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2511a f84644l = new C2511a();

        public C2511a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f84642a = cVar;
    }

    @Override // TV0.b
    public final d a() {
        return this.f84642a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f84643b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsDescriptionItem) {
            AdvertDetailsDescriptionItem advertDetailsDescriptionItem = (AdvertDetailsDescriptionItem) aVar;
            if (advertDetailsDescriptionItem.f84610i && !advertDetailsDescriptionItem.f84611j && !advertDetailsDescriptionItem.f84613l) {
                return true;
            }
        }
        return false;
    }
}
