package com.avito.android.promo_snippet;

import X41.j;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.promo_snippet.list.next_button.PromoNextButtonItem;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ud0.C49039a;

/* compiled from: PromoSnippetList.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/promo_snippet/PromoSnippetList;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lkotlin/G0;", "onButtonClickListener", "setOnButtonClickListener", "(LY41/l;)V", "Lcom/avito/android/promo_snippet/PromoSnippetListState;", VoiceInfo.STATE, "setState", "(Lcom/avito/android/promo_snippet/PromoSnippetListState;)V", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoSnippetList extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f231706h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConstraintLayout f231707b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f231708c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HeaderButton f231709d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f231710e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f231711f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public l<? super DeepLink, G0> f231712g;

    /* compiled from: PromoSnippetList.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ PromoSnippetListState f231713l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PromoSnippetList f231714m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PromoSnippetListState promoSnippetListState, PromoSnippetList promoSnippetList) {
            super(0);
            this.f231713l = promoSnippetListState;
            this.f231714m = promoSnippetList;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f231713l.f231718e;
            if (deepLink == null) {
                return null;
            }
            this.f231714m.f231712g.invoke(deepLink);
            return G0.f406611a;
        }
    }

    @j
    public PromoSnippetList(@k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setOnButtonClickListener(@k l<? super DeepLink, G0> onButtonClickListener) {
        this.f231712g = onButtonClickListener;
    }

    public final void setState(@k PromoSnippetListState state) {
        String str = state.f231715b;
        TextView textView = this.f231708c;
        textView.setText(str);
        List listI0 = state.f231716c;
        PromoNextButtonItem promoNextButtonItem = state.f231717d;
        if (promoNextButtonItem != null) {
            listI0 = C42745f0.i0(promoNextButtonItem, listI0);
        }
        com.avito.konveyor.util.a.a(this.f231711f, listI0);
        a aVar = new a(state, this);
        DeepLink deepLink = state.f231718e;
        HeaderButton headerButton = this.f231709d;
        if (deepLink != null) {
            D6.H(textView);
            D6.H(headerButton);
        } else {
            D6.w(textView);
            D6.w(headerButton);
        }
        this.f231707b.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(28, aVar));
        headerButton.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(29, aVar));
    }

    public PromoSnippetList(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws BlueprintCollisionException {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f231712g = h.f231739l;
        View.inflate(context, R.layout.promo_snippet_list_layout, this);
        this.f231707b = (ConstraintLayout) findViewById(R.id.promo_snippet_list_root);
        View viewFindViewById = findViewById(R.id.promo_snippet_list_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f231708c = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.promo_snippet_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f231710e = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.click_marker);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.header_button.HeaderButton");
        }
        this.f231709d = (HeaderButton) viewFindViewById3;
        Set setL0 = C42756l.l0(new TV0.b[]{new com.avito.android.promo_snippet.list.snippet.b(new com.avito.android.promo_snippet.list.snippet.d(new f(this))), new com.avito.android.promo_snippet.list.next_button.a(new com.avito.android.promo_snippet.list.next_button.d(new g(this)))});
        a.C10493a c10493a = new a.C10493a();
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f231711f = hVar;
        this.f231710e.setLayoutManager(new LinearLayoutManager(0, false));
        this.f231710e.setAdapter(new com.avito.konveyor.adapter.j(hVar, aVarA));
        this.f231710e.l(new C49039a(), -1);
    }
}
