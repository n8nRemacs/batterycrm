package com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectionBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/selection_block/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/selection_block/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f137443h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f137444b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f137445c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f137446d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f137447e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f137448f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f137449g;

    public h(@k View view) {
        super(view);
        this.f137444b = view;
        Context context = view.getContext();
        this.f137445c = context;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137446d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.objects);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137447e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.update_time);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137448f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f137449g = (SimpleDraweeView) viewFindViewById4;
        float fB2 = y6.b(16);
        Ow.f.a(view, fB2, fB2, fB2, fB2, C35835l0.e(R.attr.warmGray75, context));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.g
    public final void EL(@k String str) {
        I5.a(this.f137447e, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f137444b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(20, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.g
    public final void iz(@k String str) {
        I5.a(this.f137448f, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137444b.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.g
    public final void l(@k Image image) {
        Drawable drawableMutate;
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        Context context = this.f137445c;
        Bitmap bitmapB = androidx.core.graphics.drawable.d.b(y6.b(24), y6.b(24), 4, new ColorDrawable(C35835l0.d(R.attr.white, context)));
        ColorStateList colorStateList = context.getColorStateList(R.color.deal_room_selection_block_item_placeholder_foreground_color);
        Drawable drawableH = C35835l0.h(R.attr.ic_logo24, context);
        if (drawableH == null || (drawableMutate = drawableH.mutate()) == null) {
            drawableMutate = null;
        } else {
            drawableMutate.setTintList(colorStateList);
        }
        if (drawableMutate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bitmap bitmapB2 = androidx.core.graphics.drawable.d.b(y6.b(24), y6.b(24), 4, drawableMutate);
        int width = bitmapB.getWidth();
        int height = bitmapB.getHeight();
        Bitmap.Config config = bitmapB.getConfig();
        if (config == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapB, new Matrix(), null);
        canvas.drawBitmap(bitmapB2, new Matrix(), null);
        C35949t5.c(this.f137449g, aVarB, new BitmapDrawable(context.getResources(), bitmapCreateBitmap), null, null, 12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.g
    public final void setTitle(@k String str) {
        I5.a(this.f137446d, str, false);
    }
}
