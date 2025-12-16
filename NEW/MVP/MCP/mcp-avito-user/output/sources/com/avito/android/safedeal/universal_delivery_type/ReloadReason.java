package com.avito.android.safedeal.universal_delivery_type;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UniversalDeliveryTypeParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/ReloadReason;", "", "<init>", "(Ljava/lang/String;I)V", "a", "ADD_ADDRESS", "EDIT_ADDRESS", "COMPLETE_ADDRESS", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReloadReason {

    @com.google.gson.annotations.c("addAddress")
    public static final ReloadReason ADD_ADDRESS;

    @com.google.gson.annotations.c("completeAddress")
    public static final ReloadReason COMPLETE_ADDRESS;

    @com.google.gson.annotations.c("editAddress")
    public static final ReloadReason EDIT_ADDRESS;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f256398b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ReloadReason[] f256399c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f256400d;

    /* compiled from: UniversalDeliveryTypeParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/ReloadReason$a;", "", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static ReloadReason a(@Y61.l String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 363126907) {
                    if (iHashCode != 735364746) {
                        if (iHashCode == 760542227 && str.equals("addAddress")) {
                            return ReloadReason.ADD_ADDRESS;
                        }
                    } else if (str.equals("editAddress")) {
                        return ReloadReason.EDIT_ADDRESS;
                    }
                } else if (str.equals("completeAddress")) {
                    return ReloadReason.COMPLETE_ADDRESS;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        ReloadReason reloadReason = new ReloadReason("ADD_ADDRESS", 0);
        ADD_ADDRESS = reloadReason;
        ReloadReason reloadReason2 = new ReloadReason("EDIT_ADDRESS", 1);
        EDIT_ADDRESS = reloadReason2;
        ReloadReason reloadReason3 = new ReloadReason("COMPLETE_ADDRESS", 2);
        COMPLETE_ADDRESS = reloadReason3;
        ReloadReason[] reloadReasonArr = {reloadReason, reloadReason2, reloadReason3};
        f256399c = reloadReasonArr;
        f256400d = kotlin.enums.c.a(reloadReasonArr);
        f256398b = new a(null);
    }

    private ReloadReason(String str, int i12) {
    }

    public static ReloadReason valueOf(String str) {
        return (ReloadReason) Enum.valueOf(ReloadReason.class, str);
    }

    public static ReloadReason[] values() {
        return (ReloadReason[]) f256399c.clone();
    }
}
