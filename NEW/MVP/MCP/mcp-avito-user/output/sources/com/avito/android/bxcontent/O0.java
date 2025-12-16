package com.avito.android.bxcontent;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import kotlin.Metadata;
import wj.InterfaceC49636a;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwj/a$a;", "responseData", "Lkotlin/G0;", "invoke", "(Lwj/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class O0 extends kotlin.jvm.internal.N implements Y41.l<InterfaceC49636a.C12828a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f109369l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C29253t0 c29253t0) {
        super(1);
        this.f109369l = c29253t0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(InterfaceC49636a.C12828a c12828a) {
        InterfaceC49636a.C12828a c12828a2 = c12828a;
        ContactSource contactSource = ContactSource.f89919d;
        ScreenIdField screenIdField = ScreenIdField.f90251c;
        this.f109369l.W(c12828a2.f441762a, c12828a2.f441764c, contactSource, screenIdField, c12828a2.f441763b);
        return kotlin.G0.f406611a;
    }
}
