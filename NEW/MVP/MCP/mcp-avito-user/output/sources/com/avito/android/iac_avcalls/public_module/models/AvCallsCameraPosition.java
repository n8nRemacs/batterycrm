package com.avito.android.iac_avcalls.public_module.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvCallsCameraPosition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCameraPosition;", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AvCallsCameraPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final AvCallsCameraPosition f164614b;

    /* renamed from: c, reason: collision with root package name */
    public static final AvCallsCameraPosition f164615c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AvCallsCameraPosition[] f164616d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f164617e;

    static {
        AvCallsCameraPosition avCallsCameraPosition = new AvCallsCameraPosition("FRONT", 0);
        f164614b = avCallsCameraPosition;
        AvCallsCameraPosition avCallsCameraPosition2 = new AvCallsCameraPosition("BACK", 1);
        f164615c = avCallsCameraPosition2;
        AvCallsCameraPosition[] avCallsCameraPositionArr = {avCallsCameraPosition, avCallsCameraPosition2};
        f164616d = avCallsCameraPositionArr;
        f164617e = c.a(avCallsCameraPositionArr);
    }

    public AvCallsCameraPosition() {
        throw null;
    }

    public static AvCallsCameraPosition valueOf(String str) {
        return (AvCallsCameraPosition) Enum.valueOf(AvCallsCameraPosition.class, str);
    }

    public static AvCallsCameraPosition[] values() {
        return (AvCallsCameraPosition[]) f164616d.clone();
    }
}
