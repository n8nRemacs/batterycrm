package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197594l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerDialogDeeplink f197595m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f197596n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f197597o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D8.c f197598p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, String str, String str2, D8.c cVar) {
        super(1);
        this.f197594l = aVar;
        this.f197595m = messengerIcebreakerDialogDeeplink;
        this.f197596n = str;
        this.f197597o = str2;
        this.f197598p = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        a aVar = this.f197594l;
        List listSingletonList = Collections.singletonList(new c.a.C3719a(aVar.f197569r.getString(R.string.messenger_icebreakers_try_again), true, null, new q(aVar, this.f197595m, this.f197596n, this.f197597o, this.f197598p), 4, null));
        a.i.C4057a.d(aVar.f197559h, InterfaceC35741a1.a.a(aVar.f197571t, th3, null, null, 6), null, listSingletonList, new f.c(th3), 5000, null, null, null, 1994);
        return G0.f406611a;
    }
}
