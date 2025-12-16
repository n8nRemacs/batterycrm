package com.avito.android.auto_loans_cabinet.domain;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FinishedBlank.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/Bank;", "", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Bank {

    /* renamed from: b, reason: collision with root package name */
    public static final Bank f95367b;

    /* renamed from: c, reason: collision with root package name */
    public static final Bank f95368c;

    /* renamed from: d, reason: collision with root package name */
    public static final Bank f95369d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Bank[] f95370e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f95371f;

    static {
        Bank bank = new Bank("OTP", 0);
        f95367b = bank;
        Bank bank2 = new Bank("LOKO", 1);
        f95368c = bank2;
        Bank bank3 = new Bank("MTS", 2);
        f95369d = bank3;
        Bank[] bankArr = {bank, bank2, bank3};
        f95370e = bankArr;
        f95371f = kotlin.enums.c.a(bankArr);
    }

    public Bank() {
        throw null;
    }

    public static Bank valueOf(String str) {
        return (Bank) Enum.valueOf(Bank.class, str);
    }

    public static Bank[] values() {
        return (Bank[]) f95370e.clone();
    }
}
