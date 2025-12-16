package com.avito.android.barcode_encoder.qr;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Mode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/Mode;", "", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Mode {

    /* renamed from: d, reason: collision with root package name */
    public static final Mode f98806d;

    /* renamed from: e, reason: collision with root package name */
    public static final Mode f98807e;

    /* renamed from: f, reason: collision with root package name */
    public static final Mode f98808f;

    /* renamed from: g, reason: collision with root package name */
    public static final Mode f98809g;

    /* renamed from: h, reason: collision with root package name */
    public static final Mode f98810h;

    /* renamed from: i, reason: collision with root package name */
    public static final Mode f98811i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ Mode[] f98812j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98813k;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f98814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98815c;

    /* compiled from: Mode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/Mode$a;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        Mode mode = new Mode("TERMINATOR", 0, new int[]{0, 0, 0}, 0);
        Mode mode2 = new Mode("NUMERIC", 1, new int[]{10, 12, 14}, 1);
        f98806d = mode2;
        Mode mode3 = new Mode("ALPHANUMERIC", 2, new int[]{9, 11, 13}, 2);
        f98807e = mode3;
        Mode mode4 = new Mode("STRUCTURED_APPEND", 3, new int[]{0, 0, 0}, 3);
        Mode mode5 = new Mode("BYTE", 4, new int[]{8, 16, 16}, 4);
        f98808f = mode5;
        Mode mode6 = new Mode("ECI", 5, new int[]{0, 0, 0}, 7);
        f98809g = mode6;
        Mode mode7 = new Mode("KANJI", 6, new int[]{8, 10, 12}, 8);
        f98810h = mode7;
        Mode mode8 = new Mode("FNC1_FIRST_POSITION", 7, new int[]{0, 0, 0}, 5);
        f98811i = mode8;
        Mode[] modeArr = {mode, mode2, mode3, mode4, mode5, mode6, mode7, mode8, new Mode("FNC1_SECOND_POSITION", 8, new int[]{0, 0, 0}, 9), new Mode("HANZI", 9, new int[]{8, 10, 12}, 13)};
        f98812j = modeArr;
        f98813k = c.a(modeArr);
        new a(null);
    }

    public Mode(String str, int i12, int[] iArr, int i13) {
        this.f98814b = iArr;
        this.f98815c = i13;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) f98812j.clone();
    }

    public final int a(@l b bVar) {
        int i12 = bVar != null ? bVar.f98820a : 27;
        return this.f98814b[i12 <= 9 ? (char) 0 : i12 <= 26 ? (char) 1 : (char) 2];
    }
}
