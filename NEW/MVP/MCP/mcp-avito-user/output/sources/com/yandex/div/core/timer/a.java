package com.yandex.div.core.timer;

import Y61.l;
import com.yandex.div.core.view2.C38029k;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DivTimerEventDispatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/timer/a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.d f367701a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f367702b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f367703c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    @l
    public Timer f367704d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public C38029k f367705e;

    public a(@Y61.k com.yandex.div.core.view2.errors.d dVar) {
        this.f367701a = dVar;
    }

    public final void a(@Y61.k C38029k c38029k) {
        if (L.f(this.f367705e, c38029k)) {
            for (i iVar : this.f367702b.values()) {
                iVar.f367728e = null;
                iVar.f367733j.h();
                iVar.f367732i = true;
            }
            Timer timer = this.f367704d;
            if (timer != null) {
                timer.cancel();
            }
            this.f367704d = null;
        }
    }
}
