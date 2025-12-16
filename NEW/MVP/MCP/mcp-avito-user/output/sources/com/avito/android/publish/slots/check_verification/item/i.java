package com.avito.android.publish.slots.check_verification.item;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/check_verification/item/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f243194i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f243195b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f243196c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f243197d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f243198e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f243199f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f243200g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ConstraintLayout f243201h;

    public i(@k View view) {
        super(view);
        this.f243195b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f243196c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243197d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243198e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.link);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243199f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.action_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243200g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.root_verification);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f243201h = (ConstraintLayout) viewFindViewById6;
    }

    @Override // com.avito.android.publish.slots.check_verification.item.h
    public final void Jn(@k l lVar, @Y61.l AttributedText attributedText) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new B(7, lVar));
        }
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f243199f;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.check_verification.item.h
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f243200g;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(28, aVar));
    }

    @Override // com.avito.android.publish.slots.check_verification.item.h
    public final void h(@k String str) {
        I5.a(this.f243198e, str, false);
    }

    @Override // com.avito.android.publish.slots.check_verification.item.h
    public final void i(@k UniversalImage universalImage) {
        C35949t5.c(this.f243196c, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext()))), null, null, null, 14);
        D6.H(this.f243196c);
    }

    @Override // com.avito.android.publish.slots.check_verification.item.h
    public final void setTitle(@k String str) {
        I5.a(this.f243197d, str, false);
    }

    @Override // com.avito.android.publish.slots.check_verification.item.h
    public final void setVisible(boolean z12) {
        D6.G(this.f243201h, true);
    }
}
