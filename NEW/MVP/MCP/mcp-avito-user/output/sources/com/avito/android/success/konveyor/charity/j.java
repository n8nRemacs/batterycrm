package com.avito.android.success.konveyor.charity;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuccessCharityBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/success/konveyor/charity/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/success/konveyor/charity/i;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f291635e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f291636b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f291637c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f291638d;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.charity_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f291636b = textView;
        View viewFindViewById2 = view.findViewById(R.id.charity_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById2;
        this.f291637c = textView2;
        View viewFindViewById3 = view.findViewById(R.id.charity_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f291638d = (SimpleDraweeView) viewFindViewById3;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.success.konveyor.charity.i
    public final void O1(@k AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        com.avito.android.util.text.j.c(this.f291636b, attributedText, aVar);
    }

    @Override // com.avito.android.success.konveyor.charity.i
    public final void Wc(@l AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        com.avito.android.util.text.j.a(this.f291637c, attributedText, aVar);
    }

    @Override // com.avito.android.success.konveyor.charity.i
    public final void a(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(28, aVar));
    }

    @Override // com.avito.android.success.konveyor.charity.i
    public final void i(@k UniversalImage universalImage) {
        Image imageG = com.avito.android.advert.item.delivery_suggests.l.g(this.itemView, universalImage);
        SimpleDraweeView simpleDraweeView = this.f291638d;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageG));
        aVarA.c();
        D6.H(simpleDraweeView);
    }
}
