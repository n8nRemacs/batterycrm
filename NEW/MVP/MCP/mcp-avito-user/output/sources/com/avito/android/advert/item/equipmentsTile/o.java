package com.avito.android.advert.item.equipmentsTile;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsEquipmentsTileView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/equipmentsTile/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/equipmentsTile/m;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f75353h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f75354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f75355c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f75356d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f75357e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.equipmentsTile.c f75358f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public y f75359g;

    /* compiled from: AdvertDetailsEquipmentsTileView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f75360b;

        public a(Y41.a<G0> aVar) {
            this.f75360b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f75360b.invoke();
        }
    }

    /* compiled from: AdvertDetailsEquipmentsTileView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/equipmentsTile/o$b", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f75361b;

        public b(Y41.a<G0> aVar) {
            this.f75361b = aVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
            this.f75361b.invoke();
            return true;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f75362b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f75363c;

        public c(View view, o oVar) {
            this.f75362b = view;
            this.f75363c = oVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = o.f75353h;
            this.f75363c.getClass();
            this.f75362b.removeOnLayoutChangeListener(this);
        }
    }

    public o(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.equipment_tile_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75354b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.equipment_tile_sub_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75355c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.equipment_tile_show_bottom_sheet_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75356d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.equipment_tile_options_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f75357e = recyclerView;
        com.avito.android.advert.item.equipmentsTile.c cVar = new com.avito.android.advert.item.equipmentsTile.c();
        this.f75358f = cVar;
        recyclerView.suppressLayout(true);
        recyclerView.setAdapter(cVar);
        View view2 = this.itemView;
        view2.addOnLayoutChangeListener(new c(view2, this));
    }

    @Override // com.avito.android.advert.item.equipmentsTile.m
    public final void gI(int i12, @Y61.k Y41.a aVar, @Y61.k List list) {
        this.itemView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i12);
        gridLayoutManager.c2(1);
        RecyclerView recyclerView = this.f75357e;
        recyclerView.setLayoutManager(gridLayoutManager);
        com.avito.android.advert.item.equipmentsTile.c cVar = this.f75358f;
        ArrayList arrayList = cVar.f75332c;
        arrayList.clear();
        arrayList.addAll(list);
        cVar.notifyDataSetChanged();
        recyclerView.setOnTouchListener(new n(new GestureDetector(recyclerView.getContext(), new b(aVar)), 0));
    }

    @Override // com.avito.android.advert.item.equipmentsTile.m
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f75359g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f75357e.setOnTouchListener(null);
    }

    @Override // com.avito.android.advert.item.equipmentsTile.m
    public final void m9(@Y61.l String str) {
        I5.a(this.f75355c, str, false);
    }

    @Override // com.avito.android.advert.item.equipmentsTile.m
    public final void setTitle(@Y61.k String str) {
        this.f75354b.setText(str);
    }

    @Override // com.avito.android.advert.item.equipmentsTile.m
    public final void un(@Y61.l String str, @Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f75356d;
        I5.a(textView, str, false);
        y yVar = this.f75359g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        if (str == null || C43066x.K(str)) {
            I5.c(textView, null);
        } else {
            this.f75359g = (y) C37722i.a(textView).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).t0(new a(aVar));
        }
    }
}
