package com.avito.android.advert.item.select.parameters_v3;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: AutoSelectParametersV3Presenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "phone", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.p<String, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28201d f79575l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f79576m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C28201d c28201d, z zVar) {
        super(2);
        this.f79575l = c28201d;
        this.f79576m = zVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int i12 = C28201d.f79565j;
        C28201d c28201d = this.f79575l;
        if (str3.length() == 10) {
            b.a.a(c28201d.f79567c, c28201d.f79570f.get().b(C43066x.a0(str4, ".phone_number", "7".concat(str3), false)), null, null, 6);
        } else {
            this.f79576m.D6();
        }
        return G0.f406611a;
    }
}
