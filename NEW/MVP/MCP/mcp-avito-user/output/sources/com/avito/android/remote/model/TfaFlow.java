package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TfaFlow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/TfaFlow;", "", "(Ljava/lang/String;I)V", "PUSH", "SMS", "SUPPORT", "_avito_auth-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TfaFlow {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TfaFlow[] $VALUES;

    @c("push")
    public static final TfaFlow PUSH = new TfaFlow("PUSH", 0);

    @c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_SMS)
    public static final TfaFlow SMS = new TfaFlow("SMS", 1);

    @c(AttachMenuItem.Support.KEY)
    public static final TfaFlow SUPPORT = new TfaFlow("SUPPORT", 2);

    private static final /* synthetic */ TfaFlow[] $values() {
        return new TfaFlow[]{PUSH, SMS, SUPPORT};
    }

    static {
        TfaFlow[] tfaFlowArr$values = $values();
        $VALUES = tfaFlowArr$values;
        $ENTRIES = kotlin.enums.c.a(tfaFlowArr$values);
    }

    private TfaFlow(String str, int i12) {
    }

    @k
    public static a<TfaFlow> getEntries() {
        return $ENTRIES;
    }

    public static TfaFlow valueOf(String str) {
        return (TfaFlow) Enum.valueOf(TfaFlow.class, str);
    }

    public static TfaFlow[] values() {
        return (TfaFlow[]) $VALUES.clone();
    }
}
