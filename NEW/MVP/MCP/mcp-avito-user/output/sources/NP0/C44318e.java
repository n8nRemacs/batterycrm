package nP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import dP0.C39614a;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsDto.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LnP0/e;", "", "LdP0/a;", "biometryToggleSwitchOn", "biometryToggleSwitchOff", "biometryToggleSwitchOnFail", "<init>", "(LdP0/a;LdP0/a;LdP0/a;)V", "LdP0/a;", "b", "()LdP0/a;", "a", "c", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nP0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44318e {

    @com.google.gson.annotations.c("biometry_toggle_switch_off")
    @l
    private final C39614a biometryToggleSwitchOff;

    @com.google.gson.annotations.c("biometry_toggle_switch_on")
    @l
    private final C39614a biometryToggleSwitchOn;

    @com.google.gson.annotations.c("biometry_toggle_switch_on_fail")
    @l
    private final C39614a biometryToggleSwitchOnFail;

    public C44318e(@l C39614a c39614a, @l C39614a c39614a2, @l C39614a c39614a3) {
        this.biometryToggleSwitchOn = c39614a;
        this.biometryToggleSwitchOff = c39614a2;
        this.biometryToggleSwitchOnFail = c39614a3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C39614a getBiometryToggleSwitchOff() {
        return this.biometryToggleSwitchOff;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39614a getBiometryToggleSwitchOn() {
        return this.biometryToggleSwitchOn;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C39614a getBiometryToggleSwitchOnFail() {
        return this.biometryToggleSwitchOnFail;
    }
}
