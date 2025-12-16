package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Ljh/b;", "", "Ljh/a;", "helpBbipAction", "nextBbipAction", "skipBbipAction", "<init>", "(Ljh/a;Ljh/a;Ljh/a;)V", "Ljh/a;", "a", "()Ljh/a;", "b", "c", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42381b {

    @com.google.gson.annotations.c("help")
    @Y61.k
    private final C42380a helpBbipAction;

    @com.google.gson.annotations.c("next")
    @Y61.k
    private final C42380a nextBbipAction;

    @com.google.gson.annotations.c("skip")
    @Y61.k
    private final C42380a skipBbipAction;

    public C42381b(@Y61.k C42380a c42380a, @Y61.k C42380a c42380a2, @Y61.k C42380a c42380a3) {
        this.helpBbipAction = c42380a;
        this.nextBbipAction = c42380a2;
        this.skipBbipAction = c42380a3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C42380a getHelpBbipAction() {
        return this.helpBbipAction;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C42380a getNextBbipAction() {
        return this.nextBbipAction;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C42380a getSkipBbipAction() {
        return this.skipBbipAction;
    }
}
