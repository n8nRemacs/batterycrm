package com.avito.android.publish.slots.final_state_suggest.item;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_overlay.l;
import com.avito.android.publish.slots.final_state_suggest.item.j;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.io.Serializable;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FinalStateSuggestItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/final_state_suggest/item/j;", "Lcom/avito/android/publish/slots/final_state_suggest/item/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f243931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f243932c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f243933d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f243934e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f243935f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f243936g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SimpleDraweeView f243937h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f243938i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final l f243939j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public i f243940k;

    /* compiled from: FinalStateSuggestItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f243941l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f243941l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f243941l.invoke();
            return G0.f406611a;
        }
    }

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f243931b = view;
        this.f243932c = aVar;
        this.f243933d = (LinearLayout) view.findViewById(R.id.final_state_suggest);
        this.f243934e = (LinearLayout) view.findViewById(R.id.final_state_suggest_error);
        this.f243935f = (TextView) view.findViewById(R.id.final_state_suggest_title);
        this.f243936g = (TextView) view.findViewById(R.id.final_state_suggest_content);
        this.f243937h = (SimpleDraweeView) view.findViewById(R.id.final_state_suggest_image);
        this.f243938i = (ImageView) view.findViewById(R.id.final_state_suggest_error_image);
        View viewFindViewById = view.findViewById(R.id.final_state_suggest_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f243939j = new l((ViewGroup) viewFindViewById, R.id.final_state_suggest, null, 0, 0, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.avito.android.publish.slots.final_state_suggest.item.i, java.lang.Runnable] */
    @Override // com.avito.android.publish.slots.final_state_suggest.item.h
    public final void PF(@k final Y41.a<G0> aVar) {
        D6.w(this.f243933d);
        D6.H(this.f243934e);
        i iVar = this.f243940k;
        ImageView imageView = this.f243938i;
        if (iVar != null) {
            imageView.removeCallbacks(iVar);
        }
        ?? r02 = new Runnable() { // from class: com.avito.android.publish.slots.final_state_suggest.item.i
            @Override // java.lang.Runnable
            public final void run() {
                j jVar = this.f243929b;
                c.a.C3719a c3719a = new c.a.C3719a(jVar.f243931b.getResources().getString(R.string.error_layout_refresh), false, null, new j.a(aVar), 6, null);
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.error_layout_no_internet, new Serializable[0]);
                ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
                f.c.f125255c.getClass();
                f.c cVarB = f.c.a.b();
                com.avito.android.component.toast.c.b(cVar, jVar.f243938i, printableTextC, null, Collections.singletonList(c3719a), null, cVarB, 0, toastBarPosition, null, false, false, null, null, 4010);
            }
        };
        this.f243940k = r02;
        imageView.post(r02);
    }

    @Override // com.avito.android.publish.slots.final_state_suggest.item.h
    public final void c0() {
        D6.H(this.f243933d);
        D6.w(this.f243934e);
        this.f243939j.k(null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f243940k;
        if (iVar != null) {
            this.f243938i.removeCallbacks(iVar);
        }
        this.f243940k = null;
    }

    @Override // com.avito.android.publish.slots.final_state_suggest.item.h
    public final void ln(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l UniversalImage universalImage) {
        D6.H(this.f243933d);
        D6.w(this.f243934e);
        this.f243939j.j();
        View view = this.f243931b;
        Context context = view.getContext();
        com.avito.android.util.text.a aVar = this.f243932c;
        I5.a(this.f243935f, aVar.c(context, attributedText), false);
        I5.a(this.f243936g, aVar.c(view.getContext(), attributedText2), false);
        C35949t5.c(this.f243937h, com.avito.android.image_loader.b.b(universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(view, universalImage) : null), null, null, null, 14);
    }
}
