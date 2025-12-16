package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HostViewRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.host_view.UserAdvertsHostViewRenderer", f = "HostViewRenderer.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5}, l = {512, 514, 515, 516, 517, 518}, m = "renderTabs", n = {"this", "pagerItems", "selectedPosition", "this", "selectedPosition", "this", "selectedPosition", "this", "selectedPosition", "this", "selectedPosition", "this"}, s = {"L$0", "L$1", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0"})
/* loaded from: classes5.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f313090q;

    /* renamed from: r, reason: collision with root package name */
    public List f313091r;

    /* renamed from: s, reason: collision with root package name */
    public int f313092s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f313093t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f313094u;

    /* renamed from: v, reason: collision with root package name */
    public int f313095v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f313094u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f313093t = obj;
        this.f313095v |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.a(this.f313094u, null, null, 0, this);
    }
}
