package com.avito.android.advert.item.recall_me;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import v7.C49175a;

/* compiled from: RecallMeBlockView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/recall_me/C;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/recall_me/z;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C extends com.avito.konveyor.adapter.b implements z {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f78447j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f78448b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f78449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f78450d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f78451e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f78452f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f78453g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f78454h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Context f78455i;

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Y61.k View view, @Y61.k Y41.l<? super String, G0> lVar) {
        super(view);
        this.f78448b = lVar;
        View viewFindViewById = view.findViewById(R.id.recall_me_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78449c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recall_me_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78450d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.recall_me_phone_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f78451e = (ComponentContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.recall_me_phone);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f78452f = (Input) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.recall_me_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f78453g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.recall_me_disclaimer);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78454h = (TextView) viewFindViewById6;
        this.f78455i = view.getContext();
    }

    @Override // com.avito.android.advert.item.recall_me.z
    public final void HJ(@Y61.k CharSequence charSequence) {
        ComponentContainer.l(this.f78451e, new int[]{this.f78452f.getId()}, charSequence, 4);
    }

    @Override // com.avito.android.advert.item.recall_me.z
    public final void Jl(@Y61.k final v7.b bVar, @Y61.k final Y41.p<? super String, ? super String, G0> pVar) {
        this.f78449c.setText(bVar.f440468a);
        this.f78450d.setText(bVar.f440470c);
        C49175a c49175a = bVar.f440469b;
        Button button = this.f78453g;
        button.setText(c49175a.f440467a);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.recall_me.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C c12 = this.f78442b;
                Input input = c12.f78452f;
                ((g) c12.f78448b).invoke(input.getDeformattedText());
                K2.d(c12.f78452f, true);
                ((q) pVar).invoke(input.getDeformattedText(), bVar.f440472e);
            }
        });
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f78454h;
        textView.setMovementMethod(linkMovementMethod);
        I5.a(textView, bVar.f440471d, false);
        final Input input = this.f78452f;
        input.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.avito.android.advert.item.recall_me.B
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i12, KeyEvent keyEvent) {
                int i13 = C.f78447j;
                if (i12 != 6) {
                    return false;
                }
                String deformattedText = input.getDeformattedText();
                C c12 = this.f78445b;
                ((g) c12.f78448b).invoke(deformattedText);
                K2.d(c12.f78452f, true);
                return true;
            }
        });
    }

    @Override // com.avito.android.advert.item.recall_me.z
    public final void OG() {
        Input.t(this.f78452f, "", false, 6);
    }

    @Override // com.avito.android.advert.item.recall_me.z
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final Context getF78455i() {
        return this.f78455i;
    }

    @Override // com.avito.android.advert.item.recall_me.z
    public final void q5(@Y61.k String str) {
        Input.t(this.f78452f, str, false, 6);
    }

    @Override // com.avito.android.advert.item.recall_me.z
    public final void setLoading(boolean z12) {
        this.f78452f.setLoading(z12);
        this.f78453g.setLoading(z12);
    }
}
