package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.airbnb.lottie.C27291k;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
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
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class O extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C27291k f59402q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f59403r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f59404s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C27291k c27291k, Context context, String str, Continuation<? super O> continuation) {
        super(2, continuation);
        this.f59402q = c27291k;
        this.f59403r = context;
        this.f59404s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new O(this.f59402q, this.f59403r, this.f59404s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((O) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws IOException {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        for (com.airbnb.lottie.D d12 : ((HashMap) this.f59402q.c()).values()) {
            Bitmap bitmap = d12.f59070f;
            String str2 = d12.f59068d;
            if (bitmap == null && C43066x.h0(str2, "data:", false) && C43066x.I(str2, "base64,", 0, false, 6) > 0) {
                try {
                    byte[] bArrDecode = Base64.decode(str2.substring(C43066x.H(',', 0, 6, str2) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    d12.f59070f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e12) {
                    com.airbnb.lottie.utils.e.c("data URL did not have correct base64 format.", e12);
                }
            }
            Context context = this.f59403r;
            if (d12.f59070f == null && (str = this.f59404s) != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str + str2);
                    Bitmap bitmapDecodeStream = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e13) {
                        com.airbnb.lottie.utils.e.c("Unable to decode image.", e13);
                    }
                    if (bitmapDecodeStream != null) {
                        d12.f59070f = com.airbnb.lottie.utils.k.d(bitmapDecodeStream, d12.f59065a, d12.f59066b);
                    }
                } catch (IOException e14) {
                    com.airbnb.lottie.utils.e.c("Unable to open asset.", e14);
                }
            }
        }
        return G0.f406611a;
    }
}
