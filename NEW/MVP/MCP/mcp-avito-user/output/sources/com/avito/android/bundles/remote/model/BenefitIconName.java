package com.avito.android.bundles.remote.model;

import Y61.k;
import aW.InterfaceC19823a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BenefitColoredIcon.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/remote/model/BenefitIconName;", "", "a", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BenefitIconName {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f108326b;

    /* renamed from: c, reason: collision with root package name */
    public static final BenefitIconName f108327c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BenefitIconName[] f108328d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f108329e;

    /* compiled from: BenefitColoredIcon.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/remote/model/BenefitIconName$a;", "", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BenefitIconName benefitIconName = new BenefitIconName();
        f108327c = benefitIconName;
        BenefitIconName[] benefitIconNameArr = {benefitIconName};
        f108328d = benefitIconNameArr;
        f108329e = c.a(benefitIconNameArr);
        f108326b = new a(null);
    }

    public static BenefitIconName valueOf(String str) {
        return (BenefitIconName) Enum.valueOf(BenefitIconName.class, str);
    }

    public static BenefitIconName[] values() {
        return (BenefitIconName[]) f108328d.clone();
    }
}
