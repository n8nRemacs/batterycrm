package dC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CpaStatistics.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LdC0/d;", "", "", "title", "LdC0/c;", "actions", "spentAmount", "<init>", "(Ljava/lang/String;LdC0/c;LdC0/c;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LdC0/c;", "a", "()LdC0/c;", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dC0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39562d {

    @com.google.gson.annotations.c("actions")
    @l
    private final C39561c actions;

    @com.google.gson.annotations.c("spentAmount")
    @l
    private final C39561c spentAmount;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C39562d(@k String str, @l C39561c c39561c, @l C39561c c39561c2) {
        this.title = str;
        this.actions = c39561c;
        this.spentAmount = c39561c2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C39561c getActions() {
        return this.actions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39561c getSpentAmount() {
        return this.spentAmount;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
