package nP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsLoginSectionDto.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LnP0/g;", "", "", "title", "LnP0/a;", "biometry", "<init>", "(Ljava/lang/String;LnP0/a;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LnP0/a;", "a", "()LnP0/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nP0.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44320g {

    @com.google.gson.annotations.c("biometry")
    @l
    private final C44314a biometry;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C44320g(@l String str, @l C44314a c44314a) {
        this.title = str;
        this.biometry = c44314a;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C44314a getBiometry() {
        return this.biometry;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean c() {
        C44314a c44314a = this.biometry;
        if (c44314a != null) {
            return c44314a.d();
        }
        return true;
    }
}
