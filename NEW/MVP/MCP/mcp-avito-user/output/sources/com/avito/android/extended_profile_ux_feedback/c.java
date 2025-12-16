package com.avito.android.extended_profile_ux_feedback;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileUxFeedbackHelperImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/extended_profile_ux_feedback/a;", "", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.a<Map<a, ? extends Long>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f154145l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f154145l = dVar;
    }

    @Override // Y41.a
    public final Map<a, ? extends Long> invoke() {
        d dVar = this.f154145l;
        i iVar = dVar.f154147b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : dVar.f154151f) {
            linkedHashMap.put(aVar, Long.valueOf(iVar.f154159a.getLong(aVar.f154139a, 0L)));
        }
        return linkedHashMap;
    }
}
