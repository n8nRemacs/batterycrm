package com.vk.id;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OAuth.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/OAuth;", "", "serverName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerName$vkid_release", "()Ljava/lang/String;", "VK", "MAIL", "OK", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OAuth {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OAuth[] $VALUES;

    @k
    private final String serverName;

    /* renamed from: VK, reason: collision with root package name */
    public static final OAuth f366766VK = new OAuth("VK", 0, "vkid");
    public static final OAuth MAIL = new OAuth("MAIL", 1, "mail_ru");

    /* renamed from: OK, reason: collision with root package name */
    public static final OAuth f366765OK = new OAuth("OK", 2, "ok_ru");

    private static final /* synthetic */ OAuth[] $values() {
        return new OAuth[]{f366766VK, MAIL, f366765OK};
    }

    static {
        OAuth[] oAuthArr$values = $values();
        $VALUES = oAuthArr$values;
        $ENTRIES = c.a(oAuthArr$values);
    }

    private OAuth(String str, int i12, String str2) {
        this.serverName = str2;
    }

    public static OAuth valueOf(String str) {
        return (OAuth) Enum.valueOf(OAuth.class, str);
    }

    public static OAuth[] values() {
        return (OAuth[]) $VALUES.clone();
    }

    @k
    /* renamed from: getServerName$vkid_release, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }
}
