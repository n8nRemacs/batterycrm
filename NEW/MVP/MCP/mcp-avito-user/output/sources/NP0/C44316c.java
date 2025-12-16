package nP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsLoginSectionDto.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LnP0/c;", "", "LnP0/b;", "onEnabled", "onDisabledSwitchTap", "<init>", "(LnP0/b;LnP0/b;)V", "LnP0/b;", "b", "()LnP0/b;", "a", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nP0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44316c {

    @com.google.gson.annotations.c("onDisabledSwitchTap")
    @l
    private final C44315b onDisabledSwitchTap;

    @com.google.gson.annotations.c("onEnabled")
    @l
    private final C44315b onEnabled;

    public C44316c(@l C44315b c44315b, @l C44315b c44315b2) {
        this.onEnabled = c44315b;
        this.onDisabledSwitchTap = c44315b2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C44315b getOnDisabledSwitchTap() {
        return this.onDisabledSwitchTap;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C44315b getOnEnabled() {
        return this.onEnabled;
    }

    public final boolean c() {
        C44315b c44315b = this.onEnabled;
        if (c44315b != null) {
            return c44315b.b();
        }
        return true;
    }
}
