package wD0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ConfigureAutoProlong.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LwD0/b;", "", "", "title", "", "enabled", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "a", "()Z", "c", "(Z)V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wD0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49488b {

    @com.google.gson.annotations.c("enabled")
    private boolean enabled;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C49488b(@k String str, boolean z12) {
        this.title = str;
        this.enabled = z12;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final void c(boolean z12) {
        this.enabled = z12;
    }
}
