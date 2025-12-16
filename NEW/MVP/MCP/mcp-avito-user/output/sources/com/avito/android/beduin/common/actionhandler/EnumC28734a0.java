package com.avito.android.beduin.common.actionhandler;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinPixelActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/a0;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.a0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class EnumC28734a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC28734a0 f100156b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC28734a0 f100157c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC28734a0 f100158d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC28734a0[] f100159e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100160f;

    static {
        EnumC28734a0 enumC28734a0 = new EnumC28734a0("UP", 0);
        f100156b = enumC28734a0;
        EnumC28734a0 enumC28734a02 = new EnumC28734a0("DOWN", 1);
        f100157c = enumC28734a02;
        EnumC28734a0 enumC28734a03 = new EnumC28734a0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        f100158d = enumC28734a03;
        EnumC28734a0[] enumC28734a0Arr = {enumC28734a0, enumC28734a02, enumC28734a03};
        f100159e = enumC28734a0Arr;
        f100160f = kotlin.enums.c.a(enumC28734a0Arr);
    }

    public EnumC28734a0() {
        throw null;
    }

    public static EnumC28734a0 valueOf(String str) {
        return (EnumC28734a0) Enum.valueOf(EnumC28734a0.class, str);
    }

    public static EnumC28734a0[] values() {
        return (EnumC28734a0[]) f100159e.clone();
    }
}
