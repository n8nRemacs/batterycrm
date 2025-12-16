package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class a91 extends mw0 {

    /* renamed from: d, reason: collision with root package name */
    public static final rg.a<a91> f383446d = new L0(4);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f383447b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f383448c;

    public a91() {
        this.f383447b = false;
        this.f383448c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a91 b(Bundle bundle) {
        db.a(bundle.getInt(Integer.toString(0, 36), -1) == 3);
        return bundle.getBoolean(Integer.toString(1, 36), false) ? new a91(bundle.getBoolean(Integer.toString(2, 36), false)) : new a91();
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof a91)) {
            return false;
        }
        a91 a91Var = (a91) obj;
        return this.f383448c == a91Var.f383448c && this.f383447b == a91Var.f383447b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f383447b), Boolean.valueOf(this.f383448c)});
    }

    public a91(boolean z12) {
        this.f383447b = true;
        this.f383448c = z12;
    }
}
