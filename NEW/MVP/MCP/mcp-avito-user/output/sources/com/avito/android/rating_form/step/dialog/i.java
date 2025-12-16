package com.avito.android.rating_form.step.dialog;

import Y41.p;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.N0;
import com.avito.android.R;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import fv.C40482a;
import gh0.C40684c;
import gh0.InterfaceC40682a;
import gh0.InterfaceC40683b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kv.C43501a;

/* compiled from: DialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/i;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f249397a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f249398b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f249399c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H f249400d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f249401e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f249402f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup f249403g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f249404h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f249405i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f249406j;

    /* compiled from: DialogView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC40683b, G0> {
        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.H] */
        /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // Y41.l
        public final G0 invoke(InterfaceC40683b interfaceC40683b) {
            InterfaceC40683b interfaceC40683b2 = interfaceC40683b;
            i iVar = (i) this.receiver;
            iVar.getClass();
            if (interfaceC40683b2 instanceof InterfaceC40683b.a) {
                Y41.a<G0> aVar = iVar.f249402f;
                if (aVar != null) {
                    ((d) aVar).invoke();
                }
            } else {
                boolean z12 = interfaceC40683b2 instanceof InterfaceC40683b.C11223b;
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = iVar.f249399c;
                if (z12) {
                    b.a.a(aVar2, ((InterfaceC40683b.C11223b) interfaceC40683b2).f396712a, null, null, 6);
                } else if (interfaceC40683b2 instanceof InterfaceC40683b.d) {
                    PrintableText printableTextA = ((InterfaceC40683b.d) interfaceC40683b2).f396714a;
                    if (printableTextA == null) {
                        printableTextA = com.avito.android.printable_text.b.a();
                    }
                    iVar.f249400d.invoke(printableTextA);
                } else if (interfaceC40683b2 instanceof InterfaceC40683b.c) {
                    iVar.f249401e.invoke(((InterfaceC40683b.c) interfaceC40683b2).f396713a);
                } else if (interfaceC40683b2 instanceof InterfaceC40683b.e) {
                    b.a.a(aVar2, new AuthenticateLink(AuthSource.f92684S, false, (DeepLink) null, 6, (C42822w) null), null, null, 6);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DialogView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgh0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lgh0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<C40684c, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C40684c c40684c) {
            C40684c c40684c2 = c40684c;
            i iVar = i.this;
            final j jVar = new j(1, iVar.f249398b, l.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            TextView textView = iVar.f249404h;
            if (textView == null) {
                textView = null;
            }
            textView.setText(c40684c2.f396718a);
            w wVar = new w() { // from class: com.avito.android.rating_form.step.dialog.g
                @Override // com.avito.android.deep_linking.links.w
                public final void i7(DeepLink deepLink) {
                    ((j) jVar).invoke(new InterfaceC40682a.e(deepLink));
                }
            };
            AttributedText attributedText = c40684c2.f396719b;
            attributedText.setOnDeepLinkClickListener(wVar);
            attributedText.setOnUrlClickListener(new x() { // from class: com.avito.android.rating_form.step.dialog.h
                @Override // com.avito.android.deep_linking.links.x
                public final boolean X(String str) {
                    ((j) jVar).invoke(new InterfaceC40682a.f(str));
                    return true;
                }
            });
            TextView textView2 = iVar.f249405i;
            if (textView2 == null) {
                textView2 = null;
            }
            com.avito.android.util.text.j.c(textView2, attributedText, null);
            ViewGroup viewGroup = iVar.f249403g;
            if (viewGroup == null) {
                viewGroup = null;
            }
            viewGroup.removeAllViews();
            for (C40684c.a aVar : c40684c2.f396720c) {
                ViewGroup viewGroup2 = iVar.f249403g;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                Button button = new Button(viewGroup2.getContext(), null, 0, 0, 14, null);
                button.setAppearanceFromAttr(com.avito.android.rating_form.step.w.a(aVar.f396723b));
                boolean z12 = false;
                com.avito.android.lib.design.button.b.a(button, aVar.f396722a, false);
                if (aVar.f396726e && aVar.f396725d) {
                    z12 = true;
                }
                button.setLoading(z12);
                button.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(13, (Y41.l) jVar, (Object) aVar));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(layoutParams.getMarginStart(), y6.b(2), layoutParams.getMarginEnd(), y6.b(2));
                button.setLayoutParams(layoutParams);
                viewGroup2.addView(button);
            }
            iVar.f249406j = new k(jVar, c40684c2);
            return G0.f406611a;
        }
    }

    /* compiled from: DialogView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.dialog.DialogView$show$2", f = "DialogView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f249408q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = i.this.new c(continuation);
            cVar.f249408q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((c) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            i.this.f249398b.accept(new InterfaceC40682a.d((C43501a) this.f249408q));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.k Context context, @Y61.k l lVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k Y41.l<? super PrintableText, G0> lVar2, @Y61.k Y41.l<? super String, G0> lVar3, @Y61.l Y41.a<G0> aVar2) {
        this.f249397a = context;
        this.f249398b = lVar;
        this.f249399c = aVar;
        this.f249400d = (H) lVar2;
        this.f249401e = (H) lVar3;
        this.f249402f = aVar2;
        com.avito.android.arch.mvi.android.f.a(lVar, interfaceC22983P, Lifecycle.State.f46682e, new a(1, this, i.class, "handleEvent", "handleEvent(Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogOneTimeEvent;)V", 0), new b());
    }

    public final void a(@Y61.k Y41.l<? super Integer, ? extends View> lVar, @Y61.k Y41.l<? super TextView, G0> lVar2) {
        TextView textView = (TextView) LayoutInflater.from(this.f249397a).inflate(R.layout.dialog_title_layout, (ViewGroup) null);
        this.f249404h = textView;
        lVar2.invoke(textView);
        this.f249403g = (ViewGroup) lVar.invoke(Integer.valueOf(R.id.button_container));
        TextView textView2 = (TextView) lVar.invoke(Integer.valueOf(R.id.content));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        this.f249405i = textView2;
        C43175k.K(new C43197r1(new c(null), C40482a.b(this.f249399c)), N0.a(this.f249398b));
    }
}
