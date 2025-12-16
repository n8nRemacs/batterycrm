package rP0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WalletPinVerificationContentResponse.kt */
@P
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"LrP0/b;", "", "LrP0/c;", "header", "LrP0/d;", "input", "LrP0/e;", "pin", "LrP0/g;", "verifyPinUrl", "", "verificationErrorMessage", "LrP0/f;", "recoverPinButton", "", "_currentAttempt", "LrP0/h;", "events", "LAP0/a;", "biometry", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onBackButtonActions", "<init>", "(LrP0/c;LrP0/d;LrP0/e;LrP0/g;Ljava/lang/String;LrP0/f;Ljava/lang/Integer;LrP0/h;LAP0/a;Ljava/util/List;)V", "LrP0/c;", "d", "()LrP0/c;", "LrP0/d;", "e", "()LrP0/d;", "LrP0/e;", "g", "()LrP0/e;", "LrP0/g;", "j", "()LrP0/g;", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "LrP0/f;", "h", "()LrP0/f;", "Ljava/lang/Integer;", "get_currentAttempt", "()Ljava/lang/Integer;", "LrP0/h;", "c", "()LrP0/h;", "LAP0/a;", "a", "()LAP0/a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rP0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47583b {

    @com.google.gson.annotations.c("current_pin_attempt")
    @l
    private final Integer _currentAttempt;

    @com.google.gson.annotations.c("biometry")
    @l
    private final AP0.a biometry;

    @com.google.gson.annotations.c("events")
    @l
    private final h events;

    @com.google.gson.annotations.c("header")
    @l
    private final C47584c header;

    @com.google.gson.annotations.c("input")
    @l
    private final d input;

    @com.google.gson.annotations.c("onBackButtonActions")
    @l
    private final List<BeduinAction> onBackButtonActions;

    @com.google.gson.annotations.c("pin")
    @k
    private final e pin;

    @com.google.gson.annotations.c("recover_pin_button")
    @l
    private final f recoverPinButton;

    @com.google.gson.annotations.c("verification_error_message")
    @l
    private final String verificationErrorMessage;

    @com.google.gson.annotations.c("verify_pin_url")
    @k
    private final g verifyPinUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public C47583b(@l C47584c c47584c, @l d dVar, @k e eVar, @k g gVar, @l String str, @l f fVar, @l Integer num, @l h hVar, @l AP0.a aVar, @l List<? extends BeduinAction> list) {
        this.header = c47584c;
        this.input = dVar;
        this.pin = eVar;
        this.verifyPinUrl = gVar;
        this.verificationErrorMessage = str;
        this.recoverPinButton = fVar;
        this._currentAttempt = num;
        this.events = hVar;
        this.biometry = aVar;
        this.onBackButtonActions = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AP0.a getBiometry() {
        return this.biometry;
    }

    public final int b() {
        Integer num = this._currentAttempt;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final h getEvents() {
        return this.events;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C47584c getHeader() {
        return this.header;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final d getInput() {
        return this.input;
    }

    @l
    public final List<BeduinAction> f() {
        return this.onBackButtonActions;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final e getPin() {
        return this.pin;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final f getRecoverPinButton() {
        return this.recoverPinButton;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getVerificationErrorMessage() {
        return this.verificationErrorMessage;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final g getVerifyPinUrl() {
        return this.verifyPinUrl;
    }

    public /* synthetic */ C47583b(C47584c c47584c, d dVar, e eVar, g gVar, String str, f fVar, Integer num, h hVar, AP0.a aVar, List list, int i12, C42822w c42822w) {
        this(c47584c, dVar, eVar, gVar, str, fVar, num, hVar, aVar, (i12 & 512) != 0 ? null : list);
    }
}
