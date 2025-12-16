package com.avito.android.beduin.common.actionhandler.option_selector;

import Ui.InterfaceC15523b;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.ParametersTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: OpenOptionSelectorActionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$Option;", "selectedOption", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$Option;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<OpenOptionSelectorAction.Option, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f100311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OpenOptionSelectorAction f100312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OpenOptionSelectorAction openOptionSelectorAction, i iVar) {
        super(1);
        this.f100311l = iVar;
        this.f100312m = openOptionSelectorAction;
    }

    @Override // Y41.l
    public final G0 invoke(OpenOptionSelectorAction.Option option) {
        OpenOptionSelectorAction.Option option2 = option;
        i iVar = this.f100311l;
        InterfaceC15523b<BeduinAction> interfaceC15523b = iVar.f100318d.get();
        OpenOptionSelectorAction openOptionSelectorAction = this.f100312m;
        List<String> listC = openOptionSelectorAction.getResultReceiver().c();
        int iF2 = P0.f(C42745f0.q(listC, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : listC) {
            String str = (String) obj;
            String callerTitle = option2.getCallerTitle();
            if (callerTitle == null) {
                callerTitle = option2.getTitle();
            }
            TextTransform textTransform = new TextTransform(callerTitle);
            Map<String, Object> params = option2.getParams();
            if (params == null) {
                params = P0.c();
            }
            linkedHashMap.put(obj, C42745f0.U(textTransform, new ParametersTransform(com.avito.android.authorization.auto_recovery.phone_confirm.b.l(r.q(str, "-selectedOption"), option2.getId(), params)), new ErrorMessageTransform(null)));
        }
        Iterator<T> it = iVar.f100319e.getAll().iterator();
        while (it.hasNext()) {
            ((InterfaceC43779a) it.next()).h(new d.e(linkedHashMap));
        }
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b, openOptionSelectorAction.c());
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b, option2.d());
        return G0.f406611a;
    }
}
