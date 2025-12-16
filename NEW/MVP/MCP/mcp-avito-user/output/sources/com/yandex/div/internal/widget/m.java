package com.yandex.div.internal.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C19948f0;
import androidx.appcompat.widget.W;
import com.yandex.div.internal.widget.m;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0011J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/internal/widget/m;", "Lcom/yandex/div/internal/widget/r;", "", "", "items", "Lkotlin/G0;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "", "q", "LY41/l;", "getOnItemSelectedListener", "()LY41/l;", "setOnItemSelectedListener", "(LY41/l;)V", "onItemSelectedListener", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class m extends r {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.l<? super Integer, G0> onItemSelectedListener;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"RestrictedApi"})
    public final a f370316r;

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/widget/m$a;", "Landroidx/appcompat/widget/f0;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends C19948f0 {

        /* renamed from: D, reason: collision with root package name */
        @Y61.k
        public final Context f370317D;

        /* renamed from: E, reason: collision with root package name */
        @Y61.k
        public final C10932a f370318E;

        /* compiled from: SelectView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/m$a$a;", "Landroid/widget/BaseAdapter;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.internal.widget.m$a$a, reason: collision with other inner class name */
        public final class C10932a extends BaseAdapter {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public List<String> f370319b = C42784z0.f406748b;

            public C10932a() {
            }

            @Override // android.widget.Adapter
            public final int getCount() {
                return this.f370319b.size();
            }

            @Override // android.widget.Adapter
            public final Object getItem(int i12) {
                return this.f370319b.get(i12);
            }

            @Override // android.widget.Adapter
            public final long getItemId(int i12) {
                return i12;
            }

            @Override // android.widget.Adapter
            public final View getView(int i12, View view, ViewGroup viewGroup) {
                View view2 = view;
                if (view == null) {
                    TextView textView = new TextView(a.this.f370317D, null, R.attr.spinnerDropDownItemStyle);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setSingleLine(true);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, com.yandex.div.internal.util.p.a(48)));
                    view2 = textView;
                }
                TextView textView2 = (TextView) view2;
                textView2.setText(this.f370319b.get(i12));
                return textView2;
            }
        }

        public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
            super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? com.avito.android.R.attr.listPopupWindowStyle : i12);
            this.f370317D = context;
            this.f370318E = new C10932a();
        }

        @Override // androidx.appcompat.widget.C19948f0, androidx.appcompat.view.menu.r
        public final void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f22508d == null) {
                super.show();
            }
            super.show();
        }
    }

    public m(@Y61.k Context context) {
        super(context, null, 0, 6, null);
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                m.a aVar = this.f370312b.f370316r;
                W w12 = aVar.f22508d;
                if (w12 != null) {
                    w12.setSelectionAfterHeaderView();
                }
                aVar.show();
            }
        });
        final a aVar = new a(context, null, 0, 6, null);
        aVar.r();
        aVar.f22520p = this;
        aVar.f22521q = new AdapterView.OnItemClickListener() { // from class: com.yandex.div.internal.widget.l
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j12) {
                Y41.l<? super Integer, G0> lVar = this.f370313b.onItemSelectedListener;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i12));
                }
                aVar.dismiss();
            }
        };
        aVar.f22516l = true;
        aVar.f22515k = true;
        aVar.g(new ColorDrawable(-1));
        aVar.o(aVar.f370318E);
        this.f370316r = aVar;
    }

    @Y61.l
    public final Y41.l<Integer, G0> getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    @Override // com.yandex.div.internal.widget.e, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f370316r;
        if (aVar.f22505A.isShowing()) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onLayout(z12, i12, i13, i14, i15);
        if (z12) {
            a aVar = this.f370316r;
            if (aVar.f22505A.isShowing()) {
                aVar.show();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(@Y61.k View view, int i12) {
        super.onVisibilityChanged(view, i12);
        if (i12 != 0) {
            a aVar = this.f370316r;
            if (aVar.f22505A.isShowing()) {
                aVar.dismiss();
            }
        }
    }

    public final void setItems(@Y61.k List<String> items) {
        a.C10932a c10932a = this.f370316r.f370318E;
        c10932a.f370319b = items;
        c10932a.notifyDataSetChanged();
    }

    public final void setOnItemSelectedListener(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.onItemSelectedListener = lVar;
    }
}
