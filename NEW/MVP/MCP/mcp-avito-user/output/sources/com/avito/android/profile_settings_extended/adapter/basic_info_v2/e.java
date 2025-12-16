package com.avito.android.profile_settings_extended.adapter.basic_info_v2;

import Y41.l;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2ItemView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import yc0.InterfaceC50220d;
import yc0.k;

/* compiled from: BasicInfoV2ItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2ItemView$ClickType;", "clickType", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2ItemView$ClickType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<BasicInfoV2ItemView.ClickType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BasicInfoV2Item f229257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f229258m;

    /* compiled from: BasicInfoV2ItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BasicInfoV2ItemView.ClickType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BasicInfoV2ItemView.ClickType clickType = BasicInfoV2ItemView.ClickType.f229243b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BasicInfoV2ItemView.ClickType clickType2 = BasicInfoV2ItemView.ClickType.f229243b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BasicInfoV2ItemView.ClickType clickType3 = BasicInfoV2ItemView.ClickType.f229243b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BasicInfoV2ItemView.ClickType clickType4 = BasicInfoV2ItemView.ClickType.f229243b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BasicInfoV2ItemView.ClickType clickType5 = BasicInfoV2ItemView.ClickType.f229243b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BasicInfoV2Item basicInfoV2Item, f fVar) {
        super(1);
        this.f229257l = basicInfoV2Item;
        this.f229258m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(BasicInfoV2ItemView.ClickType clickType) {
        k aVar;
        int iOrdinal = clickType.ordinal();
        BasicInfoV2Item basicInfoV2Item = this.f229257l;
        if (iOrdinal == 0) {
            aVar = new InterfaceC50220d.a(basicInfoV2Item);
        } else if (iOrdinal == 1) {
            aVar = new InterfaceC50220d.k(basicInfoV2Item);
        } else if (iOrdinal == 2) {
            aVar = new InterfaceC50220d.j(basicInfoV2Item);
        } else if (iOrdinal == 3) {
            BasicInfoV2Item.Verification verification = basicInfoV2Item.f229215k;
            aVar = verification != null ? new InterfaceC50220d.l(verification) : null;
        } else if (iOrdinal == 4) {
            aVar = new InterfaceC50220d.C12910d(basicInfoV2Item);
        } else {
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new InterfaceC50220d.c(basicInfoV2Item);
        }
        if (aVar != null) {
            this.f229258m.f229259b.invoke(aVar);
        }
        return G0.f406611a;
    }
}
