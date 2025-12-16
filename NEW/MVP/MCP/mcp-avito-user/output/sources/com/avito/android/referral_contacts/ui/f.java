package com.avito.android.referral_contacts.ui;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReferralContactsRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/ui/f;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UdfComponentUsage"})
/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f252590a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f252591b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f252592c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f252593d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f252594e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ShimmerLayout f252595f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ContentPlaceholder f252596g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ViewGroup f252597h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public DeepLink f252598i;

    /* compiled from: ReferralContactsRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f252599l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f252599l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f252599l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralContactsRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "inputText", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f252600l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super String, G0> lVar) {
            super(1);
            this.f252600l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f252600l.invoke(str);
            return G0.f406611a;
        }
    }

    public f(@k FrameLayout frameLayout, @k com.avito.konveyor.adapter.d dVar, @k l<? super DeepLink, G0> lVar, @k Y41.a<G0> aVar, @k l<? super String, G0> lVar2, @k Y41.a<G0> aVar2) throws Resources.NotFoundException {
        this.f252590a = dVar;
        this.f252591b = aVar2;
        NavBar navBar = (NavBar) frameLayout.findViewById(R.id.referral_contacts_navbar);
        Input input = (Input) frameLayout.findViewById(R.id.search_bar);
        this.f252592c = input;
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.referral_contacts_list);
        this.f252593d = recyclerView;
        Button button = (Button) frameLayout.findViewById(R.id.referral_contacts_footer_button);
        this.f252594e = button;
        this.f252595f = (ShimmerLayout) frameLayout.findViewById(R.id.skeleton);
        this.f252596g = (ContentPlaceholder) frameLayout.findViewById(R.id.referral_contacts_error);
        this.f252597h = (ViewGroup) frameLayout.findViewById(R.id.referral_contacts_content);
        this.f252598i = new EmptyDeepLink();
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, new a(aVar), false, frameLayout.getResources().getString(R.string.referral_contacts_screen_title), null, null, null, 117, null));
        input.setRightIcon(R.drawable.ic_search_24);
        n.c(input, new b(lVar2));
        button.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(17, (Object) lVar, (Object) this));
        recyclerView.setAdapter(dVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }
}
