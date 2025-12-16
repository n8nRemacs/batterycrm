package ru.cyberity.cbr.core.analytics;

import kotlin.Metadata;

/* compiled from: AnalyticsEnums.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/analytics/Domain;", "", "Lru/cyberity/cbr/core/analytics/m;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ui", "PrimaryAction", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public enum Domain implements m {
    Ui("ui"),
    PrimaryAction("op");


    @Y61.k
    private final String text;

    Domain(String str) {
        this.text = str;
    }

    @Override // ru.cyberity.cbr.core.analytics.m
    @Y61.k
    public String getText() {
        return this.text;
    }
}
