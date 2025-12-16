package com.avito.android.credits.broker_link.default_link;

import Y61.k;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.credit_broker.IconName;
import kotlin.Metadata;

/* compiled from: BrokerIconProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/broker_link/default_link/a;", "", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f128597a = new a();

    /* compiled from: BrokerIconProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.credits.broker_link.default_link.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3815a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128598a;

        static {
            int[] iArr = new int[IconName.values().length];
            try {
                iArr[IconName.SBER_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f128598a = iArr;
            int[] iArr2 = new int[CreditCalculator.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CreditCalculator.Type type = CreditCalculator.Type.f128977b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CreditCalculator.Type type2 = CreditCalculator.Type.f128977b;
                iArr2[5] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CreditCalculator.Type type3 = CreditCalculator.Type.f128977b;
                iArr2[4] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                CreditCalculator.Type type4 = CreditCalculator.Type.f128977b;
                iArr2[2] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                CreditCalculator.Type type5 = CreditCalculator.Type.f128977b;
                iArr2[3] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CreditCalculator.Type type6 = CreditCalculator.Type.f128977b;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }
}
