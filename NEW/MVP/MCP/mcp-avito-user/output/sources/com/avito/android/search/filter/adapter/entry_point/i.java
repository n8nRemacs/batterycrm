package com.avito.android.search.filter.adapter.entry_point;

import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.glow_animation_text_view.GlowTextAnimationView;
import com.avito.android.glow_animation_text_view.GradientMaskTextView;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EntryPointItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/entry_point/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/search/filter/adapter/entry_point/h;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f262310b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f262311c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f262312d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GlowTextAnimationView f262313e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f262314f;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f262315b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N f262316c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a aVar, View view) {
            this.f262315b = view;
            this.f262316c = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f262316c.invoke();
            this.f262315b.removeOnLayoutChangeListener(this);
        }
    }

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.entry_point_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262310b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.entry_point_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262311c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.value_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f262312d = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.entry_point_glow);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.glow_animation_text_view.GlowTextAnimationView");
        }
        this.f262313e = (GlowTextAnimationView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.entry_point_value);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262314f = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void Y6() {
        this.f262313e.a();
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void a(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.f262312d);
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void eJ(@k String str) {
        TextView textView = this.f262314f;
        textView.setText(str);
        D6.H(textView);
        D6.w(this.f262313e);
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void f(@l String str) {
        I5.a(this.f262311c, str, false);
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    @k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ValueAnimator valueAnimator = this.f262313e.f161200d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void jw(@k String str, @k ArrayList arrayList) {
        GlowTextAnimationView glowTextAnimationView = this.f262313e;
        glowTextAnimationView.setText(str);
        GradientMaskTextView gradientMaskTextView = glowTextAnimationView.f161199c;
        gradientMaskTextView.f161206g = true;
        gradientMaskTextView.f161208i = arrayList;
        gradientMaskTextView.requestLayout();
        gradientMaskTextView.invalidate();
        D6.H(glowTextAnimationView);
        D6.w(this.f262314f);
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void lG(boolean z12) {
        D6.G(this.itemView, z12);
        this.itemView.setLayoutParams(z12 ? new RecyclerView.n(-1, -2) : new RecyclerView.n(0, 0));
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void nc(@k Y41.a<G0> aVar) {
        View view = this.itemView;
        view.addOnLayoutChangeListener(new a(aVar, view));
    }

    @Override // com.avito.android.search.filter.adapter.entry_point.h
    public final void setTitle(@k String str) {
        this.f262310b.setText(str);
    }
}
