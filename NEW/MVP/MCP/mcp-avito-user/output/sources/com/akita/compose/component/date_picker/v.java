package com.akita.compose.component.date_picker;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: DatePickerBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class v extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f61424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f61425m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f61426n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(T t12, F f12, com.akita.compose.component.toast_bar.u uVar) {
        super(1);
        this.f61424l = t12;
        this.f61425m = f12;
        this.f61426n = uVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            C43259k.d(this.f61424l, null, null, new u(this.f61425m, this.f61426n, str2, null), 3);
        }
        return G0.f406611a;
    }
}
