package com.avito.android.serp.adapter.suggest_address;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AddAddressSuggestItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/r;", "Lcom/avito/android/serp/adapter/suggest_address/q;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f272425i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f272426b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f272427c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f272428d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f272429e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f272430f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public N f272431g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ContextThemeWrapper f272432h;

    /* compiled from: AddAddressSuggestItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f272433l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public r(@Y61.k View view) {
        super(view);
        this.f272426b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272427c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272428d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.suggest_close);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f272429e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.address_action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f272430f = (Button) viewFindViewById4;
        this.f272431g = a.f272433l;
        this.f272432h = new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23);
    }

    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void B7(@Y61.l Y41.a<G0> aVar) {
        this.f272429e.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(13, aVar));
    }

    public final SpannableString B80(int i12, String str, String str2) {
        SpannableString spannableString = new SpannableString(str2);
        if (str != null) {
            ContextThemeWrapper contextThemeWrapper = this.f272432h;
            spannableString.setSpan(new TextAppearanceSpan(contextThemeWrapper, C35835l0.j(i12, contextThemeWrapper)), 0, str.length(), 18);
            spannableString.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.white, contextThemeWrapper)), 0, str.length(), 18);
        }
        return spannableString;
    }

    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void EA(@Y61.k String str) {
        View view = this.f272426b;
        Context context = view.getContext();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23);
        String string = context.getString(R.string.address_save);
        SpannableString spannableStringB80 = B80(R.attr.textH40, string, H.i('\n', string, str));
        Context context2 = view.getContext();
        ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
        Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        Activity activity = baseContext instanceof Activity ? (Activity) baseContext : null;
        View viewFindViewById = activity != null ? activity.findViewById(R.id.bottom_navigation) : null;
        if (viewFindViewById != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, viewFindViewById, com.avito.android.printable_text.b.e(spannableStringB80), null, null, null, null, 0, ToastBarPosition.f181044b, null, false, false, null, contextThemeWrapper, 1982);
        }
    }

    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void P2(@Y61.k CharSequence charSequence) {
        this.f272428d.setText(charSequence);
    }

    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void WM() {
        View view = this.f272426b;
        SpannableString spannableStringB80 = B80(R.attr.textM20, null, view.getContext().getString(R.string.address_save_error));
        Context context = view.getContext();
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        Activity activity = baseContext instanceof Activity ? (Activity) baseContext : null;
        View viewFindViewById = activity != null ? activity.findViewById(R.id.input_view) : null;
        if (viewFindViewById != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, viewFindViewById, com.avito.android.printable_text.b.e(spannableStringB80), null, null, null, new f.c(new Exception()), 0, ToastBarPosition.f181045c, null, false, false, null, this.f272432h, 1454);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void dB(@Y61.k Y41.a<G0> aVar) {
        this.f272431g = (N) aVar;
    }

    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void h7(@Y61.l Y41.a<G0> aVar) {
        this.f272430f.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(12, aVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        B7(null);
        h7(null);
        this.f272431g.invoke();
    }

    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void jW(@Y61.l AddAddressSuggestItem addAddressSuggestItem) {
        if (addAddressSuggestItem != null) {
            this.f272430f.setText(addAddressSuggestItem.f272377g.getTitle());
        }
    }

    @Override // com.avito.android.serp.adapter.suggest_address.q
    public final void setTitle(@Y61.k CharSequence charSequence) {
        this.f272427c.setText(charSequence);
    }
}
