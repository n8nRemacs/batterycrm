package ru.mts.biometry.sdk.domain.entity.polling.status;

import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f436398b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f436399c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f436400d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f436401e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f436402f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f436403g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f436404h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f436405i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f436406j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f436407k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ d[] f436408l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f436409m;

    static {
        d dVar = new d("Unknown", 0);
        d dVar2 = new d("AwaitingSelfiePhotos", 1);
        f436398b = dVar2;
        d dVar3 = new d("AwaitingSelfieChecking", 2);
        f436399c = dVar3;
        d dVar4 = new d("AwaitingSelfieCheckNotPassedDecision", 3);
        f436400d = dVar4;
        d dVar5 = new d("AwaitingDocumentTypeSelection", 4);
        d dVar6 = new d("AwaitingDocumentPhotos", 5);
        d dVar7 = new d("AwaitingDocumentRecognition", 6);
        f436401e = dVar7;
        d dVar8 = new d("AwaitingDocumentNotRecognisedDecision", 7);
        f436402f = dVar8;
        d dVar9 = new d("AwaitingMismatchedDocumentTypeDecision", 8);
        d dVar10 = new d("AwaitingDocumentRecognisedDataConfirmation", 9);
        f436403g = dVar10;
        d dVar11 = new d("AwaitingAddressPhoto", 10);
        f436404h = dVar11;
        d dVar12 = new d("AwaitingAddressRecognitionFormData", 11);
        f436405i = dVar12;
        d dVar13 = new d("AwaitingRecognitionOnboarding", 12);
        d dVar14 = new d("AwaitingDocumentOnboarding", 13);
        d dVar15 = new d("AwaitingDocumentPagePhotos", 14);
        d dVar16 = new d("AwaitingDocumentPageRecognition", 15);
        f436406j = dVar16;
        d dVar17 = new d("AwaitingDocumentPageNotRecognisedDecision", 16);
        f436407k = dVar17;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, new d("AwaitingDocumentPageRecognisedDataConfirmation", 17), new d("AwaitingDocumentNotValidDecision", 18), new d("AwaitingRecognitionNotValidDecision", 19), new d("Empty", 20)};
        f436408l = dVarArr;
        f436409m = c.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f436408l.clone();
    }
}
