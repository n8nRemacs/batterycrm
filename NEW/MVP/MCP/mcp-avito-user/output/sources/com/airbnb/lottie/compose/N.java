package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Typeface;
import com.airbnb.lottie.C27291k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;

/* compiled from: rememberLottieComposition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class N extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C27291k f59398q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f59399r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f59400s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f59401t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C27291k c27291k, Context context, String str, String str2, Continuation<? super N> continuation) {
        super(2, continuation);
        this.f59398q = c27291k;
        this.f59399r = context;
        this.f59400s = str;
        this.f59401t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new N(this.f59398q, this.f59399r, this.f59400s, this.f59401t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((N) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        for (O2.b bVar : this.f59398q.f59587f.values()) {
            Context context = this.f59399r;
            String str = bVar.f11934c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f59400s);
            String str2 = bVar.f11932a;
            sb2.append(str2);
            sb2.append(this.f59401t);
            String string = sb2.toString();
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), string);
                try {
                    int i12 = 0;
                    boolean zQ2 = C43066x.q(str, "Italic", false);
                    boolean zQ3 = C43066x.q(str, "Bold", false);
                    if (zQ2 && zQ3) {
                        i12 = 3;
                    } else if (zQ2) {
                        i12 = 2;
                    } else if (zQ3) {
                        i12 = 1;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i12) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i12);
                    }
                    bVar.f11935d = typefaceCreateFromAsset;
                } catch (Exception e12) {
                    com.airbnb.lottie.utils.e.f60101a.error(androidx.camera.core.Q.a("Failed to create ", str2, " typeface with style=", str, "!"), e12);
                }
            } catch (Exception e13) {
                com.airbnb.lottie.utils.e.f60101a.error(AK.c.k("Failed to find typeface in assets with path ", string, "."), e13);
            }
        }
        return G0.f406611a;
    }
}
