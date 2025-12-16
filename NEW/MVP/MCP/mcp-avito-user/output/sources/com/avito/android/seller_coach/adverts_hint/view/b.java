package com.avito.android.seller_coach.adverts_hint.view;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import com.avito.android.seller_coach.adverts_hint.view.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import xq0.C49985a;

/* compiled from: ShortAdvicesStackView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/b;", "Lcom/avito/android/seller_coach/adverts_hint/view/f;", "a", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f267323a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SI0.b f267324b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f267325c = C42727D.b(LazyThreadSafetyMode.f406616d, new c(0, this, b.class, "createBinding", "createBinding()Lcom/avito/android/seller_coach/adverts_hint/view/ShortAdvicesStackView$Binding;", 0));

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C49985a f267326d = new C49985a(new d(this));

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.seller_coach.adverts_hint.view.a f267327e = new com.avito.android.seller_coach.adverts_hint.view.a();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f267328f = new e(this);

    /* compiled from: ShortAdvicesStackView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/b$a;", "", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TextView f267329a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextView f267330b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final View f267331c;

        public a(@k TextView textView, @k TextView textView2, @k View view, @k ViewPager2 viewPager2) {
            this.f267329a = textView;
            this.f267330b = textView2;
            this.f267331c = view;
        }
    }

    public b(@k ViewGroup viewGroup, @k SI0.b bVar) {
        this.f267323a = viewGroup;
        this.f267324b = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.seller_coach.adverts_hint.view.f
    public final void a(@k f.d dVar) {
        List<UserAdvertsHintItem> list = dVar.f267339c;
        boolean zIsEmpty = list.isEmpty();
        ViewGroup viewGroup = this.f267323a;
        if (zIsEmpty) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        int size = list.size();
        com.avito.android.seller_coach.adverts_hint.view.a aVar = this.f267327e;
        aVar.getClass();
        if (size >= 3) {
            size = 3;
        }
        aVar.f267322a = size;
        C49985a c49985a = this.f267326d;
        ArrayList arrayList = c49985a.f442667d;
        arrayList.clear();
        arrayList.addAll(list);
        c49985a.notifyDataSetChanged();
        a aVar2 = (a) this.f267325c.getValue();
        aVar2.f267329a.setText(dVar.f267337a);
        aVar2.f267330b.setText(dVar.f267338b);
    }
}
