package com.avito.android.feedback_adverts.adapter;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.p;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: FeedbackAdvertsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/adapter/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/feedback_adverts/adapter/g;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f157765g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f157766b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f157767c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f157768d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f157769e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f157770f;

    public h(@k View view) {
        super(view);
        this.f157766b = view;
        View viewFindViewById = view.findViewById(R.id.item_name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f157767c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f157768d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.item_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f157769e = (SimpleDraweeView) viewFindViewById3;
        this.f157770f = C43852a.a(view.getContext(), R.drawable.ic_feedback_adverts_item_no_image);
    }

    @Override // com.avito.android.feedback_adverts.adapter.g
    public final void J(@k String str) {
        this.f157767c.setText(str);
    }

    @Override // com.avito.android.feedback_adverts.adapter.g
    public final void J0(@k Y41.a<G0> aVar) {
        this.f157766b.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(27, aVar));
    }

    @Override // com.avito.android.feedback_adverts.adapter.g
    public final void l(@l Image image) {
        Map<Size, Uri> variants;
        Set<Map.Entry<Size, Uri>> setEntrySet;
        Object next;
        Uri uriD = C35829k2.c(image, this.f157769e, 0, 30).d();
        if (uriD == null) {
            uriD = null;
            if (image != null && (variants = image.getVariants()) != null && (setEntrySet = variants.entrySet()) != null) {
                Iterator<T> it = setEntrySet.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iArea = ((Size) ((Map.Entry) next).getKey()).area();
                        do {
                            Object next2 = it.next();
                            int iArea2 = ((Size) ((Map.Entry) next2).getKey()).area();
                            if (iArea < iArea2) {
                                next = next2;
                                iArea = iArea2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    uriD = (Uri) entry.getValue();
                }
            }
            if (uriD == null) {
                uriD = Uri.EMPTY;
            }
        }
        C35949t5.c(this.f157769e, new p(uriD), this.f157770f, null, null, 12);
    }

    @Override // com.avito.android.feedback_adverts.adapter.g
    public final void p(@l String str) {
        I5.a(this.f157768d, str, false);
    }
}
