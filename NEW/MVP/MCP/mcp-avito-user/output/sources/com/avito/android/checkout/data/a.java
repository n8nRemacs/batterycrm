package com.avito.android.checkout.data;

import com.avito.android.checkout.data.CheckoutResponse;
import com.avito.android.checkout.generated.api.api_checkout_v_8.ApiCheckoutPromocode;
import com.avito.android.checkout.generated.api.api_checkout_v_9.ApiCheckoutPromocode;
import com.avito.android.remote.model.ButtonAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import vo.C49359a;
import wo.C49658a;

/* compiled from: CheckoutMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/data/a;", "", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: CheckoutMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.checkout.data.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3438a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118183a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f118184b;

        static {
            int[] iArr = new int[CheckoutResponse.CheckoutPromocode.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckoutResponse.CheckoutPromocode.State state = CheckoutResponse.CheckoutPromocode.State.f118158b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckoutResponse.CheckoutPromocode.State state2 = CheckoutResponse.CheckoutPromocode.State.f118158b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ApiCheckoutPromocode.State.values().length];
            try {
                iArr2[ApiCheckoutPromocode.State.Applied.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiCheckoutPromocode.State.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiCheckoutPromocode.State.Invalid.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f118183a = iArr2;
            int[] iArr3 = new int[ApiCheckoutPromocode.State.values().length];
            try {
                iArr3[ApiCheckoutPromocode.State.Applied.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ApiCheckoutPromocode.State.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiCheckoutPromocode.State.Invalid.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f118184b = iArr3;
        }
    }

    @Inject
    public a() {
    }

    public static final ButtonAction a(C49359a c49359a) {
        return new ButtonAction(c49359a.getTitle(), c49359a.getUri(), c49359a.getStyle(), c49359a.getIsEnabled());
    }

    public static final ButtonAction b(C49658a c49658a) {
        return new ButtonAction(c49658a.getTitle(), c49658a.getUri(), c49658a.getStyle(), c49658a.getIsEnabled());
    }
}
