package com.avito.android.wallet.page.history.remote.dto;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OperationType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/remote/dto/OperationType;", "", "(Ljava/lang/String;I)V", "REFUNDED", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OperationType {

    @c("refunded")
    public static final OperationType REFUNDED;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OperationType[] f328079b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f328080c;

    static {
        OperationType operationType = new OperationType("REFUNDED", 0);
        REFUNDED = operationType;
        OperationType[] operationTypeArr = {operationType};
        f328079b = operationTypeArr;
        f328080c = kotlin.enums.c.a(operationTypeArr);
    }

    private OperationType(String str, int i12) {
    }

    public static OperationType valueOf(String str) {
        return (OperationType) Enum.valueOf(OperationType.class, str);
    }

    public static OperationType[] values() {
        return (OperationType[]) f328079b.clone();
    }
}
