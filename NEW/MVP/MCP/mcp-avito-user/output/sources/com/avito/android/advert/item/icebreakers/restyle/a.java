package com.avito.android.advert.item.icebreakers.restyle;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.icebreakers.IceBreakersItem;
import com.avito.android.advert.item.icebreakers.d;
import com.avito.android.advert.item.icebreakers.m;
import com.avito.android.advert.item.icebreakers.o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IceBreakersBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/icebreakers/restyle/a;", "LTV0/b;", "Lcom/avito/android/advert/item/icebreakers/m;", "Lcom/avito/android/advert/item/icebreakers/IceBreakersItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<m, IceBreakersItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f76504a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<o> f76505b = new g.a<>(R.layout.advert_details_icebreakers_restyle, C2267a.f76506l);

    /* compiled from: IceBreakersBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/icebreakers/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/icebreakers/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.icebreakers.restyle.a$a, reason: collision with other inner class name */
    public static final class C2267a extends N implements p<ViewGroup, View, o> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2267a f76506l = new C2267a();

        public C2267a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f76504a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f76504a;
    }

    @Override // TV0.b
    @k
    public final g.a<o> b() {
        return this.f76505b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof IceBreakersItem) {
            IceBreakersItem iceBreakersItem = (IceBreakersItem) aVar;
            if (iceBreakersItem.f76446e && !iceBreakersItem.f76451j) {
                return true;
            }
        }
        return false;
    }
}
