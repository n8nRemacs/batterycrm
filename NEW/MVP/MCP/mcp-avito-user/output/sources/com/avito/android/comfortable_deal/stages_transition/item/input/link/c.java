package com.avito.android.comfortable_deal.stages_transition.item.input.link;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.stages_transition.item.comment.h;
import com.avito.android.comfortable_deal.stages_transition.item.input.e;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputLinkView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/input/link/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/stages_transition/item/input/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f122902f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f122903b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f122904c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f122905d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f122906e;

    /* compiled from: InputLinkView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = c.this.f122906e;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    public c(@k View view) {
        super(view);
        this.f122903b = view.getContext();
        this.f122904c = (TextView) view.findViewById(R.id.input_label);
        Input input = (Input) view.findViewById(R.id.input_field);
        this.f122905d = input;
        input.setOnFocusChangeListener(new h(input, 1));
        n.c(input, new a());
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.input.e
    public final void A3(@l PrintableText printableText) {
        String strK0 = printableText.k0(this.f122903b);
        TextView textView = this.f122904c;
        textView.setText(strK0);
        D6.G(textView, true);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.input.e
    public final void lF(@l String str, @l PrintableText printableText) {
        String strK0 = printableText.k0(this.f122903b);
        Input input = this.f122905d;
        input.setHint(strK0);
        Input.t(input, str, false, 6);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.input.e
    public final void r0(@k Y41.l<? super String, G0> lVar) {
        this.f122906e = lVar;
    }
}
