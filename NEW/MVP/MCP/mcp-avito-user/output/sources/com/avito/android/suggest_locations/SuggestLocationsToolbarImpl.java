package com.avito.android.suggest_locations;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.widget.C37750f0;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestLocationsToolbar.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsToolbarImpl;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/suggest_locations/X;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "hint", "Lkotlin/G0;", "setHint", "(Ljava/lang/String;)V", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestLocationsToolbarImpl extends FrameLayout implements X {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f292156h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AppCompatEditText f292157b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f292158c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f292159d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Toolbar f292160e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f292161f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f292162g;

    public SuggestLocationsToolbarImpl(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f292161f = new com.jakewharton.rxrelay3.c<>();
        this.f292162g = new com.jakewharton.rxrelay3.c<>();
        LayoutInflater.from(getContext()).inflate(R.layout.suggest_locations_search_view, (ViewGroup) this, true);
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.query);
        this.f292157b = appCompatEditText;
        ImageView imageView = (ImageView) findViewById(R.id.clear);
        this.f292158c = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.back);
        this.f292159d = imageView2;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f292160e = toolbar;
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.suggest_locations.Y

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SuggestLocationsToolbarImpl f292211c;

            {
                this.f292211c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        Editable text = this.f292211c.f292157b.getText();
                        if (text != null) {
                            text.clear();
                            break;
                        }
                        break;
                    default:
                        this.f292211c.f292161f.accept(G0.f406611a);
                        break;
                }
            }
        });
        final int i13 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.suggest_locations.Y

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SuggestLocationsToolbarImpl f292211c;

            {
                this.f292211c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        Editable text = this.f292211c.f292157b.getText();
                        if (text != null) {
                            text.clear();
                            break;
                        }
                        break;
                    default:
                        this.f292211c.f292161f.accept(G0.f406611a);
                        break;
                }
            }
        });
        toolbar.setNavigationIcon((Drawable) null);
        appCompatEditText.setOnEditorActionListener(new C27140f(this, 12));
    }

    @Override // com.avito.android.suggest_locations.X
    public final void G3() {
        D6.w(this.f292159d);
        D6.c(this.f292160e, Integer.valueOf(y6.b(12)), null, null, null, 14);
    }

    @Override // com.avito.android.suggest_locations.X
    public final void a(@Y61.k String str) {
        AppCompatEditText appCompatEditText = this.f292157b;
        appCompatEditText.setText(str);
        appCompatEditText.setSelection(str.length());
    }

    @Override // com.avito.android.suggest_locations.X
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF292162g() {
        return this.f292162g;
    }

    @Override // com.avito.android.suggest_locations.X
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF292161f() {
        return this.f292161f;
    }

    @Override // com.avito.android.suggest_locations.X
    @Y61.k
    public final B0 d() {
        return C37750f0.c(this.f292157b).K(new Z(this)).d0(a0.f292213b);
    }

    @Override // com.avito.android.suggest_locations.X
    public final void i0() {
        K2.k(this.f292157b, 1);
    }

    @Override // com.avito.android.suggest_locations.X
    public void setHint(@Y61.k String hint) {
        this.f292157b.setHint(hint);
    }
}
