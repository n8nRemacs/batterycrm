package ru.mts.biometry.sdk;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/sdk/IdentificationCancelReason;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IdentificationCancelReason {

    /* renamed from: b, reason: collision with root package name */
    public static final IdentificationCancelReason f436363b;

    /* renamed from: c, reason: collision with root package name */
    public static final IdentificationCancelReason f436364c;

    /* renamed from: d, reason: collision with root package name */
    public static final IdentificationCancelReason f436365d;

    /* renamed from: e, reason: collision with root package name */
    public static final IdentificationCancelReason f436366e;

    /* renamed from: f, reason: collision with root package name */
    public static final IdentificationCancelReason f436367f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ IdentificationCancelReason[] f436368g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f436369h;

    static {
        IdentificationCancelReason identificationCancelReason = new IdentificationCancelReason("DataAccepted", 0);
        f436363b = identificationCancelReason;
        IdentificationCancelReason identificationCancelReason2 = new IdentificationCancelReason("SystemError", 1);
        f436364c = identificationCancelReason2;
        IdentificationCancelReason identificationCancelReason3 = new IdentificationCancelReason("IdentificationFailed", 2);
        f436365d = identificationCancelReason3;
        IdentificationCancelReason identificationCancelReason4 = new IdentificationCancelReason("DeviceIsRooted", 3);
        f436366e = identificationCancelReason4;
        IdentificationCancelReason identificationCancelReason5 = new IdentificationCancelReason("DeviceIsEmulator", 4);
        f436367f = identificationCancelReason5;
        IdentificationCancelReason[] identificationCancelReasonArr = {identificationCancelReason, identificationCancelReason2, identificationCancelReason3, identificationCancelReason4, identificationCancelReason5};
        f436368g = identificationCancelReasonArr;
        f436369h = c.a(identificationCancelReasonArr);
    }

    public IdentificationCancelReason() {
        throw null;
    }

    public static IdentificationCancelReason valueOf(String str) {
        return (IdentificationCancelReason) Enum.valueOf(IdentificationCancelReason.class, str);
    }

    public static IdentificationCancelReason[] values() {
        return (IdentificationCancelReason[]) f436368g.clone();
    }
}
