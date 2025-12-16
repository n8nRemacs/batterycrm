package com.avito.android.wallet.page.mvi;

import VU.b;
import Y41.l;
import Y61.k;
import ZO0.b;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.D6;
import com.avito.android.wallet.page.mvi.entity.WalletInfoUnavailableButtonAction;
import com.avito.android.wallet.page.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletPageUnavailableView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/c;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f328093a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<ZO0.b, G0> f328094b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f328095c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f328096d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f328097e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f328098f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public a.d f328099g;

    /* compiled from: WalletPageUnavailableView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[WalletInfoUnavailableButtonAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WalletInfoUnavailableButtonAction walletInfoUnavailableButtonAction = WalletInfoUnavailableButtonAction.f328176b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: WalletPageUnavailableView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            c.this.f328094b.invoke(b.f.f20123a);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPageUnavailableView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.page.mvi.c$c, reason: collision with other inner class name */
    public static final class C10174c extends N implements l<View, G0> {
        public C10174c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            c.this.f328094b.invoke(b.e.f20122a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k View view, @k l<? super ZO0.b, G0> lVar) {
        this.f328093a = view;
        this.f328094b = lVar;
        this.f328095c = (TextView) view.findViewById(R.id.wallet_page_unavailable_title);
        this.f328096d = (TextView) view.findViewById(R.id.wallet_page_unavailable_subtitle);
        this.f328097e = (Button) view.findViewById(R.id.wallet_page_unavailable_first_button);
        this.f328098f = (Button) view.findViewById(R.id.wallet_page_unavailable_second_button);
    }

    public final void a(Button button, ZO0.a aVar) {
        l bVar;
        if (aVar == null) {
            D6.w(button);
            return;
        }
        button.setText(aVar.f20115a);
        b.a aVar2 = VU.b.f17147t;
        Context context = button.getContext();
        aVar2.getClass();
        button.setStyle(b.a.b(context, aVar.f20117c));
        int iOrdinal = aVar.f20116b.ordinal();
        if (iOrdinal == 0) {
            bVar = new b();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new C10174c();
        }
        button.setOnClickListener(new A(24, bVar));
        D6.H(button);
    }
}
