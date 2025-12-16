package com.avito.android.barcode_encoder.code128;

import Pg.e;
import Y61.k;
import com.avito.android.barcode_encoder.BarcodeFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Code128Writer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/barcode_encoder/code128/b;", "LPg/e;", "<init>", "()V", "a", "b", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C2972b f98772c = new C2972b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Code128Writer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/code128/b$a;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f98773b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f98774c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f98775d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f98776e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f98777f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f98778g;

        static {
            a aVar = new a("UNCODABLE", 0);
            f98773b = aVar;
            a aVar2 = new a("ONE_DIGIT", 1);
            f98774c = aVar2;
            a aVar3 = new a("TWO_DIGITS", 2);
            f98775d = aVar3;
            a aVar4 = new a("FNC_1", 3);
            f98776e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f98777f = aVarArr;
            f98778g = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f98777f.clone();
        }
    }

    /* compiled from: Code128Writer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\f\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/avito/android/barcode_encoder/code128/b$b;", "", "<init>", "()V", "", "CODE_CODE_A", "I", "CODE_CODE_B", "CODE_CODE_C", "CODE_FNC_1", "CODE_FNC_2", "CODE_FNC_3", "CODE_FNC_4_A", "CODE_FNC_4_B", "CODE_START_A", "CODE_START_B", "CODE_START_C", "CODE_STOP", "", "ESCAPE_FNC_1", "C", "ESCAPE_FNC_2", "ESCAPE_FNC_3", "ESCAPE_FNC_4", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.barcode_encoder.code128.b$b, reason: collision with other inner class name */
    public static final class C2972b {
        public /* synthetic */ C2972b(C42822w c42822w) {
            this();
        }

        public static a a(int i12, String str) {
            int length = str.length();
            if (i12 >= length) {
                return a.f98773b;
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt == 241) {
                return a.f98776e;
            }
            if (L.g(cCharAt, 48) < 0 || L.g(cCharAt, 57) > 0) {
                return a.f98773b;
            }
            int i13 = i12 + 1;
            if (i13 >= length) {
                return a.f98774c;
            }
            char cCharAt2 = str.charAt(i13);
            return (L.g(cCharAt2, 48) < 0 || L.g(cCharAt2, 57) > 0) ? a.f98774c : a.f98775d;
        }

        @k
        public static boolean[] b(int i12, @k ArrayList arrayList) {
            int[][] iArr = com.avito.android.barcode_encoder.code128.a.f98771a;
            arrayList.add(iArr[i12 % 103]);
            arrayList.add(iArr[106]);
            Iterator it = arrayList.iterator();
            int iA2 = 0;
            int i13 = 0;
            while (it.hasNext()) {
                for (int i14 : (int[]) it.next()) {
                    i13 += i14;
                }
            }
            boolean[] zArr = new boolean[i13];
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int[] iArr2 = (int[]) it2.next();
                e.f13231a.getClass();
                iA2 += e.a.a(zArr, iA2, iArr2, true);
            }
            return zArr;
        }

        public C2972b() {
        }
    }

    @Override // Pg.e
    @k
    public final boolean[] b(@k String str) {
        return c(str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // Pg.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] c(@Y61.k java.lang.String r27, @Y61.l java.util.Map<com.avito.android.barcode_encoder.EncodeHintType, ?> r28) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.barcode_encoder.code128.b.c(java.lang.String, java.util.Map):boolean[]");
    }

    @Override // Pg.e
    @k
    public final Collection<BarcodeFormat> e() {
        return Collections.singletonList(BarcodeFormat.CODE128);
    }
}
