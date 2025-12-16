package com.avito.android.barcode_encoder.common;

import Y61.k;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharacterSetECI.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_encoder/common/CharacterSetECI;", "", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CharacterSetECI {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f98793d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final HashMap f98794e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final HashMap f98795f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CharacterSetECI[] f98796g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98797h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f98798b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String[] f98799c;

    /* compiled from: CharacterSetECI.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/barcode_encoder/common/CharacterSetECI$a;", "", "<init>", "()V", "", "", "Lcom/avito/android/barcode_encoder/common/CharacterSetECI;", "NAME_TO_ECI", "Ljava/util/Map;", "", "VALUE_TO_ECI", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        CharacterSetECI[] characterSetECIArr = {new CharacterSetECI("Cp437", 0, new int[]{0, 2}, new String[0]), new CharacterSetECI("ISO8859_1", 1, new int[]{1, 3}, "ISO-8859-1"), new CharacterSetECI("ISO8859_2", 2, 4, "ISO-8859-2"), new CharacterSetECI("ISO8859_3", 3, 5, "ISO-8859-3"), new CharacterSetECI("ISO8859_4", 4, 6, "ISO-8859-4"), new CharacterSetECI("ISO8859_5", 5, 7, "ISO-8859-5"), new CharacterSetECI("ISO8859_7", 6, 9, "ISO-8859-7"), new CharacterSetECI("ISO8859_9", 7, 11, "ISO-8859-9"), new CharacterSetECI("ISO8859_13", 8, 15, "ISO-8859-13"), new CharacterSetECI("ISO8859_15", 9, 17, "ISO-8859-15"), new CharacterSetECI("ISO8859_16", 10, 18, "ISO-8859-16"), new CharacterSetECI("SJIS", 11, 20, "Shift_JIS"), new CharacterSetECI("Cp1250", 12, 21, "windows-1250"), new CharacterSetECI("Cp1251", 13, 22, "windows-1251"), new CharacterSetECI("Cp1252", 14, 23, "windows-1252"), new CharacterSetECI("Cp1256", 15, 24, "windows-1256"), new CharacterSetECI("UnicodeBigUnmarked", 16, 25, "UTF-16BE", "UnicodeBig"), new CharacterSetECI("UTF8", 17, 26, Constants.ENCODING), new CharacterSetECI("ASCII", 18, new int[]{27, 170}, "US-ASCII"), new CharacterSetECI("Big5", 19, new int[]{28}, new String[0]), new CharacterSetECI("GB18030", 20, 29, "GB2312", "EUC_CN", "GBK"), new CharacterSetECI("EUC_KR", 21, 30, "EUC-KR")};
        f98796g = characterSetECIArr;
        f98797h = c.a(characterSetECIArr);
        f98793d = new a(null);
        f98794e = new HashMap();
        f98795f = new HashMap();
        for (CharacterSetECI characterSetECI : values()) {
            for (int i12 : characterSetECI.f98798b) {
                f98794e.put(Integer.valueOf(i12), characterSetECI);
            }
            f98795f.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.f98799c) {
                f98795f.put(str, characterSetECI);
            }
        }
    }

    public CharacterSetECI() {
        throw null;
    }

    public CharacterSetECI(String str, int i12, int i13, String... strArr) {
        this.f98798b = new int[]{i13};
        this.f98799c = strArr;
    }

    public static CharacterSetECI valueOf(String str) {
        return (CharacterSetECI) Enum.valueOf(CharacterSetECI.class, str);
    }

    public static CharacterSetECI[] values() {
        return (CharacterSetECI[]) f98796g.clone();
    }

    public CharacterSetECI(String str, int i12, int[] iArr, String... strArr) {
        this.f98798b = iArr;
        this.f98799c = strArr;
    }
}
