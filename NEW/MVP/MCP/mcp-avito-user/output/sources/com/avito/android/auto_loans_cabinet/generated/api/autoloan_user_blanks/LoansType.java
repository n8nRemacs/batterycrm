package com.avito.android.auto_loans_cabinet.generated.api.autoloan_user_blanks;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoloanUserBlanksRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/LoansType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Auto", "MotoWater", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LoansType {

    @c("auto")
    public static final LoansType Auto;

    @c("moto-water")
    public static final LoansType MotoWater;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LoansType[] f95404c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f95405d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f95406b;

    static {
        LoansType loansType = new LoansType("Auto", 0, "auto");
        Auto = loansType;
        LoansType loansType2 = new LoansType("MotoWater", 1, "moto-water");
        MotoWater = loansType2;
        LoansType[] loansTypeArr = {loansType, loansType2};
        f95404c = loansTypeArr;
        f95405d = kotlin.enums.c.a(loansTypeArr);
    }

    private LoansType(String str, int i12, String str2) {
        this.f95406b = str2;
    }

    public static LoansType valueOf(String str) {
        return (LoansType) Enum.valueOf(LoansType.class, str);
    }

    public static LoansType[] values() {
        return (LoansType[]) f95404c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f95406b.toString();
    }
}
