package com.avito.android.confirm_documents_bottom_sheet.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocumentStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/DocumentStatus;", "", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocumentStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final DocumentStatus f125595b;

    /* renamed from: c, reason: collision with root package name */
    public static final DocumentStatus f125596c;

    /* renamed from: d, reason: collision with root package name */
    public static final DocumentStatus f125597d;

    /* renamed from: e, reason: collision with root package name */
    public static final DocumentStatus f125598e;

    /* renamed from: f, reason: collision with root package name */
    public static final DocumentStatus f125599f;

    /* renamed from: g, reason: collision with root package name */
    public static final DocumentStatus f125600g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ DocumentStatus[] f125601h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f125602i;

    static {
        DocumentStatus documentStatus = new DocumentStatus("NOT_STARTED", 0);
        f125595b = documentStatus;
        DocumentStatus documentStatus2 = new DocumentStatus("IN_PROGRESS", 1);
        f125596c = documentStatus2;
        DocumentStatus documentStatus3 = new DocumentStatus("SUCCESS", 2);
        f125597d = documentStatus3;
        DocumentStatus documentStatus4 = new DocumentStatus("FAILED", 3);
        f125598e = documentStatus4;
        DocumentStatus documentStatus5 = new DocumentStatus("EXPIRED", 4);
        f125599f = documentStatus5;
        DocumentStatus documentStatus6 = new DocumentStatus("DISABLED", 5);
        f125600g = documentStatus6;
        DocumentStatus[] documentStatusArr = {documentStatus, documentStatus2, documentStatus3, documentStatus4, documentStatus5, documentStatus6};
        f125601h = documentStatusArr;
        f125602i = c.a(documentStatusArr);
    }

    public DocumentStatus() {
        throw null;
    }

    public static DocumentStatus valueOf(String str) {
        return (DocumentStatus) Enum.valueOf(DocumentStatus.class, str);
    }

    public static DocumentStatus[] values() {
        return (DocumentStatus[]) f125601h.clone();
    }
}
