package com.avito.android.user_advert.advert.items.reject;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RejectReasonItemBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/reject/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/reject/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f309992e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Banner f309993b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Button f309994c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public TextView f309995d;

    public e(@Y61.k View view) {
        super(view);
        this.f309993b = (Banner) view;
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void F1(@Y61.k String str) {
        this.f309993b.setTitle(str);
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void ZR(@Y61.l AttributedText attributedText) {
        TextView textView = this.f309995d;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.reject.d
    public final void g5(@Y61.l String str) {
        Banner banner = this.f309993b;
        Context context = banner.getContext();
        if (str == null) {
            str = "";
        }
        banner.j(R.layout.reject_reason_block_content, com.avito.android.lib.util.f.s(com.avito.android.lib.util.f.b(str), context));
        this.f309994c = (Button) this.itemView.findViewById(R.id.reject_reason_action_button);
        TextView textView = (TextView) this.itemView.findViewById(R.id.reject_reason_description);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f309995d = textView;
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void kc(@Y61.l Y41.a<G0> aVar) {
        Button button = this.f309994c;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(25, aVar));
        }
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void lD(@Y61.l Action action) {
        String title;
        Button button;
        D6.G(this.f309994c, action != null);
        if (action == null || (title = action.getTitle()) == null || (button = this.f309994c) == null) {
            return;
        }
        button.setText(title);
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void U2(@Y61.l Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void al(@Y61.l String str) {
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void n(@Y61.l String str) {
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void u6(boolean z12) {
    }
}
