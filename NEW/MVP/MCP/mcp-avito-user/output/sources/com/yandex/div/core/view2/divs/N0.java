package com.yandex.div.core.view2.divs;

import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38577v2;
import kotlin.Metadata;

/* compiled from: DivImageBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newPreview", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class N0 extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368165l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K0 f368166m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C38029k f368167n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368168o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C38577v2 f368169p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.errors.d f368170q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(C38029k c38029k, K0 k02, com.yandex.div.core.view2.divs.widgets.i iVar, com.yandex.div.core.view2.errors.d dVar, com.yandex.div.json.expressions.e eVar, C38577v2 c38577v2) {
        super(1);
        this.f368165l = iVar;
        this.f368166m = k02;
        this.f368167n = c38029k;
        this.f368168o = eVar;
        this.f368169p = c38577v2;
        this.f368170q = dVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        String str2 = str;
        com.yandex.div.core.view2.divs.widgets.i iVar = this.f368165l;
        if (!iVar.l() && !str2.equals(iVar.getCom.avito.android.remote.model.messenger.message_suggests.MessageSuggest.PREVIEW java.lang.String())) {
            iVar.setTag(R.id.image_loaded_flag, null);
            com.yandex.div.json.expressions.e eVar = this.f368168o;
            K0 k02 = this.f368166m;
            k02.getClass();
            boolean zL2 = iVar.l();
            C38577v2 c38577v2 = this.f368169p;
            k02.b(iVar, this.f368167n, eVar, c38577v2, this.f368170q, !zL2 && c38577v2.f376751u.a(eVar).booleanValue());
        }
        return kotlin.G0.f406611a;
    }
}
