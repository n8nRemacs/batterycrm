package io.ktor.http;

import kotlin.Metadata;

/* compiled from: CookieUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* renamed from: io.ktor.http.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41547u extends kotlin.jvm.internal.N implements Y41.l<Character, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C41547u f400120l = new C41547u();

    public C41547u() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(Character ch2) {
        return Boolean.valueOf(ch2.charValue() == ':');
    }
}
