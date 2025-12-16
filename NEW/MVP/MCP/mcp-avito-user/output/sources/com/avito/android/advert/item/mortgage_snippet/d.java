package com.avito.android.advert.item.mortgage_snippet;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.Z0;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: MortgageSnippetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/mortgage_snippet/d;", "Lcom/avito/android/advert/item/mortgage_snippet/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f77688b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_calculator.data.b f77689c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_calculator.data.h f77690d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public g f77691e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public I1 f77692f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Z0 f77693g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public String f77694h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77695i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public String f77696j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public String f77697k;

    /* compiled from: MortgageSnippetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH10/a;", "it", "Lkotlin/G0;", "<anonymous>", "(LH10/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.mortgage_snippet.MortgageSnippetPresenterImpl$attachLifecycleOwner$1", f = "MortgageSnippetPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<H10.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f77698q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f77698q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(H10.a aVar, Continuation<? super G0> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            H10.a aVar = (H10.a) this.f77698q;
            String strA0 = null;
            String str = aVar != null ? aVar.f6923a : null;
            d dVar = d.this;
            dVar.f77694h = str;
            String str2 = dVar.f77696j;
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                strA0 = C43066x.a0(str2, "<>", str, false);
            }
            g gVar = dVar.f77691e;
            if (gVar != null) {
                if (strA0 == null) {
                    strA0 = dVar.f77697k;
                }
                gVar.k00(strA0, dVar.f77695i);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@l @InterfaceC30174s String str, @k com.avito.android.mortgage_calculator.data.b bVar, @k com.avito.android.mortgage_calculator.data.h hVar) {
        this.f77688b = str;
        this.f77689c = bVar;
        this.f77690d = hVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        MortgageSnippetItem mortgageSnippetItem = (MortgageSnippetItem) aVar;
        this.f77691e = gVar;
        boolean z12 = mortgageSnippetItem.f77673b;
        this.f77695i = z12;
        String str = mortgageSnippetItem.f77675d;
        this.f77696j = str;
        this.f77697k = mortgageSnippetItem.f77676e;
        String str2 = this.f77694h;
        String strA0 = (str2 == null || str2.length() == 0 || str == null || str.length() == 0) ? null : C43066x.a0(str, "<>", str2, false);
        gVar.b(mortgageSnippetItem.f77674c);
        if (strA0 == null) {
            strA0 = this.f77697k;
        }
        gVar.k00(strA0, this.f77695i);
        gVar.oa(mortgageSnippetItem.f77677f);
        gVar.setImage(z12 ? R.drawable.ic_mortgage_banks_redesign_icons : R.drawable.ic_mortgage_banks_icons);
        gVar.U(new e(mortgageSnippetItem, this));
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.c
    public final void S0(@k InterfaceC22983P interfaceC22983P) {
        C43175k.K(new C43197r1(new a(null), this.f77690d.a(this.f77688b)), C22984Q.a(interfaceC22983P));
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.c
    public final void X(@l I1 i12) {
        this.f77692f = i12;
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.c
    public final void f0() {
        this.f77691e = null;
        this.f77692f = null;
        this.f77693g = null;
    }

    @Override // com.avito.android.advert.item.mortgage_snippet.c
    public final void m(@l W0 w02) {
        this.f77693g = (Z0) w02;
    }
}
