package com.avito.android.inline_filters.dialog.calendar.view;

import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: FiltersCalendarPickerView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "enable", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f171350l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar) {
        super(1);
        this.f171350l = wVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zF2 = L.f(bool, Boolean.TRUE);
        w wVar = this.f171350l;
        if (zF2) {
            D6.G(wVar.f171366i, true);
            String str = wVar.f171362e;
            if (str == null) {
                str = wVar.f171371n;
            }
            wVar.f171367j.setText(str);
        } else {
            D6.w(wVar.f171366i);
            String str2 = wVar.f171362e;
            if (str2 == null) {
                str2 = wVar.f171372o;
            }
            wVar.f171367j.setText(str2);
        }
        return G0.f406611a;
    }
}
