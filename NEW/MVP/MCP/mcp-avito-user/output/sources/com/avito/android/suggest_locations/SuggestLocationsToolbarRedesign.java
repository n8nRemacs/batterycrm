package com.avito.android.suggest_locations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuggestLocationsToolbarRedesign.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsToolbarRedesign;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/suggest_locations/X;", "", "hint", "Lkotlin/G0;", "setHint", "(Ljava/lang/String;)V", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestLocationsToolbarRedesign extends LinearLayout implements X {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f292163f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f292164b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f292165c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f292166d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f292167e;

    @X41.j
    public SuggestLocationsToolbarRedesign(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.avito.android.suggest_locations.X
    public final void G3() {
        D6.w(this.f292165c);
    }

    @Override // com.avito.android.suggest_locations.X
    public final void a(@Y61.k String str) {
        Input input = this.f292164b;
        Input.t(input, str, false, 6);
        input.setSelection(str.length());
    }

    @Override // com.avito.android.suggest_locations.X
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF292167e() {
        return this.f292167e;
    }

    @Override // com.avito.android.suggest_locations.X
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF292166d() {
        return this.f292166d;
    }

    @Override // com.avito.android.suggest_locations.X
    @Y61.k
    public final B0 d() {
        return com.avito.android.lib.design.input.n.e(this.f292164b).d0(b0.f292259b);
    }

    @Override // com.avito.android.suggest_locations.X
    public final void i0() {
        K2.k(this.f292164b, 1);
    }

    @Override // com.avito.android.suggest_locations.X
    public void setHint(@Y61.k String hint) {
        this.f292164b.setHint(hint);
    }

    public SuggestLocationsToolbarRedesign(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f292166d = new com.jakewharton.rxrelay3.c<>();
        this.f292167e = new com.jakewharton.rxrelay3.c<>();
        LayoutInflater.from(context).inflate(R.layout.suggest_locations_search_redesign_view, (ViewGroup) this, true);
        Input input = (Input) findViewById(R.id.query);
        this.f292164b = input;
        ImageView imageView = (ImageView) findViewById(R.id.back);
        this.f292165c = imageView;
        imageView.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 17));
        input.setOnEditorActionListener(new C27140f(this, 13));
    }
}
