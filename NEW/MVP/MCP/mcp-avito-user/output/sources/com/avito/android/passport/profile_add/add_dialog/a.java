package com.avito.android.passport.profile_add.add_dialog;

import Y41.l;
import android.app.Activity;
import android.content.Context;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;

/* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements l<Context, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f211186l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(1);
        this.f211186l = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(Context context) {
        c cVar = this.f211186l;
        kotlin.reflect.d<? extends DeepLink> dVarB = m0.f406844a.b(PassportAddProfileLink.class);
        cVar.f211196m.b((Activity) context, dVarB);
        return G0.f406611a;
    }
}
