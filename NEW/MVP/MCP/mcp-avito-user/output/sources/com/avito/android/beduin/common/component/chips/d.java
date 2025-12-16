package com.avito.android.beduin.common.component.chips;

import Y41.l;
import com.avito.android.beduin.common.component.chips.BeduinChipsModel;
import com.avito.android.beduin.common.component.chips.a;
import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinChipsComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/ChipsChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/chips/ChipsChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<ChipsChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Chips f101035l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.chips.a f101036m;

    /* compiled from: BeduinChipsComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ChipsChange.values().length];
            try {
                iArr[ChipsChange.f101013c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChipsChange.f101014d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChipsChange.f101015e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.beduin.common.component.chips.a aVar, Chips chips) {
        super(1);
        this.f101035l = chips;
        this.f101036m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ChipsChange chipsChange) {
        int iOrdinal = chipsChange.ordinal();
        com.avito.android.beduin.common.component.chips.a aVar = this.f101036m;
        Chips chips = this.f101035l;
        if (iOrdinal == 0) {
            chips.setEnabled(aVar.f101023f.isEnabled());
            List<BeduinChipsModel.Option> options = aVar.f101023f.getOptions();
            ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(new a.C3031a((BeduinChipsModel.Option) it.next()));
            }
            chips.setData(arrayList);
        } else if (iOrdinal == 1) {
            aVar.v(chips, aVar.f101023f.e());
        } else if (iOrdinal == 2) {
            chips.setError(aVar.f101023f.getErrorMessageToDisplay());
        }
        return G0.f406611a;
    }
}
