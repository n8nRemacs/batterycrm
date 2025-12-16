package com.avito.android.avl_entry.impl.ui.internal_item.show_all;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ShortVideosShowAllWidgetCarouselItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/i;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/h;", "Lcom/avito/android/serp/c;", "a", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.android.serp.c implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f98579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f98580c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f98581d;

    /* compiled from: ShortVideosShowAllWidgetCarouselItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/i$a;", "", "<init>", "()V", "", "MIN_SCREEN_WIDTH", "F", "SMALL_DEVICES_AVL_ENTRY_SHOW_ALL_TEXT_SIZE", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@k View view) {
        super(view);
        this.f98579b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f98580c = textView;
        View viewFindViewById2 = view.findViewById(R.id.player_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f98581d = (ImageView) viewFindViewById2;
        if (r6.widthPixels / Resources.getSystem().getDisplayMetrics().density <= 375.0f) {
            textView.setPadding(textView.getPaddingLeft() / 2, textView.getPaddingTop(), textView.getPaddingRight() / 2, textView.getPaddingBottom());
            textView.setTextSize(2, 13.0f);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f98579b.setOnClickListener(null);
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.show_all.h
    public final void l0(@k l<? super Context, G0> lVar) {
        this.f98579b.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(15, lVar, this));
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.show_all.h
    public final void setIcon(@Y61.l Drawable drawable) {
        this.f98581d.setImageDrawable(drawable);
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.show_all.h
    public final void setTitle(@k String str) {
        this.f98580c.setText(str);
    }
}
