package nP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsDto.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LnP0/d;", "", "LnP0/f;", "headerDto", "LnP0/g;", "loginSection", "LnP0/e;", "events", "<init>", "(LnP0/f;LnP0/g;LnP0/e;)V", "LnP0/f;", "b", "()LnP0/f;", "LnP0/g;", "c", "()LnP0/g;", "LnP0/e;", "a", "()LnP0/e;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nP0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44317d {

    @com.google.gson.annotations.c("events")
    @l
    private final C44318e events;

    @com.google.gson.annotations.c("header")
    @l
    private final C44319f headerDto;

    @com.google.gson.annotations.c("login")
    @l
    private final C44320g loginSection;

    public C44317d(@l C44319f c44319f, @l C44320g c44320g, @l C44318e c44318e) {
        this.headerDto = c44319f;
        this.loginSection = c44320g;
        this.events = c44318e;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C44318e getEvents() {
        return this.events;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C44319f getHeaderDto() {
        return this.headerDto;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C44320g getLoginSection() {
        return this.loginSection;
    }

    public final boolean d() {
        C44320g c44320g = this.loginSection;
        if (c44320g != null) {
            return c44320g.c();
        }
        return true;
    }
}
