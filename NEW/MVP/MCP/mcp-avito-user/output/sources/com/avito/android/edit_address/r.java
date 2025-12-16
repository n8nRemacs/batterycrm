package com.avito.android.edit_address;

import com.avito.android.edit_address.EditAddressMviFragment;
import com.avito.android.edit_address.dialog.time_interval.TimeIntervalPicker;
import com.avito.android.edit_address.entity.TimeInterval;
import jy.InterfaceC42448f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditAddressMviView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/edit_address/entity/TimeInterval;", "interval", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/edit_address/entity/TimeInterval;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r extends N implements Y41.l<TimeInterval, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TimeIntervalPicker.Mode f146003l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f146004m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f146005n;

    /* compiled from: EditAddressMviView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TimeIntervalPicker.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeIntervalPicker.Mode mode = TimeIntervalPicker.Mode.f145857b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TimeIntervalPicker.Mode mode, o oVar, String str) {
        super(1);
        this.f146003l = mode;
        this.f146004m = oVar;
        this.f146005n = str;
    }

    @Override // Y41.l
    public final G0 invoke(TimeInterval timeInterval) {
        TimeInterval timeInterval2 = timeInterval;
        int iOrdinal = this.f146003l.ordinal();
        String str = this.f146005n;
        o oVar = this.f146004m;
        if (iOrdinal == 0) {
            ((EditAddressMviFragment.b) oVar.f145980f).invoke(new InterfaceC42448f.d(timeInterval2, str));
        } else if (iOrdinal == 1) {
            ((EditAddressMviFragment.b) oVar.f145980f).invoke(new InterfaceC42448f.a(timeInterval2, str));
        }
        return G0.f406611a;
    }
}
