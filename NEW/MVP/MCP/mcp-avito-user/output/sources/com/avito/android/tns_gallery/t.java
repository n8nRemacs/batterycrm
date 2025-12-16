package com.avito.android.tns_gallery;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.util.D6;
import com.avito.android.util.X1;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TnsGalleryView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/t;", "Lcom/avito/android/tns_gallery/s;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f301561a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f301562b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f301563c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public f f301564d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f301565e;

    /* compiled from: TnsGalleryView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tns_gallery/t$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f301566b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f301567c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Parcelable, G0> lVar, t tVar) {
            this.f301566b = (N) lVar;
            this.f301567c = tVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            ?? r32;
            if (i12 != 0 || (r32 = this.f301566b) == 0) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_scroll_state", this.f301567c.f301565e.Y0());
            r32.invoke(bundle);
        }
    }

    public t(@Y61.k RecyclerView recyclerView, @Y61.k Activity activity, @Y61.k r rVar) {
        this.f301561a = recyclerView;
        com.avito.android.tns_gallery.di.a.a().a(activity, rVar).a(this);
        recyclerView.setItemAnimator(null);
        com.avito.konveyor.adapter.j jVar = this.f301562b;
        recyclerView.setAdapter(jVar != null ? jVar : null);
        Integer num = rVar.f301557c;
        int iIntValue = num != null ? num.intValue() : kotlin.math.b.b(recyclerView.getContext().getResources().getDimension(R.dimen.gallery_padding_Left));
        Integer num2 = rVar.f301556b;
        int iIntValue2 = num2 != null ? num2.intValue() : kotlin.math.b.b(recyclerView.getContext().getResources().getDimension(R.dimen.gallery_padding_right));
        Integer num3 = rVar.f301558d;
        recyclerView.l(new X1(iIntValue, iIntValue2, num3 != null ? num3.intValue() : kotlin.math.b.b(recyclerView.getContext().getResources().getDimension(R.dimen.gallery_space_between_items))), -1);
        this.f301565e = (LinearLayoutManager) recyclerView.getLayoutManager();
    }

    @Override // com.avito.android.tns_gallery.s
    public final void a(@Y61.l Parcelable parcelable) {
        RecyclerView recyclerView = this.f301561a;
        if (recyclerView.getScrollState() != 0) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f301565e;
        if (parcelable == null) {
            if (recyclerView.getScrollState() != 0) {
                return;
            }
            linearLayoutManager.l1(0);
        } else if (parcelable instanceof Bundle) {
            try {
                ((Bundle) parcelable).setClassLoader(recyclerView.getContext().getClassLoader());
                Bundle bundle = (Bundle) parcelable;
                linearLayoutManager.X0(Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("key_scroll_state", Parcelable.class) : bundle.getParcelable("key_scroll_state"));
            } catch (BadParcelableException unused) {
            }
        }
    }

    @Override // com.avito.android.tns_gallery.s
    @SuppressLint({"NotifyDataSetChanged"})
    public final void b(@Y61.k List<TnsGalleryImage> list, @Y61.l Y41.p<? super List<Image>, ? super Integer, G0> pVar, @Y61.l Y41.l<? super Parcelable, G0> lVar) {
        RecyclerView recyclerView = this.f301561a;
        D6.H(recyclerView);
        com.avito.konveyor.adapter.a aVar = this.f301563c;
        if (aVar == null) {
            aVar = null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new com.avito.android.tns_gallery.a(i12, list));
        }
        aVar.c(new UV0.c(arrayList));
        com.avito.konveyor.adapter.j jVar = this.f301562b;
        if (jVar == null) {
            jVar = null;
        }
        jVar.notifyDataSetChanged();
        f fVar = this.f301564d;
        (fVar != null ? fVar : null).t1(pVar);
        recyclerView.s();
        recyclerView.o(new a(lVar, this));
    }

    @Override // com.avito.android.tns_gallery.s
    @SuppressLint({"NotifyDataSetChanged"})
    public final void c() {
        RecyclerView recyclerView = this.f301561a;
        D6.w(recyclerView);
        com.avito.konveyor.adapter.a aVar = this.f301563c;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c(new UV0.c(C42784z0.f406748b));
        com.avito.konveyor.adapter.j jVar = this.f301562b;
        if (jVar == null) {
            jVar = null;
        }
        jVar.notifyDataSetChanged();
        recyclerView.s();
        f fVar = this.f301564d;
        if (fVar == null) {
            fVar = null;
        }
        fVar.t1(null);
    }

    public final void d() {
        this.f301561a.s();
        f fVar = this.f301564d;
        if (fVar == null) {
            fVar = null;
        }
        fVar.t1(null);
    }

    public /* synthetic */ t(RecyclerView recyclerView, Activity activity, r rVar, int i12, C42822w c42822w) {
        this(recyclerView, activity, (i12 & 4) != 0 ? new r(null, null, null, null, 0, 0, 63, null) : rVar);
    }
}
