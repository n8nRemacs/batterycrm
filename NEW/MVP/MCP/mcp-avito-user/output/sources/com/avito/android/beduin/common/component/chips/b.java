package com.avito.android.beduin.common.component.chips;

import Y61.k;
import com.avito.android.beduin.common.component.chips.BeduinChipsModel;
import com.avito.android.lib.design.chips.Chips;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BeduinChipsComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/b;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.chips.a f101031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Chips f101032b;

    /* compiled from: BeduinChipsComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101033a;

        static {
            int[] iArr = new int[BeduinChipsModel.SelectionType.values().length];
            try {
                iArr[BeduinChipsModel.SelectionType.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinChipsModel.SelectionType.Multiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinChipsModel.SelectionType.SingleOptional.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101033a = iArr;
        }
    }

    public b(com.avito.android.beduin.common.component.chips.a aVar, Chips chips) {
        this.f101031a = aVar;
        this.f101032b = chips;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        com.avito.android.beduin.common.component.chips.a aVar = this.f101031a;
        int i12 = a.f101033a[aVar.f101023f.f().ordinal()];
        boolean z12 = true;
        if (i12 == 1) {
            z12 = false;
        } else if (i12 != 2 && i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.beduin.common.component.chips.a.u(aVar, hVar, this.f101032b, z12);
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k com.avito.android.lib.design.chips.h hVar) {
        com.avito.android.beduin.common.component.chips.a.u(this.f101031a, hVar, this.f101032b, true);
    }
}
