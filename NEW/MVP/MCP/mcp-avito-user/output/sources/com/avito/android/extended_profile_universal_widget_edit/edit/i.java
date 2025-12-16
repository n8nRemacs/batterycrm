package com.avito.android.extended_profile_universal_widget_edit.edit;

import Y41.p;
import com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditFragment;
import iB.InterfaceC41263a;
import jB.InterfaceC42227a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalWidgetEditView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "segmentPosition", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements p<Integer, CharSequence, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f153855l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41263a.d<?> f153856m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, InterfaceC41263a.d<?> dVar) {
        super(2);
        this.f153855l = gVar;
        this.f153856m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, CharSequence charSequence) {
        int iIntValue = num.intValue();
        ((UniversalWidgetEditFragment.e) this.f153855l.f153832e).invoke(new InterfaceC42227a.n(new InterfaceC41263a.d(this.f153856m.f398428a, iIntValue)));
        return G0.f406611a;
    }
}
