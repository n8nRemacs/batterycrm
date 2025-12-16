package com.avito.android.app_rater;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppRaterLauncherImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f91784l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(0);
        this.f91784l = bVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(Duration.between(this.f91784l.f91781d.a(), LocalDateTime.now(ZoneOffset.UTC)).compareTo(b.f91777g) > 0);
    }
}
