package com.avito.android.beduin.common.component.selector_card_group;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel;
import com.avito.android.beduin.common.component.selector_card_group.SelectorCardGroupTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdsTransform;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectorCardGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "changedId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.selector_card_group.a f102544l;

    /* compiled from: BeduinSelectorCardGroupComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102545a;

        static {
            int[] iArr = new int[BeduinSelectorCardGroupModel.SelectionType.values().length];
            try {
                iArr[BeduinSelectorCardGroupModel.SelectionType.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinSelectorCardGroupModel.SelectionType.Multiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102545a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.beduin.common.component.selector_card_group.a aVar) {
        super(1);
        this.f102544l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        List listSingletonList;
        Object next;
        String str2 = str;
        com.avito.android.beduin.common.component.selector_card_group.a aVar = this.f102544l;
        boolean zContains = aVar.f102537j.contains(str2);
        BeduinSelectorCardGroupModel beduinSelectorCardGroupModel = aVar.f102533f;
        int i12 = a.f102545a[beduinSelectorCardGroupModel.j().ordinal()];
        if (i12 == 1) {
            if (!zContains) {
                listSingletonList = Collections.singletonList(str2);
            }
            return G0.f406611a;
        }
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        listSingletonList = zContains ? C42745f0.c0(beduinSelectorCardGroupModel.h(), str2) : C42745f0.i0(str2, beduinSelectorCardGroupModel.h());
        com.avito.android.beduin_shared.model.utils.j.a(aVar.f102534g, beduinSelectorCardGroupModel.getF100947b(), new SelectedIdsTransform(listSingletonList), new SelectorCardGroupTransform.ErrorState(false));
        InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f102535h;
        if (!zContains) {
            Iterator<T> it = beduinSelectorCardGroupModel.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((BeduinSelectorCardGroupModel.Option) next).getId(), str2)) {
                    break;
                }
            }
            BeduinSelectorCardGroupModel.Option option = (BeduinSelectorCardGroupModel.Option) next;
            com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b, option != null ? option.d() : null);
        }
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b, beduinSelectorCardGroupModel.e());
        return G0.f406611a;
    }
}
