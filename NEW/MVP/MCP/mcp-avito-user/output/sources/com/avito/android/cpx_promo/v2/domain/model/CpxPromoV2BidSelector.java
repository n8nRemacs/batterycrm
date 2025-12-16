package com.avito.android.cpx_promo.v2.domain.model;

import Y61.k;
import androidx.compose.runtime.internal.P;
import js.C42419a;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: CpxPromoV2BidSelector.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/domain/model/CpxPromoV2BidSelector;", "", "Type", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoV2BidSelector {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42419a f127525a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f127526b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f127527c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Type f127528d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f127529e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CpxPromoV2BidSelector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/domain/model/CpxPromoV2BidSelector$Type;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f127530b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f127531c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f127532d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f127533e;

        static {
            Type type = new Type("AUTO", 0);
            f127530b = type;
            Type type2 = new Type("MANUAL", 1);
            f127531c = type2;
            Type[] typeArr = {type, type2};
            f127532d = typeArr;
            f127533e = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f127532d.clone();
        }
    }

    public CpxPromoV2BidSelector(@k C42419a c42419a, @k String str, @k String str2, @k Type type, boolean z12) {
        this.f127525a = c42419a;
        this.f127526b = str;
        this.f127527c = str2;
        this.f127528d = type;
        this.f127529e = z12;
    }
}
