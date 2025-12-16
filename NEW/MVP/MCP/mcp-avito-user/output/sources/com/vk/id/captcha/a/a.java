package com.vk.id.captcha.a;

import Y61.k;
import Y61.l;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* compiled from: CaptchaStorage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\nR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f"}, d2 = {"Lcom/vk/id/captcha/a/a;", "", "<init>", "()V", "", "p0", "p1", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    @k
    private final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    public final void a(@k String p02, @k String p12) {
        this.a.put(p02, p12);
    }

    @l
    public final String a(@k String p02) {
        return this.a.get(p02);
    }
}
