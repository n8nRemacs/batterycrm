package com.avito.android.user_adverts_views_util;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeMultiItemTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_adverts_views_util/CompositeMultiItemTextView;", "Landroid/widget/LinearLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "count", "setCount", "getClickableLayout", "()Landroid/widget/LinearLayout;", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompositeMultiItemTextView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f316733b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f316734c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f316735d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f316736e;

    @j
    public CompositeMultiItemTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @k
    /* renamed from: getClickableLayout, reason: from getter */
    public final LinearLayout getF316734c() {
        return this.f316734c;
    }

    public final void setCount(@k String count) {
        this.f316736e.setText(getContext().getString(R.string.composite_multi_item_count_template, count));
    }

    public final void setTitle(@k String title) {
        TextView textView = this.f316735d;
        textView.setText(title);
        FV.a aVar = FV.a.f4720a;
        int iB2 = y6.b(4);
        aVar.getClass();
        FV.a.j(textView, R.attr.textIconCards, iB2);
    }

    public CompositeMultiItemTextView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.composite_multi_item_text_view, (ViewGroup) this, true);
        this.f316733b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.multi_item_group_clickable_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f316734c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.multi_item_group_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f316735d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.multi_item_group_count);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f316736e = (TextView) viewFindViewById3;
    }
}
