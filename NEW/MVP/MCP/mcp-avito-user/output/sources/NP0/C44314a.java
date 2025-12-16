package nP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsLoginSectionDto.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LnP0/a;", "", "", "title", "description", "LnP0/c;", "switch", "<init>", "(Ljava/lang/String;Ljava/lang/String;LnP0/c;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "LnP0/c;", "b", "()LnP0/c;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44314a {

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("switch")
    @l
    private final C44316c switch;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C44314a(@l String str, @l String str2, @l C44316c c44316c) {
        this.title = str;
        this.description = str2;
        this.switch = c44316c;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C44316c getSwitch() {
        return this.switch;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean d() {
        String str = this.title;
        if (str == null || str.length() == 0) {
            return true;
        }
        C44316c c44316c = this.switch;
        return c44316c != null ? c44316c.c() : true;
    }
}
