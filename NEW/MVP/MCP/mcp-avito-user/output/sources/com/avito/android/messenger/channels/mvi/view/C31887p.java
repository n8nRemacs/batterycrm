package com.avito.android.messenger.channels.mvi.view;

import FY.a;
import com.avito.android.messenger.analytics.C31649e;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isUnreadSelected", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.view.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31887p extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31886o f188790l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FY.a, G0> f188791m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31887p(C31886o c31886o, Y41.l<? super FY.a, G0> lVar) {
        super(1);
        this.f188790l = c31886o;
        this.f188791m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C31886o c31886o = this.f188790l;
        c31886o.f188780e.b();
        if (zBooleanValue) {
            c31886o.f188779d.c(new C31649e("chat_filters"));
        }
        ((C31876e) this.f188791m).invoke(new a.b(zBooleanValue));
        return G0.f406611a;
    }
}
