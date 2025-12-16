package com.avito.android.messenger.conversation.mvi.menu;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.deep_linking.links.DeleteChannelLink;
import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelMenuView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class y extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.o f191551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t.c f191552m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f191553n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t.e.c f191554o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f191555p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.avito.android.lib.design.bottom_sheet.o oVar, t.c cVar, u uVar, t.e.c cVar2, int i12) {
        super(1);
        this.f191551l = oVar;
        this.f191552m = cVar;
        this.f191553n = uVar;
        this.f191554o = cVar2;
        this.f191555p = i12;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        this.f191551l.r();
        t.c cVar = this.f191552m;
        InterfaceC28464o interfaceC28464o = cVar.f191513d;
        u uVar = this.f191553n;
        if (interfaceC28464o != null) {
            uVar.f191535c.c(interfaceC28464o);
        }
        C30277e1 c30277e1 = uVar.f191536d;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[47];
        boolean zBooleanValue = ((Boolean) c30277e1.f144987U.a().invoke()).booleanValue();
        com.avito.android.messenger.conversation.confirmation_dialog.a aVar = uVar.f191541i;
        if (zBooleanValue && (cVar.f191515f instanceof DeleteChannelLink)) {
            Resources resources = uVar.f191540h;
            aVar.b(new ActionConfirmation(resources.getString(R.string.messenger_chat_deletion_confirmation_popup_title), resources.getString(R.string.messenger_chat_deletion_confirmation_popup_message), resources.getString(R.string.messenger_chat_deletion_confirmation_popup_confirm), resources.getString(R.string.messenger_chat_deletion_confirmation_popup_cancel)), new x(uVar, cVar));
        } else {
            t.b bVar = this.f191554o.f191530a;
            ActionConfirmation actionConfirmation = cVar.f191512c;
            int i12 = this.f191555p;
            if (actionConfirmation != null) {
                aVar.b(actionConfirmation, new v(bVar, i12));
            } else {
                bVar.f191507c.invoke(Integer.valueOf(i12));
            }
        }
        return G0.f406611a;
    }
}
