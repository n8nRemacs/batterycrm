package com.avito.android.publish.items.location_addresses;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationAddressesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/location_addresses/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/location_addresses/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f237016j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f237017b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f237018c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f237019d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f237020e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f237021f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f237022g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f237023h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AppCompatImageView f237024i;

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.single_address_location_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f237017b = (ComponentContainer) viewFindViewById;
        this.f237018c = (TextView) view.findViewById(R.id.motivation);
        View viewFindViewById2 = view.findViewById(R.id.action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f237019d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237020e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.edit_item);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById4;
        this.f237021f = constraintLayout;
        View viewFindViewById5 = constraintLayout.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237022g = (TextView) viewFindViewById5;
        View viewFindViewById6 = constraintLayout.findViewById(R.id.subtitle);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237023h = (TextView) viewFindViewById6;
        View viewFindViewById7 = constraintLayout.findViewById(R.id.close_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        }
        this.f237024i = (AppCompatImageView) viewFindViewById7;
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void Do(@Y61.k Y41.l lVar, @Y61.l AttributedText attributedText) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new B(6, lVar));
        }
        com.avito.android.util.text.j.a(this.f237018c, attributedText, null);
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void K0(@Y61.l String str, boolean z12) {
        ComponentContainer componentContainer = this.f237017b;
        if (z12) {
            componentContainer.setTitle((CharSequence) null);
        } else {
            componentContainer.setTitle(str);
        }
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void Ky(@Y61.k String str, @Y61.l String str2, boolean z12) {
        TextView textView = this.f237022g;
        Context context = textView.getContext();
        TextView textView2 = this.f237023h;
        if (!z12) {
            textView.setTextAppearance(C35835l0.j(R.attr.textM20, context));
            textView.setTextColor(C35835l0.d(R.attr.gray54, context));
            textView.setText(str2);
            textView2.setVisibility(8);
            return;
        }
        textView.setTextAppearance(C35835l0.j(R.attr.textH50, context));
        textView.setTextColor(C35835l0.d(R.attr.black, context));
        textView.setText(str);
        textView2.setVisibility(0);
        textView2.setText(str2);
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void PA(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.k Y41.a<G0> aVar) {
        CharSequence text;
        Button button = this.f237019d;
        if (attributedText == null || (text = attributedText.getText()) == null) {
            text = null;
        } else {
            Context context = button.getContext();
            if (str == null) {
                str = "";
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23);
            Integer numM = com.avito.android.lib.util.f.m(str);
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a aVar2 = FV.a.f4720a;
                int iB2 = y6.b(6);
                aVar2.getClass();
                text = FV.a.i(text, contextThemeWrapper, iIntValue, iB2);
            }
        }
        com.avito.android.lib.design.button.b.a(button, text, false);
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(16, aVar));
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void aJ(boolean z12) {
        this.f237021f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void g8(boolean z12) {
        this.f237019d.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void h00(boolean z12, @Y61.l CharSequence charSequence, @Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f237020e;
        if (aVar != null) {
            if (charSequence != null) {
                FV.a aVar2 = FV.a.f4720a;
                Context context = textView.getContext();
                int iB2 = y6.b(3);
                aVar2.getClass();
                String strN = com.avito.android.lib.util.f.n(R.attr.textIconQuestionOutline, context);
                if (strN != null) {
                    charSequence = FV.a.d(charSequence, strN, iB2, aVar);
                }
            } else {
                charSequence = null;
            }
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        I5.a(textView, charSequence, false);
        textView.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.items.location_addresses.a
    public final void ps(@Y61.k Y41.a<G0> aVar) {
        this.f237024i.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(15, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
