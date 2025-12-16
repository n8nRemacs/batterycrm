package rP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import dP0.C39614a;
import kotlin.Metadata;

/* compiled from: WalletPinVerificationContentResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"LrP0/h;", "", "LdP0/a;", "pageLoad", "startFilling", "passcodeCorrect", "passcodeIncorrect", "doNotRememberPasscode", "biometryStarted", "biometrySuccess", "biometryFail", "<init>", "(LdP0/a;LdP0/a;LdP0/a;LdP0/a;LdP0/a;LdP0/a;LdP0/a;LdP0/a;)V", "LdP0/a;", "e", "()LdP0/a;", "h", "f", "g", "d", "b", "c", "a", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    @com.google.gson.annotations.c("biometry_fail")
    @l
    private final C39614a biometryFail;

    @com.google.gson.annotations.c("biometry_started")
    @l
    private final C39614a biometryStarted;

    @com.google.gson.annotations.c("biometry_success")
    @l
    private final C39614a biometrySuccess;

    @com.google.gson.annotations.c("do_not_remember_passcode")
    @l
    private final C39614a doNotRememberPasscode;

    @com.google.gson.annotations.c("page_load")
    @l
    private final C39614a pageLoad;

    @com.google.gson.annotations.c("passcode_correct")
    @l
    private final C39614a passcodeCorrect;

    @com.google.gson.annotations.c("passcode_incorrect")
    @l
    private final C39614a passcodeIncorrect;

    @com.google.gson.annotations.c("start_filling")
    @l
    private final C39614a startFilling;

    public h(@l C39614a c39614a, @l C39614a c39614a2, @l C39614a c39614a3, @l C39614a c39614a4, @l C39614a c39614a5, @l C39614a c39614a6, @l C39614a c39614a7, @l C39614a c39614a8) {
        this.pageLoad = c39614a;
        this.startFilling = c39614a2;
        this.passcodeCorrect = c39614a3;
        this.passcodeIncorrect = c39614a4;
        this.doNotRememberPasscode = c39614a5;
        this.biometryStarted = c39614a6;
        this.biometrySuccess = c39614a7;
        this.biometryFail = c39614a8;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C39614a getBiometryFail() {
        return this.biometryFail;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39614a getBiometryStarted() {
        return this.biometryStarted;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C39614a getBiometrySuccess() {
        return this.biometrySuccess;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C39614a getDoNotRememberPasscode() {
        return this.doNotRememberPasscode;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C39614a getPageLoad() {
        return this.pageLoad;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final C39614a getPasscodeCorrect() {
        return this.passcodeCorrect;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final C39614a getPasscodeIncorrect() {
        return this.passcodeIncorrect;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final C39614a getStartFilling() {
        return this.startFilling;
    }
}
