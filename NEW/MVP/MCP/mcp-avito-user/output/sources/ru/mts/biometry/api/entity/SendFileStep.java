package ru.mts.biometry.api.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendFileStep.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/api/entity/SendFileStep;", "", "Document", "Selfie", "Address", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SendFileStep {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SendFileStep[] $VALUES;
    public static final SendFileStep Address;
    public static final SendFileStep Document;
    public static final SendFileStep Selfie;

    static {
        SendFileStep sendFileStep = new SendFileStep("Document", 0);
        Document = sendFileStep;
        SendFileStep sendFileStep2 = new SendFileStep("Selfie", 1);
        Selfie = sendFileStep2;
        SendFileStep sendFileStep3 = new SendFileStep("Address", 2);
        Address = sendFileStep3;
        SendFileStep[] sendFileStepArr = {sendFileStep, sendFileStep2, sendFileStep3};
        $VALUES = sendFileStepArr;
        $ENTRIES = c.a(sendFileStepArr);
    }

    public SendFileStep() {
        throw null;
    }

    public static SendFileStep valueOf(String str) {
        return (SendFileStep) Enum.valueOf(SendFileStep.class, str);
    }

    public static SendFileStep[] values() {
        return (SendFileStep[]) $VALUES.clone();
    }
}
