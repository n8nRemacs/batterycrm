package com.avito.android.calltracking.item;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calltracking/item/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/calltracking/item/l;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f113732h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f113733b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f113734c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f113735d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f113736e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f113737f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f113738g;

    /* compiled from: CalltrackingItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/calltracking/item/n$a", "Landroid/view/View$OnLayoutChangeListener;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Image f113740c;

        public a(Image image) {
            this.f113740c = image;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            n nVar = n.this;
            if (nVar.f113737f.getWidth() > 0) {
                nVar.f113737f.removeOnLayoutChangeListener(this);
                nVar.B80(this.f113740c);
            }
        }
    }

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.call_time);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f113733b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.phones);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f113734c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f113735d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f113736e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f113737f = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.dot);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f113738g = viewFindViewById6;
    }

    public final void B80(Image image) {
        SimpleDraweeView simpleDraweeView = this.f113737f;
        Uri uriD = C35829k2.b(image, Math.min(simpleDraweeView.getWidth(), y6.b(48)), Math.min(simpleDraweeView.getHeight(), y6.b(36)), 0.0f, 2, 44).d();
        if (uriD == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    @Override // com.avito.android.calltracking.item.l
    public final void BR(@Y61.l String str) {
        I5.a(this.f113735d, str, false);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void c(@Y61.l Y41.a<G0> aVar) {
        if (aVar != null) {
            this.itemView.setOnClickListener(new m(0, aVar));
        } else {
            this.itemView.setOnClickListener(null);
            this.itemView.setClickable(false);
        }
    }

    @Override // com.avito.android.calltracking.item.l
    public final void l(@Y61.l Image image) {
        SimpleDraweeView simpleDraweeView = this.f113737f;
        if (simpleDraweeView.getWidth() > 0) {
            B80(image);
        } else {
            simpleDraweeView.addOnLayoutChangeListener(new a(image));
        }
    }

    @Override // com.avito.android.calltracking.item.l
    public final void sr(boolean z12) {
        D6.G(this.f113738g, z12);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void t9(@Y61.l String str) {
        I5.a(this.f113736e, str, false);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void u30(@Y61.k CharSequence charSequence) {
        this.f113733b.setText(charSequence);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void z4(@Y61.k String str) {
        this.f113734c.setText(str);
    }
}
