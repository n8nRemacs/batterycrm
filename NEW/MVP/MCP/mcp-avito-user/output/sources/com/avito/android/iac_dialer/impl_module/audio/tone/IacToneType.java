package com.avito.android.iac_dialer.impl_module.audio.tone;

import aZ0.n;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacToneType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/tone/IacToneType;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@n
/* loaded from: classes14.dex */
public final class IacToneType {

    /* renamed from: b, reason: collision with root package name */
    public static final IacToneType f165910b;

    /* renamed from: c, reason: collision with root package name */
    public static final IacToneType f165911c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ IacToneType[] f165912d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165913e;

    static {
        IacToneType iacToneType = new IacToneType("NONE", 0);
        f165910b = iacToneType;
        IacToneType iacToneType2 = new IacToneType("TONE", 1);
        f165911c = iacToneType2;
        IacToneType[] iacToneTypeArr = {iacToneType, iacToneType2};
        f165912d = iacToneTypeArr;
        f165913e = kotlin.enums.c.a(iacToneTypeArr);
    }

    public IacToneType() {
        throw null;
    }

    public static IacToneType valueOf(String str) {
        return (IacToneType) Enum.valueOf(IacToneType.class, str);
    }

    public static IacToneType[] values() {
        return (IacToneType[]) f165912d.clone();
    }
}
