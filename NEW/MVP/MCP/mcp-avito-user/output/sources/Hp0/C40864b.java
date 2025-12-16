package hP0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletPinCreationResponse.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LhP0/b;", "", "LhP0/d;", "header", "LhP0/c;", "firstInput", "LhP0/f;", "secondInput", "LhP0/e;", "pin", "LhP0/k;", "savePinUrl", "LhP0/j;", "errors", "LhP0/a;", "events", "<init>", "(LhP0/d;LhP0/c;LhP0/f;LhP0/e;LhP0/k;LhP0/j;LhP0/a;)V", "LhP0/d;", "d", "()LhP0/d;", "LhP0/c;", "c", "()LhP0/c;", "LhP0/f;", "g", "()LhP0/f;", "LhP0/e;", "e", "()LhP0/e;", "LhP0/k;", "f", "()LhP0/k;", "LhP0/j;", "a", "()LhP0/j;", "LhP0/a;", "b", "()LhP0/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hP0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40864b {

    @com.google.gson.annotations.c("errors")
    @Y61.l
    private final j errors;

    @com.google.gson.annotations.c("events")
    @Y61.l
    private final C40863a events;

    @com.google.gson.annotations.c("first_input")
    @Y61.l
    private final c firstInput;

    @com.google.gson.annotations.c("header")
    @Y61.l
    private final d header;

    @com.google.gson.annotations.c("pin")
    @Y61.k
    private final e pin;

    @com.google.gson.annotations.c("save_pin_url")
    @Y61.k
    private final k savePinUrl;

    @com.google.gson.annotations.c("second_input")
    @Y61.l
    private final f secondInput;

    public C40864b(@Y61.l d dVar, @Y61.l c cVar, @Y61.l f fVar, @Y61.k e eVar, @Y61.k k kVar, @Y61.l j jVar, @Y61.l C40863a c40863a) {
        this.header = dVar;
        this.firstInput = cVar;
        this.secondInput = fVar;
        this.pin = eVar;
        this.savePinUrl = kVar;
        this.errors = jVar;
        this.events = c40863a;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final j getErrors() {
        return this.errors;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C40863a getEvents() {
        return this.events;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final c getFirstInput() {
        return this.firstInput;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final d getHeader() {
        return this.header;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final e getPin() {
        return this.pin;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final k getSavePinUrl() {
        return this.savePinUrl;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final f getSecondInput() {
        return this.secondInput;
    }
}
