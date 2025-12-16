package com.avito.android.select.bottom_sheet;

import PV.b;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import dq0.C39783e;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f265313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f265314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C39783e f265315d;

    public j(View view, g gVar, C39783e c39783e) {
        this.f265313b = view;
        this.f265314c = gVar;
        this.f265315d = c39783e;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        g gVar = this.f265314c;
        PV.b bVar = gVar.f265305q;
        RecyclerView recyclerView = gVar.f265296h;
        if (bVar != null) {
            recyclerView.r0(bVar);
        }
        int iJ2 = C42745f0.J(this.f265315d.f394141h);
        int measuredHeight = gVar.f265291c.getMeasuredHeight();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(measuredHeight);
        shapeDrawable.setTint(C35835l0.d(R.attr.transparentWhite, recyclerView.getContext()));
        b.a aVar = new b.a(null, 1, null);
        aVar.f13092e = true;
        aVar.b(shapeDrawable, iJ2);
        PV.b bVarA = aVar.a();
        recyclerView.l(bVarA, -1);
        gVar.f265305q = bVarA;
        this.f265313b.removeOnLayoutChangeListener(this);
    }
}
