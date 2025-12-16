package vk;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1AcceptB2BResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lvk/b;", "", "Lvk/a;", "action", "", "header", "Lvk/c;", "image", "subHeader", "<init>", "(Lvk/a;Ljava/lang/String;Lvk/c;Ljava/lang/String;)V", "Lvk/a;", "a", "()Lvk/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lvk/c;", "c", "()Lvk/c;", "d", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vk.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49340b {

    @com.google.gson.annotations.c("action")
    @k
    private final C49339a action;

    @com.google.gson.annotations.c("header")
    @k
    private final String header;

    @com.google.gson.annotations.c("image")
    @k
    private final C49341c image;

    @com.google.gson.annotations.c("subHeader")
    @k
    private final String subHeader;

    public C49340b(@k C49339a c49339a, @k String str, @k C49341c c49341c, @k String str2) {
        this.action = c49339a;
        this.header = str;
        this.image = c49341c;
        this.subHeader = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C49339a getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C49341c getImage() {
        return this.image;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getSubHeader() {
        return this.subHeader;
    }
}
