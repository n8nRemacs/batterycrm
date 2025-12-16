package com.avito.android.beduin.common.component.selector_card_group;

import com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectorCardGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/n;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/selector_card_group/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<n, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinSelectorCardGroupChange f102540l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.selector_card_group.a f102541m;

    /* compiled from: BeduinSelectorCardGroupComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BeduinSelectorCardGroupChange.values().length];
            try {
                iArr[BeduinSelectorCardGroupChange.f102512c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinSelectorCardGroupChange.f102513d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BeduinSelectorCardGroupChange beduinSelectorCardGroupChange, com.avito.android.beduin.common.component.selector_card_group.a aVar) {
        super(1);
        this.f102540l = beduinSelectorCardGroupChange;
        this.f102541m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(n nVar) {
        n nVar2 = nVar;
        int iOrdinal = this.f102540l.ordinal();
        com.avito.android.beduin.common.component.selector_card_group.a aVar = this.f102541m;
        if (iOrdinal == 0) {
            List<BeduinSelectorCardGroupModel.Option> listF = aVar.f102533f.f();
            int iF2 = P0.f(C42745f0.q(listF, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (BeduinSelectorCardGroupModel.Option option : listF) {
                linkedHashMap.put(option.getId(), option.getComponents());
            }
            nVar2.b(new t(linkedHashMap, nVar2, new d(1, aVar, com.avito.android.beduin.common.component.selector_card_group.a.class, "createChildComponent", "createChildComponent(Lcom/avito/android/beduin_models/BeduinModel;)Lcom/avito/android/beduin_shared/model/component/BeduinComponent;", 0)));
        } else if (iOrdinal == 1) {
            nVar2.setSelectedIds(aVar.f102537j);
        }
        return G0.f406611a;
    }
}
